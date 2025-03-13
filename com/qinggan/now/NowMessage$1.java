package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NowMessage$1
  implements Parcelable.Creator
{
  public NowMessage OooO00o(Parcel paramParcel)
  {
    NowMessage localNowMessage = new com/qinggan/now/NowMessage;
    localNowMessage.<init>();
    Object localObject = NowMessageAction.class.getClassLoader();
    localObject = (NowMessageAction)paramParcel.readParcelable((ClassLoader)localObject);
    NowMessage.OooO00o(localNowMessage, (NowMessageAction)localObject);
    localObject = getClass().getClassLoader();
    paramParcel = (NowCard)paramParcel.readParcelable((ClassLoader)localObject);
    NowMessage.OooO0OO(localNowMessage, paramParcel);
    return localNowMessage;
  }
  
  public NowMessage[] OooO0O0(int paramInt)
  {
    return new NowMessage[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowMessage.1
 * JD-Core Version:    0.7.0.1
 */