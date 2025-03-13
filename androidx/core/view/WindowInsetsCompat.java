package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;

public class WindowInsetsCompat
{
  public static final WindowInsetsCompat OooO0O0;
  public final WindowInsetsCompat.Impl OooO00o;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    WindowInsetsCompat localWindowInsetsCompat;
    if (i >= j) {
      localWindowInsetsCompat = WindowInsetsCompat.Impl30.OooOOo0;
    } else {
      localWindowInsetsCompat = WindowInsetsCompat.Impl.OooO0O0;
    }
    OooO0O0 = localWindowInsetsCompat;
  }
  
  public WindowInsetsCompat(WindowInsets paramWindowInsets)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    Object localObject;
    if (i >= j)
    {
      localObject = new androidx/core/view/WindowInsetsCompat$Impl30;
      ((WindowInsetsCompat.Impl30)localObject).<init>(this, paramWindowInsets);
    }
    for (;;)
    {
      this.OooO00o = ((WindowInsetsCompat.Impl)localObject);
      break;
      j = 29;
      if (i >= j)
      {
        localObject = new androidx/core/view/WindowInsetsCompat$Impl29;
        ((WindowInsetsCompat.Impl29)localObject).<init>(this, paramWindowInsets);
      }
      else
      {
        localObject = new androidx/core/view/WindowInsetsCompat$Impl28;
        ((WindowInsetsCompat.Impl28)localObject).<init>(this, paramWindowInsets);
      }
    }
  }
  
  public WindowInsetsCompat(WindowInsetsCompat paramWindowInsetsCompat)
  {
    if (paramWindowInsetsCompat != null)
    {
      paramWindowInsetsCompat = paramWindowInsetsCompat.OooO00o;
      int i = Build.VERSION.SDK_INT;
      int j = 30;
      Object localObject1;
      Object localObject2;
      if (i >= j)
      {
        boolean bool2 = paramWindowInsetsCompat instanceof WindowInsetsCompat.Impl30;
        if (bool2)
        {
          localObject1 = new androidx/core/view/WindowInsetsCompat$Impl30;
          localObject2 = paramWindowInsetsCompat;
          localObject2 = (WindowInsetsCompat.Impl30)paramWindowInsetsCompat;
          ((WindowInsetsCompat.Impl30)localObject1).<init>(this, (WindowInsetsCompat.Impl30)localObject2);
        }
      }
      for (;;)
      {
        this.OooO00o = ((WindowInsetsCompat.Impl)localObject1);
        break;
        int k = 29;
        if (i >= k)
        {
          bool1 = paramWindowInsetsCompat instanceof WindowInsetsCompat.Impl29;
          if (bool1)
          {
            localObject1 = new androidx/core/view/WindowInsetsCompat$Impl29;
            localObject2 = paramWindowInsetsCompat;
            localObject2 = (WindowInsetsCompat.Impl29)paramWindowInsetsCompat;
            ((WindowInsetsCompat.Impl29)localObject1).<init>(this, (WindowInsetsCompat.Impl29)localObject2);
            continue;
          }
        }
        boolean bool1 = paramWindowInsetsCompat instanceof WindowInsetsCompat.Impl28;
        if (bool1)
        {
          localObject1 = new androidx/core/view/WindowInsetsCompat$Impl28;
          localObject2 = paramWindowInsetsCompat;
          localObject2 = (WindowInsetsCompat.Impl28)paramWindowInsetsCompat;
          ((WindowInsetsCompat.Impl28)localObject1).<init>(this, (WindowInsetsCompat.Impl28)localObject2);
        }
        else
        {
          bool1 = paramWindowInsetsCompat instanceof WindowInsetsCompat.Impl21;
          if (bool1)
          {
            localObject1 = new androidx/core/view/WindowInsetsCompat$Impl21;
            localObject2 = paramWindowInsetsCompat;
            localObject2 = (WindowInsetsCompat.Impl21)paramWindowInsetsCompat;
            ((WindowInsetsCompat.Impl21)localObject1).<init>(this, (WindowInsetsCompat.Impl21)localObject2);
          }
          else
          {
            bool1 = paramWindowInsetsCompat instanceof WindowInsetsCompat.Impl20;
            if (bool1)
            {
              localObject1 = new androidx/core/view/WindowInsetsCompat$Impl20;
              localObject2 = paramWindowInsetsCompat;
              localObject2 = (WindowInsetsCompat.Impl20)paramWindowInsetsCompat;
              ((WindowInsetsCompat.Impl20)localObject1).<init>(this, (WindowInsetsCompat.Impl20)localObject2);
            }
            else
            {
              localObject1 = new androidx/core/view/WindowInsetsCompat$Impl;
              ((WindowInsetsCompat.Impl)localObject1).<init>(this);
            }
          }
        }
      }
      ((WindowInsetsCompat.Impl)paramWindowInsetsCompat).OooO0o0(this);
    }
    else
    {
      paramWindowInsetsCompat = new androidx/core/view/WindowInsetsCompat$Impl;
      paramWindowInsetsCompat.<init>(this);
      this.OooO00o = paramWindowInsetsCompat;
    }
  }
  
  public static Insets OooO0oO(Insets paramInsets, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInsets.OooO00o - paramInt1;
    i = Math.max(0, i);
    int j = paramInsets.OooO0O0 - paramInt2;
    j = Math.max(0, j);
    int k = paramInsets.OooO0OO - paramInt3;
    k = Math.max(0, k);
    int m = paramInsets.OooO0Oo - paramInt4;
    int n = Math.max(0, m);
    if ((i == paramInt1) && (j == paramInt2) && (k == paramInt3) && (n == paramInt4)) {
      return paramInsets;
    }
    return Insets.OooO0O0(i, j, k, n);
  }
  
  public static WindowInsetsCompat OooOO0(WindowInsets paramWindowInsets)
  {
    return OooOO0O(paramWindowInsets, null);
  }
  
  public static WindowInsetsCompat OooOO0O(WindowInsets paramWindowInsets, View paramView)
  {
    WindowInsetsCompat localWindowInsetsCompat = new androidx/core/view/WindowInsetsCompat;
    paramWindowInsets = (WindowInsets)Preconditions.OooO0oo(paramWindowInsets);
    localWindowInsetsCompat.<init>(paramWindowInsets);
    if (paramView != null)
    {
      boolean bool = ViewCompat.o000oOoO(paramView);
      if (bool)
      {
        paramWindowInsets = ViewCompat.Oooo00o(paramView);
        localWindowInsetsCompat.setRootWindowInsets(paramWindowInsets);
        paramWindowInsets = paramView.getRootView();
        localWindowInsetsCompat.OooO0Oo(paramWindowInsets);
      }
    }
    return localWindowInsetsCompat;
  }
  
  public WindowInsets OooO()
  {
    Object localObject = this.OooO00o;
    boolean bool = localObject instanceof WindowInsetsCompat.Impl20;
    if (bool) {
      localObject = ((WindowInsetsCompat.Impl20)localObject).OooO0OO;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public WindowInsetsCompat OooO00o()
  {
    return this.OooO00o.OooO00o();
  }
  
  public WindowInsetsCompat OooO0O0()
  {
    return this.OooO00o.OooO0O0();
  }
  
  public WindowInsetsCompat OooO0OO()
  {
    return this.OooO00o.OooO0OO();
  }
  
  public void OooO0Oo(View paramView)
  {
    this.OooO00o.OooO0Oo(paramView);
  }
  
  public WindowInsetsCompat OooO0o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.OooO00o.OooO0o(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean OooO0o0()
  {
    Insets localInsets1 = this.OooO00o.getSystemWindowInsets();
    Insets localInsets2 = Insets.OooO0o0;
    return localInsets1.equals(localInsets2) ^ true;
  }
  
  public WindowInsetsCompat OooO0oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    WindowInsetsCompat.Builder localBuilder = new androidx/core/view/WindowInsetsCompat$Builder;
    localBuilder.<init>(this);
    Insets localInsets = Insets.OooO0O0(paramInt1, paramInt2, paramInt3, paramInt4);
    return localBuilder.OooO0Oo(localInsets).OooO00o();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof WindowInsetsCompat;
    if (!bool) {
      return false;
    }
    paramObject = (WindowInsetsCompat)paramObject;
    WindowInsetsCompat.Impl localImpl = this.OooO00o;
    paramObject = paramObject.OooO00o;
    return ObjectsCompat.OooO00o(localImpl, paramObject);
  }
  
  public DisplayCutoutCompat getDisplayCutout()
  {
    return this.OooO00o.getDisplayCutout();
  }
  
  public Insets getInsets(int paramInt)
  {
    return this.OooO00o.getInsets(paramInt);
  }
  
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return this.OooO00o.getInsetsIgnoringVisibility(paramInt);
  }
  
  public Insets getMandatorySystemGestureInsets()
  {
    return this.OooO00o.getMandatorySystemGestureInsets();
  }
  
  public int getStableInsetBottom()
  {
    return this.OooO00o.getStableInsets().OooO0Oo;
  }
  
  public int getStableInsetLeft()
  {
    return this.OooO00o.getStableInsets().OooO00o;
  }
  
  public int getStableInsetRight()
  {
    return this.OooO00o.getStableInsets().OooO0OO;
  }
  
  public int getStableInsetTop()
  {
    return this.OooO00o.getStableInsets().OooO0O0;
  }
  
  public Insets getStableInsets()
  {
    return this.OooO00o.getStableInsets();
  }
  
  public Insets getSystemGestureInsets()
  {
    return this.OooO00o.getSystemGestureInsets();
  }
  
  public int getSystemWindowInsetBottom()
  {
    return this.OooO00o.getSystemWindowInsets().OooO0Oo;
  }
  
  public int getSystemWindowInsetLeft()
  {
    return this.OooO00o.getSystemWindowInsets().OooO00o;
  }
  
  public int getSystemWindowInsetRight()
  {
    return this.OooO00o.getSystemWindowInsets().OooO0OO;
  }
  
  public int getSystemWindowInsetTop()
  {
    return this.OooO00o.getSystemWindowInsets().OooO0O0;
  }
  
  public Insets getSystemWindowInsets()
  {
    return this.OooO00o.getSystemWindowInsets();
  }
  
  public Insets getTappableElementInsets()
  {
    return this.OooO00o.getTappableElementInsets();
  }
  
  public int hashCode()
  {
    WindowInsetsCompat.Impl localImpl = this.OooO00o;
    int i;
    if (localImpl == null)
    {
      i = 0;
      localImpl = null;
    }
    else
    {
      i = localImpl.hashCode();
    }
    return i;
  }
  
  public boolean isConsumed()
  {
    return this.OooO00o.isConsumed();
  }
  
  public boolean isRound()
  {
    return this.OooO00o.isRound();
  }
  
  public boolean isVisible(int paramInt)
  {
    return this.OooO00o.isVisible(paramInt);
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets)
  {
    this.OooO00o.setOverriddenInsets(paramArrayOfInsets);
  }
  
  public void setRootViewData(Insets paramInsets)
  {
    this.OooO00o.setRootViewData(paramInsets);
  }
  
  public void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat)
  {
    this.OooO00o.setRootWindowInsets(paramWindowInsetsCompat);
  }
  
  public void setStableInsets(Insets paramInsets)
  {
    this.OooO00o.setStableInsets(paramInsets);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat
 * JD-Core Version:    0.7.0.1
 */