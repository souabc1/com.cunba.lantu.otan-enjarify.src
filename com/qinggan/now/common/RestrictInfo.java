package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class RestrictInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public Date o00Ooo00;
  public boolean o00Ooo0O;
  public GeoPoint o00Ooo0o;
  public String o00OooO0;
  
  static
  {
    RestrictInfo.1 local1 = new com/qinggan/now/common/RestrictInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCarNo()
  {
    return this.o00OoOoo;
  }
  
  public Date getDate()
  {
    return this.o00Ooo00;
  }
  
  public String getDescription()
  {
    return this.o00Ooo0;
  }
  
  public GeoPoint getPoint()
  {
    return this.o00Ooo0o;
  }
  
  public String getRule()
  {
    return this.o00OooO0;
  }
  
  public boolean isLimit()
  {
    return this.o00Ooo0O;
  }
  
  public void setCarNo(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setDescription(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setLimit(boolean paramBoolean)
  {
    this.o00Ooo0O = paramBoolean;
  }
  
  public void setPoint(GeoPoint paramGeoPoint)
  {
    this.o00Ooo0o = paramGeoPoint;
  }
  
  public void setRule(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11(".&7444575558544B5977514A54694F5561532C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("1{575C0D17161A154D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("0$080558544C461F0A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("CB6E632326341133866D");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11("%k474C11111C0D1F0923280C0F11635A");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("|:161B554C7A585D5A5610");
    localStringBuilder.append((String)localObject);
    boolean bool = this.o00Ooo0O;
    localStringBuilder.append(bool);
    localStringBuilder.append('}');
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
    localObject = this.o00Ooo0o;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.RestrictInfo
 * JD-Core Version:    0.7.0.1
 */