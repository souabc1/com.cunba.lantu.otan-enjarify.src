package com.hjq.permissions;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m54207b69;
import org.xmlpull.v1.XmlPullParserException;

final class PermissionUtils
{
  public static final Handler OooO00o;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    OooO00o = localHandler;
  }
  
  public static int OooO(Context paramContext, String paramString)
  {
    AssetManager localAssetManager = paramContext.getAssets();
    try
    {
      int i = AndroidVersion.OooO00o(paramContext);
      int j = 28;
      String str = String.class;
      boolean bool = true;
      if (i >= j)
      {
        i = AndroidVersion.getAndroidVersionCode();
        if (i >= j)
        {
          i = AndroidVersion.getAndroidVersionCode();
          j = 30;
          if (i < j)
          {
            localObject1 = Class.class;
            localObject2 = "'F21243405272A302E3C2C2C162F3F3C3832";
            localObject2 = m54207b69.F54207b69_11((String)localObject2);
            int k = 2;
            Object localObject3 = new Class[k];
            localObject3[0] = str;
            Class[] arrayOfClass = [Ljava.lang.Class.class;
            localObject3[bool] = arrayOfClass;
            localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
            ((AccessibleObject)localObject1).setAccessible(bool);
            localObject2 = AssetManager.class;
            Object[] arrayOfObject = new Object[k];
            localObject3 = "'[3D3337421C393A373A47273F3518483E43";
            localObject3 = m54207b69.F54207b69_11((String)localObject3);
            arrayOfObject[0] = localObject3;
            localObject3 = new Class[bool];
            localObject3[0] = str;
            arrayOfObject[bool] = localObject3;
            localObject1 = ((Method)localObject1).invoke(localObject2, arrayOfObject);
            localObject1 = (Method)localObject1;
            if (localObject1 != null)
            {
              ((AccessibleObject)localObject1).setAccessible(bool);
              paramContext = paramContext.getAssets();
              localObject2 = new Object[] { paramString };
              paramContext = ((Method)localObject1).invoke(paramContext, (Object[])localObject2);
              paramContext = (Integer)paramContext;
              if (paramContext != null) {
                return paramContext.intValue();
              }
            }
          }
        }
      }
      paramContext = localAssetManager.getClass();
      Object localObject1 = "`+4A50516D5C5D54668353694E";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      Object localObject2 = new Class[bool];
      localObject2[0] = str;
      paramContext = paramContext.getDeclaredMethod((String)localObject1, (Class[])localObject2);
      paramString = new Object[] { paramString };
      paramContext = paramContext.invoke(localAssetManager, paramString);
      paramContext = (Integer)paramContext;
      if (paramContext == null) {
        break label308;
      }
      return paramContext.intValue();
    }
    catch (InvocationTargetException paramContext) {}catch (IllegalAccessException paramContext) {}catch (NoSuchMethodException paramContext) {}
    paramContext.printStackTrace();
    label308:
    return 0;
  }
  
  public static boolean OooO00o(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    paramContext = paramContext.getPackageManager();
    boolean bool = AndroidVersion.isAndroid13();
    if (bool)
    {
      PackageManager.ResolveInfoFlags localResolveInfoFlags = OooOO0O.OooO00o(65536L);
      return OooOOO0.OooO00o(paramContext, paramIntent, localResolveInfoFlags).isEmpty() ^ true;
    }
    return paramContext.queryIntentActivities(paramIntent, 65536).isEmpty() ^ true;
  }
  
  public static ArrayList OooO0O0(Object... paramVarArgs)
  {
    int i = 0;
    int j;
    if (paramVarArgs != null) {
      j = paramVarArgs.length;
    } else {
      j = 0;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(j);
    if (paramVarArgs != null)
    {
      j = paramVarArgs.length;
      if (j != 0)
      {
        j = paramVarArgs.length;
        while (i < j)
        {
          Object localObject = paramVarArgs[i];
          localArrayList.add(localObject);
          i += 1;
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean OooO0OO(Context paramContext, String paramString)
  {
    Object localObject = m54207b69.F54207b69_11(";n0F1F20042222");
    localObject = (AppOpsManager)paramContext.getSystemService((String)localObject);
    boolean bool = AndroidVersion.isAndroid10();
    ApplicationInfo localApplicationInfo;
    int i;
    int j;
    if (bool)
    {
      localApplicationInfo = paramContext.getApplicationInfo();
      i = localApplicationInfo.uid;
      paramContext = paramContext.getPackageName();
      j = OooOO0.OooO00o((AppOpsManager)localObject, paramString, i, paramContext);
    }
    else
    {
      localApplicationInfo = paramContext.getApplicationInfo();
      i = localApplicationInfo.uid;
      paramContext = paramContext.getPackageName();
      j = ((AppOpsManager)localObject).checkOpNoThrow(paramString, i, paramContext);
    }
    if (j == 0)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramContext = null;
    }
    return j;
  }
  
  public static boolean OooO0Oo(Context paramContext, String paramString, int paramInt)
  {
    Object localObject1 = m54207b69.F54207b69_11(";n0F1F20042222");
    localObject1 = (AppOpsManager)paramContext.getSystemService((String)localObject1);
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    paramContext = paramContext.getApplicationContext().getPackageName();
    int i = localApplicationInfo.uid;
    boolean bool = true;
    Object localObject2 = AppOpsManager.class;
    try
    {
      localObject2 = ((Class)localObject2).getName();
      localObject2 = Class.forName((String)localObject2);
      try
      {
        paramString = ((Class)localObject2).getDeclaredField(paramString);
        Integer localInteger1 = Integer.class;
        paramString = paramString.get(localInteger1);
        paramString = (Integer)paramString;
        paramInt = paramString.intValue();
      }
      catch (NoSuchFieldException paramString)
      {
        paramString.printStackTrace();
      }
      paramString = "Y*4943514C456A606B4D874C63516A";
      paramString = m54207b69.F54207b69_11(paramString);
      int j = 3;
      Class[] arrayOfClass = new Class[j];
      Object localObject3 = Integer.TYPE;
      arrayOfClass[0] = localObject3;
      arrayOfClass[bool] = localObject3;
      localObject3 = String.class;
      int k = 2;
      arrayOfClass[k] = localObject3;
      paramString = ((Class)localObject2).getMethod(paramString, arrayOfClass);
      localObject2 = new Object[j];
      Integer localInteger2 = Integer.valueOf(paramInt);
      localObject2[0] = localInteger2;
      localInteger2 = Integer.valueOf(i);
      localObject2[bool] = localInteger2;
      localObject2[k] = paramContext;
      paramContext = paramString.invoke(localObject1, (Object[])localObject2);
      paramContext = (Integer)paramContext;
      int m = paramContext.intValue();
      if (m != 0) {
        bool = false;
      }
    }
    catch (ClassNotFoundException|NoSuchMethodException|InvocationTargetException|IllegalAccessException|RuntimeException localClassNotFoundException)
    {
      label221:
      break label221;
    }
    return bool;
  }
  
  public static boolean OooO0o(Collection paramCollection, String paramString)
  {
    boolean bool = paramCollection.isEmpty();
    if (bool) {
      return false;
    }
    paramCollection = paramCollection.iterator();
    do
    {
      bool = paramCollection.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)paramCollection.next();
      bool = OooO0oO(str, paramString);
    } while (!bool);
    return true;
    return false;
  }
  
  public static boolean OooO0o0(Context paramContext, String paramString)
  {
    int i = paramContext.checkSelfPermission(paramString);
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  public static boolean OooO0oO(String paramString1, String paramString2)
  {
    int i = paramString1.length();
    int j = paramString2.length();
    if (i != j) {
      return false;
    }
    j = 1;
    i -= j;
    while (i >= 0)
    {
      int k = paramString1.charAt(i);
      int m = paramString2.charAt(i);
      if (k != m) {
        return false;
      }
      i += -1;
    }
    return j;
  }
  
  public static Activity OooO0oo(Context paramContext)
  {
    do
    {
      boolean bool = paramContext instanceof Activity;
      if (bool) {
        return (Activity)paramContext;
      }
      bool = paramContext instanceof ContextWrapper;
      if (!bool) {
        break;
      }
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    } while (paramContext != null);
    return null;
  }
  
  public static AndroidManifestInfo OooOO0(Context paramContext)
  {
    Object localObject1 = paramContext.getApplicationInfo().sourceDir;
    int i = OooO(paramContext, (String)localObject1);
    Object localObject2 = null;
    if (i == 0) {
      return null;
    }
    try
    {
      localObject1 = AndroidManifestParser.OooO0O0(paramContext, i);
      try
      {
        paramContext = paramContext.getPackageName();
        String str = ((AndroidManifestInfo)localObject1).OooO00o;
        boolean bool = TextUtils.equals(paramContext, str);
        if (bool) {
          return localObject1;
        }
        return null;
      }
      catch (XmlPullParserException paramContext)
      {
        localObject2 = localObject1;
      }
      catch (IOException paramContext)
      {
        localObject2 = localObject1;
      }
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (IOException paramContext) {}
    localObject1 = localObject2;
    return localObject1;
  }
  
  public static Uri OooOO0O(Context paramContext)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("ni19090C050C13125A");
    localStringBuilder.append(str);
    paramContext = paramContext.getPackageName();
    localStringBuilder.append(paramContext);
    return Uri.parse(localStringBuilder.toString());
  }
  
  public static Intent OooOO0o(Context paramContext, List paramList)
  {
    if (paramList != null)
    {
      boolean bool1 = paramList.isEmpty();
      if (!bool1)
      {
        bool1 = PermissionApi.OooO00o(paramList);
        int j = 0;
        String str1 = null;
        int k = 1;
        int i;
        if (!bool1)
        {
          i = paramList.size();
          if (i != k) {}
        }
        do
        {
          paramList = (String)paramList.get(0);
          return PermissionApi.OooO0o0(paramContext, paramList);
          return PermissionIntentManager.OooO00o(paramContext);
          i = paramList.size();
        } while (i == k);
        j = 2;
        boolean bool2;
        String str2;
        boolean bool3;
        boolean bool4;
        if (i != j)
        {
          j = 3;
          if (i == j)
          {
            bool2 = AndroidVersion.isAndroid11();
            if (bool2)
            {
              str2 = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
              bool3 = OooO0o(paramList, str2);
              if (bool3)
              {
                str1 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
                bool3 = OooO0o(paramList, str1);
                if (bool3)
                {
                  str1 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
                  bool4 = OooO0o(paramList, str1);
                  if (bool4) {
                    return PermissionApi.OooO0o0(paramContext, str2);
                  }
                }
              }
            }
          }
        }
        else
        {
          bool2 = AndroidVersion.isAndroid13();
          if (!bool2)
          {
            str2 = m54207b69.F54207b69_11("2[3A36412C3837457C334733413E35364144468728282428342A31342A2E313323283F2B30363D44");
            bool3 = OooO0o(paramList, str2);
            if (bool3)
            {
              str1 = m54207b69.F54207b69_11("Q4555B52495F6256214C5A50646954556C6B6B2C778F7C768292947A988E9A9594809E9D9D8B");
              bool4 = OooO0o(paramList, str1);
              if (bool4) {
                return PermissionApi.OooO0o0(paramContext, str2);
              }
            }
          }
        }
        return PermissionIntentManager.OooO00o(paramContext);
      }
    }
    return PermissionIntentManager.OooO00o(paramContext);
  }
  
  public static boolean OooOOO(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    int i = paramContext.flags & 0x2;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  public static boolean OooOOO0(Activity paramActivity)
  {
    boolean bool = AndroidVersion.isAndroid11();
    if (bool) {
      paramActivity = OooO.OooO00o(paramActivity);
    } else {
      paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
    }
    int j = paramActivity.getRotation();
    int i = 2;
    if (j != i)
    {
      i = 3;
      if (j != i) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean OooOOOO(Context paramContext)
  {
    String str = "m:695A574D63636F555D5165686B";
    try
    {
      str = m54207b69.F54207b69_11(str);
      PackageManager localPackageManager = paramContext.getPackageManager();
      paramContext = paramContext.getPackageName();
      int i = 128;
      paramContext = localPackageManager.getApplicationInfo(paramContext, i);
      paramContext = paramContext.metaData;
      if (paramContext != null)
      {
        boolean bool = paramContext.containsKey(str);
        if (bool)
        {
          paramContext = paramContext.get(str);
          paramContext = String.valueOf(paramContext);
          return Boolean.parseBoolean(paramContext);
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static void OooOOOo(Activity paramActivity)
  {
    try
    {
      Object localObject = paramActivity.getResources();
      localObject = ((Resources)localObject).getConfiguration();
      int i = ((Configuration)localObject).orientation;
      int k = 1;
      if (i != k)
      {
        k = 2;
        if (i == k)
        {
          boolean bool1 = OooOOO0(paramActivity);
          int j;
          if (bool1)
          {
            j = 8;
          }
          else
          {
            j = 0;
            localObject = null;
          }
          paramActivity.setRequestedOrientation(j);
        }
      }
      else
      {
        boolean bool2 = OooOOO0(paramActivity);
        if (bool2) {
          k = 9;
        }
        paramActivity.setRequestedOrientation(k);
      }
    }
    catch (IllegalStateException paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
  
  public static void OooOOo(List paramList, Runnable paramRunnable)
  {
    boolean bool1 = AndroidVersion.isAndroid11();
    long l1 = 300L;
    double d1 = 1.48219693752374E-321D;
    long l2;
    double d2;
    if (bool1)
    {
      l2 = 200L;
      d2 = 9.881312916824931E-322D;
    }
    else
    {
      l2 = l1;
      d2 = d1;
    }
    bool1 = PhoneRomUtils.isEmui();
    if (!bool1)
    {
      bool1 = PhoneRomUtils.isHarmonyOs();
      if (!bool1)
      {
        bool1 = PhoneRomUtils.isMiui();
        if (bool1)
        {
          bool1 = AndroidVersion.isAndroid11();
          if (bool1)
          {
            String str = m54207b69.F54207b69_11("T7565A55485C6359204F5B4F656A51526D686A2B78867B78897C7C82998C969684928997998788988C9691A2928FABA8AD9DA795B1ACAE9A");
            bool2 = OooO0o(paramList, str);
            if (bool2)
            {
              l1 = 1000L;
              d1 = 4.940656458412465E-321D;
              break label137;
            }
          }
        }
        l1 = l2;
        d1 = d2;
        break label137;
      }
    }
    boolean bool2 = AndroidVersion.isAndroid8();
    if (!bool2)
    {
      l1 = 500L;
      d1 = 2.470328229206233E-321D;
    }
    label137:
    OooOOoo(paramRunnable, l1);
  }
  
  public static void OooOOo0(Activity paramActivity, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfString.length;
      if (i >= j) {
        break;
      }
      String str1 = paramArrayOfString[i];
      boolean bool1 = PermissionApi.OooOO0O(str1);
      if (bool1)
      {
        j = PermissionApi.OooO0o(paramActivity, str1);
        paramArrayOfInt[i] = j;
      }
      else
      {
        String str2 = m54207b69.F54207b69_11("4L2F24236531272E452B2E326D48364C30355051383737782221312D201E3C362C20212B2B3732424347");
        bool1 = OooO0oO(str1, str2);
        if (bool1)
        {
          j = PermissionApi.OooO0o(paramActivity, str1);
          paramArrayOfInt[i] = j;
        }
        else
        {
          bool1 = AndroidVersion.isAndroid14();
          if (bool1)
          {
            str2 = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
            bool1 = OooO0oO(str1, str2);
            if (!bool1)
            {
              str2 = m54207b69.F54207b69_11("IY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232D2F3D3D38");
              bool1 = OooO0oO(str1, str2);
              if (!bool1) {}
            }
            else
            {
              j = PermissionApi.OooO0o(paramActivity, str1);
              paramArrayOfInt[i] = j;
              break label250;
            }
          }
          bool1 = AndroidVersion.isAndroid13();
          if (bool1)
          {
            int k = AndroidVersion.OooO00o(paramActivity);
            n = 33;
            if (k >= n)
            {
              str2 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
              boolean bool2 = OooO0oO(str1, str2);
              if (bool2)
              {
                j = PermissionApi.OooO0o(paramActivity, str1);
                paramArrayOfInt[i] = j;
                break label250;
              }
            }
          }
          int m = Permission.OooO00o(str1);
          int n = AndroidVersion.getAndroidVersionCode();
          if (m > n)
          {
            j = PermissionApi.OooO0o(paramActivity, str1);
            paramArrayOfInt[i] = j;
          }
        }
      }
      label250:
      i += 1;
    }
  }
  
  public static void OooOOoo(Runnable paramRunnable, long paramLong)
  {
    OooO00o.postDelayed(paramRunnable, paramLong);
  }
  
  public static boolean OooOo00(Activity paramActivity, String paramString)
  {
    int i = AndroidVersion.getAndroidVersionCode();
    int j = 31;
    if (i == j)
    {
      try
      {
        Object localObject1 = paramActivity.getApplication();
        localObject1 = ((Context)localObject1).getPackageManager();
        Object localObject2 = PackageManager.class;
        Object localObject3 = "S<4F55554C545D755B5B5478645956675E587D6B61656A65666D6C6C8979657372727E727C";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        int k = 1;
        Class[] arrayOfClass = new Class[k];
        String str = String.class;
        arrayOfClass[0] = str;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, arrayOfClass);
        localObject3 = new Object[] { paramString };
        localObject1 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
        localObject1 = (Boolean)localObject1;
        return ((Boolean)localObject1).booleanValue();
      }
      catch (IllegalAccessException localIllegalAccessException) {}catch (InvocationTargetException localInvocationTargetException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
      localNoSuchMethodException.printStackTrace();
    }
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionUtils
 * JD-Core Version:    0.7.0.1
 */