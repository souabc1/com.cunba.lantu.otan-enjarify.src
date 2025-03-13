package com.qinggan.audiopolicy;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import m54207b69;

class AudioPolicyManager$8
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("=(695E4E444B7D4D4B49545B8659676C505B5E1A5A5A906371765A6568876464656D6C7E707037");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramComponentName);
    paramComponentName = this.OooO00o;
    localObject = IAudioPolicyService.Stub.o0Oo0o0O(paramIBinder);
    AudioPolicyManager.OooO0Oo(paramComponentName, (IAudioPolicyService)localObject);
    try
    {
      paramComponentName = this.OooO00o;
      paramComponentName = AudioPolicyManager.OooO0oo(paramComponentName);
      localObject = null;
      paramIBinder.linkToDeath(paramComponentName, 0);
    }
    catch (RemoteException paramComponentName)
    {
      paramIBinder = new java/lang/StringBuilder;
      paramIBinder.<init>();
      localObject = m54207b69.F54207b69_11("~K272327232329153532482D763A40363D4B5034373986");
      paramIBinder.append((String)localObject);
      paramComponentName = paramComponentName.getMessage();
      paramIBinder.append(paramComponentName);
    }
    paramComponentName = new java/lang/StringBuilder;
    paramComponentName.<init>();
    paramIBinder = m54207b69.F54207b69_11("A*7146467C535D624A5158735050515D586E60608A5D605C5D22675D7476687C6862846666829D7580876F88358A858D7E40");
    paramComponentName.append(paramIBinder);
    paramIBinder = AudioPolicyManager.OooOOo0(this.OooO00o).getPackageName();
    paramComponentName.append(paramIBinder);
    AudioPolicyManager.OooO0o0(this.OooO00o, true);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("m>7F4C5C5A557357595F665178675956666D6C3064648271636070777696746B7C7171727E816F81812C");
    localStringBuilder.append(str);
    localStringBuilder.append(paramComponentName);
    AudioPolicyManager.OooO0Oo(this.OooO00o, null);
    AudioPolicyManager.OooO0o0(this.OooO00o, false);
    AudioPolicyManager.OooO0o(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioPolicyManager.8
 * JD-Core Version:    0.7.0.1
 */