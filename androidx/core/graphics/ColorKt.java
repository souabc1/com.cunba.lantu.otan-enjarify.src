package androidx.core.graphics;

import android.graphics.Color;

public final class ColorKt
{
  public static final int getAlpha(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  public static final int getBlue(int paramInt)
  {
    return paramInt & 0xFF;
  }
  
  public static final int getGreen(int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }
  
  public static final float getLuminance(int paramInt)
  {
    return Color.luminance(paramInt);
  }
  
  public static final int getRed(int paramInt)
  {
    return paramInt >> 16 & 0xFF;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.ColorKt
 * JD-Core Version:    0.7.0.1
 */