package com.qinggan.messagecenter;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class XimalayaBean$1
  implements Parcelable.Creator
{
  public XimalayaBean OooO00o(Parcel paramParcel)
  {
    XimalayaBean localXimalayaBean = new com/qinggan/messagecenter/XimalayaBean;
    localXimalayaBean.<init>();
    String str = paramParcel.readString();
    XimalayaBean.OooO00o(localXimalayaBean, str);
    str = paramParcel.readString();
    XimalayaBean.OooO0OO(localXimalayaBean, str);
    paramParcel = paramParcel.readString();
    XimalayaBean.OooO0Oo(localXimalayaBean, paramParcel);
    return localXimalayaBean;
  }
  
  public XimalayaBean[] OooO0O0(int paramInt)
  {
    return new XimalayaBean[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.messagecenter.XimalayaBean.1
 * JD-Core Version:    0.7.0.1
 */