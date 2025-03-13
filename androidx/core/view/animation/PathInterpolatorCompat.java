package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;

public final class PathInterpolatorCompat
{
  public static Interpolator OooO00o(float paramFloat1, float paramFloat2)
  {
    return PathInterpolatorCompat.Api21Impl.OooO00o(paramFloat1, paramFloat2);
  }
  
  public static Interpolator OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return PathInterpolatorCompat.Api21Impl.OooO0O0(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public static Interpolator OooO0OO(Path paramPath)
  {
    return PathInterpolatorCompat.Api21Impl.OooO0OO(paramPath);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.animation.PathInterpolatorCompat
 * JD-Core Version:    0.7.0.1
 */