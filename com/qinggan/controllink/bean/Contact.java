package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Contact
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  
  static
  {
    Contact.1 local1 = new com/qinggan/controllink/bean/Contact$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Contact(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.o00Ooo0o = paramInt1;
    this.o00Ooo00 = paramString1;
    this.o00Ooo0 = paramString2;
    this.o00Ooo0O = paramInt2;
    this.o00OoOoo = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getIndex()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public String getPhone()
  {
    return this.o00Ooo0;
  }
  
  public int getState()
  {
    return this.o00Ooo0O;
  }
  
  public int getType()
  {
    return this.o00Ooo0o;
  }
  
  public void setIndex(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPhone(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("M+7F535D511510");
    localStringBuilder.append(str);
    int i = this.o00Ooo0o;
    int j = 1;
    if (i == j) {
      str = "TOP";
    } else {
      str = m54207b69.F54207b69_11(")E080D18190406");
    }
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("Uh48270B0811574E");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("i'0778514B4D47230E");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Contact
 * JD-Core Version:    0.7.0.1
 */