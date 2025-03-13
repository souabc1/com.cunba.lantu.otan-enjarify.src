package com.google.android.material.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m54207b69;

class WindowUtils$Api14Impl
{
  public static Rect getCurrentWindowBounds(WindowManager paramWindowManager)
  {
    paramWindowManager = paramWindowManager.getDefaultDisplay();
    Point localPoint = getRealSizeForDisplay(paramWindowManager);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    int i = localPoint.x;
    if (i != 0)
    {
      int j = localPoint.y;
      if (j != 0)
      {
        localRect.right = i;
        localRect.bottom = j;
        return localRect;
      }
    }
    paramWindowManager.getRectSize(localRect);
    return localRect;
  }
  
  private static Point getRealSizeForDisplay(Display paramDisplay)
  {
    Point localPoint1 = new android/graphics/Point;
    localPoint1.<init>();
    Object localObject1 = Display.class;
    Object localObject2 = "-M2A293B222C3127252C4032";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      boolean bool = true;
      Class[] arrayOfClass = new Class[bool];
      Point localPoint2 = Point.class;
      arrayOfClass[0] = localPoint2;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject2 = new Object[] { localPoint1 };
      ((Method)localObject1).invoke(paramDisplay, (Object[])localObject2);
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
    {
      WindowUtils.access$000();
    }
    return localPoint1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.WindowUtils.Api14Impl
 * JD-Core Version:    0.7.0.1
 */