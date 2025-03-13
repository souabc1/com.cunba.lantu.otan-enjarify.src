package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.WarmTipsType;
import java.util.Date;

class WarmTipsCard$1
  implements Parcelable.Creator
{
  public WarmTipsCard OooO00o(Parcel paramParcel)
  {
    WarmTipsCard localWarmTipsCard = new com/qinggan/now/card/WarmTipsCard;
    localWarmTipsCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localWarmTipsCard.o00OoOoo = ((NowCardType)localObject);
    localObject = WarmTipsType.class.getClassLoader();
    localObject = (WarmTipsType)paramParcel.readParcelable((ClassLoader)localObject);
    localWarmTipsCard.o00OooOO = ((WarmTipsType)localObject);
    localObject = paramParcel.readString();
    localWarmTipsCard.o00OooO = ((String)localObject);
    localObject = paramParcel.readString();
    localWarmTipsCard.o00Ooo0O = ((String)localObject);
    localObject = paramParcel.readString();
    localWarmTipsCard.o00OooO0 = ((String)localObject);
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramParcel = new java/util/Date;
      paramParcel.<init>(l1);
      localWarmTipsCard.o00Ooo00 = paramParcel;
    }
    return localWarmTipsCard;
  }
  
  public WarmTipsCard[] OooO0O0(int paramInt)
  {
    return new WarmTipsCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.WarmTipsCard.1
 * JD-Core Version:    0.7.0.1
 */