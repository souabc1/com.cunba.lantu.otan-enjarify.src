package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class WeightTypefaceApi21
{
  public static final Field OooO00o;
  public static final Method OooO0O0;
  public static final Method OooO0OO;
  public static final Constructor OooO0Oo;
  public static final Object OooO0o;
  public static final LongSparseArray OooO0o0;
  
  static
  {
    Object localObject1 = Typeface.class;
    Object localObject2 = "native_instance";
    Object localObject3;
    Object localObject5;
    try
    {
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      localObject3 = "nativeCreateFromTypeface";
      i = 2;
      Object localObject4 = new Class[i];
      Class localClass1 = Long.TYPE;
      localObject4[0] = localClass1;
      Class localClass2 = Integer.TYPE;
      boolean bool = true;
      localObject4[bool] = localClass2;
      localObject3 = ((Class)localObject1).getDeclaredMethod((String)localObject3, (Class[])localObject4);
      ((AccessibleObject)localObject3).setAccessible(bool);
      localObject4 = "nativeCreateWeightAlias";
      localObject5 = new Class[i];
      localObject5[0] = localClass1;
      localObject5[bool] = localClass2;
      localObject5 = ((Class)localObject1).getDeclaredMethod((String)localObject4, (Class[])localObject5);
      ((AccessibleObject)localObject5).setAccessible(bool);
      localObject4 = new Class[bool];
      localObject4[0] = localClass1;
      localObject1 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject4);
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    catch (NoSuchFieldException|NoSuchMethodException localNoSuchFieldException)
    {
      localObject2 = null;
      localObject1 = null;
      localObject3 = null;
      int i = 0;
      localObject5 = null;
    }
    OooO00o = (Field)localObject2;
    OooO0O0 = (Method)localObject3;
    OooO0OO = (Method)localObject5;
    OooO0Oo = (Constructor)localObject1;
    localObject1 = new androidx/collection/LongSparseArray;
    ((LongSparseArray)localObject1).<init>(3);
    OooO0o0 = (LongSparseArray)localObject1;
    localObject1 = new java/lang/Object;
    localObject1.<init>();
    OooO0o = localObject1;
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
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi21
 * JD-Core Version:    0.7.0.1
 */