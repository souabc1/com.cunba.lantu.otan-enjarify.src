package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class ViolationInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public Date o00Ooo00;
  public String o00Ooo0O;
  public boolean o00Ooo0o;
  public GeoPoint o00OooO;
  public double o00OooO0;
  
  static
  {
    ViolationInfo.1 local1 = new com/qinggan/now/common/ViolationInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getArea()
  {
    return this.o00OoOoo;
  }
  
  public Date getDate()
  {
    return this.o00Ooo00;
  }
  
  public int getDeductedPoints()
  {
    return this.o00Ooo0;
  }
  
  public String getDescription()
  {
    return this.o00Ooo0O;
  }
  
  public double getPenalty()
  {
    return this.o00OooO0;
  }
  
  public GeoPoint getPoint()
  {
    return this.o00OooO;
  }
  
  public boolean isHasProcessed()
  {
    return this.o00Ooo0o;
  }
  
  public void setArea(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setDeductedPoints(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setDescription(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setHasProcessed(boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
  }
  
  public void setPenalty(double paramDouble)
  {
    this.o00OooO0 = paramDouble;
  }
  
  public void setPoint(GeoPoint paramGeoPoint)
  {
    this.o00OooO = paramGeoPoint;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("dP063A413F35293F46462248414B7D194341354780");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Y.020F4C4E6152624E6663514C4C20");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
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
    localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ViolationInfo
 * JD-Core Version:    0.7.0.1
 */