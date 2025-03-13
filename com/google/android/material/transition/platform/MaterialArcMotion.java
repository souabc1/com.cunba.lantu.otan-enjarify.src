package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

public final class MaterialArcMotion
  extends PathMotion
{
  private static PointF getControlPoint(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool = paramFloat2 < paramFloat4;
    if (bool)
    {
      PointF localPointF1 = new android/graphics/PointF;
      localPointF1.<init>(paramFloat3, paramFloat2);
      return localPointF1;
    }
    PointF localPointF2 = new android/graphics/PointF;
    localPointF2.<init>(paramFloat1, paramFloat4);
    return localPointF2;
  }
  
  public Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    localPath.moveTo(paramFloat1, paramFloat2);
    PointF localPointF = getControlPoint(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    paramFloat2 = localPointF.x;
    paramFloat1 = localPointF.y;
    localPath.quadTo(paramFloat2, paramFloat1, paramFloat3, paramFloat4);
    return localPath;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaterialArcMotion
 * JD-Core Version:    0.7.0.1
 */