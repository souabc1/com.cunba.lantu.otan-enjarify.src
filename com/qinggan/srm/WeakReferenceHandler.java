package com.qinggan.srm;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class WeakReferenceHandler
  extends Handler
{
  public final WeakReference OooO00o;
  
  public abstract void OooO00o(Message paramMessage, Object paramObject);
  
  public Object getParent()
  {
    return this.OooO00o.get();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject = getParent();
    if (localObject == null) {
      return;
    }
    OooO00o(paramMessage, localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.srm.WeakReferenceHandler
 * JD-Core Version:    0.7.0.1
 */