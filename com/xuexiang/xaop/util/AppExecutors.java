package com.xuexiang.xaop.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m54207b69;

public final class AppExecutors
{
  public static AppExecutors OooO0Oo;
  public final ExecutorService OooO00o;
  public ExecutorService OooO0O0;
  public final Executor OooO0OO;
  
  private AppExecutors()
  {
    this(localExecutorService1, localExecutorService2, localMainThreadExecutor);
  }
  
  public AppExecutors(ExecutorService paramExecutorService1, ExecutorService paramExecutorService2, Executor paramExecutor)
  {
    this.OooO00o = paramExecutorService1;
    this.OooO0O0 = paramExecutorService2;
    this.OooO0OO = paramExecutor;
  }
  
  public static AppExecutors get()
  {
    Object[] arrayOfObject = new Object[0];
    return (AppExecutors)m54207b69.F54207b69_09(978, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.util.AppExecutors
 * JD-Core Version:    0.7.0.1
 */