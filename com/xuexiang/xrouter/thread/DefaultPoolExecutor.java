package com.xuexiang.xrouter.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m54207b69;

public class DefaultPoolExecutor
  extends ThreadPoolExecutor
{
  public static final int o00OoOoo;
  public static final int o00Ooo0;
  public static final int o00Ooo00;
  public static DefaultPoolExecutor o00Ooo0O;
  
  static
  {
    int i = Runtime.getRuntime().availableProcessors();
    o00OoOoo = i;
    i += 1;
    o00Ooo00 = i;
    o00Ooo0 = i;
  }
  
  public DefaultPoolExecutor(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue, paramThreadFactory, local1);
  }
  
  public static DefaultPoolExecutor getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (DefaultPoolExecutor)m54207b69.F54207b69_09(1849, arrayOfObject);
  }
  
  public void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRunnable;
    arrayOfObject[2] = paramThrowable;
    m54207b69.F54207b69_00(1848, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.thread.DefaultPoolExecutor
 * JD-Core Version:    0.7.0.1
 */