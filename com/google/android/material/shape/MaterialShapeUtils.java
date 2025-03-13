package com.google.android.material.shape;

import android.view.View;
import com.google.android.material.internal.ViewUtils;

public class MaterialShapeUtils
{
  public static CornerTreatment createCornerTreatment(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i) {
        return createDefaultCornerTreatment();
      }
      localObject = new com/google/android/material/shape/CutCornerTreatment;
      ((CutCornerTreatment)localObject).<init>();
      return localObject;
    }
    Object localObject = new com/google/android/material/shape/RoundedCornerTreatment;
    ((RoundedCornerTreatment)localObject).<init>();
    return localObject;
  }
  
  public static CornerTreatment createDefaultCornerTreatment()
  {
    RoundedCornerTreatment localRoundedCornerTreatment = new com/google/android/material/shape/RoundedCornerTreatment;
    localRoundedCornerTreatment.<init>();
    return localRoundedCornerTreatment;
  }
  
  public static EdgeTreatment createDefaultEdgeTreatment()
  {
    EdgeTreatment localEdgeTreatment = new com/google/android/material/shape/EdgeTreatment;
    localEdgeTreatment.<init>();
    return localEdgeTreatment;
  }
  
  public static void setElevation(View paramView, float paramFloat)
  {
    paramView = paramView.getBackground();
    boolean bool = paramView instanceof MaterialShapeDrawable;
    if (bool)
    {
      paramView = (MaterialShapeDrawable)paramView;
      paramView.setElevation(paramFloat);
    }
  }
  
  public static void setParentAbsoluteElevation(View paramView)
  {
    Object localObject = paramView.getBackground();
    boolean bool = localObject instanceof MaterialShapeDrawable;
    if (bool)
    {
      localObject = (MaterialShapeDrawable)localObject;
      setParentAbsoluteElevation(paramView, (MaterialShapeDrawable)localObject);
    }
  }
  
  public static void setParentAbsoluteElevation(View paramView, MaterialShapeDrawable paramMaterialShapeDrawable)
  {
    boolean bool = paramMaterialShapeDrawable.isElevationOverlayEnabled();
    if (bool)
    {
      float f = ViewUtils.getParentAbsoluteElevation(paramView);
      paramMaterialShapeDrawable.setParentAbsoluteElevation(f);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.MaterialShapeUtils
 * JD-Core Version:    0.7.0.1
 */