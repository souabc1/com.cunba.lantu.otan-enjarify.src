package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum MusicType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/MusicType;
    Object localObject2 = m54207b69.F54207b69_11("lU0027391B242B423D");
    int i = 1;
    ((MusicType)localObject1).<init>((String)localObject2, 0, i);
    o00OoooO = (MusicType)localObject1;
    localObject2 = new com/qinggan/now/common/MusicType;
    Object localObject3 = m54207b69.F54207b69_11("9:6860585E467C55505B62");
    int j = 2;
    ((MusicType)localObject2).<init>((String)localObject3, i, j);
    o00OooOo = (MusicType)localObject2;
    localObject3 = new com/qinggan/now/common/MusicType;
    Object localObject4 = m54207b69.F54207b69_11("Tc310D1005111C1007361F1A150C");
    int k = 3;
    ((MusicType)localObject3).<init>((String)localObject4, j, k);
    o0O00o0 = (MusicType)localObject3;
    localObject4 = new com/qinggan/now/common/MusicType;
    Object localObject5 = m54207b69.F54207b69_11("z$684C4C467250575D524A67");
    int m = 4;
    ((MusicType)localObject4).<init>((String)localObject5, k, m);
    o00OooO0 = (MusicType)localObject4;
    localObject5 = new com/qinggan/now/common/MusicType;
    Object localObject6 = m54207b69.F54207b69_11("5z3C1C10162114253E17121D24");
    int n = 5;
    ((MusicType)localObject5).<init>((String)localObject6, m, n);
    o00Ooo0 = (MusicType)localObject5;
    localObject6 = new com/qinggan/now/common/MusicType;
    Object localObject7 = m54207b69.F54207b69_11("uV103C0726382A3B2B473D3D0E323F453143");
    int i1 = 6;
    ((MusicType)localObject6).<init>((String)localObject7, n, i1);
    o00Ooo0o = (MusicType)localObject6;
    localObject7 = new com/qinggan/now/common/MusicType;
    Object localObject8 = m54207b69.F54207b69_11("v87E5672544F515D5149");
    int i2 = 7;
    ((MusicType)localObject7).<init>((String)localObject8, i1, i2);
    o00Ooo0O = (MusicType)localObject7;
    localObject8 = new com/qinggan/now/common/MusicType;
    Object localObject9 = m54207b69.F54207b69_11("6b2F18130E052F11181E161A26");
    int i3 = 8;
    ((MusicType)localObject8).<init>((String)localObject9, i2, i3);
    o00OooO = (MusicType)localObject8;
    localObject9 = new com/qinggan/now/common/MusicType;
    String str = m54207b69.F54207b69_11("`:754F54624C");
    ((MusicType)localObject9).<init>(str, i3, 9);
    o00OooOO = (MusicType)localObject9;
    MusicType[] tmp267_264 = new MusicType[9];
    MusicType[] tmp268_267 = tmp267_264;
    MusicType[] tmp268_267 = tmp267_264;
    tmp268_267[0] = localObject1;
    tmp268_267[1] = localObject2;
    MusicType[] tmp275_268 = tmp268_267;
    MusicType[] tmp275_268 = tmp268_267;
    tmp275_268[2] = localObject3;
    tmp275_268[3] = localObject4;
    MusicType[] tmp283_275 = tmp275_268;
    MusicType[] tmp283_275 = tmp275_268;
    tmp283_275[4] = localObject5;
    tmp283_275[5] = localObject6;
    MusicType[] tmp292_283 = tmp283_275;
    MusicType[] tmp292_283 = tmp283_275;
    tmp292_283[6] = localObject7;
    tmp292_283[7] = localObject8;
    tmp292_283[8] = localObject9;
    o00Ooo00 = tmp292_283;
    localObject1 = new com/qinggan/now/common/MusicType$1;
    ((MusicType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public MusicType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public static MusicType OooO0OO(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return o00OooOO;
    case 8: 
      return o00OooO;
    case 7: 
      return o00Ooo0O;
    case 6: 
      return o00Ooo0o;
    case 5: 
      return o00Ooo0;
    case 4: 
      return o00OooO0;
    case 3: 
      return o0O00o0;
    case 2: 
      return o00OooOo;
    }
    return o00OoooO;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MusicType
 * JD-Core Version:    0.7.0.1
 */