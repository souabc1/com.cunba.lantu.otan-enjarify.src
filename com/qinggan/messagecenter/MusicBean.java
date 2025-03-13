package com.qinggan.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class MusicBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  
  static
  {
    MusicBean.1 local1 = new com/qinggan/messagecenter/MusicBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getMusicAlbum()
  {
    return this.o00OoOoo;
  }
  
  public String getMusicArtist()
  {
    return this.o00Ooo00;
  }
  
  public String getMusicCover()
  {
    return this.o00Ooo0;
  }
  
  public String getMusicTitle()
  {
    return this.o00Ooo0O;
  }
  
  public void setMusicAlbum(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setMusicArtist(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setMusicCover(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setMusicTitle(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("EE0831382F2A0C262B3347323B423934203C423B338C77");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo0O;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("g519165A434A615C7B61604A63141F");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("c[777C38312C373E2131383C333B738A");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo00;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str2 = m54207b69.F54207b69_11("|G6B682C3538332A0B303A2C40866D");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.messagecenter.MusicBean
 * JD-Core Version:    0.7.0.1
 */