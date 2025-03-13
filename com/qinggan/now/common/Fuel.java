package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Fuel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  public float o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    Fuel.1 local1 = new com/qinggan/now/common/Fuel$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Fuel()
  {
    int i = -1;
    this.o00Ooo00 = i;
    this.o00Ooo0O = i;
    this.o00Ooo0 = -1.0F;
    this.o00OoOoo = false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getCapacity()
  {
    return this.o00Ooo00;
  }
  
  public float getPercentage()
  {
    return this.o00Ooo0;
  }
  
  public int getRemain()
  {
    return this.o00Ooo0O;
  }
  
  public boolean isFuelShortage()
  {
    return this.o00OoOoo;
  }
  
  public void setCapacity(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setFuelShortage(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
  }
  
  public void setPercentage(float paramFloat)
  {
    this.o00Ooo0 = paramFloat;
  }
  
  public void setRemain(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("NX1E2E3F37273A21403042453C382E73");
    localStringBuilder.append(str);
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("f21E1361635B6459626418");
    localStringBuilder.append(str);
    i = this.o00Ooo0O;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("l519165A68544C5C57634A5E5D5C15");
    localStringBuilder.append(str);
    float f = this.o00Ooo0;
    localStringBuilder.append(f);
    str = m54207b69.F54207b69_11("[U79763E29172536400E4644322D41403F78");
    localStringBuilder.append(str);
    boolean bool = this.o00OoOoo;
    localStringBuilder.append(bool);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    float f = this.o00Ooo0;
    paramParcel.writeFloat(f);
    paramInt = this.o00OoOoo;
    int i = 1;
    if (paramInt != i) {
      i = 0;
    }
    paramParcel.writeInt(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Fuel
 * JD-Core Version:    0.7.0.1
 */