package com.qinggan.tuner;

class TunerManager$1
  implements Runnable
{
  public void run()
  {
    TunerManager.OnInitListener localOnInitListener1 = TunerManager.OooO00o(this.o00OoOoo);
    if (localOnInitListener1 != null)
    {
      long l = 100;
      try
      {
        Thread.sleep(l);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
      TunerManager.OnInitListener localOnInitListener2 = TunerManager.OooO00o(this.o00OoOoo);
      boolean bool = true;
      localOnInitListener2.OooO00o(bool);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tuner.TunerManager.1
 * JD-Core Version:    0.7.0.1
 */