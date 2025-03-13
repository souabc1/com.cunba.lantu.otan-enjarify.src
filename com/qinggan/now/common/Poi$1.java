package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Poi$1
  implements Parcelable.Creator
{
  public Poi OooO00o(Parcel paramParcel)
  {
    Poi localPoi = new com/qinggan/now/common/Poi;
    localPoi.<init>();
    Object localObject = PoiType.class.getClassLoader();
    localObject = (PoiType)paramParcel.readParcelable((ClassLoader)localObject);
    localPoi.o00o000O = ((PoiType)localObject);
    localObject = paramParcel.readString();
    localPoi.o00OooOO = ((String)localObject);
    localObject = paramParcel.readString();
    localPoi.o00OoooO = ((String)localObject);
    localObject = paramParcel.readString();
    localPoi.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    localPoi.o00o0000 = ((String)localObject);
    double d = paramParcel.readDouble();
    localPoi.o0O00o0 = d;
    d = paramParcel.readDouble();
    localPoi.o00OooOo = d;
    localObject = CoordSystem.class.getClassLoader();
    localObject = (CoordSystem)paramParcel.readParcelable((ClassLoader)localObject);
    localPoi.o00Ooo0O = ((CoordSystem)localObject);
    d = paramParcel.readDouble();
    localPoi.o00OooO = d;
    d = paramParcel.readDouble();
    localPoi.o00OooO0 = d;
    long l = paramParcel.readLong();
    localPoi.o00Ooo0o = l;
    l = paramParcel.readLong();
    localPoi.o00o000 = l;
    localObject = City.class.getClassLoader();
    localObject = (City)paramParcel.readParcelable((ClassLoader)localObject);
    localPoi.o00Ooo0 = ((City)localObject);
    localObject = PoiCategory.class.getClassLoader();
    localObject = (PoiCategory)paramParcel.readParcelable((ClassLoader)localObject);
    localPoi.o00Ooo00 = ((PoiCategory)localObject);
    paramParcel = paramParcel.readString();
    localPoi.o00Ooooo = paramParcel;
    return localPoi;
  }
  
  public Poi[] OooO0O0(int paramInt)
  {
    return new Poi[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Poi.1
 * JD-Core Version:    0.7.0.1
 */