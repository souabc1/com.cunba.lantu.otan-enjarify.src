package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class WrappedDrawableApi14
  extends Drawable
  implements Drawable.Callback, WrappedDrawable, TintAwareDrawable
{
  public static final PorterDuff.Mode o00OooO = PorterDuff.Mode.SRC_IN;
  public int o00OoOoo;
  public boolean o00Ooo0;
  public PorterDuff.Mode o00Ooo00;
  public WrappedDrawableState o00Ooo0O;
  public boolean o00Ooo0o;
  public Drawable o00OooO0;
  
  public WrappedDrawableApi14(WrappedDrawableState paramWrappedDrawableState, Resources paramResources)
  {
    this.o00Ooo0O = paramWrappedDrawableState;
    OooO0O0(paramResources);
  }
  
  public final WrappedDrawableState OooO00o()
  {
    WrappedDrawableState localWrappedDrawableState1 = new androidx/core/graphics/drawable/WrappedDrawableState;
    WrappedDrawableState localWrappedDrawableState2 = this.o00Ooo0O;
    localWrappedDrawableState1.<init>(localWrappedDrawableState2);
    return localWrappedDrawableState1;
  }
  
  public final void OooO0O0(Resources paramResources)
  {
    Object localObject = this.o00Ooo0O;
    if (localObject != null)
    {
      localObject = ((WrappedDrawableState)localObject).OooO0O0;
      if (localObject != null)
      {
        paramResources = ((Drawable.ConstantState)localObject).newDrawable(paramResources);
        setWrappedDrawable(paramResources);
      }
    }
  }
  
  public final boolean OooO0OO(int[] paramArrayOfInt)
  {
    boolean bool1 = isCompatTintEnabled();
    if (!bool1) {
      return false;
    }
    Object localObject1 = this.o00Ooo0O;
    Object localObject2 = ((WrappedDrawableState)localObject1).OooO0OO;
    localObject1 = ((WrappedDrawableState)localObject1).OooO0Oo;
    if ((localObject2 != null) && (localObject1 != null))
    {
      int i = ((ColorStateList)localObject2).getDefaultColor();
      int j = ((ColorStateList)localObject2).getColorForState(paramArrayOfInt, i);
      boolean bool2 = this.o00Ooo0;
      if (bool2)
      {
        int k = this.o00OoOoo;
        if (j == k)
        {
          localObject2 = this.o00Ooo00;
          if (localObject1 == localObject2) {
            break label128;
          }
        }
      }
      setColorFilter(j, (PorterDuff.Mode)localObject1);
      this.o00OoOoo = j;
      this.o00Ooo00 = ((PorterDuff.Mode)localObject1);
      j = 1;
      this.o00Ooo0 = j;
      return j;
    }
    else
    {
      this.o00Ooo0 = false;
      clearColorFilter();
    }
    label128:
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.o00OooO0.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    WrappedDrawableState localWrappedDrawableState = this.o00Ooo0O;
    if (localWrappedDrawableState != null)
    {
      j = localWrappedDrawableState.getChangingConfigurations();
    }
    else
    {
      j = 0;
      localWrappedDrawableState = null;
    }
    i |= j;
    int j = this.o00OooO0.getChangingConfigurations();
    return i | j;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    WrappedDrawableState localWrappedDrawableState = this.o00Ooo0O;
    if (localWrappedDrawableState != null)
    {
      boolean bool = localWrappedDrawableState.OooO00o();
      if (bool)
      {
        localWrappedDrawableState = this.o00Ooo0O;
        int i = getChangingConfigurations();
        localWrappedDrawableState.OooO00o = i;
        return this.o00Ooo0O;
      }
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return this.o00OooO0.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.o00OooO0.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.o00OooO0.getIntrinsicWidth();
  }
  
  public int getLayoutDirection()
  {
    return DrawableCompat.OooO0o(this.o00OooO0);
  }
  
  public int getMinimumHeight()
  {
    return this.o00OooO0.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.o00OooO0.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.o00OooO0.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.o00OooO0.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.o00OooO0.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.o00OooO0.getTransparentRegion();
  }
  
  public final Drawable getWrappedDrawable()
  {
    return this.o00OooO0;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    return DrawableCompat.OooO0oo(this.o00OooO0);
  }
  
  public boolean isCompatTintEnabled()
  {
    return true;
  }
  
  public boolean isStateful()
  {
    boolean bool = isCompatTintEnabled();
    if (bool)
    {
      localObject = this.o00Ooo0O;
      if (localObject != null)
      {
        localObject = ((WrappedDrawableState)localObject).OooO0OO;
        break label30;
      }
    }
    bool = false;
    Object localObject = null;
    label30:
    if (localObject != null)
    {
      bool = ((ColorStateList)localObject).isStateful();
      if (bool) {}
    }
    else
    {
      localObject = this.o00OooO0;
      bool = ((Drawable)localObject).isStateful();
      if (!bool) {
        break label62;
      }
    }
    return true;
    label62:
    bool = false;
    localObject = null;
    return bool;
  }
  
  public void jumpToCurrentState()
  {
    this.o00OooO0.jumpToCurrentState();
  }
  
  public Drawable mutate()
  {
    boolean bool = this.o00Ooo0o;
    if (!bool)
    {
      Object localObject1 = super.mutate();
      if (localObject1 == this)
      {
        localObject1 = OooO00o();
        this.o00Ooo0O = ((WrappedDrawableState)localObject1);
        localObject1 = this.o00OooO0;
        if (localObject1 != null) {
          ((Drawable)localObject1).mutate();
        }
        localObject1 = this.o00Ooo0O;
        if (localObject1 != null)
        {
          Object localObject2 = this.o00OooO0;
          if (localObject2 != null) {
            localObject2 = ((Drawable)localObject2).getConstantState();
          } else {
            localObject2 = null;
          }
          ((WrappedDrawableState)localObject1).OooO0O0 = ((Drawable.ConstantState)localObject2);
        }
        bool = true;
        this.o00Ooo0o = bool;
      }
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.o00OooO0;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onLayoutDirectionChanged(int paramInt)
  {
    return DrawableCompat.OooOOO0(this.o00OooO0, paramInt);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    return this.o00OooO0.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.o00OooO0.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    DrawableCompat.OooOO0(this.o00OooO0, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.o00OooO0.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.o00OooO0.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.o00OooO0.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.o00OooO0.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = this.o00OooO0;
    boolean bool1 = localDrawable.setState(paramArrayOfInt);
    boolean bool2 = OooO0OO(paramArrayOfInt);
    if ((!bool2) && (!bool1))
    {
      bool2 = false;
      paramArrayOfInt = null;
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public void setTint(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setTintList(localColorStateList);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.o00Ooo0O.OooO0OO = paramColorStateList;
    paramColorStateList = getState();
    OooO0OO(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.o00Ooo0O.OooO0Oo = paramMode;
    paramMode = getState();
    OooO0OO(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (!bool)
    {
      Drawable localDrawable = this.o00OooO0;
      paramBoolean1 = localDrawable.setVisible(paramBoolean1, paramBoolean2);
      if (!paramBoolean1) {
        return false;
      }
    }
    paramBoolean1 = true;
    return paramBoolean1;
  }
  
  public final void setWrappedDrawable(Drawable paramDrawable)
  {
    Object localObject = this.o00OooO0;
    boolean bool1;
    if (localObject != null)
    {
      bool1 = false;
      ((Drawable)localObject).setCallback(null);
    }
    this.o00OooO0 = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      boolean bool2 = paramDrawable.isVisible();
      bool1 = true;
      setVisible(bool2, bool1);
      localObject = paramDrawable.getState();
      setState((int[])localObject);
      int i = paramDrawable.getLevel();
      setLevel(i);
      localObject = paramDrawable.getBounds();
      setBounds((Rect)localObject);
      localObject = this.o00Ooo0O;
      if (localObject != null)
      {
        paramDrawable = paramDrawable.getConstantState();
        ((WrappedDrawableState)localObject).OooO0O0 = paramDrawable;
      }
    }
    invalidateSelf();
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.WrappedDrawableApi14
 * JD-Core Version:    0.7.0.1
 */