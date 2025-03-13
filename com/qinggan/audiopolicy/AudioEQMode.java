package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class AudioEQMode
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public HashMap o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    AudioEQMode.1 local1 = new com/qinggan/audiopolicy/AudioEQMode$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public static String getBandKey(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("^B20242E29");
    localStringBuilder.append(str);
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public HashMap getBandValues()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void setBandValues(HashMap paramHashMap)
  {
    this.o00OoOoo = paramHashMap;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("9`2116060C132A3734170D0F261A0E1B146D58");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('\'');
    localObject = m54207b69.F54207b69_11("eS7F74401436423D0C3A4830412C7B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeMap((Map)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioEQMode
 * JD-Core Version:    0.7.0.1
 */