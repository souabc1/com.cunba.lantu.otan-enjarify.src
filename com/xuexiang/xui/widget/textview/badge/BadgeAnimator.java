package com.xuexiang.xui.widget.textview.badge;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import m54207b69;

public class BadgeAnimator
  extends ValueAnimator
{
  public BadgeAnimator.BitmapFragment[][] o00OoOoo;
  public WeakReference o00Ooo00;
  
  public BadgeAnimator(Bitmap paramBitmap, PointF paramPointF, BadgeView paramBadgeView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramBadgeView);
    this.o00Ooo00 = localWeakReference;
    paramBadgeView = new float[2];
    BadgeView tmp26_25 = paramBadgeView;
    tmp26_25[0] = 0.0F;
    tmp26_25[1] = 1.0F;
    setFloatValues(paramBadgeView);
    setDuration(500L);
    paramBitmap = OooO0OO(paramBitmap, paramPointF);
    this.o00OoOoo = paramBitmap;
    paramBitmap = new com/xuexiang/xui/widget/textview/badge/BadgeAnimator$1;
    paramBitmap.<init>(this);
    addUpdateListener(paramBitmap);
    paramBitmap = new com/xuexiang/xui/widget/textview/badge/BadgeAnimator$2;
    paramBitmap.<init>(this);
    addListener(paramBitmap);
  }
  
  public void OooO0O0(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(6224, arrayOfObject);
  }
  
  public final BadgeAnimator.BitmapFragment[][] OooO0OO(Bitmap paramBitmap, PointF paramPointF)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k = Math.min(i, j);
    float f1 = k / 6.0F;
    float f2 = paramPointF.x;
    float f3 = paramBitmap.getWidth();
    float f4 = 2.0F;
    f3 /= f4;
    f2 -= f3;
    float f5 = paramPointF.y;
    f3 = paramBitmap.getHeight() / f4;
    f5 -= f3;
    f3 = j / f1;
    int m = (int)f3;
    int n = (int)(i / f1);
    Object localObject1 = { m, n };
    localObject1 = (BadgeAnimator.BitmapFragment[][])Array.newInstance(BadgeAnimator.BitmapFragment.class, (int[])localObject1);
    n = 0;
    f4 = 0.0F;
    int i1 = 0;
    for (;;)
    {
      int i2 = localObject1.length;
      if (i1 >= i2) {
        break;
      }
      i2 = 0;
      for (;;)
      {
        BadgeAnimator.BitmapFragment localBitmapFragment = localObject1[i1];
        int i3 = localBitmapFragment.length;
        if (i2 >= i3) {
          break;
        }
        localBitmapFragment = new com/xuexiang/xui/widget/textview/badge/BadgeAnimator$BitmapFragment;
        localBitmapFragment.<init>();
        float f6 = i2 * f1;
        int i4 = (int)f6;
        float f7 = i1 * f1;
        int i5 = (int)f7;
        i4 = paramBitmap.getPixel(i4, i5);
        localBitmapFragment.OooO0o0 = i4;
        f6 += f2;
        localBitmapFragment.OooO0O0 = f6;
        f7 += f5;
        localBitmapFragment.OooO0OO = f7;
        localBitmapFragment.OooO0Oo = f1;
        int i6 = Math.max(i, j);
        localBitmapFragment.OooO0o = i6;
        Object localObject2 = localObject1[i1];
        localObject2[i2] = localBitmapFragment;
        i2 += 1;
      }
      i1 += 1;
    }
    paramBitmap.recycle();
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.badge.BadgeAnimator
 * JD-Core Version:    0.7.0.1
 */