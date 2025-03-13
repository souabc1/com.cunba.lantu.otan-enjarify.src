package com.qinggan.systempolicy.videopolicy;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class VideoFocusInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00 = "";
  
  static
  {
    VideoFocusInfo.1 local1 = new com/qinggan/systempolicy/videopolicy/VideoFocusInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public VideoFocusInfo()
  {
    int i = -1;
    this.o00Ooo0 = i;
    this.o00OoOoo = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof VideoFocusInfo;
    if (!bool1) {
      return false;
    }
    paramObject = (VideoFocusInfo)paramObject;
    bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    String str1 = paramObject.getPackageName();
    String str2 = this.o00Ooo00;
    boolean bool2 = str1.equals(str2);
    if (bool2)
    {
      int j = paramObject.getPid();
      int i = this.o00Ooo0;
      if (j == i) {
        return bool1;
      }
    }
    return false;
  }
  
  public int getDisplayId()
  {
    return this.o00OoOoo;
  }
  
  public String getPackageName()
  {
    return this.o00Ooo00;
  }
  
  public int getPid()
  {
    return this.o00Ooo0;
  }
  
  public int hashCode()
  {
    int i = this.o00Ooo00.hashCode();
    int j = this.o00Ooo0;
    return i + j;
  }
  
  public void setDisplayId(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setPackageName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPid(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("iE132D23232E08302D383F16362F374C443E90");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("?R7E73243E3A6D");
    localStringBuilder.append(str);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11(">(04094E445F17");
    localStringBuilder.append(str);
    i = this.o00OoOoo;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.videopolicy.VideoFocusInfo
 * JD-Core Version:    0.7.0.1
 */