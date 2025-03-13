package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

class AsyncListDiffer$MainThreadExecutor
  implements Executor
{
  public final Handler o00OoOoo;
  
  public AsyncListDiffer$MainThreadExecutor()
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    this.o00OoOoo = localHandler;
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.o00OoOoo.post(paramRunnable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.MainThreadExecutor
 * JD-Core Version:    0.7.0.1
 */