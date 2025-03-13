package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class Cost
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public Date o00OoOoo;
  public AccountingType o00Ooo0;
  public double o00Ooo00;
  
  static
  {
    Cost.1 local1 = new com/qinggan/now/common/Cost$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Date getDate()
  {
    return this.o00OoOoo;
  }
  
  public double getPrice()
  {
    return this.o00Ooo00;
  }
  
  public AccountingType getType()
  {
    return this.o00Ooo0;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00OoOoo = paramDate;
  }
  
  public void setPrice(double paramDouble)
  {
    this.o00Ooo00 = paramDouble;
  }
  
  public void setType(AccountingType paramAccountingType)
  {
    this.o00Ooo0 = paramAccountingType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11(")\\1F34312B800C3E4430426B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Np5C5102051D181B54");
    localStringBuilder.append((String)localObject);
    double d = this.o00Ooo00;
    localStringBuilder.append(d);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    long l;
    if (localObject != null)
    {
      l = ((Date)localObject).getTime();
    }
    else
    {
      l = 0L;
      d = 0.0D;
    }
    paramParcel.writeLong(l);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    double d = this.o00Ooo00;
    paramParcel.writeDouble(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Cost
 * JD-Core Version:    0.7.0.1
 */