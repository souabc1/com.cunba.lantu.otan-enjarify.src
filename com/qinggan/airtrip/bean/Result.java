package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class Result
  implements Parcelable
{
  public ErrorCode o00OoOoo;
  
  public Result() {}
  
  public Result(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = -1;
    if (i == j)
    {
      i = 0;
      paramParcel = null;
    }
    else
    {
      ErrorCode[] arrayOfErrorCode = ErrorCode.values();
      paramParcel = arrayOfErrorCode[i];
    }
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ErrorCode localErrorCode = this.o00OoOoo;
    if (localErrorCode == null) {
      paramInt = -1;
    } else {
      paramInt = localErrorCode.ordinal();
    }
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.Result
 * JD-Core Version:    0.7.0.1
 */