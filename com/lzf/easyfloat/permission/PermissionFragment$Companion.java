package com.lzf.easyfloat.permission;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.lzf.easyfloat.interfaces.OnPermissionResult;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class PermissionFragment$Companion
{
  public final void OooO00o(Activity paramActivity, OnPermissionResult paramOnPermissionResult)
  {
    Object localObject = m54207b69.F54207b69_11(":'4645555155535965");
    Intrinsics.OooO0o(paramActivity, (String)localObject);
    localObject = m54207b69.F54207b69_11("P35C5E655945636047486366686D634E556F58");
    Intrinsics.OooO0o(paramOnPermissionResult, (String)localObject);
    PermissionFragment.OooO0O0(paramOnPermissionResult);
    paramOnPermissionResult = paramActivity.getFragmentManager().beginTransaction();
    localObject = new com/lzf/easyfloat/permission/PermissionFragment;
    ((PermissionFragment)localObject).<init>();
    paramActivity = paramActivity.getLocalClassName();
    paramOnPermissionResult.add((Fragment)localObject, paramActivity).commitAllowingStateLoss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.PermissionFragment.Companion
 * JD-Core Version:    0.7.0.1
 */