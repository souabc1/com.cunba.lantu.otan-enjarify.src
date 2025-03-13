package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BuildCompat;
import androidx.core.util.ObjectsCompat;
import java.io.File;
import java.util.concurrent.Executor;

public class ContextCompat
{
  public static final Object OooO00o;
  public static final Object OooO0O0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0O0 = localObject;
  }
  
  public static Object OooO(Context paramContext, Class paramClass)
  {
    return ContextCompat.Api23Impl.OooO0O0(paramContext, paramClass);
  }
  
  public static int OooO00o(Context paramContext, String paramString)
  {
    String str = "permission must be non-null";
    ObjectsCompat.OooO0Oo(paramString, str);
    boolean bool1 = BuildCompat.isAtLeastT();
    if (!bool1)
    {
      str = "android.permission.POST_NOTIFICATIONS";
      bool1 = TextUtils.equals(str, paramString);
      if (bool1)
      {
        paramContext = NotificationManagerCompat.OooO0o0(paramContext);
        boolean bool2 = paramContext.OooO00o();
        int j;
        if (bool2)
        {
          bool2 = false;
          paramContext = null;
        }
        else
        {
          j = -1;
        }
        return j;
      }
    }
    int i = Process.myPid();
    int k = Process.myUid();
    return paramContext.checkPermission(paramString, i, k);
  }
  
  public static Context OooO0O0(Context paramContext)
  {
    return ContextCompat.Api24Impl.OooO00o(paramContext);
  }
  
  public static int OooO0OO(Context paramContext, int paramInt)
  {
    return ContextCompat.Api23Impl.OooO00o(paramContext, paramInt);
  }
  
  public static ColorStateList OooO0Oo(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    paramContext = paramContext.getTheme();
    return ResourcesCompat.OooO0Oo(localResources, paramInt, paramContext);
  }
  
  public static File[] OooO0o(Context paramContext)
  {
    return ContextCompat.Api19Impl.OooO00o(paramContext);
  }
  
  public static Drawable OooO0o0(Context paramContext, int paramInt)
  {
    return ContextCompat.Api21Impl.OooO0O0(paramContext, paramInt);
  }
  
  public static File[] OooO0oO(Context paramContext, String paramString)
  {
    return ContextCompat.Api19Impl.OooO0O0(paramContext, paramString);
  }
  
  public static Executor OooO0oo(Context paramContext)
  {
    return ContextCompat.Api28Impl.OooO00o(paramContext);
  }
  
  public static String OooOO0(Context paramContext)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramContext.getPackageName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    int i = PermissionChecker.OooO0O0(paramContext, (String)localObject1);
    if (i == 0) {
      return localObject1;
    }
    paramContext = new java/lang/RuntimeException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Permission ");
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" is required by your application to receive broadcasts, please add it to your manifest");
    localObject1 = ((StringBuilder)localObject2).toString();
    paramContext.<init>((String)localObject1);
    throw paramContext;
  }
  
  public static boolean OooOO0O(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    ContextCompat.Api16Impl.OooO00o(paramContext, paramArrayOfIntent, paramBundle);
    return true;
  }
  
  public static void OooOO0o(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    ContextCompat.Api16Impl.OooO0O0(paramContext, paramIntent, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.ContextCompat
 * JD-Core Version:    0.7.0.1
 */