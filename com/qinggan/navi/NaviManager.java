package com.qinggan.navi;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import m54207b69;

public class NaviManager
{
  public static String OooO = "com.qinggan.autonavi.AdapterService";
  public ServiceConnection OooO00o;
  public GuideState OooO0O0;
  public IAutoNaviService OooO0OO;
  public Context OooO0Oo;
  public GuideStateListener OooO0o;
  public IGuideStateCallback OooO0o0;
  public OnInitListener OooO0oO;
  public int OooO0oo;
  
  public final void OooO()
  {
    Object localObject1 = m54207b69.F54207b69_11("J=5E0F0F0F115A");
    Object localObject2 = Build.PRODUCT;
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = OooO;
      ((Intent)localObject1).setAction((String)localObject2);
      localObject2 = this.OooO0Oo;
      ServiceConnection localServiceConnection = this.OooO00o;
      int i = 1;
      ((Context)localObject2).bindService((Intent)localObject1, localServiceConnection, i);
    }
  }
  
  public final GuideState OooOO0(GuideState paramGuideState)
  {
    GuideState localGuideState1 = GuideState.o00OooO;
    GuideState localGuideState2 = GuideState.o00Ooo0o;
    if (paramGuideState != localGuideState2)
    {
      localGuideState2 = GuideState.o00Ooo0;
      if ((paramGuideState != localGuideState2) && (paramGuideState != localGuideState1))
      {
        localGuideState2 = GuideState.o0O00o0;
        if (paramGuideState != localGuideState2)
        {
          localGuideState2 = GuideState.o00OooOo;
          if (paramGuideState != localGuideState2)
          {
            localGuideState2 = GuideState.o00Ooo0O;
            if (paramGuideState != localGuideState2)
            {
              localGuideState2 = GuideState.o00OooO0;
              if (paramGuideState != localGuideState2)
              {
                localGuideState2 = GuideState.o00OoooO;
                if (paramGuideState != localGuideState2) {
                  return localGuideState1;
                }
              }
            }
          }
          localGuideState1 = GuideState.o00Ooo0O;
        }
      }
    }
    return localGuideState1;
  }
  
  public GuideState getGuideState()
  {
    int i = this.OooO0oo;
    if (i == 0) {
      return this.OooO0O0;
    }
    int j = 1;
    if (i == j) {
      try
      {
        Object localObject = this.OooO0OO;
        if (localObject != null)
        {
          localObject = ((IAutoNaviService)localObject).getGuideState();
          this.OooO0O0 = ((GuideState)localObject);
          return localObject;
        }
        OooO();
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = m54207b69.F54207b69_11(";g00031523161309093C1C101E0E54102E14132926221D1F74");
        localStringBuilder.append(str2);
        String str1 = localRemoteException.getMessage();
        localStringBuilder.append(str1);
        OooO();
      }
    }
    return this.OooO0O0;
  }
  
  public void setGuideStateListener(GuideStateListener paramGuideStateListener)
  {
    this.OooO0o = paramGuideStateListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviManager
 * JD-Core Version:    0.7.0.1
 */