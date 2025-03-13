package com.qinggan.system;

import android.os.IInterface;

public abstract interface ILocalCityService
  extends IInterface
{
  public abstract String getCityName();
  
  public abstract String getLocalCity();
  
  public abstract String getProvinceName();
  
  public abstract void o00ooO0O(ILocalCityObserver paramILocalCityObserver);
  
  public abstract void o0O0oOO(ILocalCityObserver paramILocalCityObserver);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.ILocalCityService
 * JD-Core Version:    0.7.0.1
 */