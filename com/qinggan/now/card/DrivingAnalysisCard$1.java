package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.DrivingReport;

class DrivingAnalysisCard$1
  implements Parcelable.Creator
{
  public DrivingAnalysisCard OooO00o(Parcel paramParcel)
  {
    DrivingAnalysisCard localDrivingAnalysisCard = new com/qinggan/now/card/DrivingAnalysisCard;
    localDrivingAnalysisCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localDrivingAnalysisCard.o00OoOoo = ((NowCardType)localObject);
    localObject = DrivingReport.class.getClassLoader();
    paramParcel = (DrivingReport)paramParcel.readParcelable((ClassLoader)localObject);
    localDrivingAnalysisCard.o00Ooo00 = paramParcel;
    return localDrivingAnalysisCard;
  }
  
  public DrivingAnalysisCard[] OooO0O0(int paramInt)
  {
    return new DrivingAnalysisCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.DrivingAnalysisCard.1
 * JD-Core Version:    0.7.0.1
 */