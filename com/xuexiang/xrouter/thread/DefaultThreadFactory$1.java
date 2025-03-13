package com.xuexiang.xrouter.thread;

import m54207b69;

class DefaultThreadFactory$1
  implements Thread.UncaughtExceptionHandler
{
  public DefaultThreadFactory$1(DefaultThreadFactory paramDefaultThreadFactory) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramThread;
    arrayOfObject[2] = paramThrowable;
    m54207b69.F54207b69_00(1850, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.thread.DefaultThreadFactory.1
 * JD-Core Version:    0.7.0.1
 */