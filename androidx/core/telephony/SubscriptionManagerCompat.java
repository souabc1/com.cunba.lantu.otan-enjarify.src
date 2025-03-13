package androidx.core.telephony;

import android.os.Build.VERSION;
import android.telephony.SubscriptionManager;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SubscriptionManagerCompat
{
  public static Method OooO00o;
  
  public static int getSlotIndex(int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      return i;
    }
    int j = Build.VERSION.SDK_INT;
    int k = 29;
    if (j >= k) {
      return SubscriptionManagerCompat.Api29Impl.getSlotIndex(paramInt);
    }
    try
    {
      Object localObject1 = OooO00o;
      k = 0;
      boolean bool = true;
      if (localObject1 == null)
      {
        localObject1 = SubscriptionManager.class;
        String str = "getSlotIndex";
        Class[] arrayOfClass = new Class[bool];
        Class localClass = Integer.TYPE;
        arrayOfClass[0] = localClass;
        localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
        OooO00o = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool);
      }
      localObject1 = OooO00o;
      Object[] arrayOfObject = new Object[bool];
      Object localObject2 = Integer.valueOf(paramInt);
      arrayOfObject[0] = localObject2;
      paramInt = 0;
      localObject2 = null;
      localObject2 = ((Method)localObject1).invoke(null, arrayOfObject);
      localObject2 = (Integer)localObject2;
      if (localObject2 != null) {
        return ((Integer)localObject2).intValue();
      }
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException) {}
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.telephony.SubscriptionManagerCompat
 * JD-Core Version:    0.7.0.1
 */