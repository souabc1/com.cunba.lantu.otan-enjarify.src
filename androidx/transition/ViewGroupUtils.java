package androidx.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtils
{
  public static boolean OooO00o = true;
  public static Method OooO0O0;
  public static boolean OooO0OO;
  
  public static int OooO00o(ViewGroup paramViewGroup, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return OooO0o.OooO00o(paramViewGroup, paramInt);
    }
    boolean bool1 = OooO0OO;
    j = 0;
    Integer localInteger = null;
    int k = 2;
    boolean bool2 = true;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = ViewGroup.class;
      localObject2 = "getChildDrawingOrder";
    }
    try
    {
      Class[] arrayOfClass = new Class[k];
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      arrayOfClass[bool2] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      OooO0O0 = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label93:
      break label93;
    }
    OooO0OO = bool2;
    Object localObject1 = OooO0O0;
    if (localObject1 != null) {
      try
      {
        Object[] arrayOfObject = new Object[k];
        int m = paramViewGroup.getChildCount();
        localObject2 = Integer.valueOf(m);
        arrayOfObject[0] = localObject2;
        localInteger = Integer.valueOf(paramInt);
        arrayOfObject[bool2] = localInteger;
        paramViewGroup = ((Method)localObject1).invoke(paramViewGroup, arrayOfObject);
        paramViewGroup = (Integer)paramViewGroup;
        return paramViewGroup.intValue();
      }
      catch (IllegalAccessException|InvocationTargetException localIllegalAccessException) {}
    }
    return paramInt;
  }
  
  public static ViewGroupOverlayImpl OooO0O0(ViewGroup paramViewGroup)
  {
    ViewGroupOverlayApi18 localViewGroupOverlayApi18 = new androidx/transition/ViewGroupOverlayApi18;
    localViewGroupOverlayApi18.<init>(paramViewGroup);
    return localViewGroupOverlayApi18;
  }
  
  public static void OooO0OO(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    boolean bool = OooO00o;
    if (bool) {
      try
      {
        OooO.OooO00o(paramViewGroup, paramBoolean);
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        paramViewGroup = null;
        OooO00o = false;
      }
    }
  }
  
  public static void OooO0Oo(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      OooO.OooO00o(paramViewGroup, paramBoolean);
    } else {
      OooO0OO(paramViewGroup, paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ViewGroupUtils
 * JD-Core Version:    0.7.0.1
 */