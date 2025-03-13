package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class WeChatResponse
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo00;
  
  static
  {
    WeChatResponse.1 local1 = new com/qinggan/wechat/WeChatResponse$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public WeChatResponse() {}
  
  public WeChatResponse(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00Ooo00 = i;
    paramParcel = paramParcel.readString();
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getErrMessage()
  {
    return this.o00OoOoo;
  }
  
  public int getRet()
  {
    return this.o00Ooo00;
  }
  
  public void setErrMessage(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setRet(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("Z/784B6E4A5260835164684A4C6857626C5A6C24");
    localStringBuilder.append(str);
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("=N626F2D3F40083144453833367F76");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatResponse
 * JD-Core Version:    0.7.0.1
 */