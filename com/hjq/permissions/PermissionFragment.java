package com.hjq.permissions;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import m54207b69;

public final class PermissionFragment
  extends Fragment
  implements Runnable
{
  public static final List o00OooO;
  public boolean o00OoOoo;
  public boolean o00Ooo0;
  public boolean o00Ooo00;
  public OnPermissionCallback o00Ooo0O;
  public IPermissionInterceptor o00Ooo0o;
  public int o00OooO0;
  
  static
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    o00OooO = localArrayList;
  }
  
  public static void OooO0OO(Activity paramActivity, ArrayList paramArrayList, IPermissionInterceptor paramIPermissionInterceptor, OnPermissionCallback paramOnPermissionCallback)
  {
    PermissionFragment localPermissionFragment = new com/hjq/permissions/PermissionFragment;
    localPermissionFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    int j;
    boolean bool1;
    do
    {
      localObject1 = new java/util/Random;
      ((Random)localObject1).<init>();
      double d1 = 8.0D;
      double d2 = Math.pow(2.0D, d1);
      int i = (int)d2;
      j = ((Random)localObject1).nextInt(i);
      localObject2 = o00OooO;
      localInteger = Integer.valueOf(j);
      bool1 = ((List)localObject2).contains(localInteger);
    } while (bool1);
    Integer localInteger = Integer.valueOf(j);
    ((List)localObject2).add(localInteger);
    Object localObject2 = m54207b69.F54207b69_11("hA3325323728373B252A372F2F");
    localBundle.putInt((String)localObject2, j);
    Object localObject1 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
    localBundle.putStringArrayList((String)localObject1, paramArrayList);
    localPermissionFragment.setArguments(localBundle);
    boolean bool2 = true;
    localPermissionFragment.setRetainInstance(bool2);
    localPermissionFragment.setRequestFlag(bool2);
    localPermissionFragment.setCallBack(paramOnPermissionCallback);
    localPermissionFragment.setInterceptor(paramIPermissionInterceptor);
    localPermissionFragment.OooO00o(paramActivity);
  }
  
  public void OooO00o(Activity paramActivity)
  {
    paramActivity = paramActivity.getFragmentManager().beginTransaction();
    String str = toString();
    paramActivity.add(this, str).commitAllowingStateLoss();
  }
  
  public void OooO0O0(Activity paramActivity)
  {
    paramActivity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
  }
  
  public void OooO0Oo()
  {
    Object localObject1 = getActivity();
    Object localObject2 = getArguments();
    if ((localObject1 != null) && (localObject2 != null))
    {
      String str1 = m54207b69.F54207b69_11("hA3325323728373B252A372F2F");
      int i = ((BaseBundle)localObject2).getInt(str1);
      String str2 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
      localObject2 = ((Bundle)localObject2).getStringArrayList(str2);
      if (localObject2 != null)
      {
        boolean bool1 = ((ArrayList)localObject2).isEmpty();
        if (!bool1)
        {
          bool1 = AndroidVersion.isAndroid6();
          Object localObject3;
          boolean bool5;
          if (!bool1)
          {
            int j = ((ArrayList)localObject2).size();
            localObject3 = new int[j];
            bool5 = false;
            int n = 0;
            while (n < j)
            {
              String str3 = (String)((ArrayList)localObject2).get(n);
              boolean bool6 = PermissionApi.OooO((Context)localObject1, str3);
              int i1;
              if (bool6)
              {
                bool6 = false;
                str3 = null;
              }
              else
              {
                i1 = -1;
              }
              localObject3[n] = i1;
              n += 1;
            }
            localObject1 = new String[0];
            localObject1 = (String[])((ArrayList)localObject2).toArray((Object[])localObject1);
            onRequestPermissionsResult(i, (String[])localObject1, (int[])localObject3);
            return;
          }
          boolean bool2 = AndroidVersion.isAndroid13();
          int i2 = 2;
          if (bool2)
          {
            int k = ((ArrayList)localObject2).size();
            if (k >= i2)
            {
              str2 = m54207b69.F54207b69_11("0f070904170D14084F1E0C1E161B22231E19195A373D3755504D3C4250455153584448475045594F5A504B");
              bool5 = PermissionUtils.OooO0o((Collection)localObject2, str2);
              if (bool5)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>((Collection)localObject2);
                ((ArrayList)localObject3).remove(str2);
                OooO0o((Activity)localObject1, (ArrayList)localObject2, (ArrayList)localObject3, i);
                return;
              }
            }
          }
          boolean bool3 = AndroidVersion.isAndroid10();
          boolean bool7;
          if (bool3)
          {
            int m = ((ArrayList)localObject2).size();
            if (m >= i2)
            {
              str2 = m54207b69.F54207b69_11("j~1F111C0F151C20571624161E231A1B262121625251525144453A565A5952574B514C525D455757646753615C5C");
              bool7 = PermissionUtils.OooO0o((Collection)localObject2, str2);
              if (bool7)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>((Collection)localObject2);
                ((ArrayList)localObject3).remove(str2);
                OooO0o((Activity)localObject1, (ArrayList)localObject2, (ArrayList)localObject3, i);
                return;
              }
            }
          }
          boolean bool4 = AndroidVersion.isAndroid10();
          if (bool4)
          {
            str2 = m54207b69.F54207b69_11("Nl0D030A21070A0E492412280C112C2D141313544043443F56574C3B4444424B52404451505C4A4949");
            bool7 = PermissionUtils.OooO0o((Collection)localObject2, str2);
            if (bool7)
            {
              localObject3 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
              bool7 = PermissionUtils.OooO0o((Collection)localObject2, (String)localObject3);
              if (bool7)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>((Collection)localObject2);
                ((ArrayList)localObject3).remove(str2);
                OooO0o((Activity)localObject1, (ArrayList)localObject2, (ArrayList)localObject3, i);
                return;
              }
            }
          }
          int i3 = ((ArrayList)localObject2).size() + -1;
          localObject1 = new String[i3];
          localObject1 = (String[])((ArrayList)localObject2).toArray((Object[])localObject1);
          requestPermissions((String[])localObject1, i);
        }
      }
    }
  }
  
  public void OooO0o(Activity paramActivity, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramArrayList1);
    Object localObject1 = paramArrayList2.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      localArrayList.remove(localObject2);
    }
    PermissionFragment.1 local1 = new com/hjq/permissions/PermissionFragment$1;
    local1.<init>(this);
    PermissionFragment.2 local2 = new com/hjq/permissions/PermissionFragment$2;
    localObject1 = local2;
    Object localObject2 = this;
    local2.<init>(this, paramActivity, localArrayList, paramArrayList1, paramInt);
    OooO0OO(paramActivity, paramArrayList2, local1, local2);
  }
  
  public void OooO0o0()
  {
    Object localObject1 = getArguments();
    Activity localActivity = getActivity();
    if ((localObject1 != null) && (localActivity != null))
    {
      Object localObject2 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
      localObject1 = ((Bundle)localObject1).getStringArrayList((String)localObject2);
      if (localObject1 != null)
      {
        boolean bool1 = ((List)localObject1).isEmpty();
        if (!bool1)
        {
          localObject1 = ((List)localObject1).iterator();
          bool1 = false;
          localObject2 = null;
          for (;;)
          {
            boolean bool2 = ((Iterator)localObject1).hasNext();
            if (!bool2) {
              break;
            }
            Object localObject3 = (String)((Iterator)localObject1).next();
            boolean bool3 = PermissionApi.OooOO0O((String)localObject3);
            if (bool3)
            {
              bool3 = PermissionApi.OooO(localActivity, (String)localObject3);
              if (!bool3)
              {
                bool3 = AndroidVersion.isAndroid11();
                String str;
                if (!bool3)
                {
                  str = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
                  bool3 = PermissionUtils.OooO0oO((String)localObject3, str);
                  if (bool3) {}
                }
                else
                {
                  localObject2 = PermissionUtils.OooO0O0(new String[] { localObject3 });
                  localObject2 = PermissionUtils.OooOO0o(localActivity, (List)localObject2);
                  localObject3 = getArguments();
                  str = m54207b69.F54207b69_11("hA3325323728373B252A372F2F");
                  int i = ((BaseBundle)localObject3).getInt(str);
                  StartActivityManager.OooO0o0(this, (Intent)localObject2, i);
                  bool1 = true;
                }
              }
            }
          }
          if (bool1) {
            return;
          }
          OooO0Oo();
        }
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = getActivity();
    paramIntent = getArguments();
    if ((localObject1 != null) && (paramIntent != null))
    {
      paramInt2 = this.o00Ooo00;
      if (paramInt2 == 0)
      {
        localObject1 = m54207b69.F54207b69_11("hA3325323728373B252A372F2F");
        paramInt2 = paramIntent.getInt((String)localObject1);
        if (paramInt1 == paramInt2)
        {
          Object localObject2 = m54207b69.F54207b69_11("_Q2335222738272B15293D2D47442F30474E5034");
          localObject2 = paramIntent.getStringArrayList((String)localObject2);
          if (localObject2 != null)
          {
            paramInt2 = ((ArrayList)localObject2).isEmpty();
            if (paramInt2 == 0)
            {
              paramInt2 = 1;
              this.o00Ooo00 = paramInt2;
              PermissionUtils.OooOOo((List)localObject2, this);
            }
          }
        }
      }
    }
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    paramContext = getActivity();
    if (paramContext == null) {
      return;
    }
    int i = paramContext.getRequestedOrientation();
    this.o00OooO0 = i;
    int j = -1;
    if (i != j) {
      return;
    }
    PermissionUtils.OooOOOo(paramContext);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.o00Ooo0O = null;
  }
  
  public void onDetach()
  {
    super.onDetach();
    Activity localActivity = getActivity();
    if (localActivity != null)
    {
      int i = this.o00OooO0;
      int j = -1;
      if (i == j)
      {
        i = localActivity.getRequestedOrientation();
        if (i != j) {
          localActivity.setRequestedOrientation(j);
        }
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString != null) && (paramArrayOfInt != null))
    {
      int i = paramArrayOfString.length;
      if (i != 0)
      {
        i = paramArrayOfInt.length;
        if (i != 0)
        {
          Object localObject1 = getArguments();
          Activity localActivity = getActivity();
          if ((localActivity != null) && (localObject1 != null))
          {
            Object localObject2 = this.o00Ooo0o;
            if (localObject2 != null)
            {
              localObject2 = m54207b69.F54207b69_11("hA3325323728373B252A372F2F");
              i = ((BaseBundle)localObject1).getInt((String)localObject2);
              if (paramInt == i)
              {
                localObject1 = this.o00Ooo0O;
                this.o00Ooo0O = null;
                IPermissionInterceptor localIPermissionInterceptor = this.o00Ooo0o;
                this.o00Ooo0o = null;
                PermissionUtils.OooOOo0(localActivity, paramArrayOfString, paramArrayOfInt);
                paramArrayOfString = PermissionUtils.OooO0O0(paramArrayOfString);
                localObject2 = o00OooO;
                Object localObject3 = Integer.valueOf(paramInt);
                ((List)localObject2).remove(localObject3);
                OooO0O0(localActivity);
                localObject3 = PermissionApi.OooO0Oo(paramArrayOfString, paramArrayOfInt);
                int j = ((List)localObject3).size();
                int k = paramArrayOfString.size();
                if (j == k)
                {
                  localObject2 = localIPermissionInterceptor;
                  localObject4 = localObject3;
                  localIPermissionInterceptor.OooO0O0(localActivity, paramArrayOfString, (List)localObject3, true, (OnPermissionCallback)localObject1);
                  localIPermissionInterceptor.OooO0OO(localActivity, paramArrayOfString, false, (OnPermissionCallback)localObject1);
                  return;
                }
                Object localObject4 = PermissionApi.OooO0O0(paramArrayOfString, paramArrayOfInt);
                boolean bool1 = PermissionApi.OooO0oo(localActivity, (List)localObject4);
                localObject2 = localIPermissionInterceptor;
                localIPermissionInterceptor.OooO0Oo(localActivity, paramArrayOfString, (List)localObject4, bool1, (OnPermissionCallback)localObject1);
                boolean bool2 = ((List)localObject3).isEmpty();
                if (!bool2)
                {
                  bool1 = false;
                  localObject4 = localObject3;
                  localIPermissionInterceptor.OooO0O0(localActivity, paramArrayOfString, (List)localObject3, false, (OnPermissionCallback)localObject1);
                }
                localIPermissionInterceptor.OooO0OO(localActivity, paramArrayOfString, false, (OnPermissionCallback)localObject1);
              }
            }
          }
        }
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    boolean bool = this.o00Ooo0;
    if (!bool)
    {
      Activity localActivity = getActivity();
      OooO0O0(localActivity);
      return;
    }
    bool = this.o00OoOoo;
    if (bool) {
      return;
    }
    this.o00OoOoo = true;
    OooO0o0();
  }
  
  public void run()
  {
    boolean bool = isAdded();
    if (!bool) {
      return;
    }
    OooO0Oo();
  }
  
  public void setCallBack(OnPermissionCallback paramOnPermissionCallback)
  {
    this.o00Ooo0O = paramOnPermissionCallback;
  }
  
  public void setInterceptor(IPermissionInterceptor paramIPermissionInterceptor)
  {
    this.o00Ooo0o = paramIPermissionInterceptor;
  }
  
  public void setRequestFlag(boolean paramBoolean)
  {
    this.o00Ooo0 = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionFragment
 * JD-Core Version:    0.7.0.1
 */