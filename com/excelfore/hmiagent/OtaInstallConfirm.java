package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class OtaInstallConfirm
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    OtaInstallConfirm.1 local1 = new com/excelfore/hmiagent/OtaInstallConfirm$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OtaInstallConfirm() {}
  
  public OtaInstallConfirm(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    int j = paramParcel.readInt();
    this.o00Ooo0 = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCampaignId()
  {
    return this.o00OoOoo;
  }
  
  public int getHour()
  {
    return this.o00Ooo00;
  }
  
  public int getMinute()
  {
    return this.o00Ooo0;
  }
  
  public int getState()
  {
    return this.o00Ooo0O;
  }
  
  public void setCampaignId(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setHour(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setMinute(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.OtaInstallConfirm
 * JD-Core Version:    0.7.0.1
 */