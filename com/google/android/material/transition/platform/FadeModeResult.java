package com.google.android.material.transition.platform;

class FadeModeResult
{
  final int endAlpha;
  final boolean endOnTop;
  final int startAlpha;
  
  private FadeModeResult(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.startAlpha = paramInt1;
    this.endAlpha = paramInt2;
    this.endOnTop = paramBoolean;
  }
  
  public static FadeModeResult endOnTop(int paramInt1, int paramInt2)
  {
    FadeModeResult localFadeModeResult = new com/google/android/material/transition/platform/FadeModeResult;
    localFadeModeResult.<init>(paramInt1, paramInt2, true);
    return localFadeModeResult;
  }
  
  public static FadeModeResult startOnTop(int paramInt1, int paramInt2)
  {
    FadeModeResult localFadeModeResult = new com/google/android/material/transition/platform/FadeModeResult;
    localFadeModeResult.<init>(paramInt1, paramInt2, false);
    return localFadeModeResult;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.FadeModeResult
 * JD-Core Version:    0.7.0.1
 */