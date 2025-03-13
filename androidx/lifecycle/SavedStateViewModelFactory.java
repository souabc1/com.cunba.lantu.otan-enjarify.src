package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateViewModelFactory
  extends ViewModelProvider.OnRequeryFactory
  implements ViewModelProvider.Factory
{
  public Application OooO0O0;
  public final ViewModelProvider.Factory OooO0OO;
  public Bundle OooO0Oo;
  public SavedStateRegistry OooO0o;
  public Lifecycle OooO0o0;
  
  public SavedStateViewModelFactory()
  {
    ViewModelProvider.AndroidViewModelFactory localAndroidViewModelFactory = new androidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;
    localAndroidViewModelFactory.<init>();
    this.OooO0OO = localAndroidViewModelFactory;
  }
  
  public SavedStateViewModelFactory(Application paramApplication, SavedStateRegistryOwner paramSavedStateRegistryOwner, Bundle paramBundle)
  {
    SavedStateRegistry localSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
    this.OooO0o = localSavedStateRegistry;
    paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.getLifecycle();
    this.OooO0o0 = paramSavedStateRegistryOwner;
    this.OooO0Oo = paramBundle;
    this.OooO0O0 = paramApplication;
    if (paramApplication != null)
    {
      paramSavedStateRegistryOwner = ViewModelProvider.AndroidViewModelFactory.OooO0o;
      paramApplication = paramSavedStateRegistryOwner.OooO0O0(paramApplication);
    }
    else
    {
      paramApplication = new androidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;
      paramApplication.<init>();
    }
    this.OooO0OO = paramApplication;
  }
  
  public ViewModel OooO00o(Class paramClass)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    String str = paramClass.getCanonicalName();
    if (str != null) {
      return OooO0Oo(str, paramClass);
    }
    paramClass = new java/lang/IllegalArgumentException;
    paramClass.<init>("Local and anonymous classes can not be ViewModels");
    throw paramClass;
  }
  
  public ViewModel OooO0O0(Class paramClass, CreationExtras paramCreationExtras)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramCreationExtras, "extras");
    Object localObject1 = ViewModelProvider.NewInstanceFactory.OooO0Oo;
    localObject1 = (String)paramCreationExtras.OooO00o((CreationExtras.Key)localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = SavedStateHandleSupport.OooO00o;
      localObject2 = paramCreationExtras.OooO00o((CreationExtras.Key)localObject2);
      if (localObject2 != null)
      {
        localObject2 = SavedStateHandleSupport.OooO0O0;
        localObject2 = paramCreationExtras.OooO00o((CreationExtras.Key)localObject2);
        if (localObject2 != null)
        {
          localObject1 = ViewModelProvider.AndroidViewModelFactory.OooO0oo;
          localObject1 = (Application)paramCreationExtras.OooO00o((CreationExtras.Key)localObject1);
          localObject2 = AndroidViewModel.class;
          boolean bool = ((Class)localObject2).isAssignableFrom(paramClass);
          if ((bool) && (localObject1 != null)) {
            localObject3 = SavedStateViewModelFactoryKt.OooO00o();
          } else {
            localObject3 = SavedStateViewModelFactoryKt.OooO0O0();
          }
          Object localObject3 = SavedStateViewModelFactoryKt.OooO0OO(paramClass, (List)localObject3);
          if (localObject3 == null) {
            return this.OooO0OO.OooO0O0(paramClass, paramCreationExtras);
          }
          if ((bool) && (localObject1 != null))
          {
            paramCreationExtras = SavedStateHandleSupport.OooO00o(paramCreationExtras);
            paramCreationExtras = new Object[] { localObject1, paramCreationExtras };
            paramClass = SavedStateViewModelFactoryKt.OooO0Oo(paramClass, (Constructor)localObject3, paramCreationExtras);
            break label216;
          }
          paramCreationExtras = SavedStateHandleSupport.OooO00o(paramCreationExtras);
          paramCreationExtras = new Object[] { paramCreationExtras };
          paramClass = SavedStateViewModelFactoryKt.OooO0Oo(paramClass, (Constructor)localObject3, paramCreationExtras);
          break label216;
        }
      }
      paramCreationExtras = this.OooO0o0;
      if (paramCreationExtras != null)
      {
        paramClass = OooO0Oo((String)localObject1, paramClass);
        label216:
        return paramClass;
      }
      paramClass = new java/lang/IllegalStateException;
      paramClass.<init>("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
      throw paramClass;
    }
    paramClass = new java/lang/IllegalStateException;
    paramClass.<init>("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    throw paramClass;
  }
  
  public void OooO0OO(ViewModel paramViewModel)
  {
    Intrinsics.OooO0o(paramViewModel, "viewModel");
    Object localObject = this.OooO0o0;
    if (localObject != null)
    {
      localObject = this.OooO0o;
      Intrinsics.OooO0OO(localObject);
      Lifecycle localLifecycle = this.OooO0o0;
      Intrinsics.OooO0OO(localLifecycle);
      LegacySavedStateHandleController.OooO00o(paramViewModel, (SavedStateRegistry)localObject, localLifecycle);
    }
  }
  
  public final ViewModel OooO0Oo(String paramString, Class paramClass)
  {
    Intrinsics.OooO0o(paramString, "key");
    Intrinsics.OooO0o(paramClass, "modelClass");
    Object localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      Object localObject2 = AndroidViewModel.class;
      boolean bool = ((Class)localObject2).isAssignableFrom(paramClass);
      if (bool)
      {
        localObject3 = this.OooO0O0;
        if (localObject3 != null)
        {
          localObject3 = SavedStateViewModelFactoryKt.OooO00o();
          break label62;
        }
      }
      Object localObject3 = SavedStateViewModelFactoryKt.OooO0O0();
      label62:
      localObject3 = SavedStateViewModelFactoryKt.OooO0OO(paramClass, (List)localObject3);
      if (localObject3 == null)
      {
        paramString = this.OooO0O0;
        if (paramString != null) {
          paramString = this.OooO0OO.OooO00o(paramClass);
        } else {
          paramString = ViewModelProvider.NewInstanceFactory.OooO0O0.getInstance().OooO00o(paramClass);
        }
        return paramString;
      }
      SavedStateRegistry localSavedStateRegistry = this.OooO0o;
      Intrinsics.OooO0OO(localSavedStateRegistry);
      Bundle localBundle = this.OooO0Oo;
      paramString = LegacySavedStateHandleController.OooO0O0(localSavedStateRegistry, (Lifecycle)localObject1, paramString, localBundle);
      if (bool)
      {
        localObject1 = this.OooO0O0;
        if (localObject1 != null)
        {
          Intrinsics.OooO0OO(localObject1);
          localObject2 = paramString.getHandle();
          localObject1 = new Object[] { localObject1, localObject2 };
          paramClass = SavedStateViewModelFactoryKt.OooO0Oo(paramClass, (Constructor)localObject3, (Object[])localObject1);
          break label209;
        }
      }
      localObject1 = paramString.getHandle();
      localObject1 = new Object[] { localObject1 };
      paramClass = SavedStateViewModelFactoryKt.OooO0Oo(paramClass, (Constructor)localObject3, (Object[])localObject1);
      label209:
      paramClass.OooO0o("androidx.lifecycle.savedstate.vm.tag", paramString);
      return paramClass;
    }
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    throw paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateViewModelFactory
 * JD-Core Version:    0.7.0.1
 */