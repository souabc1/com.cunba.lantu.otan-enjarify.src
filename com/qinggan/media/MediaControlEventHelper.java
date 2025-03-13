package com.qinggan.media;

import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import java.util.ArrayList;
import m54207b69;

public class MediaControlEventHelper
{
  public QGBus OooO00o;
  public QGBusEventHandler OooO0O0;
  public ArrayList OooO0OO;
  
  public final void OooO0O0()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("%07D56565C55247986866D6C8A88");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("'&6B4444524B0E7C716F88");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO00o;
      QGBusEventHandler localQGBusEventHandler = this.OooO0O0;
      ((QGBus)localObject2).OooO0O0((QGBusEventFilter)localObject1, localQGBusEventHandler);
    }
  }
  
  public void setMediaControlEventHandler(MediaControlEventHelper.MediaControlEventHandler paramMediaControlEventHandler)
  {
    if (paramMediaControlEventHandler == null)
    {
      if (paramMediaControlEventHandler == null)
      {
        paramMediaControlEventHandler = m54207b69.F54207b69_11(";M00292B273013282A41482C2C1448363249163A34513D55");
        localObject = m54207b69.F54207b69_11("-y0A1D0F3D3F5E3A232519224522241B1A26264E22302C2348303037303828772F2A7A392F393A");
        Log.OooO0O0(paramMediaControlEventHandler, (String)localObject);
      }
    }
    else
    {
      localObject = this.OooO0OO;
      if (localObject != null)
      {
        boolean bool = ((ArrayList)localObject).isEmpty();
        if (bool) {
          OooO0O0();
        }
      }
    }
    Object localObject = this.OooO0OO;
    if (localObject != null) {
      ((ArrayList)localObject).add(paramMediaControlEventHandler);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.MediaControlEventHelper
 * JD-Core Version:    0.7.0.1
 */