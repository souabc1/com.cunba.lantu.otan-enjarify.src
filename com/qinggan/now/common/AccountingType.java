package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum AccountingType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/AccountingType;
    Object localObject2 = m54207b69.F54207b69_11("m05352444A55485E");
    Object localObject3 = m54207b69.F54207b69_11("Q<7D8081766D776E7C7A846D8A897B798C7F85");
    ((AccountingType)localObject1).<init>((String)localObject3, 0, (String)localObject2);
    o00Ooo0 = (AccountingType)localObject1;
    AccountingType localAccountingType = new com/qinggan/now/common/AccountingType;
    localObject3 = m54207b69.F54207b69_11("H3555758434B574D616466");
    String str1 = m54207b69.F54207b69_11("tX191C1D1A111B12181E281129292A191B291D232A2A");
    localAccountingType.<init>(str1, 1, (String)localObject3);
    o00Ooo0O = localAccountingType;
    localObject2 = new com/qinggan/now/common/AccountingType;
    str1 = m54207b69.F54207b69_11("1(4E5E4F47");
    String str2 = m54207b69.F54207b69_11("E$6568696E756F7674726C856D7D6E76");
    ((AccountingType)localObject2).<init>(str2, 2, str1);
    o00Ooo0o = (AccountingType)localObject2;
    localObject3 = new com/qinggan/now/common/AccountingType;
    str2 = m54207b69.F54207b69_11("6[343035412D");
    String str3 = m54207b69.F54207b69_11("jb232223303B313C32342E47384237353F");
    ((AccountingType)localObject3).<init>(str3, 3, str2);
    o00OooO0 = (AccountingType)localObject3;
    AccountingType[] tmp122_119 = new AccountingType[4];
    AccountingType[] tmp123_122 = tmp122_119;
    AccountingType[] tmp123_122 = tmp122_119;
    tmp123_122[0] = localObject1;
    tmp123_122[1] = localAccountingType;
    tmp123_122[2] = localObject2;
    AccountingType[] tmp133_123 = tmp123_122;
    tmp133_123[3] = localObject3;
    o00Ooo00 = tmp133_123;
    localObject1 = new com/qinggan/now/common/AccountingType$1;
    ((AccountingType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public AccountingType(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getValue()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AccountingType
 * JD-Core Version:    0.7.0.1
 */