package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public final class NaviInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public CalcState o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public int o00Ooo0o;
  public GuideState o00OooO;
  public boolean o00OooO0 = true;
  public int o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public String o00o00;
  public String o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public TurnByTurnIconInfo o0O00o0;
  public int oo00oO;
  
  static
  {
    NaviInfo.1 local1 = new com/qinggan/cluster/info/NaviInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public CalcState getCalcState()
  {
    return this.o00OoOoo;
  }
  
  public String getCurrentRoadName()
  {
    return this.o00Ooo00;
  }
  
  public int getDestDistance()
  {
    return this.o00Ooo0;
  }
  
  public String getDestName()
  {
    return this.o00Ooo0O;
  }
  
  public int getDirectionId()
  {
    return this.o00Ooo0o;
  }
  
  public GuideState getGuideState()
  {
    return this.o00OooO;
  }
  
  public int getHeading()
  {
    return this.o00OooOO;
  }
  
  public int getNextDistance()
  {
    return this.o00OoooO;
  }
  
  public int getParam()
  {
    return this.o00Ooooo;
  }
  
  public int getRemainTime()
  {
    return this.o00o0000;
  }
  
  public String getRoundAboutAngle()
  {
    return this.o00o000;
  }
  
  public int getRoundAboutNum()
  {
    return this.o00o000O;
  }
  
  public int getRoundAboutOut()
  {
    return this.o00o000o;
  }
  
  public int getTbtIconId()
  {
    return this.oo00oO;
  }
  
  public TurnByTurnIconInfo getTurnByTurnInfo()
  {
    return this.o0O00o0;
  }
  
  public String getTurnRoadName()
  {
    return this.o00o00;
  }
  
  public boolean isDisplay()
  {
    return this.o00OooO0;
  }
  
  public void setCalcState(CalcState paramCalcState)
  {
    this.o00OoOoo = paramCalcState;
  }
  
  public void setCurrentRoadName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setDestDistance(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setDestName(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setDirectionId(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setDisplay(boolean paramBoolean)
  {
    this.o00OooO0 = paramBoolean;
  }
  
  public void setGuideState(GuideState paramGuideState)
  {
    this.o00OooO = paramGuideState;
  }
  
  public void setHeading(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setNextDistance(int paramInt)
  {
    this.o00OoooO = paramInt;
  }
  
  public void setParam(int paramInt)
  {
    this.o00Ooooo = paramInt;
  }
  
  public void setRemainTime(int paramInt)
  {
    this.o00o0000 = paramInt;
  }
  
  public void setRoundAboutAngle(String paramString)
  {
    this.o00o000 = paramString;
  }
  
  public void setRoundAboutNum(int paramInt)
  {
    this.o00o000O = paramInt;
  }
  
  public void setRoundAboutOut(int paramInt)
  {
    this.o00o000o = paramInt;
  }
  
  public void setStraight(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setTbtIconId(int paramInt)
  {
    this.oo00oO = paramInt;
  }
  
  public void setTurnByTurnInfo(TurnByTurnIconInfo paramTurnByTurnIconInfo)
  {
    this.o0O00o0 = paramTurnByTurnIconInfo;
  }
  
  public void setTurnRoadName(String paramString)
  {
    this.o00o00 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("NV18382242233D3640353A2D4A3E4013314733457E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("\\h44490D0C0810412311251760");
    localStringBuilder.append((String)localObject);
    localObject = getCalcState();
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("BR7E73383E243C372D43464626427C");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("WX747932403D41373D476E");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("+O63702D2D4040112D4444382C383780");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("8^727F323E2A2F203E3533493B494871");
    localStringBuilder.append((String)localObject);
    i = this.o00OoooO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("m=111E515B54615A5A715D5A630C");
    localStringBuilder.append((String)localObject);
    i = this.o00o0000;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("5P7C71223426364374");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooooo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("=4181559444A4B5761486F65605C876368611A25");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("-n424F1C1E2005420817132A1A0F186158");
    localStringBuilder.append(str);
    str = this.o00o00;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("8-010E4B47626247535C19");
    localStringBuilder.append(str);
    boolean bool = this.o00OooO0;
    localStringBuilder.append(bool);
    str = m54207b69.F54207b69_11("$c4F44130F1A120D29091520222E1A121E166F56");
    localStringBuilder.append(str);
    str = this.o00o000;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("d31F14435F4A625D795965505289536C1D");
    localStringBuilder.append((String)localObject);
    int j = this.o00o000O;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("*\\707D30362D373E24463C33331F363670");
    localStringBuilder.append((String)localObject);
    j = this.o00o000o;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("Ja4D420E381818152A203E1E1E1B351D161E6D");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("U]717E3B3B322E194338416A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("s`4C410B16371918081110121F69");
    localStringBuilder.append((String)localObject);
    j = this.o00OooOo;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("co43501D101F2B1207092F155D");
    localStringBuilder.append((String)localObject);
    j = this.oo00oO;
    localStringBuilder.append(j);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o0O00o0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o0000;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooooo;
    paramParcel.writeInt(paramInt);
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00o00;
    paramParcel.writeString(str);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    str = this.o00o000;
    paramParcel.writeString(str);
    paramInt = this.o00o000O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000o;
    paramParcel.writeInt(paramInt);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.oo00oO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.NaviInfo
 * JD-Core Version:    0.7.0.1
 */