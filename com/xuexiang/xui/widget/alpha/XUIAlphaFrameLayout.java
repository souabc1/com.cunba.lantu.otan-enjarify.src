package com.xuexiang.xui.widget.alpha;

import android.widget.FrameLayout;
import m54207b69;

public class XUIAlphaFrameLayout
  extends FrameLayout
{
  public IAlphaViewHelper o00OoOoo;
  
  private IAlphaViewHelper getAlphaViewHelper()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (IAlphaViewHelper)m54207b69.F54207b69_09(2287, arrayOfObject);
  }
  
  public void setChangeAlphaWhenDisable(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2288, arrayOfObject);
  }
  
  public void setChangeAlphaWhenPress(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2289, arrayOfObject);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2290, arrayOfObject);
  }
  
  public void setPressed(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2291, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.alpha.XUIAlphaFrameLayout
 * JD-Core Version:    0.7.0.1
 */