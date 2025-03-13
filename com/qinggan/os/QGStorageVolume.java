package com.qinggan.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class QGStorageVolume
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final String o00OoOoo;
  public final String o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public final boolean o00Ooo0o;
  
  static
  {
    QGStorageVolume.1 local1 = new com/qinggan/os/QGStorageVolume$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public QGStorageVolume(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo0O = str;
    int i = paramParcel.readInt();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00Ooo0o = i;
    str = paramParcel.readString();
    this.o00OoOoo = str;
    paramParcel = paramParcel.readString();
    this.o00Ooo00 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof QGStorageVolume;
    if (bool)
    {
      String str = this.o00Ooo0O;
      if (str != null)
      {
        paramObject = ((QGStorageVolume)paramObject).o00Ooo0O;
        return str.equals(paramObject);
      }
    }
    return false;
  }
  
  public int getFatVolumeId()
  {
    String str1 = this.o00OoOoo;
    int i = -1;
    if (str1 != null)
    {
      int j = str1.length();
      int k = 9;
      if (j == k) {
        try
        {
          str1 = this.o00OoOoo;
          String str2 = "-";
          String str3 = "";
          str1 = str1.replace(str2, str3);
          k = 16;
          return (int)Long.parseLong(str1, k);
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
    }
    return i;
  }
  
  public String getHostId()
  {
    return this.o00Ooo00;
  }
  
  public String getId()
  {
    return this.o00Ooo0;
  }
  
  public String getPath()
  {
    return this.o00Ooo0O;
  }
  
  public String getUuid()
  {
    return this.o00OoOoo;
  }
  
  public int hashCode()
  {
    return this.o00Ooo0O.hashCode();
  }
  
  public boolean isRemovable()
  {
    return this.o00Ooo0o;
  }
  
  public void setHostId(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPath(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("rj3B2E3B21091D111417450F112B141D2012162B31372366");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("KX74792C40393C3440423D476D");
    localStringBuilder.append(str);
    boolean bool = this.o00Ooo0o;
    localStringBuilder.append(bool);
    str = m54207b69.F54207b69_11("Ak474C4041263457");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("7A6D623323392E81");
    localStringBuilder.append(str);
    str = this.o00Ooo0O;
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo0O.toString();
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.QGStorageVolume
 * JD-Core Version:    0.7.0.1
 */