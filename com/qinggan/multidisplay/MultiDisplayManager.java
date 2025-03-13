package com.qinggan.multidisplay;

import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import m54207b69;

public class MultiDisplayManager
{
  public static Boolean OooOOOO = Boolean.FALSE;
  public static MultiDisplayManager OooOOOo = null;
  public MultiDisplayAnimationObservable OooO;
  public IBinder.DeathRecipient OooO00o;
  public boolean OooO0O0;
  public ArrayMap OooO0OO;
  public Handler OooO0Oo;
  public ArrayMap OooO0o;
  public boolean OooO0o0;
  public IMultiDisplayListener.Stub OooO0oO;
  public MultiDisplayMovingObservable OooO0oo;
  public ArrayMap OooOO0;
  public Runnable OooOO0O;
  public final String OooOO0o;
  public ArrayMap OooOOO;
  public IMultiDisplayService OooOOO0;
  
  public static int getDisplayFromMemoryType(int paramInt)
  {
    int i = paramInt & 0x1;
    if (i != 0) {
      return 0;
    }
    i = paramInt & 0x2;
    if (i != 0) {
      return 1;
    }
    i = paramInt & 0x4;
    if (i != 0) {
      return 2;
    }
    i = paramInt & 0x20;
    if (i != 0) {
      return 3;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("(651544475634A4C615F587A4F656889626B6A566276645C6A2E78725B73777D71367C757E7D697589776F7D37");
    localStringBuilder.append(str);
    localStringBuilder.append(paramInt);
    return -1;
  }
  
  public static int getMemoryTypefromDisplay(int paramInt)
  {
    int i = 1;
    if (paramInt == 0) {
      return i;
    }
    int j = 2;
    if (paramInt == i) {
      return j;
    }
    if (paramInt == j) {
      return 4;
    }
    i = 3;
    if (paramInt == i) {
      return 32;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("s:5D60507A635C5B4F4B774D556B695664678F655C5E6B715A326C6E677773717D3A7F756C6E7B816A9B872A");
    localStringBuilder.append(str);
    localStringBuilder.append(paramInt);
    return 0;
  }
  
  private void getServiceInstance()
  {
    Object localObject = this.OooOOO0;
    if (localObject == null)
    {
      this.OooO0o0 = false;
      localObject = new java/lang/Thread;
      Runnable localRunnable = this.OooOO0O;
      ((Thread)localObject).<init>(localRunnable);
      ((Thread)localObject).start();
    }
  }
  
  public boolean OooOOOo()
  {
    return this.OooO0O0;
  }
  
  public final AnimationController OooOOo(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    AnimationController localAnimationController;
    if (!bool)
    {
      localAnimationController = (AnimationController)this.OooO0OO.get(paramString);
    }
    else
    {
      bool = false;
      localAnimationController = null;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("a;5C5F517B5E5C5D6062615A2666655D615D63615515");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    paramString = m54207b69.F54207b69_11("/|5C1E141815220E1C1B1B491E1E151C2220212B215A");
    localStringBuilder.append(paramString);
    localStringBuilder.append(localAnimationController);
    return localAnimationController;
  }
  
  public void OooOOo0(String paramString1, String paramString2)
  {
    Object localObject1 = this.OooOOO0;
    if (localObject1 != null)
    {
      localObject1 = OooOOOO;
      boolean bool = ((Boolean)localObject1).booleanValue();
      String str = "/";
      Object localObject2;
      if (bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = m54207b69.F54207b69_11("C,4F4E44524D45674A6252775A645268546866281F");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(paramString1);
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(paramString2);
      }
      try
      {
        localObject1 = this.OooOOO0;
        localObject2 = this.OooO0oO;
        ((IMultiDisplayService)localObject1).o00oOOO0((IMultiDisplayListener)localObject2, paramString1, paramString2);
      }
      catch (RemoteException localRemoteException)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = m54207b69.F54207b69_11("{Q32314135384222452F3D1A3D314535473539834A444D538289");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(paramString1);
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(paramString2);
      }
    }
  }
  
  public boolean OooOOoo(String paramString)
  {
    IMultiDisplayService localIMultiDisplayService = this.OooOOO0;
    if (localIMultiDisplayService != null)
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (!bool) {
        try
        {
          localIMultiDisplayService = this.OooOOO0;
          return localIMultiDisplayService.o0OOOo0O(paramString);
        }
        catch (RemoteException localRemoteException) {}
      }
    }
    return false;
  }
  
  public void OooOo0(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("EN3D27233C0E3028363F13313A2E2E377D4A3C484D8883");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramInt1);
    str1 = m54207b69.F54207b69_11("3B6E63383E362C7E69");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramInt2);
    str1 = m54207b69.F54207b69_11("vU7976333F2A2A3F3B34253B7A81");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramInt3);
    localObject = this.OooOOO0;
    if (localObject != null) {
      try
      {
        ((IMultiDisplayService)localObject).o000O00(paramInt1, paramInt2, paramInt3);
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = m54207b69.F54207b69_11("\\[1D3B343A424481363C84323E40392D4D474B3432464F4D4B548E");
        localStringBuilder.append(str2);
        localStringBuilder.append(localRemoteException);
      }
    }
  }
  
  public final boolean OooOo00(String paramString, Boolean paramBoolean)
  {
    IMultiDisplayService localIMultiDisplayService = this.OooOOO0;
    if (localIMultiDisplayService != null) {
      try
      {
        IMultiDisplayListener.Stub localStub = this.OooO0oO;
        String str = this.OooOO0o;
        boolean bool = paramBoolean.booleanValue();
        localIMultiDisplayService.o00OoOOo(localStub, str, paramString, bool);
        return true;
      }
      catch (RemoteException localRemoteException) {}
    }
    this.OooOOO.put(paramString, paramBoolean);
    return false;
  }
  
  public int OooOo0O(String paramString1, String paramString2)
  {
    Object localObject = this.OooOOO0;
    if (localObject != null) {
      try
      {
        IMultiDisplayListener.Stub localStub = this.OooO0oO;
        return ((IMultiDisplayService)localObject).o0O0OO0(localStub, paramString1, paramString2);
      }
      catch (RemoteException paramString1)
      {
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>();
        localObject = m54207b69.F54207b69_11("8G3027303618352C3E092B332F2E742F353E3C8F");
        paramString2.append((String)localObject);
        paramString2.append(paramString1);
      }
    }
    return -1;
  }
  
  public ArrayMap getMultiDisplayActivityAnimListeners()
  {
    return this.OooO0o;
  }
  
  public ArrayMap getMultiDisplayWinAnimListeners()
  {
    return this.OooOO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.MultiDisplayManager
 * JD-Core Version:    0.7.0.1
 */