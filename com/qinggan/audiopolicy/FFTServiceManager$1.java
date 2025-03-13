package com.qinggan.audiopolicy;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.audiopolicy.service.fft.IFFTService.Stub;
import m54207b69;

class FFTServiceManager$1
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("?m2B2C3B410C24210B1611570D0F4B162E2B15201B4217191A202733232574");
    localStringBuilder.append(str);
    localStringBuilder.append(paramComponentName);
    paramComponentName = this.OooO00o;
    paramIBinder = IFFTService.Stub.o0Oo0o0O(paramIBinder);
    FFTServiceManager.OooO00o(paramComponentName, paramIBinder);
    paramComponentName = new java/lang/StringBuilder;
    paramComponentName.<init>();
    paramIBinder = m54207b69.F54207b69_11("A*7146467C535D624A5158735050515D586E60608A5D605C5D22675D7476687C6862846666829D7580876F88358A858D7E40");
    paramComponentName.append(paramIBinder);
    paramIBinder = FFTServiceManager.OooO0OO(this.OooO00o).getPackageName();
    paramComponentName.append(paramIBinder);
    FFTServiceManager.OooO0O0(this.OooO00o, true);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("()6F707F7D506065475255135153875A6A6F515C5F815570615E606167667A6A6C33");
    localStringBuilder.append(str);
    localStringBuilder.append(paramComponentName);
    FFTServiceManager.OooO00o(this.OooO00o, null);
    FFTServiceManager.OooO0O0(this.OooO00o, false);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.FFTServiceManager.1
 * JD-Core Version:    0.7.0.1
 */