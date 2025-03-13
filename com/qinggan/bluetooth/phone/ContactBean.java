package com.qinggan.bluetooth.phone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class ContactBean
  implements Parcelable, Comparable
{
  public static final Parcelable.Creator CREATOR;
  public ContactIndex o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  
  static
  {
    ContactBean.1 local1 = new com/qinggan/bluetooth/phone/ContactBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ContactBean() {}
  
  public ContactBean(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00Ooo0 = i;
    Object localObject = paramParcel.readString();
    this.o00Ooo0O = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo00 = ((String)localObject);
    localObject = ContactIndex.class.getClassLoader();
    paramParcel = (ContactIndex)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00OoOoo = paramParcel;
  }
  
  public int OooO0OO(ContactBean paramContactBean)
  {
    int i = 0;
    if (this == paramContactBean) {
      return 0;
    }
    int j = 1;
    if (paramContactBean == null) {
      return j;
    }
    String str = getSpelling();
    paramContactBean = paramContactBean.getSpelling();
    int k = -1;
    if (str == null)
    {
      if (paramContactBean == null) {
        return 0;
      }
      return k;
    }
    if (paramContactBean == null) {
      return j;
    }
    int m = str.charAt(0);
    i = paramContactBean.charAt(0);
    if (m == i) {
      return str.compareTo(paramContactBean);
    }
    int n = 35;
    if (m == n) {
      return j;
    }
    if (i == n) {
      return k;
    }
    return str.compareTo(paramContactBean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ContactIndex getContactIndex()
  {
    return this.o00OoOoo;
  }
  
  public String getFirstChar()
  {
    return this.o00Ooo00;
  }
  
  public int getId()
  {
    return this.o00Ooo0;
  }
  
  public String getName()
  {
    return this.o00Ooo0O;
  }
  
  public String getSpelling()
  {
    return this.o00Ooo0o;
  }
  
  public void setContactIndex(ContactIndex paramContactIndex)
  {
    this.o00OoOoo = paramContactIndex;
  }
  
  public void setFirstChar(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setId(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setSpelling(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject = m54207b69.F54207b69_11("K%664B4D54484B576E484D5569");
    localStringBuilder.<init>((String)localObject);
    localStringBuilder.append("id=");
    int i = this.o00Ooo0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("t=111E555F545D0621");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("Z'0B08565A465051555149240B");
    localStringBuilder.append(str);
    str = this.o00Ooo0o;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("&31F14575D45454D77635B4B1920");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("8J666B2B2828433130460C2E393B3F85");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.o00Ooo0;
    paramParcel.writeInt(i);
    Object localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.phone.ContactBean
 * JD-Core Version:    0.7.0.1
 */