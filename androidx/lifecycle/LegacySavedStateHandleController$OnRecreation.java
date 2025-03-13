package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class LegacySavedStateHandleController$OnRecreation
  implements SavedStateRegistry.AutoRecreated
{
  public void OooO00o(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    Object localObject1 = "owner";
    Intrinsics.OooO0o(paramSavedStateRegistryOwner, (String)localObject1);
    boolean bool1 = paramSavedStateRegistryOwner instanceof ViewModelStoreOwner;
    if (bool1)
    {
      localObject1 = paramSavedStateRegistryOwner;
      localObject1 = ((ViewModelStoreOwner)paramSavedStateRegistryOwner).getViewModelStore();
      SavedStateRegistry localSavedStateRegistry = ((SavedStateRegistryOwner)paramSavedStateRegistryOwner).getSavedStateRegistry();
      Iterator localIterator = ((ViewModelStore)localObject1).OooO0OO().iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        Object localObject2 = (String)localIterator.next();
        localObject2 = ((ViewModelStore)localObject1).OooO0O0((String)localObject2);
        Intrinsics.OooO0OO(localObject2);
        Lifecycle localLifecycle = ((LifecycleOwner)paramSavedStateRegistryOwner).getLifecycle();
        LegacySavedStateHandleController.OooO00o((ViewModel)localObject2, localSavedStateRegistry, localLifecycle);
      }
      paramSavedStateRegistryOwner = ((ViewModelStore)localObject1).OooO0OO();
      boolean bool3 = paramSavedStateRegistryOwner.isEmpty() ^ true;
      if (bool3)
      {
        paramSavedStateRegistryOwner = OnRecreation.class;
        localSavedStateRegistry.OooO(paramSavedStateRegistryOwner);
      }
      return;
    }
    paramSavedStateRegistryOwner = new java/lang/IllegalStateException;
    localObject1 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString();
    paramSavedStateRegistryOwner.<init>((String)localObject1);
    throw paramSavedStateRegistryOwner;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LegacySavedStateHandleController.OnRecreation
 * JD-Core Version:    0.7.0.1
 */