package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum MediaType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/info/MediaType;
    Object localObject2 = m54207b69.F54207b69_11("hc37170F0915");
    int i = 1;
    ((MediaType)localObject1).<init>((String)localObject2, 0, i);
    o00OoooO = (MediaType)localObject1;
    localObject2 = new com/qinggan/cluster/info/MediaType;
    Object localObject3 = m54207b69.F54207b69_11("jh3B02071B08122F24140A11");
    ((MediaType)localObject2).<init>((String)localObject3, i, 16);
    o0O00o0 = (MediaType)localObject2;
    localObject3 = new com/qinggan/cluster/info/MediaType;
    Object localObject4 = m54207b69.F54207b69_11("5H0D27222C2A3033331146362C33");
    ((MediaType)localObject3).<init>((String)localObject4, 2, 17);
    o00Ooo0o = (MediaType)localObject3;
    MediaType localMediaType1 = new com/qinggan/cluster/info/MediaType;
    Object localObject5 = m54207b69.F54207b69_11("Kx3129191F");
    localMediaType1.<init>((String)localObject5, 3, 18);
    o00OooO0 = localMediaType1;
    MediaType localMediaType2 = new com/qinggan/cluster/info/MediaType;
    Object localObject6 = m54207b69.F54207b69_11("C|30142120142F1B1F211C");
    localMediaType2.<init>((String)localObject6, 4, 32);
    o00OooO = localMediaType2;
    localObject4 = new com/qinggan/cluster/info/MediaType;
    ((MediaType)localObject4).<init>("DVD", 5, 33);
    o00Ooo0O = (MediaType)localObject4;
    localObject5 = new com/qinggan/cluster/info/MediaType;
    String str1 = m54207b69.F54207b69_11("Wp3F051A18062B1F1B1D28");
    ((MediaType)localObject5).<init>(str1, 6, 34);
    o00OooOO = (MediaType)localObject5;
    localObject6 = new com/qinggan/cluster/info/MediaType;
    ((MediaType)localObject6).<init>("Aux", 7, 48);
    o00Ooo0 = (MediaType)localObject6;
    MediaType localMediaType3 = new com/qinggan/cluster/info/MediaType;
    String str2 = m54207b69.F54207b69_11("uj3A03070713");
    localMediaType3.<init>(str2, 8, 64);
    o00OooOo = localMediaType3;
    MediaType[] tmp225_222 = new MediaType[9];
    MediaType[] tmp226_225 = tmp225_222;
    MediaType[] tmp226_225 = tmp225_222;
    tmp226_225[0] = localObject1;
    tmp226_225[1] = localObject2;
    MediaType[] tmp233_226 = tmp226_225;
    MediaType[] tmp233_226 = tmp226_225;
    tmp233_226[2] = localObject3;
    tmp233_226[3] = localMediaType1;
    MediaType[] tmp241_233 = tmp233_226;
    MediaType[] tmp241_233 = tmp233_226;
    tmp241_233[4] = localMediaType2;
    tmp241_233[5] = localObject4;
    MediaType[] tmp250_241 = tmp241_233;
    MediaType[] tmp250_241 = tmp241_233;
    tmp250_241[6] = localObject5;
    tmp250_241[7] = localObject6;
    tmp250_241[8] = localMediaType3;
    o00Ooo00 = tmp250_241;
    localObject1 = new com/qinggan/cluster/info/MediaType$1;
    ((MediaType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public MediaType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getValue()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaType
 * JD-Core Version:    0.7.0.1
 */