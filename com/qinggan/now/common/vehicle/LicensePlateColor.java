package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum LicensePlateColor
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/vehicle/LicensePlateColor;
    Object localObject2 = m54207b69.F54207b69_11("F87A756F80");
    ((LicensePlateColor)localObject1).<init>((String)localObject2, 0, "蓝");
    o00Ooo0O = (LicensePlateColor)localObject1;
    LicensePlateColor localLicensePlateColor1 = new com/qinggan/now/common/vehicle/LicensePlateColor;
    String str1 = m54207b69.F54207b69_11("{}24393334362F");
    localLicensePlateColor1.<init>(str1, 1, "黄");
    o00OooO0 = localLicensePlateColor1;
    LicensePlateColor localLicensePlateColor2 = new com/qinggan/now/common/vehicle/LicensePlateColor;
    String str2 = m54207b69.F54207b69_11("ec213024232C");
    localLicensePlateColor2.<init>(str2, 2, "黑");
    o00Ooo0 = localLicensePlateColor2;
    localObject2 = new com/qinggan/now/common/vehicle/LicensePlateColor;
    String str3 = m54207b69.F54207b69_11("2C140C0C1A0A");
    ((LicensePlateColor)localObject2).<init>(str3, 3, "白");
    o00Ooo0o = (LicensePlateColor)localObject2;
    LicensePlateColor[] tmp99_96 = new LicensePlateColor[4];
    LicensePlateColor[] tmp100_99 = tmp99_96;
    LicensePlateColor[] tmp100_99 = tmp99_96;
    tmp100_99[0] = localObject1;
    tmp100_99[1] = localLicensePlateColor1;
    tmp100_99[2] = localLicensePlateColor2;
    LicensePlateColor[] tmp111_100 = tmp100_99;
    tmp111_100[3] = localObject2;
    o00Ooo00 = tmp111_100;
    localObject1 = new com/qinggan/now/common/vehicle/LicensePlateColor$1;
    ((LicensePlateColor.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public LicensePlateColor(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getTitle()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.LicensePlateColor
 * JD-Core Version:    0.7.0.1
 */