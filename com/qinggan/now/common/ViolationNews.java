package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class ViolationNews
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public long o00Ooo0;
  public Date o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public int o00OooO0;
  
  static
  {
    ViolationNews.1 local1 = new com/qinggan/now/common/ViolationNews$1;
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
  
  public long getId()
  {
    return this.o00Ooo0;
  }
  
  public int getIsRead()
  {
    return this.o00Ooo0O;
  }
  
  public String getTitle()
  {
    return this.o00Ooo0o;
  }
  
  public int getType()
  {
    return this.o00OooO0;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setId(long paramLong)
  {
    this.o00Ooo0 = paramLong;
  }
  
  public void setIsRead(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setTitle(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("?v20201B1D1B07252020411D0C111A202612245D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("H814194E545059630C27");
    localStringBuilder.append(str);
    str = this.o00Ooo0o;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("j^727F393D67");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo0;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("@\\707D3732123E433F69");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO0;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null) {
      l = ((Date)localObject).getTime();
    } else {
      l = 0L;
    }
    paramParcel.writeLong(l);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    long l = this.o00Ooo0;
    paramParcel.writeLong(l);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ViolationNews
 * JD-Core Version:    0.7.0.1
 */