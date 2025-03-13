package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class OtaUpdateReq
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public long o00OooO;
  public String o00OooO0;
  
  static
  {
    OtaUpdateReq.1 local1 = new com/excelfore/hmiagent/OtaUpdateReq$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OtaUpdateReq() {}
  
  public OtaUpdateReq(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    long l = paramParcel.readLong();
    this.o00OooO = l;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    int i = paramParcel.readInt();
    this.o00Ooo0o = i;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    int j = paramParcel.readInt();
    this.o00Ooo0O = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCampaignId()
  {
    return this.o00OoOoo;
  }
  
  public String getContent()
  {
    return this.o00Ooo00;
  }
  
  public int getHour()
  {
    return this.o00Ooo0;
  }
  
  public int getMinute()
  {
    return this.o00Ooo0O;
  }
  
  public int getMode()
  {
    return this.o00Ooo0o;
  }
  
  public String getPackageName()
  {
    return this.o00OooO0;
  }
  
  public long getUpdateTime()
  {
    return this.o00OooO;
  }
  
  public void setCampaignId(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setContent(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setHour(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setMinute(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setMode(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setPackageName(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setUpdateTime(long paramLong)
  {
    this.o00OooO = paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("7'685448755B484C5A4A7E4C6168515459675760535D83593118");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("mk474C1D0D0C051013162E14111A635A");
    localStringBuilder.append(str2);
    str2 = this.o00OooO0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("$P7C71272338362A3C0C42474079");
    localStringBuilder.append(str2);
    long l = this.o00OooO;
    localStringBuilder.append(l);
    str2 = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("S418155B5E54560F1A");
    localStringBuilder.append(str2);
    int i = this.o00Ooo0o;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    long l = this.o00OooO;
    paramParcel.writeLong(l);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.OtaUpdateReq
 * JD-Core Version:    0.7.0.1
 */