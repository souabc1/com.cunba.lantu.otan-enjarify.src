package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class HubPackage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public double o00OoOoo;
  public long o00Ooo0;
  public double o00Ooo00;
  public String o00Ooo0O;
  public Date o00Ooo0o;
  public double o00OooO;
  public Date o00OooO0;
  public double o00OooOO;
  public long o00OooOo;
  public long o0O00o0;
  
  static
  {
    HubPackage.1 local1 = new com/qinggan/now/common/HubPackage$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public static Parcelable.Creator getCreator()
  {
    return CREATOR;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public double getAmountPaid()
  {
    return this.o00OoOoo;
  }
  
  public double getFeeAmountPaid()
  {
    return this.o00Ooo00;
  }
  
  public long getId()
  {
    return this.o00Ooo0;
  }
  
  public String getName()
  {
    return this.o00Ooo0O;
  }
  
  public Date getPackBeginTime()
  {
    return this.o00Ooo0o;
  }
  
  public Date getPackEndTime()
  {
    return this.o00OooO0;
  }
  
  public double getPackFee()
  {
    return this.o00OooO;
  }
  
  public double getRebate()
  {
    return this.o00OooOO;
  }
  
  public long getRemainingTraffics()
  {
    return this.o00OooOo;
  }
  
  public long getTotalTraffics()
  {
    return this.o0O00o0;
  }
  
  public void setAmountPaid(double paramDouble)
  {
    this.o00OoOoo = paramDouble;
  }
  
  public void setFeeAmountPaid(double paramDouble)
  {
    this.o00Ooo00 = paramDouble;
  }
  
  public void setId(long paramLong)
  {
    this.o00Ooo0 = paramLong;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setPackBeginTime(Date paramDate)
  {
    this.o00Ooo0o = paramDate;
  }
  
  public void setPackEndTime(Date paramDate)
  {
    this.o00OooO0 = paramDate;
  }
  
  public void setPackFee(double paramDouble)
  {
    this.o00OooO = paramDouble;
  }
  
  public void setRebate(double paramDouble)
  {
    this.o00OooOO = paramDouble;
  }
  
  public void setRemainingTraffics(long paramLong)
  {
    this.o00OooOo = paramLong;
  }
  
  public void setTotalTraffics(long paramLong)
  {
    this.o0O00o0 = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("*(605E4C7B4D5049505756127E516E5A24");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo0;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11(";01C115F8155625B14");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("fb4E4311330B14091214141610421D1113141C132473");
    localStringBuilder.append((String)localObject);
    l = this.o00OooOo;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("w31F14606656555E7C5E5F18");
    localStringBuilder.append((String)localObject);
    double d = this.o00OooO;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11(",31F14607562614C644F6C5C65631B");
    localStringBuilder.append((String)localObject);
    d = this.o00OoOoo;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("%m414E022E0C0D32070A210D244919121860");
    localStringBuilder.append((String)localObject);
    d = this.o00Ooo00;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("1a4D420E340407102A0C0F121A41151A136C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("HQ7D723E043437401B473E0F4348417A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11(")\\707D33113D43432F416A");
    localStringBuilder.append((String)localObject);
    d = this.o00OooOO;
    localStringBuilder.append(d);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00Ooo0;
    paramParcel.writeLong(l);
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
    l = this.o0O00o0;
    paramParcel.writeLong(l);
    l = this.o00OooOo;
    paramParcel.writeLong(l);
    double d = this.o00OooO;
    paramParcel.writeDouble(d);
    d = this.o00OoOoo;
    paramParcel.writeDouble(d);
    d = this.o00Ooo00;
    paramParcel.writeDouble(d);
    l = this.o00Ooo0o.getTime();
    paramParcel.writeLong(l);
    l = this.o00OooO0.getTime();
    paramParcel.writeLong(l);
    d = this.o00OooOO;
    paramParcel.writeDouble(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.HubPackage
 * JD-Core Version:    0.7.0.1
 */