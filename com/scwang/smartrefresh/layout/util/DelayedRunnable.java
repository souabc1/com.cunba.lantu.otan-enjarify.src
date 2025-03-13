package com.scwang.smartrefresh.layout.util;

public class DelayedRunnable
  implements Runnable
{
  public long o00OoOoo;
  public Runnable o00Ooo00;
  
  public DelayedRunnable(Runnable paramRunnable, long paramLong)
  {
    this.o00Ooo00 = paramRunnable;
    this.o00OoOoo = paramLong;
  }
  
  public void run()
  {
    try
    {
      Runnable localRunnable = this.o00Ooo00;
      if (localRunnable != null)
      {
        localRunnable.run();
        localRunnable = null;
        this.o00Ooo00 = null;
      }
    }
    finally
    {
      boolean bool = localObject instanceof NoClassDefFoundError;
      if (!bool) {
        localObject.printStackTrace();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.DelayedRunnable
 * JD-Core Version:    0.7.0.1
 */