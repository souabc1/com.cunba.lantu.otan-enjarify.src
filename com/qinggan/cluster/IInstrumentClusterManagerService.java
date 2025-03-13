package com.qinggan.cluster;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.qinggan.cluster.info.MediaSrcInfo;
import com.qinggan.cluster.info.NaviInfo;
import com.qinggan.cluster.info.PhoneInfo;
import java.util.Map;

public abstract interface IInstrumentClusterManagerService
  extends IInterface
{
  public abstract boolean getClusterConnect();
  
  public abstract void o00000oo(String paramString, int paramInt);
  
  public abstract void o0000o(String paramString);
  
  public abstract void o000O0();
  
  public abstract void o000O0Oo();
  
  public abstract void o000o0oo(NaviInfo paramNaviInfo);
  
  public abstract void o00O0(Bundle paramBundle);
  
  public abstract void o00O000(boolean paramBoolean, Bundle paramBundle);
  
  public abstract void o00O00Oo();
  
  public abstract void o00O00o0(Intent paramIntent);
  
  public abstract void o00OOO(Map paramMap);
  
  public abstract void o00Ooo0o(IInstrumentClusterManagerCallback paramIInstrumentClusterManagerCallback);
  
  public abstract int o00oooOo(ClusterState paramClusterState);
  
  public abstract void o00oooo(int paramInt);
  
  public abstract void o0O000o0(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void o0O00OoO(ClusterState paramClusterState, int paramInt);
  
  public abstract void o0O0o(String paramString, int paramInt);
  
  public abstract void o0O0o0Oo(MediaSrcInfo paramMediaSrcInfo);
  
  public abstract void o0O0oOoo(PhoneInfo paramPhoneInfo);
  
  public abstract void o0O0oo0o(int paramInt);
  
  public abstract void o0OOO0oO(int paramInt);
  
  public abstract void o0OOooOo(IInstrumentClusterManagerCallback paramIInstrumentClusterManagerCallback);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.IInstrumentClusterManagerService
 * JD-Core Version:    0.7.0.1
 */