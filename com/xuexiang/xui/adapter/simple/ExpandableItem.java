package com.xuexiang.xui.adapter.simple;

import java.util.List;
import m54207b69;

public class ExpandableItem
{
  public AdapterItem OooO00o;
  public List OooO0O0;
  
  public List getChild()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(1975, arrayOfObject);
  }
  
  public AdapterItem getChildItem(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (AdapterItem)m54207b69.F54207b69_09(1976, arrayOfObject);
  }
  
  public int getChildSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1977, arrayOfObject);
  }
  
  public AdapterItem getGroup()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (AdapterItem)m54207b69.F54207b69_09(1978, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.adapter.simple.ExpandableItem
 * JD-Core Version:    0.7.0.1
 */