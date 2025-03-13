package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class NowMessage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public NowMessageAction o00OoOoo;
  public NowCard o00Ooo00;
  
  static
  {
    NowMessage.1 local1 = new com/qinggan/now/NowMessage$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public NowMessageAction getAction()
  {
    return this.o00OoOoo;
  }
  
  public NowCard getCard()
  {
    return this.o00Ooo00;
  }
  
  public void setAction(NowMessageAction paramNowMessageAction)
  {
    this.o00OoOoo = paramNowMessageAction;
  }
  
  public void setCard(NowCard paramNowCard)
  {
    this.o00Ooo00 = paramNowCard;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("f47A5C457C554C4D5C5B5A7F624C6A69691E8069685A6524");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowMessage
 * JD-Core Version:    0.7.0.1
 */