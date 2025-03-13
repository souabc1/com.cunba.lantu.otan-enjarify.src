package com.qinggan.bluetooth.phone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class PhoneBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public long o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    PhoneBean.1 local1 = new com/qinggan/bluetooth/phone/PhoneBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public PhoneBean() {}
  
  public PhoneBean(Parcel paramParcel)
  {
    long l = paramParcel.readLong();
    this.o00OoOoo = l;
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    int i = paramParcel.readInt();
    this.o00Ooo0 = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long getContactId()
  {
    return this.o00OoOoo;
  }
  
  public String getNumber()
  {
    return this.o00Ooo00;
  }
  
  public int getType()
  {
    return this.o00Ooo0;
  }
  
  public void setContactId(long paramLong)
  {
    this.o00OoOoo = paramLong;
  }
  
  public void setNumber(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str = m54207b69.F54207b69_11("7^0E3733333F214146382E");
    localStringBuilder.<init>(str);
    str = m54207b69.F54207b69_11("7'44494B564A4959754B23");
    localStringBuilder.append(str);
    long l = this.o00OoOoo;
    localStringBuilder.append(l);
    str = m54207b69.F54207b69_11("m;171C57515A5E64500E25");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append('\'');
    str = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append(str);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00OoOoo;
    paramParcel.writeLong(l);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.phone.PhoneBean
 * JD-Core Version:    0.7.0.1
 */