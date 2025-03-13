package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import m54207b69;

public class SelectSeatResult
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public SelectSeatResult.PrespBean o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  
  static
  {
    SelectSeatResult.1 local1 = new com/qinggan/airtrip/bean/SelectSeatResult$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SelectSeatResult() {}
  
  public SelectSeatResult(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo00 = ((String)localObject);
    localObject = SelectSeatResult.PrespBean.class.getClassLoader();
    paramParcel = (SelectSeatResult.PrespBean)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getErrMsg()
  {
    Object localObject = this.o00Ooo0;
    String str = "";
    if (localObject == null) {
      return str;
    }
    localObject = ((SelectSeatResult.PrespBean)localObject).getPdata();
    if (localObject == null) {
      return str;
    }
    localObject = this.o00Ooo0.getPdata().getPassengerInfoForSDKs();
    if (localObject == null) {
      return str;
    }
    localObject = this.o00Ooo0.getPdata().getPassengerInfoForSDKs();
    int i = ((List)localObject).size();
    if (i == 0) {
      return str;
    }
    return ((SelectSeatResult.PrespBean.PdataBean.PassengerInfoForSDKsBean)this.o00Ooo0.getPdata().getPassengerInfoForSDKs().get(0)).getResultMsg();
  }
  
  public String getPkey()
  {
    return this.o00OoOoo;
  }
  
  public String getPpid()
  {
    return this.o00Ooo00;
  }
  
  public SelectSeatResult.PrespBean getPresp()
  {
    return this.o00Ooo0;
  }
  
  public int getPret()
  {
    return this.o00Ooo0O;
  }
  
  public String getPver()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isSelectSuccess()
  {
    Object localObject = this.o00Ooo0;
    boolean bool = false;
    if (localObject == null) {
      return false;
    }
    localObject = ((SelectSeatResult.PrespBean)localObject).getPdata();
    if (localObject == null) {
      return false;
    }
    localObject = this.o00Ooo0.getPdata().getPassengerInfoForSDKs();
    if (localObject == null) {
      return false;
    }
    localObject = this.o00Ooo0.getPdata().getPassengerInfoForSDKs();
    int i = ((List)localObject).size();
    if (i == 0) {
      return false;
    }
    localObject = this.o00Ooo0.getPdata();
    i = ((SelectSeatResult.PrespBean.PdataBean)localObject).getErrorCode();
    if (i == 0)
    {
      localObject = (SelectSeatResult.PrespBean.PdataBean.PassengerInfoForSDKsBean)this.o00Ooo0.getPdata().getPassengerInfoForSDKs().get(0);
      i = ((SelectSeatResult.PrespBean.PdataBean.PassengerInfoForSDKsBean)localObject).getResultCode();
      if (i == 0)
      {
        localObject = this.o00Ooo0.getPdata();
        i = ((SelectSeatResult.PrespBean.PdataBean)localObject).getCode();
        if (i == 0) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  public void setPkey(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPpid(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPresp(SelectSeatResult.PrespBean paramPrespBean)
  {
    this.o00Ooo0 = paramPrespBean;
  }
  
  public void setPret(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setPver(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("oB1128302A253B172E2B3F1A323D443C454943463A44947B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("*Y757A2B2E40326A");
    localStringBuilder.append(str);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("hH64693A2631367B76");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11("7i454A1B1C04125A55");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("Lg4B48191806191D61");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    int i = this.o00Ooo0O;
    paramParcel.writeInt(i);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SelectSeatResult
 * JD-Core Version:    0.7.0.1
 */