package com.xuexiang.xui.widget.popupwindow.popup;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import m54207b69;

class XUISimpleExpandablePopup$1
  implements ExpandableListView.OnChildClickListener
{
  public boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramExpandableListView;
    arrayOfObject[2] = paramView;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(paramLong);
    arrayOfObject[5] = localObject;
    return m54207b69.F54207b69_01(5130, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.popup.XUISimpleExpandablePopup.1
 * JD-Core Version:    0.7.0.1
 */