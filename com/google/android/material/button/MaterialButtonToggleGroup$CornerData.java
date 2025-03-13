package com.google.android.material.button;

import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;

class MaterialButtonToggleGroup$CornerData
{
  private static final CornerSize noCorner;
  CornerSize bottomLeft;
  CornerSize bottomRight;
  CornerSize topLeft;
  CornerSize topRight;
  
  static
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    localAbsoluteCornerSize.<init>(0.0F);
    noCorner = localAbsoluteCornerSize;
  }
  
  public MaterialButtonToggleGroup$CornerData(CornerSize paramCornerSize1, CornerSize paramCornerSize2, CornerSize paramCornerSize3, CornerSize paramCornerSize4)
  {
    this.topLeft = paramCornerSize1;
    this.topRight = paramCornerSize3;
    this.bottomRight = paramCornerSize4;
    this.bottomLeft = paramCornerSize2;
  }
  
  public static CornerData bottom(CornerData paramCornerData)
  {
    CornerData localCornerData = new com/google/android/material/button/MaterialButtonToggleGroup$CornerData;
    CornerSize localCornerSize1 = noCorner;
    CornerSize localCornerSize2 = paramCornerData.bottomLeft;
    paramCornerData = paramCornerData.bottomRight;
    localCornerData.<init>(localCornerSize1, localCornerSize2, localCornerSize1, paramCornerData);
    return localCornerData;
  }
  
  public static CornerData end(CornerData paramCornerData, View paramView)
  {
    boolean bool = ViewUtils.isLayoutRtl(paramView);
    if (bool) {
      paramCornerData = left(paramCornerData);
    } else {
      paramCornerData = right(paramCornerData);
    }
    return paramCornerData;
  }
  
  public static CornerData left(CornerData paramCornerData)
  {
    CornerData localCornerData = new com/google/android/material/button/MaterialButtonToggleGroup$CornerData;
    CornerSize localCornerSize1 = paramCornerData.topLeft;
    paramCornerData = paramCornerData.bottomLeft;
    CornerSize localCornerSize2 = noCorner;
    localCornerData.<init>(localCornerSize1, paramCornerData, localCornerSize2, localCornerSize2);
    return localCornerData;
  }
  
  public static CornerData right(CornerData paramCornerData)
  {
    CornerData localCornerData = new com/google/android/material/button/MaterialButtonToggleGroup$CornerData;
    CornerSize localCornerSize1 = noCorner;
    CornerSize localCornerSize2 = paramCornerData.topRight;
    paramCornerData = paramCornerData.bottomRight;
    localCornerData.<init>(localCornerSize1, localCornerSize1, localCornerSize2, paramCornerData);
    return localCornerData;
  }
  
  public static CornerData start(CornerData paramCornerData, View paramView)
  {
    boolean bool = ViewUtils.isLayoutRtl(paramView);
    if (bool) {
      paramCornerData = right(paramCornerData);
    } else {
      paramCornerData = left(paramCornerData);
    }
    return paramCornerData;
  }
  
  public static CornerData top(CornerData paramCornerData)
  {
    CornerData localCornerData = new com/google/android/material/button/MaterialButtonToggleGroup$CornerData;
    CornerSize localCornerSize1 = paramCornerData.topLeft;
    CornerSize localCornerSize2 = noCorner;
    paramCornerData = paramCornerData.topRight;
    localCornerData.<init>(localCornerSize1, localCornerSize2, paramCornerData, localCornerSize2);
    return localCornerData;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.button.MaterialButtonToggleGroup.CornerData
 * JD-Core Version:    0.7.0.1
 */