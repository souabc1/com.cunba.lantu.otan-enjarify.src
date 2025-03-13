package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public abstract class NowCard
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public NowCardType o00OoOoo;
  
  static
  {
    NowCard.1 local1 = new com/qinggan/now/NowCard$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public NowCardType getType()
  {
    return this.o00OoOoo;
  }
  
  public void setType(NowCardType paramNowCardType)
  {
    this.o00OoOoo = paramNowCardType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("x37D5D467356465D107050544E6216");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    NowCardType localNowCardType = this.o00OoOoo;
    paramParcel.writeParcelable(localNowCardType, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowCard
 * JD-Core Version:    0.7.0.1
 */