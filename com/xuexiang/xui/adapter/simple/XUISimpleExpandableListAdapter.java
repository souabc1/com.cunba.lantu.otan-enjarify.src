package com.xuexiang.xui.adapter.simple;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import java.util.List;
import m54207b69;

public class XUISimpleExpandableListAdapter
  extends BaseExpandableListAdapter
{
  public List OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  
  public AdapterItem OooO00o(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return (AdapterItem)m54207b69.F54207b69_09(1984, arrayOfObject);
  }
  
  public long getChildId(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_06(1986, arrayOfObject);
  }
  
  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localObject;
    arrayOfObject[4] = paramView;
    arrayOfObject[5] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(1987, arrayOfObject);
  }
  
  public int getChildrenCount(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(1988, arrayOfObject);
  }
  
  public ExpandableItem getGroup(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ExpandableItem)m54207b69.F54207b69_09(1989, arrayOfObject);
  }
  
  public int getGroupCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1991, arrayOfObject);
  }
  
  public long getGroupId(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_06(1992, arrayOfObject);
  }
  
  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localObject;
    arrayOfObject[3] = paramView;
    arrayOfObject[4] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(1993, arrayOfObject);
  }
  
  public boolean hasStableIds()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1994, arrayOfObject);
  }
  
  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_01(1995, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.adapter.simple.XUISimpleExpandableListAdapter
 * JD-Core Version:    0.7.0.1
 */