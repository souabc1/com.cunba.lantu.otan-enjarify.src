package com.xuexiang.xui.widget.statelayout;

import android.view.View.OnClickListener;
import java.io.Serializable;
import m54207b69;

public class CustomStateOptions
  implements Serializable
{
  public int o00OoOoo;
  public String o00Ooo0;
  public boolean o00Ooo00;
  public String o00Ooo0O;
  public View.OnClickListener o00Ooo0o;
  
  public String getButtonText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(5674, arrayOfObject);
  }
  
  public View.OnClickListener getClickListener()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (View.OnClickListener)m54207b69.F54207b69_09(5675, arrayOfObject);
  }
  
  public int getImageRes()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5676, arrayOfObject);
  }
  
  public String getMessage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(5677, arrayOfObject);
  }
  
  public boolean isLoading()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5678, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.statelayout.CustomStateOptions
 * JD-Core Version:    0.7.0.1
 */