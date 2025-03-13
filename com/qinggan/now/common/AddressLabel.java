package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum AddressLabel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/AddressLabel;
    Object localObject2 = m54207b69.F54207b69_11("c_3731343D");
    Object localObject3 = m54207b69.F54207b69_11("-<7474737C");
    ((AddressLabel)localObject1).<init>((String)localObject3, 0, (String)localObject2);
    o00Ooo0O = (AddressLabel)localObject1;
    AddressLabel localAddressLabel = new com/qinggan/now/common/AddressLabel;
    localObject3 = m54207b69.F54207b69_11("<H2B28273B2D2B37");
    String str1 = m54207b69.F54207b69_11("0W14191C0A1A1E14");
    localAddressLabel.<init>(str1, 1, (String)localObject3);
    o00Ooo0 = localAddressLabel;
    localObject2 = new com/qinggan/now/common/AddressLabel;
    str1 = m54207b69.F54207b69_11("?K392F2E412B2F3F1B474234483A34");
    String str2 = m54207b69.F54207b69_11("wI1B0D101F090D21242311291711");
    ((AddressLabel)localObject2).<init>(str2, 2, str1);
    o00Ooo0o = (AddressLabel)localObject2;
    localObject3 = new com/qinggan/now/common/AddressLabel;
    str2 = m54207b69.F54207b69_11("Y*5F45434749624A");
    String str3 = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((AddressLabel)localObject3).<init>(str3, 3, str2);
    o00OooO0 = (AddressLabel)localObject3;
    AddressLabel[] tmp122_119 = new AddressLabel[4];
    AddressLabel[] tmp123_122 = tmp122_119;
    AddressLabel[] tmp123_122 = tmp122_119;
    tmp123_122[0] = localObject1;
    tmp123_122[1] = localAddressLabel;
    tmp123_122[2] = localObject2;
    AddressLabel[] tmp133_123 = tmp123_122;
    tmp133_123[3] = localObject3;
    o00Ooo00 = tmp133_123;
    localObject1 = new com/qinggan/now/common/AddressLabel$1;
    ((AddressLabel.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public AddressLabel(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public static AddressLabel OooO0OO(String paramString)
  {
    String str = m54207b69.F54207b69_11("c_3731343D");
    boolean bool1 = paramString.equals(str);
    if (bool1) {
      return o00Ooo0O;
    }
    str = m54207b69.F54207b69_11("<H2B28273B2D2B37");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00Ooo0;
    }
    str = m54207b69.F54207b69_11("?K392F2E412B2F3F1B474234483A34");
    boolean bool2 = paramString.equals(str);
    if (bool2) {
      return o00Ooo0o;
    }
    return o00OooO0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AddressLabel
 * JD-Core Version:    0.7.0.1
 */