package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

class WindowInsetsCompat$Impl20
  extends WindowInsetsCompat.Impl
{
  public static Method OooO;
  public static boolean OooO0oo = false;
  public static Class OooOO0;
  public static Field OooOO0O;
  public static Field OooOO0o;
  public final WindowInsets OooO0OO;
  public Insets[] OooO0Oo;
  public WindowInsetsCompat OooO0o;
  public Insets OooO0o0 = null;
  public Insets OooO0oO;
  
  public WindowInsetsCompat$Impl20(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat);
    this.OooO0OO = paramWindowInsets;
  }
  
  public WindowInsetsCompat$Impl20(WindowInsetsCompat paramWindowInsetsCompat, Impl20 paramImpl20)
  {
    this(paramWindowInsetsCompat, localWindowInsets);
  }
  
  private Insets OooO(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i < j)
    {
      boolean bool = OooO0oo;
      if (!bool) {
        OooOO0();
      }
      Object localObject1 = OooO;
      j = 0;
      Insets localInsets = null;
      if (localObject1 != null)
      {
        Object localObject2 = OooOO0;
        if (localObject2 != null)
        {
          localObject2 = OooOO0O;
          if (localObject2 != null)
          {
            localObject2 = null;
            try
            {
              localObject2 = new Object[0];
              paramView = ((Method)localObject1).invoke(paramView, (Object[])localObject2);
              if (paramView == null) {
                return null;
              }
              localObject1 = OooOO0o;
              paramView = ((Field)localObject1).get(paramView);
              localObject1 = OooOO0O;
              paramView = ((Field)localObject1).get(paramView);
              paramView = (Rect)paramView;
              if (paramView != null) {
                localInsets = Insets.OooO0OO(paramView);
              }
              return localInsets;
            }
            catch (ReflectiveOperationException paramView)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject2 = "Failed to get visible insets. (Reflection error). ";
              ((StringBuilder)localObject1).append((String)localObject2);
              paramView = paramView.getMessage();
              ((StringBuilder)localObject1).append(paramView);
            }
          }
        }
      }
      return null;
    }
    paramView = new java/lang/UnsupportedOperationException;
    paramView.<init>("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    throw paramView;
  }
  
  private Insets OooO0oO(int paramInt, boolean paramBoolean)
  {
    Insets localInsets1 = Insets.OooO0o0;
    int i = 1;
    for (;;)
    {
      int j = 256;
      if (i > j) {
        break;
      }
      j = paramInt & i;
      if (j != 0)
      {
        Insets localInsets2 = OooO0oo(i, paramBoolean);
        localInsets1 = Insets.OooO00o(localInsets1, localInsets2);
      }
      i <<= 1;
    }
    return localInsets1;
  }
  
  private static void OooOO0()
  {
    boolean bool = true;
    Object localObject1 = View.class;
    Object localObject2 = "getViewRootImpl";
    Object localObject3 = null;
    try
    {
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      OooO = (Method)localObject1;
      localObject1 = "android.view.View$AttachInfo";
      localObject1 = Class.forName((String)localObject1);
      OooOO0 = (Class)localObject1;
      localObject2 = "mVisibleInsets";
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      OooOO0O = (Field)localObject1;
      localObject1 = "android.view.ViewRootImpl";
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "mAttachInfo";
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      OooOO0o = (Field)localObject1;
      localObject1 = OooOO0O;
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject1 = OooOO0o;
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Failed to get visible insets. (Reflection error). ";
      ((StringBuilder)localObject2).append((String)localObject3);
      String str = localReflectiveOperationException.getMessage();
      ((StringBuilder)localObject2).append(str);
    }
    OooO0oo = bool;
  }
  
  private Insets getRootStableInsets()
  {
    WindowInsetsCompat localWindowInsetsCompat = this.OooO0o;
    if (localWindowInsetsCompat != null) {
      return localWindowInsetsCompat.getStableInsets();
    }
    return Insets.OooO0o0;
  }
  
  public void OooO0Oo(View paramView)
  {
    paramView = OooO(paramView);
    if (paramView == null) {
      paramView = Insets.OooO0o0;
    }
    setRootViewData(paramView);
  }
  
  public WindowInsetsCompat OooO0o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    WindowInsetsCompat.Builder localBuilder = new androidx/core/view/WindowInsetsCompat$Builder;
    Object localObject = WindowInsetsCompat.OooOO0(this.OooO0OO);
    localBuilder.<init>((WindowInsetsCompat)localObject);
    localObject = WindowInsetsCompat.OooO0oO(getSystemWindowInsets(), paramInt1, paramInt2, paramInt3, paramInt4);
    localBuilder.OooO0Oo((Insets)localObject);
    Insets localInsets = WindowInsetsCompat.OooO0oO(getStableInsets(), paramInt1, paramInt2, paramInt3, paramInt4);
    localBuilder.OooO0OO(localInsets);
    return localBuilder.OooO00o();
  }
  
  public void OooO0o0(WindowInsetsCompat paramWindowInsetsCompat)
  {
    Object localObject = this.OooO0o;
    paramWindowInsetsCompat.setRootWindowInsets((WindowInsetsCompat)localObject);
    localObject = this.OooO0oO;
    paramWindowInsetsCompat.setRootViewData((Insets)localObject);
  }
  
  public Insets OooO0oo(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    if (paramInt != i)
    {
      i = 2;
      int k = 0;
      Insets localInsets1 = null;
      if (paramInt != i)
      {
        paramBoolean = true;
        if (paramInt != paramBoolean)
        {
          paramBoolean = true;
          if (paramInt != paramBoolean)
          {
            paramBoolean = true;
            if (paramInt != paramBoolean)
            {
              paramBoolean = true;
              if (paramInt != paramBoolean)
              {
                paramBoolean = true;
                if (paramInt != paramBoolean) {
                  return Insets.OooO0o0;
                }
                localObject1 = this.OooO0o;
                if (localObject1 != null) {
                  localObject1 = ((WindowInsetsCompat)localObject1).getDisplayCutout();
                } else {
                  localObject1 = getDisplayCutout();
                }
                if (localObject1 != null)
                {
                  paramBoolean = ((DisplayCutoutCompat)localObject1).getSafeInsetLeft();
                  i = ((DisplayCutoutCompat)localObject1).getSafeInsetTop();
                  j = ((DisplayCutoutCompat)localObject1).getSafeInsetRight();
                  paramInt = ((DisplayCutoutCompat)localObject1).getSafeInsetBottom();
                  return Insets.OooO0O0(paramBoolean, i, j, paramInt);
                }
                return Insets.OooO0o0;
              }
              return getTappableElementInsets();
            }
            return getMandatorySystemGestureInsets();
          }
          return getSystemGestureInsets();
        }
        localObject1 = this.OooO0Oo;
        if (localObject1 != null)
        {
          paramBoolean = WindowInsetsCompat.Type.OooO0O0(paramBoolean);
          localInsets1 = localObject1[paramBoolean];
        }
        if (localInsets1 != null) {
          return localInsets1;
        }
        localObject1 = getSystemWindowInsets();
        localObject2 = getRootStableInsets();
        paramInt = ((Insets)localObject1).OooO0Oo;
        i = ((Insets)localObject2).OooO0Oo;
        if (paramInt > i) {
          return Insets.OooO0O0(0, 0, 0, paramInt);
        }
        localObject1 = this.OooO0oO;
        if (localObject1 != null)
        {
          Insets localInsets2 = Insets.OooO0o0;
          paramInt = ((Insets)localObject1).equals(localInsets2);
          if (paramInt == 0)
          {
            localObject1 = this.OooO0oO;
            paramInt = ((Insets)localObject1).OooO0Oo;
            paramBoolean = ((Insets)localObject2).OooO0Oo;
            if (paramInt > paramBoolean) {
              return Insets.OooO0O0(0, 0, 0, paramInt);
            }
          }
        }
        return Insets.OooO0o0;
      }
      if (paramBoolean)
      {
        localObject1 = getRootStableInsets();
        localObject2 = getStableInsets();
        i = ((Insets)localObject1).OooO00o;
        k = ((Insets)localObject2).OooO00o;
        i = Math.max(i, k);
        k = ((Insets)localObject1).OooO0OO;
        int m = ((Insets)localObject2).OooO0OO;
        k = Math.max(k, m);
        paramInt = ((Insets)localObject1).OooO0Oo;
        paramBoolean = ((Insets)localObject2).OooO0Oo;
        paramInt = Math.max(paramInt, paramBoolean);
        return Insets.OooO0O0(i, 0, k, paramInt);
      }
      Object localObject1 = getSystemWindowInsets();
      Object localObject2 = this.OooO0o;
      if (localObject2 != null) {
        localInsets1 = ((WindowInsetsCompat)localObject2).getStableInsets();
      }
      paramBoolean = ((Insets)localObject1).OooO0Oo;
      if (localInsets1 != null)
      {
        i = localInsets1.OooO0Oo;
        paramBoolean = Math.min(paramBoolean, i);
      }
      i = ((Insets)localObject1).OooO00o;
      paramInt = ((Insets)localObject1).OooO0OO;
      return Insets.OooO0O0(i, 0, paramInt, paramBoolean);
    }
    if (paramBoolean)
    {
      paramInt = getRootStableInsets().OooO0O0;
      paramBoolean = getSystemWindowInsets().OooO0O0;
      paramInt = Math.max(paramInt, paramBoolean);
      return Insets.OooO0O0(0, paramInt, 0, 0);
    }
    paramInt = getSystemWindowInsets().OooO0O0;
    return Insets.OooO0O0(0, paramInt, 0, 0);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = super.equals(paramObject);
    if (!bool) {
      return false;
    }
    paramObject = (Impl20)paramObject;
    Insets localInsets = this.OooO0oO;
    paramObject = paramObject.OooO0oO;
    return Objects.equals(localInsets, paramObject);
  }
  
  public Insets getInsets(int paramInt)
  {
    return OooO0oO(paramInt, false);
  }
  
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return OooO0oO(paramInt, true);
  }
  
  public final Insets getSystemWindowInsets()
  {
    Insets localInsets = this.OooO0o0;
    if (localInsets == null)
    {
      int i = this.OooO0OO.getSystemWindowInsetLeft();
      WindowInsets localWindowInsets1 = this.OooO0OO;
      int j = localWindowInsets1.getSystemWindowInsetTop();
      WindowInsets localWindowInsets2 = this.OooO0OO;
      int k = localWindowInsets2.getSystemWindowInsetRight();
      WindowInsets localWindowInsets3 = this.OooO0OO;
      int m = localWindowInsets3.getSystemWindowInsetBottom();
      localInsets = Insets.OooO0O0(i, j, k, m);
      this.OooO0o0 = localInsets;
    }
    return this.OooO0o0;
  }
  
  public boolean isRound()
  {
    return this.OooO0OO.isRound();
  }
  
  public boolean isTypeVisible(int paramInt)
  {
    Insets localInsets1 = null;
    int i = 1;
    if (paramInt != i)
    {
      int j = 2;
      if (paramInt != j)
      {
        j = 4;
        if (paramInt != j)
        {
          j = 8;
          if (paramInt != j)
          {
            j = 128;
            if (paramInt != j) {
              return i;
            }
          }
        }
        else
        {
          return false;
        }
      }
    }
    Insets localInsets2 = OooO0oo(paramInt, false);
    localInsets1 = Insets.OooO0o0;
    return localInsets2.equals(localInsets1) ^ i;
  }
  
  public boolean isVisible(int paramInt)
  {
    int i = 1;
    int j = i;
    for (;;)
    {
      int k = 256;
      if (j > k) {
        break;
      }
      k = paramInt & j;
      if (k != 0)
      {
        boolean bool = isTypeVisible(j);
        if (!bool) {
          return false;
        }
      }
      j <<= 1;
    }
    return i;
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets)
  {
    this.OooO0Oo = paramArrayOfInsets;
  }
  
  public void setRootViewData(Insets paramInsets)
  {
    this.OooO0oO = paramInsets;
  }
  
  public void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat)
  {
    this.OooO0o = paramWindowInsetsCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl20
 * JD-Core Version:    0.7.0.1
 */