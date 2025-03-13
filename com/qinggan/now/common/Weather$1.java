package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class Weather$1
  implements Parcelable.Creator
{
  public Weather OooO00o(Parcel paramParcel)
  {
    Weather localWeather = new com/qinggan/now/common/Weather;
    localWeather.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localWeather.o00Ooo00 = localDate;
    }
    else
    {
      localWeather.o00Ooo00 = null;
    }
    Object localObject = paramParcel.readString();
    localWeather.o00Ooo0 = ((String)localObject);
    localObject = WeatherType.class.getClassLoader();
    localObject = (WeatherType)paramParcel.readParcelable((ClassLoader)localObject);
    localWeather.o00OooOO = ((WeatherType)localObject);
    float f = paramParcel.readFloat();
    localWeather.o00OooO0 = f;
    f = paramParcel.readFloat();
    localWeather.o00Ooo0O = f;
    f = paramParcel.readFloat();
    localWeather.o00OoOoo = f;
    localObject = WindDirection.class.getClassLoader();
    localObject = (WindDirection)paramParcel.readParcelable((ClassLoader)localObject);
    localWeather.o00OooOo = ((WindDirection)localObject);
    localObject = WindPower.class.getClassLoader();
    localObject = (WindPower)paramParcel.readParcelable((ClassLoader)localObject);
    localWeather.o0O00o0 = ((WindPower)localObject);
    l1 = paramParcel.readLong();
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      paramParcel = new java/util/Date;
      paramParcel.<init>(l1);
      localWeather.o00OooO = paramParcel;
    }
    else
    {
      localWeather.o00OooO = null;
    }
    return localWeather;
  }
  
  public Weather[] OooO0O0(int paramInt)
  {
    return new Weather[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Weather.1
 * JD-Core Version:    0.7.0.1
 */