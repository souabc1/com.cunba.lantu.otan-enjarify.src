package androidx.transition;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CanvasUtils
{
  public static Method OooO00o;
  public static Method OooO0O0;
  public static boolean OooO0OO;
  
  public static void OooO00o(Canvas paramCanvas, boolean paramBoolean)
  {
    Object localObject1 = Canvas.class;
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    boolean bool;
    Object localObject2;
    if (i >= j)
    {
      if (paramBoolean) {
        OooO00o.OooO00o(paramCanvas);
      } else {
        OooO0O0.OooO00o(paramCanvas);
      }
    }
    else
    {
      j = 28;
      if (i == j) {
        break label205;
      }
      bool = OooO0OO;
      j = 0;
      if (!bool)
      {
        bool = true;
        localObject2 = "insertReorderBarrier";
      }
    }
    try
    {
      Class[] arrayOfClass = new Class[0];
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      OooO00o = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(bool);
      localObject2 = "insertInorderBarrier";
      arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      OooO0O0 = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label117:
      Object localObject3;
      break label117;
    }
    OooO0OO = bool;
    if (paramBoolean) {}
    label184:
    try
    {
      try
      {
        localObject1 = OooO00o;
        if (localObject1 != null)
        {
          Object[] arrayOfObject = new Object[0];
          ((Method)localObject1).invoke(paramCanvas, arrayOfObject);
        }
      }
      catch (InvocationTargetException paramCanvas)
      {
        break label184;
      }
      if (paramBoolean) {
        break label204;
      }
      localObject3 = OooO0O0;
      if (localObject3 == null) {
        break label204;
      }
      localObject1 = new Object[0];
      ((Method)localObject3).invoke(paramCanvas, (Object[])localObject1);
    }
    catch (IllegalAccessException localIllegalAccessException) {}
    localObject3 = new java/lang/RuntimeException;
    paramCanvas = paramCanvas.getCause();
    ((RuntimeException)localObject3).<init>(paramCanvas);
    throw ((Throwable)localObject3);
    label204:
    return;
    label205:
    paramCanvas = new java/lang/IllegalStateException;
    paramCanvas.<init>("This method doesn't work on Pie!");
    throw paramCanvas;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.CanvasUtils
 * JD-Core Version:    0.7.0.1
 */