package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.MaintenanceInfo;

class MaintenanceCard$1
  implements Parcelable.Creator
{
  public MaintenanceCard OooO00o(Parcel paramParcel)
  {
    MaintenanceCard localMaintenanceCard = new com/qinggan/now/card/MaintenanceCard;
    localMaintenanceCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localMaintenanceCard.o00OoOoo = ((NowCardType)localObject);
    localObject = MaintenanceInfo.class.getClassLoader();
    localObject = (MaintenanceInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localMaintenanceCard.o00Ooo00 = ((MaintenanceInfo)localObject);
    int i = paramParcel.readInt();
    localMaintenanceCard.o00Ooo0 = i;
    return localMaintenanceCard;
  }
  
  public MaintenanceCard[] OooO0O0(int paramInt)
  {
    return new MaintenanceCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.MaintenanceCard.1
 * JD-Core Version:    0.7.0.1
 */