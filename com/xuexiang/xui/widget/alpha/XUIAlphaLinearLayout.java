package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import m54207b69;

public class XUIAlphaLinearLayout
  extends LinearLayout
{
  public IAlphaViewHelper o00OoOoo;
  
  public XUIAlphaLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public XUIAlphaLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private IAlphaViewHelper getAlphaViewHelper()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (IAlphaViewHelper)m54207b69.F54207b69_09(2302, arrayOfObject);
  }
  
  public void setChangeAlphaWhenDisable(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2303, arrayOfObject);
  }
  
  public void setChangeAlphaWhenPress(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2304, arrayOfObject);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2305, arrayOfObject);
  }
  
  public void setPressed(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2306, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout
 * JD-Core Version:    0.7.0.1
 */