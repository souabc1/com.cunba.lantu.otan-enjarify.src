package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class SeatInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  public SeatRoom o00Ooo0;
  public int o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  
  static
  {
    SeatInfo.1 local1 = new com/qinggan/airtrip/bean/SeatInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SeatInfo(Parcel paramParcel)
  {
    int i = 0;
    Object localObject = null;
    this.o00OoOoo = false;
    String str = "";
    this.o00Ooo0O = str;
    this.o00Ooo0o = str;
    this.o00Ooo00 = -1;
    int j = paramParcel.readByte();
    if (j != 0) {
      i = 1;
    }
    this.o00OoOoo = i;
    localObject = paramParcel.readString();
    this.o00Ooo0O = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    localObject = SeatRoom.class.getClassLoader();
    paramParcel = (SeatRoom)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getItemIndex()
  {
    return this.o00Ooo00;
  }
  
  public String getSeatNo()
  {
    return this.o00Ooo0O;
  }
  
  public String getSrcText()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isPassWay()
  {
    String str1 = this.o00Ooo0o;
    String str2 = SeatRoom.o00OooOo;
    return str1.equals(str2);
  }
  
  public boolean isSafeDoor()
  {
    String str1 = this.o00Ooo0o;
    String str2 = SeatRoom.o0O00o0;
    return str1.equals(str2);
  }
  
  public boolean isSeat()
  {
    return this.o00OoOoo;
  }
  
  public boolean isTitle()
  {
    return false;
  }
  
  public void setItemIndex(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setSeat(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
  }
  
  public void setSeatNo(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setSrcText(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("D/7C4B505E6A464F475C4F6687565B6921");
    localStringBuilder.append(str1);
    boolean bool = this.o00OoOoo;
    localStringBuilder.append(bool);
    str1 = m54207b69.F54207b69_11("B51916485358468161101B");
    localStringBuilder.append(str1);
    str1 = this.o00Ooo0O;
    localStringBuilder.append(str1);
    char c = '\'';
    localStringBuilder.append(c);
    String str2 = m54207b69.F54207b69_11("<R7E732323350B3D312E787F");
    localStringBuilder.append(str2);
    str2 = this.o00Ooo0o;
    localStringBuilder.append(str2);
    localStringBuilder.append(c);
    str1 = m54207b69.F54207b69_11("oo4350081E0E072C081313215D");
    localStringBuilder.append(str1);
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.o00OoOoo;
    paramParcel.writeByte(i);
    Object localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    int j = this.o00Ooo00;
    paramParcel.writeInt(j);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SeatInfo
 * JD-Core Version:    0.7.0.1
 */