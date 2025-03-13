package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.InsurancePolicy;

class InsuranceCard$1
  implements Parcelable.Creator
{
  public InsuranceCard OooO00o(Parcel paramParcel)
  {
    InsuranceCard localInsuranceCard = new com/qinggan/now/card/InsuranceCard;
    localInsuranceCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localInsuranceCard.o00OoOoo = ((NowCardType)localObject);
    localObject = InsurancePolicy.class.getClassLoader();
    paramParcel = (InsurancePolicy)paramParcel.readParcelable((ClassLoader)localObject);
    localInsuranceCard.o00Ooo00 = paramParcel;
    return localInsuranceCard;
  }
  
  public InsuranceCard[] OooO0O0(int paramInt)
  {
    return new InsuranceCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.InsuranceCard.1
 * JD-Core Version:    0.7.0.1
 */