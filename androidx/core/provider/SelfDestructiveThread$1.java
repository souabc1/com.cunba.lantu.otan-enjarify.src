package androidx.core.provider;

import android.os.Handler.Callback;
import android.os.Message;

class SelfDestructiveThread$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    if (i != 0)
    {
      if (i != j) {
        return j;
      }
      SelfDestructiveThread localSelfDestructiveThread = this.OooO00o;
      paramMessage = (Runnable)paramMessage.obj;
      localSelfDestructiveThread.OooO0O0(paramMessage);
      return j;
    }
    this.OooO00o.OooO00o();
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.1
 * JD-Core Version:    0.7.0.1
 */