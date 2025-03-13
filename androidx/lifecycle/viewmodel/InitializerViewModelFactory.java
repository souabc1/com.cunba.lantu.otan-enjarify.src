package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class InitializerViewModelFactory
  implements ViewModelProvider.Factory
{
  public final ViewModelInitializer[] OooO0O0;
  
  public InitializerViewModelFactory(ViewModelInitializer... paramVarArgs)
  {
    this.OooO0O0 = paramVarArgs;
  }
  
  public ViewModel OooO0O0(Class paramClass, CreationExtras paramCreationExtras)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramCreationExtras, "extras");
    Object localObject1 = this.OooO0O0;
    int i = localObject1.length;
    int j = 0;
    Object localObject2 = null;
    while (j < i)
    {
      Object localObject3 = localObject1[j];
      Class localClass = localObject3.getClazz$lifecycle_viewmodel_release();
      boolean bool1 = Intrinsics.OooO00o(localClass, paramClass);
      if (bool1)
      {
        localObject2 = localObject3.getInitializer$lifecycle_viewmodel_release().invoke(paramCreationExtras);
        boolean bool2 = localObject2 instanceof ViewModel;
        if (bool2) {
          localObject2 = (ViewModel)localObject2;
        } else {
          localObject2 = null;
        }
      }
      j += 1;
    }
    if (localObject2 != null) {
      return localObject2;
    }
    paramCreationExtras = new java/lang/IllegalArgumentException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("No initializer set for given class ");
    paramClass = paramClass.getName();
    ((StringBuilder)localObject1).append(paramClass);
    paramClass = ((StringBuilder)localObject1).toString();
    paramCreationExtras.<init>(paramClass);
    throw paramCreationExtras;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.viewmodel.InitializerViewModelFactory
 * JD-Core Version:    0.7.0.1
 */