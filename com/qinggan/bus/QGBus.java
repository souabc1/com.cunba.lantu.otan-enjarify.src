package com.qinggan.bus;

import android.content.Context;
import com.qinggan.bus.impl.QGBusImpl;

public class QGBus
{
  public QGBusImpl OooO00o;
  
  public QGBus(Context paramContext)
  {
    QGBusImpl localQGBusImpl = QGBusImpl.getInstance();
    this.OooO00o = localQGBusImpl;
    localQGBusImpl.setContext(paramContext);
  }
  
  public void OooO00o(QGBusEvent paramQGBusEvent)
  {
    this.OooO00o.OooOOOo(paramQGBusEvent);
  }
  
  public void OooO0O0(QGBusEventFilter paramQGBusEventFilter, QGBusEventHandler paramQGBusEventHandler)
  {
    this.OooO00o.OooOOo(paramQGBusEventFilter, paramQGBusEventHandler);
  }
  
  public void OooO0OO(QGBusEventFilter paramQGBusEventFilter)
  {
    this.OooO00o.OooOo0(paramQGBusEventFilter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.QGBus
 * JD-Core Version:    0.7.0.1
 */