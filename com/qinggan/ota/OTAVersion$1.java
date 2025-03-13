package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class OTAVersion$1
  implements Parcelable.Creator
{
  public OTAVersion OooO00o(Parcel paramParcel)
  {
    OTAVersion localOTAVersion = new com/qinggan/ota/OTAVersion;
    localOTAVersion.<init>();
    String str = paramParcel.readString();
    localOTAVersion.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    localOTAVersion.o00OoOoo = paramParcel;
    return localOTAVersion;
  }
  
  public OTAVersion[] OooO0O0(int paramInt)
  {
    return new OTAVersion[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAVersion.1
 * JD-Core Version:    0.7.0.1
 */