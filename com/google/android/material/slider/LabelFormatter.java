package com.google.android.material.slider;

public abstract interface LabelFormatter
{
  public static final int LABEL_FLOATING = 0;
  public static final int LABEL_GONE = 2;
  public static final int LABEL_VISIBLE = 3;
  public static final int LABEL_WITHIN_BOUNDS = 1;
  
  public abstract String getFormattedValue(float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.LabelFormatter
 * JD-Core Version:    0.7.0.1
 */