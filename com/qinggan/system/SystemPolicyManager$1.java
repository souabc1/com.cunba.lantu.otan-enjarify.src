package com.qinggan.system;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.qinggan.common.OnInitListener;
import java.util.HashMap;

class SystemPolicyManager$1
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i == 0)
    {
      paramMessage = paramMessage.obj;
      boolean bool1 = paramMessage instanceof Object[];
      if (bool1)
      {
        paramMessage = (Object[])paramMessage;
        bool1 = false;
        Context localContext = paramMessage[0];
        boolean bool2 = localContext instanceof Context;
        Object localObject = null;
        if (bool2)
        {
          localContext = (Context)localContext;
        }
        else
        {
          bool1 = false;
          localContext = null;
        }
        paramMessage = paramMessage[1];
        bool2 = paramMessage instanceof OnInitListener;
        if (bool2)
        {
          localObject = paramMessage;
          localObject = (OnInitListener)paramMessage;
        }
        paramMessage = SystemPolicyManager.OooO00o();
        if (paramMessage != null)
        {
          paramMessage = SystemPolicyManager.OooO0O0(SystemPolicyManager.OooO00o());
          paramMessage.put(localContext, localObject);
        }
        if (localObject != null)
        {
          boolean bool3 = SystemPolicyManager.OooOOO0;
          ((OnInitListener)localObject).OooO00o(bool3);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SystemPolicyManager.1
 * JD-Core Version:    0.7.0.1
 */