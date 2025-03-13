package com.excelfore.hmiagent;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class VehicleDiagState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public int[] o00Ooo00;
  
  static
  {
    VehicleDiagState.1 local1 = new com/excelfore/hmiagent/VehicleDiagState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public VehicleDiagState()
  {
    int[] arrayOfInt = new int[8];
    this.o00Ooo00 = arrayOfInt;
  }
  
  public VehicleDiagState(Parcel paramParcel)
  {
    Object localObject = new int[8];
    this.o00Ooo00 = ((int[])localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0 = i;
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.readIntArray((int[])localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getContent()
  {
    return this.o00OoOoo;
  }
  
  public int[] getPolicyMask()
  {
    return this.o00Ooo00;
  }
  
  public int getState()
  {
    return this.o00Ooo0;
  }
  
  public void setContent(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setPolicyMask(int[] paramArrayOfInt)
  {
    this.o00Ooo00 = paramArrayOfInt;
  }
  
  public void setState(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("[;6D5F55555C5C64865A6366735B675D6D5059616D63731C33");
    localStringBuilder.append(str1);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    i = 39;
    localStringBuilder.append(i);
    String str2 = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append(str2);
    str2 = this.o00OoOoo;
    localStringBuilder.append(str2);
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeIntArray((int[])localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.VehicleDiagState
 * JD-Core Version:    0.7.0.1
 */