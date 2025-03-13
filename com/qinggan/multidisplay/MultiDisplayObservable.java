package com.qinggan.multidisplay;

import android.database.Observable;
import android.os.RemoteException;
import java.util.ArrayList;
import m54207b69;

public abstract class MultiDisplayObservable
  extends Observable
{
  public boolean OooO00o;
  public IMultiDisplayListener OooO0O0;
  public IMultiDisplayService OooO0OO;
  
  public void OooO00o()
  {
    MultiDisplayManager.OooOOOO.booleanValue();
    this.OooO00o = false;
    this.OooO0OO = null;
  }
  
  public void OooO0O0(IMultiDisplayService paramIMultiDisplayService)
  {
    Object localObject = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("o6555A5A5B575A486C5B4D4A6A61601A");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramIMultiDisplayService);
    }
    this.OooO0OO = paramIMultiDisplayService;
    paramIMultiDisplayService = this.mObservers;
    int i = paramIMultiDisplayService.size();
    if (i > 0) {
      OooO0Oo();
    }
  }
  
  public abstract void OooO0OO();
  
  public void OooO0Oo()
  {
    boolean bool = this.OooO00o;
    if (!bool)
    {
      Object localObject = this.OooO0OO;
      if (localObject != null) {
        try
        {
          localObject = MultiDisplayManager.OooOOOO;
          bool = ((Boolean)localObject).booleanValue();
          OooO0OO();
          bool = true;
          this.OooO00o = bool;
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11("e6445453624947594B6A626F5E504D6153266169726E21");
          localStringBuilder.append(str);
          localStringBuilder.append(localRemoteException);
        }
      }
    }
  }
  
  public void OooO0o0()
  {
    boolean bool = this.OooO00o;
    if (bool)
    {
      Object localObject = this.OooO0OO;
      if (localObject != null) {
        try
        {
          localObject = MultiDisplayManager.OooOOOO;
          bool = ((Boolean)localObject).booleanValue();
          OooO0oO();
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11("Va141015070A0D181C0C1C311E1A19401323281626551C161F2574");
          localStringBuilder.append(str);
          localStringBuilder.append(localRemoteException);
        }
      }
    }
    this.OooO00o = false;
  }
  
  public abstract void OooO0oO();
  
  public void registerObserver(Object paramObject)
  {
    Object localObject = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11(">c1107060D141C0C18340A1A111D22142069");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramObject);
    }
    super.registerObserver(paramObject);
    OooO0Oo();
  }
  
  public void unregisterObserver(Object paramObject)
  {
    Object localObject = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("9D312B382427323D37293F1531432E4441314790");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramObject);
    }
    super.unregisterObserver(paramObject);
    paramObject = this.mObservers;
    int i = paramObject.size();
    if (i <= 0) {
      OooO0o0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.MultiDisplayObservable
 * JD-Core Version:    0.7.0.1
 */