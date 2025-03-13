package com.google.android.material.carousel;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.ShapeAppearanceModel;

class MaskableFrameLayout$MaskableDelegateV22$1
  extends ViewOutlineProvider
{
  public MaskableFrameLayout$MaskableDelegateV22$1(MaskableFrameLayout.MaskableDelegateV22 paramMaskableDelegateV22) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramView = this.this$0;
    Object localObject = paramView.shapeAppearanceModel;
    if (localObject != null)
    {
      paramView = paramView.maskBounds;
      boolean bool = paramView.isEmpty();
      if (!bool)
      {
        paramView = this.this$0;
        localObject = paramView.maskBounds;
        int i = (int)((RectF)localObject).left;
        int j = (int)((RectF)localObject).top;
        int k = (int)((RectF)localObject).right;
        float f1 = ((RectF)localObject).bottom;
        int m = (int)f1;
        ShapeAppearanceModel localShapeAppearanceModel = paramView.shapeAppearanceModel;
        float f2 = MaskableFrameLayout.MaskableDelegateV22.access$200(paramView, localShapeAppearanceModel, (RectF)localObject);
        paramOutline.setRoundRect(i, j, k, m, f2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV22.1
 * JD-Core Version:    0.7.0.1
 */