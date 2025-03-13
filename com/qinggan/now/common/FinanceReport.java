package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import m54207b69;

public class FinanceReport
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public double o00OoOoo;
  public ArrayList o00Ooo0;
  public Date o00Ooo00;
  public TimePeriod o00Ooo0O;
  
  static
  {
    FinanceReport.1 local1 = new com/qinggan/now/common/FinanceReport$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public double getAllPrice()
  {
    return this.o00OoOoo;
  }
  
  public Date getDate()
  {
    return this.o00Ooo00;
  }
  
  public ArrayList getDetailCosts()
  {
    return this.o00Ooo0;
  }
  
  public TimePeriod getPeriod()
  {
    return this.o00Ooo0O;
  }
  
  public void setAllPrice(double paramDouble)
  {
    this.o00OoOoo = paramDouble;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setDetailCosts(ArrayList paramArrayList)
  {
    this.o00Ooo0 = paramArrayList;
  }
  
  public void setPeriod(TimePeriod paramTimePeriod)
  {
    this.o00Ooo0O = paramTimePeriod;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("TD022E2C282E2C271D293D35413C712D4331473F3E348E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("RB6E6328263A2C85");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("2~525F1C1E0E241D19451A17151950");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("4n424F11050643220E15145D");
    localStringBuilder.append((String)localObject);
    double d = this.o00OoOoo;
    localStringBuilder.append(d);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    TimePeriod localTimePeriod = this.o00Ooo0O;
    paramParcel.writeParcelable(localTimePeriod, paramInt);
    Object localObject = this.o00Ooo00;
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
    paramParcel.writeTypedList((List)localObject);
    double d = this.o00OoOoo;
    paramParcel.writeDouble(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.FinanceReport
 * JD-Core Version:    0.7.0.1
 */