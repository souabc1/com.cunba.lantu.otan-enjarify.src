package com.lzf.easyfloat.permission.rom;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import com.lzf.easyfloat.permission.PermissionUtils;
import java.lang.reflect.Method;
import m54207b69;

public class MeizuUtils
{
  public static void OooO00o(Fragment paramFragment)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localObject2 = "Ha020F0E5210090E221C581C0B13115D21141326261C2A2E664A4248515A3D4F50524544";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localIntent.<init>((String)localObject2);
      localObject2 = "BN3E302F28332E3107372C35";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject3 = paramFragment.getActivity();
      localObject3 = ((Context)localObject3).getPackageName();
      localIntent.putExtra((String)localObject2, (String)localObject3);
      int i = 199;
      paramFragment.startActivityForResult(localIntent, i);
    }
    catch (Exception localException)
    {
      try
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = "获取悬浮窗权限, 打开AppSecActivity失败, ";
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = Log.getStackTraceString(localException);
        ((StringBuilder)localObject2).append((String)localObject1);
        PermissionUtils.OooO0OO(paramFragment);
      }
      catch (Exception paramFragment)
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = "获取悬浮窗权限失败, 通用获取方法失败, ";
        ((StringBuilder)localObject1).append((String)localObject2);
        paramFragment = Log.getStackTraceString(paramFragment);
        ((StringBuilder)localObject1).append(paramFragment);
      }
    }
  }
  
  public static boolean OooO0O0(Context paramContext)
  {
    return OooO0OO(paramContext, 24);
  }
  
  public static boolean OooO0OO(Context paramContext, int paramInt)
  {
    Object localObject1 = m54207b69.F54207b69_11(";n0F1F20042222");
    localObject1 = (AppOpsManager)paramContext.getSystemService((String)localObject1);
    boolean bool1 = false;
    Object localObject2 = AppOpsManager.class;
    Object localObject3 = "3c000C08030C3119";
    try
    {
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      int i = 3;
      Class[] arrayOfClass = new Class[i];
      Object localObject4 = Integer.TYPE;
      arrayOfClass[0] = localObject4;
      boolean bool2 = true;
      arrayOfClass[bool2] = localObject4;
      localObject4 = String.class;
      int j = 2;
      arrayOfClass[j] = localObject4;
      localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject3, arrayOfClass);
      localObject3 = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      localObject3[0] = localInteger;
      paramInt = Binder.getCallingUid();
      localInteger = Integer.valueOf(paramInt);
      localObject3[bool2] = localInteger;
      paramContext = paramContext.getPackageName();
      localObject3[j] = paramContext;
      paramContext = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      paramContext = (Integer)paramContext;
      int k = paramContext.intValue();
      if (k == 0) {
        bool1 = bool2;
      }
      return bool1;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.rom.MeizuUtils
 * JD-Core Version:    0.7.0.1
 */