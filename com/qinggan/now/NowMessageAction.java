package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum NowMessageAction
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/NowMessageAction;
    Object localObject2 = m54207b69.F54207b69_11("O;75756E677A836E6F8285886F7480827B");
    ((NowMessageAction)localObject1).<init>((String)localObject2, 0);
    o00Ooo0 = (NowMessageAction)localObject1;
    localObject2 = new com/qinggan/now/NowMessageAction;
    Object localObject3 = m54207b69.F54207b69_11("S87678716A798271728188877279758A887C8E");
    ((NowMessageAction)localObject2).<init>((String)localObject3, 1);
    o00Ooo0O = (NowMessageAction)localObject2;
    localObject3 = new com/qinggan/now/NowMessageAction;
    String str = m54207b69.F54207b69_11("\\37D7D666F827B66677A7D807787878585");
    ((NowMessageAction)localObject3).<init>(str, 2);
    o00Ooo00 = (NowMessageAction)localObject3;
    NowMessageAction[] tmp64_61 = new NowMessageAction[3];
    NowMessageAction[] tmp65_64 = tmp64_61;
    NowMessageAction[] tmp65_64 = tmp64_61;
    tmp65_64[0] = localObject1;
    tmp65_64[1] = localObject2;
    tmp65_64[2] = localObject3;
    o00OoOoo = tmp65_64;
    localObject1 = new com/qinggan/now/NowMessageAction$1;
    ((NowMessageAction.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.now.NowMessageAction
 * JD-Core Version:    0.7.0.1
 */