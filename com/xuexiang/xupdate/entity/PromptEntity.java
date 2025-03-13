package com.xuexiang.xupdate.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class PromptEntity
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public String o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public boolean o00OooOO;
  
  static
  {
    PromptEntity.1 local1 = new com/xuexiang/xupdate/entity/PromptEntity$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public PromptEntity()
  {
    int i = -1;
    this.o00OoOoo = i;
    this.o00Ooo00 = i;
    this.o00Ooo0 = "";
    this.o00Ooo0O = 0;
    this.o00Ooo0o = false;
    float f = -1.0F;
    this.o00OooO0 = f;
    this.o00OooO = f;
    this.o00OooOO = false;
  }
  
  public PromptEntity(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    String str = paramParcel.readString();
    this.o00Ooo0 = str;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    i = paramParcel.readByte();
    int j = 1;
    float f1 = 1.4E-45F;
    if (i != 0)
    {
      i = j;
      f2 = f1;
    }
    else
    {
      i = 0;
      str = null;
      f2 = 0.0F;
    }
    this.o00Ooo0o = i;
    float f2 = paramParcel.readFloat();
    this.o00OooO0 = f2;
    f2 = paramParcel.readFloat();
    this.o00OooO = f2;
    int k = paramParcel.readByte();
    if (k == 0)
    {
      j = 0;
      f1 = 0.0F;
    }
    this.o00OooOO = j;
  }
  
  public PromptEntity OooO00o(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (PromptEntity)m54207b69.F54207b69_09(6649, arrayOfObject);
  }
  
  public PromptEntity OooO0OO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (PromptEntity)m54207b69.F54207b69_09(6650, arrayOfObject);
  }
  
  public PromptEntity OooO0Oo(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (PromptEntity)m54207b69.F54207b69_09(6651, arrayOfObject);
  }
  
  public int describeContents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6652, arrayOfObject);
  }
  
  public int getButtonTextColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6653, arrayOfObject);
  }
  
  public float getHeightRatio()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6654, arrayOfObject);
  }
  
  public int getThemeColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6655, arrayOfObject);
  }
  
  public String getTopDrawableTag()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6656, arrayOfObject);
  }
  
  public int getTopResId()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6657, arrayOfObject);
  }
  
  public float getWidthRatio()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6658, arrayOfObject);
  }
  
  public boolean isIgnoreDownloadError()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6659, arrayOfObject);
  }
  
  public boolean isSupportBackgroundUpdate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6660, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6661, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6662, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.entity.PromptEntity
 * JD-Core Version:    0.7.0.1
 */