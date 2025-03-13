package com.qinggan.systempolicy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.qinggan.systempolicy.videopolicy.IVideoPolicyService;
import com.qinggan.systempolicy.videopolicy.VideoFocusInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class VideoPolicyManager
{
  public static Object OooO;
  public static String OooO0o = "com.qinggan.systempolicy.videopolicy.VideoPolicyService";
  public static String OooO0oO = "com.qinggan.systempolicy";
  public static VideoPolicyManager OooO0oo = null;
  public static Object OooOO0;
  public static HashMap OooOO0O;
  public boolean OooO00o;
  public ServiceConnection OooO0O0;
  public Context OooO0OO;
  public List OooO0Oo;
  public IVideoPolicyService OooO0o0;
  
  static
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    OooOO0O = (HashMap)localObject;
    Integer localInteger = Integer.valueOf(101);
    String str = m54207b69.F54207b69_11("PW34393C7C2A433F37383F4384324B473F4447363647533A3E534F48");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(102);
    str = m54207b69.F54207b69_11("zm0E0302461D0A1E0A1111294E1A192D2C111D26");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(103);
    str = m54207b69.F54207b69_11("y,4F444305485E5362514E0C534D6C566B585A6C58635E");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(201);
    str = m54207b69.F54207b69_11("g3505D6020465F635B5C5B67285E50512C556B696970");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(202);
    str = m54207b69.F54207b69_11("XM2E2322662826322A316C2C496F3B3333313A505040433E");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(203);
    str = m54207b69.F54207b69_11(";L2F242365412A283233362C6D4932303A4C313F48");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(204);
    str = m54207b69.F54207b69_11("KY3A37367A2C353D4546414182443637864C424A4A51504C4D4A");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(205);
    str = m54207b69.F54207b69_11(";053605F21455E645E5F5A68295D4D4E2D67626E6F69575F");
    ((HashMap)localObject).put(str, localInteger);
    localObject = OooOO0O;
    localInteger = Integer.valueOf(206);
    str = m54207b69.F54207b69_11("?U363B3A7E284141393A3D45864241463F3745");
    ((HashMap)localObject).put(str, localInteger);
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO = localObject;
  }
  
  public final void OooO0o()
  {
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>();
    Object localObject2 = OooO0oO;
    Object localObject3 = OooO0o;
    ((Intent)localObject1).setClassName((String)localObject2, (String)localObject3);
    localObject2 = this.OooO0OO;
    localObject3 = this.OooO0O0;
    int i = 1;
    boolean bool1 = ((Context)localObject2).bindService((Intent)localObject1, (ServiceConnection)localObject3, i);
    this.OooO00o = bool1;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = m54207b69.F54207b69_11(".j280606114E3E151F240C131A5C");
    ((StringBuilder)localObject1).append((String)localObject2);
    boolean bool2 = this.OooO00o;
    ((StringBuilder)localObject1).append(bool2);
    bool1 = this.OooO00o;
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
      OooO0oO(false);
    }
  }
  
  public final void OooO0o0(VideoPolicyManager.OnInitListener paramOnInitListener)
  {
    Object localObject = OooO;
    if (paramOnInitListener != null) {}
    try
    {
      List localList = this.OooO0Oo;
      boolean bool = localList.contains(paramOnInitListener);
      if (!bool)
      {
        localList = this.OooO0Oo;
        localList.add(paramOnInitListener);
      }
      return;
    }
    finally {}
  }
  
  public final void OooO0oO(boolean paramBoolean)
  {
    synchronized (OooO)
    {
      Object localObject2 = this.OooO0Oo;
      localObject2 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject3 = ((Iterator)localObject2).next();
        localObject3 = (VideoPolicyManager.OnInitListener)localObject3;
        if (localObject3 != null) {
          if (paramBoolean) {
            ((VideoPolicyManager.OnInitListener)localObject3).OooO0O0();
          } else {
            ((VideoPolicyManager.OnInitListener)localObject3).OooO00o();
          }
        }
      }
      return;
    }
  }
  
  public VideoFocusInfo getCurrentVideoFocusInfo()
  {
    VideoFocusInfo localVideoFocusInfo = null;
    try
    {
      IVideoPolicyService localIVideoPolicyService = this.OooO0o0;
      if (localIVideoPolicyService != null) {
        localVideoFocusInfo = localIVideoPolicyService.getCurrentVideoFocusInfo();
      } else {
        OooO0o();
      }
      return localVideoFocusInfo;
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
      OooO0o();
      label36:
      return null;
    }
    finally
    {
      break label36;
    }
  }
  
  public boolean isConnected()
  {
    try
    {
      IVideoPolicyService localIVideoPolicyService = this.OooO0o0;
      boolean bool;
      if (localIVideoPolicyService != null)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localIVideoPolicyService = null;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.VideoPolicyManager
 * JD-Core Version:    0.7.0.1
 */