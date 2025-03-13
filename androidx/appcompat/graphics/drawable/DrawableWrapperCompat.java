package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableWrapperCompat
  extends Drawable
  implements Drawable.Callback
{
  public Drawable o00OoOoo;
  
  public DrawableWrapperCompat(Drawable paramDrawable)
  {
    setDrawable(paramDrawable);
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.o00OoOoo.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    return this.o00OoOoo.getChangingConfigurations();
  }
  
  public Drawable getCurrent()
  {
    return this.o00OoOoo.getCurrent();
  }
  
  public Drawable getDrawable()
  {
    return this.o00OoOoo;
  }
  
  public int getIntrinsicHeight()
  {
    return this.o00OoOoo.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.o00OoOoo.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.o00OoOoo.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.o00OoOoo.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.o00OoOoo.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.o00OoOoo.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.o00OoOoo.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.o00OoOoo.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    return DrawableCompat.OooO0oo(this.o00OoOoo);
  }
  
  public boolean isStateful()
  {
    return this.o00OoOoo.isStateful();
  }
  
  public void jumpToCurrentState()
  {
    this.o00OoOoo.jumpToCurrentState();
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    this.o00OoOoo.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    return this.o00OoOoo.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.o00OoOoo.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    DrawableCompat.OooOO0(this.o00OoOoo, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.o00OoOoo.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.o00OoOoo.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.o00OoOoo.setDither(paramBoolean);
  }
  
  public void setDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.o00OoOoo;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    this.o00OoOoo = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.o00OoOoo.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    DrawableCompat.OooOO0O(this.o00OoOoo, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    DrawableCompat.OooOO0o(this.o00OoOoo, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    return this.o00OoOoo.setState(paramArrayOfInt);
  }
  
  public void setTint(int paramInt)
  {
    DrawableCompat.OooOOO(this.o00OoOoo, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    DrawableCompat.OooOOOO(this.o00OoOoo, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    DrawableCompat.OooOOOo(this.o00OoOoo, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (!bool)
    {
      Drawable localDrawable = this.o00OoOoo;
      paramBoolean1 = localDrawable.setVisible(paramBoolean1, paramBoolean2);
      if (!paramBoolean1) {
        return false;
      }
    }
    paramBoolean1 = true;
    return paramBoolean1;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableWrapperCompat
 * JD-Core Version:    0.7.0.1
 */