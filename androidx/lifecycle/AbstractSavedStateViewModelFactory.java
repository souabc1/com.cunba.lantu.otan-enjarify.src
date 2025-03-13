package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.Intrinsics;

public abstract class AbstractSavedStateViewModelFactory
  extends ViewModelProvider.OnRequeryFactory
  implements ViewModelProvider.Factory
{
  public static final AbstractSavedStateViewModelFactory.Companion OooO0o0;
  public SavedStateRegistry OooO0O0;
  public Lifecycle OooO0OO;
  public Bundle OooO0Oo;
  
  static
  {
    AbstractSavedStateViewModelFactory.Companion localCompanion = new androidx/lifecycle/AbstractSavedStateViewModelFactory$Companion;
    localCompanion.<init>(null);
    OooO0o0 = localCompanion;
  }
  
  public AbstractSavedStateViewModelFactory() {}
  
  public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner paramSavedStateRegistryOwner, Bundle paramBundle)
  {
    SavedStateRegistry localSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
    this.OooO0O0 = localSavedStateRegistry;
    paramSavedStateRegistryOwner = paramSavedStateRegistryOwner.getLifecycle();
    this.OooO0OO = paramSavedStateRegistryOwner;
    this.OooO0Oo = paramBundle;
  }
  
  public ViewModel OooO00o(Class paramClass)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      Lifecycle localLifecycle = this.OooO0OO;
      if (localLifecycle != null) {
        return OooO0Oo(str, paramClass);
      }
      paramClass = new java/lang/UnsupportedOperationException;
      paramClass.<init>("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
      throw paramClass;
    }
    paramClass = new java/lang/IllegalArgumentException;
    paramClass.<init>("Local and anonymous classes can not be ViewModels");
    throw paramClass;
  }
  
  public ViewModel OooO0O0(Class paramClass, CreationExtras paramCreationExtras)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramCreationExtras, "extras");
    Object localObject = ViewModelProvider.NewInstanceFactory.OooO0Oo;
    localObject = (String)paramCreationExtras.OooO00o((CreationExtras.Key)localObject);
    if (localObject != null)
    {
      SavedStateRegistry localSavedStateRegistry = this.OooO0O0;
      if (localSavedStateRegistry != null)
      {
        paramClass = OooO0Oo((String)localObject, paramClass);
      }
      else
      {
        paramCreationExtras = SavedStateHandleSupport.OooO00o(paramCreationExtras);
        paramClass = OooO0o0((String)localObject, paramClass, paramCreationExtras);
      }
      return paramClass;
    }
    paramClass = new java/lang/IllegalStateException;
    paramClass.<init>("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    throw paramClass;
  }
  
  public void OooO0OO(ViewModel paramViewModel)
  {
    Intrinsics.OooO0o(paramViewModel, "viewModel");
    SavedStateRegistry localSavedStateRegistry = this.OooO0O0;
    if (localSavedStateRegistry != null)
    {
      Intrinsics.OooO0OO(localSavedStateRegistry);
      Lifecycle localLifecycle = this.OooO0OO;
      Intrinsics.OooO0OO(localLifecycle);
      LegacySavedStateHandleController.OooO00o(paramViewModel, localSavedStateRegistry, localLifecycle);
    }
  }
  
  public final ViewModel OooO0Oo(String paramString, Class paramClass)
  {
    Object localObject1 = this.OooO0O0;
    Intrinsics.OooO0OO(localObject1);
    Object localObject2 = this.OooO0OO;
    Intrinsics.OooO0OO(localObject2);
    Bundle localBundle = this.OooO0Oo;
    localObject1 = LegacySavedStateHandleController.OooO0O0((SavedStateRegistry)localObject1, (Lifecycle)localObject2, paramString, localBundle);
    localObject2 = ((SavedStateHandleController)localObject1).getHandle();
    paramString = OooO0o0(paramString, paramClass, (SavedStateHandle)localObject2);
    paramString.OooO0o("androidx.lifecycle.savedstate.vm.tag", localObject1);
    return paramString;
  }
  
  public abstract ViewModel OooO0o0(String paramString, Class paramClass, SavedStateHandle paramSavedStateHandle);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.AbstractSavedStateViewModelFactory
 * JD-Core Version:    0.7.0.1
 */