package com.xuexiang.xui.widget.imageview.strategy;

import android.graphics.drawable.Drawable;
import m54207b69;

public class LoadOption
{
  public DiskCacheStrategyEnum OooO00o;
  public Drawable OooO0O0;
  public Drawable OooO0OO;
  public int OooO0Oo;
  public AlignEnum OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  
  public LoadOption()
  {
    AlignEnum localAlignEnum = AlignEnum.o00OoOoo;
    this.OooO0o = localAlignEnum;
    this.OooO0oO = 2500;
  }
  
  public LoadOption(Drawable paramDrawable)
  {
    AlignEnum localAlignEnum = AlignEnum.o00OoOoo;
    this.OooO0o = localAlignEnum;
    this.OooO0oO = 2500;
    this.OooO0O0 = paramDrawable;
  }
  
  public static LoadOption OooO0O0(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDrawable;
    return (LoadOption)m54207b69.F54207b69_09(4315, arrayOfObject);
  }
  
  public boolean OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(4314, arrayOfObject);
  }
  
  public LoadOption OooO0OO(DiskCacheStrategyEnum paramDiskCacheStrategyEnum)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDiskCacheStrategyEnum;
    return (LoadOption)m54207b69.F54207b69_09(4316, arrayOfObject);
  }
  
  public LoadOption OooO0Oo(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return (LoadOption)m54207b69.F54207b69_09(4317, arrayOfObject);
  }
  
  public AlignEnum getAlign()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (AlignEnum)m54207b69.F54207b69_09(4318, arrayOfObject);
  }
  
  public DiskCacheStrategyEnum getCacheStrategy()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (DiskCacheStrategyEnum)m54207b69.F54207b69_09(4319, arrayOfObject);
  }
  
  public Drawable getError()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(4320, arrayOfObject);
  }
  
  public int getHeight()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4321, arrayOfObject);
  }
  
  public Drawable getPlaceholder()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(4322, arrayOfObject);
  }
  
  public int getTimeoutMs()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4323, arrayOfObject);
  }
  
  public int getWidth()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(4324, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(4325, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.strategy.LoadOption
 * JD-Core Version:    0.7.0.1
 */