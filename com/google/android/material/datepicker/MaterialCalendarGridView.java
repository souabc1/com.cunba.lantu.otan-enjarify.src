package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import m54207b69;

final class MaterialCalendarGridView
  extends GridView
{
  private final Calendar dayCompute;
  private final boolean nestedScrollable;
  
  public MaterialCalendarGridView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MaterialCalendarGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MaterialCalendarGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = UtcDates.getUtcCalendar();
    this.dayCompute = paramContext;
    paramContext = getContext();
    boolean bool1 = MaterialDatePicker.isFullscreen(paramContext);
    if (bool1)
    {
      int i = R.id.cancel_button;
      setNextFocusLeftId(i);
      i = R.id.confirm_button;
      setNextFocusRightId(i);
    }
    boolean bool2 = MaterialDatePicker.isNestedScrollable(getContext());
    this.nestedScrollable = bool2;
    paramContext = new com/google/android/material/datepicker/MaterialCalendarGridView$1;
    paramContext.<init>(this);
    ViewCompat.o00oO0o(this, paramContext);
  }
  
  private void gainFocus(int paramInt, Rect paramRect)
  {
    int i = 33;
    MonthAdapter localMonthAdapter;
    if (paramInt == i) {
      localMonthAdapter = getAdapter();
    }
    for (paramInt = localMonthAdapter.lastPositionInMonth();; paramInt = localMonthAdapter.firstPositionInMonth())
    {
      setSelection(paramInt);
      return;
      i = 130;
      if (paramInt != i) {
        break;
      }
      localMonthAdapter = getAdapter();
    }
    i = 1;
    super.onFocusChanged(i, paramInt, paramRect);
  }
  
  private View getChildAtPosition(int paramInt)
  {
    int i = getFirstVisiblePosition();
    paramInt -= i;
    return getChildAt(paramInt);
  }
  
  private static int horizontalMidPoint(View paramView)
  {
    int i = paramView.getLeft();
    int j = paramView.getWidth() / 2;
    return i + j;
  }
  
  private static boolean skipMonth(Long paramLong1, Long paramLong2, Long paramLong3, Long paramLong4)
  {
    boolean bool1 = true;
    if ((paramLong1 != null) && (paramLong2 != null) && (paramLong3 != null) && (paramLong4 != null))
    {
      long l1 = paramLong3.longValue();
      long l2 = paramLong2.longValue();
      boolean bool2 = l1 < l2;
      if (!bool2)
      {
        l2 = paramLong4.longValue();
        l1 = paramLong1.longValue();
        boolean bool3 = l2 < l1;
        if (!bool3) {
          bool1 = false;
        }
      }
    }
    return bool1;
  }
  
  public MonthAdapter getAdapter()
  {
    return (MonthAdapter)super.getAdapter();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getAdapter().notifyDataSetChanged();
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    Object localObject1 = this;
    super.onDraw(paramCanvas);
    Object localObject2 = getAdapter();
    Object localObject3 = ((MonthAdapter)localObject2).dateSelector;
    CalendarStyle localCalendarStyle = ((MonthAdapter)localObject2).calendarStyle;
    int i = ((MonthAdapter)localObject2).firstPositionInMonth();
    int j = getFirstVisiblePosition();
    i = Math.max(i, j);
    j = ((MonthAdapter)localObject2).lastPositionInMonth();
    int k = getLastVisiblePosition();
    j = Math.min(j, k);
    Long localLong1 = ((MonthAdapter)localObject2).getItem(i);
    Long localLong2 = ((MonthAdapter)localObject2).getItem(j);
    localObject3 = ((DateSelector)localObject3).getSelectedRanges().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject4 = (Pair)((Iterator)localObject3).next();
      Object localObject5 = ((Pair)localObject4).OooO00o;
      if (localObject5 != null)
      {
        Object localObject6 = ((Pair)localObject4).OooO0O0;
        if (localObject6 != null)
        {
          localObject5 = (Long)localObject5;
          long l1 = ((Long)localObject5).longValue();
          long l2 = ((Long)((Pair)localObject4).OooO0O0).longValue();
          localObject4 = Long.valueOf(l1);
          Object localObject7 = Long.valueOf(l2);
          bool1 = skipMonth(localLong1, localLong2, (Long)localObject4, (Long)localObject7);
          if (!bool1)
          {
            bool1 = ViewUtils.isLayoutRtl(this);
            long l3 = localLong1.longValue();
            boolean bool2 = l1 < l3;
            int n = 5;
            int i1;
            int i2;
            if (bool2)
            {
              boolean bool3 = ((MonthAdapter)localObject2).isFirstInRow(i);
              if (bool3)
              {
                bool3 = false;
                localObject5 = null;
              }
              else
              {
                i1 = i + -1;
                localObject5 = ((MaterialCalendarGridView)localObject1).getChildAtPosition(i1);
                if (!bool1) {
                  i1 = ((View)localObject5).getRight();
                } else {
                  i1 = ((View)localObject5).getLeft();
                }
              }
              i2 = i1;
              i1 = i;
            }
            else
            {
              localObject7 = ((MaterialCalendarGridView)localObject1).dayCompute;
              ((Calendar)localObject7).setTimeInMillis(l1);
              localObject5 = ((MaterialCalendarGridView)localObject1).dayCompute;
              i1 = ((Calendar)localObject5).get(n);
              i1 = ((MonthAdapter)localObject2).dayToPosition(i1);
              localObject6 = ((MaterialCalendarGridView)localObject1).getChildAtPosition(i1);
              i2 = horizontalMidPoint((View)localObject6);
            }
            long l4 = localLong2.longValue();
            bool2 = l2 < l4;
            int i3;
            Object localObject8;
            int i4;
            if (bool2)
            {
              boolean bool4 = ((MonthAdapter)localObject2).isLastInRow(j);
              if (bool4)
              {
                i3 = getWidth();
              }
              else
              {
                localObject8 = ((MaterialCalendarGridView)localObject1).getChildAtPosition(j);
                if (!bool1) {
                  i3 = ((View)localObject8).getRight();
                } else {
                  i3 = ((View)localObject8).getLeft();
                }
              }
              i4 = i3;
              i3 = j;
            }
            else
            {
              localObject7 = ((MaterialCalendarGridView)localObject1).dayCompute;
              ((Calendar)localObject7).setTimeInMillis(l2);
              localObject8 = ((MaterialCalendarGridView)localObject1).dayCompute;
              i3 = ((Calendar)localObject8).get(n);
              i3 = ((MonthAdapter)localObject2).dayToPosition(i3);
              View localView = ((MaterialCalendarGridView)localObject1).getChildAtPosition(i3);
              i4 = horizontalMidPoint(localView);
            }
            l3 = ((MonthAdapter)localObject2).getItemId(i1);
            int m = (int)l3;
            n = i;
            int i5 = j;
            long l5 = ((MonthAdapter)localObject2).getItemId(i3);
            i = (int)l5;
            while (m <= i)
            {
              j = getNumColumns() * m;
              int i6 = getNumColumns();
              int i7 = j + i6 + -1;
              Object localObject9 = ((MaterialCalendarGridView)localObject1).getChildAtPosition(j);
              int i8 = ((View)localObject9).getTop();
              localObject1 = localCalendarStyle.day;
              int i9 = ((CalendarItemStyle)localObject1).getTopInset();
              i9 = i8 + i9;
              i6 = ((View)localObject9).getBottom();
              Object localObject10 = localObject2;
              localObject2 = localCalendarStyle.day;
              int i10 = ((CalendarItemStyle)localObject2).getBottomInset();
              i10 = i6 - i10;
              if (!bool1)
              {
                if (j > i1)
                {
                  j = 0;
                  f1 = 0.0F;
                }
                else
                {
                  j = i2;
                }
                if (i3 > i7) {
                  i7 = getWidth();
                } else {
                  i7 = i4;
                }
              }
              else
              {
                if (i3 > i7)
                {
                  i7 = 0;
                  f2 = 0.0F;
                }
                else
                {
                  i7 = i4;
                }
                if (j > i1) {
                  j = getWidth();
                } else {
                  j = i2;
                }
                int i11 = i7;
                i7 = j;
                j = i11;
              }
              float f1 = j;
              float f3 = i9;
              float f2 = i7;
              float f4 = i10;
              localObject9 = localObject3;
              localObject3 = localCalendarStyle.rangeFill;
              paramCanvas.drawRect(f1, f3, f2, f4, (Paint)localObject3);
              m += 1;
              localObject1 = this;
              localObject3 = localObject9;
              localObject2 = localObject10;
            }
            localObject1 = this;
            i = n;
            j = i5;
          }
        }
      }
      else
      {
        localObject1 = this;
      }
    }
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (paramBoolean)
    {
      gainFocus(paramInt, paramRect);
    }
    else
    {
      paramBoolean = false;
      super.onFocusChanged(false, paramInt, paramRect);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = super.onKeyDown(paramInt, paramKeyEvent);
    if (!bool1) {
      return false;
    }
    int i = getSelectedItemPosition();
    int j = -1;
    boolean bool2 = true;
    if (i != j)
    {
      i = getSelectedItemPosition();
      MonthAdapter localMonthAdapter = getAdapter();
      j = localMonthAdapter.firstPositionInMonth();
      if (i < j)
      {
        i = 19;
        if (i == paramInt)
        {
          paramInt = getAdapter().firstPositionInMonth();
          setSelection(paramInt);
          return bool2;
        }
        return false;
      }
    }
    return bool2;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = this.nestedScrollable;
    if (bool)
    {
      int i = -1 << -1;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(16777215, i);
      super.onMeasure(paramInt1, paramInt2);
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      paramInt2 = getMeasuredHeight();
      localLayoutParams.height = paramInt2;
    }
    else
    {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public final void setAdapter(ListAdapter paramListAdapter)
  {
    boolean bool = paramListAdapter instanceof MonthAdapter;
    if (bool)
    {
      super.setAdapter((ListAdapter)paramListAdapter);
      return;
    }
    paramListAdapter = new java/lang/IllegalArgumentException;
    Object localObject = MaterialCalendarGridView.class.getCanonicalName();
    String str = MonthAdapter.class.getCanonicalName();
    localObject = new Object[] { localObject, str };
    localObject = String.format(m54207b69.F54207b69_11(".y5C495F0D5D19121115621B231B29671F1D1B6B4B312D1F2434247325382A772C367A3A7C80708331"), (Object[])localObject);
    paramListAdapter.<init>((String)localObject);
    throw paramListAdapter;
  }
  
  public void setSelection(int paramInt)
  {
    MonthAdapter localMonthAdapter1 = getAdapter();
    int i = localMonthAdapter1.firstPositionInMonth();
    if (paramInt < i)
    {
      MonthAdapter localMonthAdapter2 = getAdapter();
      paramInt = localMonthAdapter2.firstPositionInMonth();
    }
    super.setSelection(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialCalendarGridView
 * JD-Core Version:    0.7.0.1
 */