package com.qinggan.os;

import android.os.Bundle;

public abstract class UEventObserver
{
  public int OooO00o;
  public UEventObserver.UEventThread OooO0O0;
  public int OooO0OO;
  
  public abstract void OooO0Oo(int paramInt, Bundle paramBundle);
  
  public final void OooO0o0()
  {
    try
    {
      UEventObserver.UEventThread localUEventThread = this.OooO0O0;
      localUEventThread.OooO00o(this);
      return;
    }
    finally {}
  }
  
  public void finalize()
  {
    try
    {
      OooO0o0();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.UEventObserver
 * JD-Core Version:    0.7.0.1
 */