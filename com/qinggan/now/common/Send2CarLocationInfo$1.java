package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Send2CarLocationInfo$1
  implements Parcelable.Creator
{
  public Send2CarLocationInfo OooO00o(Parcel paramParcel)
  {
    Object localObject = (Send2CarInfo)Send2CarInfo.CREATOR.createFromParcel(paramParcel);
    Send2CarLocationInfo localSend2CarLocationInfo = new com/qinggan/now/common/Send2CarLocationInfo;
    localSend2CarLocationInfo.<init>((Send2CarInfo)localObject);
    if (localObject != null)
    {
      double d = paramParcel.readDouble();
      localSend2CarLocationInfo.o00OooOo = d;
      d = paramParcel.readDouble();
      localSend2CarLocationInfo.o00OooOO = d;
      d = paramParcel.readDouble();
      localSend2CarLocationInfo.o00OoooO = d;
      localObject = paramParcel.readString();
      localSend2CarLocationInfo.o00OooO = ((String)localObject);
      localObject = paramParcel.readString();
      localSend2CarLocationInfo.o0O00o0 = ((String)localObject);
      localObject = paramParcel.readString();
      localSend2CarLocationInfo.o00OooO0 = ((String)localObject);
      paramParcel = paramParcel.readString();
      localSend2CarLocationInfo.o00Ooooo = paramParcel;
    }
    return localSend2CarLocationInfo;
  }
  
  public Send2CarLocationInfo[] OooO0O0(int paramInt)
  {
    return new Send2CarLocationInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Send2CarLocationInfo.1
 * JD-Core Version:    0.7.0.1
 */