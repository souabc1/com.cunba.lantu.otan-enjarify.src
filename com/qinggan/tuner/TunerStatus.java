package com.qinggan.tuner;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class TunerStatus
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  
  static
  {
    TunerStatus.1 local1 = new com/qinggan/tuner/TunerStatus$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getFof()
  {
    return this.o00OoOoo;
  }
  
  public int getFrequency()
  {
    return this.o00Ooo00;
  }
  
  public int getLevel()
  {
    return this.o00Ooo0O;
  }
  
  public int getStereo()
  {
    return this.o00Ooo0o;
  }
  
  public int getUsn()
  {
    return this.o00OooO0;
  }
  
  public int getWam()
  {
    return this.o00OooO;
  }
  
  public boolean isValidStation()
  {
    return this.o00Ooo0;
  }
  
  public void setFof(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setFrequency(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setIsValidStation(boolean paramBoolean)
  {
    this.o00Ooo0 = paramBoolean;
  }
  
  public void setLevel(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setStereo(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setUsn(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setWam(int paramInt)
  {
    this.o00OooO = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("P^0C403C3A35123046323437304439493E3B4C42503B78");
    localStringBuilder.append(str);
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("GL606D27421E32262C302842384432313181");
    localStringBuilder.append(str);
    boolean bool = this.o00Ooo0;
    localStringBuilder.append(bool);
    str = m54207b69.F54207b69_11("U61A175C5644586012");
    localStringBuilder.append(str);
    int j = this.o00Ooo0O;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("35191642495F0D");
    localStringBuilder.append(str);
    j = this.o00OooO0;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("7Y757A303B3869");
    localStringBuilder.append(str);
    j = this.o00OooO;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("xO63702B232D77");
    localStringBuilder.append(str);
    j = this.o00OoOoo;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("mC6F64323A2A362C3386");
    localStringBuilder.append(str);
    j = this.o00Ooo0o;
    localStringBuilder.append(j);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tuner.TunerStatus
 * JD-Core Version:    0.7.0.1
 */