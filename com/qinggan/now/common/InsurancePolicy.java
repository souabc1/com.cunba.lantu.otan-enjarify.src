package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.qinggan.now.common.vehicle.LicensePlate;
import java.util.Date;
import m54207b69;

public class InsurancePolicy
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public Date o00OoOoo;
  public Date o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public InsuranceCompany o00Ooo0o;
  public String o00OooO;
  public LicensePlate o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  
  static
  {
    InsurancePolicy.1 local1 = new com/qinggan/now/common/InsurancePolicy$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Date getCreateTime()
  {
    return this.o00OoOoo;
  }
  
  public String getEngineNumber()
  {
    return this.o00Ooo00;
  }
  
  public Date getExpirationTime()
  {
    return this.o00Ooo0;
  }
  
  public String getId()
  {
    return this.o00Ooo0O;
  }
  
  public InsuranceCompany getInsuranceCompany()
  {
    return this.o00Ooo0o;
  }
  
  public LicensePlate getLicensePlate()
  {
    return this.o00OooO0;
  }
  
  public String getName()
  {
    return this.o00OooO;
  }
  
  public int getNumberOfInsurant()
  {
    return this.o00OooOO;
  }
  
  public int getSeatCapacity()
  {
    return this.o00OooOo;
  }
  
  public void setCreateTime(Date paramDate)
  {
    this.o00OoOoo = paramDate;
  }
  
  public void setEngineNumber(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setExpirationTime(Date paramDate)
  {
    this.o00Ooo0 = paramDate;
  }
  
  public void setId(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setInsuranceCompany(InsuranceCompany paramInsuranceCompany)
  {
    this.o00Ooo0o = paramInsuranceCompany;
  }
  
  public void setLicensePlate(LicensePlate paramLicensePlate)
  {
    this.o00OooO0 = paramLicensePlate;
  }
  
  public void setName(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setNumberOfInsurant(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setSeatCapacity(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("De2C0C18131B09110D083E141418132A544E193E146C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11(";01C115F8155625B14");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("9N626F2510403035413323312E3780");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("{D68652B044039333D2D393736361D3B38318A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    long l1 = 0L;
    Date localDate;
    long l2;
    try
    {
      localDate = this.o00OoOoo;
      l2 = localDate.getTime();
      paramParcel.writeLong(l2);
    }
    catch (NullPointerException localNullPointerException1)
    {
      paramParcel.writeLong(l1);
    }
    try
    {
      localDate = this.o00Ooo0;
      l2 = localDate.getTime();
      paramParcel.writeLong(l2);
    }
    catch (NullPointerException localNullPointerException2)
    {
      paramParcel.writeLong(l1);
    }
    localObject = this.o00OooO0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.InsurancePolicy
 * JD-Core Version:    0.7.0.1
 */