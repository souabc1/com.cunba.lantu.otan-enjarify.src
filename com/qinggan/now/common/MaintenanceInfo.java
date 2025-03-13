package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.qinggan.now.common.vehicle.VehicleMode;
import java.util.Date;
import m54207b69;

public class MaintenanceInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public Date o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O = -1;
  public int o00Ooo0o;
  public Date o00OooO;
  public int o00OooO0;
  public Date o00OooOO;
  public String o00OooOo;
  public VehicleMode o00OoooO;
  public String o00Ooooo;
  public MaintenanceStation o0O00o0;
  
  static
  {
    MaintenanceInfo.1 local1 = new com/qinggan/now/common/MaintenanceInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getDurationPeriod()
  {
    return this.o00OoOoo;
  }
  
  public String getKey()
  {
    return this.o00Ooo00;
  }
  
  public Date getLastMaintenanceDate()
  {
    return this.o00Ooo0;
  }
  
  public int getLastOdoMeter()
  {
    return this.o00Ooo0O;
  }
  
  public int getMileage()
  {
    return this.o00Ooo0o;
  }
  
  public int getMileagePeriod()
  {
    return this.o00OooO0;
  }
  
  public Date getNewbieDate()
  {
    return this.o00OooO;
  }
  
  public Date getNextMaintenanceDate()
  {
    return this.o00OooOO;
  }
  
  public String getPdsn()
  {
    return this.o00OooOo;
  }
  
  public MaintenanceStation getStation()
  {
    return this.o0O00o0;
  }
  
  public VehicleMode getVehicleMode()
  {
    return this.o00OoooO;
  }
  
  public String getVin()
  {
    return this.o00Ooooo;
  }
  
  public void setDurationPeriod(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setKey(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setLastMaintenanceDate(Date paramDate)
  {
    this.o00Ooo0 = paramDate;
  }
  
  public void setLastOdoMeter(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setMileage(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setMileagePeriod(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setNewbieDate(Date paramDate)
  {
    this.o00OooO = paramDate;
  }
  
  public void setNextMaintenanceDate(Date paramDate)
  {
    this.o00OooOO = paramDate;
  }
  
  public void setPdsn(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setStation(MaintenanceStation paramMaintenanceStation)
  {
    this.o0O00o0 = paramMaintenanceStation;
  }
  
  public void setVehicleMode(VehicleMode paramVehicleMode)
  {
    this.o00OoooO = paramVehicleMode;
  }
  
  public void setVin(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("$}301D16160D1D19231B27223F1F2820151D2A2026546F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOo;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("Ae4946150F0F5D48");
    localStringBuilder.append(str);
    str = this.o00Ooooo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11("VX74793540256A85");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("ba4D420E0B1109060D0C65");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("%q5D5209171D1D18241C4528202059");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("}O6370232D3C322C31133745357E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("X,000D4250635D67544D4B62544E5A505E59795F6B5D26");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("1,000D4250635D694F4B6A5363556B1F");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("[g4B480C110F070C070A400C201A151169");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("U+070C51615D4F65494C4E8559654F525E26");
    localStringBuilder.append((String)localObject);
    i = this.o00OoOoo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("1W7B7826263A28443F4173");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("7k474C071117242C110A0E2919111713171E401C32226B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooOo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooooo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    int i = this.o00Ooo0o;
    paramParcel.writeInt(i);
    localObject = this.o00OoooO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OooO;
    long l1 = 0L;
    long l2;
    if (localObject != null)
    {
      l2 = ((Date)localObject).getTime();
      paramParcel.writeLong(l2);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    localObject = this.o00Ooo0;
    if (localObject != null)
    {
      l2 = ((Date)localObject).getTime();
      paramParcel.writeLong(l2);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    i = this.o00Ooo0O;
    paramParcel.writeInt(i);
    localObject = this.o00OooOO;
    if (localObject != null)
    {
      long l3 = ((Date)localObject).getTime();
      paramParcel.writeLong(l3);
    }
    else
    {
      paramParcel.writeLong(l1);
    }
    i = this.o00OooO0;
    paramParcel.writeInt(i);
    i = this.o00OoOoo;
    paramParcel.writeInt(i);
    localObject = this.o0O00o0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MaintenanceInfo
 * JD-Core Version:    0.7.0.1
 */