package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class Cost$1
  implements Parcelable.Creator
{
  public Cost OooO00o(Parcel paramParcel)
  {
    Cost localCost = new com/qinggan/now/common/Cost;
    localCost.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localCost.o00OoOoo = localDate;
    }
    else
    {
      localObject = null;
      localCost.o00OoOoo = null;
    }
    Object localObject = AccountingType.class.getClassLoader();
    localObject = (AccountingType)paramParcel.readParcelable((ClassLoader)localObject);
    localCost.o00Ooo0 = ((AccountingType)localObject);
    double d = paramParcel.readDouble();
    localCost.o00Ooo00 = d;
    return localCost;
  }
  
  public Cost[] OooO0O0(int paramInt)
  {
    return new Cost[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Cost.1
 * JD-Core Version:    0.7.0.1
 */