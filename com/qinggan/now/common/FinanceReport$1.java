package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class FinanceReport$1
  implements Parcelable.Creator
{
  public FinanceReport OooO00o(Parcel paramParcel)
  {
    FinanceReport localFinanceReport = new com/qinggan/now/common/FinanceReport;
    localFinanceReport.<init>();
    Object localObject = TimePeriod.class.getClassLoader();
    localObject = (TimePeriod)paramParcel.readParcelable((ClassLoader)localObject);
    localFinanceReport.o00Ooo0O = ((TimePeriod)localObject);
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localFinanceReport.o00Ooo00 = localDate;
    }
    else
    {
      localObject = null;
      localFinanceReport.o00Ooo00 = null;
    }
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localFinanceReport.o00Ooo0 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = Cost.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    double d = paramParcel.readDouble();
    localFinanceReport.o00OoOoo = d;
    return localFinanceReport;
  }
  
  public FinanceReport[] OooO0O0(int paramInt)
  {
    return new FinanceReport[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.FinanceReport.1
 * JD-Core Version:    0.7.0.1
 */