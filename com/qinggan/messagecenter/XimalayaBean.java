package com.qinggan.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class XimalayaBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  
  static
  {
    XimalayaBean.1 local1 = new com/qinggan/messagecenter/XimalayaBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAlbum()
  {
    return this.o00OoOoo;
  }
  
  public String getCover()
  {
    return this.o00Ooo00;
  }
  
  public String getItem()
  {
    return this.o00Ooo0;
  }
  
  public void setAlbum(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCover(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setItem(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("y%7D4D4A474D49624B6F494E566A51575660592A15");
    localStringBuilder.append(str1);
    str1 = this.o00OoOoo;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("f/0310485E4E47180F");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("5J666B2B2840343E7E75");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.messagecenter.XimalayaBean
 * JD-Core Version:    0.7.0.1
 */