package com.xuexiang.xui.adapter.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import java.util.Collection;
import java.util.List;
import m54207b69;

public abstract class XListAdapter
  extends BaseAdapter
{
  public final List o00OoOoo;
  public int o00Ooo0;
  public Context o00Ooo00;
  
  public final boolean OooO00o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_01(1890, arrayOfObject);
  }
  
  public int getColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(1891, arrayOfObject);
  }
  
  public Context getContext()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Context)m54207b69.F54207b69_09(1892, arrayOfObject);
  }
  
  public int getCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1893, arrayOfObject);
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Drawable)m54207b69.F54207b69_09(1894, arrayOfObject);
  }
  
  public Object getItem(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_09(1895, arrayOfObject);
  }
  
  public long getItemId(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_06(1896, arrayOfObject);
  }
  
  public List getItems()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(1897, arrayOfObject);
  }
  
  public Object getSelectItem()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_09(1898, arrayOfObject);
  }
  
  public int getSelectPosition()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1899, arrayOfObject);
  }
  
  public int getSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1900, arrayOfObject);
  }
  
  public String getString(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(1901, arrayOfObject);
  }
  
  public void setData(Collection paramCollection)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCollection;
    m54207b69.F54207b69_00(1902, arrayOfObject);
  }
  
  public void setData(Object[] paramArrayOfObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfObject;
    m54207b69.F54207b69_00(1903, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.adapter.listview.XListAdapter
 * JD-Core Version:    0.7.0.1
 */