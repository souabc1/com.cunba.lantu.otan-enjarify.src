package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum GuideState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/info/GuideState;
    Object localObject2 = m54207b69.F54207b69_11("a_0C0C20100F");
    ((GuideState)localObject1).<init>((String)localObject2, 0);
    o00OooOO = (GuideState)localObject1;
    localObject2 = new com/qinggan/cluster/info/GuideState;
    Object localObject3 = m54207b69.F54207b69_11("G-6C797B6576837F6985");
    ((GuideState)localObject2).<init>((String)localObject3, 1);
    o00Ooo00 = (GuideState)localObject2;
    localObject3 = new com/qinggan/cluster/info/GuideState;
    Object localObject4 = m54207b69.F54207b69_11("@u38353D2D2A26402C");
    ((GuideState)localObject3).<init>((String)localObject4, 2);
    o00Ooo0O = (GuideState)localObject3;
    localObject4 = new com/qinggan/cluster/info/GuideState;
    Object localObject5 = m54207b69.F54207b69_11("-u2C35242D3625423838");
    ((GuideState)localObject4).<init>((String)localObject5, 3);
    o0O00o0 = (GuideState)localObject4;
    localObject5 = new com/qinggan/cluster/info/GuideState;
    Object localObject6 = m54207b69.F54207b69_11("M:756D816B696F817071");
    ((GuideState)localObject5).<init>((String)localObject6, 4);
    o00Ooo0o = (GuideState)localObject5;
    localObject6 = new com/qinggan/cluster/info/GuideState;
    Object localObject7 = m54207b69.F54207b69_11("Cg20333026322E26");
    ((GuideState)localObject6).<init>((String)localObject7, 5);
    o00Ooo0 = (GuideState)localObject6;
    localObject7 = new com/qinggan/cluster/info/GuideState;
    Object localObject8 = m54207b69.F54207b69_11("4f35302D362E2C3836302A");
    ((GuideState)localObject7).<init>((String)localObject8, 6);
    o00OooO = (GuideState)localObject7;
    localObject8 = new com/qinggan/cluster/info/GuideState;
    Object localObject9 = m54207b69.F54207b69_11(".+79656C69");
    ((GuideState)localObject8).<init>((String)localObject9, 7);
    o00OooO0 = (GuideState)localObject8;
    localObject9 = new com/qinggan/cluster/info/GuideState;
    String str = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((GuideState)localObject9).<init>(str, 8);
    o00OooOo = (GuideState)localObject9;
    GuideState[] tmp215_212 = new GuideState[9];
    GuideState[] tmp216_215 = tmp215_212;
    GuideState[] tmp216_215 = tmp215_212;
    tmp216_215[0] = localObject1;
    tmp216_215[1] = localObject2;
    GuideState[] tmp223_216 = tmp216_215;
    GuideState[] tmp223_216 = tmp216_215;
    tmp223_216[2] = localObject3;
    tmp223_216[3] = localObject4;
    GuideState[] tmp230_223 = tmp223_216;
    GuideState[] tmp230_223 = tmp223_216;
    tmp230_223[4] = localObject5;
    tmp230_223[5] = localObject6;
    GuideState[] tmp239_230 = tmp230_223;
    GuideState[] tmp239_230 = tmp230_223;
    tmp239_230[6] = localObject7;
    tmp239_230[7] = localObject8;
    tmp239_230[8] = localObject9;
    o00OoOoo = tmp239_230;
    localObject1 = new com/qinggan/cluster/info/GuideState$1;
    ((GuideState.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.GuideState
 * JD-Core Version:    0.7.0.1
 */