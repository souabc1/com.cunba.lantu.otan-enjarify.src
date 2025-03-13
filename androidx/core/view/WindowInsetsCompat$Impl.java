package androidx.core.view;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;

class WindowInsetsCompat$Impl
{
  public static final WindowInsetsCompat OooO0O0;
  public final WindowInsetsCompat OooO00o;
  
  static
  {
    WindowInsetsCompat.Builder localBuilder = new androidx/core/view/WindowInsetsCompat$Builder;
    localBuilder.<init>();
    OooO0O0 = localBuilder.OooO00o().OooO00o().OooO0O0().OooO0OO();
  }
  
  public WindowInsetsCompat$Impl(WindowInsetsCompat paramWindowInsetsCompat)
  {
    this.OooO00o = paramWindowInsetsCompat;
  }
  
  public WindowInsetsCompat OooO00o()
  {
    return this.OooO00o;
  }
  
  public WindowInsetsCompat OooO0O0()
  {
    return this.OooO00o;
  }
  
  public WindowInsetsCompat OooO0OO()
  {
    return this.OooO00o;
  }
  
  public void OooO0Oo(View paramView) {}
  
  public WindowInsetsCompat OooO0o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return OooO0O0;
  }
  
  public void OooO0o0(WindowInsetsCompat paramWindowInsetsCompat) {}
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Impl;
    if (!bool2) {
      return false;
    }
    paramObject = (Impl)paramObject;
    bool2 = isRound();
    boolean bool3 = paramObject.isRound();
    if (bool2 == bool3)
    {
      bool2 = isConsumed();
      bool3 = paramObject.isConsumed();
      if (bool2 == bool3)
      {
        Object localObject = getSystemWindowInsets();
        Insets localInsets = paramObject.getSystemWindowInsets();
        bool2 = ObjectsCompat.OooO00o(localObject, localInsets);
        if (bool2)
        {
          localObject = getStableInsets();
          localInsets = paramObject.getStableInsets();
          bool2 = ObjectsCompat.OooO00o(localObject, localInsets);
          if (bool2)
          {
            localObject = getDisplayCutout();
            paramObject = paramObject.getDisplayCutout();
            boolean bool4 = ObjectsCompat.OooO00o(localObject, paramObject);
            if (bool4) {
              return bool1;
            }
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public DisplayCutoutCompat getDisplayCutout()
  {
    return null;
  }
  
  public Insets getInsets(int paramInt)
  {
    return Insets.OooO0o0;
  }
  
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    paramInt &= 0x8;
    if (paramInt == 0) {
      return Insets.OooO0o0;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Unable to query the maximum insets for IME");
    throw localIllegalArgumentException;
  }
  
  public Insets getMandatorySystemGestureInsets()
  {
    return getSystemWindowInsets();
  }
  
  public Insets getStableInsets()
  {
    return Insets.OooO0o0;
  }
  
  public Insets getSystemGestureInsets()
  {
    return getSystemWindowInsets();
  }
  
  public Insets getSystemWindowInsets()
  {
    return Insets.OooO0o0;
  }
  
  public Insets getTappableElementInsets()
  {
    return getSystemWindowInsets();
  }
  
  public int hashCode()
  {
    Boolean localBoolean1 = Boolean.valueOf(isRound());
    Boolean localBoolean2 = Boolean.valueOf(isConsumed());
    Insets localInsets1 = getSystemWindowInsets();
    Insets localInsets2 = getStableInsets();
    DisplayCutoutCompat localDisplayCutoutCompat = getDisplayCutout();
    Object[] tmp37_34 = new Object[5];
    Object[] tmp38_37 = tmp37_34;
    Object[] tmp38_37 = tmp37_34;
    tmp38_37[0] = localBoolean1;
    tmp38_37[1] = localBoolean2;
    Object[] tmp45_38 = tmp38_37;
    Object[] tmp45_38 = tmp38_37;
    tmp45_38[2] = localInsets1;
    tmp45_38[3] = localInsets2;
    tmp45_38[4] = localDisplayCutoutCompat;
    return ObjectsCompat.OooO0O0(tmp45_38);
  }
  
  public boolean isConsumed()
  {
    return false;
  }
  
  public boolean isRound()
  {
    return false;
  }
  
  public boolean isVisible(int paramInt)
  {
    return true;
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets) {}
  
  public void setRootViewData(Insets paramInsets) {}
  
  public void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat) {}
  
  public void setStableInsets(Insets paramInsets) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl
 * JD-Core Version:    0.7.0.1
 */