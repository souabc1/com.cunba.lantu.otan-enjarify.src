package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NaviInfo$1
  implements Parcelable.Creator
{
  public NaviInfo OooO00o(Parcel paramParcel)
  {
    NaviInfo localNaviInfo = new com/qinggan/cluster/info/NaviInfo;
    localNaviInfo.<init>();
    Object localObject = GuideState.class.getClassLoader();
    localObject = (GuideState)paramParcel.readParcelable((ClassLoader)localObject);
    localNaviInfo.o00OooO = ((GuideState)localObject);
    localObject = CalcState.class.getClassLoader();
    localObject = (CalcState)paramParcel.readParcelable((ClassLoader)localObject);
    NaviInfo.OooO00o(localNaviInfo, (CalcState)localObject);
    localObject = TurnByTurnIconInfo.class.getClassLoader();
    localObject = (TurnByTurnIconInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localNaviInfo.o0O00o0 = ((TurnByTurnIconInfo)localObject);
    int i = paramParcel.readInt();
    localNaviInfo.o00Ooo0o = i;
    i = paramParcel.readInt();
    localNaviInfo.o00OooOO = i;
    i = paramParcel.readInt();
    localNaviInfo.o00Ooo0 = i;
    i = paramParcel.readInt();
    localNaviInfo.o00OoooO = i;
    i = paramParcel.readInt();
    localNaviInfo.o00o0000 = i;
    i = paramParcel.readInt();
    localNaviInfo.o00Ooooo = i;
    localObject = paramParcel.readString();
    localNaviInfo.o00Ooo00 = ((String)localObject);
    localObject = paramParcel.readString();
    localNaviInfo.o00o00 = ((String)localObject);
    i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    localNaviInfo.o00OooO0 = j;
    localObject = paramParcel.readString();
    NaviInfo.OooO0OO(localNaviInfo, (String)localObject);
    i = paramParcel.readInt();
    NaviInfo.OooO0Oo(localNaviInfo, i);
    i = paramParcel.readInt();
    NaviInfo.OooO0o0(localNaviInfo, i);
    localObject = paramParcel.readString();
    localNaviInfo.o00Ooo0O = ((String)localObject);
    i = paramParcel.readInt();
    NaviInfo.OooO0o(localNaviInfo, i);
    int k = paramParcel.readInt();
    NaviInfo.OooO0oO(localNaviInfo, k);
    return localNaviInfo;
  }
  
  public NaviInfo[] OooO0O0(int paramInt)
  {
    return new NaviInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.NaviInfo.1
 * JD-Core Version:    0.7.0.1
 */