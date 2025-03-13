package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

class NowFeedBack$1
  implements Parcelable.Creator
{
  public NowFeedBack OooO00o(Parcel paramParcel)
  {
    NowFeedBack localNowFeedBack = new com/qinggan/now/NowFeedBack;
    localNowFeedBack.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    NowFeedBack.OooO00o(localNowFeedBack, (NowCardType)localObject);
    localObject = NowFeedBackAction.class.getClassLoader();
    localObject = (NowFeedBackAction)paramParcel.readParcelable((ClassLoader)localObject);
    NowFeedBack.OooO0OO(localNowFeedBack, (NowFeedBackAction)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    NowFeedBack.OooO0o0(localNowFeedBack, (HashMap)localObject);
    localObject = NowFeedBack.OooO0Oo(localNowFeedBack);
    ClassLoader localClassLoader = HashMap.class.getClassLoader();
    paramParcel.readMap((Map)localObject, localClassLoader);
    return localNowFeedBack;
  }
  
  public NowFeedBack[] OooO0O0(int paramInt)
  {
    return new NowFeedBack[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowFeedBack.1
 * JD-Core Version:    0.7.0.1
 */