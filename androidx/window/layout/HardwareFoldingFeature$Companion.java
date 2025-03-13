package androidx.window.layout;

import androidx.window.core.Bounds;
import kotlin.jvm.internal.Intrinsics;

public final class HardwareFoldingFeature$Companion
{
  public final void OooO00o(Bounds paramBounds)
  {
    String str = "bounds";
    Intrinsics.OooO0o(paramBounds, str);
    int i = paramBounds.getWidth();
    int j = 0;
    int k = 1;
    if (i == 0)
    {
      i = paramBounds.getHeight();
      if (i == 0)
      {
        i = 0;
        str = null;
        break label45;
      }
    }
    i = k;
    label45:
    if (i != 0)
    {
      i = paramBounds.getLeft();
      if (i != 0)
      {
        int m = paramBounds.getTop();
        if (m != 0) {}
      }
      else
      {
        j = k;
      }
      if (j != 0) {
        return;
      }
      paramBounds = new java/lang/IllegalArgumentException;
      str = "Bounding rectangle must start at the top or left window edge for folding features".toString();
      paramBounds.<init>(str);
      throw paramBounds;
    }
    paramBounds = new java/lang/IllegalArgumentException;
    str = "Bounds must be non zero".toString();
    paramBounds.<init>(str);
    throw paramBounds;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.HardwareFoldingFeature.Companion
 * JD-Core Version:    0.7.0.1
 */