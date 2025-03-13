package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.animation.Interpolator;

class WindowInsetsAnimationCompat$Impl30
  extends WindowInsetsAnimationCompat.Impl
{
  public final WindowInsetsAnimation OooO0o;
  
  public WindowInsetsAnimationCompat$Impl30(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    this(localWindowInsetsAnimation);
  }
  
  public WindowInsetsAnimationCompat$Impl30(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    super(0, null, 0L);
    this.OooO0o = paramWindowInsetsAnimation;
  }
  
  public static WindowInsetsAnimation.Bounds OooO00o(WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
  {
    o0ooOOo.OooO00o();
    android.graphics.Insets localInsets = paramBoundsCompat.getLowerBound().OooO0o0();
    paramBoundsCompat = paramBoundsCompat.getUpperBound().OooO0o0();
    return o00oO0o.OooO00o(localInsets, paramBoundsCompat);
  }
  
  public static androidx.core.graphics.Insets OooO0O0(WindowInsetsAnimation.Bounds paramBounds)
  {
    return androidx.core.graphics.Insets.OooO0Oo(o000000O.OooO00o(paramBounds));
  }
  
  public static androidx.core.graphics.Insets OooO0OO(WindowInsetsAnimation.Bounds paramBounds)
  {
    return androidx.core.graphics.Insets.OooO0Oo(o0Oo0oo.OooO00o(paramBounds));
  }
  
  public static void OooO0Oo(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    WindowInsetsAnimationCompat.Impl30.ProxyCallback localProxyCallback;
    if (paramCallback != null)
    {
      localProxyCallback = new androidx/core/view/WindowInsetsAnimationCompat$Impl30$ProxyCallback;
      localProxyCallback.<init>(paramCallback);
    }
    else
    {
      localProxyCallback = null;
    }
    oo0o0Oo.OooO00o(paramView, localProxyCallback);
  }
  
  public long getDurationMillis()
  {
    return oo000o.OooO00o(this.OooO0o);
  }
  
  public float getFraction()
  {
    return o0OO00O.OooO00o(this.OooO0o);
  }
  
  public float getInterpolatedFraction()
  {
    return o0OOO0o.OooO00o(this.OooO0o);
  }
  
  public Interpolator getInterpolator()
  {
    return o000OOo.OooO00o(this.OooO0o);
  }
  
  public int getTypeMask()
  {
    return o0O0O00.OooO00o(this.OooO0o);
  }
  
  public void setFraction(float paramFloat)
  {
    o000000.OooO00o(this.OooO0o, paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl30
 * JD-Core Version:    0.7.0.1
 */