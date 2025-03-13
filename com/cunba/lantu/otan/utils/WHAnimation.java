package com.cunba.lantu.otan.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import m54207b69;

public class WHAnimation
  extends Animation
{
  public View o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  
  public WHAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.o00OoOoo = paramView;
    this.o00Ooo0 = paramInt1;
    this.o00Ooo00 = paramInt2;
    this.o00Ooo0O = paramInt3;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramView = paramView.toString();
    localStringBuilder.append(paramView);
    paramView = ",";
    localStringBuilder.append(paramView);
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(paramView);
    localStringBuilder.append(paramInt2);
  }
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    arrayOfObject[2] = paramTransformation;
    m54207b69.F54207b69_00(865, arrayOfObject);
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
    m54207b69.F54207b69_00(866, arrayOfObject);
  }
  
  public boolean willChangeBounds()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(867, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.utils.WHAnimation
 * JD-Core Version:    0.7.0.1
 */