package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Channel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    Channel.1 local1 = new com/qinggan/controllink/bean/Channel$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Channel() {}
  
  public Channel(String paramString1, String paramString2, int paramInt)
  {
    this.o00Ooo00 = paramString1;
    this.o00OoOoo = paramString2;
    this.o00Ooo0 = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getChannel()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public int getState()
  {
    return this.o00Ooo0;
  }
  
  public void setChannel(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Channel
 * JD-Core Version:    0.7.0.1
 */