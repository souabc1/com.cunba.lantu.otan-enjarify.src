package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class AudioClient
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    AudioClient.1 local1 = new com/qinggan/audiopolicy/AudioClient$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public AudioClient()
  {
    String str = "";
    this.o00Ooo00 = str;
    int i = -1;
    this.o00Ooo0O = i;
    this.o00Ooo0 = i;
    this.o00OoOoo = str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getClientId()
  {
    return this.o00OoOoo;
  }
  
  public String getPackageName()
  {
    return this.o00Ooo00;
  }
  
  public int getState()
  {
    return this.o00Ooo0;
  }
  
  public int getStreamType()
  {
    return this.o00Ooo0O;
  }
  
  public void setClientId(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPackageName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setStreamType(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("B?7E4B5D595481595D625A552A705C626715");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("vP7C712527263A374472");
    localStringBuilder.append(str);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("?z565B0B111F132547");
    localStringBuilder.append(str);
    i = this.o00Ooo0;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("W&0A0747524621");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioClient
 * JD-Core Version:    0.7.0.1
 */