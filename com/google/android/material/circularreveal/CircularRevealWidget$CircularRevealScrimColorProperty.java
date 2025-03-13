package com.google.android.material.circularreveal;

import android.util.Property;
import m54207b69;

public class CircularRevealWidget$CircularRevealScrimColorProperty
  extends Property
{
  public static final Property CIRCULAR_REVEAL_SCRIM_COLOR;
  
  static
  {
    CircularRevealScrimColorProperty localCircularRevealScrimColorProperty = new com/google/android/material/circularreveal/CircularRevealWidget$CircularRevealScrimColorProperty;
    String str = m54207b69.F54207b69_11("83505B43534A645848695F4F615E6C6E5F516B708370747258");
    localCircularRevealScrimColorProperty.<init>(str);
    CIRCULAR_REVEAL_SCRIM_COLOR = localCircularRevealScrimColorProperty;
  }
  
  private CircularRevealWidget$CircularRevealScrimColorProperty(String paramString)
  {
    super(Integer.class, paramString);
  }
  
  public Integer get(CircularRevealWidget paramCircularRevealWidget)
  {
    return Integer.valueOf(paramCircularRevealWidget.getCircularRevealScrimColor());
  }
  
  public void set(CircularRevealWidget paramCircularRevealWidget, Integer paramInteger)
  {
    int i = paramInteger.intValue();
    paramCircularRevealWidget.setCircularRevealScrimColor(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty
 * JD-Core Version:    0.7.0.1
 */