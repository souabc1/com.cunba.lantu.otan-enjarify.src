package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class S2cPassengerInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO0;
  
  static
  {
    S2cPassengerInfo.1 local1 = new com/qinggan/airtrip/bean/S2cPassengerInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public S2cPassengerInfo() {}
  
  public S2cPassengerInfo(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    paramParcel = paramParcel.readString();
    this.o00OooO0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getClazzDescribe()
  {
    return this.o00OoOoo;
  }
  
  public String getCoupon()
  {
    return this.o00Ooo00;
  }
  
  public String getFfpNo()
  {
    return this.o00Ooo0;
  }
  
  public String getFfpType()
  {
    return this.o00Ooo0O;
  }
  
  public String getResultCode()
  {
    return this.o00Ooo0o;
  }
  
  public String getTktNum()
  {
    return this.o00OooO0;
  }
  
  public void setClazzDescribe(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCoupon(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setFfpNo(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setFfpType(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setResultCode(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setTktNum(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("Pf355507390B1A1B0A100A0D1F3B150E182D161C1A3031381A2D1E2E2A20207960");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("{T7875393E25294141717C");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(",h444910111C2B0D5C57");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("x71B1853544B68544E5A131A");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("Hf4A471606191810192D120C0E674E");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("W5191643614580465F101B");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.S2cPassengerInfo
 * JD-Core Version:    0.7.0.1
 */