package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class User
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  
  static
  {
    User.1 local1 = new com/qinggan/airtrip/bean/User$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public User()
  {
    String str = "";
    this.o00Ooo00 = str;
    this.o00Ooo0o = str;
    this.o00Ooo0O = "-1";
    this.o00OoOoo = false;
    this.o00Ooo0 = 0;
  }
  
  public User(Parcel paramParcel)
  {
    String str1 = "";
    this.o00Ooo00 = str1;
    this.o00Ooo0o = str1;
    this.o00Ooo0O = "-1";
    boolean bool = false;
    str1 = null;
    this.o00OoOoo = false;
    this.o00Ooo0 = 0;
    String str2 = paramParcel.readString();
    this.o00Ooo00 = str2;
    str2 = paramParcel.readString();
    this.o00Ooo0o = str2;
    str2 = paramParcel.readString();
    this.o00Ooo0O = str2;
    int i = paramParcel.readByte();
    if (i != 0) {
      bool = true;
    }
    this.o00OoOoo = bool;
    int j = paramParcel.readInt();
    this.o00Ooo0 = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public String getNickName()
  {
    return this.o00Ooo00;
  }
  
  public int getStatus()
  {
    return this.o00Ooo0;
  }
  
  public String getUid()
  {
    return this.o00Ooo0O;
  }
  
  public String getUserIcon()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isAuth()
  {
    return this.o00OoOoo;
  }
  
  public boolean isLogin()
  {
    int i = this.o00Ooo0;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public void setAuth(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setStatus(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setUid(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setUserIcon(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("|461485349535F635E67835F645D1621");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("\\M616E26410527302B2B79");
    localStringBuilder.append(str2);
    int j = this.o00Ooo0;
    localStringBuilder.append(j);
    str2 = m54207b69.F54207b69_11("tj464B1C060D5C");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    str2 = m54207b69.F54207b69_11("+-010E5A474D1510");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("TN626F29401340402D7B");
    localStringBuilder.append(str1);
    boolean bool = this.o00OoOoo;
    localStringBuilder.append(bool);
    str1 = m54207b69.F54207b69_11("xg4B4816160A18181B62");
    localStringBuilder.append(str1);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    paramInt = this.o00OoOoo;
    paramParcel.writeByte(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.User
 * JD-Core Version:    0.7.0.1
 */