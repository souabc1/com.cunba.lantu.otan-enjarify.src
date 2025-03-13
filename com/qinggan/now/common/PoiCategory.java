package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PoiCategory
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    PoiCategory.1 local1 = new com/qinggan/now/common/PoiCategory$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public PoiCategory() {}
  
  public PoiCategory(String paramString1, String paramString2)
  {
    this.o00Ooo00 = paramString1;
    this.o00OoOoo = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCode()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void setCode(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.PoiCategory
 * JD-Core Version:    0.7.0.1
 */