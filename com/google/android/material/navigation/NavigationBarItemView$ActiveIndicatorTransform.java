package com.google.android.material.navigation;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;

class NavigationBarItemView$ActiveIndicatorTransform
{
  private static final float ALPHA_FRACTION = 0.2F;
  private static final float SCALE_X_HIDDEN = 0.4F;
  private static final float SCALE_X_SHOWN = 1.0F;
  
  public float calculateAlpha(float paramFloat1, float paramFloat2)
  {
    boolean bool = paramFloat2 < 0.0F;
    float f1;
    if (!bool) {
      f1 = 0.8F;
    } else {
      f1 = 0.0F;
    }
    int j = 1065353216;
    float f2 = 1.0F;
    if (!bool)
    {
      bool = j;
      paramFloat2 = f2;
    }
    else
    {
      int i = 1045220557;
      paramFloat2 = 0.2F;
    }
    return AnimationUtils.lerp(0.0F, f2, f1, paramFloat2, paramFloat1);
  }
  
  public float calculateScaleX(float paramFloat1, float paramFloat2)
  {
    return AnimationUtils.lerp(0.4F, 1.0F, paramFloat1);
  }
  
  public float calculateScaleY(float paramFloat1, float paramFloat2)
  {
    return 1.0F;
  }
  
  public void updateForProgress(float paramFloat1, float paramFloat2, View paramView)
  {
    float f = calculateScaleX(paramFloat1, paramFloat2);
    paramView.setScaleX(f);
    f = calculateScaleY(paramFloat1, paramFloat2);
    paramView.setScaleY(f);
    paramFloat1 = calculateAlpha(paramFloat1, paramFloat2);
    paramView.setAlpha(paramFloat1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
 * JD-Core Version:    0.7.0.1
 */