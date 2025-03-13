package androidx.arch.core.executor;

import java.util.concurrent.Executor;

public class ArchTaskExecutor
  extends TaskExecutor
{
  public static volatile ArchTaskExecutor OooO0OO;
  public static final Executor OooO0Oo;
  public static final Executor OooO0o0;
  public TaskExecutor OooO00o;
  public final TaskExecutor OooO0O0;
  
  static
  {
    Object localObject = new androidx/arch/core/executor/OooO00o;
    ((OooO00o)localObject).<init>();
    OooO0Oo = (Executor)localObject;
    localObject = new androidx/arch/core/executor/OooO0O0;
    ((OooO0O0)localObject).<init>();
    OooO0o0 = (Executor)localObject;
  }
  
  private ArchTaskExecutor()
  {
    DefaultTaskExecutor localDefaultTaskExecutor = new androidx/arch/core/executor/DefaultTaskExecutor;
    localDefaultTaskExecutor.<init>();
    this.OooO0O0 = localDefaultTaskExecutor;
    this.OooO00o = localDefaultTaskExecutor;
  }
  
  public static Executor getIOThreadExecutor()
  {
    return OooO0o0;
  }
  
  public static ArchTaskExecutor getInstance()
  {
    ??? = OooO0OO;
    if (??? != null) {
      return OooO0OO;
    }
    synchronized (ArchTaskExecutor.class)
    {
      ArchTaskExecutor localArchTaskExecutor2 = OooO0OO;
      if (localArchTaskExecutor2 == null)
      {
        localArchTaskExecutor2 = new androidx/arch/core/executor/ArchTaskExecutor;
        localArchTaskExecutor2.<init>();
        OooO0OO = localArchTaskExecutor2;
      }
      return OooO0OO;
    }
  }
  
  public static Executor getMainThreadExecutor()
  {
    return OooO0Oo;
  }
  
  public void OooO00o(Runnable paramRunnable)
  {
    this.OooO00o.OooO00o(paramRunnable);
  }
  
  public void OooO0O0(Runnable paramRunnable)
  {
    this.OooO00o.OooO0O0(paramRunnable);
  }
  
  public boolean isMainThread()
  {
    return this.OooO00o.isMainThread();
  }
  
  public void setDelegate(TaskExecutor paramTaskExecutor)
  {
    if (paramTaskExecutor == null) {
      paramTaskExecutor = this.OooO0O0;
    }
    this.OooO00o = paramTaskExecutor;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.executor.ArchTaskExecutor
 * JD-Core Version:    0.7.0.1
 */