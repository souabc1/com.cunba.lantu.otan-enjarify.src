package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingInterpolator;

public class ShineAnimator
  extends ValueAnimator
{
  public ShineAnimator()
  {
    Object localObject = new float[2];
    Object tmp9_8 = localObject;
    tmp9_8[0] = 1.0F;
    tmp9_8[1] = 1.5F;
    setFloatValues((float[])localObject);
    setDuration(1500L);
    setStartDelay(200L);
    localObject = new com/xuexiang/xui/widget/button/shinebutton/interpolator/EasingInterpolator;
    Ease localEase = Ease.o00OooOo;
    ((EasingInterpolator)localObject).<init>(localEase);
    setInterpolator((TimeInterpolator)localObject);
  }
  
  public ShineAnimator(long paramLong1, float paramFloat, long paramLong2)
  {
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = 1.0F;
    arrayOfFloat[1] = paramFloat;
    setFloatValues(arrayOfFloat);
    setDuration(paramLong1);
    setStartDelay(paramLong2);
    EasingInterpolator localEasingInterpolator = new com/xuexiang/xui/widget/button/shinebutton/interpolator/EasingInterpolator;
    Ease localEase = Ease.o00OooOo;
    localEasingInterpolator.<init>(localEase);
    setInterpolator(localEasingInterpolator);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.shinebutton.ShineAnimator
 * JD-Core Version:    0.7.0.1
 */