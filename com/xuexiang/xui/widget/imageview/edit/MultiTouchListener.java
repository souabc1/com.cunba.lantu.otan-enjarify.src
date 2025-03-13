package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import m54207b69;

class MultiTouchListener
  implements View.OnTouchListener
{
  public final GestureDetector o00OoOoo;
  public int o00Ooo0 = -1;
  public boolean o00Ooo00 = true;
  public float o00Ooo0O;
  public float o00Ooo0o;
  public int[] o00OooO;
  public ScaleGestureDetector o00OooO0;
  public Rect o00OooOO;
  public View o00OooOo;
  public MultiTouchListener.OnMultiTouchListener o00OoooO;
  public MultiTouchListener.OnGestureControl o00Ooooo;
  public OnPhotoEditorListener o00o000;
  public boolean o00o0000;
  public ImageView o0O00o0;
  
  public MultiTouchListener(View paramView, RelativeLayout paramRelativeLayout, ImageView paramImageView, boolean paramBoolean, OnPhotoEditorListener paramOnPhotoEditorListener)
  {
    int i = 2;
    paramRelativeLayout = new int[i];
    this.o00OooO = paramRelativeLayout;
    this.o00o0000 = paramBoolean;
    paramRelativeLayout = new com/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;
    Object localObject = new com/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;
    ((MultiTouchListener.ScaleGestureListener)localObject).<init>(this, null);
    paramRelativeLayout.<init>((ScaleGestureDetector.OnScaleGestureListener)localObject);
    this.o00OooO0 = paramRelativeLayout;
    paramRelativeLayout = new android/view/GestureDetector;
    localObject = new com/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;
    ((MultiTouchListener.GestureListener)localObject).<init>(this, null);
    paramRelativeLayout.<init>((GestureDetector.OnGestureListener)localObject);
    this.o00OoOoo = paramRelativeLayout;
    this.o00OooOo = paramView;
    this.o0O00o0 = paramImageView;
    this.o00o000 = paramOnPhotoEditorListener;
    if (paramView != null)
    {
      paramRelativeLayout = new android/graphics/Rect;
      int j = paramView.getLeft();
      paramBoolean = paramView.getTop();
      int k = paramView.getRight();
      int m = paramView.getBottom();
      paramRelativeLayout.<init>(j, paramBoolean, k, m);
      this.o00OooOO = paramRelativeLayout;
    }
    else
    {
      paramView = new android/graphics/Rect;
      i = 0;
      paramRelativeLayout = null;
      paramView.<init>(0, 0, 0, 0);
      this.o00OooOO = paramView;
    }
  }
  
  public static void OooO0o(View paramView, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramView;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3930, arrayOfObject);
  }
  
  public static float OooO0o0(float paramFloat)
  {
    Object[] arrayOfObject = new Object[1];
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[0] = localFloat;
    return m54207b69.F54207b69_07(3931, arrayOfObject);
  }
  
  public static void OooO0oO(View paramView, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramView;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3932, arrayOfObject);
  }
  
  public static void OooOO0(View paramView, MultiTouchListener.TransformInfo paramTransformInfo)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramView;
    arrayOfObject[1] = paramTransformInfo;
    m54207b69.F54207b69_00(3934, arrayOfObject);
  }
  
  public final boolean OooO(View paramView, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    return m54207b69.F54207b69_01(3925, arrayOfObject);
  }
  
  public final void OooO0oo(View paramView, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(3933, arrayOfObject);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    arrayOfObject[2] = paramMotionEvent;
    return m54207b69.F54207b69_01(3935, arrayOfObject);
  }
  
  public void setOnGestureControl(MultiTouchListener.OnGestureControl paramOnGestureControl)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnGestureControl;
    m54207b69.F54207b69_00(3936, arrayOfObject);
  }
  
  public void setOnMultiTouchListener(MultiTouchListener.OnMultiTouchListener paramOnMultiTouchListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnMultiTouchListener;
    m54207b69.F54207b69_00(3937, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.MultiTouchListener
 * JD-Core Version:    0.7.0.1
 */