package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LoginState$1
  implements Parcelable.Creator
{
  public LoginState OooO00o(Parcel paramParcel)
  {
    Object localObject = LoginState.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    paramParcel = paramParcel.readString();
    ((LoginState)localObject).setMessage(paramParcel);
    return localObject;
  }
  
  public LoginState[] OooO0O0(int paramInt)
  {
    return new LoginState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.LoginState.1
 * JD-Core Version:    0.7.0.1
 */