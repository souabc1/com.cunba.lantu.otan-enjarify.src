package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.Intrinsics;

public final class LegacySavedStateHandleController
{
  public static final LegacySavedStateHandleController OooO00o;
  
  static
  {
    LegacySavedStateHandleController localLegacySavedStateHandleController = new androidx/lifecycle/LegacySavedStateHandleController;
    localLegacySavedStateHandleController.<init>();
    OooO00o = localLegacySavedStateHandleController;
  }
  
  public static final void OooO00o(ViewModel paramViewModel, SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle)
  {
    Intrinsics.OooO0o(paramViewModel, "viewModel");
    Intrinsics.OooO0o(paramSavedStateRegistry, "registry");
    Intrinsics.OooO0o(paramLifecycle, "lifecycle");
    String str = "androidx.lifecycle.savedstate.vm.tag";
    paramViewModel = (SavedStateHandleController)paramViewModel.OooO0Oo(str);
    if (paramViewModel != null)
    {
      boolean bool = paramViewModel.isAttached();
      if (!bool)
      {
        paramViewModel.OooO0oo(paramSavedStateRegistry, paramLifecycle);
        paramViewModel = OooO00o;
        paramViewModel.OooO0OO(paramSavedStateRegistry, paramLifecycle);
      }
    }
  }
  
  public static final SavedStateHandleController OooO0O0(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle, String paramString, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramSavedStateRegistry, "registry");
    Intrinsics.OooO0o(paramLifecycle, "lifecycle");
    Intrinsics.OooO0OO(paramString);
    Object localObject = paramSavedStateRegistry.OooO0O0(paramString);
    paramBundle = SavedStateHandle.OooO0o.OooO00o((Bundle)localObject, paramBundle);
    localObject = new androidx/lifecycle/SavedStateHandleController;
    ((SavedStateHandleController)localObject).<init>(paramString, paramBundle);
    ((SavedStateHandleController)localObject).OooO0oo(paramSavedStateRegistry, paramLifecycle);
    OooO00o.OooO0OO(paramSavedStateRegistry, paramLifecycle);
    return localObject;
  }
  
  public final void OooO0OO(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle)
  {
    Object localObject = paramLifecycle.getCurrentState();
    Lifecycle.State localState = Lifecycle.State.o00Ooo00;
    if (localObject != localState)
    {
      localState = Lifecycle.State.o00Ooo0O;
      boolean bool = ((Lifecycle.State)localObject).OooO0OO(localState);
      if (!bool)
      {
        localObject = new androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;
        ((LegacySavedStateHandleController.tryToAddRecreator.1)localObject).<init>(paramLifecycle, paramSavedStateRegistry);
        paramLifecycle.OooO00o((LifecycleObserver)localObject);
        return;
      }
    }
    paramLifecycle = LegacySavedStateHandleController.OnRecreation.class;
    paramSavedStateRegistry.OooO(paramLifecycle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LegacySavedStateHandleController
 * JD-Core Version:    0.7.0.1
 */