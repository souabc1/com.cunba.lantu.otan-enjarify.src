package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum LoginState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/wechat/LoginState;
    Object localObject2 = m54207b69.F54207b69_11("Xw2435383C2C29283B3C3B2E2F");
    ((LoginState)localObject1).<init>((String)localObject2, 0);
    o00OooO0 = (LoginState)localObject1;
    localObject2 = new com/qinggan/wechat/LoginState;
    Object localObject3 = m54207b69.F54207b69_11("'x343841343A2C31344344473637");
    ((LoginState)localObject2).<init>((String)localObject3, 1);
    o00Ooo0O = (LoginState)localObject2;
    localObject3 = new com/qinggan/wechat/LoginState;
    Object localObject4 = m54207b69.F54207b69_11("on22222B2A2436402E2B342B4646");
    ((LoginState)localObject3).<init>((String)localObject4, 2);
    o00Ooo0o = (LoginState)localObject3;
    localObject4 = new com/qinggan/wechat/LoginState;
    String str = m54207b69.F54207b69_11("JX141821141A0C2420191D");
    ((LoginState)localObject4).<init>(str, 3);
    o00Ooo0 = (LoginState)localObject4;
    LoginState[] tmp86_83 = new LoginState[4];
    LoginState[] tmp87_86 = tmp86_83;
    LoginState[] tmp87_86 = tmp86_83;
    tmp87_86[0] = localObject1;
    tmp87_86[1] = localObject2;
    tmp87_86[2] = localObject3;
    LoginState[] tmp97_87 = tmp87_86;
    tmp97_87[3] = localObject4;
    o00Ooo00 = tmp97_87;
    localObject1 = new com/qinggan/wechat/LoginState$1;
    ((LoginState.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getMessage()
  {
    return this.o00OoOoo;
  }
  
  public void setMessage(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.LoginState
 * JD-Core Version:    0.7.0.1
 */