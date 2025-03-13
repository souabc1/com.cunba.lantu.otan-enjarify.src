package com.qinggan.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import m54207b69;

class WifiTracker$1
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("fv19192616191825071B556022210F2D2828675D69");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramContext);
    localObject = m54207b69.F54207b69_11("J-4C444B6246494F0A4B51630E66515953138B767E788794908492828D8A828A828A898B");
    boolean bool1 = ((String)localObject).equals(paramContext);
    int i;
    if (bool1)
    {
      paramContext = this.OooO00o;
      localObject = m54207b69.F54207b69_11("Zi1E0111033A1F230F2515");
      i = 4;
      int j = paramIntent.getIntExtra((String)localObject, i);
      WifiTracker.OooO00o(paramContext, j);
    }
    else
    {
      localObject = m54207b69.F54207b69_11("<?5E525D50545B61185963551C54636765217D8E918575839184838D8688");
      bool1 = ((String)localObject).equals(paramContext);
      i = 0;
      str = null;
      if (!bool1)
      {
        localObject = m54207b69.F54207b69_11(")^3F313C2F353C40773844347B35444646802E23232C2C2F222434341C2C382828312D373025423C46384245");
        bool1 = ((String)localObject).equals(paramContext);
        if (!bool1)
        {
          localObject = m54207b69.F54207b69_11("A|1D131A11171A1E591A22125D17222824624147454B38554A4A534F56454B5B475554544663596359636262");
          bool1 = ((String)localObject).equals(paramContext);
          if (!bool1)
          {
            localObject = m54207b69.F54207b69_11("/?5E525D50545B61185963551C54636765217D7D917F8F76938F978B9396");
            bool1 = ((String)localObject).equals(paramContext);
            int k = 1;
            if (bool1)
            {
              paramContext = m54207b69.F54207b69_11("/Z34403030392D371A3C453F");
              paramContext = (NetworkInfo)paramIntent.getParcelableExtra(paramContext);
              paramIntent = WifiTracker.OooO0Oo(this.OooO00o);
              bool1 = paramContext.isConnected();
              paramIntent.set(bool1);
              WifiTracker.OooO0o0(this.OooO00o).sendEmptyMessage(0);
              WifiTracker.OooO0OO(this.OooO00o).sendEmptyMessage(0);
              paramIntent = WifiTracker.OooO0OO(this.OooO00o);
              paramContext = paramIntent.obtainMessage(k, paramContext);
              paramContext.sendToTarget();
              return;
            }
            paramIntent = m54207b69.F54207b69_11("Df070904170D14084F100C1C531D1C0E1E58454748434E3B453F413B3E3E");
            boolean bool2 = paramIntent.equals(paramContext);
            if (!bool2) {
              return;
            }
            paramContext = WifiTracker.OooO0OO(this.OooO00o);
            paramContext.sendEmptyMessage(k);
            return;
          }
        }
      }
      paramContext = WifiTracker.OooO0OO(this.OooO00o);
      paramContext.sendEmptyMessage(0);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker.1
 * JD-Core Version:    0.7.0.1
 */