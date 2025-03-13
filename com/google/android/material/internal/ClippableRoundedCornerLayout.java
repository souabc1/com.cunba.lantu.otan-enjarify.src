package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout
  extends FrameLayout
{
  private Path path;
  
  public ClippableRoundedCornerLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public ClippableRoundedCornerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ClippableRoundedCornerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    Path localPath1 = this.path;
    if (localPath1 == null)
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    int i = paramCanvas.save();
    Path localPath2 = this.path;
    paramCanvas.clipPath(localPath2);
    super.dispatchDraw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public void resetClipBoundsAndCornerRadius()
  {
    this.path = null;
    invalidate();
  }
  
  public void updateClipBoundsAndCornerRadius(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    updateClipBoundsAndCornerRadius(localRectF, paramFloat5);
  }
  
  public void updateClipBoundsAndCornerRadius(Rect paramRect, float paramFloat)
  {
    float f1 = paramRect.left;
    float f2 = paramRect.top;
    float f3 = paramRect.right;
    float f4 = paramRect.bottom;
    updateClipBoundsAndCornerRadius(f1, f2, f3, f4, paramFloat);
  }
  
  public void updateClipBoundsAndCornerRadius(RectF paramRectF, float paramFloat)
  {
    Path localPath = this.path;
    if (localPath == null)
    {
      localPath = new android/graphics/Path;
      localPath.<init>();
      this.path = localPath;
    }
    this.path.reset();
    localPath = this.path;
    Path.Direction localDirection = Path.Direction.CW;
    localPath.addRoundRect(paramRectF, paramFloat, paramFloat, localDirection);
    this.path.close();
    invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ClippableRoundedCornerLayout
 * JD-Core Version:    0.7.0.1
 */