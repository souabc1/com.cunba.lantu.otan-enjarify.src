package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public final class SavedStateHandleSupport
{
  public static final CreationExtras.Key OooO00o;
  public static final CreationExtras.Key OooO0O0;
  public static final CreationExtras.Key OooO0OO;
  
  static
  {
    Object localObject = new androidx/lifecycle/SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1;
    ((SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY.1)localObject).<init>();
    OooO00o = (CreationExtras.Key)localObject;
    localObject = new androidx/lifecycle/SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1;
    ((SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY.1)localObject).<init>();
    OooO0O0 = (CreationExtras.Key)localObject;
    localObject = new androidx/lifecycle/SavedStateHandleSupport$DEFAULT_ARGS_KEY$1;
    ((SavedStateHandleSupport.DEFAULT_ARGS_KEY.1)localObject).<init>();
    OooO0OO = (CreationExtras.Key)localObject;
  }
  
  public static final SavedStateHandle OooO00o(CreationExtras paramCreationExtras)
  {
    Intrinsics.OooO0o(paramCreationExtras, "<this>");
    Object localObject1 = OooO00o;
    localObject1 = (SavedStateRegistryOwner)paramCreationExtras.OooO00o((CreationExtras.Key)localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = OooO0O0;
      localObject2 = (ViewModelStoreOwner)paramCreationExtras.OooO00o((CreationExtras.Key)localObject2);
      if (localObject2 != null)
      {
        Object localObject3 = OooO0OO;
        localObject3 = (Bundle)paramCreationExtras.OooO00o((CreationExtras.Key)localObject3);
        CreationExtras.Key localKey = ViewModelProvider.NewInstanceFactory.OooO0Oo;
        paramCreationExtras = (String)paramCreationExtras.OooO00o(localKey);
        if (paramCreationExtras != null) {
          return OooO0O0((SavedStateRegistryOwner)localObject1, (ViewModelStoreOwner)localObject2, paramCreationExtras, (Bundle)localObject3);
        }
        paramCreationExtras = new java/lang/IllegalArgumentException;
        paramCreationExtras.<init>("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        throw paramCreationExtras;
      }
      paramCreationExtras = new java/lang/IllegalArgumentException;
      paramCreationExtras.<init>("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
      throw paramCreationExtras;
    }
    paramCreationExtras = new java/lang/IllegalArgumentException;
    paramCreationExtras.<init>("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    throw paramCreationExtras;
  }
  
  public static final SavedStateHandle OooO0O0(SavedStateRegistryOwner paramSavedStateRegistryOwner, ViewModelStoreOwner paramViewModelStoreOwner, String paramString, Bundle paramBundle)
  {
    paramSavedStateRegistryOwner = OooO0Oo(paramSavedStateRegistryOwner);
    paramViewModelStoreOwner = OooO0o0(paramViewModelStoreOwner);
    Object localObject = (SavedStateHandle)paramViewModelStoreOwner.getHandles().get(paramString);
    if (localObject == null)
    {
      localObject = SavedStateHandle.OooO0o;
      paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.OooO0O0(paramString);
      localObject = ((SavedStateHandle.Companion)localObject).OooO00o(paramSavedStateRegistryOwner, paramBundle);
      paramSavedStateRegistryOwner = paramViewModelStoreOwner.getHandles();
      paramSavedStateRegistryOwner.put(paramString, localObject);
    }
    return localObject;
  }
  
  public static final void OooO0OO(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    Intrinsics.OooO0o(paramSavedStateRegistryOwner, "<this>");
    Object localObject1 = paramSavedStateRegistryOwner.getLifecycle().getCurrentState();
    Object localObject2 = Lifecycle.State.o00Ooo00;
    if (localObject1 != localObject2)
    {
      localObject2 = Lifecycle.State.o00Ooo0;
      if (localObject1 != localObject2)
      {
        i = 0;
        localObject1 = null;
        break label46;
      }
    }
    int i = 1;
    label46:
    if (i != 0)
    {
      localObject1 = paramSavedStateRegistryOwner.getSavedStateRegistry();
      localObject2 = "androidx.lifecycle.internal.SavedStateHandlesProvider";
      localObject1 = ((SavedStateRegistry)localObject1).OooO0OO((String)localObject2);
      if (localObject1 == null)
      {
        localObject1 = new androidx/lifecycle/SavedStateHandlesProvider;
        SavedStateRegistry localSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
        Object localObject3 = paramSavedStateRegistryOwner;
        localObject3 = (ViewModelStoreOwner)paramSavedStateRegistryOwner;
        ((SavedStateHandlesProvider)localObject1).<init>(localSavedStateRegistry, (ViewModelStoreOwner)localObject3);
        localSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
        localSavedStateRegistry.OooO0oo((String)localObject2, (SavedStateRegistry.SavedStateProvider)localObject1);
        paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.getLifecycle();
        localObject2 = new androidx/lifecycle/SavedStateHandleAttacher;
        ((SavedStateHandleAttacher)localObject2).<init>((SavedStateHandlesProvider)localObject1);
        paramSavedStateRegistryOwner.OooO00o((LifecycleObserver)localObject2);
      }
      return;
    }
    paramSavedStateRegistryOwner = new java/lang/IllegalArgumentException;
    localObject1 = "Failed requirement.".toString();
    paramSavedStateRegistryOwner.<init>((String)localObject1);
    throw paramSavedStateRegistryOwner;
  }
  
  public static final SavedStateHandlesProvider OooO0Oo(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    Intrinsics.OooO0o(paramSavedStateRegistryOwner, "<this>");
    paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.getSavedStateRegistry();
    String str = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.OooO0OO(str);
    boolean bool = paramSavedStateRegistryOwner instanceof SavedStateHandlesProvider;
    if (bool) {
      paramSavedStateRegistryOwner = (SavedStateHandlesProvider)paramSavedStateRegistryOwner;
    } else {
      paramSavedStateRegistryOwner = null;
    }
    if (paramSavedStateRegistryOwner != null) {
      return paramSavedStateRegistryOwner;
    }
    paramSavedStateRegistryOwner = new java/lang/IllegalStateException;
    paramSavedStateRegistryOwner.<init>("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    throw paramSavedStateRegistryOwner;
  }
  
  public static final SavedStateHandlesVM OooO0o0(ViewModelStoreOwner paramViewModelStoreOwner)
  {
    Intrinsics.OooO0o(paramViewModelStoreOwner, "<this>");
    Object localObject1 = new androidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;
    ((InitializerViewModelFactoryBuilder)localObject1).<init>();
    Object localObject2 = SavedStateHandleSupport.savedStateHandlesVM.1.1.o00OoOoo;
    SavedStateHandlesVM localSavedStateHandlesVM = SavedStateHandlesVM.class;
    KClass localKClass = Reflection.OooO0O0(localSavedStateHandlesVM);
    ((InitializerViewModelFactoryBuilder)localObject1).OooO00o(localKClass, (Function1)localObject2);
    localObject1 = ((InitializerViewModelFactoryBuilder)localObject1).OooO0O0();
    localObject2 = new androidx/lifecycle/ViewModelProvider;
    ((ViewModelProvider)localObject2).<init>(paramViewModelStoreOwner, (ViewModelProvider.Factory)localObject1);
    return (SavedStateHandlesVM)((ViewModelProvider)localObject2).OooO0O0("androidx.lifecycle.internal.SavedStateHandlesVM", localSavedStateHandlesVM);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateHandleSupport
 * JD-Core Version:    0.7.0.1
 */