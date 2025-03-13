package androidx.core.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public final class EdgeEffectCompat
{
  public final EdgeEffect OooO00o;
  
  public static EdgeEffect OooO00o(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      return EdgeEffectCompat.Api31Impl.OooO00o(paramContext, paramAttributeSet);
    }
    paramAttributeSet = new android/widget/EdgeEffect;
    paramAttributeSet.<init>(paramContext);
    return paramAttributeSet;
  }
  
  public static float OooO0O0(EdgeEffect paramEdgeEffect)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      return EdgeEffectCompat.Api31Impl.OooO0O0(paramEdgeEffect);
    }
    return 0.0F;
  }
  
  public static void OooO0OO(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    EdgeEffectCompat.Api21Impl.OooO00o(paramEdgeEffect, paramFloat1, paramFloat2);
  }
  
  public static float OooO0Oo(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      return EdgeEffectCompat.Api31Impl.OooO0OO(paramEdgeEffect, paramFloat1, paramFloat2);
    }
    OooO0OO(paramEdgeEffect, paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  public boolean isFinished()
  {
    return this.OooO00o.isFinished();
  }
  
  public void setSize(int paramInt1, int paramInt2)
  {
    this.OooO00o.setSize(paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.EdgeEffectCompat
 * JD-Core Version:    0.7.0.1
 */