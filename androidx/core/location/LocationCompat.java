package androidx.core.location;

import android.location.Location;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class LocationCompat
{
  public static Method OooO00o;
  
  private static Method getSetIsFromMockProviderMethod()
  {
    Method localMethod = OooO00o;
    if (localMethod == null)
    {
      boolean bool = true;
      Object localObject1 = new Class[bool];
      Object localObject2 = Boolean.TYPE;
      localObject1[0] = localObject2;
      Location localLocation = Location.class;
      localObject2 = "setIsFromMockProvider";
      localObject1 = localLocation.getDeclaredMethod((String)localObject2, (Class[])localObject1);
      OooO00o = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    return OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationCompat
 * JD-Core Version:    0.7.0.1
 */