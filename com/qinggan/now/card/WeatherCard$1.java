package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.City;
import com.qinggan.now.common.Weather;
import com.qinggan.now.common.WeatherCardType;
import java.util.ArrayList;
import java.util.List;

class WeatherCard$1
  implements Parcelable.Creator
{
  public WeatherCard OooO00o(Parcel paramParcel)
  {
    WeatherCard localWeatherCard = new com/qinggan/now/card/WeatherCard;
    localWeatherCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localWeatherCard.o00OoOoo = ((NowCardType)localObject);
    localObject = WeatherCardType.class.getClassLoader();
    localObject = (WeatherCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localWeatherCard.o00Ooo00 = ((WeatherCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localWeatherCard.o00Ooo0O = ((ArrayList)localObject);
    Parcelable.Creator localCreator = Weather.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localWeatherCard.o00Ooo0 = ((ArrayList)localObject);
    localCreator = City.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localWeatherCard;
  }
  
  public WeatherCard[] OooO0O0(int paramInt)
  {
    return new WeatherCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.WeatherCard.1
 * JD-Core Version:    0.7.0.1
 */