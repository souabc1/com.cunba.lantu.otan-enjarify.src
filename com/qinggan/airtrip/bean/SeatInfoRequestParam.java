package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class SeatInfoRequestParam
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
    SeatInfoRequestParam.1 local1 = new com/qinggan/airtrip/bean/SeatInfoRequestParam$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SeatInfoRequestParam()
  {
    String str = "";
    this.o00OooO0 = str;
    this.o00Ooo0o = str;
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
  }
  
  public SeatInfoRequestParam(Parcel paramParcel)
  {
    String str = "";
    this.o00OooO0 = str;
    this.o00Ooo0o = str;
    this.o00OoOoo = str;
    this.o00Ooo00 = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0O = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDeptAirportCode()
  {
    return this.o00OoOoo;
  }
  
  public String getDestAirportCode()
  {
    return this.o00Ooo00;
  }
  
  public String getFlightDate()
  {
    return this.o00Ooo0;
  }
  
  public String getFlightNo()
  {
    return this.o00Ooo0O;
  }
  
  public String getPassengerName()
  {
    return this.o00Ooo0o;
  }
  
  public String getTktNo()
  {
    return this.o00OooO0;
  }
  
  public void setDeptAirportCode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDestAirportCode(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setFlightDate(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setFlightNo(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setPassengerName(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setTktNo(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("z[083F3C32163A433B114734394A353D1A4A3A4C49344446462D4D8097");
    localStringBuilder.append(str1);
    str1 = this.o00OooO0;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("t21E13445645465D635D604A875F6C651E25");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("p/03104D4D6360744D65684A6867794E5A5A231A");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("bC6F642929343C0831393C363C430D3A36368F76");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(".R7E7336413F3A402D1E3C30427B82");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("{k474C0F0A061109262D0D6057");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SeatInfoRequestParam
 * JD-Core Version:    0.7.0.1
 */