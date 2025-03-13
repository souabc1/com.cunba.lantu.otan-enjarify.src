package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class MessageInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public Date o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    MessageInfo.1 local1 = new com/qinggan/now/common/MessageInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContactName()
  {
    return this.o00OoOoo;
  }
  
  public String getContent()
  {
    return this.o00Ooo00;
  }
  
  public Date getDate()
  {
    return this.o00Ooo0;
  }
  
  public String getPhoneNum()
  {
    return this.o00Ooo0O;
  }
  
  public void setContactName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setContent(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo0 = paramDate;
  }
  
  public void setPhoneNum(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("Cu3811080918171643231C24603A1E22102059");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("z21E135360604B59584E855D6A631C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("K,000D5E4747474F69614A1B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("271B18565B5D4858604B13");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0;
    long l;
    if (localObject != null) {
      l = ((Date)localObject).getTime();
    } else {
      l = 0L;
    }
    paramParcel.writeLong(l);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MessageInfo
 * JD-Core Version:    0.7.0.1
 */