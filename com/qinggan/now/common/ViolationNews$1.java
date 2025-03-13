package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class ViolationNews$1
  implements Parcelable.Creator
{
  public ViolationNews OooO00o(Parcel paramParcel)
  {
    ViolationNews localViolationNews = new com/qinggan/now/common/ViolationNews;
    localViolationNews.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localViolationNews.o00Ooo00 = localDate;
    }
    else
    {
      i = 0;
      str = null;
      localViolationNews.o00Ooo00 = null;
    }
    String str = paramParcel.readString();
    localViolationNews.o00OoOoo = str;
    str = paramParcel.readString();
    localViolationNews.o00Ooo0o = str;
    l1 = paramParcel.readLong();
    localViolationNews.o00Ooo0 = l1;
    int i = paramParcel.readInt();
    localViolationNews.o00Ooo0O = i;
    int j = paramParcel.readInt();
    localViolationNews.o00OooO0 = j;
    return localViolationNews;
  }
  
  public ViolationNews[] OooO0O0(int paramInt)
  {
    return new ViolationNews[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ViolationNews.1
 * JD-Core Version:    0.7.0.1
 */