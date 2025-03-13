package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum WeatherCardType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/WeatherCardType;
    Object localObject2 = m54207b69.F54207b69_11("qH0A0A0E1A23120F23081624");
    ((WeatherCardType)localObject1).<init>((String)localObject2, 0);
    o00Ooo00 = (WeatherCardType)localObject1;
    localObject2 = new com/qinggan/now/common/WeatherCardType;
    Object localObject3 = m54207b69.F54207b69_11("7U0315181705212022120B1A1F0D2A1E16");
    ((WeatherCardType)localObject2).<init>((String)localObject3, 1);
    o00Ooo0o = (WeatherCardType)localObject2;
    localObject3 = new com/qinggan/now/common/WeatherCardType;
    Object localObject4 = m54207b69.F54207b69_11("k+787F64826E6E6D757C7174848089788773");
    ((WeatherCardType)localObject3).<init>((String)localObject4, 2);
    o00Ooo0O = (WeatherCardType)localObject3;
    localObject4 = new com/qinggan/now/common/WeatherCardType;
    String str = m54207b69.F54207b69_11("3N011B080E20");
    ((WeatherCardType)localObject4).<init>(str, 3);
    o00Ooo0 = (WeatherCardType)localObject4;
    WeatherCardType[] tmp86_83 = new WeatherCardType[4];
    WeatherCardType[] tmp87_86 = tmp86_83;
    WeatherCardType[] tmp87_86 = tmp86_83;
    tmp87_86[0] = localObject1;
    tmp87_86[1] = localObject2;
    tmp87_86[2] = localObject3;
    WeatherCardType[] tmp97_87 = tmp87_86;
    tmp97_87[3] = localObject4;
    o00OoOoo = tmp97_87;
    localObject1 = new com/qinggan/now/common/WeatherCardType$1;
    ((WeatherCardType.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.common.WeatherCardType
 * JD-Core Version:    0.7.0.1
 */