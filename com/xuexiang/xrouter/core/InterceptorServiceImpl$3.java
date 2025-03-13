package com.xuexiang.xrouter.core;

import android.content.Context;
import com.xuexiang.xrouter.exception.HandlerException;
import com.xuexiang.xrouter.facade.template.IInterceptor;
import com.xuexiang.xrouter.facade.template.IProvider;
import com.xuexiang.xrouter.logs.XRLog;
import com.xuexiang.xrouter.utils.MapUtils;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

class InterceptorServiceImpl$3
  implements Runnable
{
  public void run()
  {
    Object localObject1 = Warehouse.OooO0o0;
    boolean bool1 = MapUtils.OooO0O0((Map)localObject1);
    if (bool1)
    {
      localObject1 = Warehouse.OooO0o0.entrySet().iterator();
      Object localObject3;
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (bool2)
        {
          localObject3 = (Class)((Map.Entry)((Iterator)localObject1).next()).getValue();
          Object localObject5 = null;
          try
          {
            localObject6 = new Class[0];
            localObject6 = ((Class)localObject3).getConstructor((Class[])localObject6);
            localObject5 = new Object[0];
            localObject5 = ((Constructor)localObject6).newInstance((Object[])localObject5);
            localObject5 = (IInterceptor)localObject5;
            localObject6 = this.o00OoOoo;
            ((IProvider)localObject5).OooO0O0((Context)localObject6);
            localObject6 = Warehouse.OooO0o;
            ((List)localObject6).add(localObject5);
          }
          catch (Exception localException)
          {
            localObject5 = new com/xuexiang/xrouter/exception/HandlerException;
            Object localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            String str = m54207b69.F54207b69_11("@a393410171909196263423D19202212225119211B29561E262D1D2D1D202E332D336226363733396769382A37306E8A706A");
            ((StringBuilder)localObject6).append(str);
            localObject3 = ((Class)localObject3).getName();
            ((StringBuilder)localObject6).append((String)localObject3);
            localObject3 = m54207b69.F54207b69_11("qx25555A0D211E111E1E614F632F");
            ((StringBuilder)localObject6).append((String)localObject3);
            ??? = localException.getMessage();
            ((StringBuilder)localObject6).append((String)???);
            ((StringBuilder)localObject6).append("]");
            ??? = ((StringBuilder)localObject6).toString();
            ((HandlerException)localObject5).<init>((String)???);
            throw ((Throwable)localObject5);
          }
        }
      }
      bool1 = true;
      InterceptorServiceImpl.OooO0o0(bool1);
      XRLog.OooO0o(m54207b69.F54207b69_11("Y1696460474959491860684F5F4F5F6250556F5555256D756F5D2A786270603D"));
      synchronized (InterceptorServiceImpl.OooO0o())
      {
        localObject3 = InterceptorServiceImpl.OooO0o();
        localObject3.notifyAll();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.core.InterceptorServiceImpl.3
 * JD-Core Version:    0.7.0.1
 */