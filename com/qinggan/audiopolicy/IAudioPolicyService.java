package com.qinggan.audiopolicy;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

public abstract interface IAudioPolicyService
  extends IInterface
{
  public abstract int getArkarmysMode();
  
  public abstract int getAtmosMode();
  
  public abstract List getAudioClients();
  
  public abstract List getAudioPolicyInfo(int paramInt);
  
  public abstract int getBTSourceVolume();
  
  public abstract int[] getBalanceFaderLevel();
  
  public abstract int getBandValue(int paramInt);
  
  public abstract int getBassFreq();
  
  public abstract int getCanDspType();
  
  public abstract int getChannel();
  
  public abstract int getChimeMode();
  
  public abstract AudioPolicyInfo getCurrAudioPolicyInfoByChannel(int paramInt);
  
  public abstract AudioPolicyInfo getCurrMediaAudioPolicyInfoByChannel(int paramInt);
  
  public abstract int getDtsMode();
  
  public abstract int[] getEQDefault();
  
  public abstract AudioEQMode getEQMode();
  
  public abstract AudioEQMode getEQModeByIndex(int paramInt);
  
  public abstract int getEQModeIndex();
  
  public abstract int getHighFreq();
  
  public abstract int getHintToneState();
  
  public abstract AudioPolicyInfo getLastMediaAudioPolicyInfoByChannel(int paramInt);
  
  public abstract int getLoudnessState();
  
  public abstract int getLowFreq();
  
  public abstract int getMaxBalanceFaderLevel();
  
  public abstract int getMaxBandIndex();
  
  public abstract int getMaxBandValue();
  
  public abstract int getMidFreq();
  
  public abstract int getMixPolicy();
  
  public abstract int getPhoneMixPolicy();
  
  public abstract int getReversePolicy();
  
  public abstract int getScreenSoundState();
  
  public abstract int getSoundFeature();
  
  public abstract int getSoundField();
  
  public abstract int getSpeedCoefMode();
  
  public abstract int getStreamMaxVolume(int paramInt);
  
  public abstract int getStreamVolume(int paramInt);
  
  public abstract int getSubwooferMode();
  
  public abstract int getVehicleState();
  
  public abstract boolean isAtmos();
  
  public abstract boolean isBTSourceConnected();
  
  public abstract boolean isBabyInCar();
  
  public abstract boolean isDtsEnabled();
  
  public abstract boolean isInIVoka();
  
  public abstract boolean isMasterMute();
  
  public abstract boolean isMediaPlaying();
  
  public abstract boolean isMicMute();
  
  public abstract boolean isNaviMix();
  
  public abstract boolean isStreamMute(int paramInt);
  
  public abstract void o0000Oo0(String paramString, int paramInt);
  
  public abstract boolean o000O0o(IBTSourceInfoCallback paramIBTSourceInfoCallback, String paramString);
  
  public abstract int o000OOoO(int paramInt);
  
  public abstract boolean o000Ooo(String paramString);
  
  public abstract int o000o0Oo(boolean paramBoolean);
  
  public abstract int o000o0o(int paramInt);
  
  public abstract int o000o0o0(IAudioPolicyCallback paramIAudioPolicyCallback, String paramString, boolean paramBoolean);
  
  public abstract int o000oo0O(IAudioPolicyCallback paramIAudioPolicyCallback, String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4);
  
  public abstract int o000ooOO(int paramInt);
  
  public abstract int o00O0000(int paramInt);
  
  public abstract int o00O00oO(IAudioPolicyCallback paramIAudioPolicyCallback, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract boolean o00O0O0(IAudioExceptionCallback paramIAudioExceptionCallback);
  
  public abstract void o00O0o0(int paramInt1, int paramInt2);
  
  public abstract int o00OO(int paramInt);
  
  public abstract int o00OO0(int paramInt1, int paramInt2);
  
  public abstract void o00OO000(boolean paramBoolean, int paramInt);
  
  public abstract int o00OOOo(boolean paramBoolean);
  
  public abstract int o00OOooo(int paramInt);
  
  public abstract void o00Oo000(int paramInt);
  
  public abstract int o00Oo0Oo(boolean paramBoolean);
  
  public abstract int o00o0(int paramInt1, int paramInt2, IBinder paramIBinder, IAudioPolicyCallback paramIAudioPolicyCallback, String paramString1, String paramString2, int paramInt3, int paramInt4);
  
  public abstract int o00o00Oo(int paramInt);
  
  public abstract int o00o0O0(int paramInt);
  
  public abstract boolean o00o0O00();
  
  public abstract int o00o0OOO(int paramInt);
  
  public abstract int o00o0Oo0(boolean paramBoolean);
  
  public abstract boolean o00o0oO0(IAudioExceptionCallback paramIAudioExceptionCallback);
  
  public abstract int o00o0oo0(int paramInt);
  
  public abstract void o00oO0O0(boolean paramBoolean, Bundle paramBundle);
  
  public abstract boolean o00oOOo(IAudioClientCallback paramIAudioClientCallback, String paramString);
  
  public abstract void o00oOoO(String paramString);
  
  public abstract boolean o00oOoOO(IBTSourceConnected paramIBTSourceConnected);
  
  public abstract int o00oo(int paramInt);
  
  public abstract AudioPolicyInfo o00oo000(int paramInt, String paramString);
  
  public abstract int o00ooO00(int paramInt);
  
  public abstract int o00ooOo0(int paramInt, IAudioFadeCallback paramIAudioFadeCallback);
  
  public abstract int o00oooOO(int paramInt);
  
  public abstract int o0O00(int paramInt);
  
  public abstract boolean o0O00000(IBTSourceInfoCallback paramIBTSourceInfoCallback);
  
  public abstract int o0O00Oo(int paramInt);
  
  public abstract int o0O00o0O(int paramInt);
  
  public abstract int o0O0O0oo(int paramInt);
  
  public abstract void o0O0OO(String paramString);
  
  public abstract int o0O0OOO0(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int o0O0Oo0O(int paramInt);
  
  public abstract int o0O0o0o0(int paramInt, IAudioFadeCallback paramIAudioFadeCallback);
  
  public abstract int o0OO00OO(int paramInt1, int paramInt2, IBinder paramIBinder, IAudioPolicyCallback paramIAudioPolicyCallback, String paramString1, String paramString2, int paramInt3);
  
  public abstract boolean o0OO00oo(IAudioPolicyInfoCallback paramIAudioPolicyInfoCallback, String paramString);
  
  public abstract int o0OO0Ooo(boolean paramBoolean);
  
  public abstract boolean o0OO0o0(IBTSourceConnected paramIBTSourceConnected, String paramString);
  
  public abstract void o0OO0oOO();
  
  public abstract boolean o0OO0oo0(IAudioClientCallback paramIAudioClientCallback);
  
  public abstract int o0OOO0(int paramInt);
  
  public abstract int o0OOOO(int paramInt);
  
  public abstract int o0OOOo(int paramInt);
  
  public abstract int o0OOOo0(int paramInt);
  
  public abstract void o0Oo0Oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean o0Oo0Ooo(IAudioPolicyInfoCallback paramIAudioPolicyInfoCallback);
  
  public abstract AudioPolicyInfo o0OoOoOo(String paramString);
  
  public abstract int o0oOOo(int paramInt);
  
  public abstract int o0oOo000(int paramInt1, int paramInt2);
  
  public abstract void o0ooOOOO(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void setEQModeByIndex(int paramInt, int[] paramArrayOfInt);
  
  public abstract void setEcnr(boolean paramBoolean);
  
  public abstract void setNaviMix(boolean paramBoolean);
  
  public abstract void setStreamMute(int paramInt, boolean paramBoolean);
  
  public abstract void setVoiceMute(boolean paramBoolean);
  
  public abstract void setXCallState(boolean paramBoolean);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.IAudioPolicyService
 * JD-Core Version:    0.7.0.1
 */