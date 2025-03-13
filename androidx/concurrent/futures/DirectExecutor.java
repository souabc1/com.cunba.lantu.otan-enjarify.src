package androidx.concurrent.futures;

import java.util.concurrent.Executor;

public enum DirectExecutor
  implements Executor
{
  static
  {
    DirectExecutor localDirectExecutor = new androidx/concurrent/futures/DirectExecutor;
    localDirectExecutor.<init>("INSTANCE", 0);
    o00OoOoo = localDirectExecutor;
    o00Ooo00 = new DirectExecutor[] { localDirectExecutor };
  }
  
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public String toString()
  {
    return "DirectExecutor";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.DirectExecutor
 * JD-Core Version:    0.7.0.1
 */