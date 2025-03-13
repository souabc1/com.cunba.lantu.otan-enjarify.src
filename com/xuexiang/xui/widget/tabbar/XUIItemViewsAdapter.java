package com.xuexiang.xui.widget.tabbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools.Pool;
import java.util.List;
import m54207b69;

public abstract class XUIItemViewsAdapter
{
  public Pools.Pool OooO00o;
  public List OooO0O0;
  public List OooO0OO;
  public ViewGroup OooO0Oo;
  
  private View getView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (View)m54207b69.F54207b69_09(5979, arrayOfObject);
  }
  
  public XUIItemViewsAdapter OooO00o(Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObject;
    return (XUIItemViewsAdapter)m54207b69.F54207b69_09(5973, arrayOfObject);
  }
  
  public abstract void OooO0O0(Object paramObject, View paramView, int paramInt);
  
  public void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5974, arrayOfObject);
  }
  
  public abstract View OooO0Oo(ViewGroup paramViewGroup);
  
  public void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5975, arrayOfObject);
  }
  
  public void OooO0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5976, arrayOfObject);
  }
  
  public Object getItem(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_09(5977, arrayOfObject);
  }
  
  public int getSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5978, arrayOfObject);
  }
  
  public List getViews()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(5980, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.XUIItemViewsAdapter
 * JD-Core Version:    0.7.0.1
 */