package com.xuexiang.xui.widget.textview;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import m54207b69;

class ExpandableTextView$ExpandCollapseAnimation
  extends Animation
{
  public final View o00OoOoo;
  public final int o00Ooo0;
  public final int o00Ooo00;
  
  public ExpandableTextView$ExpandCollapseAnimation(ExpandableTextView paramExpandableTextView, View paramView, int paramInt1, int paramInt2)
  {
    this.o00OoOoo = paramView;
    this.o00Ooo00 = paramInt1;
    this.o00Ooo0 = paramInt2;
    long l = ExpandableTextView.OooO0oo(paramExpandableTextView);
    setDuration(l);
  }
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    arrayOfObject[2] = paramTransformation;
    m54207b69.F54207b69_00(6086, arrayOfObject);
  }
  
  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(6087, arrayOfObject);
  }
  
  public boolean willChangeBounds()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6088, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.ExpandableTextView.ExpandCollapseAnimation
 * JD-Core Version:    0.7.0.1
 */