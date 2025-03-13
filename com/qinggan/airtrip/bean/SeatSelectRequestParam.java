package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class SeatSelectRequestParam
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  
  static
  {
    SeatSelectRequestParam.1 local1 = new com/qinggan/airtrip/bean/SeatSelectRequestParam$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SeatSelectRequestParam()
  {
    String str = "";
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
    this.o00Ooo0o = str;
    this.o00OooO0 = str;
    this.o00OooO = str;
    this.o00OooOO = str;
  }
  
  public SeatSelectRequestParam(Parcel paramParcel)
  {
    String str = "";
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
    this.o00Ooo0o = str;
    this.o00OooO0 = str;
    this.o00OooO = str;
    this.o00OooOO = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    paramParcel = paramParcel.readString();
    this.o00OooOO = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAuthCode()
  {
    return this.o00OoOoo;
  }
  
  public String getCoupon()
  {
    return this.o00Ooo00;
  }
  
  public String getFfpNum()
  {
    return this.o00Ooo0;
  }
  
  public String getFfpType()
  {
    return this.o00Ooo0O;
  }
  
  public String getReservedSeatNum()
  {
    return this.o00Ooo0o;
  }
  
  public String getSelectedSeatNum()
  {
    return this.o00OooO0;
  }
  
  public String getSessionKey()
  {
    return this.o00OooO;
  }
  
  public String getTktNo()
  {
    return this.o00OooOO;
  }
  
  public void setAuthCode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCoupon(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setFfpNum(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setFfpType(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setReservedSeatNum(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setSelectedSeatNum(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setSessionKey(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setTktNo(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11(",36057544A645B655D58506B614E53644F5774645466735E695E60758B7874742D34");
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
    str2 = m54207b69.F54207b69_11("m:161B5E5F4E79555E0F26");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("x71B1853544B68544E5A131A");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("q]717E313B323D3532404218434836213740718C");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("tS7F742239433B362E3E400A413E342B354E7F86");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("XK676C3A313C3D282B2D09383D8279");
    localStringBuilder.append(str2);
    str2 = this.o00OooO;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("@+070C6143636A4A1D14");
    localStringBuilder.append(str2);
    str2 = this.o00OooOO;
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
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OooOO;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SeatSelectRequestParam
 * JD-Core Version:    0.7.0.1
 */