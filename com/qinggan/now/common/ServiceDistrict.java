package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class ServiceDistrict
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public double o00OoOoo;
  public String o00Ooo0;
  public double o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public int o00OooO0;
  
  static
  {
    ServiceDistrict.1 local1 = new com/qinggan/now/common/ServiceDistrict$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return this.o00Ooo0;
  }
  
  public int getDistance()
  {
    return this.o00Ooo0O;
  }
  
  public double getLat()
  {
    return this.o00OoOoo;
  }
  
  public double getLon()
  {
    return this.o00Ooo00;
  }
  
  public String getName()
  {
    return this.o00Ooo0o;
  }
  
  public int getRemainTime()
  {
    return this.o00OooO0;
  }
  
  public String getTag()
  {
    return this.o00OooO;
  }
  
  public void setAddress(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setDistance(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setLat(double paramDouble)
  {
    this.o00OoOoo = paramDouble;
  }
  
  public void setLon(double paramDouble)
  {
    this.o00Ooo00 = paramDouble;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setRemainTime(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setTag(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(":16255454A5C575A7C604B4F4E645F53207A6D9163706922");
    localStringBuilder.append(str);
    str = this.o00Ooo0o;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("o(0409476F456062504E545720");
    localStringBuilder.append(str);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("Q\\310F3B34413A380F3D3A437B88");
    localStringBuilder.append(str);
    i = this.o00OooO0;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("Dl404D033B1110");
    localStringBuilder.append(str);
    str = this.o00OooO;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("-h4449072C101120142324");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo0o;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    double d = this.o00Ooo00;
    paramParcel.writeDouble(d);
    d = this.o00OoOoo;
    paramParcel.writeDouble(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ServiceDistrict
 * JD-Core Version:    0.7.0.1
 */