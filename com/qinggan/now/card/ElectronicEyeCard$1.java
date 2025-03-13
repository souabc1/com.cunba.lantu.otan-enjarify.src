package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;

class ElectronicEyeCard$1
  implements Parcelable.Creator
{
  public ElectronicEyeCard OooO00o(Parcel paramParcel)
  {
    ElectronicEyeCard localElectronicEyeCard = new com/qinggan/now/card/ElectronicEyeCard;
    localElectronicEyeCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localElectronicEyeCard.o00OoOoo = ((NowCardType)localObject);
    int i = paramParcel.readInt();
    localElectronicEyeCard.o00Ooo00 = i;
    return localElectronicEyeCard;
  }
  
  public ElectronicEyeCard[] OooO0O0(int paramInt)
  {
    return new ElectronicEyeCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.ElectronicEyeCard.1
 * JD-Core Version:    0.7.0.1
 */