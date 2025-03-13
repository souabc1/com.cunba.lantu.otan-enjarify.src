package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class OtaInstallPolicy
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int[] o00OoOoo;
  
  static
  {
    OtaInstallPolicy.1 local1 = new com/excelfore/hmiagent/OtaInstallPolicy$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OtaInstallPolicy() {}
  
  public OtaInstallPolicy(Parcel paramParcel)
  {
    int[] arrayOfInt = this.o00OoOoo;
    paramParcel.readIntArray(arrayOfInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int[] getPolicy()
  {
    return this.o00OoOoo;
  }
  
  public void setPolicy(int[] paramArrayOfInt)
  {
    this.o00OoOoo = paramArrayOfInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int[] arrayOfInt = this.o00OoOoo;
    paramParcel.writeIntArray(arrayOfInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.OtaInstallPolicy
 * JD-Core Version:    0.7.0.1
 */