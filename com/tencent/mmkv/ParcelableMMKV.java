package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;

public final class ParcelableMMKV
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final String o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    ParcelableMMKV.1 local1 = new com/tencent/mmkv/ParcelableMMKV$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelableMMKV(MMKV paramMMKV)
  {
    int i = -1;
    this.o00Ooo00 = i;
    this.o00Ooo0 = i;
    this.o00Ooo0O = null;
    String str = paramMMKV.mmapID();
    this.o00OoOoo = str;
    i = paramMMKV.ashmemFD();
    this.o00Ooo00 = i;
    i = paramMMKV.ashmemMetaFD();
    this.o00Ooo0 = i;
    paramMMKV = paramMMKV.cryptKey();
    this.o00Ooo0O = paramMMKV;
  }
  
  public ParcelableMMKV(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.o00OoOoo = paramString1;
    this.o00Ooo00 = paramInt1;
    this.o00Ooo0 = paramInt2;
    this.o00Ooo0O = paramString2;
  }
  
  public MMKV OooO00o()
  {
    int i = this.o00Ooo00;
    if (i >= 0)
    {
      int j = this.o00Ooo0;
      if (j >= 0)
      {
        String str1 = this.o00OoOoo;
        String str2 = this.o00Ooo0O;
        return MMKV.OooOoo(str1, i, j, str2);
      }
    }
    return null;
  }
  
  public int describeContents()
  {
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      Object localObject = this.o00OoOoo;
      paramParcel.writeString((String)localObject);
      int i = this.o00Ooo00;
      localObject = ParcelFileDescriptor.fromFd(i);
      int j = this.o00Ooo0;
      ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.fromFd(j);
      paramInt |= 0x1;
      ((ParcelFileDescriptor)localObject).writeToParcel(paramParcel, paramInt);
      localParcelFileDescriptor.writeToParcel(paramParcel, paramInt);
      String str = this.o00Ooo0O;
      if (str != null) {
        paramParcel.writeString(str);
      }
    }
    catch (IOException paramParcel)
    {
      paramParcel.printStackTrace();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.tencent.mmkv.ParcelableMMKV
 * JD-Core Version:    0.7.0.1
 */