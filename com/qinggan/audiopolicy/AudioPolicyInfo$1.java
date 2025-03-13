package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AudioPolicyInfo$1
  implements Parcelable.Creator
{
  public AudioPolicyInfo OooO00o(Parcel paramParcel)
  {
    AudioPolicyInfo localAudioPolicyInfo = new com/qinggan/audiopolicy/AudioPolicyInfo;
    localAudioPolicyInfo.<init>();
    String str = paramParcel.readString();
    localAudioPolicyInfo.o00Ooo00 = str;
    int i = paramParcel.readInt();
    localAudioPolicyInfo.o00Ooo0 = i;
    paramParcel = paramParcel.readString();
    localAudioPolicyInfo.o00OoOoo = paramParcel;
    return localAudioPolicyInfo;
  }
  
  public AudioPolicyInfo[] OooO0O0(int paramInt)
  {
    return new AudioPolicyInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioPolicyInfo.1
 * JD-Core Version:    0.7.0.1
 */