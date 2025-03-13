package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AccountingType$1
  implements Parcelable.Creator
{
  public AccountingType OooO00o(Parcel paramParcel)
  {
    AccountingType[] arrayOfAccountingType = AccountingType.values();
    int i = paramParcel.readInt();
    return arrayOfAccountingType[i];
  }
  
  public AccountingType[] OooO0O0(int paramInt)
  {
    return new AccountingType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AccountingType.1
 * JD-Core Version:    0.7.0.1
 */