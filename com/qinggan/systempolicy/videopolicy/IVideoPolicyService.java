package com.qinggan.systempolicy.videopolicy;

import android.os.IInterface;

public abstract interface IVideoPolicyService
  extends IInterface
{
  public abstract VideoFocusInfo getCurrentVideoFocusInfo();
  
  public abstract void o00ooOO0(int paramInt, String paramString, boolean paramBoolean, IVideoFocusCallback paramIVideoFocusCallback);
  
  public abstract void o0O0O0O(String paramString);
  
  public abstract void o0oOoo00(String paramString);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.videopolicy.IVideoPolicyService
 * JD-Core Version:    0.7.0.1
 */