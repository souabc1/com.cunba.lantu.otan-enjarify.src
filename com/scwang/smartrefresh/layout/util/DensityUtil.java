package com.scwang.smartrefresh.layout.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class DensityUtil
{
  public float OooO00o;
  
  public DensityUtil()
  {
    float f = Resources.getSystem().getDisplayMetrics().density;
    this.OooO00o = f;
  }
  
  public static int OooO0O0(float paramFloat)
  {
    float f = Resources.getSystem().getDisplayMetrics().density;
    return (int)(paramFloat * f + 0.5F);
  }
  
  public static float OooO0OO(int paramInt)
  {
    float f1 = paramInt;
    float f2 = Resources.getSystem().getDisplayMetrics().density;
    return f1 / f2;
  }
  
  public int OooO00o(float paramFloat)
  {
    float f = this.OooO00o;
    return (int)(paramFloat * f + 0.5F);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.DensityUtil
 * JD-Core Version:    0.7.0.1
 */