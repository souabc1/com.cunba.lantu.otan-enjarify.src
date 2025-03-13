package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Date;
import m54207b69;

public class DiagnosisInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public Date o00OoOoo;
  public ArrayList o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  
  static
  {
    DiagnosisInfo.1 local1 = new com/qinggan/now/common/DiagnosisInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Date getDate()
  {
    return this.o00OoOoo;
  }
  
  public String getDescription()
  {
    return this.o00Ooo00;
  }
  
  public ArrayList getDtcs()
  {
    return this.o00Ooo0;
  }
  
  public int getLevel()
  {
    return this.o00Ooo0O;
  }
  
  public int getScore()
  {
    return this.o00Ooo0o;
  }
  
  public void setDate(Date paramDate)
  {
    this.o00OoOoo = paramDate;
  }
  
  public void setDescription(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setDtcs(ArrayList paramArrayList)
  {
    this.o00Ooo0 = paramArrayList;
  }
  
  public void setLevel(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setScore(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("9d200E07060E101D141F36140D17514D0F1521136C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Y.020F4C4E6152624E6663514C4C20");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("lg4B4816070C1A0861");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("U61A175C5644586012");
    localStringBuilder.append((String)localObject);
    i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    long l;
    if (localObject != null) {
      l = ((Date)localObject).getTime();
    } else {
      l = 0L;
    }
    paramParcel.writeLong(l);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DiagnosisInfo
 * JD-Core Version:    0.7.0.1
 */