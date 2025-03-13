package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class SelectSeatResult$PrespBean$PdataBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean o00Ooo0O;
  public int o00Ooo0o;
  public String o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public List o00Ooooo;
  public int o0O00o0;
  
  static
  {
    SelectSeatResult.PrespBean.PdataBean.1 local1 = new com/qinggan/airtrip/bean/SelectSeatResult$PrespBean$PdataBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SelectSeatResult$PrespBean$PdataBean() {}
  
  public SelectSeatResult$PrespBean$PdataBean(Parcel paramParcel)
  {
    Object localObject = SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean.class.getClassLoader();
    localObject = (SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo0O = ((SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean)localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0o = i;
    i = paramParcel.readInt();
    this.o0O00o0 = i;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00OooOo = i;
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo00 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00OooOO = i;
    i = paramParcel.readInt();
    this.o00OoooO = i;
    i = paramParcel.readInt();
    this.o00OooO0 = i;
    localObject = paramParcel.readString();
    this.o00OooO = ((String)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00Ooooo = ((List)localObject);
    ClassLoader localClassLoader = SelectSeatResult.PrespBean.PdataBean.PassengerInfoForSDKsBean.class.getClassLoader();
    paramParcel.readList((List)localObject, localClassLoader);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAttention()
  {
    return this.o00OoOoo;
  }
  
  public String getBandDesc()
  {
    return this.o00Ooo00;
  }
  
  public int getBoardingPassAvailable()
  {
    return this.o00Ooo0;
  }
  
  public SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean getCheckinTravelInfo()
  {
    return this.o00Ooo0O;
  }
  
  public int getCode()
  {
    return this.o00Ooo0o;
  }
  
  public int getErrorCode()
  {
    return this.o00OooO0;
  }
  
  public String getErrorMsg()
  {
    return this.o00OooO;
  }
  
  public int getIsAllowedChooseSeat()
  {
    return this.o00OooOO;
  }
  
  public int getIsAuthCodeCorrect()
  {
    return this.o00OooOo;
  }
  
  public int getIsNeedAddFavorite()
  {
    return this.o0O00o0;
  }
  
  public int getIsNeedVerifyCode()
  {
    return this.o00OoooO;
  }
  
  public List getPassengerInfoForSDKs()
  {
    return this.o00Ooooo;
  }
  
  public void setAttention(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setBandDesc(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setBoardingPassAvailable(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setCheckinTravelInfo(SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean paramCheckinTravelInfoBean)
  {
    this.o00Ooo0O = paramCheckinTravelInfoBean;
  }
  
  public void setCode(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setErrorCode(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setErrorMsg(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setIsAllowedChooseSeat(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setIsAuthCodeCorrect(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setIsNeedAddFavorite(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setIsNeedVerifyCode(int paramInt)
  {
    this.o00OoooO = paramInt;
  }
  
  public void setPassengerInfoForSDKs(List paramList)
  {
    this.o00Ooooo = paramList;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("a>6E5B614D63816166584E6761676A6366607B5E725C70688E68716B1E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("1P7C713542383A73");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("`@6C612B36122A2B2B092D2E112D433D4139453790");
    localStringBuilder.append((String)localObject);
    i = this.o0O00o0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("K'0B08474B4A5A49555149815160617460565F5D5959605831");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("2]717E3631202D2F3C263B43432A3F3D3E484F3B73");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("2g4B48081617070F1A161113654C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("oG6B6827292D2809293C2D846B");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("`81419534E7D595A5E576666865C64655A6D7C6F6C601A");
    localStringBuilder.append(str);
    int j = this.o00OooOO;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("7v5A5721083C181919281C0E2A1C1C432822245D");
    localStringBuilder.append(str);
    j = this.o00OoooO;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("Q_73803C30313533233844446D");
    localStringBuilder.append(str);
    j = this.o00OooO0;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("+-010E4A626347656766531A15");
    localStringBuilder.append(str);
    str = this.o00OooO;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("E$080556485B5C47514B4A6078564F59715B678973836C2F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooooo;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SelectSeatResult.PrespBean.PdataBean.CheckinTravelInfoBean localCheckinTravelInfoBean = this.o00Ooo0O;
    paramParcel.writeParcelable(localCheckinTravelInfoBean, paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooooo;
    paramParcel.writeList((List)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SelectSeatResult.PrespBean.PdataBean
 * JD-Core Version:    0.7.0.1
 */