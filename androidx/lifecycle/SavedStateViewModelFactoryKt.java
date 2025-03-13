package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateViewModelFactoryKt
{
  public static final List OooO00o;
  public static final List OooO0O0;
  
  static
  {
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Application.class;
    SavedStateHandle localSavedStateHandle = SavedStateHandle.class;
    arrayOfClass[1] = localSavedStateHandle;
    OooO00o = CollectionsKt.OooOO0O(arrayOfClass);
    OooO0O0 = CollectionsKt.OooO0o0(localSavedStateHandle);
  }
  
  public static final Constructor OooO0OO(Class paramClass, List paramList)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramList, "signature");
    Object localObject1 = paramClass.getConstructors();
    Object localObject2 = "modelClass.constructors";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      Object localObject3 = localObject1[j];
      Object localObject4 = localObject3.getParameterTypes();
      String str = "constructor.parameterTypes";
      Intrinsics.OooO0o0(localObject4, str);
      localObject4 = ArraysKt.OoooOoO((Object[])localObject4);
      boolean bool1 = Intrinsics.OooO00o(paramList, localObject4);
      if (bool1)
      {
        Intrinsics.OooO0Oo(localObject3, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
        return localObject3;
      }
      int m = paramList.size();
      int k = ((List)localObject4).size();
      if (m == k)
      {
        boolean bool2 = ((List)localObject4).containsAll(paramList);
        if (bool2)
        {
          localObject1 = new java/lang/UnsupportedOperationException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Class ");
          paramClass = paramClass.getSimpleName();
          ((StringBuilder)localObject2).append(paramClass);
          ((StringBuilder)localObject2).append(" must have parameters in the proper order: ");
          ((StringBuilder)localObject2).append(paramList);
          paramClass = ((StringBuilder)localObject2).toString();
          ((UnsupportedOperationException)localObject1).<init>(paramClass);
          throw ((Throwable)localObject1);
        }
      }
      j += 1;
    }
    return null;
  }
  
  public static final ViewModel OooO0Oo(Class paramClass, Constructor paramConstructor, Object... paramVarArgs)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramConstructor, "constructor");
    Object localObject = "params";
    Intrinsics.OooO0o(paramVarArgs, (String)localObject);
    try
    {
      int i = paramVarArgs.length;
      paramVarArgs = Arrays.copyOf(paramVarArgs, i);
      paramConstructor = paramConstructor.newInstance(paramVarArgs);
      return (ViewModel)paramConstructor;
    }
    catch (InvocationTargetException paramConstructor)
    {
      paramVarArgs = new java/lang/RuntimeException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("An exception happened in constructor of ");
      ((StringBuilder)localObject).append(paramClass);
      paramClass = ((StringBuilder)localObject).toString();
      paramConstructor = paramConstructor.getCause();
      paramVarArgs.<init>(paramClass, paramConstructor);
      throw paramVarArgs;
    }
    catch (InstantiationException paramConstructor)
    {
      paramVarArgs = new java/lang/RuntimeException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("A ");
      ((StringBuilder)localObject).append(paramClass);
      ((StringBuilder)localObject).append(" cannot be instantiated.");
      paramClass = ((StringBuilder)localObject).toString();
      paramVarArgs.<init>(paramClass, paramConstructor);
      throw paramVarArgs;
    }
    catch (IllegalAccessException paramConstructor)
    {
      paramVarArgs = new java/lang/RuntimeException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Failed to access ");
      ((StringBuilder)localObject).append(paramClass);
      paramClass = ((StringBuilder)localObject).toString();
      paramVarArgs.<init>(paramClass, paramConstructor);
      throw paramVarArgs;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateViewModelFactoryKt
 * JD-Core Version:    0.7.0.1
 */