package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FlightPathInfo$FlightStopInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    FlightPathInfo.FlightStopInfo.1 local1 = new com/qinggan/airtrip/bean/FlightPathInfo$FlightStopInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FlightPathInfo$FlightStopInfo()
  {
    String str = "";
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0O = str;
    this.o00Ooo0 = str;
  }
  
  public FlightPathInfo$FlightStopInfo(Parcel paramParcel)
  {
    String str = "";
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0O = str;
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.FlightPathInfo.FlightStopInfo
 * JD-Core Version:    0.7.0.1
 */