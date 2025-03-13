package androidx.savedstate;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateRegistry
{
  public static final SavedStateRegistry.Companion OooO0oO;
  public final SafeIterableMap OooO00o;
  public boolean OooO0O0;
  public Bundle OooO0OO;
  public boolean OooO0Oo;
  public boolean OooO0o;
  public Recreator.SavedStateProvider OooO0o0;
  
  static
  {
    SavedStateRegistry.Companion localCompanion = new androidx/savedstate/SavedStateRegistry$Companion;
    localCompanion.<init>(null);
    OooO0oO = localCompanion;
  }
  
  public SavedStateRegistry()
  {
    SafeIterableMap localSafeIterableMap = new androidx/arch/core/internal/SafeIterableMap;
    localSafeIterableMap.<init>();
    this.OooO00o = localSafeIterableMap;
    this.OooO0o = true;
  }
  
  public static final void OooO0Oo(SavedStateRegistry paramSavedStateRegistry, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Intrinsics.OooO0o(paramSavedStateRegistry, "this$0");
    String str = "<anonymous parameter 0>";
    Intrinsics.OooO0o(paramLifecycleOwner, str);
    Intrinsics.OooO0o(paramEvent, "event");
    paramLifecycleOwner = Lifecycle.Event.ON_START;
    boolean bool;
    if (paramEvent == paramLifecycleOwner) {
      bool = true;
    }
    for (;;)
    {
      paramSavedStateRegistry.OooO0o = bool;
      break;
      paramLifecycleOwner = Lifecycle.Event.ON_STOP;
      if (paramEvent != paramLifecycleOwner) {
        break;
      }
      bool = false;
      paramLifecycleOwner = null;
    }
  }
  
  public final void OooO(Class paramClass)
  {
    Object localObject1 = "clazz";
    Intrinsics.OooO0o(paramClass, (String)localObject1);
    boolean bool = this.OooO0o;
    if (bool)
    {
      localObject1 = this.OooO0o0;
      if (localObject1 == null)
      {
        localObject1 = new androidx/savedstate/Recreator$SavedStateProvider;
        ((Recreator.SavedStateProvider)localObject1).<init>(this);
      }
      this.OooO0o0 = ((Recreator.SavedStateProvider)localObject1);
      bool = false;
      localObject1 = null;
      try
      {
        localObject1 = new Class[0];
        paramClass.getDeclaredConstructor((Class[])localObject1);
        localObject1 = this.OooO0o0;
        if (localObject1 != null)
        {
          paramClass = paramClass.getName();
          localObject2 = "clazz.name";
          Intrinsics.OooO0o0(paramClass, (String)localObject2);
          ((Recreator.SavedStateProvider)localObject1).OooO0O0(paramClass);
        }
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject2 = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Class ");
        paramClass = paramClass.getSimpleName();
        localStringBuilder.append(paramClass);
        localStringBuilder.append(" must have default constructor in order to be automatically recreated");
        paramClass = localStringBuilder.toString();
        ((IllegalArgumentException)localObject2).<init>(paramClass, localNoSuchMethodException);
        throw ((Throwable)localObject2);
      }
    }
    paramClass = new java/lang/IllegalStateException;
    String str = "Can not perform this action after onSaveInstanceState".toString();
    paramClass.<init>(str);
    throw paramClass;
  }
  
  public final Bundle OooO0O0(String paramString)
  {
    Object localObject = "key";
    Intrinsics.OooO0o(paramString, (String)localObject);
    boolean bool1 = this.OooO0Oo;
    if (bool1)
    {
      localObject = this.OooO0OO;
      if (localObject != null)
      {
        if (localObject != null)
        {
          localObject = ((Bundle)localObject).getBundle(paramString);
        }
        else
        {
          bool1 = false;
          localObject = null;
        }
        Bundle localBundle = this.OooO0OO;
        if (localBundle != null) {
          localBundle.remove(paramString);
        }
        paramString = this.OooO0OO;
        int i = 0;
        localBundle = null;
        if (paramString != null)
        {
          boolean bool2 = paramString.isEmpty();
          if (!bool2) {
            i = 1;
          }
        }
        if (i == 0) {
          this.OooO0OO = null;
        }
        return localObject;
      }
      return null;
    }
    paramString = new java/lang/IllegalStateException;
    localObject = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString();
    paramString.<init>((String)localObject);
    throw paramString;
  }
  
  public final SavedStateRegistry.SavedStateProvider OooO0OO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "key");
    Iterator localIterator = this.OooO00o.iterator();
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      Intrinsics.OooO0o0(localObject, "components");
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (SavedStateRegistry.SavedStateProvider)((Map.Entry)localObject).getValue();
      bool2 = Intrinsics.OooO00o(str, paramString);
    } while (!bool2);
    break label88;
    boolean bool1 = false;
    Object localObject = null;
    label88:
    return localObject;
  }
  
  public final void OooO0o(Bundle paramBundle)
  {
    boolean bool1 = this.OooO0O0;
    if (bool1)
    {
      bool1 = this.OooO0Oo;
      boolean bool2 = true;
      bool1 ^= bool2;
      if (bool1)
      {
        if (paramBundle != null)
        {
          str = "androidx.lifecycle.BundlableSavedStateRegistry.key";
          paramBundle = paramBundle.getBundle(str);
        }
        else
        {
          paramBundle = null;
        }
        this.OooO0OO = paramBundle;
        this.OooO0Oo = bool2;
        return;
      }
      paramBundle = new java/lang/IllegalStateException;
      str = "SavedStateRegistry was already restored.".toString();
      paramBundle.<init>(str);
      throw paramBundle;
    }
    paramBundle = new java/lang/IllegalStateException;
    String str = "You must call performAttach() before calling performRestore(Bundle).".toString();
    paramBundle.<init>(str);
    throw paramBundle;
  }
  
  public final void OooO0o0(Lifecycle paramLifecycle)
  {
    Object localObject = "lifecycle";
    Intrinsics.OooO0o(paramLifecycle, (String)localObject);
    boolean bool1 = this.OooO0O0;
    boolean bool2 = true;
    bool1 ^= bool2;
    if (bool1)
    {
      localObject = new androidx/savedstate/OooO00o;
      ((OooO00o)localObject).<init>(this);
      paramLifecycle.OooO00o((LifecycleObserver)localObject);
      this.OooO0O0 = bool2;
      return;
    }
    paramLifecycle = new java/lang/IllegalStateException;
    localObject = "SavedStateRegistry was already attached.".toString();
    paramLifecycle.<init>((String)localObject);
    throw paramLifecycle;
  }
  
  public final void OooO0oO(Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramBundle, "outBundle");
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = this.OooO0OO;
    if (localObject1 != null) {
      localBundle.putAll((Bundle)localObject1);
    }
    localObject1 = this.OooO00o.OooO0OO();
    Object localObject2 = "this.components.iteratorWithAdditions()";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = ((SavedStateRegistry.SavedStateProvider)((Map.Entry)localObject2).getValue()).OooO00o();
      localBundle.putBundle(str, (Bundle)localObject2);
    }
    boolean bool2 = localBundle.isEmpty();
    if (!bool2)
    {
      localObject1 = "androidx.lifecycle.BundlableSavedStateRegistry.key";
      paramBundle.putBundle((String)localObject1, localBundle);
    }
  }
  
  public final void OooO0oo(String paramString, SavedStateRegistry.SavedStateProvider paramSavedStateProvider)
  {
    Intrinsics.OooO0o(paramString, "key");
    Intrinsics.OooO0o(paramSavedStateProvider, "provider");
    SafeIterableMap localSafeIterableMap = this.OooO00o;
    paramString = (SavedStateRegistry.SavedStateProvider)localSafeIterableMap.OooO0o(paramString, paramSavedStateProvider);
    int i;
    if (paramString == null)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramString = null;
    }
    if (i != 0) {
      return;
    }
    paramString = new java/lang/IllegalArgumentException;
    paramSavedStateProvider = "SavedStateProvider with the given key is already registered".toString();
    paramString.<init>(paramSavedStateProvider);
    throw paramString;
  }
  
  public final boolean isAllowingSavingState$savedstate_release()
  {
    return this.OooO0o;
  }
  
  public final boolean isRestored()
  {
    return this.OooO0Oo;
  }
  
  public final void setAllowingSavingState$savedstate_release(boolean paramBoolean)
  {
    this.OooO0o = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.savedstate.SavedStateRegistry
 * JD-Core Version:    0.7.0.1
 */