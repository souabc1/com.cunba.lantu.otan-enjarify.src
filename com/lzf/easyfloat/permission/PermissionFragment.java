package com.lzf.easyfloat.permission;

import OooO0o.OooO00o;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.lzf.easyfloat.interfaces.OnPermissionResult;
import com.lzf.easyfloat.utils.Logger;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class PermissionFragment
  extends Fragment
{
  public static final PermissionFragment.Companion o00OoOoo;
  public static OnPermissionResult o00Ooo00;
  
  static
  {
    PermissionFragment.Companion localCompanion = new com/lzf/easyfloat/permission/PermissionFragment$Companion;
    localCompanion.<init>(null);
    o00OoOoo = localCompanion;
  }
  
  public static final void OooO0OO(PermissionFragment paramPermissionFragment)
  {
    Object localObject1 = m54207b69.F54207b69_11("1Z2E33352C826F");
    Intrinsics.OooO0o(paramPermissionFragment, (String)localObject1);
    localObject1 = paramPermissionFragment.getActivity();
    if (localObject1 == null) {
      return;
    }
    boolean bool = PermissionUtils.OooO00o((Context)localObject1);
    Object localObject2 = Logger.OooO00o;
    String str = m54207b69.F54207b69_11("vg3703170D12191A1510122B20120D18111924591B1D3B1A2A262A282E3A522033322C35806B");
    Boolean localBoolean = Boolean.valueOf(bool);
    str = Intrinsics.OooOOOO(str, localBoolean);
    ((Logger)localObject2).OooO0OO(str);
    localObject2 = o00Ooo00;
    if (localObject2 != null) {
      ((OnPermissionResult)localObject2).OooO00o(bool);
    }
    o00Ooo00 = null;
    paramPermissionFragment.getFragmentManager().beginTransaction().remove(paramPermissionFragment).commitAllowingStateLoss();
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    PermissionUtils.OooO00o.OooO0oO(this);
    Logger.OooO00o.OooO0OO("PermissionFragment：requestPermission");
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramInt2 = 199;
    if (paramInt1 == paramInt2)
    {
      Handler localHandler = new android/os/Handler;
      Object localObject = Looper.getMainLooper();
      localHandler.<init>((Looper)localObject);
      localObject = new OooO0o/OooO00o;
      ((OooO00o)localObject).<init>(this);
      long l = 500L;
      localHandler.postDelayed((Runnable)localObject, l);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.PermissionFragment
 * JD-Core Version:    0.7.0.1
 */