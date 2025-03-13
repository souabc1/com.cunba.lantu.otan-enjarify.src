package androidx.window.embedding;

import android.graphics.Rect;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;

public final class SplitRule$Api30Impl
{
  public static final Api30Impl OooO00o;
  
  static
  {
    Api30Impl localApi30Impl = new androidx/window/embedding/SplitRule$Api30Impl;
    localApi30Impl.<init>();
    OooO00o = localApi30Impl;
  }
  
  public final Rect OooO00o(WindowMetrics paramWindowMetrics)
  {
    Intrinsics.OooO0o(paramWindowMetrics, "windowMetrics");
    paramWindowMetrics = paramWindowMetrics.getBounds();
    Intrinsics.OooO0o0(paramWindowMetrics, "windowMetrics.bounds");
    return paramWindowMetrics;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.SplitRule.Api30Impl
 * JD-Core Version:    0.7.0.1
 */