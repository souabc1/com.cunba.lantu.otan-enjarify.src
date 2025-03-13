package com.google.android.material.imageview;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

class ShapeableImageView$OutlineProvider
  extends ViewOutlineProvider
{
  private final Rect rect;
  
  public ShapeableImageView$OutlineProvider(ShapeableImageView paramShapeableImageView)
  {
    paramShapeableImageView = new android/graphics/Rect;
    paramShapeableImageView.<init>();
    this.rect = paramShapeableImageView;
  }
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramView = ShapeableImageView.access$000(this.this$0);
    if (paramView == null) {
      return;
    }
    paramView = ShapeableImageView.access$100(this.this$0);
    if (paramView == null)
    {
      paramView = this.this$0;
      localObject = new com/google/android/material/shape/MaterialShapeDrawable;
      ShapeAppearanceModel localShapeAppearanceModel = ShapeableImageView.access$000(this.this$0);
      ((MaterialShapeDrawable)localObject).<init>(localShapeAppearanceModel);
      ShapeableImageView.access$102(paramView, (MaterialShapeDrawable)localObject);
    }
    paramView = ShapeableImageView.access$200(this.this$0);
    Object localObject = this.rect;
    paramView.round((Rect)localObject);
    paramView = ShapeableImageView.access$100(this.this$0);
    localObject = this.rect;
    paramView.setBounds((Rect)localObject);
    ShapeableImageView.access$100(this.this$0).getOutline(paramOutline);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.imageview.ShapeableImageView.OutlineProvider
 * JD-Core Version:    0.7.0.1
 */