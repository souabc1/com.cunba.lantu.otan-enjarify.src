package com.qinggan.radio;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BaseRadioInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public RadioConstants.RadioType o00OoOoo;
  
  static
  {
    BaseRadioInfo.1 local1 = new com/qinggan/radio/BaseRadioInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BaseRadioInfo() {}
  
  public BaseRadioInfo(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = -1;
    if (i == j)
    {
      i = 0;
      paramParcel = null;
    }
    else
    {
      RadioConstants.RadioType[] arrayOfRadioType = RadioConstants.RadioType.values();
      paramParcel = arrayOfRadioType[i];
    }
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public RadioConstants.RadioType getRadioType()
  {
    return this.o00OoOoo;
  }
  
  public void setRadioType(RadioConstants.RadioType paramRadioType)
  {
    this.o00OoOoo = paramRadioType;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    RadioConstants.RadioType localRadioType = this.o00OoOoo;
    if (localRadioType == null) {
      paramInt = -1;
    } else {
      paramInt = localRadioType.ordinal();
    }
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.radio.BaseRadioInfo
 * JD-Core Version:    0.7.0.1
 */