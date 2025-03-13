package androidx.core.view;

import android.graphics.Rect;
import android.view.View;
import androidx.core.graphics.Insets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class WindowInsetsCompat$Api21ReflectionHolder
{
  public static Field OooO00o;
  public static Field OooO0O0;
  public static Field OooO0OO;
  public static boolean OooO0Oo;
  
  static
  {
    Object localObject1 = View.class;
    Object localObject2 = "mAttachInfo";
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      OooO00o = (Field)localObject1;
      boolean bool = true;
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject1 = "android.view.View$AttachInfo";
      localObject1 = Class.forName((String)localObject1);
      localObject3 = "mStableInsets";
      localObject3 = ((Class)localObject1).getDeclaredField((String)localObject3);
      OooO0O0 = (Field)localObject3;
      ((AccessibleObject)localObject3).setAccessible(bool);
      localObject3 = "mContentInsets";
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject3);
      OooO0OO = (Field)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool);
      OooO0Oo = bool;
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = "Failed to get visible insets from AttachInfo ";
      ((StringBuilder)localObject2).append((String)localObject3);
      String str = localReflectiveOperationException.getMessage();
      ((StringBuilder)localObject2).append(str);
    }
  }
  
  public static WindowInsetsCompat OooO00o(View paramView)
  {
    boolean bool = OooO0Oo;
    if (bool)
    {
      bool = paramView.isAttachedToWindow();
      if (bool)
      {
        Object localObject1 = paramView.getRootView();
        try
        {
          localObject2 = OooO00o;
          localObject1 = ((Field)localObject2).get(localObject1);
          if (localObject1 != null)
          {
            localObject2 = OooO0O0;
            localObject2 = ((Field)localObject2).get(localObject1);
            localObject2 = (Rect)localObject2;
            Object localObject3 = OooO0OO;
            localObject1 = ((Field)localObject3).get(localObject1);
            localObject1 = (Rect)localObject1;
            if ((localObject2 != null) && (localObject1 != null))
            {
              localObject3 = new androidx/core/view/WindowInsetsCompat$Builder;
              ((WindowInsetsCompat.Builder)localObject3).<init>();
              localObject2 = Insets.OooO0OO((Rect)localObject2);
              localObject2 = ((WindowInsetsCompat.Builder)localObject3).OooO0OO((Insets)localObject2);
              localObject1 = Insets.OooO0OO((Rect)localObject1);
              localObject1 = ((WindowInsetsCompat.Builder)localObject2).OooO0Oo((Insets)localObject1);
              localObject1 = ((WindowInsetsCompat.Builder)localObject1).OooO00o();
              ((WindowInsetsCompat)localObject1).setRootWindowInsets((WindowInsetsCompat)localObject1);
              paramView = paramView.getRootView();
              ((WindowInsetsCompat)localObject1).OooO0Oo(paramView);
              return localObject1;
            }
          }
        }
        catch (IllegalAccessException paramView)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = "Failed to get insets from AttachInfo. ";
          ((StringBuilder)localObject1).append((String)localObject2);
          paramView = paramView.getMessage();
          ((StringBuilder)localObject1).append(paramView);
        }
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder
 * JD-Core Version:    0.7.0.1
 */