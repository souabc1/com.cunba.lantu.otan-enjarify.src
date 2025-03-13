package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class CheckinResult
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    CheckinResult.1 local1 = new com/qinggan/airtrip/bean/CheckinResult$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public CheckinResult() {}
  
  public CheckinResult(Parcel paramParcel)
  {
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
    this.o00OoOoo = i;
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getErrCode()
  {
    return this.o00Ooo00;
  }
  
  public String getErrMsg()
  {
    return this.o00Ooo0;
  }
  
  public boolean isCouldCheckIn()
  {
    return this.o00OoOoo;
  }
  
  public void setCouldCheckIn(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
  }
  
  public void setErrCode(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setErrMsg(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("i{3814201B14171B30261118221B0D26231E28314B27332E274A2E60");
    localStringBuilder.append(str1);
    boolean bool = this.o00OoOoo;
    localStringBuilder.append(bool);
    str1 = m54207b69.F54207b69_11("rN626F2D3F40122731337C73");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("CC6F6428343513362B866D");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeByte(paramInt);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.CheckinResult
 * JD-Core Version:    0.7.0.1
 */