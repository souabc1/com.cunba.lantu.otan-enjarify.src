package androidx.loader.content;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class ModernAsyncTask
{
  public static final BlockingQueue o00OooO;
  public static final ThreadFactory o00OooO0;
  public static final Executor o00OooOO;
  public static ModernAsyncTask.InternalHandler o00OooOo;
  public static volatile Executor o0O00o0;
  public final ModernAsyncTask.WorkerRunnable o00OoOoo;
  public volatile ModernAsyncTask.Status o00Ooo0;
  public final FutureTask o00Ooo00;
  public final AtomicBoolean o00Ooo0O;
  public final AtomicBoolean o00Ooo0o;
  
  static
  {
    ModernAsyncTask.1 local1 = new androidx/loader/content/ModernAsyncTask$1;
    local1.<init>();
    o00OooO0 = local1;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>(10);
    o00OooO = localLinkedBlockingQueue;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    localThreadPoolExecutor.<init>(5, 128, 1L, localTimeUnit, localLinkedBlockingQueue, local1);
    o00OooOO = localThreadPoolExecutor;
    o0O00o0 = localThreadPoolExecutor;
  }
  
  public ModernAsyncTask()
  {
    Object localObject = ModernAsyncTask.Status.o00OoOoo;
    this.o00Ooo0 = ((ModernAsyncTask.Status)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.o00Ooo0O = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.o00Ooo0o = ((AtomicBoolean)localObject);
    localObject = new androidx/loader/content/ModernAsyncTask$2;
    ((ModernAsyncTask.2)localObject).<init>(this);
    this.o00OoOoo = ((ModernAsyncTask.WorkerRunnable)localObject);
    ModernAsyncTask.3 local3 = new androidx/loader/content/ModernAsyncTask$3;
    local3.<init>(this, (Callable)localObject);
    this.o00Ooo00 = local3;
  }
  
  private static Handler getHandler()
  {
    synchronized (ModernAsyncTask.class)
    {
      ModernAsyncTask.InternalHandler localInternalHandler = o00OooOo;
      if (localInternalHandler == null)
      {
        localInternalHandler = new androidx/loader/content/ModernAsyncTask$InternalHandler;
        localInternalHandler.<init>();
        o00OooOo = localInternalHandler;
      }
      localInternalHandler = o00OooOo;
      return localInternalHandler;
    }
  }
  
  public static void setDefaultExecutor(Executor paramExecutor)
  {
    o0O00o0 = paramExecutor;
  }
  
  public void OooO(Object... paramVarArgs) {}
  
  public final boolean OooO00o(boolean paramBoolean)
  {
    this.o00Ooo0O.set(true);
    return this.o00Ooo00.cancel(paramBoolean);
  }
  
  public abstract Object OooO0O0(Object... paramVarArgs);
  
  public final ModernAsyncTask OooO0OO(Executor paramExecutor, Object... paramVarArgs)
  {
    ModernAsyncTask.Status localStatus1 = this.o00Ooo0;
    ModernAsyncTask.Status localStatus2 = ModernAsyncTask.Status.o00OoOoo;
    if (localStatus1 != localStatus2)
    {
      paramExecutor = ModernAsyncTask.4.OooO00o;
      paramVarArgs = this.o00Ooo0;
      int i = paramVarArgs.ordinal();
      int j = paramExecutor[i];
      i = 1;
      if (j != i)
      {
        i = 2;
        if (j != i)
        {
          paramExecutor = new java/lang/IllegalStateException;
          paramExecutor.<init>("We should never reach this state");
          throw paramExecutor;
        }
        paramExecutor = new java/lang/IllegalStateException;
        paramExecutor.<init>("Cannot execute task: the task has already been executed (a task can be executed only once)");
        throw paramExecutor;
      }
      paramExecutor = new java/lang/IllegalStateException;
      paramExecutor.<init>("Cannot execute task: the task is already running.");
      throw paramExecutor;
    }
    localStatus1 = ModernAsyncTask.Status.o00Ooo00;
    this.o00Ooo0 = localStatus1;
    OooO0oo();
    this.o00OoOoo.o00OoOoo = paramVarArgs;
    paramVarArgs = this.o00Ooo00;
    paramExecutor.execute(paramVarArgs);
    return this;
  }
  
  public void OooO0Oo(Object paramObject)
  {
    boolean bool = isCancelled();
    if (bool) {
      OooO0o(paramObject);
    } else {
      OooO0oO(paramObject);
    }
    paramObject = ModernAsyncTask.Status.o00Ooo0;
    this.o00Ooo0 = paramObject;
  }
  
  public void OooO0o(Object paramObject)
  {
    OooO0o0();
  }
  
  public void OooO0o0() {}
  
  public void OooO0oO(Object paramObject) {}
  
  public void OooO0oo() {}
  
  public Object OooOO0(Object paramObject)
  {
    Handler localHandler = getHandler();
    ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = new androidx/loader/content/ModernAsyncTask$AsyncTaskResult;
    Object[] arrayOfObject = { paramObject };
    localAsyncTaskResult.<init>(this, arrayOfObject);
    localHandler.obtainMessage(1, localAsyncTaskResult).sendToTarget();
    return paramObject;
  }
  
  public void OooOO0O(Object paramObject)
  {
    AtomicBoolean localAtomicBoolean = this.o00Ooo0o;
    boolean bool = localAtomicBoolean.get();
    if (!bool) {
      OooOO0(paramObject);
    }
  }
  
  public final Object get()
  {
    return this.o00Ooo00.get();
  }
  
  public final ModernAsyncTask.Status getStatus()
  {
    return this.o00Ooo0;
  }
  
  public final boolean isCancelled()
  {
    return this.o00Ooo0O.get();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.ModernAsyncTask
 * JD-Core Version:    0.7.0.1
 */