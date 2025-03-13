package com.hjq.permissions;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import m54207b69;

final class StartActivityManager
{
  public static Intent OooO00o(Intent paramIntent1, Intent paramIntent2)
  {
    if ((paramIntent1 == null) && (paramIntent2 != null)) {
      return paramIntent2;
    }
    if (paramIntent2 == null) {
      return paramIntent1;
    }
    Intent localIntent = OooO0O0(paramIntent1);
    String str = m54207b69.F54207b69_11("3r010812301F210C1E240F37242318");
    localIntent.putExtra(str, paramIntent2);
    return paramIntent1;
  }
  
  public static Intent OooO0O0(Intent paramIntent)
  {
    Intent localIntent = OooO0OO(paramIntent);
    if (localIntent != null) {
      paramIntent = OooO0O0(localIntent);
    }
    return paramIntent;
  }
  
  public static Intent OooO0OO(Intent paramIntent)
  {
    boolean bool = AndroidVersion.isAndroid13();
    String str = m54207b69.F54207b69_11("3r010812301F210C1E240F37242318");
    if (bool)
    {
      Intent localIntent = Intent.class;
      paramIntent = OooOOO.OooO00o(paramIntent, str, localIntent);
    }
    else
    {
      paramIntent = paramIntent.getParcelableExtra(str);
    }
    return (Intent)paramIntent;
  }
  
  public static boolean OooO0Oo(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    StartActivityManager.StartActivityDelegateActivityImpl localStartActivityDelegateActivityImpl = new com/hjq/permissions/StartActivityManager$StartActivityDelegateActivityImpl;
    localStartActivityDelegateActivityImpl.<init>(paramActivity, null);
    return OooO0o(localStartActivityDelegateActivityImpl, paramIntent, paramInt);
  }
  
  public static boolean OooO0o(StartActivityManager.IStartActivityDelegate paramIStartActivityDelegate, Intent paramIntent, int paramInt)
  {
    try
    {
      paramIStartActivityDelegate.OooO00o(paramIntent, paramInt);
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      paramIntent = OooO0OO(paramIntent);
      if (paramIntent == null) {
        return false;
      }
    }
    return OooO0o(paramIStartActivityDelegate, paramIntent, paramInt);
  }
  
  public static boolean OooO0o0(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    StartActivityManager.StartActivityDelegateFragmentImpl localStartActivityDelegateFragmentImpl = new com/hjq/permissions/StartActivityManager$StartActivityDelegateFragmentImpl;
    localStartActivityDelegateFragmentImpl.<init>(paramFragment, null);
    return OooO0o(localStartActivityDelegateFragmentImpl, paramIntent, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.StartActivityManager
 * JD-Core Version:    0.7.0.1
 */