package androidx.lifecycle;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class LifecycleDispatcher
{
  public static final LifecycleDispatcher OooO00o;
  public static final AtomicBoolean OooO0O0;
  
  static
  {
    Object localObject = new androidx/lifecycle/LifecycleDispatcher;
    ((LifecycleDispatcher)localObject).<init>();
    OooO00o = (LifecycleDispatcher)localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    OooO0O0 = (AtomicBoolean)localObject;
  }
  
  public static final void OooO00o(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject = OooO0O0;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).getAndSet(bool1);
    if (bool2) {
      return;
    }
    paramContext = paramContext.getApplicationContext();
    Intrinsics.OooO0Oo(paramContext, "null cannot be cast to non-null type android.app.Application");
    paramContext = (Application)paramContext;
    localObject = new androidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;
    ((LifecycleDispatcher.DispatcherActivityCallback)localObject).<init>();
    paramContext.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LifecycleDispatcher
 * JD-Core Version:    0.7.0.1
 */