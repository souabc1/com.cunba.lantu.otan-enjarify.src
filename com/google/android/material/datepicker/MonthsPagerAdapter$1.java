package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class MonthsPagerAdapter$1
  implements AdapterView.OnItemClickListener
{
  public MonthsPagerAdapter$1(MonthsPagerAdapter paramMonthsPagerAdapter, MaterialCalendarGridView paramMaterialCalendarGridView) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.val$monthGrid.getAdapter();
    boolean bool = paramAdapterView.withinMonth(paramInt);
    if (bool)
    {
      paramAdapterView = MonthsPagerAdapter.access$000(this.this$0);
      paramView = this.val$monthGrid.getAdapter().getItem(paramInt);
      long l = paramView.longValue();
      paramAdapterView.onDayClick(l);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MonthsPagerAdapter.1
 * JD-Core Version:    0.7.0.1
 */