package com.qinggan.system;

import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import m54207b69;

class AppLaunchManager$2
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1 = m54207b69.F54207b69_11("CO63703E233E423231777B79");
    String str1 = m54207b69.F54207b69_11("9C02343512263B332733172C382E313440");
    int m;
    Object localObject2;
    StringBuilder localStringBuilder;
    String str2;
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        int k = 2;
        if (i != k)
        {
          m = 3;
          if (i == m)
          {
            paramMessage = m54207b69.F54207b69_11("=E203E2E34692D363039353C37372E3841383B333379474337437E404446533E84445657");
            Log.OooO00o(str1, paramMessage);
            paramMessage = MultiWindowManager.OooO0oO(AppLaunchManager.OooO0o0(this.OooO00o));
            paramMessage.OooO0o();
          }
        }
        else
        {
          paramMessage = (String)paramMessage.obj;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = m54207b69.F54207b69_11(":M001F0C150D0D07131C1B0B1724101C14222F1A322F19241F8F86574746458B8F8D");
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(paramMessage);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.OooO00o(str1, (String)localObject2);
          localObject2 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("\\w06115B190B0C2E221E0B231F2B"));
          if (localObject2 == null)
          {
            paramMessage = m54207b69.F54207b69_11("2]3F35353C3C34833B36863D333D3E8A8B8C8D8E8F909192");
            Log.OooO00o(str1, paramMessage);
            return;
          }
          localObject1 = this.OooO00o;
          localObject2 = IAppLaunchService.Stub.o0Oo0o0O((IBinder)localObject2);
          AppLaunchManager.OooO0Oo((AppLaunchManager)localObject1, (IAppLaunchService)localObject2);
          AppLaunchManager.OooO0O0(this.OooO00o, j);
          localObject2 = this.OooO00o;
          ((AppLaunchManager)localObject2).OooO(paramMessage);
        }
      }
      else
      {
        localObject2 = (String)paramMessage.obj;
        m = paramMessage.arg1;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        str2 = m54207b69.F54207b69_11("=k48494A4E2A3D323B373731353E4135394E363A36484D4450553B424967656667676C272D2A33717D73");
        localStringBuilder.append(str2);
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(m);
        localObject1 = localStringBuilder.toString();
        Log.OooO00o(str1, (String)localObject1);
        if (localObject2 != null)
        {
          localObject1 = this.OooO00o;
          ((AppLaunchManager)localObject1).OooOO0O((String)localObject2, m);
        }
      }
    }
    else
    {
      localObject2 = (String)paramMessage.obj;
      m = paramMessage.arg1;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str2 = m54207b69.F54207b69_11("hC6061626612150A230F0F190D26291D11261E121E3017292A7B797A7B8B804B414E4785A187");
      localStringBuilder.append(str2);
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(m);
      localObject1 = localStringBuilder.toString();
      Log.OooO00o(str1, (String)localObject1);
      if (localObject2 != null)
      {
        localObject1 = this.OooO00o;
        ((AppLaunchManager)localObject1).OooOO0((String)localObject2, m);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AppLaunchManager.2
 * JD-Core Version:    0.7.0.1
 */