package com.qinggan.messagecenter.message;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BaseMessage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public String o00Ooo0;
  public final int o00Ooo00;
  public String o00Ooo0O;
  public final int o00Ooo0o;
  
  static
  {
    BaseMessage.1 local1 = new com/qinggan/messagecenter/message/BaseMessage$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BaseMessage(int paramInt1, int paramInt2)
  {
    String str = getClass().getSimpleName();
    this.o00Ooo0 = str;
    this.o00Ooo0o = paramInt1;
    this.o00Ooo00 = paramInt2;
  }
  
  public BaseMessage(Parcel paramParcel)
  {
    String str = getClass().getSimpleName();
    this.o00Ooo0 = str;
    int i = paramParcel.readInt();
    this.o00Ooo0o = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    paramParcel = paramParcel.readString();
    this.o00Ooo0O = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getId()
  {
    return this.o00OoOoo;
  }
  
  public int getSubType()
  {
    return this.o00Ooo00;
  }
  
  public String getTime()
  {
    return this.o00Ooo0O;
  }
  
  public int getType()
  {
    return this.o00Ooo0o;
  }
  
  public void setId(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setTime(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.messagecenter.message.BaseMessage
 * JD-Core Version:    0.7.0.1
 */