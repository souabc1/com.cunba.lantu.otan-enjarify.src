package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Send2CarInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public Send2CarType o00Ooo0o;
  
  static
  {
    Send2CarInfo.1 local1 = new com/qinggan/now/common/Send2CarInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Send2CarInfo() {}
  
  public Send2CarInfo(Send2CarInfo paramSend2CarInfo)
  {
    Object localObject = paramSend2CarInfo.o00Ooo0o;
    this.o00Ooo0o = ((Send2CarType)localObject);
    localObject = paramSend2CarInfo.o00Ooo0;
    this.o00Ooo0 = ((String)localObject);
    localObject = paramSend2CarInfo.o00Ooo00;
    this.o00Ooo00 = ((String)localObject);
    localObject = paramSend2CarInfo.o00OoOoo;
    this.o00OoOoo = ((String)localObject);
    paramSend2CarInfo = paramSend2CarInfo.o00Ooo0O;
    this.o00Ooo0O = paramSend2CarInfo;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDeviceId()
  {
    return this.o00OoOoo;
  }
  
  public String getNickName()
  {
    return this.o00Ooo00;
  }
  
  public String getOpenId()
  {
    return this.o00Ooo0;
  }
  
  public String getPdsn()
  {
    return this.o00Ooo0O;
  }
  
  public Send2CarType getType()
  {
    return this.o00Ooo0o;
  }
  
  public void setDeviceId(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setOpenId(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setPdsn(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setType(Send2CarType paramSend2CarType)
  {
    this.o00Ooo0o = paramSend2CarType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("?z292016214C3E210F3B1D26200D1B11192F58");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Tu59561C0814204218505B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("[W7B783B4138411F3D423B747B");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11(":Y757A3F3F3335404318466E89");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11(";@6C6132273733836E");
    localStringBuilder.append(str);
    str = this.o00Ooo0O;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Send2CarType localSend2CarType = this.o00Ooo0o;
    paramParcel.writeParcelable(localSend2CarType, paramInt);
    String str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Send2CarInfo
 * JD-Core Version:    0.7.0.1
 */