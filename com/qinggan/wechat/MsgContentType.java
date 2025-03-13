package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum MsgContentType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/wechat/MsgContentType;
    Object localObject2 = m54207b69.F54207b69_11("LO1B0B191E");
    ((MsgContentType)localObject1).<init>((String)localObject2, 0);
    o00OooOo = (MsgContentType)localObject1;
    localObject2 = new com/qinggan/wechat/MsgContentType;
    Object localObject3 = m54207b69.F54207b69_11("f5657D7864646C76");
    ((MsgContentType)localObject2).<init>((String)localObject3, 1);
    o00Ooo0o = (MsgContentType)localObject2;
    localObject3 = new com/qinggan/wechat/MsgContentType;
    Object localObject4 = m54207b69.F54207b69_11("$t223C3F3A35");
    ((MsgContentType)localObject3).<init>((String)localObject4, 2);
    o00OoooO = (MsgContentType)localObject3;
    localObject4 = new com/qinggan/wechat/MsgContentType;
    Object localObject5 = m54207b69.F54207b69_11("/L1C042122091306101B132810150F16");
    ((MsgContentType)localObject4).<init>((String)localObject5, 3);
    o00OooO0 = (MsgContentType)localObject4;
    localObject5 = new com/qinggan/wechat/MsgContentType;
    Object localObject6 = m54207b69.F54207b69_11("@o212F242D3431344433");
    ((MsgContentType)localObject5).<init>((String)localObject6, 4);
    o00Ooo0O = (MsgContentType)localObject5;
    localObject6 = new com/qinggan/wechat/MsgContentType;
    Object localObject7 = m54207b69.F54207b69_11("go2A23223E2A2527");
    ((MsgContentType)localObject6).<init>((String)localObject7, 5);
    o00Ooo00 = (MsgContentType)localObject6;
    localObject7 = new com/qinggan/wechat/MsgContentType;
    Object localObject8 = m54207b69.F54207b69_11("Ll202431303C2A2929");
    ((MsgContentType)localObject7).<init>((String)localObject8, 6);
    o00Ooo0 = (MsgContentType)localObject7;
    localObject8 = new com/qinggan/wechat/MsgContentType;
    Object localObject9 = m54207b69.F54207b69_11(".+78646C7C72796D696D69");
    ((MsgContentType)localObject8).<init>((String)localObject9, 7);
    o00OooOO = (MsgContentType)localObject8;
    localObject9 = new com/qinggan/wechat/MsgContentType;
    Object localObject10 = m54207b69.F54207b69_11("?%776168636F768073736C74");
    ((MsgContentType)localObject9).<init>((String)localObject10, 8);
    o00OooO = (MsgContentType)localObject9;
    localObject10 = new com/qinggan/wechat/MsgContentType;
    String str = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((MsgContentType)localObject10).<init>(str, 9);
    o0O00o0 = (MsgContentType)localObject10;
    MsgContentType[] tmp241_238 = new MsgContentType[10];
    MsgContentType[] tmp242_241 = tmp241_238;
    MsgContentType[] tmp242_241 = tmp241_238;
    tmp242_241[0] = localObject1;
    tmp242_241[1] = localObject2;
    MsgContentType[] tmp249_242 = tmp242_241;
    MsgContentType[] tmp249_242 = tmp242_241;
    tmp249_242[2] = localObject3;
    tmp249_242[3] = localObject4;
    MsgContentType[] tmp256_249 = tmp249_242;
    MsgContentType[] tmp256_249 = tmp249_242;
    tmp256_249[4] = localObject5;
    tmp256_249[5] = localObject6;
    MsgContentType[] tmp265_256 = tmp256_249;
    MsgContentType[] tmp265_256 = tmp256_249;
    tmp265_256[6] = localObject7;
    tmp265_256[7] = localObject8;
    tmp265_256[8] = localObject9;
    MsgContentType[] tmp281_265 = tmp265_256;
    tmp281_265[9] = localObject10;
    o00OoOoo = tmp281_265;
    localObject1 = new com/qinggan/wechat/MsgContentType$1;
    ((MsgContentType.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.wechat.MsgContentType
 * JD-Core Version:    0.7.0.1
 */