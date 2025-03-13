package com.qinggan.dvr;

import android.os.Handler;
import android.os.Message;
import m54207b69;

class DvrManager$2$1
  extends Handler
{
  public DvrManager$2$1(DvrManager.2 param2) {}
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("YZ323C36413A441D46313245484B876E89");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramMessage);
    int i = paramMessage.what;
    int j;
    int m;
    switch (i)
    {
    default: 
      break;
    case 6: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        j = paramMessage.arg1;
        int k = paramMessage.arg2;
        paramMessage = (Integer)paramMessage.obj;
        m = paramMessage.intValue();
        ((DvrManager.DvrListener)localObject).OoooOO0(j, k, m);
      }
      break;
    case 5: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        j = paramMessage.arg1;
        paramMessage = (String)paramMessage.obj;
        ((DvrManager.DvrListener)localObject).Ooooo0o(j, paramMessage);
      }
      break;
    case 4: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        paramMessage = (long[])paramMessage.obj;
        ((DvrManager.DvrListener)localObject).Oooo0(paramMessage);
      }
      break;
    case 3: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        m = paramMessage.arg1;
        ((DvrManager.DvrListener)localObject).OooO0O0(m);
      }
      break;
    case 2: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        paramMessage = (String)paramMessage.obj;
        ((DvrManager.DvrListener)localObject).OooOO0o(paramMessage);
      }
      break;
    case 1: 
      localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
      if (localObject != null)
      {
        localObject = DvrManager.OooO0O0(this.OooO00o.OooO0O0);
        paramMessage = (String)paramMessage.obj;
        ((DvrManager.DvrListener)localObject).Oooo(paramMessage);
      }
      break;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.dvr.DvrManager.2.1
 * JD-Core Version:    0.7.0.1
 */