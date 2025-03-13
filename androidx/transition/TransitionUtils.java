package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class TransitionUtils
{
  public static final boolean OooO00o;
  public static final boolean OooO0O0;
  public static final boolean OooO0OO;
  
  static
  {
    boolean bool = true;
    OooO00o = bool;
    OooO0O0 = bool;
    OooO0OO = bool;
  }
  
  public static View OooO00o(ViewGroup paramViewGroup, View paramView1, View paramView2)
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    float f1 = -paramView2.getScrollX();
    int i = -paramView2.getScrollY();
    float f2 = i;
    localMatrix.setTranslate(f1, f2);
    ViewUtils.OooOO0(paramView1, localMatrix);
    ViewUtils.OooOO0O(paramViewGroup, localMatrix);
    paramView2 = new android/graphics/RectF;
    f1 = paramView1.getWidth();
    float f3 = paramView1.getHeight();
    paramView2.<init>(0.0F, 0.0F, f1, f3);
    localMatrix.mapRect(paramView2);
    f1 = paramView2.left;
    int j = Math.round(f1);
    f3 = paramView2.top;
    int k = Math.round(f3);
    float f4 = paramView2.right;
    int m = Math.round(f4);
    float f5 = paramView2.bottom;
    int n = Math.round(f5);
    ImageView localImageView = new android/widget/ImageView;
    Object localObject = paramView1.getContext();
    localImageView.<init>((Context)localObject);
    localObject = ImageView.ScaleType.CENTER_CROP;
    localImageView.setScaleType((ImageView.ScaleType)localObject);
    paramViewGroup = OooO0O0(paramView1, localMatrix, paramView2, paramViewGroup);
    if (paramViewGroup != null) {
      localImageView.setImageBitmap(paramViewGroup);
    }
    int i1 = m - j;
    int i2 = 1073741824;
    i1 = View.MeasureSpec.makeMeasureSpec(i1, i2);
    i2 = View.MeasureSpec.makeMeasureSpec(n - k, i2);
    localImageView.measure(i1, i2);
    localImageView.layout(j, k, m, n);
    return localImageView;
  }
  
  public static Bitmap OooO0O0(View paramView, Matrix paramMatrix, RectF paramRectF, ViewGroup paramViewGroup)
  {
    boolean bool1 = OooO00o;
    ViewGroup localViewGroup = null;
    boolean bool2;
    if (bool1)
    {
      bool1 = paramView.isAttachedToWindow() ^ true;
      if (paramViewGroup == null) {
        bool2 = false;
      } else {
        bool2 = paramViewGroup.isAttachedToWindow();
      }
    }
    else
    {
      bool1 = false;
      bool2 = false;
    }
    boolean bool3 = OooO0O0;
    float f1 = 0.0F;
    Object localObject = null;
    int i;
    if ((bool3) && (bool1))
    {
      if (!bool2) {
        return null;
      }
      localViewGroup = (ViewGroup)paramView.getParent();
      i = localViewGroup.indexOfChild(paramView);
      ViewGroupOverlay localViewGroupOverlay = paramViewGroup.getOverlay();
      localViewGroupOverlay.add(paramView);
    }
    else
    {
      i = 0;
      localViewGroup = null;
    }
    float f2 = paramRectF.width();
    int j = Math.round(f2);
    float f3 = paramRectF.height();
    int k = Math.round(f3);
    if ((j > 0) && (k > 0))
    {
      f1 = j * k;
      float f4 = 8 / f1;
      f1 = Math.min(1.0F, f4);
      f2 = j * f1;
      j = Math.round(f2);
      f3 = k * f1;
      k = Math.round(f3);
      f4 = -paramRectF.left;
      float f5 = -paramRectF.top;
      paramMatrix.postTranslate(f4, f5);
      paramMatrix.postScale(f1, f1);
      boolean bool4 = OooO0OO;
      if (bool4)
      {
        paramRectF = new android/graphics/Picture;
        paramRectF.<init>();
        localObject = paramRectF.beginRecording(j, k);
        ((Canvas)localObject).concat(paramMatrix);
        paramView.draw((Canvas)localObject);
        paramRectF.endRecording();
        localObject = Bitmap.createBitmap(paramRectF);
      }
      else
      {
        paramRectF = Bitmap.Config.ARGB_8888;
        localObject = Bitmap.createBitmap(j, k, paramRectF);
        paramRectF = new android/graphics/Canvas;
        paramRectF.<init>((Bitmap)localObject);
        paramRectF.concat(paramMatrix);
        paramView.draw(paramRectF);
      }
    }
    if ((bool3) && (bool1))
    {
      paramMatrix = paramViewGroup.getOverlay();
      paramMatrix.remove(paramView);
      localViewGroup.addView(paramView, i);
    }
    return localObject;
  }
  
  public static Animator OooO0OO(Animator paramAnimator1, Animator paramAnimator2)
  {
    if (paramAnimator1 == null) {
      return paramAnimator2;
    }
    if (paramAnimator2 == null) {
      return paramAnimator1;
    }
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Animator[] arrayOfAnimator = new Animator[2];
    arrayOfAnimator[0] = paramAnimator1;
    arrayOfAnimator[1] = paramAnimator2;
    localAnimatorSet.playTogether(arrayOfAnimator);
    return localAnimatorSet;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TransitionUtils
 * JD-Core Version:    0.7.0.1
 */