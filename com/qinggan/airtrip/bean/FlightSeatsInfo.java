package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import m54207b69;

public class FlightSeatsInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public S2cCheckinTravelInfo o00OoOoo;
  public String o00Ooo0;
  public long o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public String o00OooO;
  public S2cPassengerInfo o00OooO0;
  public List o00OooOO;
  public String o00OooOo;
  
  static
  {
    FlightSeatsInfo.1 local1 = new com/qinggan/airtrip/bean/FlightSeatsInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FlightSeatsInfo() {}
  
  public FlightSeatsInfo(Parcel paramParcel)
  {
    Object localObject = SeatRoom.CREATOR;
    localObject = paramParcel.createTypedArrayList((Parcelable.Creator)localObject);
    this.o00OooOO = ((List)localObject);
    localObject = S2cPassengerInfo.class.getClassLoader();
    localObject = (S2cPassengerInfo)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00OooO0 = ((S2cPassengerInfo)localObject);
    localObject = S2cCheckinTravelInfo.class.getClassLoader();
    localObject = (S2cCheckinTravelInfo)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00OoOoo = ((S2cCheckinTravelInfo)localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
    localObject = paramParcel.readString();
    this.o00OooO = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo0o = i;
    localObject = paramParcel.readString();
    this.o00OooOo = ((String)localObject);
    long l = paramParcel.readLong();
    this.o00Ooo00 = l;
    paramParcel = paramParcel.readString();
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public S2cCheckinTravelInfo getCheckinTravelInfo()
  {
    return this.o00OoOoo;
  }
  
  public String getErrMsg()
  {
    return this.o00Ooo0;
  }
  
  public long getErrorCode()
  {
    return this.o00Ooo00;
  }
  
  public String getErrorMsg()
  {
    return this.o00Ooo0;
  }
  
  public int getIsAllowedChooseSeat()
  {
    return this.o00Ooo0O;
  }
  
  public int getIsNeedVerifyCode()
  {
    return this.o00Ooo0o;
  }
  
  public S2cPassengerInfo getPassengerInfoForSDK()
  {
    return this.o00OooO0;
  }
  
  public String getReasonOfNotAllowedChoose()
  {
    return this.o00OooO;
  }
  
  public List getSeatRooms()
  {
    return this.o00OooOO;
  }
  
  public String getSessionKey()
  {
    return this.o00OooOo;
  }
  
  public boolean isSuccessful()
  {
    long l1 = this.o00Ooo00;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setCheckinTravelInfo(S2cCheckinTravelInfo paramS2cCheckinTravelInfo)
  {
    this.o00OoOoo = paramS2cCheckinTravelInfo;
  }
  
  public void setErrorCode(long paramLong)
  {
    this.o00Ooo00 = paramLong;
  }
  
  public void setErrorMsg(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setIsAllowedChooseSeat(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setIsNeedVerifyCode(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setPassengerInfoForSDK(S2cPassengerInfo paramS2cPassengerInfo)
  {
    this.o00OooO0 = paramS2cPassengerInfo;
  }
  
  public void setReasonOfNotAllowedChoose(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setSeatRooms(List paramList)
  {
    this.o00OooOO = paramList;
  }
  
  public void setSessionKey(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("BM0B22262D293E242F3442480F2F3830454E393E4C333738375689");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("6+070C5D4D5C5D544C5457636D515A527C546A8A82742B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("$&0A074751474A5356507B5E525C50587E58515B2E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("`81419534E7D595A5E576666865C64655A6D7C6F6C601A");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("v11D1245575447646686608969517D6B6C6E576668866E74755A6D2631");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("7v5A5721083C181919281C0E2A1C1C432822245D");
    localStringBuilder.append(str);
    int j = this.o00Ooo0o;
    localStringBuilder.append(j);
    str = m54207b69.F54207b69_11("XK676C3A313C3D282B2D09383D8279");
    localStringBuilder.append(str);
    str = this.o00OooOo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("Q_73803C30313533233844446D");
    localStringBuilder.append(str);
    long l = this.o00Ooo00;
    localStringBuilder.append(l);
    str = m54207b69.F54207b69_11("+-010E4A626347656766531A15");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooOO;
    paramParcel.writeTypedList((List)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    String str = this.o00OooO;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    long l = this.o00Ooo00;
    paramParcel.writeLong(l);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.FlightSeatsInfo
 * JD-Core Version:    0.7.0.1
 */