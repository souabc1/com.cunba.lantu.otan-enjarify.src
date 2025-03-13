package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.common.vehicle.LicensePlate;
import java.util.Date;

class InsurancePolicy$1
  implements Parcelable.Creator
{
  public InsurancePolicy OooO00o(Parcel paramParcel)
  {
    InsurancePolicy localInsurancePolicy = new com/qinggan/now/common/InsurancePolicy;
    localInsurancePolicy.<init>();
    Object localObject = paramParcel.readString();
    InsurancePolicy.OooO00o(localInsurancePolicy, (String)localObject);
    localObject = paramParcel.readString();
    InsurancePolicy.OooO0OO(localInsurancePolicy, (String)localObject);
    boolean bool1 = false;
    localObject = null;
    InsurancePolicy.OooO0Oo(localInsurancePolicy, null);
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      Date localDate = new java/util/Date;
      long l3 = paramParcel.readLong();
      localDate.<init>(l3);
      InsurancePolicy.OooO0Oo(localInsurancePolicy, localDate);
    }
    InsurancePolicy.OooO0o0(localInsurancePolicy, null);
    long l4 = paramParcel.readLong();
    bool1 = l4 < l2;
    if (bool1)
    {
      localObject = new java/util/Date;
      l1 = paramParcel.readLong();
      ((Date)localObject).<init>(l1);
      InsurancePolicy.OooO0o0(localInsurancePolicy, (Date)localObject);
    }
    localObject = LicensePlate.class.getClassLoader();
    localObject = (LicensePlate)paramParcel.readParcelable((ClassLoader)localObject);
    InsurancePolicy.OooO0o(localInsurancePolicy, (LicensePlate)localObject);
    localObject = paramParcel.readString();
    InsurancePolicy.OooO0oO(localInsurancePolicy, (String)localObject);
    localObject = InsuranceCompany.class.getClassLoader();
    paramParcel = (InsuranceCompany)paramParcel.readParcelable((ClassLoader)localObject);
    InsurancePolicy.OooO0oo(localInsurancePolicy, paramParcel);
    return localInsurancePolicy;
  }
  
  public InsurancePolicy[] OooO0O0(int paramInt)
  {
    return new InsurancePolicy[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.InsurancePolicy.1
 * JD-Core Version:    0.7.0.1
 */