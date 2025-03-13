package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class OTAPatchPkg$1
  implements Parcelable.Creator
{
  public OTAPatchPkg OooO00o(Parcel paramParcel)
  {
    OTAPatchPkg localOTAPatchPkg = new com/qinggan/ota/OTAPatchPkg;
    localOTAPatchPkg.<init>();
    Object localObject1 = OTAVersion.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (OTAVersion)paramParcel.readParcelable((ClassLoader)localObject2);
    localOTAPatchPkg.o00Ooo0O = ((OTAVersion)localObject2);
    localObject2 = paramParcel.readString();
    localOTAPatchPkg.o00OoOoo = ((String)localObject2);
    long l = paramParcel.readLong();
    localOTAPatchPkg.o00Ooo00 = l;
    int i = paramParcel.readInt();
    localOTAPatchPkg.o00Ooo0 = i;
    localObject1 = ((Class)localObject1).getClassLoader();
    paramParcel = (OTAVersion)paramParcel.readParcelable((ClassLoader)localObject1);
    localOTAPatchPkg.o00Ooo0o = paramParcel;
    return localOTAPatchPkg;
  }
  
  public OTAPatchPkg[] OooO0O0(int paramInt)
  {
    return new OTAPatchPkg[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAPatchPkg.1
 * JD-Core Version:    0.7.0.1
 */