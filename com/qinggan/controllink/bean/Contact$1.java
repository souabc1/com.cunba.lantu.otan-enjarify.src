package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Contact$1
  implements Parcelable.Creator
{
  public Contact OooO00o(Parcel paramParcel)
  {
    Contact localContact = new com/qinggan/controllink/bean/Contact;
    int i = paramParcel.readInt();
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    int j = paramParcel.readInt();
    int k = paramParcel.readInt();
    localContact.<init>(i, str1, str2, j, k);
    return localContact;
  }
  
  public Contact[] OooO0O0(int paramInt)
  {
    return new Contact[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Contact.1
 * JD-Core Version:    0.7.0.1
 */