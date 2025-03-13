package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class WechatInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public Date o00Ooo00;
  
  static
  {
    WechatInfo.1 local1 = new com/qinggan/now/common/WechatInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public Date getDate()
  {
    return this.o00Ooo00;
  }
  
  public String getNiceName()
  {
    return this.o00Ooo0;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setNiceName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("j[0C3F3A363E34183C453D850B4B473D4D76");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("_O63702329302F07352A337C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("271B18565B5D4858604B13");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    long l;
    if (localObject != null) {
      l = ((Date)localObject).getTime();
    } else {
      l = 0L;
    }
    paramParcel.writeLong(l);
    localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WechatInfo
 * JD-Core Version:    0.7.0.1
 */