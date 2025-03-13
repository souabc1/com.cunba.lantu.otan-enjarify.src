package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateRegistryController
{
  public static final SavedStateRegistryController.Companion OooO0Oo;
  public final SavedStateRegistryOwner OooO00o;
  public final SavedStateRegistry OooO0O0;
  public boolean OooO0OO;
  
  static
  {
    SavedStateRegistryController.Companion localCompanion = new androidx/savedstate/SavedStateRegistryController$Companion;
    localCompanion.<init>(null);
    OooO0Oo = localCompanion;
  }
  
  public SavedStateRegistryController(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    this.OooO00o = paramSavedStateRegistryOwner;
    paramSavedStateRegistryOwner = new androidx/savedstate/SavedStateRegistry;
    paramSavedStateRegistryOwner.<init>();
    this.OooO0O0 = paramSavedStateRegistryOwner;
  }
  
  public static final SavedStateRegistryController OooO00o(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    return OooO0Oo.OooO00o(paramSavedStateRegistryOwner);
  }
  
  public final void OooO0O0()
  {
    Object localObject1 = this.OooO00o.getLifecycle();
    Object localObject2 = ((Lifecycle)localObject1).getCurrentState();
    Object localObject3 = Lifecycle.State.o00Ooo00;
    boolean bool = true;
    int i;
    if (localObject2 == localObject3)
    {
      i = bool;
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    if (i != 0)
    {
      localObject2 = new androidx/savedstate/Recreator;
      localObject3 = this.OooO00o;
      ((Recreator)localObject2).<init>((SavedStateRegistryOwner)localObject3);
      ((Lifecycle)localObject1).OooO00o((LifecycleObserver)localObject2);
      this.OooO0O0.OooO0o0((Lifecycle)localObject1);
      this.OooO0OO = bool;
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = "Restarter must be created only during owner's initialization stage".toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void OooO0OO(Bundle paramBundle)
  {
    boolean bool1 = this.OooO0OO;
    if (!bool1) {
      OooO0O0();
    }
    Object localObject = this.OooO00o.getLifecycle();
    Lifecycle.State localState1 = ((Lifecycle)localObject).getCurrentState();
    Lifecycle.State localState2 = Lifecycle.State.o00Ooo0O;
    boolean bool2 = localState1.OooO0OO(localState2) ^ true;
    if (bool2)
    {
      this.OooO0O0.OooO0o(paramBundle);
      return;
    }
    paramBundle = new java/lang/StringBuilder;
    paramBundle.<init>();
    paramBundle.append("performRestore cannot be called when owner is ");
    localObject = ((Lifecycle)localObject).getCurrentState();
    paramBundle.append(localObject);
    paramBundle = paramBundle.toString();
    localObject = new java/lang/IllegalStateException;
    paramBundle = paramBundle.toString();
    ((IllegalStateException)localObject).<init>(paramBundle);
    throw ((Throwable)localObject);
  }
  
  public final void OooO0Oo(Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramBundle, "outBundle");
    this.OooO0O0.OooO0oO(paramBundle);
  }
  
  public final SavedStateRegistry getSavedStateRegistry()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.savedstate.SavedStateRegistryController
 * JD-Core Version:    0.7.0.1
 */