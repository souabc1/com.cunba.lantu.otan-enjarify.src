package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FlightPathInfo$Position
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    FlightPathInfo.Position.1 local1 = new com/qinggan/airtrip/bean/FlightPathInfo$Position$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FlightPathInfo$Position() {}
  
  public FlightPathInfo$Position(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.FlightPathInfo.Position
 * JD-Core Version:    0.7.0.1
 */