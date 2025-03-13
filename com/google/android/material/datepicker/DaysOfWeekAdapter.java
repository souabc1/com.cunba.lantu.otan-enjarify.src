package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import java.util.Calendar;
import java.util.Locale;

class DaysOfWeekAdapter
  extends BaseAdapter
{
  private static final int CALENDAR_DAY_STYLE = 4;
  private static final int NARROW_FORMAT = 4;
  private final Calendar calendar;
  private final int daysInWeek;
  private final int firstDayOfWeek;
  
  public DaysOfWeekAdapter()
  {
    Calendar localCalendar = UtcDates.getUtcCalendar();
    this.calendar = localCalendar;
    int i = localCalendar.getMaximum(7);
    this.daysInWeek = i;
    int j = localCalendar.getFirstDayOfWeek();
    this.firstDayOfWeek = j;
  }
  
  public DaysOfWeekAdapter(int paramInt)
  {
    Calendar localCalendar = UtcDates.getUtcCalendar();
    this.calendar = localCalendar;
    int i = localCalendar.getMaximum(7);
    this.daysInWeek = i;
    this.firstDayOfWeek = paramInt;
  }
  
  private int positionToDayOfWeek(int paramInt)
  {
    int i = this.firstDayOfWeek;
    paramInt += i;
    i = this.daysInWeek;
    if (paramInt > i) {
      paramInt -= i;
    }
    return paramInt;
  }
  
  public int getCount()
  {
    return this.daysInWeek;
  }
  
  public Integer getItem(int paramInt)
  {
    int i = this.daysInWeek;
    if (paramInt >= i) {
      return null;
    }
    return Integer.valueOf(positionToDayOfWeek(paramInt));
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = paramView;
    localObject1 = (TextView)paramView;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext());
      int i = R.layout.mtrl_calendar_day_of_week;
      j = 0;
      paramView = paramView.inflate(i, paramViewGroup, false);
      localObject1 = paramView;
      localObject1 = (TextView)paramView;
    }
    paramView = this.calendar;
    paramInt = positionToDayOfWeek(paramInt);
    int j = 7;
    paramView.set(j, paramInt);
    Object localObject2 = ((View)localObject1).getResources().getConfiguration().locale;
    paramView = this.calendar;
    int k = CALENDAR_DAY_STYLE;
    localObject2 = paramView.getDisplayName(j, k, (Locale)localObject2);
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject2 = paramViewGroup.getContext();
    int m = R.string.mtrl_picker_day_of_week_column_header;
    localObject2 = ((Context)localObject2).getString(m);
    paramView = this.calendar;
    Locale localLocale = Locale.getDefault();
    paramView = paramView.getDisplayName(j, 2, localLocale);
    paramView = new Object[] { paramView };
    localObject2 = String.format((String)localObject2, paramView);
    ((View)localObject1).setContentDescription((CharSequence)localObject2);
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DaysOfWeekAdapter
 * JD-Core Version:    0.7.0.1
 */