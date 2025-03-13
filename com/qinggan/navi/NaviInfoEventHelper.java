package com.qinggan.navi;

import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import m54207b69;

public class NaviInfoEventHelper
{
  public NaviInfoEventHandlerDelegate OooO00o;
  public QGBus OooO0O0;
  public QGBusEventHandler OooO0OO;
  
  public final void OooO0O0()
  {
    QGBusEventFilter localQGBusEventFilter = new com/qinggan/bus/QGBusEventFilter;
    localQGBusEventFilter.<init>();
    Object localObject = m54207b69.F54207b69_11("'y371911135A3C1E161839212A22");
    localQGBusEventFilter.OooO00o((String)localObject);
    localObject = m54207b69.F54207b69_11("nW193723417C1E3C28432440443E2B3F4848");
    localQGBusEventFilter.OooO00o((String)localObject);
    localObject = m54207b69.F54207b69_11("WJ042C3E26690931432E12353135103A3335");
    localQGBusEventFilter.OooO00o((String)localObject);
    localObject = this.OooO0O0;
    QGBusEventHandler localQGBusEventHandler = this.OooO0OO;
    ((QGBus)localObject).OooO0O0(localQGBusEventFilter, localQGBusEventHandler);
  }
  
  public void setNaviInfoEventHandler(NaviInfoEventHandler paramNaviInfoEventHandler)
  {
    if (paramNaviInfoEventHandler == null) {
      return;
    }
    NaviInfoEventHandlerDelegate localNaviInfoEventHandlerDelegate = this.OooO00o;
    if (localNaviInfoEventHandlerDelegate == null)
    {
      localNaviInfoEventHandlerDelegate = new com/qinggan/navi/NaviInfoEventHandlerDelegate;
      localNaviInfoEventHandlerDelegate.<init>();
      this.OooO00o = localNaviInfoEventHandlerDelegate;
      OooO0O0();
      localNaviInfoEventHandlerDelegate = this.OooO00o;
    }
    localNaviInfoEventHandlerDelegate.OooO00o(paramNaviInfoEventHandler);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviInfoEventHelper
 * JD-Core Version:    0.7.0.1
 */