package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class DiagTaskInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public long o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  
  static
  {
    DiagTaskInfo.1 local1 = new com/excelfore/hmiagent/DiagTaskInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public DiagTaskInfo() {}
  
  public DiagTaskInfo(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    long l = paramParcel.readLong();
    this.o00Ooo0 = l;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0O = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public long getDiagnosticTime()
  {
    return this.o00Ooo0;
  }
  
  public String getEndTime()
  {
    return this.o00Ooo0O;
  }
  
  public String getScriptName()
  {
    return this.o00Ooo00;
  }
  
  public String getStartTime()
  {
    return this.o00Ooo0o;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setDiagnosticTime(long paramLong)
  {
    this.o00Ooo0 = paramLong;
  }
  
  public void setEndTime(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setScriptName(String paramString)
  {
    paramString = this.o00Ooo00;
    this.o00Ooo00 = paramString;
  }
  
  public void setStartTime(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("tF02302924162C3B3417312A34494233433F47441B3B40399279");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("Xx54591E141D241C1E13151B26381E232C55");
    localStringBuilder.append(str2);
    long l = this.o00Ooo0;
    localStringBuilder.append(l);
    str2 = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("Et58550903190B062725221B545F");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("lH64692F293021272C357E79");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0O;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    long l = this.o00Ooo0;
    paramParcel.writeLong(l);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.DiagTaskInfo
 * JD-Core Version:    0.7.0.1
 */