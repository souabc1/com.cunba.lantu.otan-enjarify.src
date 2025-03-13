package com.xuexiang.xui.widget.layout.interpolator;

import android.view.animation.Interpolator;
import m54207b69;

abstract class LookupTableInterpolator
  implements Interpolator
{
  public final float[] OooO00o;
  public final float OooO0O0;
  
  public LookupTableInterpolator(float[] paramArrayOfFloat)
  {
    this.OooO00o = paramArrayOfFloat;
    float f1 = paramArrayOfFloat.length + -1;
    float f2 = 1.0F / f1;
    this.OooO0O0 = f2;
  }
  
  public float getInterpolation(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return m54207b69.F54207b69_07(4497, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.layout.interpolator.LookupTableInterpolator
 * JD-Core Version:    0.7.0.1
 */