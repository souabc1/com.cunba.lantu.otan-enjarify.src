package com.qinggan.systempolicy;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.systempolicy.videopolicy.IVideoPolicyService.Stub;
import m54207b69;

class VideoPolicyManager$1
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("nE132D23232E1A3030342F46212C44413B3631773D3F2B364E4B45403B2247494A40475343459CA5");
    localStringBuilder.append(str);
    localStringBuilder.append(paramComponentName);
    paramComponentName = this.OooO00o;
    paramIBinder = IVideoPolicyService.Stub.o0Oo0o0O(paramIBinder);
    VideoPolicyManager.OooO00o(paramComponentName, paramIBinder);
    paramComponentName = new java/lang/StringBuilder;
    paramComponentName.<init>();
    paramIBinder = m54207b69.F54207b69_11("A*7146467C535D624A5158735050515D586E60608A5D605C5D22675D7476687C6862846666829D7580876F88358A858D7E40");
    paramComponentName.append(paramIBinder);
    paramIBinder = VideoPolicyManager.OooO0OO(this.OooO00o).getPackageName();
    paramComponentName.append(paramIBinder);
    VideoPolicyManager.OooO0O0(this.OooO00o, true);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("O'714F45454C7C4E52564D687F4E625F5D5453195B5D89586C69675E5D7F6B7263686A6B656878686A45");
    localStringBuilder.append(str);
    localStringBuilder.append(paramComponentName);
    VideoPolicyManager.OooO00o(this.OooO00o, null);
    VideoPolicyManager.OooO0O0(this.OooO00o, false);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.VideoPolicyManager.1
 * JD-Core Version:    0.7.0.1
 */