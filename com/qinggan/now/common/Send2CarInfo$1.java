package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Send2CarInfo$1
  implements Parcelable.Creator
{
  public Send2CarInfo OooO00o(Parcel paramParcel)
  {
    Send2CarInfo localSend2CarInfo = new com/qinggan/now/common/Send2CarInfo;
    localSend2CarInfo.<init>();
    Object localObject = Send2CarType.class.getClassLoader();
    localObject = (Send2CarType)paramParcel.readParcelable((ClassLoader)localObject);
    localSend2CarInfo.o00Ooo0o = ((Send2CarType)localObject);
    localObject = paramParcel.readString();
    localSend2CarInfo.o00Ooo0 = ((String)localObject);
    localObject = paramParcel.readString();
    localSend2CarInfo.o00Ooo00 = ((String)localObject);
    localObject = paramParcel.readString();
    localSend2CarInfo.o00OoOoo = ((String)localObject);
    paramParcel = paramParcel.readString();
    localSend2CarInfo.o00Ooo0O = paramParcel;
    return localSend2CarInfo;
  }
  
  public Send2CarInfo[] OooO0O0(int paramInt)
  {
    return new Send2CarInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Send2CarInfo.1
 * JD-Core Version:    0.7.0.1
 */