package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class WindowInsetsAnimationCompat
{
  public WindowInsetsAnimationCompat.Impl OooO00o;
  
  public WindowInsetsAnimationCompat(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    Object localObject;
    if (i >= j)
    {
      localObject = new androidx/core/view/WindowInsetsAnimationCompat$Impl30;
      ((WindowInsetsAnimationCompat.Impl30)localObject).<init>(paramInt, paramInterpolator, paramLong);
    }
    for (;;)
    {
      this.OooO00o = ((WindowInsetsAnimationCompat.Impl)localObject);
      break;
      localObject = new androidx/core/view/WindowInsetsAnimationCompat$Impl21;
      ((WindowInsetsAnimationCompat.Impl21)localObject).<init>(paramInt, paramInterpolator, paramLong);
    }
  }
  
  public WindowInsetsAnimationCompat(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    this(0, null, l);
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      localImpl30 = new androidx/core/view/WindowInsetsAnimationCompat$Impl30;
      localImpl30.<init>(paramWindowInsetsAnimation);
      this.OooO00o = localImpl30;
    }
  }
  
  public static void OooO00o(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      WindowInsetsAnimationCompat.Impl30.OooO0Oo(paramView, paramCallback);
    } else {
      WindowInsetsAnimationCompat.Impl21.OooOO0O(paramView, paramCallback);
    }
  }
  
  public static WindowInsetsAnimationCompat OooO0O0(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = new androidx/core/view/WindowInsetsAnimationCompat;
    localWindowInsetsAnimationCompat.<init>(paramWindowInsetsAnimation);
    return localWindowInsetsAnimationCompat;
  }
  
  public float getAlpha()
  {
    return this.OooO00o.getAlpha();
  }
  
  public long getDurationMillis()
  {
    return this.OooO00o.getDurationMillis();
  }
  
  public float getFraction()
  {
    return this.OooO00o.getFraction();
  }
  
  public float getInterpolatedFraction()
  {
    return this.OooO00o.getInterpolatedFraction();
  }
  
  public Interpolator getInterpolator()
  {
    return this.OooO00o.getInterpolator();
  }
  
  public int getTypeMask()
  {
    return this.OooO00o.getTypeMask();
  }
  
  public void setAlpha(float paramFloat)
  {
    this.OooO00o.setAlpha(paramFloat);
  }
  
  public void setFraction(float paramFloat)
  {
    this.OooO00o.setFraction(paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat
 * JD-Core Version:    0.7.0.1
 */