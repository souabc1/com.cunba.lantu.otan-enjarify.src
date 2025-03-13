package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AudioClient$1
  implements Parcelable.Creator
{
  public AudioClient OooO00o(Parcel paramParcel)
  {
    AudioClient localAudioClient = new com/qinggan/audiopolicy/AudioClient;
    localAudioClient.<init>();
    String str = paramParcel.readString();
    localAudioClient.o00Ooo00 = str;
    int i = paramParcel.readInt();
    localAudioClient.o00Ooo0O = i;
    i = paramParcel.readInt();
    localAudioClient.o00Ooo0 = i;
    paramParcel = paramParcel.readString();
    localAudioClient.o00OoOoo = paramParcel;
    return localAudioClient;
  }
  
  public AudioClient[] OooO0O0(int paramInt)
  {
    return new AudioClient[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioClient.1
 * JD-Core Version:    0.7.0.1
 */