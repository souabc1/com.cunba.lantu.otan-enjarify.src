package androidx.core.content.res;

import android.content.res.Resources.Theme;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ResourcesCompat$ThemeCompat$Api23Impl
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
  
  public static void OooO00o(Resources.Theme paramTheme)
  {
    synchronized (OooO00o)
    {
      boolean bool = OooO0OO;
      Object[] arrayOfObject = null;
      Object localObject2;
      String str;
      if (!bool)
      {
        bool = true;
        localObject2 = Resources.Theme.class;
        str = "rebase";
      }
      try
      {
        Class[] arrayOfClass = new Class[0];
        localObject2 = ((Class)localObject2).getDeclaredMethod(str, arrayOfClass);
        OooO0O0 = (Method)localObject2;
        ((AccessibleObject)localObject2).setAccessible(bool);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        label54:
        Method localMethod;
        break label54;
      }
      OooO0OO = bool;
      localMethod = OooO0O0;
      if (localMethod != null) {
        try
        {
          arrayOfObject = new Object[0];
          localMethod.invoke(paramTheme, arrayOfObject);
        }
        catch (IllegalAccessException|InvocationTargetException localIllegalAccessException)
        {
          paramTheme = null;
          OooO0O0 = null;
        }
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */