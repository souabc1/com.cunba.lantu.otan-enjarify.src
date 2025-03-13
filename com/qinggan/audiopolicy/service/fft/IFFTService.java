package com.qinggan.audiopolicy.service.fft;

import android.os.IInterface;

public abstract interface IFFTService
  extends IInterface
{
  public abstract float[] getDatas();
  
  public abstract void start();
  
  public abstract void stop();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.service.fft.IFFTService
 * JD-Core Version:    0.7.0.1
 */