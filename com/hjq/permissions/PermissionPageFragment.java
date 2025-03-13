package com.hjq.permissions;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public final class PermissionPageFragment
  extends Fragment
  implements Runnable
{
  public OnPermissionPageCallback o00OoOoo;
  public boolean o00Ooo0;
  public boolean o00Ooo00;
  
  public void OooO00o(Activity paramActivity)
  {
    paramActivity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramInt2 = 1025;
    if (paramInt1 != paramInt2) {
      return;
    }
    Object localObject = getActivity();
    Bundle localBundle = getArguments();
    if ((localObject != null) && (localBundle != null))
    {
      localObject = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
      localObject = localBundle.getStringArrayList((String)localObject);
      if (localObject != null)
      {
        paramInt2 = ((ArrayList)localObject).isEmpty();
        if (paramInt2 == 0) {
          PermissionUtils.OooOOo((List)localObject, this);
        }
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    boolean bool = this.o00Ooo00;
    if (!bool)
    {
      localObject1 = getActivity();
      OooO00o((Activity)localObject1);
      return;
    }
    bool = this.o00Ooo0;
    if (bool) {
      return;
    }
    bool = true;
    this.o00Ooo0 = bool;
    Object localObject1 = getArguments();
    Object localObject2 = getActivity();
    if ((localObject1 != null) && (localObject2 != null))
    {
      localObject2 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
      localObject1 = ((Bundle)localObject1).getStringArrayList((String)localObject2);
      localObject2 = getActivity();
      localObject1 = PermissionUtils.OooOO0o((Context)localObject2, (List)localObject1);
      int i = 1025;
      StartActivityManager.OooO0o0(this, (Intent)localObject1, i);
    }
  }
  
  public void run()
  {
    boolean bool = isAdded();
    if (!bool) {
      return;
    }
    Activity localActivity = getActivity();
    if (localActivity == null) {
      return;
    }
    OnPermissionPageCallback localOnPermissionPageCallback = this.o00OoOoo;
    int i = 0;
    Object localObject1 = null;
    this.o00OoOoo = null;
    if (localOnPermissionPageCallback == null)
    {
      OooO00o(localActivity);
      return;
    }
    localObject1 = getArguments();
    Object localObject2 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
    localObject1 = ((Bundle)localObject1).getStringArrayList((String)localObject2);
    localObject2 = PermissionApi.OooO0OO(localActivity, (List)localObject1);
    int j = ((List)localObject2).size();
    i = ((List)localObject1).size();
    if (j == i) {
      localOnPermissionPageCallback.OooO00o();
    } else {
      localOnPermissionPageCallback.OooO0O0();
    }
    OooO00o(localActivity);
  }
  
  public void setCallBack(OnPermissionPageCallback paramOnPermissionPageCallback)
  {
    this.o00OoOoo = paramOnPermissionPageCallback;
  }
  
  public void setRequestFlag(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionPageFragment
 * JD-Core Version:    0.7.0.1
 */