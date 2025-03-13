package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class OTAPushInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo = null;
  public String o00Ooo0 = null;
  public String o00Ooo00 = null;
  public String o00Ooo0O = null;
  public long o00Ooo0o = 0L;
  
  static
  {
    OTAPushInfo.1 local1 = new com/qinggan/ota/OTAPushInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OTAPushInfo() {}
  
  public OTAPushInfo(Parcel paramParcel)
  {
    long l = paramParcel.readLong();
    this.o00Ooo0o = l;
    String str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo00 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("qf29332939171A14361009132852202411172315482331197259");
    localStringBuilder.append(str1);
    long l = this.o00Ooo0o;
    localStringBuilder.append(l);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11(">n424F1C12200E1121450A1225251C2A1A635A");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("P11D124753475B5A4C6F5D4D8A6A1924");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("ps5F540319231B18071E401C12225B62");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("_{575C0B211B23200F2648281324536A");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00Ooo0o;
    paramParcel.writeLong(l);
    String str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAPushInfo
 * JD-Core Version:    0.7.0.1
 */