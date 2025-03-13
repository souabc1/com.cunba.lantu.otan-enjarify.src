package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings.Global;
import m54207b69;

public class AnimatorDurationScaleProvider
{
  private static float defaultSystemAnimatorDurationScale = 1.0F;
  
  public static void setDefaultSystemAnimatorDurationScale(float paramFloat)
  {
    defaultSystemAnimatorDurationScale = paramFloat;
  }
  
  public float getSystemAnimatorDurationScale(ContentResolver paramContentResolver)
  {
    String str = m54207b69.F54207b69_11("mu141C1E1B1806200E321A0A12200E2A292B3B1829282E26");
    return Settings.Global.getFloat(paramContentResolver, str, 1.0F);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.AnimatorDurationScaleProvider
 * JD-Core Version:    0.7.0.1
 */