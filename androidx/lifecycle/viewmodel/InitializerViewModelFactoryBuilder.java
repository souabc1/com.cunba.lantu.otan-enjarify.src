package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModelProvider.Factory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

public final class InitializerViewModelFactoryBuilder
{
  public final List OooO00o;
  
  public InitializerViewModelFactoryBuilder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO00o = localArrayList;
  }
  
  public final void OooO00o(KClass paramKClass, Function1 paramFunction1)
  {
    Intrinsics.OooO0o(paramKClass, "clazz");
    Intrinsics.OooO0o(paramFunction1, "initializer");
    List localList = this.OooO00o;
    ViewModelInitializer localViewModelInitializer = new androidx/lifecycle/viewmodel/ViewModelInitializer;
    paramKClass = JvmClassMappingKt.OooO00o(paramKClass);
    localViewModelInitializer.<init>(paramKClass, paramFunction1);
    localList.add(localViewModelInitializer);
  }
  
  public final ViewModelProvider.Factory OooO0O0()
  {
    InitializerViewModelFactory localInitializerViewModelFactory = new androidx/lifecycle/viewmodel/InitializerViewModelFactory;
    Object localObject = this.OooO00o;
    ViewModelInitializer[] arrayOfViewModelInitializer = new ViewModelInitializer[0];
    localObject = (ViewModelInitializer[])((Collection)localObject).toArray(arrayOfViewModelInitializer);
    int i = localObject.length;
    localObject = (ViewModelInitializer[])Arrays.copyOf((Object[])localObject, i);
    localInitializerViewModelFactory.<init>((ViewModelInitializer[])localObject);
    return localInitializerViewModelFactory;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
 * JD-Core Version:    0.7.0.1
 */