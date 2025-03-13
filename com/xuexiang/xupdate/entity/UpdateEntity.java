package com.xuexiang.xupdate.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.xuexiang.xupdate.proxy.IUpdateHttpService;
import m54207b69;

public class UpdateEntity
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  public boolean o00Ooo0;
  public boolean o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public DownloadEntity o00OooO;
  public String o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public IUpdateHttpService o0O00o0;
  
  static
  {
    UpdateEntity.1 local1 = new com/xuexiang/xupdate/entity/UpdateEntity$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public UpdateEntity()
  {
    Object localObject = m54207b69.F54207b69_11("pI3C28242A2A432D1D473545452C3335");
    this.o00Ooo0o = ((String)localObject);
    localObject = new com/xuexiang/xupdate/entity/DownloadEntity;
    ((DownloadEntity)localObject).<init>();
    this.o00OooO = ((DownloadEntity)localObject);
    this.o00OooOo = true;
  }
  
  public UpdateEntity(Parcel paramParcel)
  {
    int i = paramParcel.readByte();
    int j = 1;
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00OoOoo = i;
    i = paramParcel.readByte();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00Ooo00 = i;
    i = paramParcel.readByte();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    Object localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OooO0 = ((String)localObject);
    localObject = DownloadEntity.class.getClassLoader();
    localObject = (DownloadEntity)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00OooO = ((DownloadEntity)localObject);
    i = paramParcel.readByte();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00OooOO = i;
    int k = paramParcel.readByte();
    if (k == 0) {
      j = 0;
    }
    this.o00OooOo = j;
  }
  
  public UpdateEntity OooO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (UpdateEntity)m54207b69.F54207b69_09(6667, arrayOfObject);
  }
  
  public UpdateEntity OooO00o(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (UpdateEntity)m54207b69.F54207b69_09(6668, arrayOfObject);
  }
  
  public UpdateEntity OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (UpdateEntity)m54207b69.F54207b69_09(6669, arrayOfObject);
  }
  
  public UpdateEntity OooO0Oo(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (UpdateEntity)m54207b69.F54207b69_09(6670, arrayOfObject);
  }
  
  public UpdateEntity OooO0o(IUpdateHttpService paramIUpdateHttpService)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramIUpdateHttpService;
    return (UpdateEntity)m54207b69.F54207b69_09(6671, arrayOfObject);
  }
  
  public UpdateEntity OooO0o0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (UpdateEntity)m54207b69.F54207b69_09(6672, arrayOfObject);
  }
  
  public UpdateEntity OooO0oO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (UpdateEntity)m54207b69.F54207b69_09(6673, arrayOfObject);
  }
  
  public UpdateEntity OooO0oo(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (UpdateEntity)m54207b69.F54207b69_09(6674, arrayOfObject);
  }
  
  public UpdateEntity OooOO0(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (UpdateEntity)m54207b69.F54207b69_09(6675, arrayOfObject);
  }
  
  public UpdateEntity OooOO0O(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (UpdateEntity)m54207b69.F54207b69_09(6676, arrayOfObject);
  }
  
  public UpdateEntity OooOO0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (UpdateEntity)m54207b69.F54207b69_09(6677, arrayOfObject);
  }
  
  public UpdateEntity OooOOO0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (UpdateEntity)m54207b69.F54207b69_09(6678, arrayOfObject);
  }
  
  public int describeContents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6679, arrayOfObject);
  }
  
  public String getApkCacheDir()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6680, arrayOfObject);
  }
  
  public DownloadEntity getDownLoadEntity()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (DownloadEntity)m54207b69.F54207b69_09(6681, arrayOfObject);
  }
  
  public String getDownloadUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6682, arrayOfObject);
  }
  
  public IUpdateHttpService getIUpdateHttpService()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (IUpdateHttpService)m54207b69.F54207b69_09(6683, arrayOfObject);
  }
  
  public String getMd5()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6684, arrayOfObject);
  }
  
  public long getSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(6685, arrayOfObject);
  }
  
  public String getUpdateContent()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6686, arrayOfObject);
  }
  
  public int getVersionCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6687, arrayOfObject);
  }
  
  public String getVersionName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6688, arrayOfObject);
  }
  
  public boolean isAutoInstall()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6689, arrayOfObject);
  }
  
  public boolean isForce()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6690, arrayOfObject);
  }
  
  public boolean isHasUpdate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6691, arrayOfObject);
  }
  
  public boolean isIgnorable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6692, arrayOfObject);
  }
  
  public boolean isSilent()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6693, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6694, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6695, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.entity.UpdateEntity
 * JD-Core Version:    0.7.0.1
 */