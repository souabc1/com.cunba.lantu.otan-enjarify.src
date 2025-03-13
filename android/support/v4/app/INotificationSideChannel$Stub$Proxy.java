package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

class INotificationSideChannel$Stub$Proxy
  implements INotificationSideChannel
{
  public IBinder OooO00o;
  
  public INotificationSideChannel$Stub$Proxy(IBinder paramIBinder)
  {
    this.OooO00o = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.OooO00o;
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.v4.app.INotificationSideChannel";
  }
  
  public void o00O0oo(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    String str = "android.support.v4.app.INotificationSideChannel";
    try
    {
      localParcel.writeInterfaceToken(str);
      localParcel.writeString(paramString);
      paramString = this.OooO00o;
      str = null;
      int i = 1;
      int j = 3;
      paramString.transact(j, localParcel, null, i);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void o00ooo00(String paramString1, int paramInt, String paramString2)
  {
    Parcel localParcel = Parcel.obtain();
    String str = "android.support.v4.app.INotificationSideChannel";
    try
    {
      localParcel.writeInterfaceToken(str);
      localParcel.writeString(paramString1);
      localParcel.writeInt(paramInt);
      localParcel.writeString(paramString2);
      paramString1 = this.OooO00o;
      paramInt = 0;
      int i = 1;
      int j = 2;
      paramString1.transact(j, localParcel, null, i);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void o0OOoO00(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    Parcel localParcel = Parcel.obtain();
    String str = "android.support.v4.app.INotificationSideChannel";
    try
    {
      localParcel.writeInterfaceToken(str);
      localParcel.writeString(paramString1);
      localParcel.writeInt(paramInt);
      localParcel.writeString(paramString2);
      paramString1 = null;
      INotificationSideChannel._Parcel.OooO0O0(localParcel, paramNotification, 0);
      paramString1 = this.OooO00o;
      paramInt = 0;
      int i = 1;
      paramString1.transact(i, localParcel, null, i);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Stub.Proxy
 * JD-Core Version:    0.7.0.1
 */