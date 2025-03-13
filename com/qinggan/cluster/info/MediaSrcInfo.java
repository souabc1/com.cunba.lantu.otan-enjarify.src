package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public final class MediaSrcInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public float o00Ooo0;
  public String o00Ooo00;
  public MediaState o00Ooo0O;
  public MediaType o00Ooo0o;
  public MediaSrcType o00OooO;
  public String o00OooO0;
  
  static
  {
    MediaSrcInfo.1 local1 = new com/qinggan/cluster/info/MediaSrcInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAlbumName()
  {
    return this.o00OoOoo;
  }
  
  public String getArtist()
  {
    return this.o00Ooo00;
  }
  
  public float getFrequency()
  {
    return this.o00Ooo0;
  }
  
  public MediaState getMediaState()
  {
    return this.o00Ooo0O;
  }
  
  public MediaType getMediaType()
  {
    return this.o00Ooo0o;
  }
  
  public String getSongName()
  {
    return this.o00OooO0;
  }
  
  public MediaSrcType getSrcType()
  {
    return this.o00OooO;
  }
  
  public void setAlbumName(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setArtist(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setFrequency(float paramFloat)
  {
    this.o00Ooo0 = paramFloat;
  }
  
  public void setMediaState(MediaState paramMediaState)
  {
    this.o00Ooo0O = paramMediaState;
  }
  
  public void setMediaType(MediaType paramMediaType)
  {
    this.o00Ooo0o = paramMediaType;
  }
  
  public void setSongName(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setSrcType(MediaSrcType paramMediaSrcType)
  {
    this.o00OooO = paramMediaSrcType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("CE0821232F281B3D2D14342D354A434535214D47338C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("8(0409475050464F8359615720");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("BE6966253A24393627332F4683");
    localStringBuilder.append((String)localObject);
    float f = this.o00Ooo0;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("Vu59561A1315211A2D091D0B1B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("~'0B554A4C446E4C514A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("&e49051914101B17");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("dT78363A39253E203C413A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OooO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0o;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    float f = this.o00Ooo0;
    paramParcel.writeFloat(f);
    localObject = this.o00Ooo0O;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaSrcInfo
 * JD-Core Version:    0.7.0.1
 */