package com.qinggan.tuner;

import android.os.IInterface;

public abstract interface ITunerService
  extends IInterface
{
  public abstract int getBand();
  
  public abstract int[] getFreqInfo();
  
  public abstract TunerStatus getTunerStatus();
  
  public abstract int o0000OOO();
  
  public abstract int o0000o0O(boolean paramBoolean);
  
  public abstract int o000OO00(int paramInt);
  
  public abstract int o00Oo0oO(int paramInt1, int paramInt2);
  
  public abstract int o00oOo00(int paramInt);
  
  public abstract int o0OOo00O();
  
  public abstract int o0Oo00o(int paramInt);
  
  public abstract int oo0oO0(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tuner.ITunerService
 * JD-Core Version:    0.7.0.1
 */