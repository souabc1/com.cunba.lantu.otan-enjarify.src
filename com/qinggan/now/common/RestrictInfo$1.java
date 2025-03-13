package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class RestrictInfo$1
  implements Parcelable.Creator
{
  public RestrictInfo OooO00o(Parcel paramParcel)
  {
    RestrictInfo localRestrictInfo = new com/qinggan/now/common/RestrictInfo;
    localRestrictInfo.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localRestrictInfo.o00Ooo00 = localDate;
    }
    else
    {
      i = 0;
      localObject = null;
      localRestrictInfo.o00Ooo00 = null;
    }
    Object localObject = GeoPoint.class.getClassLoader();
    localObject = (GeoPoint)paramParcel.readParcelable((ClassLoader)localObject);
    localRestrictInfo.o00Ooo0o = ((GeoPoint)localObject);
    localObject = paramParcel.readString();
    localRestrictInfo.o00OooO0 = ((String)localObject);
    localObject = paramParcel.readString();
    localRestrictInfo.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    localRestrictInfo.o00Ooo0 = ((String)localObject);
    int j = paramParcel.readInt();
    int i = 1;
    if (j == i)
    {
      localRestrictInfo.o00Ooo0O = i;
    }
    else
    {
      j = 0;
      paramParcel = null;
      localRestrictInfo.o00Ooo0O = false;
    }
    return localRestrictInfo;
  }
  
  public RestrictInfo[] OooO0O0(int paramInt)
  {
    return new RestrictInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.RestrictInfo.1
 * JD-Core Version:    0.7.0.1
 */