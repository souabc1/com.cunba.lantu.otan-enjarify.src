package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class OTAFullPkg$1
  implements Parcelable.Creator
{
  public OTAFullPkg OooO00o(Parcel paramParcel)
  {
    OTAFullPkg localOTAFullPkg = new com/qinggan/ota/OTAFullPkg;
    localOTAFullPkg.<init>();
    Object localObject = OTAVersion.class.getClassLoader();
    localObject = (OTAVersion)paramParcel.readParcelable((ClassLoader)localObject);
    localOTAFullPkg.o00Ooo0O = ((OTAVersion)localObject);
    localObject = paramParcel.readString();
    localOTAFullPkg.o00OoOoo = ((String)localObject);
    long l = paramParcel.readLong();
    localOTAFullPkg.o00Ooo00 = l;
    int i = paramParcel.readInt();
    localOTAFullPkg.o00Ooo0 = i;
    return localOTAFullPkg;
  }
  
  public OTAFullPkg[] OooO0O0(int paramInt)
  {
    return new OTAFullPkg[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAFullPkg.1
 * JD-Core Version:    0.7.0.1
 */