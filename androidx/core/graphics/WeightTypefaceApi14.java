package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class WeightTypefaceApi14
{
  public static final Field OooO00o;
  public static final LongSparseArray OooO0O0;
  public static final Object OooO0OO;
  
  static
  {
    Object localObject = Typeface.class;
    String str = "native_instance";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
    }
    catch (Exception localException)
    {
      localObject = null;
    }
    OooO00o = (Field)localObject;
    localObject = new androidx/collection/LongSparseArray;
    ((LongSparseArray)localObject).<init>(3);
    OooO0O0 = (LongSparseArray)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
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
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi14
 * JD-Core Version:    0.7.0.1
 */