package com.qinggan.navi;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public final class NaviInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o = true;
  public int o00OooO;
  public GuideState o00OooO0;
  public int o00OooOO;
  public String o00OooOo;
  public int o00OoooO;
  public TurnByTurnIconInfo o00Ooooo;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public String o00o000o;
  public int o0O00o0;
  
  static
  {
    NaviInfo.1 local1 = new com/qinggan/navi/NaviInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    paramObject = (NaviInfo)paramObject;
    GuideState localGuideState1 = this.o00OooO0;
    GuideState localGuideState2 = paramObject.getGuideState();
    if (localGuideState1 == localGuideState2)
    {
      int i = this.o00Ooo0O;
      int j = paramObject.getDirectionId();
      if (i == j)
      {
        i = this.o00OooO;
        j = paramObject.getHeading();
        if (i == j)
        {
          i = this.o00Ooo00;
          j = paramObject.getDestDistance();
          if (i == j)
          {
            i = this.o00o0000;
            j = paramObject.getNextDistance();
            if (i == j)
            {
              i = this.o00o000O;
              int k = paramObject.getRemainTime();
              if (i == k) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public String getCurrentRoadName()
  {
    return this.o00OoOoo;
  }
  
  public int getDestDistance()
  {
    return this.o00Ooo00;
  }
  
  public String getDestName()
  {
    return this.o00Ooo0;
  }
  
  public int getDirectionId()
  {
    return this.o00Ooo0O;
  }
  
  public GuideState getGuideState()
  {
    return this.o00OooO0;
  }
  
  public int getHeading()
  {
    return this.o00OooO;
  }
  
  public int getNextDistance()
  {
    return this.o00o0000;
  }
  
  public int getParam()
  {
    return this.o00o000;
  }
  
  public int getRemainTime()
  {
    return this.o00o000O;
  }
  
  public String getRoundAboutAngle()
  {
    return this.o00OooOo;
  }
  
  public int getRoundAboutNum()
  {
    return this.o0O00o0;
  }
  
  public int getRoundAboutOut()
  {
    return this.o00OoooO;
  }
  
  public TurnByTurnIconInfo getTurnByTurnInfo()
  {
    return this.o00Ooooo;
  }
  
  public String getTurnRoadName()
  {
    return this.o00o000o;
  }
  
  public boolean isDisplay()
  {
    return this.o00Ooo0o;
  }
  
  public void setCurrentRoadName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDestDistance(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setDestName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setDirectionId(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setDisplay(boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
  }
  
  public void setGuideState(GuideState paramGuideState)
  {
    this.o00OooO0 = paramGuideState;
  }
  
  public void setHeading(int paramInt)
  {
    this.o00OooO = paramInt;
  }
  
  public void setNextDistance(int paramInt)
  {
    this.o00o0000 = paramInt;
  }
  
  public void setParam(int paramInt)
  {
    this.o00o000 = paramInt;
  }
  
  public void setRemainTime(int paramInt)
  {
    this.o00o000O = paramInt;
  }
  
  public void setRoundAboutAngle(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setRoundAboutNum(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setRoundAboutOut(int paramInt)
  {
    this.o00OoooO = paramInt;
  }
  
  public void setTurnByTurnInfo(TurnByTurnIconInfo paramTurnByTurnIconInfo)
  {
    this.o00Ooooo = paramTurnByTurnIconInfo;
  }
  
  public void setTurnRoadName(String paramString)
  {
    this.o00o000o = paramString;
  }
  
  public void setstraight(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("NV18382242233D3640353A2D4A3E4013314733457E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("BR7E73383E243C372D43464626427C");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("WX747932403D41373D476E");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("+O63702D2D4040112D4444382C383780");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo00;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("8^727F323E2A2F203E3533493B494871");
    localStringBuilder.append((String)localObject);
    i = this.o00o0000;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("m=111E515B54615A5A715D5A630C");
    localStringBuilder.append((String)localObject);
    i = this.o00o000O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("5P7C71223426364374");
    localStringBuilder.append((String)localObject);
    i = this.o00o000;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("=4181559444A4B5761486F65605C876368611A25");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("-n424F1C1E2005420817132A1A0F186158");
    localStringBuilder.append(str);
    str = this.o00o000o;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("8-010E4B47626247535C19");
    localStringBuilder.append(str);
    boolean bool = this.o00Ooo0o;
    localStringBuilder.append(bool);
    str = m54207b69.F54207b69_11(">'0B084C784C574F4A6E4E525D5F73574F5B532C13");
    localStringBuilder.append(str);
    str = this.o00OooOo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("],000D4381475E484F75574D64646F675021");
    localStringBuilder.append((String)localObject);
    int j = this.o0O00o0;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("2?13205470544F576286665A55577D585A12");
    localStringBuilder.append((String)localObject);
    j = this.o00OoooO;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("Ja4D420E381818152A203E1E1E1B351D161E6D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooooo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("U]717E3B3B322E194338416A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("eP7C713B2613282A2939424143307A");
    localStringBuilder.append((String)localObject);
    j = this.o00OooOO;
    localStringBuilder.append(j);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooO0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooooo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o0000;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000;
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00o000o;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoooO;
    paramParcel.writeInt(paramInt);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviInfo
 * JD-Core Version:    0.7.0.1
 */