package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class UpdateInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public long o00Ooo0o;
  public String o00OooO0;
  
  static
  {
    UpdateInfo.1 local1 = new com/qinggan/now/common/UpdateInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDescription()
  {
    return this.o00OoOoo;
  }
  
  public String getMcuVersion()
  {
    return this.o00Ooo00;
  }
  
  public String getMpuVersion()
  {
    return this.o00Ooo0;
  }
  
  public String getOther()
  {
    return this.o00Ooo0O;
  }
  
  public long getSize()
  {
    return this.o00Ooo0o;
  }
  
  public String getUpdateDate()
  {
    return this.o00OooO0;
  }
  
  public void setDescription(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setMcuVersion(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setMpuVersion(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setOther(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setSize(long paramLong)
  {
    this.o00Ooo0o = paramLong;
  }
  
  public void setUpdateDate(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("^d31150208140633110A142914201E401026281F1E1E6E59");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo0;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("Dn424F05101F3D112325100B0B5F56");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("%k474C11111C0D1F0923280C0F11635A");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("p(04095D4456521B16");
    localStringBuilder.append(str2);
    long l = this.o00Ooo0o;
    localStringBuilder.append(l);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("0-010E5A604D515F4F715563531C17");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("HQ7D7240283D3929737E");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
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
    long l = this.o00Ooo0o;
    paramParcel.writeLong(l);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.UpdateInfo
 * JD-Core Version:    0.7.0.1
 */