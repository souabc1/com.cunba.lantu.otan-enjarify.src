package com.qinggan.audiopolicy;

import android.content.Context;
import android.os.RemoteException;
import com.qinggan.audiopolicy.service.fft.IFFTService;
import java.util.Iterator;
import java.util.List;

public class FFTServiceManager
{
  public static Object OooO0Oo;
  public Context OooO00o;
  public IFFTService OooO0O0;
  public List OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0Oo = localObject;
  }
  
  public final void OooO0o(boolean paramBoolean)
  {
    synchronized (this.OooO0OO)
    {
      Object localObject1 = this.OooO0OO;
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        Object localObject2 = ((Iterator)localObject1).next();
        localObject2 = (FFTServiceManager.OnInitListener)localObject2;
        if (localObject2 != null) {
          if (paramBoolean) {
            ((FFTServiceManager.OnInitListener)localObject2).OooO0O0();
          } else {
            ((FFTServiceManager.OnInitListener)localObject2).OooO00o();
          }
        }
      }
      return;
    }
  }
  
  public final void OooO0o0(FFTServiceManager.OnInitListener paramOnInitListener)
  {
    List localList1 = this.OooO0OO;
    if (paramOnInitListener != null) {}
    try
    {
      List localList2 = this.OooO0OO;
      boolean bool = localList2.contains(paramOnInitListener);
      if (!bool)
      {
        localList2 = this.OooO0OO;
        localList2.add(paramOnInitListener);
      }
      return;
    }
    finally {}
  }
  
  public float[] getDatas()
  {
    float[] arrayOfFloat = null;
    try
    {
      IFFTService localIFFTService = this.OooO0O0;
      if (localIFFTService != null) {
        arrayOfFloat = localIFFTService.getDatas();
      }
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    return arrayOfFloat;
  }
  
  public boolean isConnected()
  {
    try
    {
      IFFTService localIFFTService = this.OooO0O0;
      boolean bool;
      if (localIFFTService != null)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localIFFTService = null;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.FFTServiceManager
 * JD-Core Version:    0.7.0.1
 */