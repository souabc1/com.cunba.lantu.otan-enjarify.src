package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class AudioPolicyInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    AudioPolicyInfo.1 local1 = new com/qinggan/audiopolicy/AudioPolicyInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public AudioPolicyInfo()
  {
    String str = "";
    this.o00Ooo00 = str;
    this.o00Ooo0 = -1;
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
  
  public int getStreamType()
  {
    return this.o00Ooo0;
  }
  
  public void setClientId(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPackageName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setStreamType(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("d^1F2C3C3A351337393F4631223C453F343E504F48534E5127574C557E95");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("r'0B08565659474C517B67614D26");
    localStringBuilder.append(str2);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    str2 = m54207b69.F54207b69_11("{d4845090B110610173509634E");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioPolicyInfo
 * JD-Core Version:    0.7.0.1
 */