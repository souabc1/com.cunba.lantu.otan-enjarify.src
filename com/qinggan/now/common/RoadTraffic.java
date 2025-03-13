package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class RoadTraffic
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public long o00Ooo0o;
  public TrafficType o00OooO0;
  
  static
  {
    RoadTraffic.1 local1 = new com/qinggan/now/common/RoadTraffic$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDescription()
  {
    return this.o00OoOoo;
  }
  
  public int getDistance()
  {
    return this.o00Ooo00;
  }
  
  public String getName()
  {
    return this.o00Ooo0;
  }
  
  public int getSpeed()
  {
    return this.o00Ooo0O;
  }
  
  public long getThroughTime()
  {
    return this.o00Ooo0o;
  }
  
  public TrafficType getType()
  {
    return this.o00OooO0;
  }
  
  public void setDescription(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDistance(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setSpeed(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setThroughTime(long paramLong)
  {
    this.o00Ooo0o = paramLong;
  }
  
  public void setType(TrafficType paramTrafficType)
  {
    this.o00OooO0 = paramTrafficType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("A`321003073817070D0E120D4B4711132213231B23281E252575");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("VG6B682B292E2780");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11(">o43501E220E0F1159");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Ty555A1F130E121E1E22254E");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo00;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Z@6C61362B36343B2E301D3338318A");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo0o;
    localStringBuilder.append(l);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    long l = this.o00Ooo0o;
    paramParcel.writeLong(l);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.RoadTraffic
 * JD-Core Version:    0.7.0.1
 */