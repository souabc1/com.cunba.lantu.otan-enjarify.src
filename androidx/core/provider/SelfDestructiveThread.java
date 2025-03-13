package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

public class SelfDestructiveThread
{
  public final Object OooO00o;
  public HandlerThread OooO0O0;
  public Handler OooO0OO;
  public int OooO0Oo;
  public final int OooO0o0;
  
  public void OooO00o()
  {
    synchronized (this.OooO00o)
    {
      Object localObject2 = this.OooO0OO;
      int i = 1;
      boolean bool = ((Handler)localObject2).hasMessages(i);
      if (bool) {
        return;
      }
      localObject2 = this.OooO0O0;
      ((HandlerThread)localObject2).quit();
      bool = false;
      localObject2 = null;
      this.OooO0O0 = null;
      this.OooO0OO = null;
      return;
    }
  }
  
  public void OooO0O0(Runnable arg1)
  {
    ???.run();
    synchronized (this.OooO00o)
    {
      Handler localHandler = this.OooO0OO;
      Message localMessage = null;
      localHandler.removeMessages(0);
      localHandler = this.OooO0OO;
      localMessage = localHandler.obtainMessage(0);
      int i = this.OooO0o0;
      long l = i;
      localHandler.sendMessageDelayed(localMessage, l);
      return;
    }
  }
  
  public int getGeneration()
  {
    synchronized (this.OooO00o)
    {
      int i = this.OooO0Oo;
      return i;
    }
  }
  
  public boolean isRunning()
  {
    synchronized (this.OooO00o)
    {
      HandlerThread localHandlerThread = this.OooO0O0;
      boolean bool;
      if (localHandlerThread != null)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localHandlerThread = null;
      }
      return bool;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread
 * JD-Core Version:    0.7.0.1
 */