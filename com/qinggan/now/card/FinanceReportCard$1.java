package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.FinanceReport;

class FinanceReportCard$1
  implements Parcelable.Creator
{
  public FinanceReportCard OooO00o(Parcel paramParcel)
  {
    FinanceReportCard localFinanceReportCard = new com/qinggan/now/card/FinanceReportCard;
    localFinanceReportCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localFinanceReportCard.o00OoOoo = ((NowCardType)localObject);
    localObject = FinanceReport.class.getClassLoader();
    paramParcel = (FinanceReport)paramParcel.readParcelable((ClassLoader)localObject);
    localFinanceReportCard.o00Ooo00 = paramParcel;
    return localFinanceReportCard;
  }
  
  public FinanceReportCard[] OooO0O0(int paramInt)
  {
    return new FinanceReportCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.FinanceReportCard.1
 * JD-Core Version:    0.7.0.1
 */