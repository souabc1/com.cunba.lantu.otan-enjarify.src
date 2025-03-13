package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PhoneInfo$1
  implements Parcelable.Creator
{
  public PhoneInfo OooO00o(Parcel paramParcel)
  {
    PhoneInfo localPhoneInfo = new com/qinggan/cluster/info/PhoneInfo;
    localPhoneInfo.<init>();
    Object localObject = paramParcel.readString();
    localPhoneInfo.o00OooOO = ((String)localObject);
    localObject = paramParcel.readString();
    localPhoneInfo.o00Ooo0o = ((String)localObject);
    int i = paramParcel.readInt();
    localPhoneInfo.o00Ooo0 = i;
    localObject = PhoneState.class.getClassLoader();
    localObject = (PhoneState)paramParcel.readParcelable((ClassLoader)localObject);
    localPhoneInfo.o0O00o0 = ((PhoneState)localObject);
    localObject = paramParcel.readString();
    localPhoneInfo.o00Ooo00 = ((String)localObject);
    i = paramParcel.readInt();
    localPhoneInfo.o00OoOoo = i;
    i = paramParcel.readInt();
    localPhoneInfo.o00Ooo0O = i;
    i = paramParcel.readInt();
    PhoneInfo.OooO00o(localPhoneInfo, i);
    i = paramParcel.readInt();
    PhoneInfo.OooO0OO(localPhoneInfo, i);
    int j = paramParcel.readInt();
    PhoneInfo.OooO0Oo(localPhoneInfo, j);
    return localPhoneInfo;
  }
  
  public PhoneInfo[] OooO0O0(int paramInt)
  {
    return new PhoneInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.PhoneInfo.1
 * JD-Core Version:    0.7.0.1
 */