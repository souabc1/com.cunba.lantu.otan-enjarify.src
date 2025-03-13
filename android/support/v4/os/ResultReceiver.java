package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final boolean o00OoOoo = false;
  public IResultReceiver o00Ooo0;
  public final Handler o00Ooo00 = null;
  
  static
  {
    ResultReceiver.1 local1 = new android/support/v4/os/ResultReceiver$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ResultReceiver(Parcel paramParcel)
  {
    paramParcel = IResultReceiver.Stub.o0Oo0o0O(paramParcel.readStrongBinder());
    this.o00Ooo0 = paramParcel;
  }
  
  public void OooO00o(int paramInt, Bundle paramBundle) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      Object localObject = this.o00Ooo0;
      if (localObject == null)
      {
        localObject = new android/support/v4/os/ResultReceiver$MyResultReceiver;
        ((ResultReceiver.MyResultReceiver)localObject).<init>(this);
        this.o00Ooo0 = ((IResultReceiver)localObject);
      }
      localObject = this.o00Ooo0;
      localObject = ((IInterface)localObject).asBinder();
      paramParcel.writeStrongBinder((IBinder)localObject);
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     android.support.v4.os.ResultReceiver
 * JD-Core Version:    0.7.0.1
 */