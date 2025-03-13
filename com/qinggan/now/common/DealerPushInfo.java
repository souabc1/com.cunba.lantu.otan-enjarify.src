package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class DealerPushInfo
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
    DealerPushInfo.1 local1 = new com/qinggan/now/common/DealerPushInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public String getPhone()
  {
    return this.o00Ooo00;
  }
  
  public String getPic()
  {
    return this.o00Ooo0;
  }
  
  public String getPoiAddress()
  {
    return this.o00Ooo0O;
  }
  
  public String getPoiLonLat()
  {
    return this.o00Ooo0o;
  }
  
  public String getPoiName()
  {
    return this.o00OooO0;
  }
  
  public String getTitle()
  {
    return this.o00OooO;
  }
  
  public String getUrl()
  {
    return this.o00OooOO;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPhone(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPic(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setPoiAddress(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setPoiLonLat(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setPoiName(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("])6D4D4A4850607F63624A6A525B53606C506E575F28");
    localStringBuilder.append(str1);
    str1 = this.o00OooO;
    localStringBuilder.append(str1);
    str1 = m54207b69.F54207b69_11("271B18565B5D4858604B13");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    str1 = m54207b69.F54207b69_11("KR7E73243D41413D767D");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("=b4E43191312644B");
    localStringBuilder.append(str2);
    str2 = this.o00OooOO;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("_l404D1E08135651");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("Ve4946170D102E1012310D1B634E");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("5O637041232A063429327B72");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("0[777C2D37361F45463147323372");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo0O;
    localStringBuilder.append(str1);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OooOO;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DealerPushInfo
 * JD-Core Version:    0.7.0.1
 */