package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class WindowInsetsCompat$BuilderImpl20
  extends WindowInsetsCompat.BuilderImpl
{
  public static boolean OooO0o = false;
  public static Field OooO0o0;
  public static Constructor OooO0oO;
  public static boolean OooO0oo = false;
  public WindowInsets OooO0OO;
  public Insets OooO0Oo;
  
  public WindowInsetsCompat$BuilderImpl20()
  {
    WindowInsets localWindowInsets = OooO0OO();
    this.OooO0OO = localWindowInsets;
  }
  
  public WindowInsetsCompat$BuilderImpl20(WindowInsetsCompat paramWindowInsetsCompat)
  {
    super(paramWindowInsetsCompat);
    paramWindowInsetsCompat = paramWindowInsetsCompat.OooO();
    this.OooO0OO = paramWindowInsetsCompat;
  }
  
  private static WindowInsets OooO0OO()
  {
    boolean bool1 = OooO0o;
    Object localObject1 = WindowInsets.class;
    boolean bool2 = true;
    if (!bool1) {
      localObject2 = "CONSUMED";
    }
    try
    {
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      OooO0o0 = (Field)localObject2;
    }
    catch (ReflectiveOperationException localReflectiveOperationException3)
    {
      label26:
      WindowInsets localWindowInsets;
      break label26;
    }
    OooO0o = bool2;
    Object localObject2 = OooO0o0;
    if (localObject2 != null) {
      try
      {
        localObject2 = ((Field)localObject2).get(null);
        localObject2 = (WindowInsets)localObject2;
        if (localObject2 != null)
        {
          localWindowInsets = new android/view/WindowInsets;
          localWindowInsets.<init>((WindowInsets)localObject2);
          return localWindowInsets;
        }
      }
      catch (ReflectiveOperationException localReflectiveOperationException1) {}
    }
    bool1 = OooO0oo;
    localWindowInsets = null;
    if (!bool1) {}
    try
    {
      localObject2 = new Class[bool2];
      Rect localRect1 = Rect.class;
      localObject2[0] = localRect1;
      localObject2 = ((Class)localObject1).getConstructor((Class[])localObject2);
      OooO0oO = (Constructor)localObject2;
    }
    catch (ReflectiveOperationException localReflectiveOperationException4)
    {
      label103:
      break label103;
    }
    OooO0oo = bool2;
    localObject2 = OooO0oO;
    if (localObject2 != null) {
      try
      {
        localObject1 = new Object[bool2];
        Rect localRect2 = new android/graphics/Rect;
        localRect2.<init>();
        localObject1[0] = localRect2;
        localObject2 = ((Constructor)localObject2).newInstance((Object[])localObject1);
        return (WindowInsets)localObject2;
      }
      catch (ReflectiveOperationException localReflectiveOperationException2) {}
    }
    return null;
  }
  
  public WindowInsetsCompat OooO0O0()
  {
    OooO00o();
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.OooOO0(this.OooO0OO);
    Object localObject = this.OooO0O0;
    localWindowInsetsCompat.setOverriddenInsets((Insets[])localObject);
    localObject = this.OooO0Oo;
    localWindowInsetsCompat.setStableInsets((Insets)localObject);
    return localWindowInsetsCompat;
  }
  
  public void setStableInsets(Insets paramInsets)
  {
    this.OooO0Oo = paramInsets;
  }
  
  public void setSystemWindowInsets(Insets paramInsets)
  {
    WindowInsets localWindowInsets = this.OooO0OO;
    if (localWindowInsets != null)
    {
      int i = paramInsets.OooO00o;
      int j = paramInsets.OooO0O0;
      int k = paramInsets.OooO0OO;
      int m = paramInsets.OooO0Oo;
      paramInsets = localWindowInsets.replaceSystemWindowInsets(i, j, k, m);
      this.OooO0OO = paramInsets;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl20
 * JD-Core Version:    0.7.0.1
 */