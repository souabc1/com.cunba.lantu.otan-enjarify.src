package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum AbnormalDrivingType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/AbnormalDrivingType;
    Object localObject2 = m54207b69.F54207b69_11("Dy3D2C3232343C442D47413438324548494C464E3E4C42464D4F");
    ((AbnormalDrivingType)localObject1).<init>((String)localObject2, 0);
    o00Ooo0 = (AbnormalDrivingType)localObject1;
    localObject2 = new com/qinggan/now/common/AbnormalDrivingType;
    Object localObject3 = m54207b69.F54207b69_11("Cy3D2C3232343C442D323E423F32483947424D");
    ((AbnormalDrivingType)localObject2).<init>((String)localObject3, 1);
    o00Ooo0O = (AbnormalDrivingType)localObject2;
    localObject3 = new com/qinggan/now/common/AbnormalDrivingType;
    Object localObject4 = m54207b69.F54207b69_11("Zx3C2B3331353B452E353349484239353B3D3B48");
    ((AbnormalDrivingType)localObject3).<init>((String)localObject4, 2);
    o00Ooo0o = (AbnormalDrivingType)localObject3;
    localObject4 = new com/qinggan/now/common/AbnormalDrivingType;
    String str = m54207b69.F54207b69_11("eY1D0C1212141C240D252121292818");
    ((AbnormalDrivingType)localObject4).<init>(str, 3);
    o00Ooo00 = (AbnormalDrivingType)localObject4;
    AbnormalDrivingType[] tmp86_83 = new AbnormalDrivingType[4];
    AbnormalDrivingType[] tmp87_86 = tmp86_83;
    AbnormalDrivingType[] tmp87_86 = tmp86_83;
    tmp87_86[0] = localObject1;
    tmp87_86[1] = localObject2;
    tmp87_86[2] = localObject3;
    AbnormalDrivingType[] tmp97_87 = tmp87_86;
    tmp97_87[3] = localObject4;
    o00OoOoo = tmp97_87;
    localObject1 = new com/qinggan/now/common/AbnormalDrivingType$1;
    ((AbnormalDrivingType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AbnormalDrivingType
 * JD-Core Version:    0.7.0.1
 */