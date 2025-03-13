package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class S2cCheckinTravelInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public boolean o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public String o00OoooO;
  public String o00Ooooo;
  public String o00o0000;
  public String o0O00o0;
  
  static
  {
    S2cCheckinTravelInfo.1 local1 = new com/qinggan/airtrip/bean/S2cCheckinTravelInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public S2cCheckinTravelInfo() {}
  
  public S2cCheckinTravelInfo(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00OooOo = str;
    str = paramParcel.readString();
    this.o00OooOO = str;
    str = paramParcel.readString();
    this.o00OoooO = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00Ooooo = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    str = paramParcel.readString();
    this.o00o0000 = str;
    str = paramParcel.readString();
    this.o0O00o0 = str;
    int i = paramParcel.readByte();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00Ooo0 = i;
    int j = paramParcel.readInt();
    this.o00Ooo0O = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAirline()
  {
    return this.o00OoOoo;
  }
  
  public String getAirlineName()
  {
    return this.o00Ooo00;
  }
  
  public int getCanPw()
  {
    return this.o00Ooo0O;
  }
  
  public String getCoupon()
  {
    return this.o00Ooo0o;
  }
  
  public String getDeptAirportCode()
  {
    return this.o00OooO0;
  }
  
  public String getDestAirportCode()
  {
    return this.o00OooO;
  }
  
  public String getFlightDate()
  {
    return this.o00OooOO;
  }
  
  public String getFlightNo()
  {
    return this.o00OooOo;
  }
  
  public String getPassengerName()
  {
    return this.o0O00o0;
  }
  
  public String getStd()
  {
    return this.o00OoooO;
  }
  
  public String getTktNo()
  {
    return this.o00Ooooo;
  }
  
  public String getTktStatus()
  {
    return this.o00o0000;
  }
  
  public boolean isCanDealWith()
  {
    return this.o00Ooo0;
  }
  
  public void setAirline(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setAirlineName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setCanDealWith(boolean paramBoolean)
  {
    this.o00Ooo0 = paramBoolean;
  }
  
  public void setCanPw(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setCoupon(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setDeptAirportCode(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setDestAirportCode(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setFlightDate(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setFlightNo(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setPassengerName(String paramString)
  {
    this.o0O00o0 = paramString;
  }
  
  public void setStd(String paramString)
  {
    this.o00OoooO = paramString;
  }
  
  public void setTktNo(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public void setTktStatus(String paramString)
  {
    this.o00o0000 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("UQ026434153D39384140480F2E3C34424C285049513E454E3A5551594F8893");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("o^727F413A30373D374319493E477087");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("{k474C0F0A061109262D0D6057");
    localStringBuilder.append(str2);
    str2 = this.o00OooOo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(".R7E7336413F3A402D1E3C30427B82");
    localStringBuilder.append(str2);
    str2 = this.o00OooOO;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(",F6A673735268067");
    localStringBuilder.append(str2);
    str2 = this.o00OoooO;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("p/03104D4D6360744D65684A6867794E5A5A231A");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("bC6F642929343C0831393C363C430D3A36368F76");
    localStringBuilder.append(str2);
    str2 = this.o00OooO;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("@+070C6143636A4A1D14");
    localStringBuilder.append(str2);
    str2 = this.o00Ooooo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("{T7875393E25294141717C");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("Wb4E43180C1A361C0A1E201B6A51");
    localStringBuilder.append(str2);
    str2 = this.o00o0000;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("t21E13445645465D635D604A875F6C651E25");
    localStringBuilder.append(str2);
    str2 = this.o0O00o0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("(,000D5150466D4F5448844F63501E");
    localStringBuilder.append(str1);
    boolean bool = this.o00Ooo0;
    localStringBuilder.append(bool);
    str1 = m54207b69.F54207b69_11("A\\707D414036113168");
    localStringBuilder.append(str1);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    str = this.o00OooOO;
    paramParcel.writeString(str);
    str = this.o00OoooO;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00Ooooo;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00o0000;
    paramParcel.writeString(str);
    str = this.o0O00o0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeByte(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.S2cCheckinTravelInfo
 * JD-Core Version:    0.7.0.1
 */