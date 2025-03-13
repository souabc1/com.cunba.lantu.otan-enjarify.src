package com.qinggan.bluetooth.phone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class CallLogBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    CallLogBean.1 local1 = new com/qinggan/bluetooth/phone/CallLogBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public CallLogBean() {}
  
  public CallLogBean(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getName()
  {
    return this.o00OoOoo;
  }
  
  public String getNumber()
  {
    return this.o00Ooo00;
  }
  
  public String getTime()
  {
    return this.o00Ooo0;
  }
  
  public int getType()
  {
    return this.o00Ooo0O;
  }
  
  public void setName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setNumber(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str1 = m54207b69.F54207b69_11("@R1134404122423B173F3C4634");
    localStringBuilder.<init>(str1);
    str1 = m54207b69.F54207b69_11("@W39373C356E75");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("m;171C57515A5E64500E25");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("bh44491E0409125B56");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("Ei454A1F131D115A");
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
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.phone.CallLogBean
 * JD-Core Version:    0.7.0.1
 */