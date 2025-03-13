package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum CarDoorStatus
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/CarDoorStatus;
    Object localObject2 = m54207b69.F54207b69_11("y]1E3234313C3E");
    ((CarDoorStatus)localObject1).<init>((String)localObject2, 0);
    o00Ooo0 = (CarDoorStatus)localObject1;
    localObject2 = new com/qinggan/now/common/CarDoorStatus;
    Object localObject3 = m54207b69.F54207b69_11("8H07392F29");
    ((CarDoorStatus)localObject2).<init>((String)localObject3, 1);
    o00Ooo0o = (CarDoorStatus)localObject2;
    localObject3 = new com/qinggan/now/common/CarDoorStatus;
    Object localObject4 = m54207b69.F54207b69_11("h<7D575F51");
    ((CarDoorStatus)localObject3).<init>((String)localObject4, 2);
    o00Ooo00 = (CarDoorStatus)localObject3;
    localObject4 = new com/qinggan/now/common/CarDoorStatus;
    Object localObject5 = m54207b69.F54207b69_11("|27448606181475D63");
    ((CarDoorStatus)localObject4).<init>((String)localObject5, 3);
    o00Ooo0O = (CarDoorStatus)localObject4;
    localObject5 = new com/qinggan/now/common/CarDoorStatus;
    String str = m54207b69.F54207b69_11("Qp251F1D21230C");
    ((CarDoorStatus)localObject5).<init>(str, 4);
    o00OooO0 = (CarDoorStatus)localObject5;
    CarDoorStatus[] tmp111_108 = new CarDoorStatus[5];
    CarDoorStatus[] tmp112_111 = tmp111_108;
    CarDoorStatus[] tmp112_111 = tmp111_108;
    tmp112_111[0] = localObject1;
    tmp112_111[1] = localObject2;
    CarDoorStatus[] tmp119_112 = tmp112_111;
    CarDoorStatus[] tmp119_112 = tmp112_111;
    tmp119_112[2] = localObject3;
    tmp119_112[3] = localObject4;
    tmp119_112[4] = localObject5;
    o00OoOoo = tmp119_112;
    localObject1 = new com/qinggan/now/common/CarDoorStatus$1;
    ((CarDoorStatus.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.common.CarDoorStatus
 * JD-Core Version:    0.7.0.1
 */