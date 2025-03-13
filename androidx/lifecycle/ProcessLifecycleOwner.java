package androidx.lifecycle;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessLifecycleOwner
  implements LifecycleOwner
{
  public static final ProcessLifecycleOwner.Companion o00OooOo;
  public static final ProcessLifecycleOwner o0O00o0;
  public int o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00;
  public boolean o00Ooo0O;
  public Handler o00Ooo0o;
  public final Runnable o00OooO;
  public final LifecycleRegistry o00OooO0;
  public final ReportFragment.ActivityInitializationListener o00OooOO;
  
  static
  {
    Object localObject = new androidx/lifecycle/ProcessLifecycleOwner$Companion;
    ((ProcessLifecycleOwner.Companion)localObject).<init>(null);
    o00OooOo = (ProcessLifecycleOwner.Companion)localObject;
    localObject = new androidx/lifecycle/ProcessLifecycleOwner;
    ((ProcessLifecycleOwner)localObject).<init>();
    o0O00o0 = (ProcessLifecycleOwner)localObject;
  }
  
  private ProcessLifecycleOwner()
  {
    boolean bool = true;
    this.o00Ooo0 = bool;
    this.o00Ooo0O = bool;
    Object localObject = new androidx/lifecycle/LifecycleRegistry;
    ((LifecycleRegistry)localObject).<init>(this);
    this.o00OooO0 = ((LifecycleRegistry)localObject);
    localObject = new androidx/lifecycle/OooOO0;
    ((OooOO0)localObject).<init>(this);
    this.o00OooO = ((Runnable)localObject);
    localObject = new androidx/lifecycle/ProcessLifecycleOwner$initializationListener$1;
    ((ProcessLifecycleOwner.initializationListener.1)localObject).<init>(this);
    this.o00OooOO = ((ReportFragment.ActivityInitializationListener)localObject);
  }
  
  public static final void OooO(ProcessLifecycleOwner paramProcessLifecycleOwner)
  {
    Intrinsics.OooO0o(paramProcessLifecycleOwner, "this$0");
    paramProcessLifecycleOwner.OooOO0();
    paramProcessLifecycleOwner.OooOO0O();
  }
  
  public static final LifecycleOwner get()
  {
    return o00OooOo.get();
  }
  
  public final void OooO0Oo()
  {
    int i = this.o00Ooo00 + -1;
    this.o00Ooo00 = i;
    if (i == 0)
    {
      Handler localHandler = this.o00Ooo0o;
      Intrinsics.OooO0OO(localHandler);
      Runnable localRunnable = this.o00OooO;
      long l = 700L;
      localHandler.postDelayed(localRunnable, l);
    }
  }
  
  public final void OooO0o()
  {
    int i = this.o00OoOoo;
    int j = 1;
    i += j;
    this.o00OoOoo = i;
    if (i == j)
    {
      boolean bool = this.o00Ooo0O;
      if (bool)
      {
        LifecycleRegistry localLifecycleRegistry = this.o00OooO0;
        Lifecycle.Event localEvent = Lifecycle.Event.ON_START;
        localLifecycleRegistry.OooO0oO(localEvent);
        bool = false;
        localLifecycleRegistry = null;
        this.o00Ooo0O = false;
      }
    }
  }
  
  public final void OooO0o0()
  {
    int i = this.o00Ooo00;
    int j = 1;
    i += j;
    this.o00Ooo00 = i;
    if (i == j)
    {
      boolean bool = this.o00Ooo0;
      Object localObject1;
      Object localObject2;
      if (bool)
      {
        localObject1 = this.o00OooO0;
        localObject2 = Lifecycle.Event.ON_RESUME;
        ((LifecycleRegistry)localObject1).OooO0oO((Lifecycle.Event)localObject2);
        bool = false;
        localObject1 = null;
        this.o00Ooo0 = false;
      }
      else
      {
        localObject1 = this.o00Ooo0o;
        Intrinsics.OooO0OO(localObject1);
        localObject2 = this.o00OooO;
        ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
      }
    }
  }
  
  public final void OooO0oO()
  {
    int i = this.o00OoOoo + -1;
    this.o00OoOoo = i;
    OooOO0O();
  }
  
  public final void OooO0oo(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.o00Ooo0o = ((Handler)localObject);
    localObject = this.o00OooO0;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_CREATE;
    ((LifecycleRegistry)localObject).OooO0oO(localEvent);
    paramContext = paramContext.getApplicationContext();
    Intrinsics.OooO0Oo(paramContext, "null cannot be cast to non-null type android.app.Application");
    paramContext = (Application)paramContext;
    localObject = new androidx/lifecycle/ProcessLifecycleOwner$attach$1;
    ((ProcessLifecycleOwner.attach.1)localObject).<init>(this);
    paramContext.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
  }
  
  public final void OooOO0()
  {
    int i = this.o00Ooo00;
    if (i == 0)
    {
      i = 1;
      this.o00Ooo0 = i;
      LifecycleRegistry localLifecycleRegistry = this.o00OooO0;
      Lifecycle.Event localEvent = Lifecycle.Event.ON_PAUSE;
      localLifecycleRegistry.OooO0oO(localEvent);
    }
  }
  
  public final void OooOO0O()
  {
    int i = this.o00OoOoo;
    if (i == 0)
    {
      boolean bool = this.o00Ooo0;
      if (bool)
      {
        LifecycleRegistry localLifecycleRegistry = this.o00OooO0;
        Lifecycle.Event localEvent = Lifecycle.Event.ON_STOP;
        localLifecycleRegistry.OooO0oO(localEvent);
        bool = true;
        this.o00Ooo0O = bool;
      }
    }
  }
  
  public Lifecycle getLifecycle()
  {
    return this.o00OooO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner
 * JD-Core Version:    0.7.0.1
 */