package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job.DefaultImpls;

public final class FoldingFeatureObserver
{
  public final WindowInfoTracker OooO00o;
  public final Executor OooO0O0;
  public Job OooO0OO;
  public FoldingFeatureObserver.OnFoldingFeatureChangeListener OooO0Oo;
  
  public FoldingFeatureObserver(WindowInfoTracker paramWindowInfoTracker, Executor paramExecutor)
  {
    this.OooO00o = paramWindowInfoTracker;
    this.OooO0O0 = paramExecutor;
  }
  
  public final FoldingFeature OooO0Oo(WindowLayoutInfo paramWindowLayoutInfo)
  {
    paramWindowLayoutInfo = paramWindowLayoutInfo.getDisplayFeatures().iterator();
    Object localObject1;
    boolean bool2;
    do
    {
      bool1 = paramWindowLayoutInfo.hasNext();
      localObject1 = null;
      if (!bool1) {
        break;
      }
      localObject2 = paramWindowLayoutInfo.next();
      Object localObject3 = localObject2;
      localObject3 = (DisplayFeature)localObject2;
      bool2 = localObject3 instanceof FoldingFeature;
    } while (!bool2);
    break label62;
    boolean bool1 = false;
    Object localObject2 = null;
    label62:
    boolean bool3 = localObject2 instanceof FoldingFeature;
    if (bool3)
    {
      localObject1 = localObject2;
      localObject1 = (FoldingFeature)localObject2;
    }
    return localObject1;
  }
  
  public final void OooO0o()
  {
    Job localJob = this.OooO0OO;
    if (localJob != null)
    {
      int i = 1;
      Job.DefaultImpls.OooO00o(localJob, null, i, null);
    }
  }
  
  public final void OooO0o0(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Job localJob = this.OooO0OO;
    if (localJob != null)
    {
      int i = 1;
      Job.DefaultImpls.OooO00o(localJob, null, i, null);
    }
    CoroutineScope localCoroutineScope = CoroutineScopeKt.OooO00o(ExecutorsKt.OooO00o(this.OooO0O0));
    FoldingFeatureObserver.registerLayoutStateChangeCallback.1 local1 = new androidx/slidingpanelayout/widget/FoldingFeatureObserver$registerLayoutStateChangeCallback$1;
    local1.<init>(this, paramActivity, null);
    paramActivity = BuildersKt.OooO0O0(localCoroutineScope, null, null, local1, 3, null);
    this.OooO0OO = paramActivity;
  }
  
  public final void setOnFoldingFeatureChangeListener(FoldingFeatureObserver.OnFoldingFeatureChangeListener paramOnFoldingFeatureChangeListener)
  {
    Intrinsics.OooO0o(paramOnFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
    this.OooO0Oo = paramOnFoldingFeatureChangeListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.slidingpanelayout.widget.FoldingFeatureObserver
 * JD-Core Version:    0.7.0.1
 */