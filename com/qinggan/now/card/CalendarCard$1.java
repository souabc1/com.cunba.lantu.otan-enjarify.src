package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Poi;
import java.util.ArrayList;
import java.util.List;

class CalendarCard$1
  implements Parcelable.Creator
{
  public CalendarCard OooO00o(Parcel paramParcel)
  {
    CalendarCard localCalendarCard = new com/qinggan/now/card/CalendarCard;
    localCalendarCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localCalendarCard.o00OoOoo = ((NowCardType)localObject);
    long l = paramParcel.readLong();
    CalendarCard.OooO00o(localCalendarCard, l);
    l = paramParcel.readLong();
    CalendarCard.OooO0OO(localCalendarCard, l);
    l = paramParcel.readLong();
    CalendarCard.OooO0Oo(localCalendarCard, l);
    localObject = paramParcel.readString();
    CalendarCard.OooO0o0(localCalendarCard, (String)localObject);
    localObject = paramParcel.readString();
    CalendarCard.OooO0o(localCalendarCard, (String)localObject);
    localObject = paramParcel.readString();
    CalendarCard.OooO0oO(localCalendarCard, (String)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    CalendarCard.OooO(localCalendarCard, (ArrayList)localObject);
    localObject = CalendarCard.OooO0oo(localCalendarCard);
    paramParcel.readStringList((List)localObject);
    localObject = Poi.class.getClassLoader();
    paramParcel = (Poi)paramParcel.readParcelable((ClassLoader)localObject);
    CalendarCard.OooOO0(localCalendarCard, paramParcel);
    return localCalendarCard;
  }
  
  public CalendarCard[] OooO0O0(int paramInt)
  {
    return new CalendarCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.CalendarCard.1
 * JD-Core Version:    0.7.0.1
 */