package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Member
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public String o00OoooO;
  public int o0O00o0;
  
  static
  {
    Member.1 local1 = new com/qinggan/wechat/Member$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Member() {}
  
  public Member(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o0O00o0 = i;
    String str = paramParcel.readString();
    this.o00OoooO = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    i = paramParcel.readInt();
    this.o00OoOoo = i;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00OooOO = str;
    str = paramParcel.readString();
    this.o00OooOo = str;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getAttrStatus()
  {
    return this.o00OoOoo;
  }
  
  public String getDisplayName()
  {
    return this.o00Ooo00;
  }
  
  public String getKeyWord()
  {
    return this.o00Ooo0;
  }
  
  public int getMemberStatus()
  {
    return this.o00Ooo0O;
  }
  
  public String getNickName()
  {
    return this.o00Ooo0o;
  }
  
  public String getPYInitial()
  {
    return this.o00OooO0;
  }
  
  public String getPYQuanPin()
  {
    return this.o00OooO;
  }
  
  public String getRemarkPYInitial()
  {
    return this.o00OooOO;
  }
  
  public String getRemarkPYQuanPin()
  {
    return this.o00OooOo;
  }
  
  public int getUin()
  {
    return this.o0O00o0;
  }
  
  public String getUserName()
  {
    return this.o00OoooO;
  }
  
  public void setAttrStatus(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setDisplayName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setKeyWord(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setMemberStatus(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setNickName(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setPYInitial(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setPYQuanPin(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setRemarkPYInitial(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setRemarkPYQuanPin(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setUin(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setUserName(String paramString)
  {
    this.o00OoooO = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("eQ1C353E363828302B404876");
    localStringBuilder.append(str1);
    int i = this.o0O00o0;
    localStringBuilder.append(i);
    str1 = m54207b69.F54207b69_11("hf4A47151807192E0E130C654C");
    localStringBuilder.append(str1);
    str1 = this.o00OoooO;
    localStringBuilder.append(str1);
    i = 39;
    localStringBuilder.append(i);
    String str2 = m54207b69.F54207b69_11("[W7B783B4138411F3D423B747B");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("=31F14544A4B46664E5A50504B1A");
    localStringBuilder.append(str2);
    int j = this.o00OoOoo;
    localStringBuilder.append(j);
    str2 = m54207b69.F54207b69_11("6o435021192A060C220E170D5D54");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("7p5C51020C250A17252822285863");
    localStringBuilder.append(str2);
    str2 = this.o00OooO;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("/l404D200C0512240E443E2F0D1125131C10625D");
    localStringBuilder.append(str2);
    str2 = this.o00OooOO;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("@m414E210B0411250D453D462318104B1313615C");
    localStringBuilder.append(str2);
    str2 = this.o00OooOo;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("ba4D420E0710080A1A3A1E0A20201F6A");
    localStringBuilder.append(str2);
    j = this.o00Ooo0O;
    localStringBuilder.append(j);
    str2 = m54207b69.F54207b69_11("\\21E13585E4547645A53855D6A631C23");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("::161B536247725B4F661027");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    String str = this.o00OoooO;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OooOO;
    paramParcel.writeString(str);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.Member
 * JD-Core Version:    0.7.0.1
 */