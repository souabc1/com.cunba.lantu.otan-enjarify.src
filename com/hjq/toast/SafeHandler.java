package com.hjq.toast;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager.BadTokenException;

final class SafeHandler
  extends Handler
{
  public final Handler OooO00o;
  
  public SafeHandler(Handler paramHandler)
  {
    this.OooO00o = paramHandler;
  }
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      Handler localHandler = this.OooO00o;
      localHandler.handleMessage(paramMessage);
    }
    catch (IllegalStateException paramMessage) {}catch (WindowManager.BadTokenException paramMessage) {}
    paramMessage.printStackTrace();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.SafeHandler
 * JD-Core Version:    0.7.0.1
 */