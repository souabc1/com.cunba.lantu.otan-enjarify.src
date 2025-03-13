package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class XXPermissions
{
  public static Boolean OooO0o;
  public static IPermissionInterceptor OooO0o0;
  public final List OooO00o;
  public final Context OooO0O0;
  public IPermissionInterceptor OooO0OO;
  public Boolean OooO0Oo;
  
  public XXPermissions(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO00o = localArrayList;
    this.OooO0O0 = paramContext;
  }
  
  public static void OooO0o(Activity paramActivity, List paramList, int paramInt)
  {
    paramList = PermissionUtils.OooOO0o(paramActivity, paramList);
    StartActivityManager.OooO0Oo(paramActivity, paramList, paramInt);
  }
  
  public static void OooO0o0(Activity paramActivity, List paramList)
  {
    OooO0o(paramActivity, paramList, 1025);
  }
  
  public static XXPermissions OooO0oO(Context paramContext)
  {
    XXPermissions localXXPermissions = new com/hjq/permissions/XXPermissions;
    localXXPermissions.<init>(paramContext);
    return localXXPermissions;
  }
  
  public static IPermissionInterceptor getInterceptor()
  {
    Object localObject = OooO0o0;
    if (localObject == null)
    {
      localObject = new com/hjq/permissions/XXPermissions$1;
      ((XXPermissions.1)localObject).<init>();
      OooO0o0 = (IPermissionInterceptor)localObject;
    }
    return OooO0o0;
  }
  
  public static void setCheckMode(boolean paramBoolean)
  {
    OooO0o = Boolean.valueOf(paramBoolean);
  }
  
  public static void setInterceptor(IPermissionInterceptor paramIPermissionInterceptor)
  {
    OooO0o0 = paramIPermissionInterceptor;
  }
  
  public XXPermissions OooO00o(IPermissionInterceptor paramIPermissionInterceptor)
  {
    this.OooO0OO = paramIPermissionInterceptor;
    return this;
  }
  
  public final boolean OooO0O0(Context paramContext)
  {
    Boolean localBoolean = this.OooO0Oo;
    if (localBoolean == null)
    {
      localBoolean = OooO0o;
      if (localBoolean == null)
      {
        boolean bool = PermissionUtils.OooOOO(paramContext);
        paramContext = Boolean.valueOf(bool);
        OooO0o = paramContext;
      }
      paramContext = OooO0o;
      this.OooO0Oo = paramContext;
    }
    return this.OooO0Oo.booleanValue();
  }
  
  public XXPermissions OooO0OO(String paramString)
  {
    if (paramString == null) {
      return this;
    }
    List localList = this.OooO00o;
    boolean bool = PermissionUtils.OooO0o(localList, paramString);
    if (bool) {
      return this;
    }
    this.OooO00o.add(paramString);
    return this;
  }
  
  public void OooO0Oo(OnPermissionCallback paramOnPermissionCallback)
  {
    Object localObject1 = this.OooO0O0;
    if (localObject1 == null) {
      return;
    }
    localObject1 = this.OooO0OO;
    if (localObject1 == null)
    {
      localObject1 = getInterceptor();
      this.OooO0OO = ((IPermissionInterceptor)localObject1);
    }
    localObject1 = this.OooO0O0;
    IPermissionInterceptor localIPermissionInterceptor = this.OooO0OO;
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject2 = this.OooO00o;
    localArrayList.<init>((Collection)localObject2);
    boolean bool1 = OooO0O0((Context)localObject1);
    Activity localActivity = PermissionUtils.OooO0oo((Context)localObject1);
    boolean bool2 = PermissionChecker.OooO00o(localActivity, bool1);
    if (!bool2) {
      return;
    }
    bool2 = PermissionChecker.OooOO0(localArrayList, bool1);
    if (!bool2) {
      return;
    }
    if (bool1)
    {
      localObject2 = PermissionUtils.OooOO0((Context)localObject1);
      PermissionChecker.OooO0oO((Context)localObject1, localArrayList);
      PermissionChecker.OooOOO0((Context)localObject1, localArrayList, (AndroidManifestInfo)localObject2);
      PermissionChecker.OooO0O0(localArrayList);
      PermissionChecker.OooO0OO(localArrayList);
      PermissionChecker.OooOO0O(localActivity, localArrayList, (AndroidManifestInfo)localObject2);
      PermissionChecker.OooO(localArrayList, (AndroidManifestInfo)localObject2);
      PermissionChecker.OooO0oo(localArrayList, (AndroidManifestInfo)localObject2);
      PermissionChecker.OooOO0o(localArrayList);
      PermissionChecker.OooOOO((Context)localObject1, localArrayList);
      PermissionChecker.OooO0o((Context)localObject1, localArrayList, (AndroidManifestInfo)localObject2);
    }
    PermissionChecker.OooOOOO(localArrayList);
    boolean bool3 = PermissionApi.OooOO0((Context)localObject1, localArrayList);
    if (bool3)
    {
      if (paramOnPermissionCallback != null)
      {
        boolean bool4 = true;
        localObject2 = localIPermissionInterceptor;
        localIPermissionInterceptor.OooO0O0(localActivity, localArrayList, localArrayList, bool4, paramOnPermissionCallback);
        bool3 = true;
        localIPermissionInterceptor.OooO0OO(localActivity, localArrayList, bool3, paramOnPermissionCallback);
      }
      return;
    }
    localIPermissionInterceptor.OooO00o(localActivity, localArrayList, paramOnPermissionCallback);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.XXPermissions
 * JD-Core Version:    0.7.0.1
 */