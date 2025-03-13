package com.qinggan.now;

import android.os.IInterface;
import java.util.List;

public abstract interface INowService
  extends IInterface
{
  public abstract String getSoulMateSceneList();
  
  public abstract void o0000Oo(List paramList1, List paramList2, ISceneListCallback paramISceneListCallback);
  
  public abstract void o000ooo0(INowCardCallback paramINowCardCallback);
  
  public abstract void o00O000o(INowCardCallback paramINowCardCallback);
  
  public abstract void setUserFeedBack(NowFeedBack paramNowFeedBack);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.INowService
 * JD-Core Version:    0.7.0.1
 */