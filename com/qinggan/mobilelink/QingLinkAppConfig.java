package com.qinggan.mobilelink;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class QingLinkAppConfig
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public HashMap o00Ooo0;
  public boolean o00Ooo00;
  
  static
  {
    QingLinkAppConfig.1 local1 = new com/qinggan/mobilelink/QingLinkAppConfig$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public QingLinkAppConfig(Parcel paramParcel)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.o00Ooo0 = ((HashMap)localObject);
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    int i = paramParcel.readByte();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00Ooo00 = i;
    localObject = Object.class.getClassLoader();
    paramParcel = paramParcel.readHashMap((ClassLoader)localObject);
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAppName()
  {
    return this.o00OoOoo;
  }
  
  public boolean isAvailableInMobile()
  {
    return this.o00Ooo00;
  }
  
  public void setAppName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setAvailableInMobile(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("R4655E5C567C6260667D4D4E826767606C63606757588F6B7069222D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('\'');
    localObject = m54207b69.F54207b69_11("<N626F313B332C2836342B35122C102F3B37333D86");
    localStringBuilder.append((String)localObject);
    boolean bool = this.o00Ooo00;
    localStringBuilder.append(bool);
    localObject = m54207b69.F54207b69_11("1\\707D352B383E34263B3B4440476E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    paramInt = (byte)this.o00Ooo00;
    paramParcel.writeByte(paramInt);
    localObject = this.o00Ooo0;
    paramParcel.writeMap((Map)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.mobilelink.QingLinkAppConfig
 * JD-Core Version:    0.7.0.1
 */