package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewUtils
{
  public static Method OooO00o;
  public static final boolean OooO0O0;
  
  static
  {
    Object localObject = Rect.class;
    boolean bool1 = true;
    OooO0O0 = bool1;
    View localView = View.class;
    String str = "computeFitSystemWindows";
    int i = 2;
    try
    {
      Class[] arrayOfClass = new Class[i];
      arrayOfClass[0] = localObject;
      arrayOfClass[bool1] = localObject;
      localObject = localView.getDeclaredMethod(str, arrayOfClass);
      OooO00o = (Method)localObject;
      boolean bool2 = ((AccessibleObject)localObject).isAccessible();
      if (!bool2)
      {
        localObject = OooO00o;
        ((AccessibleObject)localObject).setAccessible(bool1);
      }
      label67:
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label67;
    }
  }
  
  public static void OooO00o(View paramView, Rect paramRect1, Rect paramRect2)
  {
    Method localMethod = OooO00o;
    if (localMethod != null) {}
    try
    {
      paramRect1 = new Object[] { paramRect1, paramRect2 };
      localMethod.invoke(paramView, paramRect1);
      label28:
      return;
    }
    catch (Exception localException)
    {
      break label28;
    }
  }
  
  public static boolean OooO0O0(View paramView)
  {
    int i = ViewCompat.OooOoOO(paramView);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static void OooO0OO(View paramView)
  {
    try
    {
      Object localObject1 = paramView.getClass();
      Object localObject2 = "makeOptionalFitsSystemWindows";
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      boolean bool = ((AccessibleObject)localObject1).isAccessible();
      if (!bool)
      {
        bool = true;
        ((AccessibleObject)localObject1).setAccessible(bool);
      }
      localObject2 = new Object[0];
      ((Method)localObject1).invoke(paramView, (Object[])localObject2);
      label52:
      return;
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException localNoSuchMethodException)
    {
      break label52;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ViewUtils
 * JD-Core Version:    0.7.0.1
 */