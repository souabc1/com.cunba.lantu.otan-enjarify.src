package com.qinggan.srm;

import android.os.IInterface;

public abstract interface IStreamingRearView
  extends IInterface
{
  public abstract int getSRMEnabled();
  
  public abstract int getStatus();
  
  public abstract int getTrackEnable();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.srm.IStreamingRearView
 * JD-Core Version:    0.7.0.1
 */