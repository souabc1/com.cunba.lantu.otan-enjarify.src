package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LicensePlate
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public LicensePlateColor o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    LicensePlate.1 local1 = new com/qinggan/now/common/vehicle/LicensePlate$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCityCode()
  {
    return this.o00OoOoo;
  }
  
  public LicensePlateColor getColor()
  {
    return this.o00Ooo00;
  }
  
  public String getNumber()
  {
    return this.o00Ooo0;
  }
  
  public String getProvince()
  {
    return this.o00Ooo0O;
  }
  
  public void setCityCode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setColor(LicensePlateColor paramLicensePlateColor)
  {
    this.o00Ooo00 = paramLicensePlateColor;
  }
  
  public void setNumber(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setProvince(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.o00Ooo0O;
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.LicensePlate
 * JD-Core Version:    0.7.0.1
 */