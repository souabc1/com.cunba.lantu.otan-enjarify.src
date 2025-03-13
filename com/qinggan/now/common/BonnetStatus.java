package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum BonnetStatus
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/BonnetStatus;
    Object localObject2 = m54207b69.F54207b69_11("y]1E3234313C3E");
    ((BonnetStatus)localObject1).<init>((String)localObject2, 0);
    o00Ooo00 = (BonnetStatus)localObject1;
    localObject2 = new com/qinggan/now/common/BonnetStatus;
    Object localObject3 = m54207b69.F54207b69_11("8H07392F29");
    ((BonnetStatus)localObject2).<init>((String)localObject3, 1);
    o00Ooo0 = (BonnetStatus)localObject2;
    localObject3 = new com/qinggan/now/common/BonnetStatus;
    Object localObject4 = m54207b69.F54207b69_11(":O1C39283E302C112D44352A2C2D373A4A");
    ((BonnetStatus)localObject3).<init>((String)localObject4, 2);
    o00Ooo0O = (BonnetStatus)localObject3;
    localObject4 = new com/qinggan/now/common/BonnetStatus;
    String str = m54207b69.F54207b69_11("Qp251F1D21230C");
    ((BonnetStatus)localObject4).<init>(str, 3);
    o00Ooo0o = (BonnetStatus)localObject4;
    BonnetStatus[] tmp86_83 = new BonnetStatus[4];
    BonnetStatus[] tmp87_86 = tmp86_83;
    BonnetStatus[] tmp87_86 = tmp86_83;
    tmp87_86[0] = localObject1;
    tmp87_86[1] = localObject2;
    tmp87_86[2] = localObject3;
    BonnetStatus[] tmp97_87 = tmp87_86;
    tmp97_87[3] = localObject4;
    o00OoOoo = tmp97_87;
    localObject1 = new com/qinggan/now/common/BonnetStatus$1;
    ((BonnetStatus.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.common.BonnetStatus
 * JD-Core Version:    0.7.0.1
 */