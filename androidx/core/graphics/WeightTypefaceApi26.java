package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class WeightTypefaceApi26
{
  public static final Field OooO00o;
  public static final Method OooO0O0;
  public static final Constructor OooO0OO;
  public static final LongSparseArray OooO0Oo;
  public static final Object OooO0o0;
  
  static
  {
    Object localObject1 = Typeface.class;
    int i = 3;
    Object localObject2 = "native_instance";
    Object localObject3;
    try
    {
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      localObject3 = "nativeCreateFromTypefaceWithExactStyle";
      Class[] arrayOfClass = new Class[i];
      Class localClass1 = Long.TYPE;
      arrayOfClass[0] = localClass1;
      Class localClass2 = Integer.TYPE;
      boolean bool = true;
      arrayOfClass[bool] = localClass2;
      localClass2 = Boolean.TYPE;
      int j = 2;
      arrayOfClass[j] = localClass2;
      localObject3 = ((Class)localObject1).getDeclaredMethod((String)localObject3, arrayOfClass);
      ((AccessibleObject)localObject3).setAccessible(bool);
      arrayOfClass = new Class[bool];
      arrayOfClass[0] = localClass1;
      localObject1 = ((Class)localObject1).getDeclaredConstructor(arrayOfClass);
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    catch (NoSuchFieldException|NoSuchMethodException localNoSuchFieldException)
    {
      localObject2 = null;
      localObject1 = null;
      localObject3 = null;
    }
    OooO00o = (Field)localObject2;
    OooO0O0 = (Method)localObject3;
    OooO0OO = (Constructor)localObject1;
    localObject1 = new androidx/collection/LongSparseArray;
    ((LongSparseArray)localObject1).<init>(i);
    OooO0Oo = (LongSparseArray)localObject1;
    localObject1 = new java/lang/Object;
    localObject1.<init>();
    OooO0o0 = localObject1;
  }
  
  private static boolean isPrivateApiAvailable()
  {
    Field localField = OooO00o;
    boolean bool;
    if (localField != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localField = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi26
 * JD-Core Version:    0.7.0.1
 */