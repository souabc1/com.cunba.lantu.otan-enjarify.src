package com.qinggan.bus;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class QGBusEvent
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public Bundle o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public String o00OooO0;
  
  static
  {
    QGBusEvent.1 local1 = new com/qinggan/bus/QGBusEvent$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public QGBusEvent()
  {
    this.o00Ooo0 = null;
    this.o00Ooo0O = 0;
    this.o00OooO0 = null;
    this.o00Ooo00 = null;
    this.o00Ooo0o = 1;
    this.o00OoOoo = null;
  }
  
  public QGBusEvent(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00Ooo0 = str;
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    i = paramParcel.readInt();
    this.o00Ooo0o = i;
    paramParcel = paramParcel.readBundle();
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle getData()
  {
    return this.o00OoOoo;
  }
  
  public String getDestination()
  {
    return this.o00Ooo00;
  }
  
  public String getEventType()
  {
    return this.o00Ooo0;
  }
  
  public String getSource()
  {
    return this.o00OooO0;
  }
  
  public boolean isSticky()
  {
    int i = this.o00Ooo0O;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setData(Bundle paramBundle)
  {
    this.o00OoOoo = paramBundle;
  }
  
  public void setDestination(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setEventType(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setSticky(boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.o00Ooo0O = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OoOoo;
    paramParcel.writeBundle((Bundle)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.QGBusEvent
 * JD-Core Version:    0.7.0.1
 */