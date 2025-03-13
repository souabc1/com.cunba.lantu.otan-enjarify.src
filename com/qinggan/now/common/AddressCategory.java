package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class AddressCategory
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public long o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    AddressCategory.1 local1 = new com/qinggan/now/common/AddressCategory$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long getId()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void setId(long paramLong)
  {
    this.o00OoOoo = paramLong;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("I475515249554C4D7E5D495B5E67535B1D7F6E6221");
    localStringBuilder.append(str);
    long l = this.o00OoOoo;
    localStringBuilder.append(l);
    str = m54207b69.F54207b69_11("uf4A09090E0761");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00OoOoo;
    paramParcel.writeLong(l);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AddressCategory
 * JD-Core Version:    0.7.0.1
 */