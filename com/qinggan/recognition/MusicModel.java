package com.qinggan.recognition;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MusicModel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public String o00OoooO;
  public String o00Ooooo;
  public String o0O00o0;
  
  static
  {
    MusicModel.1 local1 = new com/qinggan/recognition/MusicModel$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public final void OooO0OO(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OooOO = str;
    str = paramParcel.readString();
    this.o00Ooooo = str;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00OooOo = str;
    str = paramParcel.readString();
    this.o00OoooO = str;
    str = paramParcel.readString();
    this.o0O00o0 = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo0O = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAlbumName()
  {
    return this.o00OoOoo;
  }
  
  public String getArtistName()
  {
    return this.o00Ooo00;
  }
  
  public String getArtistType()
  {
    return this.o00Ooo0;
  }
  
  public String getDataPath()
  {
    return this.o00Ooo0O;
  }
  
  public String getEra()
  {
    return this.o00Ooo0o;
  }
  
  public String getGenre()
  {
    return this.o00OooO0;
  }
  
  public String getMood()
  {
    return this.o00OooO;
  }
  
  public String getMusicId()
  {
    return this.o00OooOO;
  }
  
  public String getOrigin()
  {
    return this.o00OooOo;
  }
  
  public String getSourceType()
  {
    return this.o0O00o0;
  }
  
  public String getTempo()
  {
    return this.o00OoooO;
  }
  
  public String getTrackTitle()
  {
    return this.o00Ooooo;
  }
  
  public void setAlbumName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setArtistName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setArtistType(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setDataPath(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setEra(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setGenre(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setMood(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setMusicId(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setOrigin(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setSourceType(String paramString)
  {
    this.o0O00o0 = paramString;
  }
  
  public void setTempo(String paramString)
  {
    this.o00OoooO = paramString;
  }
  
  public void setTrackTitle(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OooOO;
    paramParcel.writeString(str);
    str = this.o00Ooooo;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OooO;
    paramParcel.writeString(str);
    str = this.o00OooOo;
    paramParcel.writeString(str);
    str = this.o00OoooO;
    paramParcel.writeString(str);
    str = this.o0O00o0;
    paramParcel.writeString(str);
    str = this.o00Ooo0O;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.recognition.MusicModel
 * JD-Core Version:    0.7.0.1
 */