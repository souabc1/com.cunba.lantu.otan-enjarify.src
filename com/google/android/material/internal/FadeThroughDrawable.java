package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public class FadeThroughDrawable
  extends Drawable
{
  private final float[] alphas;
  private final Drawable fadeInDrawable;
  private final Drawable fadeOutDrawable;
  private float progress;
  
  public FadeThroughDrawable(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    paramDrawable1 = paramDrawable1.getConstantState().newDrawable().mutate();
    this.fadeOutDrawable = paramDrawable1;
    paramDrawable1 = paramDrawable2.getConstantState().newDrawable().mutate();
    this.fadeInDrawable = paramDrawable1;
    paramDrawable1.setAlpha(0);
    paramDrawable1 = new float[2];
    this.alphas = paramDrawable1;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.fadeOutDrawable.draw(paramCanvas);
    this.fadeInDrawable.draw(paramCanvas);
  }
  
  public int getIntrinsicHeight()
  {
    int i = this.fadeOutDrawable.getIntrinsicHeight();
    int j = this.fadeInDrawable.getIntrinsicHeight();
    return Math.max(i, j);
  }
  
  public int getIntrinsicWidth()
  {
    int i = this.fadeOutDrawable.getIntrinsicWidth();
    int j = this.fadeInDrawable.getIntrinsicWidth();
    return Math.max(i, j);
  }
  
  public int getMinimumHeight()
  {
    int i = this.fadeOutDrawable.getMinimumHeight();
    int j = this.fadeInDrawable.getMinimumHeight();
    return Math.max(i, j);
  }
  
  public int getMinimumWidth()
  {
    int i = this.fadeOutDrawable.getMinimumWidth();
    int j = this.fadeInDrawable.getMinimumWidth();
    return Math.max(i, j);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean isStateful()
  {
    Drawable localDrawable = this.fadeOutDrawable;
    boolean bool = localDrawable.isStateful();
    if (!bool)
    {
      localDrawable = this.fadeInDrawable;
      bool = localDrawable.isStateful();
      if (!bool)
      {
        bool = false;
        localDrawable = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public void setAlpha(int paramInt)
  {
    float f = this.progress;
    boolean bool = f < 0.5F;
    Drawable localDrawable1;
    if (!bool)
    {
      localDrawable1 = this.fadeOutDrawable;
      localDrawable1.setAlpha(paramInt);
      Drawable localDrawable2 = this.fadeInDrawable;
      localDrawable2.setAlpha(0);
    }
    else
    {
      this.fadeOutDrawable.setAlpha(0);
      localDrawable1 = this.fadeInDrawable;
      localDrawable1.setAlpha(paramInt);
    }
    invalidateSelf();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.fadeOutDrawable.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.fadeInDrawable.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.fadeOutDrawable.setColorFilter(paramColorFilter);
    this.fadeInDrawable.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setProgress(float paramFloat)
  {
    float f1 = this.progress;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.progress = paramFloat;
      float[] arrayOfFloat = this.alphas;
      FadeThroughUtils.calculateFadeOutAndInAlphas(paramFloat, arrayOfFloat);
      Drawable localDrawable = this.fadeOutDrawable;
      f1 = this.alphas[0];
      float f2 = 255.0F;
      int i = (int)(f1 * f2);
      localDrawable.setAlpha(i);
      localDrawable = this.fadeInDrawable;
      arrayOfFloat = this.alphas;
      int j = 1;
      f1 = arrayOfFloat[j] * f2;
      i = (int)f1;
      localDrawable.setAlpha(i);
      invalidateSelf();
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable1 = this.fadeOutDrawable;
    boolean bool1 = localDrawable1.setState(paramArrayOfInt);
    Drawable localDrawable2 = this.fadeInDrawable;
    boolean bool2 = localDrawable2.setState(paramArrayOfInt);
    if ((!bool1) && (!bool2))
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.FadeThroughDrawable
 * JD-Core Version:    0.7.0.1
 */