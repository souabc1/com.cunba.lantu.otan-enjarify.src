package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class ParkInOrOutInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    ParkInOrOutInfo.1 local1 = new com/qinggan/now/common/ParkInOrOutInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getBusinessSubtype()
  {
    return this.o00OoOoo;
  }
  
  public String getMessage()
  {
    return this.o00Ooo00;
  }
  
  public String getTitle()
  {
    return this.o00Ooo0;
  }
  
  public void setBusinessSubtype(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setMessage(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("+r2214021C3F2143074510104628212B6139172D19322C65");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("Ho43500F1D200B0711242546251928242E1A63");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("e11D125E574647565D5C15");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ParkInOrOutInfo
 * JD-Core Version:    0.7.0.1
 */