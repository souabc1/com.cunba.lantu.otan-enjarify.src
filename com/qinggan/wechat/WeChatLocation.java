package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class WeChatLocation
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public double o00OoOoo;
  public String o00Ooo0;
  public double o00Ooo00;
  
  static
  {
    WeChatLocation.1 local1 = new com/qinggan/wechat/WeChatLocation$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public double getLat()
  {
    return this.o00OoOoo;
  }
  
  public double getLon()
  {
    return this.o00Ooo00;
  }
  
  public String getName()
  {
    return this.o00Ooo0;
  }
  
  public void setLat(double paramDouble)
  {
    this.o00OoOoo = paramDouble;
  }
  
  public void setLon(double paramDouble)
  {
    this.o00Ooo00 = paramDouble;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("h874585D5C50565D5D4B5D616111");
    localStringBuilder.append(str);
    double d = this.o00Ooo00;
    localStringBuilder.append(d);
    str = m54207b69.F54207b69_11("{|505D12200C46");
    localStringBuilder.append(str);
    d = this.o00OoOoo;
    localStringBuilder.append(d);
    str = m54207b69.F54207b69_11("t=111E555F545D0621");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    double d = this.o00Ooo00;
    paramParcel.writeDouble(d);
    d = this.o00OoOoo;
    paramParcel.writeDouble(d);
    String str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatLocation
 * JD-Core Version:    0.7.0.1
 */