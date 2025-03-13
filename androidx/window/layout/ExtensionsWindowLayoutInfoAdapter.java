package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class ExtensionsWindowLayoutInfoAdapter
{
  public static final ExtensionsWindowLayoutInfoAdapter OooO00o;
  
  static
  {
    ExtensionsWindowLayoutInfoAdapter localExtensionsWindowLayoutInfoAdapter = new androidx/window/layout/ExtensionsWindowLayoutInfoAdapter;
    localExtensionsWindowLayoutInfoAdapter.<init>();
    OooO00o = localExtensionsWindowLayoutInfoAdapter;
  }
  
  public final FoldingFeature OooO00o(Activity paramActivity, androidx.window.extensions.layout.FoldingFeature paramFoldingFeature)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Object localObject = "oemFeature";
    Intrinsics.OooO0o(paramFoldingFeature, (String)localObject);
    int i = paramFoldingFeature.getType();
    int j = 2;
    int k = 1;
    HardwareFoldingFeature localHardwareFoldingFeature = null;
    if (i != k)
    {
      if (i != j) {
        return null;
      }
      localObject = HardwareFoldingFeature.Type.OooO0O0.getHINGE();
    }
    else
    {
      localObject = HardwareFoldingFeature.Type.OooO0O0.getFOLD();
    }
    int m = paramFoldingFeature.getState();
    FoldingFeature.State localState;
    if (m != k)
    {
      if (m != j) {
        return null;
      }
      localState = FoldingFeature.State.OooO0Oo;
    }
    else
    {
      localState = FoldingFeature.State.OooO0OO;
    }
    Bounds localBounds = new androidx/window/core/Bounds;
    Rect localRect = paramFoldingFeature.getBounds();
    String str = "oemFeature.bounds";
    Intrinsics.OooO0o0(localRect, str);
    localBounds.<init>(localRect);
    boolean bool = OooO0OO(paramActivity, localBounds);
    if (bool)
    {
      localHardwareFoldingFeature = new androidx/window/layout/HardwareFoldingFeature;
      paramActivity = new androidx/window/core/Bounds;
      paramFoldingFeature = paramFoldingFeature.getBounds();
      Intrinsics.OooO0o0(paramFoldingFeature, str);
      paramActivity.<init>(paramFoldingFeature);
      localHardwareFoldingFeature.<init>(paramActivity, (HardwareFoldingFeature.Type)localObject, localState);
    }
    return localHardwareFoldingFeature;
  }
  
  public final WindowLayoutInfo OooO0O0(Activity paramActivity, androidx.window.extensions.layout.WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramWindowLayoutInfo, "info");
    paramWindowLayoutInfo = paramWindowLayoutInfo.getDisplayFeatures();
    Intrinsics.OooO0o0(paramWindowLayoutInfo, "info.displayFeatures");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramWindowLayoutInfo = paramWindowLayoutInfo.iterator();
    for (;;)
    {
      boolean bool1 = paramWindowLayoutInfo.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (DisplayFeature)paramWindowLayoutInfo.next();
      boolean bool2 = localObject instanceof androidx.window.extensions.layout.FoldingFeature;
      if (bool2)
      {
        ExtensionsWindowLayoutInfoAdapter localExtensionsWindowLayoutInfoAdapter = OooO00o;
        String str = "feature";
        Intrinsics.OooO0o0(localObject, str);
        localObject = (androidx.window.extensions.layout.FoldingFeature)localObject;
        localObject = localExtensionsWindowLayoutInfoAdapter.OooO00o(paramActivity, (androidx.window.extensions.layout.FoldingFeature)localObject);
      }
      else
      {
        bool1 = false;
        localObject = null;
      }
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    paramActivity = new androidx/window/layout/WindowLayoutInfo;
    paramActivity.<init>(localArrayList);
    return paramActivity;
  }
  
  public final boolean OooO0OO(Activity paramActivity, Bounds paramBounds)
  {
    WindowMetricsCalculatorCompat localWindowMetricsCalculatorCompat = WindowMetricsCalculatorCompat.OooO0O0;
    paramActivity = localWindowMetricsCalculatorCompat.OooO00o(paramActivity).getBounds();
    boolean bool = paramBounds.isZero();
    if (bool) {
      return false;
    }
    int i = paramBounds.getWidth();
    int j = paramActivity.width();
    if (i != j)
    {
      i = paramBounds.getHeight();
      j = paramActivity.height();
      if (i != j) {
        return false;
      }
    }
    i = paramBounds.getWidth();
    j = paramActivity.width();
    if (i < j)
    {
      i = paramBounds.getHeight();
      j = paramActivity.height();
      if (i < j) {
        return false;
      }
    }
    i = paramBounds.getWidth();
    j = paramActivity.width();
    if (i == j)
    {
      int k = paramBounds.getHeight();
      int m = paramActivity.height();
      if (k == m) {
        return false;
      }
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.ExtensionsWindowLayoutInfoAdapter
 * JD-Core Version:    0.7.0.1
 */