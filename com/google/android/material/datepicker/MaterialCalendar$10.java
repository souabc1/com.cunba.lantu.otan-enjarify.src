package com.google.android.material.datepicker;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.LinearLayoutManager;

class MaterialCalendar$10
  implements View.OnClickListener
{
  public MaterialCalendar$10(MaterialCalendar paramMaterialCalendar, MonthsPagerAdapter paramMonthsPagerAdapter) {}
  
  public void onClick(View paramView)
  {
    paramView = this.this$0.getLayoutManager();
    int i = paramView.findLastVisibleItemPosition() + -1;
    if (i >= 0)
    {
      MaterialCalendar localMaterialCalendar = this.this$0;
      MonthsPagerAdapter localMonthsPagerAdapter = this.val$monthsPagerAdapter;
      paramView = localMonthsPagerAdapter.getPageMonth(i);
      localMaterialCalendar.setCurrentMonth(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialCalendar.10
 * JD-Core Version:    0.7.0.1
 */