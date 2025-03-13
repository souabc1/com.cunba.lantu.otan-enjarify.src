package com.qinggan.audiopolicy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AudioEQMode$1
  implements Parcelable.Creator
{
  public AudioEQMode OooO00o(Parcel paramParcel)
  {
    AudioEQMode localAudioEQMode = new com/qinggan/audiopolicy/AudioEQMode;
    localAudioEQMode.<init>();
    Object localObject = paramParcel.readString();
    localAudioEQMode.o00Ooo00 = ((String)localObject);
    localObject = AudioEQMode.class.getClassLoader();
    paramParcel = paramParcel.readHashMap((ClassLoader)localObject);
    localAudioEQMode.o00OoOoo = paramParcel;
    return localAudioEQMode;
  }
  
  public AudioEQMode[] OooO0O0(int paramInt)
  {
    return new AudioEQMode[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioEQMode.1
 * JD-Core Version:    0.7.0.1
 */