package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

class ExtendedFloatingActionButton$6
  extends Property
{
  public ExtendedFloatingActionButton$6(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(View paramView)
  {
    return Float.valueOf(paramView.getLayoutParams().width);
  }
  
  public void set(View paramView, Float paramFloat)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i = paramFloat.intValue();
    localLayoutParams.width = i;
    paramView.requestLayout();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
 * JD-Core Version:    0.7.0.1
 */