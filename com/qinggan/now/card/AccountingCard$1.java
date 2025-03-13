package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.AccountingType;

class AccountingCard$1
  implements Parcelable.Creator
{
  public AccountingCard OooO00o(Parcel paramParcel)
  {
    AccountingCard localAccountingCard = new com/qinggan/now/card/AccountingCard;
    localAccountingCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localAccountingCard.o00OoOoo = ((NowCardType)localObject);
    localObject = AccountingType.class.getClassLoader();
    paramParcel = (AccountingType)paramParcel.readParcelable((ClassLoader)localObject);
    localAccountingCard.o00Ooo00 = paramParcel;
    return localAccountingCard;
  }
  
  public AccountingCard[] OooO0O0(int paramInt)
  {
    return new AccountingCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.AccountingCard.1
 * JD-Core Version:    0.7.0.1
 */