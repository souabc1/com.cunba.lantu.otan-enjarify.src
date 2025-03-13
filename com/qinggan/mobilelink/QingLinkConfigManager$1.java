package com.qinggan.mobilelink;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class QingLinkConfigManager$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1001;
    if (i == j)
    {
      paramMessage = QingLinkConfigManager.OooO00o(this.OooO00o);
      if (paramMessage == null)
      {
        QingLinkConfigManager.OooO0OO(this.OooO00o);
        paramMessage = QingLinkConfigManager.OooO0Oo(this.OooO00o);
        long l = 5000L;
        paramMessage.sendEmptyMessageDelayed(j, l);
      }
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.mobilelink.QingLinkConfigManager.1
 * JD-Core Version:    0.7.0.1
 */