package com.qinggan.app.launcher;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import m54207b69;

public class QGMessage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public boolean o00Ooo00;
  public Message o00Ooo0O;
  public String o00Ooo0o;
  public List o00OooO;
  public String o00OooO0;
  
  static
  {
    QGMessage.1 local1 = new com/qinggan/app/launcher/QGMessage$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public QGMessage(Parcel paramParcel)
  {
    Object localObject = "";
    this.o00Ooo0o = ((String)localObject);
    this.o00OooO0 = ((String)localObject);
    int i = -1;
    this.o00Ooo0 = i;
    boolean bool = false;
    this.o00Ooo00 = false;
    this.o00OoOoo = i;
    this.o00OooO = null;
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OooO0 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    i = paramParcel.readByte();
    if (i != 0) {
      bool = true;
    }
    this.o00Ooo00 = bool;
    i = paramParcel.readInt();
    this.o00OoOoo = i;
    localObject = paramParcel.createStringArrayList();
    this.o00OooO = ((List)localObject);
    localObject = Message.class.getClassLoader();
    paramParcel = (Message)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo0O = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11(".Q00171E372627363D3C332B45427984");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("7=111E4B5F5E0520");
    localStringBuilder.append(str);
    str = this.o00OooO0;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("U61A175C5644586012");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("B,000D4762664E4F4F72495F834F8C4E526822");
    localStringBuilder.append((String)localObject);
    boolean bool = this.o00Ooo00;
    localStringBuilder.append(bool);
    localObject = m54207b69.F54207b69_11("l=111E60535D05");
    localStringBuilder.append((String)localObject);
    int j = this.o00OoOoo;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("cm414E1B0F0E2356");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("e11D125E574647565D5C15");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    int i = this.o00Ooo0;
    paramParcel.writeInt(i);
    int j = this.o00Ooo00;
    paramParcel.writeByte(j);
    int k = this.o00OoOoo;
    paramParcel.writeInt(k);
    localObject = this.o00OooO;
    paramParcel.writeStringList((List)localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.launcher.QGMessage
 * JD-Core Version:    0.7.0.1
 */