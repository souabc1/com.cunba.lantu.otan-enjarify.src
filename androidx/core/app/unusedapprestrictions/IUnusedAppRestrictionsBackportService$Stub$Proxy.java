package androidx.core.app.unusedapprestrictions;

import android.os.IBinder;
import android.os.Parcel;

class IUnusedAppRestrictionsBackportService$Stub$Proxy
  implements IUnusedAppRestrictionsBackportService
{
  public IBinder OooO00o;
  
  public IUnusedAppRestrictionsBackportService$Stub$Proxy(IBinder paramIBinder)
  {
    this.OooO00o = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.OooO00o;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
  }
  
  public void o00OO0O(IUnusedAppRestrictionsBackportCallback paramIUnusedAppRestrictionsBackportCallback)
  {
    Parcel localParcel = Parcel.obtain();
    String str = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
    try
    {
      localParcel.writeInterfaceToken(str);
      localParcel.writeStrongInterface(paramIUnusedAppRestrictionsBackportCallback);
      paramIUnusedAppRestrictionsBackportCallback = this.OooO00o;
      str = null;
      int i = 1;
      paramIUnusedAppRestrictionsBackportCallback.transact(i, localParcel, null, i);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy
 * JD-Core Version:    0.7.0.1
 */