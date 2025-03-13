package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class SelectSeatResult$PrespBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public SelectSeatResult.PrespBean.PdataBean o00OoOoo;
  public int o00Ooo00;
  
  static
  {
    SelectSeatResult.PrespBean.1 local1 = new com/qinggan/airtrip/bean/SelectSeatResult$PrespBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SelectSeatResult$PrespBean() {}
  
  public SelectSeatResult$PrespBean(Parcel paramParcel)
  {
    Object localObject = SelectSeatResult.PrespBean.PdataBean.class.getClassLoader();
    localObject = (SelectSeatResult.PrespBean.PdataBean)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00OoOoo = ((SelectSeatResult.PrespBean.PdataBean)localObject);
    int i = paramParcel.readInt();
    this.o00Ooo00 = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public SelectSeatResult.PrespBean.PdataBean getPdata()
  {
    return this.o00OoOoo;
  }
  
  public int getPerrcode()
  {
    return this.o00Ooo00;
  }
  
  public void setPdata(SelectSeatResult.PrespBean.PdataBean paramPdataBean)
  {
    this.o00OoOoo = paramPdataBean;
  }
  
  public void setPerrcode(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("nY092C3E2D2D20423F3F2B3348443A4673");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("^<101D4E5C5253655A60620B");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SelectSeatResult.PrespBean.PdataBean localPdataBean = this.o00OoOoo;
    paramParcel.writeParcelable(localPdataBean, paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SelectSeatResult.PrespBean
 * JD-Core Version:    0.7.0.1
 */