package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class ViolationInfo$1
  implements Parcelable.Creator
{
  public ViolationInfo OooO00o(Parcel paramParcel)
  {
    ViolationInfo localViolationInfo = new com/qinggan/now/common/ViolationInfo;
    localViolationInfo.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localViolationInfo.o00Ooo00 = localDate;
    }
    else
    {
      localViolationInfo.o00Ooo00 = null;
    }
    paramParcel = paramParcel.readString();
    localViolationInfo.o00Ooo0O = paramParcel;
    return localViolationInfo;
  }
  
  public ViolationInfo[] OooO0O0(int paramInt)
  {
    return new ViolationInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ViolationInfo.1
 * JD-Core Version:    0.7.0.1
 */