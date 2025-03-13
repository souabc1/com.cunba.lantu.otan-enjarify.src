package com.xuexiang.xui.utils;

import m54207b69;

public class ColorUtils$RandomColor
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  
  public ColorUtils$RandomColor(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > paramInt2)
    {
      setAlpha(paramInt1);
      setLower(paramInt2);
      setUpper(paramInt3);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("465B4447451A59591D62624B5E502318255357586658");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public int getAlpha()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2020, arrayOfObject);
  }
  
  public int getColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2021, arrayOfObject);
  }
  
  public int getLower()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2022, arrayOfObject);
  }
  
  public int getUpper()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2023, arrayOfObject);
  }
  
  public void setAlpha(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2024, arrayOfObject);
  }
  
  public void setLower(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2025, arrayOfObject);
  }
  
  public void setUpper(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2026, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.ColorUtils.RandomColor
 * JD-Core Version:    0.7.0.1
 */