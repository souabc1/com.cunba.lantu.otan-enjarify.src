package com.qinggan.radio;

import android.os.IInterface;
import java.util.List;

public abstract interface IRadioRemoteService
  extends IInterface
{
  public abstract List getRadioList(int paramInt);
  
  public abstract void o0000o0();
  
  public abstract void o000O();
  
  public abstract void o00OoooO(LocalRadioInfo paramLocalRadioInfo);
  
  public abstract void o00oOooO();
  
  public abstract void o00ooOO(IRadioLocalCallback paramIRadioLocalCallback);
  
  public abstract void o0O0OOo();
  
  public abstract boolean o0O0o0o(IRadioRemoteCallback paramIRadioRemoteCallback);
  
  public abstract void o0O0oo0O();
  
  public abstract void o0Oo0O00();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.radio.IRadioRemoteService
 * JD-Core Version:    0.7.0.1
 */