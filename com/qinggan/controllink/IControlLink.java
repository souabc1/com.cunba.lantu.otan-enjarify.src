package com.qinggan.controllink;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

public abstract interface IControlLink
  extends IInterface
{
  public abstract boolean isConnected();
  
  public abstract boolean isTransfering();
  
  public abstract boolean o00000o0(int paramInt);
  
  public abstract boolean o0000OO(int paramInt);
  
  public abstract boolean o000O000(Bundle paramBundle);
  
  public abstract boolean o000oo0(Bundle paramBundle);
  
  public abstract boolean o000ooO(List paramList);
  
  public abstract boolean o00Oo0O(Bundle paramBundle);
  
  public abstract boolean o00OoOo();
  
  public abstract boolean o00o000O();
  
  public abstract boolean o00o0ooo();
  
  public abstract boolean o00oOoOo(String paramString, IControlLinkListener paramIControlLinkListener);
  
  public abstract boolean o00oo00O(Bundle paramBundle);
  
  public abstract boolean o0O000o(String paramString, IControlLinkListener paramIControlLinkListener);
  
  public abstract boolean o0O0oo00(Bundle paramBundle);
  
  public abstract boolean o0OO000(Bundle paramBundle);
  
  public abstract boolean o0OO000o(Bundle paramBundle);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.IControlLink
 * JD-Core Version:    0.7.0.1
 */