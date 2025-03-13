package com.google.android.material.sidesheet;

final class SheetUtils
{
  public static boolean isSwipeMostlyHorizontal(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    boolean bool = paramFloat1 < paramFloat2;
    if (bool)
    {
      bool = true;
      paramFloat1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat1 = 0.0F;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.sidesheet.SheetUtils
 * JD-Core Version:    0.7.0.1
 */