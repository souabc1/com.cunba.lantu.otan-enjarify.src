package com.just.agentweb.core.web;

import android.webkit.CookieManager;

final class AgentWebConfig$1
  implements Runnable
{
  public void run()
  {
    CookieManager.getInstance().flush();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.AgentWebConfig.1
 * JD-Core Version:    0.7.0.1
 */