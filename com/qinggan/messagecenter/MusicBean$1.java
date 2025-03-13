package com.qinggan.messagecenter;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MusicBean$1
  implements Parcelable.Creator
{
  public MusicBean OooO00o(Parcel paramParcel)
  {
    MusicBean localMusicBean = new com/qinggan/messagecenter/MusicBean;
    localMusicBean.<init>();
    String str = paramParcel.readString();
    MusicBean.OooO00o(localMusicBean, str);
    str = paramParcel.readString();
    MusicBean.OooO0OO(localMusicBean, str);
    str = paramParcel.readString();
    MusicBean.OooO0Oo(localMusicBean, str);
    paramParcel = paramParcel.readString();
    MusicBean.OooO0o0(localMusicBean, paramParcel);
    return localMusicBean;
  }
  
  public MusicBean[] OooO0O0(int paramInt)
  {
    return new MusicBean[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.messagecenter.MusicBean.1
 * JD-Core Version:    0.7.0.1
 */