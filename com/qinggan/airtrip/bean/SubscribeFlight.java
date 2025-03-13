package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class SubscribeFlight
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
  public int o00OooOO;
  public String o00OooOo;
  public String o0O00o0;
  
  static
  {
    SubscribeFlight.1 local1 = new com/qinggan/airtrip/bean/SubscribeFlight$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SubscribeFlight()
  {
    String str = "";
    this.o00OooO = str;
    this.o00OoOoo = str;
    this.o00OooO0 = str;
    this.o00Ooo0o = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
    this.o0O00o0 = str;
    this.o00Ooo00 = str;
    this.o00OooOo = str;
    this.o00OooOO = 0;
  }
  
  public SubscribeFlight(Parcel paramParcel)
  {
    String str = "";
    this.o00OooO = str;
    this.o00OoOoo = str;
    this.o00OooO0 = str;
    this.o00Ooo0o = str;
    this.o00Ooo0 = str;
    this.o00Ooo0O = str;
    this.o0O00o0 = str;
    this.o00Ooo00 = str;
    this.o00OooOo = str;
    this.o00OooOO = 0;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o0O00o0 = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00OooOo = str;
    int i = paramParcel.readInt();
    this.o00OooOO = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAppid()
  {
    return this.o00OoOoo;
  }
  
  public String getCreatetime()
  {
    return this.o00Ooo00;
  }
  
  public String getDeptairportcode()
  {
    return this.o00Ooo0;
  }
  
  public String getDestairportcode()
  {
    return this.o00Ooo0O;
  }
  
  public String getFlightdate()
  {
    return this.o00Ooo0o;
  }
  
  public String getFlightno()
  {
    return this.o00OooO0;
  }
  
  public String getId()
  {
    return this.o00OooO;
  }
  
  public int getIsuse()
  {
    return this.o00OooOO;
  }
  
  public String getUpdatetime()
  {
    return this.o00OooOo;
  }
  
  public String getUserid()
  {
    return this.o0O00o0;
  }
  
  public void setAppid(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCreatetime(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setDeptairportcode(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setDestairportcode(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setFlightdate(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setFlightno(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setId(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setIsuse(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setUpdatetime(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setUserid(String paramString)
  {
    this.o0O00o0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("&.68424445455E5151704B5154526763565A241B");
    localStringBuilder.append(str1);
    str1 = this.o00OooO;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("1-010E4D44484F4B604B4B1A15");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("j_73803B363A3D3D32434735456E85");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(")q5D521717050A161F0B0A280E111F2C24245D68");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("0%090643435A564A535F5E54625D535850502914");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("DC6F642C333A352C85");
    localStringBuilder.append(str1);
    int i = this.o00OooOO;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o0O00o0;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SubscribeFlight
 * JD-Core Version:    0.7.0.1
 */