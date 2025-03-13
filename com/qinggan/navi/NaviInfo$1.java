package com.qinggan.navi;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NaviInfo$1
  implements Parcelable.Creator
{
  public NaviInfo OooO00o(Parcel paramParcel)
  {
    NaviInfo localNaviInfo = new com/qinggan/navi/NaviInfo;
    localNaviInfo.<init>();
    Object localObject = GuideState.class.getClassLoader();
    localObject = (GuideState)paramParcel.readParcelable((ClassLoader)localObject);
    localNaviInfo.o00OooO0 = ((GuideState)localObject);
    localObject = TurnByTurnIconInfo.class.getClassLoader();
    localObject = (TurnByTurnIconInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localNaviInfo.o00Ooooo = ((TurnByTurnIconInfo)localObject);
    int i = paramParcel.readInt();
    localNaviInfo.o00Ooo0O = i;
    i = paramParcel.readInt();
    localNaviInfo.o00OooO = i;
    i = paramParcel.readInt();
    localNaviInfo.o00Ooo00 = i;
    i = paramParcel.readInt();
    localNaviInfo.o00o0000 = i;
    i = paramParcel.readInt();
    localNaviInfo.o00o000O = i;
    i = paramParcel.readInt();
    localNaviInfo.o00o000 = i;
    localObject = paramParcel.readString();
    localNaviInfo.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    localNaviInfo.o00o000o = ((String)localObject);
    i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    localNaviInfo.o00Ooo0o = j;
    localObject = paramParcel.readString();
    NaviInfo.OooO00o(localNaviInfo, (String)localObject);
    i = paramParcel.readInt();
    NaviInfo.OooO0OO(localNaviInfo, i);
    i = paramParcel.readInt();
    NaviInfo.OooO0Oo(localNaviInfo, i);
    localObject = paramParcel.readString();
    localNaviInfo.o00Ooo0 = ((String)localObject);
    int k = paramParcel.readInt();
    NaviInfo.OooO0o0(localNaviInfo, k);
    return localNaviInfo;
  }
  
  public NaviInfo[] OooO0O0(int paramInt)
  {
    return new NaviInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviInfo.1
 * JD-Core Version:    0.7.0.1
 */