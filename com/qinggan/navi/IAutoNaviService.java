package com.qinggan.navi;

import android.os.IInterface;

public abstract interface IAutoNaviService
  extends IInterface
{
  public abstract GuideState getGuideState();
  
  public abstract boolean o0000oo(IGuideStateCallback paramIGuideStateCallback);
  
  public abstract void o0O00Ooo();
  
  public abstract boolean o0O0oooO(IGuideStateCallback paramIGuideStateCallback);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.IAutoNaviService
 * JD-Core Version:    0.7.0.1
 */