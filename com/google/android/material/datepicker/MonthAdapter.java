package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import com.google.android.material.R.layout;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

class MonthAdapter
  extends BaseAdapter
{
  private static final int MAXIMUM_GRID_CELLS = 0;
  static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
  private static final int NO_DAY_NUMBER = 255;
  final CalendarConstraints calendarConstraints;
  CalendarStyle calendarStyle;
  final DateSelector dateSelector;
  final DayViewDecorator dayViewDecorator;
  final Month month;
  private Collection previouslySelectedDates;
  
  static
  {
    int i = UtcDates.getUtcCalendar().getMaximum(5);
    int j = UtcDates.getUtcCalendar().getMaximum(7);
    MAXIMUM_GRID_CELLS = i + j + -1;
  }
  
  public MonthAdapter(Month paramMonth, DateSelector paramDateSelector, CalendarConstraints paramCalendarConstraints, DayViewDecorator paramDayViewDecorator)
  {
    this.month = paramMonth;
    this.dateSelector = paramDateSelector;
    this.calendarConstraints = paramCalendarConstraints;
    this.dayViewDecorator = paramDayViewDecorator;
    paramMonth = paramDateSelector.getSelectedDays();
    this.previouslySelectedDates = paramMonth;
  }
  
  private String getDayContentDescription(Context paramContext, long paramLong)
  {
    boolean bool1 = isToday(paramLong);
    boolean bool2 = isStartOfRange(paramLong);
    boolean bool3 = isEndOfRange(paramLong);
    return DateStrings.getDayContentDescription(paramContext, paramLong, bool1, bool2, bool3);
  }
  
  private void initializeStyles(Context paramContext)
  {
    CalendarStyle localCalendarStyle = this.calendarStyle;
    if (localCalendarStyle == null)
    {
      localCalendarStyle = new com/google/android/material/datepicker/CalendarStyle;
      localCalendarStyle.<init>(paramContext);
      this.calendarStyle = localCalendarStyle;
    }
  }
  
  private boolean isSelected(long paramLong)
  {
    Iterator localIterator = this.dateSelector.getSelectedDays().iterator();
    boolean bool;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Long localLong = (Long)localIterator.next();
      long l1 = localLong.longValue();
      long l2 = UtcDates.canonicalYearMonthDay(paramLong);
      l1 = UtcDates.canonicalYearMonthDay(l1);
      bool = l2 < l1;
    } while (bool);
    return true;
    return false;
  }
  
  private boolean isToday(long paramLong)
  {
    Calendar localCalendar = UtcDates.getTodayCalendar();
    long l = localCalendar.getTimeInMillis();
    boolean bool = l < paramLong;
    if (!bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void updateSelectedState(TextView paramTextView, long paramLong, int paramInt)
  {
    MonthAdapter localMonthAdapter = this;
    TextView localTextView = paramTextView;
    if (paramTextView == null) {
      return;
    }
    Object localObject1 = paramTextView.getContext();
    Object localObject2 = getDayContentDescription((Context)localObject1, paramLong);
    paramTextView.setContentDescription((CharSequence)localObject2);
    CalendarConstraints.DateValidator localDateValidator = this.calendarConstraints.getDateValidator();
    boolean bool1 = localDateValidator.isValid(paramLong);
    int i;
    if (bool1)
    {
      paramTextView.setEnabled(true);
      i = isSelected(paramLong);
      paramTextView.setSelected(i);
      if (i != 0) {
        localObject3 = this.calendarStyle.selectedDay;
      }
      for (;;)
      {
        localObject4 = localObject3;
        j = i;
        break;
        bool2 = isToday(paramLong);
        if (bool2) {
          localObject3 = this.calendarStyle.todayDay;
        } else {
          localObject3 = this.calendarStyle.day;
        }
      }
    }
    boolean bool2 = false;
    Object localObject3 = null;
    paramTextView.setEnabled(false);
    Object localObject5 = this.calendarStyle.invalidDay;
    int j = 0;
    Object localObject4 = localObject5;
    localObject3 = localMonthAdapter.dayViewDecorator;
    if (localObject3 != null)
    {
      int k = -1;
      if (paramInt != k)
      {
        localObject5 = localMonthAdapter.month;
        int m = ((Month)localObject5).year;
        int n = ((Month)localObject5).month;
        localObject5 = localObject1;
        i = m;
        int i1 = n;
        n = j;
        localObject3 = ((DayViewDecorator)localObject3).getBackgroundColor((Context)localObject1, m, i1, paramInt, bool1, j);
        ((CalendarItemStyle)localObject4).styleItem(localTextView, (ColorStateList)localObject3);
        localObject4 = localMonthAdapter.dayViewDecorator.getCompoundDrawableLeft((Context)localObject1, m, i1, paramInt, bool1, j);
        Drawable localDrawable1 = localMonthAdapter.dayViewDecorator.getCompoundDrawableTop((Context)localObject1, m, i1, paramInt, bool1, j);
        localObject3 = localMonthAdapter.dayViewDecorator;
        Drawable localDrawable2 = localDrawable1;
        localDrawable1 = ((DayViewDecorator)localObject3).getCompoundDrawableRight((Context)localObject1, m, i1, paramInt, bool1, j);
        localObject3 = localMonthAdapter.dayViewDecorator;
        Object localObject6 = localObject2;
        localObject2 = localDrawable1;
        localObject3 = ((DayViewDecorator)localObject3).getCompoundDrawableBottom((Context)localObject1, m, i1, paramInt, bool1, j);
        localTextView.setCompoundDrawables((Drawable)localObject4, localDrawable2, localDrawable1, (Drawable)localObject3);
        localObject3 = localMonthAdapter.dayViewDecorator;
        localObject1 = localObject6;
        localObject3 = ((DayViewDecorator)localObject3).getContentDescription((Context)localObject5, m, i1, paramInt, bool1, j, localObject6);
        localTextView.setContentDescription((CharSequence)localObject3);
        return;
      }
    }
    ((CalendarItemStyle)localObject4).styleItem(localTextView);
  }
  
  private void updateSelectedStateForDate(MaterialCalendarGridView paramMaterialCalendarGridView, long paramLong)
  {
    Month localMonth = Month.create(paramLong);
    Object localObject = this.month;
    boolean bool = localMonth.equals(localObject);
    if (bool)
    {
      localMonth = this.month;
      int i = localMonth.getDayOfMonth(paramLong);
      localObject = paramMaterialCalendarGridView.getAdapter();
      int j = ((MonthAdapter)localObject).dayToPosition(i);
      int k = paramMaterialCalendarGridView.getFirstVisiblePosition();
      j -= k;
      paramMaterialCalendarGridView = (TextView)paramMaterialCalendarGridView.getChildAt(j);
      updateSelectedState(paramMaterialCalendarGridView, paramLong, i);
    }
  }
  
  public int dayToPosition(int paramInt)
  {
    paramInt += -1;
    return firstPositionInMonth() + paramInt;
  }
  
  public int firstPositionInMonth()
  {
    Month localMonth = this.month;
    int i = this.calendarConstraints.getFirstDayOfWeek();
    return localMonth.daysFromStartOfWeekToFirstOfMonth(i);
  }
  
  public int getCount()
  {
    return MAXIMUM_GRID_CELLS;
  }
  
  public Long getItem(int paramInt)
  {
    int i = firstPositionInMonth();
    if (paramInt >= i)
    {
      i = lastPositionInMonth();
      if (paramInt <= i)
      {
        Month localMonth = this.month;
        paramInt = positionToDay(paramInt);
        return Long.valueOf(localMonth.getDay(paramInt));
      }
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    int i = this.month.daysInWeek;
    return paramInt / i;
  }
  
  public TextView getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = paramViewGroup.getContext();
    initializeStyles((Context)localObject1);
    localObject1 = paramView;
    localObject1 = (TextView)paramView;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext());
      int i = R.layout.mtrl_calendar_day;
      paramView = paramView.inflate(i, paramViewGroup, false);
      localObject1 = paramView;
      localObject1 = (TextView)paramView;
    }
    int j = firstPositionInMonth();
    j = paramInt - j;
    if (j >= 0)
    {
      paramViewGroup = this.month;
      int k = paramViewGroup.daysInMonth;
      if (j < k)
      {
        k = 1;
        j += k;
        ((View)localObject1).setTag(paramViewGroup);
        paramViewGroup = ((View)localObject1).getResources().getConfiguration().locale;
        Object localObject2 = Integer.valueOf(j);
        localObject2 = new Object[] { localObject2 };
        String str = "%d";
        paramViewGroup = String.format(paramViewGroup, str, (Object[])localObject2);
        ((TextView)localObject1).setText(paramViewGroup);
        ((View)localObject1).setVisibility(0);
        ((TextView)localObject1).setEnabled(k);
        break label192;
      }
    }
    ((View)localObject1).setVisibility(8);
    ((TextView)localObject1).setEnabled(false);
    j = -1;
    label192:
    Long localLong = getItem(paramInt);
    if (localLong == null) {
      return localObject1;
    }
    long l = localLong.longValue();
    updateSelectedState((TextView)localObject1, l, j);
    return localObject1;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  public boolean isEndOfRange(long paramLong)
  {
    Iterator localIterator = this.dateSelector.getSelectedRanges().iterator();
    boolean bool;
    do
    {
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = ((Pair)localIterator.next()).OooO0O0;
      } while (localObject == null);
      Object localObject = (Long)localObject;
      long l = ((Long)localObject).longValue();
      bool = l < paramLong;
    } while (bool);
    return true;
    return false;
  }
  
  public boolean isFirstInRow(int paramInt)
  {
    Month localMonth = this.month;
    int i = localMonth.daysInWeek;
    paramInt %= i;
    if (paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public boolean isLastInRow(int paramInt)
  {
    int i = 1;
    paramInt += i;
    Month localMonth = this.month;
    int j = localMonth.daysInWeek;
    paramInt %= j;
    if (paramInt != 0) {
      i = 0;
    }
    return i;
  }
  
  public boolean isStartOfRange(long paramLong)
  {
    Iterator localIterator = this.dateSelector.getSelectedRanges().iterator();
    boolean bool;
    do
    {
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = ((Pair)localIterator.next()).OooO00o;
      } while (localObject == null);
      Object localObject = (Long)localObject;
      long l = ((Long)localObject).longValue();
      bool = l < paramLong;
    } while (bool);
    return true;
    return false;
  }
  
  public int lastPositionInMonth()
  {
    int i = firstPositionInMonth();
    int j = this.month.daysInMonth;
    return i + j + -1;
  }
  
  public int positionToDay(int paramInt)
  {
    int i = firstPositionInMonth();
    return paramInt - i + 1;
  }
  
  public void updateSelectedStates(MaterialCalendarGridView paramMaterialCalendarGridView)
  {
    Object localObject = this.previouslySelectedDates.iterator();
    boolean bool;
    Long localLong;
    long l;
    for (;;)
    {
      bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      localLong = (Long)((Iterator)localObject).next();
      l = localLong.longValue();
      updateSelectedStateForDate(paramMaterialCalendarGridView, l);
    }
    localObject = this.dateSelector;
    if (localObject != null)
    {
      localObject = ((DateSelector)localObject).getSelectedDays().iterator();
      for (;;)
      {
        bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        localLong = (Long)((Iterator)localObject).next();
        l = localLong.longValue();
        updateSelectedStateForDate(paramMaterialCalendarGridView, l);
      }
      paramMaterialCalendarGridView = this.dateSelector.getSelectedDays();
      this.previouslySelectedDates = paramMaterialCalendarGridView;
    }
  }
  
  public boolean withinMonth(int paramInt)
  {
    int i = firstPositionInMonth();
    if (paramInt >= i)
    {
      i = lastPositionInMonth();
      if (paramInt <= i) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MonthAdapter
 * JD-Core Version:    0.7.0.1
 */