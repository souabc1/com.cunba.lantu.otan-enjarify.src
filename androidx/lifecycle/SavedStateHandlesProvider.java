package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateHandlesProvider
  implements SavedStateRegistry.SavedStateProvider
{
  public final SavedStateRegistry OooO00o;
  public boolean OooO0O0;
  public Bundle OooO0OO;
  public final Lazy OooO0Oo;
  
  public SavedStateHandlesProvider(SavedStateRegistry paramSavedStateRegistry, ViewModelStoreOwner paramViewModelStoreOwner)
  {
    this.OooO00o = paramSavedStateRegistry;
    paramSavedStateRegistry = new androidx/lifecycle/SavedStateHandlesProvider$viewModel$2;
    paramSavedStateRegistry.<init>(paramViewModelStoreOwner);
    paramSavedStateRegistry = LazyKt.OooO0O0(paramSavedStateRegistry);
    this.OooO0Oo = paramSavedStateRegistry;
  }
  
  private final SavedStateHandlesVM getViewModel()
  {
    return (SavedStateHandlesVM)this.OooO0Oo.getValue();
  }
  
  public Bundle OooO00o()
  {
    Bundle localBundle1 = new android/os/Bundle;
    localBundle1.<init>();
    Object localObject1 = this.OooO0OO;
    if (localObject1 != null) {
      localBundle1.putAll((Bundle)localObject1);
    }
    localObject1 = getViewModel().getHandles().entrySet().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = ((SavedStateHandle)((Map.Entry)localObject2).getValue()).OooO0o0().OooO00o();
      Bundle localBundle2 = Bundle.EMPTY;
      boolean bool2 = Intrinsics.OooO00o(localObject2, localBundle2);
      if (!bool2) {
        localBundle1.putBundle(str, (Bundle)localObject2);
      }
    }
    this.OooO0O0 = false;
    return localBundle1;
  }
  
  public final Bundle OooO0O0(String paramString)
  {
    Intrinsics.OooO0o(paramString, "key");
    OooO0OO();
    Bundle localBundle1 = this.OooO0OO;
    if (localBundle1 != null) {
      localBundle1 = localBundle1.getBundle(paramString);
    } else {
      localBundle1 = null;
    }
    Bundle localBundle2 = this.OooO0OO;
    if (localBundle2 != null) {
      localBundle2.remove(paramString);
    }
    paramString = this.OooO0OO;
    int i = 0;
    localBundle2 = null;
    if (paramString != null)
    {
      boolean bool1 = paramString.isEmpty();
      boolean bool2 = true;
      if (bool1 == bool2) {
        i = bool2;
      }
    }
    if (i != 0) {
      this.OooO0OO = null;
    }
    return localBundle1;
  }
  
  public final void OooO0OO()
  {
    boolean bool = this.OooO0O0;
    if (!bool)
    {
      Bundle localBundle1 = this.OooO00o.OooO0O0("androidx.lifecycle.internal.SavedStateHandlesProvider");
      Bundle localBundle2 = new android/os/Bundle;
      localBundle2.<init>();
      Bundle localBundle3 = this.OooO0OO;
      if (localBundle3 != null) {
        localBundle2.putAll(localBundle3);
      }
      if (localBundle1 != null) {
        localBundle2.putAll(localBundle1);
      }
      this.OooO0OO = localBundle2;
      bool = true;
      this.OooO0O0 = bool;
      getViewModel();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateHandlesProvider
 * JD-Core Version:    0.7.0.1
 */