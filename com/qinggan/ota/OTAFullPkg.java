package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class OTAFullPkg
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo = null;
  public int o00Ooo0 = 1;
  public long o00Ooo00 = 0L;
  public OTAVersion o00Ooo0O = null;
  
  static
  {
    OTAFullPkg.1 local1 = new com/qinggan/ota/OTAFullPkg$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("Vb2D3725271B131439110E4C1F131D1F1A1D1D6A55");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("W}515E1B1B1223151B15121E1D1F546B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Oj464B1B0614145651");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo00;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("3B6E63383E362C7E69");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    OTAVersion localOTAVersion = this.o00Ooo0O;
    paramParcel.writeParcelable(localOTAVersion, paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    long l = this.o00Ooo00;
    paramParcel.writeLong(l);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAFullPkg
 * JD-Core Version:    0.7.0.1
 */