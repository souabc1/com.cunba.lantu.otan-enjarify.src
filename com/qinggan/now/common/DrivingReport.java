package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class DrivingReport
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public float o00Ooo00;
  public float o00Ooo0O;
  public TimePeriod o00Ooo0o;
  public int o00OooO;
  public float o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public long o0O00o0;
  
  static
  {
    DrivingReport.1 local1 = new com/qinggan/now/common/DrivingReport$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getAvgSpeed()
  {
    return this.o00OoOoo;
  }
  
  public float getFuel()
  {
    return this.o00Ooo00;
  }
  
  public int getMaxSpeed()
  {
    return this.o00Ooo0;
  }
  
  public float getMileage()
  {
    return this.o00Ooo0O;
  }
  
  public TimePeriod getPeriod()
  {
    return this.o00Ooo0o;
  }
  
  public float getScore()
  {
    return this.o00OooO0;
  }
  
  public int getSpeedDown()
  {
    return this.o00OooO;
  }
  
  public int getSpeedTurn()
  {
    return this.o00OooOO;
  }
  
  public int getSpeedUp()
  {
    return this.o00OooOo;
  }
  
  public long getTimeLen()
  {
    return this.o0O00o0;
  }
  
  public void setAvgSpeed(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setFuel(float paramFloat)
  {
    this.o00Ooo00 = paramFloat;
  }
  
  public void setMaxSpeed(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setMileage(float paramFloat)
  {
    this.o00Ooo0O = paramFloat;
  }
  
  public void setPeriod(TimePeriod paramTimePeriod)
  {
    this.o00Ooo0o = paramTimePeriod;
  }
  
  public void setScore(float paramFloat)
  {
    this.o00OooO0 = paramFloat;
  }
  
  public void setSpeedDown(int paramInt)
  {
    this.o00OooO = paramInt;
  }
  
  public void setSpeedTurn(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setSpeedUp(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setTimeLen(long paramLong)
  {
    this.o0O00o0 = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("BE01382E363030281E283E34423D722C372531493F3E368E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("J\\707D33124338344069");
    localStringBuilder.append((String)localObject);
    float f = this.o00OooO0;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("p%09064A6B504E464B4A4922");
    localStringBuilder.append((String)localObject);
    f = this.o00Ooo0O;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("S<101D536B59565F77615B0B");
    localStringBuilder.append((String)localObject);
    long l = this.o0O00o0;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("Iz565B193F13241C4E");
    localStringBuilder.append((String)localObject);
    f = this.o00Ooo00;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("h31F1460754959664A5E5F6119");
    localStringBuilder.append((String)localObject);
    int i = this.o00OoOoo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("\\|505D1334210935132122224C");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("c%09064A795945464869535C5624");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("271B185C674B57585A6A5014");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("0D68652B1A38262727183A403585");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOO;
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    TimePeriod localTimePeriod = this.o00Ooo0o;
    paramParcel.writeParcelable(localTimePeriod, paramInt);
    float f = this.o00OooO0;
    paramParcel.writeFloat(f);
    f = this.o00Ooo0O;
    paramParcel.writeFloat(f);
    long l = this.o0O00o0;
    paramParcel.writeLong(l);
    f = this.o00Ooo00;
    paramParcel.writeFloat(f);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DrivingReport
 * JD-Core Version:    0.7.0.1
 */