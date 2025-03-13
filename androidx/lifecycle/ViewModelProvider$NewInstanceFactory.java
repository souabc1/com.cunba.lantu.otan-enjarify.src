package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras.Key;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

public class ViewModelProvider$NewInstanceFactory
  implements ViewModelProvider.Factory
{
  public static final ViewModelProvider.NewInstanceFactory.Companion OooO0O0;
  public static NewInstanceFactory OooO0OO;
  public static final CreationExtras.Key OooO0Oo = ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.OooO00o;
  
  static
  {
    ViewModelProvider.NewInstanceFactory.Companion localCompanion = new androidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;
    localCompanion.<init>(null);
    OooO0O0 = localCompanion;
  }
  
  public static final NewInstanceFactory getInstance()
  {
    return OooO0O0.getInstance();
  }
  
  public ViewModel OooO00o(Class paramClass)
  {
    String str = "Cannot create an instance of ";
    Intrinsics.OooO0o(paramClass, "modelClass");
    Object localObject1 = null;
    try
    {
      localObject2 = new Class[0];
      localObject2 = paramClass.getDeclaredConstructor((Class[])localObject2);
      localObject1 = new Object[0];
      localObject1 = ((Constructor)localObject2).newInstance((Object[])localObject1);
      localObject2 = "{\n                modelC…wInstance()\n            }";
      Intrinsics.OooO0o0(localObject1, (String)localObject2);
      return (ViewModel)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new java/lang/RuntimeException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append(paramClass);
      paramClass = localStringBuilder.toString();
      ((RuntimeException)localObject2).<init>(paramClass, localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new java/lang/RuntimeException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append(paramClass);
      paramClass = localStringBuilder.toString();
      ((RuntimeException)localObject2).<init>(paramClass, localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append(paramClass);
      paramClass = localStringBuilder.toString();
      ((RuntimeException)localObject2).<init>(paramClass, localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.NewInstanceFactory
 * JD-Core Version:    0.7.0.1
 */