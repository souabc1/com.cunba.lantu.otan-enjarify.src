package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class InsuranceCompany$1
  implements Parcelable.Creator
{
  public InsuranceCompany OooO00o(Parcel paramParcel)
  {
    InsuranceCompany localInsuranceCompany = new com/qinggan/now/common/InsuranceCompany;
    localInsuranceCompany.<init>();
    String str = paramParcel.readString();
    InsuranceCompany.OooO00o(localInsuranceCompany, str);
    str = paramParcel.readString();
    InsuranceCompany.OooO0OO(localInsuranceCompany, str);
    str = paramParcel.readString();
    InsuranceCompany.OooO0Oo(localInsuranceCompany, str);
    paramParcel = paramParcel.readString();
    InsuranceCompany.OooO0o0(localInsuranceCompany, paramParcel);
    return localInsuranceCompany;
  }
  
  public InsuranceCompany[] OooO0O0(int paramInt)
  {
    return new InsuranceCompany[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.InsuranceCompany.1
 * JD-Core Version:    0.7.0.1
 */