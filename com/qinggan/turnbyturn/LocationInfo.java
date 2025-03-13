package com.qinggan.turnbyturn;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class LocationInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public float o00OoOoo;
  public int o00Ooo0;
  public double o00Ooo00;
  public String o00Ooo0O;
  public double o00Ooo0o;
  public double o00OooO;
  public double o00OooO0;
  public double o00OooOO;
  public int o00OooOo;
  public long o0O00o0;
  
  static
  {
    LocationInfo.1 local1 = new com/qinggan/turnbyturn/LocationInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float getAccuracy()
  {
    return this.o00OoOoo;
  }
  
  public double getAltitude()
  {
    return this.o00Ooo00;
  }
  
  public int getBear()
  {
    return this.o00Ooo0;
  }
  
  public String getCurrentRoad()
  {
    return this.o00Ooo0O;
  }
  
  public double getLatitude()
  {
    return this.o00Ooo0o;
  }
  
  public double getLongitude()
  {
    return this.o00OooO0;
  }
  
  public double getRawLatitude()
  {
    return this.o00OooO;
  }
  
  public double getRawLongitude()
  {
    return this.o00OooOO;
  }
  
  public int getSpeed()
  {
    return this.o00OooOo;
  }
  
  public long getTimestamp()
  {
    return this.o0O00o0;
  }
  
  public void setAccuracy(float paramFloat)
  {
    this.o00OoOoo = paramFloat;
  }
  
  public void setAltitude(double paramDouble)
  {
    this.o00Ooo00 = paramDouble;
  }
  
  public void setBear(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setCurrentRoad(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.o00Ooo0o = paramDouble;
  }
  
  public void setLongitude(double paramDouble)
  {
    this.o00OooO0 = paramDouble;
  }
  
  public void setRawLatitude(double paramDouble)
  {
    this.o00OooO = paramDouble;
  }
  
  public void setRawLongitude(double paramDouble)
  {
    this.o00OooOO = paramDouble;
  }
  
  public void setSpeed(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.o0O00o0 = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("uC18382C312A353D29363C83");
    localStringBuilder.append(str);
    long l = this.o0O00o0;
    localStringBuilder.append(l);
    str = m54207b69.F54207b69_11("=l400F0B10225B");
    localStringBuilder.append(str);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("cT78282634353574");
    localStringBuilder.append(str);
    i = this.o00OooOo;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("*o430402040C0B212113135F");
    localStringBuilder.append(str);
    double d = this.o00OooO0;
    localStringBuilder.append(d);
    str = m54207b69.F54207b69_11("Gh44050B1F05212313155B");
    localStringBuilder.append(str);
    d = this.o00Ooo0o;
    localStringBuilder.append(d);
    str = m54207b69.F54207b69_11("d11D515F485C4A4A5C5C14");
    localStringBuilder.append(str);
    d = this.o00Ooo00;
    localStringBuilder.append(d);
    str = m54207b69.F54207b69_11("-31F5352534A4658575212");
    localStringBuilder.append(str);
    float f = this.o00OoOoo;
    localStringBuilder.append(f);
    str = m54207b69.F54207b69_11("cW7B35242829373F2A0D41403E79");
    localStringBuilder.append(str);
    str = this.o00Ooo0O;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o0O00o0;
    paramParcel.writeLong(l);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    double d = this.o00OooO0;
    paramParcel.writeDouble(d);
    d = this.o00Ooo0o;
    paramParcel.writeDouble(d);
    d = this.o00OooOO;
    paramParcel.writeDouble(d);
    d = this.o00OooO;
    paramParcel.writeDouble(d);
    d = this.o00Ooo00;
    paramParcel.writeDouble(d);
    float f = this.o00OoOoo;
    paramParcel.writeFloat(f);
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.turnbyturn.LocationInfo
 * JD-Core Version:    0.7.0.1
 */