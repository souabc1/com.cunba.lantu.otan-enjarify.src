package com.qinggan.app.launcher;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

public class QGBoxProvider$MyHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    QGBoxProvider localQGBoxProvider;
    switch (i)
    {
    default: 
      break;
    case 6: 
      localQGBoxProvider = this.OooO00o;
      paramMessage = (HashMap)paramMessage.obj;
      localQGBoxProvider.OooO(paramMessage);
      break;
    case 5: 
      paramMessage = this.OooO00o;
      paramMessage.OooO0oo();
      break;
    case 4: 
      paramMessage = this.OooO00o;
      paramMessage.OooO0o0();
      break;
    case 3: 
      paramMessage = this.OooO00o;
      paramMessage.OooO0o();
      break;
    case 2: 
      paramMessage = this.OooO00o;
      paramMessage.OooOO0();
      break;
    case 1: 
      localQGBoxProvider = this.OooO00o;
      paramMessage = (String)paramMessage.obj;
      localQGBoxProvider.OooO0oO(paramMessage);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.launcher.QGBoxProvider.MyHandler
 * JD-Core Version:    0.7.0.1
 */