package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class InsuranceCompany
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    InsuranceCompany.1 local1 = new com/qinggan/now/common/InsuranceCompany$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return this.o00OoOoo;
  }
  
  public String getId()
  {
    return this.o00Ooo00;
  }
  
  public String getName()
  {
    return this.o00Ooo0;
  }
  
  public String getTel()
  {
    return this.o00Ooo0O;
  }
  
  public void setAddress(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setId(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setTel(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.InsuranceCompany
 * JD-Core Version:    0.7.0.1
 */