package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum MediaState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/info/MediaState;
    Object localObject2 = m54207b69.F54207b69_11("G@030D070412");
    ((MediaState)localObject1).<init>((String)localObject2, 0, 0);
    o00Ooo0 = (MediaState)localObject1;
    localObject2 = new com/qinggan/cluster/info/MediaState;
    Object localObject3 = m54207b69.F54207b69_11("Rc3330243D");
    int i = 1;
    ((MediaState)localObject2).<init>((String)localObject3, i, i);
    o00Ooo0o = (MediaState)localObject2;
    localObject3 = new com/qinggan/cluster/info/MediaState;
    Object localObject4 = m54207b69.F54207b69_11("q&7668757867");
    int j = 2;
    ((MediaState)localObject3).<init>((String)localObject4, j, j);
    o00Ooo0O = (MediaState)localObject3;
    localObject4 = new com/qinggan/cluster/info/MediaState;
    String str = m54207b69.F54207b69_11("uZ090F170D");
    int k = 3;
    ((MediaState)localObject4).<init>(str, k, k);
    o00OooO0 = (MediaState)localObject4;
    MediaState[] tmp107_104 = new MediaState[4];
    MediaState[] tmp108_107 = tmp107_104;
    MediaState[] tmp108_107 = tmp107_104;
    tmp108_107[0] = localObject1;
    tmp108_107[1] = localObject2;
    tmp108_107[2] = localObject3;
    MediaState[] tmp118_108 = tmp108_107;
    tmp118_108[3] = localObject4;
    o00Ooo00 = tmp118_108;
    localObject1 = new com/qinggan/cluster/info/MediaState$1;
    ((MediaState.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public MediaState(int paramInt)
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
 * Qualified Name:     com.qinggan.cluster.info.MediaState
 * JD-Core Version:    0.7.0.1
 */