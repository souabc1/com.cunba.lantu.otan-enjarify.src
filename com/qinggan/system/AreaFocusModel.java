package com.qinggan.system;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import m54207b69;

public class AreaFocusModel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o;
  public int o00OooO;
  public String o00OooO0;
  public int o00OooOO;
  
  static
  {
    AreaFocusModel.1 local1 = new com/qinggan/system/AreaFocusModel$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public AreaFocusModel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    String str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00Ooo0o = str;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00OooOO = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    int j = paramParcel.readInt();
    this.o00OooO = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Object localObject = this.o00Ooo0o;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = m54207b69.F54207b69_11("=\\09333A3C3E3A3840841B473C45");
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.o00Ooo0o;
      ((StringBuilder)localObject).append(str);
      str = m54207b69.F54207b69_11("bi12091D0F0C25135B");
      ((StringBuilder)localObject).append(str);
      int i = this.o00OoOoo;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("mk474C1D0D0C051013162E14111A635A");
      ((StringBuilder)localObject).append(str);
      str = this.o00OooO0;
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append('\'');
      str = m54207b69.F54207b69_11("@Z767B40424040353D36253F443B361A424F3E25517B");
      ((StringBuilder)localObject).append(str);
      i = this.o00Ooo0;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("^n424F1C04222D071423263927171C61");
      ((StringBuilder)localObject).append(str);
      i = this.o00OooOO;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("',000D50465C5D4948724C59646B7A6C585D22");
      ((StringBuilder)localObject).append(str);
      i = this.o00Ooo00;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("k`4C410E080A192C160B1E1D2C1E120F6C");
      ((StringBuilder)localObject).append(str);
      i = this.o00Ooo0O;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("c'0B08575144545968504D5C5F726250552A");
      ((StringBuilder)localObject).append(str);
      i = this.o00OooO;
      ((StringBuilder)localObject).append(i);
      i = 125;
      ((StringBuilder)localObject).append(i);
      localObject = ((StringBuilder)localObject).toString();
    }
    return localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    String str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AreaFocusModel
 * JD-Core Version:    0.7.0.1
 */