package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class DiagOnlineReq
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    DiagOnlineReq.1 local1 = new com/excelfore/hmiagent/DiagOnlineReq$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public DiagOnlineReq() {}
  
  public DiagOnlineReq(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public String getSender()
  {
    return this.o00Ooo00;
  }
  
  public String getSuggest()
  {
    return this.o00Ooo0;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setSender(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setSuggest(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("uS173B343720424541453F0B412E350E454D4848348289");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo00;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("u{575C0A112021240F174F66");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.DiagOnlineReq
 * JD-Core Version:    0.7.0.1
 */