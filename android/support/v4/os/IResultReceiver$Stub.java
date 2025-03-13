package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IResultReceiver$Stub
  extends Binder
  implements IResultReceiver
{
  public IResultReceiver$Stub()
  {
    attachInterface(this, "android.support.v4.os.IResultReceiver");
  }
  
  public static IResultReceiver o0Oo0o0O(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    Object localObject = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
    if (localObject != null)
    {
      boolean bool = localObject instanceof IResultReceiver;
      if (bool) {
        return (IResultReceiver)localObject;
      }
    }
    localObject = new android/support/v4/os/IResultReceiver$Stub$Proxy;
    ((IResultReceiver.Stub.Proxy)localObject).<init>(paramIBinder);
    return localObject;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = "android.support.v4.os.IResultReceiver";
    int i = 1;
    if (paramInt1 >= i)
    {
      j = 16777215;
      if (paramInt1 <= j) {
        paramParcel1.enforceInterface(str);
      }
    }
    int j = 1598968902;
    if (paramInt1 != j)
    {
      if (paramInt1 != i) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramInt1 = paramParcel1.readInt();
      paramParcel2 = Bundle.CREATOR;
      paramParcel1 = (Bundle)IResultReceiver._Parcel.OooO00o(paramParcel1, paramParcel2);
      o0Oo0OOo(paramInt1, paramParcel1);
      return i;
    }
    paramParcel2.writeString(str);
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     android.support.v4.os.IResultReceiver.Stub
 * JD-Core Version:    0.7.0.1
 */