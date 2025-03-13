package com.qinggan.now;

import com.qinggan.now.common.City;
import com.qinggan.now.common.ResultListener;
import java.util.ArrayList;

class NaviManager$NaviMsgReceiver$6
  implements Runnable
{
  public NaviManager$NaviMsgReceiver$6(NaviManager.NaviMsgReceiver paramNaviMsgReceiver, ResultListener paramResultListener, ArrayList paramArrayList) {}
  
  public void run()
  {
    ResultListener localResultListener = this.o00Ooo0;
    City localCity = (City)this.o00Ooo00.get(0);
    localResultListener.OooO00o(localCity, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NaviManager.NaviMsgReceiver.6
 * JD-Core Version:    0.7.0.1
 */