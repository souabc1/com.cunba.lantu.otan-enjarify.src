package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import kotlin.jvm.internal.Intrinsics;

public class ViewModelProvider
{
  public final ViewModelStore OooO00o;
  public final ViewModelProvider.Factory OooO0O0;
  public final CreationExtras OooO0OO;
  
  public ViewModelProvider(ViewModelStore paramViewModelStore, ViewModelProvider.Factory paramFactory)
  {
    this(paramViewModelStore, paramFactory, null, 4, null);
  }
  
  public ViewModelProvider(ViewModelStore paramViewModelStore, ViewModelProvider.Factory paramFactory, CreationExtras paramCreationExtras)
  {
    this.OooO00o = paramViewModelStore;
    this.OooO0O0 = paramFactory;
    this.OooO0OO = paramCreationExtras;
  }
  
  public ViewModelProvider(ViewModelStoreOwner paramViewModelStoreOwner)
  {
    this(localViewModelStore, localFactory, paramViewModelStoreOwner);
  }
  
  public ViewModelProvider(ViewModelStoreOwner paramViewModelStoreOwner, ViewModelProvider.Factory paramFactory)
  {
    this(localViewModelStore, paramFactory, paramViewModelStoreOwner);
  }
  
  public ViewModel OooO00o(Class paramClass)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      str = localStringBuilder.toString();
      return OooO0O0(str, paramClass);
    }
    paramClass = new java/lang/IllegalArgumentException;
    paramClass.<init>("Local and anonymous classes can not be ViewModels");
    throw paramClass;
  }
  
  public ViewModel OooO0O0(String paramString, Class paramClass)
  {
    Intrinsics.OooO0o(paramString, "key");
    Intrinsics.OooO0o(paramClass, "modelClass");
    Object localObject1 = this.OooO00o.OooO0O0(paramString);
    boolean bool1 = paramClass.isInstance(localObject1);
    if (bool1)
    {
      paramString = this.OooO0O0;
      boolean bool2 = paramString instanceof ViewModelProvider.OnRequeryFactory;
      if (bool2) {
        paramString = (ViewModelProvider.OnRequeryFactory)paramString;
      } else {
        paramString = null;
      }
      if (paramString != null)
      {
        Intrinsics.OooO0OO(localObject1);
        paramString.OooO0OO((ViewModel)localObject1);
      }
      Intrinsics.OooO0Oo(localObject1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
      return localObject1;
    }
    localObject1 = new androidx/lifecycle/viewmodel/MutableCreationExtras;
    Object localObject2 = this.OooO0OO;
    ((MutableCreationExtras)localObject1).<init>((CreationExtras)localObject2);
    localObject2 = ViewModelProvider.NewInstanceFactory.OooO0Oo;
    ((MutableCreationExtras)localObject1).OooO0O0((CreationExtras.Key)localObject2, paramString);
    try
    {
      localObject2 = this.OooO0O0;
      paramClass = ((ViewModelProvider.Factory)localObject2).OooO0O0(paramClass, (CreationExtras)localObject1);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      localObject1 = this.OooO0O0;
      paramClass = ((ViewModelProvider.Factory)localObject1).OooO00o(paramClass);
    }
    this.OooO00o.OooO0Oo(paramString, paramClass);
    return paramClass;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelProvider
 * JD-Core Version:    0.7.0.1
 */