package com.xuexiang.xupdate.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.File;
import m54207b69;

public class DownloadEntity
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public long o00Ooo0O;
  public boolean o00Ooo0o;
  
  static
  {
    DownloadEntity.1 local1 = new com/xuexiang/xupdate/entity/DownloadEntity$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public DownloadEntity() {}
  
  public DownloadEntity(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    long l = paramParcel.readLong();
    this.o00Ooo0O = l;
    int i = paramParcel.readByte();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramParcel = null;
    }
    this.o00Ooo0o = i;
  }
  
  public boolean OooO00o(File paramFile)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFile;
    return m54207b69.F54207b69_01(6631, arrayOfObject);
  }
  
  public DownloadEntity OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (DownloadEntity)m54207b69.F54207b69_09(6632, arrayOfObject);
  }
  
  public DownloadEntity OooO0Oo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (DownloadEntity)m54207b69.F54207b69_09(6633, arrayOfObject);
  }
  
  public DownloadEntity OooO0o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (DownloadEntity)m54207b69.F54207b69_09(6634, arrayOfObject);
  }
  
  public DownloadEntity OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (DownloadEntity)m54207b69.F54207b69_09(6635, arrayOfObject);
  }
  
  public DownloadEntity OooO0oO(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (DownloadEntity)m54207b69.F54207b69_09(6636, arrayOfObject);
  }
  
  public int describeContents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6637, arrayOfObject);
  }
  
  public String getCacheDir()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6638, arrayOfObject);
  }
  
  public String getDownloadUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6639, arrayOfObject);
  }
  
  public String getMd5()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6640, arrayOfObject);
  }
  
  public long getSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(6641, arrayOfObject);
  }
  
  public boolean isShowNotification()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6642, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6643, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6644, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.entity.DownloadEntity
 * JD-Core Version:    0.7.0.1
 */