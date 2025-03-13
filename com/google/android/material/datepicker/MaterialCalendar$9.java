package com.google.android.material.datepicker;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

class MaterialCalendar$9
  implements View.OnClickListener
{
  public MaterialCalendar$9(MaterialCalendar paramMaterialCalendar, MonthsPagerAdapter paramMonthsPagerAdapter) {}
  
  public void onClick(View paramView)
  {
    paramView = this.this$0.getLayoutManager();
    int i = paramView.findFirstVisibleItemPosition() + 1;
    Object localObject = MaterialCalendar.access$000(this.this$0).getAdapter();
    int j = ((RecyclerView.Adapter)localObject).getItemCount();
    if (i < j)
    {
      localObject = this.this$0;
      MonthsPagerAdapter localMonthsPagerAdapter = this.val$monthsPagerAdapter;
      paramView = localMonthsPagerAdapter.getPageMonth(i);
      ((MaterialCalendar)localObject).setCurrentMonth(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialCalendar.9
 * JD-Core Version:    0.7.0.1
 */