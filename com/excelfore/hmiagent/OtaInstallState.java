package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class OtaInstallState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int[] o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  
  static
  {
    OtaInstallState.1 local1 = new com/excelfore/hmiagent/OtaInstallState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OtaInstallState()
  {
    int[] arrayOfInt = new int[32];
    this.o00Ooo0o = arrayOfInt;
  }
  
  public OtaInstallState(Parcel paramParcel)
  {
    Object localObject = new int[32];
    this.o00Ooo0o = ((int[])localObject);
    localObject = paramParcel.readString();
    this.o00Ooo00 = ((String)localObject);
    int i = paramParcel.readInt();
    this.o00OooO = i;
    i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    i = paramParcel.readInt();
    this.o00OooO0 = i;
    localObject = this.o00Ooo0o;
    paramParcel.readIntArray((int[])localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCampaignId()
  {
    return this.o00Ooo00;
  }
  
  public int getECUCount()
  {
    return this.o00OoOoo;
  }
  
  public int getInstalledCount()
  {
    return this.o00Ooo0;
  }
  
  public int getInstallingEcu()
  {
    return this.o00Ooo0O;
  }
  
  public int[] getPolicyMask()
  {
    return this.o00Ooo0o;
  }
  
  public int getProgress()
  {
    return this.o00OooO0;
  }
  
  public int getState()
  {
    return this.o00OooO;
  }
  
  public void setCampaignId(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setECUCount(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setInstalledCount(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setInstallingEcu(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setPolicyMask(int[] paramArrayOfInt)
  {
    this.o00Ooo0o = paramArrayOfInt;
  }
  
  public void setProgress(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setState(int paramInt)
  {
    this.o00OooO = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("JY162E3A133B2F333F3D3E1438443A4A314A49463C4C45544E28567E99");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("U%090658544856461F0A");
    localStringBuilder.append(str2);
    int i = this.o00OooO;
    localStringBuilder.append(i);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    localObject = this.o00Ooo0o;
    paramParcel.writeIntArray((int[])localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.OtaInstallState
 * JD-Core Version:    0.7.0.1
 */