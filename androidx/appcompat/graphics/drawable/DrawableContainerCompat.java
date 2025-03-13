package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableContainerCompat
  extends Drawable
  implements Drawable.Callback
{
  public DrawableContainerCompat.DrawableContainerState o00OoOoo;
  public Drawable o00Ooo0;
  public Rect o00Ooo00;
  public Drawable o00Ooo0O;
  public int o00Ooo0o = 255;
  public int o00OooO = -1;
  public boolean o00OooO0;
  public boolean o00OooOO;
  public Runnable o00OooOo;
  public long o00OoooO;
  public DrawableContainerCompat.BlockInvalidateCallback o00Ooooo;
  public long o0O00o0;
  
  public static int OooO0o0(Resources paramResources, int paramInt)
  {
    if (paramResources != null)
    {
      paramResources = paramResources.getDisplayMetrics();
      paramInt = paramResources.densityDpi;
    }
    if (paramInt == 0) {
      paramInt = 160;
    }
    return paramInt;
  }
  
  public void OooO00o(boolean paramBoolean)
  {
    int i = 1;
    float f1 = 1.4E-45F;
    this.o00OooO0 = i;
    long l1 = SystemClock.uptimeMillis();
    Drawable localDrawable1 = this.o00Ooo0;
    long l2 = 255L;
    long l3 = 0L;
    if (localDrawable1 != null)
    {
      long l4 = this.o0O00o0;
      boolean bool1 = l4 < l3;
      if (!bool1) {
        break label162;
      }
      bool1 = l4 < l1;
      int j;
      if (!bool1)
      {
        j = this.o00Ooo0o;
        localDrawable1.setAlpha(j);
      }
      else
      {
        l4 = (l4 - l1) * l2;
        j = (int)l4;
        DrawableContainerCompat.DrawableContainerState localDrawableContainerState1 = this.o00OoOoo;
        int k = localDrawableContainerState1.OooOoOO;
        j /= k;
        j = 255 - j;
        k = this.o00Ooo0o;
        j = j * k / 255;
        localDrawable1.setAlpha(j);
        m = i;
        f2 = f1;
        break label171;
      }
    }
    this.o0O00o0 = l3;
    label162:
    int m = 0;
    localDrawable1 = null;
    float f2 = 0.0F;
    label171:
    Drawable localDrawable2 = this.o00Ooo0O;
    if (localDrawable2 != null)
    {
      long l5 = this.o00OoooO;
      boolean bool2 = l5 < l3;
      if (!bool2) {
        break label300;
      }
      bool2 = l5 < l1;
      if (!bool2)
      {
        localDrawable2.setVisible(false, false);
        i = 0;
        f1 = 0.0F;
        this.o00Ooo0O = null;
      }
      else
      {
        l5 = (l5 - l1) * l2;
        m = (int)l5;
        DrawableContainerCompat.DrawableContainerState localDrawableContainerState2 = this.o00OoOoo;
        int n = localDrawableContainerState2.OooOoo0;
        m /= n;
        n = this.o00Ooo0o;
        m = m * n / 255;
        localDrawable2.setAlpha(m);
        break label306;
      }
    }
    this.o00OoooO = l3;
    label300:
    i = m;
    f1 = f2;
    label306:
    if ((paramBoolean) && (i != 0))
    {
      Runnable localRunnable = this.o00OooOo;
      long l6 = 16;
      l1 += l6;
      scheduleSelf(localRunnable, l1);
    }
  }
  
  public DrawableContainerCompat.DrawableContainerState OooO0O0()
  {
    return this.o00OoOoo;
  }
  
  public final void OooO0OO(Drawable paramDrawable)
  {
    Object localObject1 = this.o00Ooooo;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/graphics/drawable/DrawableContainerCompat$BlockInvalidateCallback;
      ((DrawableContainerCompat.BlockInvalidateCallback)localObject1).<init>();
      this.o00Ooooo = ((DrawableContainerCompat.BlockInvalidateCallback)localObject1);
    }
    localObject1 = this.o00Ooooo;
    Drawable.Callback localCallback = paramDrawable.getCallback();
    localObject1 = ((DrawableContainerCompat.BlockInvalidateCallback)localObject1).OooO0O0(localCallback);
    paramDrawable.setCallback((Drawable.Callback)localObject1);
    try
    {
      localObject1 = this.o00OoOoo;
      int i = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOoOO;
      if (i <= 0)
      {
        boolean bool1 = this.o00OooO0;
        if (bool1)
        {
          int j = this.o00Ooo0o;
          paramDrawable.setAlpha(j);
        }
      }
      localObject1 = this.o00OoOoo;
      boolean bool4 = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOooo;
      if (bool4)
      {
        localObject1 = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOooO;
        paramDrawable.setColorFilter((ColorFilter)localObject1);
      }
      else
      {
        bool4 = ((DrawableContainerCompat.DrawableContainerState)localObject1).Oooo00o;
        if (bool4)
        {
          localObject1 = ((DrawableContainerCompat.DrawableContainerState)localObject1).Oooo000;
          DrawableCompat.OooOOOO(paramDrawable, (ColorStateList)localObject1);
        }
        localObject1 = this.o00OoOoo;
        bool4 = ((DrawableContainerCompat.DrawableContainerState)localObject1).Oooo0;
        if (bool4)
        {
          localObject1 = ((DrawableContainerCompat.DrawableContainerState)localObject1).Oooo00O;
          DrawableCompat.OooOOOo(paramDrawable, (PorterDuff.Mode)localObject1);
        }
      }
      boolean bool2 = isVisible();
      bool4 = true;
      paramDrawable.setVisible(bool2, bool4);
      localObject1 = this.o00OoOoo;
      bool2 = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOo;
      paramDrawable.setDither(bool2);
      localObject1 = getState();
      paramDrawable.setState((int[])localObject1);
      int k = getLevel();
      paramDrawable.setLevel(k);
      localObject1 = getBounds();
      paramDrawable.setBounds((Rect)localObject1);
      k = DrawableCompat.OooO0o(this);
      DrawableCompat.OooOOO0(paramDrawable, k);
      localObject1 = this.o00OoOoo;
      boolean bool3 = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOoo;
      DrawableCompat.OooOO0(paramDrawable, bool3);
      localObject1 = this.o00Ooo00;
      if (localObject1 != null)
      {
        int n = ((Rect)localObject1).left;
        int i1 = ((Rect)localObject1).top;
        int i2 = ((Rect)localObject1).right;
        int m = ((Rect)localObject1).bottom;
        DrawableCompat.OooOO0o(paramDrawable, n, i1, i2, m);
      }
      localObject1 = this.o00Ooooo.OooO00o();
      paramDrawable.setCallback((Drawable.Callback)localObject1);
      return;
    }
    finally
    {
      localCallback = this.o00Ooooo.OooO00o();
      paramDrawable.setCallback(localCallback);
    }
  }
  
  public final boolean OooO0Oo()
  {
    boolean bool = isAutoMirrored();
    int j;
    if (bool)
    {
      int i = DrawableCompat.OooO0o(this);
      j = 1;
      if (i == j) {}
    }
    else
    {
      j = 0;
    }
    return j;
  }
  
  public boolean OooO0o(int paramInt)
  {
    int i = this.o00OooO;
    int j = 0;
    if (paramInt == i) {
      return false;
    }
    long l1 = SystemClock.uptimeMillis();
    Object localObject1 = this.o00OoOoo;
    i = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOoo0;
    long l2 = 0L;
    if (i > 0)
    {
      localObject1 = this.o00Ooo0O;
      if (localObject1 != null) {
        ((Drawable)localObject1).setVisible(false, false);
      }
      localObject1 = this.o00Ooo0;
      if (localObject1 != null)
      {
        this.o00Ooo0O = ((Drawable)localObject1);
        localObject1 = this.o00OoOoo;
        i = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooOoo0;
        l3 = i + l1;
        this.o00OoooO = l3;
      }
      else
      {
        this.o00Ooo0O = null;
        this.o00OoooO = l2;
      }
    }
    else
    {
      localObject1 = this.o00Ooo0;
      if (localObject1 != null) {
        ((Drawable)localObject1).setVisible(false, false);
      }
    }
    Object localObject2;
    if (paramInt >= 0)
    {
      localObject1 = this.o00OoOoo;
      j = ((DrawableContainerCompat.DrawableContainerState)localObject1).OooO0oo;
      if (paramInt < j)
      {
        localObject1 = ((DrawableContainerCompat.DrawableContainerState)localObject1).getChild(paramInt);
        this.o00Ooo0 = ((Drawable)localObject1);
        this.o00OooO = paramInt;
        if (localObject1 == null) {
          break label234;
        }
        localObject2 = this.o00OoOoo;
        paramInt = ((DrawableContainerCompat.DrawableContainerState)localObject2).OooOoOO;
        if (paramInt > 0)
        {
          long l4 = paramInt;
          l1 += l4;
          this.o0O00o0 = l1;
        }
        OooO0OO((Drawable)localObject1);
        break label234;
      }
    }
    this.o00Ooo0 = null;
    paramInt = -1;
    this.o00OooO = paramInt;
    label234:
    long l3 = this.o0O00o0;
    paramInt = l3 < l2;
    i = 1;
    if (paramInt == 0)
    {
      long l5 = this.o00OoooO;
      paramInt = l5 < l2;
      if (paramInt == 0) {}
    }
    else
    {
      localObject2 = this.o00OooOo;
      if (localObject2 == null)
      {
        localObject2 = new androidx/appcompat/graphics/drawable/DrawableContainerCompat$1;
        ((DrawableContainerCompat.1)localObject2).<init>(this);
        this.o00OooOo = ((Runnable)localObject2);
      }
      else
      {
        unscheduleSelf((Runnable)localObject2);
      }
      OooO00o(i);
    }
    invalidateSelf();
    return i;
  }
  
  public final void OooO0oO(Resources paramResources)
  {
    this.o00OoOoo.OooOO0O(paramResources);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    this.o00OoOoo.OooO0O0(paramTheme);
  }
  
  public boolean canApplyTheme()
  {
    return this.o00OoOoo.canApplyTheme();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = this.o00Ooo0O;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
  }
  
  public int getAlpha()
  {
    return this.o00Ooo0o;
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    int j = this.o00OoOoo.getChangingConfigurations();
    return i | j;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    DrawableContainerCompat.DrawableContainerState localDrawableContainerState = this.o00OoOoo;
    boolean bool = localDrawableContainerState.OooO0OO();
    if (bool)
    {
      localDrawableContainerState = this.o00OoOoo;
      int i = getChangingConfigurations();
      localDrawableContainerState.OooO0Oo = i;
      return this.o00OoOoo;
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return this.o00Ooo0;
  }
  
  int getCurrentIndex()
  {
    return this.o00OooO;
  }
  
  public void getHotspotBounds(Rect paramRect)
  {
    Rect localRect = this.o00Ooo00;
    if (localRect != null) {
      paramRect.set(localRect);
    } else {
      super.getHotspotBounds(paramRect);
    }
  }
  
  public int getIntrinsicHeight()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).isConstantSize();
    if (bool) {
      return this.o00OoOoo.getConstantHeight();
    }
    localObject = this.o00Ooo0;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getIntrinsicHeight();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getIntrinsicWidth()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).isConstantSize();
    if (bool) {
      return this.o00OoOoo.getConstantWidth();
    }
    localObject = this.o00Ooo0;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getIntrinsicWidth();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getMinimumHeight()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).isConstantSize();
    if (bool) {
      return this.o00OoOoo.getConstantMinimumHeight();
    }
    localObject = this.o00Ooo0;
    int i;
    if (localObject != null)
    {
      i = ((Drawable)localObject).getMinimumHeight();
    }
    else
    {
      i = 0;
      localObject = null;
    }
    return i;
  }
  
  public int getMinimumWidth()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).isConstantSize();
    if (bool) {
      return this.o00OoOoo.getConstantMinimumWidth();
    }
    localObject = this.o00Ooo0;
    int i;
    if (localObject != null)
    {
      i = ((Drawable)localObject).getMinimumWidth();
    }
    else
    {
      i = 0;
      localObject = null;
    }
    return i;
  }
  
  public int getOpacity()
  {
    Object localObject = this.o00Ooo0;
    if (localObject != null)
    {
      boolean bool = ((Drawable)localObject).isVisible();
      if (bool)
      {
        localObject = this.o00OoOoo;
        return ((DrawableContainerCompat.DrawableContainerState)localObject).getOpacity();
      }
    }
    int i = -2;
    return i;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Drawable localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      DrawableContainerCompat.Api21Impl.OooO0O0(localDrawable, paramOutline);
    }
  }
  
  public boolean getPadding(Rect paramRect)
  {
    Object localObject = this.o00OoOoo.getConstantPadding();
    int k;
    boolean bool2;
    if (localObject != null)
    {
      paramRect.set((Rect)localObject);
      int i = ((Rect)localObject).left;
      k = ((Rect)localObject).top;
      i |= k;
      k = ((Rect)localObject).bottom;
      i |= k;
      int m = ((Rect)localObject).right | i;
      if (m != 0)
      {
        m = 1;
      }
      else
      {
        m = 0;
        localObject = null;
      }
    }
    else
    {
      localObject = this.o00Ooo0;
      if (localObject != null) {
        bool2 = ((Drawable)localObject).getPadding(paramRect);
      } else {
        bool2 = super.getPadding(paramRect);
      }
    }
    boolean bool1 = OooO0Oo();
    if (bool1)
    {
      int j = paramRect.left;
      k = paramRect.right;
      paramRect.left = k;
      paramRect.right = j;
    }
    return bool2;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      ((DrawableContainerCompat.DrawableContainerState)localObject).OooO0oO();
    }
    localObject = this.o00Ooo0;
    if (paramDrawable == localObject)
    {
      paramDrawable = getCallback();
      if (paramDrawable != null)
      {
        paramDrawable = getCallback();
        paramDrawable.invalidateDrawable(this);
      }
    }
  }
  
  public boolean isAutoMirrored()
  {
    return this.o00OoOoo.OooOoo;
  }
  
  public boolean isStateful()
  {
    return this.o00OoOoo.isStateful();
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable1 = this.o00Ooo0O;
    int i = 1;
    float f1 = 1.4E-45F;
    int j;
    float f2;
    if (localDrawable1 != null)
    {
      localDrawable1.jumpToCurrentState();
      localDrawable1 = null;
      this.o00Ooo0O = null;
      j = i;
      f2 = f1;
    }
    else
    {
      j = 0;
      f2 = 0.0F;
      localDrawable1 = null;
    }
    Drawable localDrawable2 = this.o00Ooo0;
    if (localDrawable2 != null)
    {
      localDrawable2.jumpToCurrentState();
      bool = this.o00OooO0;
      if (bool)
      {
        localDrawable2 = this.o00Ooo0;
        int k = this.o00Ooo0o;
        localDrawable2.setAlpha(k);
      }
    }
    long l1 = this.o00OoooO;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      this.o00OoooO = l2;
      j = i;
      f2 = f1;
    }
    l1 = this.o0O00o0;
    bool = l1 < l2;
    if (bool)
    {
      this.o0O00o0 = l2;
    }
    else
    {
      i = j;
      f1 = f2;
    }
    if (i != 0) {
      invalidateSelf();
    }
  }
  
  public Drawable mutate()
  {
    boolean bool = this.o00OooOO;
    if (!bool)
    {
      Object localObject = super.mutate();
      if (localObject == this)
      {
        localObject = OooO0O0();
        ((DrawableContainerCompat.DrawableContainerState)localObject).OooO0oo();
        setConstantState((DrawableContainerCompat.DrawableContainerState)localObject);
        bool = true;
        this.o00OooOO = bool;
      }
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.o00Ooo0O;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
    localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onLayoutDirectionChanged(int paramInt)
  {
    DrawableContainerCompat.DrawableContainerState localDrawableContainerState = this.o00OoOoo;
    int i = getCurrentIndex();
    return localDrawableContainerState.OooOO0(paramInt, i);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = this.o00Ooo0O;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return false;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Drawable localDrawable = this.o00Ooo0O;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = this.o00Ooo0;
    if (paramDrawable == localDrawable)
    {
      paramDrawable = getCallback();
      if (paramDrawable != null)
      {
        paramDrawable = getCallback();
        paramDrawable.scheduleDrawable(this, paramRunnable, paramLong);
      }
    }
  }
  
  public void setAlpha(int paramInt)
  {
    boolean bool1 = this.o00OooO0;
    int i;
    if (bool1)
    {
      i = this.o00Ooo0o;
      if (i == paramInt) {}
    }
    else
    {
      i = 1;
      this.o00OooO0 = i;
      this.o00Ooo0o = paramInt;
      Drawable localDrawable = this.o00Ooo0;
      if (localDrawable != null)
      {
        long l1 = this.o0O00o0;
        long l2 = 0L;
        boolean bool2 = l1 < l2;
        if (!bool2)
        {
          localDrawable.setAlpha(paramInt);
        }
        else
        {
          paramInt = 0;
          OooO00o(false);
        }
      }
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).OooOoo;
    if (bool != paramBoolean)
    {
      ((DrawableContainerCompat.DrawableContainerState)localObject).OooOoo = paramBoolean;
      localObject = this.o00Ooo0;
      if (localObject != null) {
        DrawableCompat.OooOO0((Drawable)localObject, paramBoolean);
      }
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = true;
    ((DrawableContainerCompat.DrawableContainerState)localObject).OooOooo = bool;
    ColorFilter localColorFilter = ((DrawableContainerCompat.DrawableContainerState)localObject).OooOooO;
    if (localColorFilter != paramColorFilter)
    {
      ((DrawableContainerCompat.DrawableContainerState)localObject).OooOooO = paramColorFilter;
      localObject = this.o00Ooo0;
      if (localObject != null) {
        ((Drawable)localObject).setColorFilter(paramColorFilter);
      }
    }
  }
  
  public void setConstantState(DrawableContainerCompat.DrawableContainerState paramDrawableContainerState)
  {
    this.o00OoOoo = paramDrawableContainerState;
    int i = this.o00OooO;
    if (i >= 0)
    {
      paramDrawableContainerState = paramDrawableContainerState.getChild(i);
      this.o00Ooo0 = paramDrawableContainerState;
      if (paramDrawableContainerState != null) {
        OooO0OO(paramDrawableContainerState);
      }
    }
    this.o00Ooo0O = null;
  }
  
  public void setCurrentIndex(int paramInt)
  {
    OooO0o(paramInt);
  }
  
  public void setDither(boolean paramBoolean)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((DrawableContainerCompat.DrawableContainerState)localObject).OooOo;
    if (bool != paramBoolean)
    {
      ((DrawableContainerCompat.DrawableContainerState)localObject).OooOo = paramBoolean;
      localObject = this.o00Ooo0;
      if (localObject != null) {
        ((Drawable)localObject).setDither(paramBoolean);
      }
    }
  }
  
  public void setEnterFadeDuration(int paramInt)
  {
    this.o00OoOoo.OooOoOO = paramInt;
  }
  
  public void setExitFadeDuration(int paramInt)
  {
    this.o00OoOoo.OooOoo0 = paramInt;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      DrawableCompat.OooOO0O(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = this.o00Ooo00;
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>(paramInt1, paramInt2, paramInt3, paramInt4);
      this.o00Ooo00 = ((Rect)localObject);
    }
    else
    {
      ((Rect)localObject).set(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    localObject = this.o00Ooo0;
    if (localObject != null) {
      DrawableCompat.OooOO0o((Drawable)localObject, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setTint(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setTintList(localColorStateList);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = true;
    ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo00o = bool;
    ColorStateList localColorStateList = ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo000;
    if (localColorStateList != paramColorStateList)
    {
      ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo000 = paramColorStateList;
      localObject = this.o00Ooo0;
      DrawableCompat.OooOOOO((Drawable)localObject, paramColorStateList);
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = true;
    ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo0 = bool;
    PorterDuff.Mode localMode = ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo00O;
    if (localMode != paramMode)
    {
      ((DrawableContainerCompat.DrawableContainerState)localObject).Oooo00O = paramMode;
      localObject = this.o00Ooo0;
      DrawableCompat.OooOOOo((Drawable)localObject, paramMode);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable = this.o00Ooo0O;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    localDrawable = this.o00Ooo0;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    Drawable localDrawable = this.o00Ooo0;
    if (paramDrawable == localDrawable)
    {
      paramDrawable = getCallback();
      if (paramDrawable != null)
      {
        paramDrawable = getCallback();
        paramDrawable.unscheduleDrawable(this, paramRunnable);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainerCompat
 * JD-Core Version:    0.7.0.1
 */