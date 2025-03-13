package com.xuexiang.xui.widget.dialog.strategy;

import m54207b69;

public class InputInfo
{
  public int OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public boolean OooO0Oo;
  
  public InputInfo(int paramInt, String paramString)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramString;
    this.OooO0OO = "";
    this.OooO0Oo = false;
  }
  
  public String getHint()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(3249, arrayOfObject);
  }
  
  public int getInputType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3250, arrayOfObject);
  }
  
  public String getPreFill()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(3251, arrayOfObject);
  }
  
  public boolean isAllowEmptyInput()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3252, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(3253, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.strategy.InputInfo
 * JD-Core Version:    0.7.0.1
 */