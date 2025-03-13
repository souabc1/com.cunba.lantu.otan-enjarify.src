package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum HandBrakeStatus
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/HandBrakeStatus;
    Object localObject2 = m54207b69.F54207b69_11("9Z1E342B3E2C3C");
    ((HandBrakeStatus)localObject1).<init>((String)localObject2, 0);
    o00Ooo0 = (HandBrakeStatus)localObject1;
    localObject2 = new com/qinggan/now/common/HandBrakeStatus;
    Object localObject3 = m54207b69.F54207b69_11("yS1122343B3E423A");
    ((HandBrakeStatus)localObject2).<init>((String)localObject3, 1);
    o00Ooo00 = (HandBrakeStatus)localObject2;
    localObject3 = new com/qinggan/now/common/HandBrakeStatus;
    String str = m54207b69.F54207b69_11("Qp251F1D21230C");
    ((HandBrakeStatus)localObject3).<init>(str, 2);
    o00Ooo0O = (HandBrakeStatus)localObject3;
    HandBrakeStatus[] tmp64_61 = new HandBrakeStatus[3];
    HandBrakeStatus[] tmp65_64 = tmp64_61;
    HandBrakeStatus[] tmp65_64 = tmp64_61;
    tmp65_64[0] = localObject1;
    tmp65_64[1] = localObject2;
    tmp65_64[2] = localObject3;
    o00OoOoo = tmp65_64;
    localObject1 = new com/qinggan/now/common/HandBrakeStatus$1;
    ((HandBrakeStatus.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.common.HandBrakeStatus
 * JD-Core Version:    0.7.0.1
 */