package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum GasStationType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/GasStationType;
    Object localObject2 = m54207b69.F54207b69_11("cd2A020719051C16");
    ((GasStationType)localObject1).<init>((String)localObject2, 0);
    o00Ooo0O = (GasStationType)localObject1;
    localObject2 = new com/qinggan/now/common/GasStationType;
    Object localObject3 = m54207b69.F54207b69_11("r[153F3C2C");
    ((GasStationType)localObject2).<init>((String)localObject3, 1);
    o00Ooo0 = (GasStationType)localObject2;
    localObject3 = new com/qinggan/now/common/GasStationType;
    String str = m54207b69.F54207b69_11("Uc2D03170D08071D111416");
    ((GasStationType)localObject3).<init>(str, 2);
    o00Ooo00 = (GasStationType)localObject3;
    GasStationType[] tmp64_61 = new GasStationType[3];
    GasStationType[] tmp65_64 = tmp64_61;
    GasStationType[] tmp65_64 = tmp64_61;
    tmp65_64[0] = localObject1;
    tmp65_64[1] = localObject2;
    tmp65_64[2] = localObject3;
    o00OoOoo = tmp65_64;
    localObject1 = new com/qinggan/now/common/GasStationType$1;
    ((GasStationType.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.common.GasStationType
 * JD-Core Version:    0.7.0.1
 */