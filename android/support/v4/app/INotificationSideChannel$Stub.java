package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class INotificationSideChannel$Stub
  extends Binder
  implements INotificationSideChannel
{
  public INotificationSideChannel$Stub()
  {
    attachInterface(this, "android.support.v4.app.INotificationSideChannel");
  }
  
  public static INotificationSideChannel o0Oo0o0O(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    Object localObject = paramIBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
    if (localObject != null)
    {
      boolean bool = localObject instanceof INotificationSideChannel;
      if (bool) {
        return (INotificationSideChannel)localObject;
      }
    }
    localObject = new android/support/v4/app/INotificationSideChannel$Stub$Proxy;
    ((INotificationSideChannel.Stub.Proxy)localObject).<init>(paramIBinder);
    return localObject;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = "android.support.v4.app.INotificationSideChannel";
    int i = 1;
    if (paramInt1 >= i)
    {
      j = 16777215;
      if (paramInt1 <= j) {
        paramParcel1.enforceInterface((String)localObject);
      }
    }
    int j = 1598968902;
    if (paramInt1 != j)
    {
      String str1;
      int m;
      if (paramInt1 != i)
      {
        int k = 2;
        if (paramInt1 != k)
        {
          k = 3;
          if (paramInt1 != k) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          str1 = paramParcel1.readString();
          o00O0oo(str1);
        }
        else
        {
          str1 = paramParcel1.readString();
          m = paramParcel1.readInt();
          paramParcel1 = paramParcel1.readString();
          o00ooo00(str1, m, paramParcel1);
        }
      }
      else
      {
        str1 = paramParcel1.readString();
        m = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        localObject = Notification.CREATOR;
        paramParcel1 = (Notification)INotificationSideChannel._Parcel.OooO00o(paramParcel1, (Parcelable.Creator)localObject);
        o0OOoO00(str1, m, str2, paramParcel1);
      }
      return i;
    }
    paramParcel2.writeString((String)localObject);
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Stub
 * JD-Core Version:    0.7.0.1
 */