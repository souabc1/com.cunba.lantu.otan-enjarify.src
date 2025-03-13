package com.qinggan.carlife;

import android.os.IInterface;

public abstract interface ICarLifeDaemon
  extends IInterface
{
  public abstract int getConnectionProgress();
  
  public abstract boolean isMobileDeviceConnect();
  
  public abstract boolean isiOSDeviceConnect();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.carlife.ICarLifeDaemon
 * JD-Core Version:    0.7.0.1
 */