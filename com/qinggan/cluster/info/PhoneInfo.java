package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public final class PhoneInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public String o00OooOO;
  public int o00OooOo;
  public PhoneState o0O00o0;
  
  static
  {
    PhoneInfo.1 local1 = new com/qinggan/cluster/info/PhoneInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getConnectedStatus()
  {
    return this.o00OoOoo;
  }
  
  public String getDeviceName()
  {
    return this.o00Ooo00;
  }
  
  public int getDuration()
  {
    return this.o00Ooo0;
  }
  
  public String getName()
  {
    return this.o00Ooo0o;
  }
  
  public int getPhoneBatteryLevel()
  {
    return this.o00OooO0;
  }
  
  public int getPhoneMissCallNumber()
  {
    return this.o00OooO;
  }
  
  public String getPhoneNum()
  {
    return this.o00OooOO;
  }
  
  public int getPhoneSignalStrength()
  {
    return this.o00OooOo;
  }
  
  public PhoneState getPhoneState()
  {
    return this.o0O00o0;
  }
  
  public void setConnectedStatus(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setDeviceName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setDuration(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setPhoneBatteryLevel(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setPhoneMissCallNumber(int paramInt)
  {
    this.o00OooO = paramInt;
  }
  
  public void setPhoneNum(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setPhoneSignalStrength(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setPhoneState(PhoneState paramPhoneState)
  {
    this.o0O00o0 = paramPhoneState;
  }
  
  public void setVehicleCall(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("9R1007043D41413D22443D47342E474B4B472D3952838A");
    localStringBuilder.append(str);
    str = this.o00OooOO;
    localStringBuilder.append(str);
    char c = '\'';
    localStringBuilder.append(c);
    Object localObject = m54207b69.F54207b69_11("t=111E555F545D0621");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("RZ767B40322C40343A3D3D71");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("%v5A5708211D1D192C0A200C1E57");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("o}515E1B1B0F19241F3B251A234C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("^N626F2F242425313442343428463C484A4D84");
    localStringBuilder.append((String)localObject);
    i = this.o00OoOoo;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("K)050A425D83514747524E567554525323");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("iJ666B3C252929350F3347483A4440143E4C40388A");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO0;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("=c4F44150E10120C37120D170D1B3D2520161E162A1F73");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOo;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("eO6370412A242630092E4546173A3031104A333F3D5187");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    int i = this.o00Ooo0;
    paramParcel.writeInt(i);
    localObject = this.o0O00o0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.PhoneInfo
 * JD-Core Version:    0.7.0.1
 */