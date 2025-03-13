package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class TrafficIncident
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public GeoPoint o00Ooo0;
  public Date o00Ooo00;
  public Date o00Ooo0O;
  
  static
  {
    TrafficIncident.1 local1 = new com/qinggan/now/common/TrafficIncident$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDescription()
  {
    return this.o00OoOoo;
  }
  
  public Date getEndDate()
  {
    return this.o00Ooo00;
  }
  
  public GeoPoint getPoint()
  {
    return this.o00Ooo0;
  }
  
  public Date getStartDate()
  {
    return this.o00Ooo0O;
  }
  
  public void setDescription(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setEndDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setPoint(GeoPoint paramGeoPoint)
  {
    this.o00Ooo0 = paramGeoPoint;
  }
  
  public void setStartDate(Date paramDate)
  {
    this.o00Ooo0O = paramDate;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("dj3E190D0F10080F2A0C120D191B112C20292F1D2B324321352770");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("DN626F2D232E0F3541337C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("1{575C0D17161A154D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("%k474C11111C0D1F0923280C0F11635A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0O;
    long l1 = 0L;
    if (localObject != null)
    {
      long l2 = ((Date)localObject).getTime();
      paramParcel.writeLong(l2);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    localObject = this.o00Ooo00;
    if (localObject != null)
    {
      long l3 = ((Date)localObject).getTime();
      paramParcel.writeLong(l3);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.TrafficIncident
 * JD-Core Version:    0.7.0.1
 */