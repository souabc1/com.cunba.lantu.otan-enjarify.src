package com.lzf.easyfloat.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class LifecycleUtils$setLifecycleCallbacks$1
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      Object localObject = LifecycleUtils.OooO0Oo();
      if (localObject != null) {
        ((Reference)localObject).clear();
      }
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramActivity);
      LifecycleUtils.OooO0o((WeakReference)localObject);
      localObject = LifecycleUtils.OooO00o;
      LifecycleUtils.OooO0O0((LifecycleUtils)localObject, paramActivity);
    }
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      int i = LifecycleUtils.OooO0OO() + 1;
      LifecycleUtils.OooO0o0(i);
    }
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      int i = LifecycleUtils.OooO0OO() + -1;
      LifecycleUtils.OooO0o0(i);
      LifecycleUtils localLifecycleUtils = LifecycleUtils.OooO00o;
      LifecycleUtils.OooO00o(localLifecycleUtils, paramActivity);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.utils.LifecycleUtils.setLifecycleCallbacks.1
 * JD-Core Version:    0.7.0.1
 */