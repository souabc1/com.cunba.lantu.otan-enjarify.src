package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;

public final class NavUtils
{
  public static Intent OooO00o(Activity paramActivity)
  {
    Object localObject = NavUtils.Api16Impl.OooO00o(paramActivity);
    if (localObject != null) {
      return localObject;
    }
    localObject = OooO0OO(paramActivity);
    if (localObject == null) {
      return null;
    }
    ComponentName localComponentName = new android/content/ComponentName;
    localComponentName.<init>(paramActivity, (String)localObject);
    try
    {
      paramActivity = OooO0Oo(paramActivity, localComponentName);
      if (paramActivity == null)
      {
        paramActivity = Intent.makeMainActivity(localComponentName);
      }
      else
      {
        paramActivity = new android/content/Intent;
        paramActivity.<init>();
        paramActivity = paramActivity.setComponent(localComponentName);
      }
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      paramActivity = new java/lang/StringBuilder;
      paramActivity.<init>();
      paramActivity.append("getParentActivityIntent: bad parentActivityName '");
      paramActivity.append((String)localObject);
      paramActivity.append("' in manifest");
    }
    return null;
  }
  
  public static Intent OooO0O0(Context paramContext, ComponentName paramComponentName)
  {
    String str = OooO0Oo(paramContext, paramComponentName);
    if (str == null) {
      return null;
    }
    ComponentName localComponentName = new android/content/ComponentName;
    paramComponentName = paramComponentName.getPackageName();
    localComponentName.<init>(paramComponentName, str);
    paramContext = OooO0Oo(paramContext, localComponentName);
    if (paramContext == null)
    {
      paramContext = Intent.makeMainActivity(localComponentName);
    }
    else
    {
      paramContext = new android/content/Intent;
      paramContext.<init>();
      paramContext = paramContext.setComponent(localComponentName);
    }
    return paramContext;
  }
  
  public static String OooO0OO(Activity paramActivity)
  {
    try
    {
      localObject = paramActivity.getComponentName();
      return OooO0Oo(paramActivity, (ComponentName)localObject);
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(paramActivity);
      throw ((Throwable)localObject);
    }
  }
  
  public static String OooO0Oo(Context paramContext, ComponentName paramComponentName)
  {
    Object localObject = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      i = 269222528;
    } else {
      i = 787072;
    }
    paramComponentName = ((PackageManager)localObject).getActivityInfo(paramComponentName, i);
    localObject = paramComponentName.parentActivityName;
    if (localObject != null) {
      return localObject;
    }
    paramComponentName = paramComponentName.metaData;
    int k = 0;
    localObject = null;
    if (paramComponentName == null) {
      return null;
    }
    String str = "android.support.PARENT_ACTIVITY";
    paramComponentName = paramComponentName.getString(str);
    if (paramComponentName == null) {
      return null;
    }
    localObject = null;
    k = paramComponentName.charAt(0);
    i = 46;
    if (k == i)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramContext = paramContext.getPackageName();
      ((StringBuilder)localObject).append(paramContext);
      ((StringBuilder)localObject).append(paramComponentName);
      paramComponentName = ((StringBuilder)localObject).toString();
    }
    return paramComponentName;
  }
  
  public static boolean OooO0o(Activity paramActivity, Intent paramIntent)
  {
    return NavUtils.Api16Impl.OooO0OO(paramActivity, paramIntent);
  }
  
  public static void OooO0o0(Activity paramActivity, Intent paramIntent)
  {
    NavUtils.Api16Impl.OooO0O0(paramActivity, paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NavUtils
 * JD-Core Version:    0.7.0.1
 */