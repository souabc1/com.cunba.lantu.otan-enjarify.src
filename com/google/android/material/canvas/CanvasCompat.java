package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;

public class CanvasCompat
{
  public static int saveLayerAlpha(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    return paramCanvas.saveLayerAlpha(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt);
  }
  
  public static int saveLayerAlpha(Canvas paramCanvas, RectF paramRectF, int paramInt)
  {
    return paramCanvas.saveLayerAlpha(paramRectF, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.canvas.CanvasCompat
 * JD-Core Version:    0.7.0.1
 */