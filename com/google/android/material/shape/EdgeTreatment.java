package com.google.android.material.shape;

public class EdgeTreatment
{
  public boolean forceIntersection()
  {
    return false;
  }
  
  public void getEdgePath(float paramFloat1, float paramFloat2, float paramFloat3, ShapePath paramShapePath)
  {
    paramShapePath.lineTo(paramFloat1, 0.0F);
  }
  
  public void getEdgePath(float paramFloat1, float paramFloat2, ShapePath paramShapePath)
  {
    float f = paramFloat1 / 2.0F;
    getEdgePath(paramFloat1, f, paramFloat2, paramShapePath);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.EdgeTreatment
 * JD-Core Version:    0.7.0.1
 */