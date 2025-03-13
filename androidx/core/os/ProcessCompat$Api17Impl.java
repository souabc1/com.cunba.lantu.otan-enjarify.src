package androidx.core.os;

import android.os.UserHandle;
import java.lang.reflect.Method;

class ProcessCompat$Api17Impl
{
  public static final Object OooO00o;
  public static Method OooO0O0;
  public static boolean OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
  }
  
  public static boolean isApplicationUid(int paramInt)
  {
    bool1 = true;
    try
    {
      synchronized (OooO00o)
      {
        boolean bool2 = OooO0OO;
        Object localObject2;
        if (!bool2)
        {
          OooO0OO = bool1;
          localObject2 = UserHandle.class;
          String str = "isApp";
          Class[] arrayOfClass = new Class[bool1];
          Class localClass = Integer.TYPE;
          arrayOfClass[0] = localClass;
          localObject2 = ((Class)localObject2).getDeclaredMethod(str, arrayOfClass);
          OooO0O0 = (Method)localObject2;
        }
        ??? = OooO0O0;
        if (??? != null)
        {
          localObject2 = new Object[bool1];
          Object localObject3 = Integer.valueOf(paramInt);
          localObject2[0] = localObject3;
          paramInt = 0;
          localObject3 = null;
          localObject3 = ((Method)???).invoke(null, (Object[])localObject2);
          localObject3 = (Boolean)localObject3;
          if (localObject3 != null) {
            return ((Boolean)localObject3).booleanValue();
          }
          localObject3 = new java/lang/NullPointerException;
          ((NullPointerException)localObject3).<init>();
          throw ((Throwable)localObject3);
        }
      }
      return bool1;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.ProcessCompat.Api17Impl
 * JD-Core Version:    0.7.0.1
 */