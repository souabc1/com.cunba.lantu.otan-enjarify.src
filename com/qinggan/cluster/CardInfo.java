package com.qinggan.cluster;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum CardInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/CardInfo;
    Object localObject2 = m54207b69.F54207b69_11("[D070618100E0711221F190F211C");
    int i = 1;
    ((CardInfo)localObject1).<init>((String)localObject2, 0, i);
    o00OooOO = (CardInfo)localObject1;
    localObject2 = new com/qinggan/cluster/CardInfo;
    Object localObject3 = m54207b69.F54207b69_11("):797C6A7678817B6C84788981");
    int j = 3;
    ((CardInfo)localObject2).<init>((String)localObject3, i, j);
    o00Ooo0o = (CardInfo)localObject2;
    localObject3 = new com/qinggan/cluster/CardInfo;
    Object localObject4 = m54207b69.F54207b69_11("tk282B3B2529322A3B47422C4636");
    int k = 4;
    ((CardInfo)localObject3).<init>((String)localObject4, 2, k);
    o0O00o0 = (CardInfo)localObject3;
    localObject4 = new com/qinggan/cluster/CardInfo;
    Object localObject5 = m54207b69.F54207b69_11("Zr3134223E403943343C3041493D4A4A30");
    int m = 5;
    ((CardInfo)localObject4).<init>((String)localObject5, j, m);
    o00OooO0 = (CardInfo)localObject4;
    CardInfo localCardInfo = new com/qinggan/cluster/CardInfo;
    localObject5 = m54207b69.F54207b69_11(",q3231253B433C44353C483E2E4235454C4E37");
    int n = 6;
    localCardInfo.<init>((String)localObject5, k, n);
    o00Ooo0O = localCardInfo;
    localObject5 = new com/qinggan/cluster/CardInfo;
    Object localObject6 = m54207b69.F54207b69_11("'4777668807E7781726886707C");
    int i1 = 7;
    ((CardInfo)localObject5).<init>((String)localObject6, m, i1);
    o00OooOo = (CardInfo)localObject5;
    localObject6 = new com/qinggan/cluster/CardInfo;
    Object localObject7 = m54207b69.F54207b69_11("a\\1F1E1018161F190A1D1B241E");
    int i2 = 8;
    ((CardInfo)localObject6).<init>((String)localObject7, n, i2);
    o00OooO = (CardInfo)localObject6;
    localObject7 = new com/qinggan/cluster/CardInfo;
    Object localObject8 = m54207b69.F54207b69_11("&f282832323D2A2D3B2A");
    int i3 = 9;
    ((CardInfo)localObject7).<init>((String)localObject8, i1, i3);
    o00Ooooo = (CardInfo)localObject7;
    localObject8 = new com/qinggan/cluster/CardInfo;
    Object localObject9 = m54207b69.F54207b69_11("U_121B1D19220522251524");
    int i4 = 10;
    ((CardInfo)localObject8).<init>((String)localObject9, i2, i4);
    o00OoooO = (CardInfo)localObject8;
    localObject9 = new com/qinggan/cluster/CardInfo;
    Object localObject10 = m54207b69.F54207b69_11("FS12201404221F231C24156C");
    ((CardInfo)localObject9).<init>((String)localObject10, i3, 11);
    o00Ooo0 = (CardInfo)localObject9;
    localObject10 = new com/qinggan/cluster/CardInfo;
    String str = m54207b69.F54207b69_11("b(666A80647B706F8174808570757172");
    ((CardInfo)localObject10).<init>(str, i4, 14);
    o00o0000 = (CardInfo)localObject10;
    CardInfo[] tmp327_324 = new CardInfo[11];
    CardInfo[] tmp328_327 = tmp327_324;
    CardInfo[] tmp328_327 = tmp327_324;
    tmp328_327[0] = localObject1;
    tmp328_327[1] = localObject2;
    CardInfo[] tmp335_328 = tmp328_327;
    CardInfo[] tmp335_328 = tmp328_327;
    tmp335_328[2] = localObject3;
    tmp335_328[3] = localObject4;
    CardInfo[] tmp343_335 = tmp335_328;
    CardInfo[] tmp343_335 = tmp335_328;
    tmp343_335[4] = localCardInfo;
    tmp343_335[5] = localObject5;
    CardInfo[] tmp352_343 = tmp343_335;
    CardInfo[] tmp352_343 = tmp343_335;
    tmp352_343[6] = localObject6;
    tmp352_343[7] = localObject7;
    CardInfo[] tmp363_352 = tmp352_343;
    CardInfo[] tmp363_352 = tmp352_343;
    tmp363_352[8] = localObject8;
    tmp363_352[9] = localObject9;
    tmp363_352[10] = localObject10;
    o00Ooo00 = tmp363_352;
    localObject1 = new com/qinggan/cluster/CardInfo$1;
    ((CardInfo.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public CardInfo(int paramInt)
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
 * Qualified Name:     com.qinggan.cluster.CardInfo
 * JD-Core Version:    0.7.0.1
 */