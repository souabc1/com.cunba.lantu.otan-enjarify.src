package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class CommuterRoute
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public AddressLabel o00OoOoo;
  public Poi o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public Poi o00OoooO;
  public String o0O00o0;
  
  static
  {
    CommuterRoute.1 local1 = new com/qinggan/now/common/CommuterRoute$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public AddressLabel getAddressLabel()
  {
    return this.o00OoOoo;
  }
  
  public String getDistance()
  {
    return this.o00Ooo00;
  }
  
  public Poi getEndPoint()
  {
    return this.o00Ooo0;
  }
  
  public String getOther()
  {
    return this.o00Ooo0O;
  }
  
  public String getRouteType()
  {
    return this.o00Ooo0o;
  }
  
  public String getRoutine()
  {
    return this.o00OooO0;
  }
  
  public String getRoutineDistance()
  {
    return this.o00OooO;
  }
  
  public String getRoutineTime()
  {
    return this.o00OooOO;
  }
  
  public String getSaveTime()
  {
    return this.o00OooOo;
  }
  
  public String getSpendTime()
  {
    return this.o0O00o0;
  }
  
  public Poi getStartPoint()
  {
    return this.o00OoooO;
  }
  
  public void setAddressLabel(AddressLabel paramAddressLabel)
  {
    this.o00OoOoo = paramAddressLabel;
  }
  
  public void setDistance(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setEndPoint(Poi paramPoi)
  {
    this.o00Ooo0 = paramPoi;
  }
  
  public void setOther(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setRouteType(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setRoutine(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setRoutineDistance(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setRoutineTime(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setSaveTime(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setSpendTime(String paramString)
  {
    this.o0O00o0 = paramString;
  }
  
  public void setStartPoint(Poi paramPoi)
  {
    this.o00OoooO = paramPoi;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("Lu361B1A1B0406160E2F230A0C1C623C3511251914392F32321961");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("&L606D2B252C21292C2A417B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("YR7E7322402B2B3D0D332B417A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Ty555A1F130E121E1E22254E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Mp5C51050319231A2B21261F58");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("m\\707D31402E3E0E3C39426B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("`\\707D30362D2D3B39416A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("WN626F312D2E413144450B3937372F81");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11(">U7976293D24264242381A46312D4149454079");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("ss5F54031F0A0C20241E30242922");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("g9151A58505561510B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoooO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o0O00o0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CommuterRoute
 * JD-Core Version:    0.7.0.1
 */