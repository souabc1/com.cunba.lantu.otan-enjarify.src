package com.xuexiang.xui.widget.grouplist;

import android.util.SparseArray;
import android.widget.LinearLayout;
import m54207b69;

public class XUIGroupListView
  extends LinearLayout
{
  public int o00OoOoo;
  public SparseArray o00Ooo00;
  
  public XUIGroupListView.Section getSection(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (XUIGroupListView.Section)m54207b69.F54207b69_09(3615, arrayOfObject);
  }
  
  public int getSectionCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3616, arrayOfObject);
  }
  
  public int getSeparatorStyle()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3617, arrayOfObject);
  }
  
  public void setSeparatorStyle(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3618, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.grouplist.XUIGroupListView
 * JD-Core Version:    0.7.0.1
 */