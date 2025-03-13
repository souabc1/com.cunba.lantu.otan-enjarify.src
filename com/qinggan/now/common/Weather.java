package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class Weather
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public float o00OoOoo;
  public String o00Ooo0;
  public Date o00Ooo00;
  public float o00Ooo0O;
  public Boolean o00Ooo0o;
  public Date o00OooO;
  public float o00OooO0;
  public WeatherType o00OooOO;
  public WindDirection o00OooOo;
  public WindPower o0O00o0;
  
  static
  {
    Weather.1 local1 = new com/qinggan/now/common/Weather$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float getAvgTemperature()
  {
    return this.o00OoOoo;
  }
  
  public Date getDate()
  {
    return this.o00Ooo00;
  }
  
  public String getDescription()
  {
    return this.o00Ooo0;
  }
  
  public float getHighTemperature()
  {
    return this.o00Ooo0O;
  }
  
  public Boolean getIsSuitableForWashing()
  {
    return this.o00Ooo0o;
  }
  
  public float getLowTemperature()
  {
    return this.o00OooO0;
  }
  
  public Date getPublishTime()
  {
    return this.o00OooO;
  }
  
  public WeatherType getType()
  {
    return this.o00OooOO;
  }
  
  public WindDirection getWindDirection()
  {
    return this.o00OooOo;
  }
  
  public WindPower getWindPower()
  {
    return this.o0O00o0;
  }
  
  public void setAvgTemperature(float paramFloat)
  {
    this.o00OoOoo = paramFloat;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00Ooo00 = paramDate;
  }
  
  public void setDescription(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setHighTemperature(float paramFloat)
  {
    this.o00Ooo0O = paramFloat;
  }
  
  public void setIsSuitableForWashing(Boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
  }
  
  public void setLowTemperature(float paramFloat)
  {
    this.o00OooO0 = paramFloat;
  }
  
  public void setPublishTime(Date paramDate)
  {
    this.o00OooO = paramDate;
  }
  
  public void setType(WeatherType paramWeatherType)
  {
    this.o00OooOO = paramWeatherType;
  }
  
  public void setWindDirection(WindDirection paramWindDirection)
  {
    this.o00OooOo = paramWindDirection;
  }
  
  public void setWindPower(WindPower paramWindPower)
  {
    this.o0O00o0 = paramWindPower;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("(Y0E3D3A30354131800A4642384871");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Y.020F4C4E6152624E6663514C4C20");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("_?132055534C7060595763576957575B6912");
    localStringBuilder.append((String)localObject);
    float f = this.o00OooO0;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("[S7F743D3D38400D3D462C402C3E343430467F");
    localStringBuilder.append((String)localObject);
    f = this.o00Ooo0O;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("gm414E1C07070E2F0B27111824100F115F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("{a4D42180B130A37151E0D1D67");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("um414E1F1B13060A250D420E0B145D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    long l1 = 0L;
    if (localObject != null)
    {
      long l2 = ((Date)localObject).getTime();
      paramParcel.writeLong(l2);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    float f = this.o00OooO0;
    paramParcel.writeFloat(f);
    f = this.o00Ooo0O;
    paramParcel.writeFloat(f);
    f = this.o00OoOoo;
    paramParcel.writeFloat(f);
    localObject = this.o00OooOo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o0O00o0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    Date localDate = this.o00OooO;
    if (localDate != null)
    {
      long l3 = localDate.getTime();
      paramParcel.writeLong(l3);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Weather
 * JD-Core Version:    0.7.0.1
 */