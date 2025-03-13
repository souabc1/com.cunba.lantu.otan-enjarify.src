package com.google.android.material.shape;

import android.graphics.RectF;

public class CornerTreatment
{
  public void getCornerPath(float paramFloat1, float paramFloat2, ShapePath paramShapePath) {}
  
  public void getCornerPath(ShapePath paramShapePath, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    getCornerPath(paramFloat1, paramFloat2, paramShapePath);
  }
  
  public void getCornerPath(ShapePath paramShapePath, float paramFloat1, float paramFloat2, RectF paramRectF, CornerSize paramCornerSize)
  {
    float f = paramCornerSize.getCornerSize(paramRectF);
    getCornerPath(paramShapePath, paramFloat1, paramFloat2, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.CornerTreatment
 * JD-Core Version:    0.7.0.1
 */