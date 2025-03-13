package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Airport$TelListBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    Airport.TelListBean.1 local1 = new com/qinggan/airtrip/bean/Airport$TelListBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Airport$TelListBean() {}
  
  public Airport$TelListBean(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo00 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getPcode()
  {
    return this.o00OoOoo;
  }
  
  public String getPname()
  {
    return this.o00Ooo00;
  }
  
  public String getPtel()
  {
    return this.o00Ooo0;
  }
  
  public String getPtelname()
  {
    return this.o00Ooo0O;
  }
  
  public void setPcode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPname(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPtel(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setPtelname(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("&<685A527359544E8561665C525855675F626E636C1530");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo0O;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("SC6F64353A2A34846B");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11(":y555A0B1D1A22224B66");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("5G6B68392C2A2F288168");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.Airport.TelListBean
 * JD-Core Version:    0.7.0.1
 */