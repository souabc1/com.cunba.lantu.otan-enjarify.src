package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.DiagnosisInfo;

class DiagnosisCard$1
  implements Parcelable.Creator
{
  public DiagnosisCard OooO00o(Parcel paramParcel)
  {
    DiagnosisCard localDiagnosisCard = new com/qinggan/now/card/DiagnosisCard;
    localDiagnosisCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localDiagnosisCard.o00OoOoo = ((NowCardType)localObject);
    localObject = DiagnosisInfo.class.getClassLoader();
    paramParcel = (DiagnosisInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localDiagnosisCard.o00Ooo00 = paramParcel;
    return localDiagnosisCard;
  }
  
  public DiagnosisCard[] OooO0O0(int paramInt)
  {
    return new DiagnosisCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.DiagnosisCard.1
 * JD-Core Version:    0.7.0.1
 */