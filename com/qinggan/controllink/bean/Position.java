package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Position
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public int o00OooO0;
  
  static
  {
    Position.1 local1 = new com/qinggan/controllink/bean/Position$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Position(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4)
  {
    this.o00OooO0 = paramInt1;
    this.o00Ooo0o = paramString1;
    this.o00Ooo00 = paramString2;
    this.o00Ooo0O = paramInt2;
    this.o00Ooo0 = paramInt3;
    this.o00OoOoo = paramInt4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getAction()
  {
    return this.o00OoOoo;
  }
  
  public String getAddress()
  {
    return this.o00Ooo00;
  }
  
  public int getIndex()
  {
    return this.o00Ooo0;
  }
  
  public int getState()
  {
    return this.o00Ooo0O;
  }
  
  public String getTitle()
  {
    return this.o00Ooo0o;
  }
  
  public int getType()
  {
    return this.o00OooO0;
  }
  
  public void setAddress(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setIndex(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setTitle(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    String str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Position
 * JD-Core Version:    0.7.0.1
 */