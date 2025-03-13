package com.qinggan.util;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueuedWork
{
  public static final ConcurrentLinkedQueue OooO00o;
  public static ExecutorService OooO0O0 = null;
  
  static
  {
    ConcurrentLinkedQueue localConcurrentLinkedQueue = new java/util/concurrent/ConcurrentLinkedQueue;
    localConcurrentLinkedQueue.<init>();
    OooO00o = localConcurrentLinkedQueue;
  }
  
  public static void OooO00o(Runnable paramRunnable)
  {
    OooO00o.add(paramRunnable);
  }
  
  public static void OooO0O0(Runnable paramRunnable)
  {
    OooO00o.remove(paramRunnable);
  }
  
  public static ExecutorService OooO0OO()
  {
    Object localObject1 = QueuedWork.class;
    QueuedWork localQueuedWork;
    try
    {
      localObject1 = OooO0O0;
      if (localObject1 == null)
      {
        localObject1 = Executors.newSingleThreadExecutor();
        OooO0O0 = (ExecutorService)localObject1;
      }
      localObject1 = OooO0O0;
      return localObject1;
    }
    finally
    {
      localQueuedWork = QueuedWork.class;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.QueuedWork
 * JD-Core Version:    0.7.0.1
 */