package com.xuexiang.xui.widget;

import android.widget.ExpandableListView;
import m54207b69;

public class XUIWrapContentExpandableListView
  extends ExpandableListView
{
  public int o00OoOoo;
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2240, arrayOfObject);
  }
  
  public void setMaxHeight(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2241, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.XUIWrapContentExpandableListView
 * JD-Core Version:    0.7.0.1
 */