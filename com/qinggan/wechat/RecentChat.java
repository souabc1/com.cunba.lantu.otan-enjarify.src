package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class RecentChat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public long o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    RecentChat.1 local1 = new com/qinggan/wechat/RecentChat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public RecentChat() {}
  
  public RecentChat(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    long l = paramParcel.readLong();
    this.o00OoOoo = l;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long getLastReadTime()
  {
    return this.o00OoOoo;
  }
  
  public String getUserName()
  {
    return this.o00Ooo00;
  }
  
  public void setLastReadTime(long paramLong)
  {
    this.o00OoOoo = paramLong;
  }
  
  public void setUserName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("KV043437363C271B453F2B372E31403227474C457E85");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append('\'');
    str = m54207b69.F54207b69_11("Ji454A070B1E2241131016470B101962");
    localStringBuilder.append(str);
    long l = this.o00OoOoo;
    localStringBuilder.append(l);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    long l = this.o00OoOoo;
    paramParcel.writeLong(l);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.RecentChat
 * JD-Core Version:    0.7.0.1
 */