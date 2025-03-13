package androidx.core.provider;

import android.os.Handler;
import java.util.concurrent.Callable;

class SelfDestructiveThread$2
  implements Runnable
{
  public void run()
  {
    Object localObject;
    try
    {
      localObject = this.o00OoOoo;
      localObject = ((Callable)localObject).call();
    }
    catch (Exception localException)
    {
      localObject = null;
    }
    Handler localHandler = this.o00Ooo00;
    SelfDestructiveThread.2.1 local1 = new androidx/core/provider/SelfDestructiveThread$2$1;
    local1.<init>(this, localObject);
    localHandler.post(local1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.2
 * JD-Core Version:    0.7.0.1
 */