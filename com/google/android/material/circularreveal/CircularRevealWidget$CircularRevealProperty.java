package com.google.android.material.circularreveal;

import android.util.Property;
import m54207b69;

public class CircularRevealWidget$CircularRevealProperty
  extends Property
{
  public static final Property CIRCULAR_REVEAL;
  
  static
  {
    CircularRevealProperty localCircularRevealProperty = new com/google/android/material/circularreveal/CircularRevealWidget$CircularRevealProperty;
    String str = m54207b69.F54207b69_11("(q121905150822160A2B1D111F1C2A");
    localCircularRevealProperty.<init>(str);
    CIRCULAR_REVEAL = localCircularRevealProperty;
  }
  
  private CircularRevealWidget$CircularRevealProperty(String paramString)
  {
    super(CircularRevealWidget.RevealInfo.class, paramString);
  }
  
  public CircularRevealWidget.RevealInfo get(CircularRevealWidget paramCircularRevealWidget)
  {
    return paramCircularRevealWidget.getRevealInfo();
  }
  
  public void set(CircularRevealWidget paramCircularRevealWidget, CircularRevealWidget.RevealInfo paramRevealInfo)
  {
    paramCircularRevealWidget.setRevealInfo(paramRevealInfo);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty
 * JD-Core Version:    0.7.0.1
 */