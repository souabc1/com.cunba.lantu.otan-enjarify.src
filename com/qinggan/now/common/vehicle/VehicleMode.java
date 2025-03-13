package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VehicleMode
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    VehicleMode.1 local1 = new com/qinggan/now/common/vehicle/VehicleMode$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getBrand()
  {
    return this.o00OoOoo;
  }
  
  public String getDisplacement()
  {
    return this.o00Ooo00;
  }
  
  public String getSeries()
  {
    return this.o00Ooo0;
  }
  
  public String getType()
  {
    return this.o00Ooo0O;
  }
  
  public void setBrand(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDisplacement(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setSeries(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setType(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.VehicleMode
 * JD-Core Version:    0.7.0.1
 */