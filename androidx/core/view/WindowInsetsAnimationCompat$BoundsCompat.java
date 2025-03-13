package androidx.core.view;

import android.view.WindowInsetsAnimation.Bounds;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationCompat$BoundsCompat
{
  public final Insets OooO00o;
  public final Insets OooO0O0;
  
  public WindowInsetsAnimationCompat$BoundsCompat(WindowInsetsAnimation.Bounds paramBounds)
  {
    Insets localInsets = WindowInsetsAnimationCompat.Impl30.OooO0OO(paramBounds);
    this.OooO00o = localInsets;
    paramBounds = WindowInsetsAnimationCompat.Impl30.OooO0O0(paramBounds);
    this.OooO0O0 = paramBounds;
  }
  
  public WindowInsetsAnimationCompat$BoundsCompat(Insets paramInsets1, Insets paramInsets2)
  {
    this.OooO00o = paramInsets1;
    this.OooO0O0 = paramInsets2;
  }
  
  public static BoundsCompat OooO0O0(WindowInsetsAnimation.Bounds paramBounds)
  {
    BoundsCompat localBoundsCompat = new androidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    localBoundsCompat.<init>(paramBounds);
    return localBoundsCompat;
  }
  
  public WindowInsetsAnimation.Bounds OooO00o()
  {
    return WindowInsetsAnimationCompat.Impl30.OooO00o(this);
  }
  
  public Insets getLowerBound()
  {
    return this.OooO00o;
  }
  
  public Insets getUpperBound()
  {
    return this.OooO0O0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Bounds{lower=");
    Insets localInsets = this.OooO00o;
    localStringBuilder.append(localInsets);
    localStringBuilder.append(" upper=");
    localInsets = this.OooO0O0;
    localStringBuilder.append(localInsets);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat
 * JD-Core Version:    0.7.0.1
 */