package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.animation.AnimationUtils;

class BaseMotionStrategy$1
  extends Property
{
  public BaseMotionStrategy$1(BaseMotionStrategy paramBaseMotionStrategy, Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(ExtendedFloatingActionButton paramExtendedFloatingActionButton)
  {
    ColorStateList localColorStateList = paramExtendedFloatingActionButton.originalTextCsl;
    int[] arrayOfInt = paramExtendedFloatingActionButton.getDrawableState();
    int i = BaseMotionStrategy.access$000(this.this$0).originalTextCsl.getDefaultColor();
    int j = Color.alpha(localColorStateList.getColorForState(arrayOfInt, i));
    float f1 = Color.alpha(paramExtendedFloatingActionButton.getCurrentTextColor()) / 255.0F;
    float f2 = j;
    f1 /= f2;
    return Float.valueOf(AnimationUtils.lerp(0.0F, 1.0F, f1));
  }
  
  public void set(ExtendedFloatingActionButton paramExtendedFloatingActionButton, Float paramFloat)
  {
    ColorStateList localColorStateList1 = paramExtendedFloatingActionButton.originalTextCsl;
    int[] arrayOfInt = paramExtendedFloatingActionButton.getDrawableState();
    ColorStateList localColorStateList2 = BaseMotionStrategy.access$000(this.this$0).originalTextCsl;
    int i = localColorStateList2.getDefaultColor();
    int j = localColorStateList1.getColorForState(arrayOfInt, i);
    float f1 = Color.alpha(j);
    float f2 = 255.0F;
    f1 /= f2;
    float f3 = paramFloat.floatValue();
    int k = (int)(AnimationUtils.lerp(0.0F, f1, f3) * f2);
    i = Color.red(j);
    int m = Color.green(j);
    j = Color.blue(j);
    j = Color.argb(k, i, m, j);
    localColorStateList1 = ColorStateList.valueOf(j);
    float f4 = paramFloat.floatValue();
    k = 1065353216;
    f1 = 1.0F;
    boolean bool = f4 < f1;
    if (!bool)
    {
      paramFloat = paramExtendedFloatingActionButton.originalTextCsl;
      paramExtendedFloatingActionButton.silentlyUpdateTextColor(paramFloat);
    }
    else
    {
      paramExtendedFloatingActionButton.silentlyUpdateTextColor(localColorStateList1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
 * JD-Core Version:    0.7.0.1
 */