package com.scwang.smartrefresh.header.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.List;

public class MaterialProgressDrawable
  extends Drawable
  implements Animatable
{
  public static final Interpolator o00OoooO;
  public static final int[] o00Ooooo = { -16777216 };
  public static final Interpolator o0O00o0;
  public final List o00OoOoo;
  public float o00Ooo0;
  public final MaterialProgressDrawable.Ring o00Ooo00;
  public View o00Ooo0O;
  public Animation o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public float o00OooOO;
  public boolean o00OooOo;
  
  static
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    o0O00o0 = (Interpolator)localObject;
    localObject = new androidx/interpolator/view/animation/FastOutSlowInInterpolator;
    ((FastOutSlowInInterpolator)localObject).<init>();
    o00OoooO = (Interpolator)localObject;
  }
  
  public void OooO00o(float paramFloat, MaterialProgressDrawable.Ring paramRing)
  {
    OooO0o(paramFloat, paramRing);
    float f1 = (float)(Math.floor(paramRing.OooOOO0 / 0.8F) + 1.0D);
    float f2 = OooO0OO(paramRing);
    float f3 = paramRing.OooOO0O;
    float f4 = paramRing.OooOO0o;
    f2 = (f4 - f2 - f3) * paramFloat;
    f3 += f2;
    OooO0Oo(f3, f4);
    float f5 = paramRing.OooOOO0;
    f1 = (f1 - f5) * paramFloat;
    f5 += f1;
    setProgressRotation(f5);
  }
  
  public final int OooO0O0(float paramFloat, int paramInt1, int paramInt2)
  {
    paramInt1 = Integer.valueOf(paramInt1).intValue();
    int i = paramInt1 >> 24 & 0xFF;
    int j = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    paramInt2 = Integer.valueOf(paramInt2).intValue();
    int m = paramInt2 >> 24 & 0xFF;
    int n = paramInt2 >> 16 & 0xFF;
    int i1 = paramInt2 >> 8 & 0xFF;
    paramInt2 &= 0xFF;
    m = (int)((m - i) * paramFloat);
    i = i + m << 24;
    m = (int)((n - j) * paramFloat);
    j = j + m << 16;
    i |= j;
    j = (int)((i1 - k) * paramFloat);
    j = k + j << 8;
    i |= j;
    float f = paramInt2 - paramInt1;
    int i2 = (int)(paramFloat * f);
    paramInt1 += i2;
    return i | paramInt1;
  }
  
  public float OooO0OO(MaterialProgressDrawable.Ring paramRing)
  {
    double d1 = paramRing.OooO0oO;
    double d2 = paramRing.OooOOo0 * 6.283185307179586D;
    return (float)Math.toRadians(d1 / d2);
  }
  
  public void OooO0Oo(float paramFloat1, float paramFloat2)
  {
    MaterialProgressDrawable.Ring localRing = this.o00Ooo00;
    localRing.OooO0Oo = paramFloat1;
    localRing.OooO0o0 = paramFloat2;
    invalidateSelf();
  }
  
  public void OooO0o(float paramFloat, MaterialProgressDrawable.Ring paramRing)
  {
    int i = 1061158912;
    float f = 0.75F;
    boolean bool = paramFloat < f;
    if (bool)
    {
      paramFloat -= f;
      f = 0.25F;
      paramFloat /= f;
      i = paramRing.getStartingColor();
      int j = paramRing.getNextColor();
      int k = OooO0O0(paramFloat, i, j);
      paramRing.OooOo0o = k;
    }
  }
  
  public void OooO0o0(boolean paramBoolean)
  {
    MaterialProgressDrawable.Ring localRing = this.o00Ooo00;
    boolean bool = localRing.OooOOO;
    if (bool != paramBoolean)
    {
      localRing.OooOOO = paramBoolean;
      invalidateSelf();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i = paramCanvas.save();
    float f1 = this.o00Ooo0;
    float f2 = localRect.exactCenterX();
    float f3 = localRect.exactCenterY();
    paramCanvas.rotate(f1, f2, f3);
    this.o00Ooo00.OooO00o(paramCanvas, localRect);
    paramCanvas.restoreToCount(i);
  }
  
  public int getAlpha()
  {
    return this.o00Ooo00.OooOo00;
  }
  
  public int getIntrinsicHeight()
  {
    return (int)this.o00OooOO;
  }
  
  public int getIntrinsicWidth()
  {
    return (int)this.o00OooO;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean isRunning()
  {
    List localList = this.o00OoOoo;
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      Animation localAnimation = (Animation)localList.get(j);
      boolean bool1 = localAnimation.hasStarted();
      if (bool1)
      {
        boolean bool2 = localAnimation.hasEnded();
        if (!bool2) {
          return true;
        }
      }
      j += 1;
    }
    return false;
  }
  
  public void setAlpha(int paramInt)
  {
    this.o00Ooo00.OooOo00 = paramInt;
  }
  
  public void setArrowScale(float paramFloat)
  {
    MaterialProgressDrawable.Ring localRing = this.o00Ooo00;
    float f = localRing.OooOOOo;
    boolean bool = f < paramFloat;
    if (bool)
    {
      localRing.OooOOOo = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.o00Ooo00.OooOo0O = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.o00Ooo00.OooO0O0.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    MaterialProgressDrawable.Ring localRing = this.o00Ooo00;
    localRing.OooO = paramVarArgs;
    localRing.setColorIndex(0);
  }
  
  public void setProgressRotation(float paramFloat)
  {
    this.o00Ooo00.OooO0o = paramFloat;
    invalidateSelf();
  }
  
  public void setRotation(float paramFloat)
  {
    this.o00Ooo0 = paramFloat;
    invalidateSelf();
  }
  
  public void start()
  {
    this.o00Ooo0o.reset();
    this.o00Ooo00.OooO0o0();
    Object localObject = this.o00Ooo00;
    float f1 = ((MaterialProgressDrawable.Ring)localObject).OooO0o0;
    float f2 = ((MaterialProgressDrawable.Ring)localObject).OooO0Oo;
    boolean bool1 = f1 < f2;
    long l;
    if (bool1)
    {
      boolean bool2 = true;
      this.o00OooOo = bool2;
      localObject = this.o00Ooo0o;
      l = 666L;
    }
    else
    {
      bool1 = false;
      f1 = 0.0F;
      localAnimation = null;
      ((MaterialProgressDrawable.Ring)localObject).setColorIndex(0);
      this.o00Ooo00.OooO0Oo();
      localObject = this.o00Ooo0o;
      l = 1332L;
    }
    ((Animation)localObject).setDuration(l);
    localObject = this.o00Ooo0O;
    Animation localAnimation = this.o00Ooo0o;
    ((View)localObject).startAnimation(localAnimation);
  }
  
  public void stop()
  {
    this.o00Ooo0O.clearAnimation();
    this.o00Ooo00.setColorIndex(0);
    this.o00Ooo00.OooO0Oo();
    OooO0o0(false);
    setRotation(0.0F);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.MaterialProgressDrawable
 * JD-Core Version:    0.7.0.1
 */