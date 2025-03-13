package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Fuel$1
  implements Parcelable.Creator
{
  public Fuel OooO00o(Parcel paramParcel)
  {
    Fuel localFuel = new com/qinggan/now/common/Fuel;
    localFuel.<init>();
    int i = paramParcel.readInt();
    localFuel.o00Ooo00 = i;
    i = paramParcel.readInt();
    localFuel.o00Ooo0O = i;
    float f = paramParcel.readFloat();
    localFuel.o00Ooo0 = f;
    int j = paramParcel.readInt();
    i = 1;
    f = 1.4E-45F;
    if (j != i)
    {
      i = 0;
      f = 0.0F;
    }
    Fuel.OooO00o(localFuel, i);
    return localFuel;
  }
  
  public Fuel[] OooO0O0(int paramInt)
  {
    return new Fuel[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Fuel.1
 * JD-Core Version:    0.7.0.1
 */