package com.xuexiang.xui.widget.spinner.materialspinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import m54207b69;

class MaterialSpinner$1
  implements AdapterView.OnItemClickListener
{
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAdapterView;
    arrayOfObject[2] = paramView;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(paramLong);
    arrayOfObject[4] = localObject;
    m54207b69.F54207b69_00(5624, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner.1
 * JD-Core Version:    0.7.0.1
 */