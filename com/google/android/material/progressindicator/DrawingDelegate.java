package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

abstract class DrawingDelegate
{
  protected DrawableWithAnimatedVisibilityChange drawable;
  BaseProgressIndicatorSpec spec;
  
  public DrawingDelegate(BaseProgressIndicatorSpec paramBaseProgressIndicatorSpec)
  {
    this.spec = paramBaseProgressIndicatorSpec;
  }
  
  public abstract void adjustCanvas(Canvas paramCanvas, Rect paramRect, float paramFloat);
  
  public abstract void fillIndicator(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2, int paramInt);
  
  public abstract void fillTrack(Canvas paramCanvas, Paint paramPaint);
  
  public abstract int getPreferredHeight();
  
  public abstract int getPreferredWidth();
  
  public void registerDrawable(DrawableWithAnimatedVisibilityChange paramDrawableWithAnimatedVisibilityChange)
  {
    this.drawable = paramDrawableWithAnimatedVisibilityChange;
  }
  
  public void validateSpecAndAdjustCanvas(Canvas paramCanvas, Rect paramRect, float paramFloat)
  {
    this.spec.validateSpec();
    adjustCanvas(paramCanvas, paramRect, paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.DrawingDelegate
 * JD-Core Version:    0.7.0.1
 */