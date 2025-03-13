package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import m54207b69;

public class Message
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public byte[] o00Ooo00;
  public long o00Ooo0O;
  public boolean o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public int o00OooOO;
  public boolean o00OooOo;
  public String o0O00o0;
  
  static
  {
    Message.1 local1 = new com/qinggan/airtrip/bean/Message$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Message()
  {
    this.o00Ooo0O = -1;
    String str = "";
    this.o00OooO = str;
    this.o00OooOO = -1;
    this.o00Ooo0 = str;
    this.o00OooO0 = str;
    this.o00OoOoo = str;
    this.o00OooOo = true;
    this.o00Ooo0o = false;
    byte[] arrayOfByte = new byte[0];
    this.o00Ooo00 = arrayOfByte;
    this.o0O00o0 = str;
  }
  
  public Message(Parcel paramParcel)
  {
    long l1 = -1;
    this.o00Ooo0O = l1;
    String str = "";
    this.o00OooO = str;
    this.o00OooOO = -1;
    this.o00Ooo0 = str;
    this.o00OooO0 = str;
    this.o00OoOoo = str;
    int i = 1;
    this.o00OooOo = i;
    this.o00Ooo0o = false;
    byte[] arrayOfByte = new byte[0];
    this.o00Ooo00 = arrayOfByte;
    this.o0O00o0 = str;
    long l2 = paramParcel.readLong();
    this.o00Ooo0O = l2;
    str = paramParcel.readString();
    this.o0O00o0 = str;
    int j = paramParcel.readInt();
    this.o00OooOO = j;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    j = paramParcel.readInt();
    if (j == i)
    {
      j = i;
    }
    else
    {
      j = 0;
      str = null;
    }
    this.o00OooOo = j;
    int k = paramParcel.readInt();
    if (k != i) {
      i = 0;
    }
    this.o00Ooo0o = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public String getDate()
  {
    return this.o00Ooo0;
  }
  
  public long getId()
  {
    return this.o00Ooo0O;
  }
  
  public String getTime()
  {
    return this.o00OooO0;
  }
  
  public String getTitle()
  {
    return this.o00OooO;
  }
  
  public int getType()
  {
    return this.o00OooOO;
  }
  
  public String getUserId()
  {
    return this.o0O00o0;
  }
  
  public boolean isDelete()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isUnRead()
  {
    return this.o00OooOo;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDate(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setDelete(boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
  }
  
  public void setId(long paramLong)
  {
    this.o00Ooo0O = paramLong;
  }
  
  public void setTime(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setUnRead(boolean paramBoolean)
  {
    this.o00OooOo = paramBoolean;
  }
  
  public void setUserId(String paramString)
  {
    this.o0O00o0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("5*67505B5C4F5255584B5721");
    localStringBuilder.append(str1);
    long l = this.o00Ooo0O;
    localStringBuilder.append(l);
    str1 = m54207b69.F54207b69_11("H814194E545059630C27");
    localStringBuilder.append(str1);
    str1 = this.o00OooO;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append(str2);
    int i = this.o00OooOO;
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("+?13205D614F5F081F");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("bh44491E0409125B56");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("dE6966322E1B252A2880");
    localStringBuilder.append(str2);
    boolean bool = this.o00OooOo;
    localStringBuilder.append(bool);
    str2 = m54207b69.F54207b69_11("Ht58551F0A34161E18081A53");
    localStringBuilder.append(str2);
    bool = this.o00Ooo0o;
    localStringBuilder.append(bool);
    str2 = m54207b69.F54207b69_11("&O63702D313F3378");
    localStringBuilder.append(str2);
    str2 = Arrays.toString(this.o00Ooo00);
    localStringBuilder.append(str2);
    str2 = m54207b69.F54207b69_11(".t5855030A150B4317515C");
    localStringBuilder.append(str2);
    str2 = this.o0O00o0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00Ooo0O;
    paramParcel.writeLong(l);
    String str = this.o0O00o0;
    paramParcel.writeString(str);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.Message
 * JD-Core Version:    0.7.0.1
 */