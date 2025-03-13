package com.google.android.material.datepicker;

import android.view.View;
import android.view.View.OnClickListener;

class YearGridAdapter$1
  implements View.OnClickListener
{
  public YearGridAdapter$1(YearGridAdapter paramYearGridAdapter, int paramInt) {}
  
  public void onClick(View paramView)
  {
    int i = this.val$year;
    int j = YearGridAdapter.access$000(this.this$0).getCurrentMonth().month;
    paramView = Month.create(i, j);
    paramView = YearGridAdapter.access$000(this.this$0).getCalendarConstraints().clamp(paramView);
    YearGridAdapter.access$000(this.this$0).setCurrentMonth(paramView);
    paramView = YearGridAdapter.access$000(this.this$0);
    MaterialCalendar.CalendarSelector localCalendarSelector = MaterialCalendar.CalendarSelector.DAY;
    paramView.setSelector(localCalendarSelector);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.YearGridAdapter.1
 * JD-Core Version:    0.7.0.1
 */