package com.google.android.material.color;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

class DynamicColors$DynamicColorsActivityLifecycleCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  private final DynamicColorsOptions dynamicColorsOptions;
  
  public DynamicColors$DynamicColorsActivityLifecycleCallbacks(DynamicColorsOptions paramDynamicColorsOptions)
  {
    this.dynamicColorsOptions = paramDynamicColorsOptions;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityPreCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = this.dynamicColorsOptions;
    DynamicColors.applyToActivityIfAvailable(paramActivity, paramBundle);
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.DynamicColors.DynamicColorsActivityLifecycleCallbacks
 * JD-Core Version:    0.7.0.1
 */