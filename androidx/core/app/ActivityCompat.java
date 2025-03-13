package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.os.BuildCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ActivityCompat
  extends ContextCompat
{
  public static ActivityCompat.PermissionCompatDelegate OooO0OO;
  
  public static void OooOOO(Activity paramActivity)
  {
    paramActivity.recreate();
  }
  
  public static void OooOOO0(Activity paramActivity)
  {
    ActivityCompat.Api16Impl.OooO00o(paramActivity);
  }
  
  public static void OooOOOO(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    Object localObject1 = OooO0OO;
    if (localObject1 != null)
    {
      bool1 = ((ActivityCompat.PermissionCompatDelegate)localObject1).OooO00o(paramActivity, paramArrayOfString, paramInt);
      if (bool1) {
        return;
      }
    }
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int i = 0;
    int j = 0;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      int k = paramArrayOfString.length;
      if (j >= k) {
        break label182;
      }
      localObject2 = paramArrayOfString[j];
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool2) {
        break;
      }
      bool2 = BuildCompat.isAtLeastT();
      if (!bool2)
      {
        localObject2 = paramArrayOfString[j];
        localObject3 = "android.permission.POST_NOTIFICATIONS";
        bool2 = TextUtils.equals((CharSequence)localObject2, (CharSequence)localObject3);
        if (bool2)
        {
          localObject2 = Integer.valueOf(j);
          ((Set)localObject1).add(localObject2);
        }
      }
      j += 1;
    }
    paramActivity = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Permission request for permissions ");
    paramArrayOfString = Arrays.toString(paramArrayOfString);
    localStringBuilder.append(paramArrayOfString);
    localStringBuilder.append(" must not contain null or empty values");
    paramArrayOfString = localStringBuilder.toString();
    paramActivity.<init>(paramArrayOfString);
    throw paramActivity;
    label182:
    j = ((Set)localObject1).size();
    if (j > 0)
    {
      int m = paramArrayOfString.length - j;
      localObject2 = new String[m];
    }
    else
    {
      localObject2 = paramArrayOfString;
    }
    if (j > 0)
    {
      int n = paramArrayOfString.length;
      if (j == n) {
        return;
      }
      j = 0;
      for (;;)
      {
        n = paramArrayOfString.length;
        if (i >= n) {
          break;
        }
        localObject3 = Integer.valueOf(i);
        boolean bool3 = ((Set)localObject1).contains(localObject3);
        if (!bool3)
        {
          int i1 = j + 1;
          String str = paramArrayOfString[i];
          localObject2[j] = str;
          j = i1;
        }
        i += 1;
      }
    }
    boolean bool1 = paramActivity instanceof ActivityCompat.RequestPermissionsRequestCodeValidator;
    if (bool1)
    {
      localObject1 = paramActivity;
      localObject1 = (ActivityCompat.RequestPermissionsRequestCodeValidator)paramActivity;
      ((ActivityCompat.RequestPermissionsRequestCodeValidator)localObject1).OooO0O0(paramInt);
    }
    ActivityCompat.Api23Impl.OooO0O0((Activity)paramActivity, paramArrayOfString, paramInt);
  }
  
  public static void OooOOOo(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    ActivityCompat.SharedElementCallback21Impl localSharedElementCallback21Impl;
    if (paramSharedElementCallback != null)
    {
      localSharedElementCallback21Impl = new androidx/core/app/ActivityCompat$SharedElementCallback21Impl;
      localSharedElementCallback21Impl.<init>(paramSharedElementCallback);
    }
    else
    {
      localSharedElementCallback21Impl = null;
    }
    ActivityCompat.Api21Impl.OooO0OO(paramActivity, localSharedElementCallback21Impl);
  }
  
  public static boolean OooOOo(Activity paramActivity, String paramString)
  {
    boolean bool = BuildCompat.isAtLeastT();
    if (!bool)
    {
      String str = "android.permission.POST_NOTIFICATIONS";
      bool = TextUtils.equals(str, paramString);
      if (bool) {
        return false;
      }
    }
    return ActivityCompat.Api23Impl.OooO0OO(paramActivity, paramString);
  }
  
  public static void OooOOo0(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    ActivityCompat.SharedElementCallback21Impl localSharedElementCallback21Impl;
    if (paramSharedElementCallback != null)
    {
      localSharedElementCallback21Impl = new androidx/core/app/ActivityCompat$SharedElementCallback21Impl;
      localSharedElementCallback21Impl.<init>(paramSharedElementCallback);
    }
    else
    {
      localSharedElementCallback21Impl = null;
    }
    ActivityCompat.Api21Impl.OooO0Oo(paramActivity, localSharedElementCallback21Impl);
  }
  
  public static void OooOOoo(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    ActivityCompat.Api16Impl.OooO0O0(paramActivity, paramIntent, paramInt, paramBundle);
  }
  
  public static void OooOo00(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    ActivityCompat.Api16Impl.OooO0OO(paramActivity, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public static ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate()
  {
    return OooO0OO;
  }
  
  public static void setPermissionCompatDelegate(ActivityCompat.PermissionCompatDelegate paramPermissionCompatDelegate)
  {
    OooO0OO = paramPermissionCompatDelegate;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat
 * JD-Core Version:    0.7.0.1
 */