package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class City
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    City.1 local1 = new com/qinggan/now/common/City$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public City() {}
  
  public City(String paramString1, String paramString2)
  {
    this.o00OoOoo = paramString1;
    this.o00Ooo00 = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCode()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void setCode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("K\\1F362A286A0C");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append("|");
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.City
 * JD-Core Version:    0.7.0.1
 */