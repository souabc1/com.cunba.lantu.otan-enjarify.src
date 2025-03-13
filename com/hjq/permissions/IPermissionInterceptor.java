package com.hjq.permissions;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public abstract interface IPermissionInterceptor
{
  public void OooO00o(Activity paramActivity, List paramList, OnPermissionCallback paramOnPermissionCallback)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    PermissionFragment.OooO0OO(paramActivity, localArrayList, this, paramOnPermissionCallback);
  }
  
  public void OooO0O0(Activity paramActivity, List paramList1, List paramList2, boolean paramBoolean, OnPermissionCallback paramOnPermissionCallback)
  {
    if (paramOnPermissionCallback == null) {
      return;
    }
    paramOnPermissionCallback.OooO0O0(paramList2, paramBoolean);
  }
  
  public void OooO0OO(Activity paramActivity, List paramList, boolean paramBoolean, OnPermissionCallback paramOnPermissionCallback) {}
  
  public void OooO0Oo(Activity paramActivity, List paramList1, List paramList2, boolean paramBoolean, OnPermissionCallback paramOnPermissionCallback)
  {
    if (paramOnPermissionCallback == null) {
      return;
    }
    paramOnPermissionCallback.OooO00o(paramList2, paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.IPermissionInterceptor
 * JD-Core Version:    0.7.0.1
 */