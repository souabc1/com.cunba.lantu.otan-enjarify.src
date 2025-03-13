package com.just.agentweb.js;

import android.os.Handler.Callback;
import android.os.Message;
import com.just.agentweb.core.AgentWeb;
import java.lang.ref.Reference;
import m54207b69;

class AgentWebJsInterfaceCompat$1
  implements Handler.Callback
{
  public AgentWebJsInterfaceCompat$1(AgentWebJsInterfaceCompat paramAgentWebJsInterfaceCompat) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject = AgentWebJsInterfaceCompat.OooO00o(this.OooO00o).get();
    boolean bool1 = true;
    if (localObject != null)
    {
      localObject = ((AgentWeb)AgentWebJsInterfaceCompat.OooO00o(this.OooO00o).get()).getJsAccessEntrace();
      String[] arrayOfString = new String[bool1];
      paramMessage = paramMessage.obj;
      boolean bool2 = paramMessage instanceof String;
      if (bool2) {
        paramMessage = (String)paramMessage;
      } else {
        paramMessage = null;
      }
      bool2 = false;
      arrayOfString[0] = paramMessage;
      paramMessage = m54207b69.F54207b69_11("i|090D1216211D401C182238241B161E17");
      ((QuickCallJs)localObject).OooO00o(paramMessage, arrayOfString);
    }
    return bool1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.js.AgentWebJsInterfaceCompat.1
 * JD-Core Version:    0.7.0.1
 */