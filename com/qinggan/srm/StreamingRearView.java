package com.qinggan.srm;

import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import m54207b69;

public class StreamingRearView
{
  public final ISRMCallback OooO00o;
  public volatile StreamingRearView.OnSRMListener OooO0O0;
  public StreamingRearViewProxy OooO0OO;
  
  public final boolean OooO0OO()
  {
    Object localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("{w14191C5C0A231F17181F2364101228"));
    if (localObject1 != null)
    {
      Object localObject2 = new com/qinggan/srm/StreamingRearViewProxy;
      ((StreamingRearViewProxy)localObject2).<init>((IBinder)localObject1);
      this.OooO0OO = ((StreamingRearViewProxy)localObject2);
      localObject1 = m54207b69.F54207b69_11("*u2E1D1D1F052B160E0B25201B3462140F262722191A69");
      localObject2 = m54207b69.F54207b69_11("b:694F4A625F5C595B657169665479616E5D");
      Log.OooO00o((String)localObject2, (String)localObject1);
      try
      {
        localObject1 = this.OooO0OO;
        localObject3 = this.OooO00o;
        ((StreamingRearViewProxy)localObject1).o0Oo0o0O((ISRMCallback)localObject3);
        localObject1 = "o&7D504A52567A495B58584F4E8713554F62546619595E5E5F5B5E6C22";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        Log.OooO00o((String)localObject2, (String)localObject1);
        return true;
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = m54207b69.F54207b69_11("BK10232725431D3440452B3239227836333536403B53804450513D538C");
        ((StringBuilder)localObject3).append(str2);
        String str1 = localRemoteException.getMessage();
        ((StringBuilder)localObject3).append(str1);
        str1 = ((StringBuilder)localObject3).toString();
        Log.OooO00o((String)localObject2, str1);
        str1 = null;
        this.OooO0OO = null;
      }
    }
    return false;
  }
  
  public int getStatus()
  {
    Object localObject = this.OooO0OO;
    int i = -1;
    String str2 = m54207b69.F54207b69_11("b:694F4A625F5C595B657169665479616E5D");
    if (localObject == null)
    {
      localObject = m54207b69.F54207b69_11("p<675C5B4B734D634F51586B275B665C5965706B2F66685E33776C6C6D757C6678783E");
      Log.OooO0oO(str2, (String)localObject);
      return i;
    }
    try
    {
      return ((StreamingRearViewProxy)localObject).getStatus();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("+?64595C4E7050645252556C655369685E5B67626419");
      localStringBuilder.append(str3);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      str1 = localStringBuilder.toString();
      Log.OooO0O0(str2, str1);
    }
    return i;
  }
  
  public int getSwitchStatus()
  {
    Object localObject = this.OooO0OO;
    int i = -1;
    String str2 = m54207b69.F54207b69_11("b:694F4A625F5C595B657169665479616E5D");
    if (localObject == null)
    {
      localObject = m54207b69.F54207b69_11("x9625F5E506E535654625A7458645A5A59742A5C6F5F646671743271716936787577787E7D7181833F");
      Log.OooO0oO(str2, (String)localObject);
      return i;
    }
    try
    {
      return ((StreamingRearViewProxy)localObject).getSRMEnabled();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("|D1F2423331B3833372F35213B313D3F4629324E3A35494644434398");
      localStringBuilder.append(str3);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      str1 = localStringBuilder.toString();
      Log.OooO0O0(str2, str1);
    }
    return i;
  }
  
  public int getTrackEnable()
  {
    Object localObject = this.OooO0OO;
    int i = -1;
    String str2 = m54207b69.F54207b69_11("b:694F4A625F5C595B657169665479616E5D");
    if (localObject == null)
    {
      localObject = m54207b69.F54207b69_11(")v2D12150526091D1C253C22222027213A6616251714342B2A6E31331D723237373834372537377D");
      Log.OooO0oO(str2, (String)localObject);
      return i;
    }
    try
    {
      return ((StreamingRearViewProxy)localObject).getTrackEnable();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("lT0F343323042B3B3E471A444042453F18413D4944383553525287");
      localStringBuilder.append(str3);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      str1 = localStringBuilder.toString();
      Log.OooO0O0(str2, str1);
    }
    return i;
  }
  
  public void setOnSRMListener(StreamingRearView.OnSRMListener paramOnSRMListener)
  {
    this.OooO0O0 = paramOnSRMListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.srm.StreamingRearView
 * JD-Core Version:    0.7.0.1
 */