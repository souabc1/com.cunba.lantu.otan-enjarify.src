package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

public class CircularProgressDrawable
  extends Drawable
  implements Animatable
{
  public static final Interpolator o00OooO;
  public static final Interpolator o00OooOO;
  public static final int[] o00OooOo = { -16777216 };
  public final CircularProgressDrawable.Ring o00OoOoo;
  public Resources o00Ooo0;
  public float o00Ooo00;
  public Animator o00Ooo0O;
  public float o00Ooo0o;
  public boolean o00OooO0;
  
  static
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    o00OooO = (Interpolator)localObject;
    localObject = new androidx/interpolator/view/animation/FastOutSlowInInterpolator;
    ((FastOutSlowInInterpolator)localObject).<init>();
    o00OooOO = (Interpolator)localObject;
  }
  
  public CircularProgressDrawable(Context paramContext)
  {
    paramContext = ((Context)Preconditions.OooO0oo(paramContext)).getResources();
    this.o00Ooo0 = paramContext;
    paramContext = new androidx/swiperefreshlayout/widget/CircularProgressDrawable$Ring;
    paramContext.<init>();
    this.o00OoOoo = paramContext;
    int[] arrayOfInt = o00OooOo;
    paramContext.setColors(arrayOfInt);
    setStrokeWidth(2.5F);
    OooO0o();
  }
  
  private float getRotation()
  {
    return this.o00Ooo00;
  }
  
  private void setRotation(float paramFloat)
  {
    this.o00Ooo00 = paramFloat;
  }
  
  public final void OooO00o(float paramFloat, CircularProgressDrawable.Ring paramRing)
  {
    OooO0oO(paramFloat, paramRing);
    float f1 = (float)(Math.floor(paramRing.getStartingRotation() / 0.8F) + 1.0D);
    float f2 = paramRing.getStartingStartTrim();
    float f3 = paramRing.getStartingEndTrim() - 0.01F;
    float f4 = paramRing.getStartingStartTrim();
    f3 = (f3 - f4) * paramFloat;
    f2 += f3;
    paramRing.setStartTrim(f2);
    f2 = paramRing.getStartingEndTrim();
    paramRing.setEndTrim(f2);
    f2 = paramRing.getStartingRotation();
    f3 = paramRing.getStartingRotation();
    f1 = (f1 - f3) * paramFloat;
    f2 += f1;
    paramRing.setRotation(f2);
  }
  
  public void OooO0O0(float paramFloat, CircularProgressDrawable.Ring paramRing, boolean paramBoolean)
  {
    boolean bool1 = this.o00OooO0;
    if (bool1)
    {
      OooO00o(paramFloat, paramRing);
    }
    else
    {
      int i = 1065353216;
      float f1 = 1.0F;
      boolean bool2 = paramFloat < f1;
      if ((bool2) || (paramBoolean))
      {
        float f2 = paramRing.getStartingRotation();
        int j = 1056964608;
        float f3 = 0.5F;
        boolean bool3 = paramFloat < f3;
        float f4 = 0.01F;
        float f5 = 0.79F;
        if (bool3)
        {
          f1 = paramFloat / f3;
          f3 = paramRing.getStartingStartTrim();
          Interpolator localInterpolator1 = o00OooOO;
          f1 = localInterpolator1.getInterpolation(f1) * f5 + f4 + f3;
        }
        else
        {
          f6 = (paramFloat - f3) / f3;
          f3 = paramRing.getStartingStartTrim() + f5;
          Interpolator localInterpolator2 = o00OooOO;
          f6 = localInterpolator2.getInterpolation(f6);
          f1 = (f1 - f6) * f5 + f4;
          f1 = f3 - f1;
          float f7 = f3;
          f3 = f1;
          f1 = f7;
        }
        float f6 = 0.21F * paramFloat;
        f2 += f6;
        f6 = this.o00Ooo0o;
        paramFloat += f6;
        int k = 1129840640;
        f6 = 216.0F;
        paramFloat *= f6;
        paramRing.setStartTrim(f3);
        paramRing.setEndTrim(f1);
        paramRing.setRotation(f2);
        setRotation(paramFloat);
      }
    }
  }
  
  public final int OooO0OO(float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramInt1 >> 24 & 0xFF;
    int j = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
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
  
  public final void OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    CircularProgressDrawable.Ring localRing = this.o00OoOoo;
    float f = this.o00Ooo0.getDisplayMetrics().density;
    paramFloat2 *= f;
    localRing.setStrokeWidth(paramFloat2);
    paramFloat1 *= f;
    localRing.setCenterRadius(paramFloat1);
    localRing.setColorIndex(0);
    paramFloat3 *= f;
    paramFloat4 *= f;
    localRing.OooO0o0(paramFloat3, paramFloat4);
  }
  
  public final void OooO0o()
  {
    CircularProgressDrawable.Ring localRing = this.o00OoOoo;
    Object localObject1 = new float[2];
    Object tmp10_9 = localObject1;
    tmp10_9[0] = 0.0F;
    tmp10_9[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    Object localObject2 = new androidx/swiperefreshlayout/widget/CircularProgressDrawable$1;
    ((CircularProgressDrawable.1)localObject2).<init>(this, localRing);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    ((ValueAnimator)localObject1).setRepeatCount(-1);
    ((ValueAnimator)localObject1).setRepeatMode(1);
    localObject2 = o00OooO;
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new androidx/swiperefreshlayout/widget/CircularProgressDrawable$2;
    ((CircularProgressDrawable.2)localObject2).<init>(this, localRing);
    ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    this.o00Ooo0O = ((Animator)localObject1);
  }
  
  public void OooO0o0(float paramFloat1, float paramFloat2)
  {
    this.o00OoOoo.setStartTrim(paramFloat1);
    this.o00OoOoo.setEndTrim(paramFloat2);
    invalidateSelf();
  }
  
  public void OooO0oO(float paramFloat, CircularProgressDrawable.Ring paramRing)
  {
    int i = 1061158912;
    float f = 0.75F;
    boolean bool = paramFloat < f;
    int k;
    if (bool)
    {
      paramFloat -= f;
      f = 0.25F;
      paramFloat /= f;
      i = paramRing.getStartingColor();
      int j = paramRing.getNextColor();
      k = OooO0OO(paramFloat, i, j);
    }
    else
    {
      k = paramRing.getStartingColor();
    }
    paramRing.setColor(k);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.save();
    float f1 = this.o00Ooo00;
    float f2 = localRect.exactCenterX();
    float f3 = localRect.exactCenterY();
    paramCanvas.rotate(f1, f2, f3);
    this.o00OoOoo.OooO00o(paramCanvas, localRect);
    paramCanvas.restore();
  }
  
  public int getAlpha()
  {
    return this.o00OoOoo.getAlpha();
  }
  
  public boolean getArrowEnabled()
  {
    return this.o00OoOoo.getShowArrow();
  }
  
  public float getArrowHeight()
  {
    return this.o00OoOoo.getArrowHeight();
  }
  
  public float getArrowScale()
  {
    return this.o00OoOoo.getArrowScale();
  }
  
  public float getArrowWidth()
  {
    return this.o00OoOoo.getArrowWidth();
  }
  
  public int getBackgroundColor()
  {
    return this.o00OoOoo.getBackgroundColor();
  }
  
  public float getCenterRadius()
  {
    return this.o00OoOoo.getCenterRadius();
  }
  
  public int[] getColorSchemeColors()
  {
    return this.o00OoOoo.getColors();
  }
  
  public float getEndTrim()
  {
    return this.o00OoOoo.getEndTrim();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public float getProgressRotation()
  {
    return this.o00OoOoo.getRotation();
  }
  
  public float getStartTrim()
  {
    return this.o00OoOoo.getStartTrim();
  }
  
  public Paint.Cap getStrokeCap()
  {
    return this.o00OoOoo.getStrokeCap();
  }
  
  public float getStrokeWidth()
  {
    return this.o00OoOoo.getStrokeWidth();
  }
  
  public boolean isRunning()
  {
    return this.o00Ooo0O.isRunning();
  }
  
  public void setAlpha(int paramInt)
  {
    this.o00OoOoo.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setArrowEnabled(boolean paramBoolean)
  {
    this.o00OoOoo.setShowArrow(paramBoolean);
    invalidateSelf();
  }
  
  public void setArrowScale(float paramFloat)
  {
    this.o00OoOoo.setArrowScale(paramFloat);
    invalidateSelf();
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.o00OoOoo.setBackgroundColor(paramInt);
    invalidateSelf();
  }
  
  public void setCenterRadius(float paramFloat)
  {
    this.o00OoOoo.setCenterRadius(paramFloat);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.o00OoOoo.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    this.o00OoOoo.setColors(paramVarArgs);
    this.o00OoOoo.setColorIndex(0);
    invalidateSelf();
  }
  
  public void setProgressRotation(float paramFloat)
  {
    this.o00OoOoo.setRotation(paramFloat);
    invalidateSelf();
  }
  
  public void setStrokeCap(Paint.Cap paramCap)
  {
    this.o00OoOoo.setStrokeCap(paramCap);
    invalidateSelf();
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    this.o00OoOoo.setStrokeWidth(paramFloat);
    invalidateSelf();
  }
  
  public void setStyle(int paramInt)
  {
    float f1;
    float f2;
    float f3;
    float f4;
    if (paramInt == 0)
    {
      paramInt = 1094713344;
      f1 = 12.0F;
      f2 = 6.0F;
      f3 = 11.0F;
      f4 = 3.0F;
    }
    else
    {
      paramInt = 1092616192;
      f1 = 10.0F;
      f2 = 5.0F;
      f3 = 7.5F;
      f4 = 2.5F;
    }
    OooO0Oo(f3, f4, f1, f2);
    invalidateSelf();
  }
  
  public void start()
  {
    this.o00Ooo0O.cancel();
    this.o00OoOoo.OooO0o();
    Object localObject = this.o00OoOoo;
    float f1 = ((CircularProgressDrawable.Ring)localObject).getEndTrim();
    CircularProgressDrawable.Ring localRing = this.o00OoOoo;
    float f2 = localRing.getStartTrim();
    boolean bool = f1 < f2;
    long l;
    if (bool)
    {
      bool = true;
      f1 = 1.4E-45F;
      this.o00OooO0 = bool;
      localObject = this.o00Ooo0O;
      l = 666L;
    }
    else
    {
      localObject = this.o00OoOoo;
      f2 = 0.0F;
      localRing = null;
      ((CircularProgressDrawable.Ring)localObject).setColorIndex(0);
      this.o00OoOoo.OooO0Oo();
      localObject = this.o00Ooo0O;
      l = 1332L;
    }
    ((Animator)localObject).setDuration(l);
    this.o00Ooo0O.start();
  }
  
  public void stop()
  {
    this.o00Ooo0O.cancel();
    setRotation(0.0F);
    this.o00OoOoo.setShowArrow(false);
    this.o00OoOoo.setColorIndex(0);
    this.o00OoOoo.OooO0Oo();
    invalidateSelf();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable
 * JD-Core Version:    0.7.0.1
 */