package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.MusicType;

class MusicCard$1
  implements Parcelable.Creator
{
  public MusicCard OooO00o(Parcel paramParcel)
  {
    MusicCard localMusicCard = new com/qinggan/now/card/MusicCard;
    localMusicCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localMusicCard.o00OoOoo = ((NowCardType)localObject);
    localObject = MusicType.class.getClassLoader();
    localObject = (MusicType)paramParcel.readParcelable((ClassLoader)localObject);
    localMusicCard.o00Ooo00 = ((MusicType)localObject);
    paramParcel = paramParcel.readString();
    localMusicCard.o00Ooo0 = paramParcel;
    return localMusicCard;
  }
  
  public MusicCard[] OooO0O0(int paramInt)
  {
    return new MusicCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.MusicCard.1
 * JD-Core Version:    0.7.0.1
 */