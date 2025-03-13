package androidx.core.location;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LocationRequestCompat$Api19Impl
{
  public static Class OooO00o;
  public static Method OooO0O0;
  public static Method OooO0OO;
  public static Method OooO0Oo;
  public static Method OooO0o;
  public static Method OooO0o0;
  
  public static Object OooO00o(LocationRequestCompat paramLocationRequestCompat, String paramString)
  {
    try
    {
      Object localObject1 = OooO00o;
      if (localObject1 == null)
      {
        localObject1 = "android.location.LocationRequest";
        localObject1 = Class.forName((String)localObject1);
        OooO00o = (Class)localObject1;
      }
      localObject1 = OooO0O0;
      int i = 3;
      int j = 2;
      int k = 4;
      boolean bool1 = true;
      if (localObject1 == null)
      {
        localObject1 = OooO00o;
        String str = "createFromDeprecatedProvider";
        Class[] arrayOfClass = new Class[k];
        Object localObject2 = String.class;
        arrayOfClass[0] = localObject2;
        localObject2 = Long.TYPE;
        arrayOfClass[bool1] = localObject2;
        localObject2 = Float.TYPE;
        arrayOfClass[j] = localObject2;
        localObject2 = Boolean.TYPE;
        arrayOfClass[i] = localObject2;
        localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
        OooO0O0 = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool1);
      }
      localObject1 = OooO0O0;
      Object localObject3 = new Object[k];
      localObject3[0] = paramString;
      long l1 = paramLocationRequestCompat.getIntervalMillis();
      paramString = Long.valueOf(l1);
      localObject3[bool1] = paramString;
      float f = paramLocationRequestCompat.getMinUpdateDistanceMeters();
      paramString = Float.valueOf(f);
      localObject3[j] = paramString;
      paramString = Boolean.FALSE;
      localObject3[i] = paramString;
      paramString = ((Method)localObject1).invoke(null, (Object[])localObject3);
      if (paramString == null) {
        return null;
      }
      localObject1 = OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = OooO00o;
        localObject4 = "setQuality";
        localObject5 = new Class[bool1];
        localObject3 = Integer.TYPE;
        localObject5[0] = localObject3;
        localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject4, (Class[])localObject5);
        OooO0OO = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool1);
      }
      localObject1 = OooO0OO;
      Object localObject4 = new Object[bool1];
      j = paramLocationRequestCompat.getQuality();
      Object localObject5 = Integer.valueOf(j);
      localObject4[0] = localObject5;
      ((Method)localObject1).invoke(paramString, (Object[])localObject4);
      localObject1 = OooO0Oo;
      if (localObject1 == null)
      {
        localObject1 = OooO00o;
        localObject4 = "setFastestInterval";
        localObject5 = new Class[bool1];
        localObject3 = Long.TYPE;
        localObject5[0] = localObject3;
        localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject4, (Class[])localObject5);
        OooO0Oo = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool1);
      }
      localObject1 = OooO0Oo;
      localObject4 = new Object[bool1];
      long l2 = paramLocationRequestCompat.getMinUpdateIntervalMillis();
      localObject5 = Long.valueOf(l2);
      localObject4[0] = localObject5;
      ((Method)localObject1).invoke(paramString, (Object[])localObject4);
      int m = paramLocationRequestCompat.getMaxUpdates();
      i = -1 >>> 1;
      if (m < i)
      {
        localObject1 = OooO0o0;
        if (localObject1 == null)
        {
          localObject1 = OooO00o;
          localObject4 = "setNumUpdates";
          localObject5 = new Class[bool1];
          localObject3 = Integer.TYPE;
          localObject5[0] = localObject3;
          localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject4, (Class[])localObject5);
          OooO0o0 = (Method)localObject1;
          ((AccessibleObject)localObject1).setAccessible(bool1);
        }
        localObject1 = OooO0o0;
        localObject4 = new Object[bool1];
        j = paramLocationRequestCompat.getMaxUpdates();
        localObject5 = Integer.valueOf(j);
        localObject4[0] = localObject5;
        ((Method)localObject1).invoke(paramString, (Object[])localObject4);
      }
      long l3 = paramLocationRequestCompat.getDurationMillis();
      l2 = 9223372036854775807L;
      boolean bool2 = l3 < l2;
      if (bool2)
      {
        localObject1 = OooO0o;
        if (localObject1 == null)
        {
          localObject1 = OooO00o;
          localObject4 = "setExpireIn";
          localObject5 = new Class[bool1];
          localObject3 = Long.TYPE;
          localObject5[0] = localObject3;
          localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject4, (Class[])localObject5);
          OooO0o = (Method)localObject1;
          ((AccessibleObject)localObject1).setAccessible(bool1);
        }
        localObject1 = OooO0o;
        localObject4 = new Object[bool1];
        l2 = paramLocationRequestCompat.getDurationMillis();
        paramLocationRequestCompat = Long.valueOf(l2);
        localObject4[0] = paramLocationRequestCompat;
        ((Method)localObject1).invoke(paramString, (Object[])localObject4);
      }
      return paramString;
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException localNoSuchMethodException) {}
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationRequestCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */