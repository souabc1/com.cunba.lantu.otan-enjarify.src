package androidx.core.graphics;

import android.graphics.PorterDuff.Mode;

class BlendModeUtils
{
  public static PorterDuff.Mode OooO00o(BlendModeCompat paramBlendModeCompat)
  {
    if (paramBlendModeCompat == null) {
      return null;
    }
    int[] arrayOfInt = BlendModeUtils.1.OooO00o;
    int i = paramBlendModeCompat.ordinal();
    i = arrayOfInt[i];
    switch (i)
    {
    default: 
      return null;
    case 18: 
      return PorterDuff.Mode.LIGHTEN;
    case 17: 
      return PorterDuff.Mode.DARKEN;
    case 16: 
      return PorterDuff.Mode.OVERLAY;
    case 15: 
      return PorterDuff.Mode.SCREEN;
    case 14: 
      return PorterDuff.Mode.MULTIPLY;
    case 13: 
      return PorterDuff.Mode.ADD;
    case 12: 
      return PorterDuff.Mode.XOR;
    case 11: 
      return PorterDuff.Mode.DST_ATOP;
    case 10: 
      return PorterDuff.Mode.SRC_ATOP;
    case 9: 
      return PorterDuff.Mode.DST_OUT;
    case 8: 
      return PorterDuff.Mode.SRC_OUT;
    case 7: 
      return PorterDuff.Mode.DST_IN;
    case 6: 
      return PorterDuff.Mode.SRC_IN;
    case 5: 
      return PorterDuff.Mode.DST_OVER;
    case 4: 
      return PorterDuff.Mode.SRC_OVER;
    case 3: 
      return PorterDuff.Mode.DST;
    case 2: 
      return PorterDuff.Mode.SRC;
    }
    return PorterDuff.Mode.CLEAR;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.BlendModeUtils
 * JD-Core Version:    0.7.0.1
 */