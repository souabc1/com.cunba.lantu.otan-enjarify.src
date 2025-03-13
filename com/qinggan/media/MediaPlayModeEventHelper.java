package com.qinggan.media;

import android.os.BaseBundle;
import android.os.Bundle;
import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import m54207b69;

public class MediaPlayModeEventHelper
{
  public MediaPlayModeEventHelper.MediaPlayModeEventHandler OooO00o;
  public QGBus OooO0O0;
  public QGBusEventHandler OooO0OO;
  
  public final boolean OooO0OO(QGBusEvent paramQGBusEvent)
  {
    Bundle localBundle = paramQGBusEvent.getData();
    boolean bool = true;
    if (localBundle == null) {
      return bool;
    }
    paramQGBusEvent.getEventType();
    paramQGBusEvent = m54207b69.F54207b69_11("FI283A3B20343E32");
    int i = localBundle.getInt(paramQGBusEvent);
    Object localObject = m54207b69.F54207b69_11("M(58454B54694C5254845A6258");
    int j = localBundle.getInt((String)localObject);
    localObject = new com/qinggan/media/MediaPlayMode;
    ((MediaPlayMode)localObject).<init>();
    ((MediaPlayMode)localObject).setAppType(i);
    ((MediaPlayMode)localObject).setPlayModeType(j);
    this.OooO00o.OooO00o((MediaPlayMode)localObject);
    return bool;
  }
  
  public final boolean OooO0Oo(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("Hw3A1315211A5D2D423E3744433F3F");
    boolean bool = str2.equals(str1);
    if (!bool)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("XI042D2F232C1E2B2F380D303838194D3B374E133F394E4252");
      str1 = m54207b69.F54207b69_11("N;1A776062565F1A727F836C81808C8C2A596F61615D6A");
      Log.OooO00o(paramQGBusEvent, str1);
      return false;
    }
    return OooO0OO(paramQGBusEvent);
  }
  
  public final void OooO0o()
  {
    Object localObject1 = this.OooO0O0;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("Hw3A1315211A5D2D423E3744433F3F");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO0O0;
      ((QGBus)localObject2).OooO0OO((QGBusEventFilter)localObject1);
    }
  }
  
  public final void OooO0o0()
  {
    Object localObject1 = this.OooO0O0;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("Hw3A1315211A5D2D423E3744433F3F");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO0O0;
      QGBusEventHandler localQGBusEventHandler = this.OooO0OO;
      ((QGBus)localObject2).OooO0O0((QGBusEventFilter)localObject1, localQGBusEventHandler);
    }
  }
  
  public void setMediaPlayModeEventHandler(MediaPlayModeEventHelper.MediaPlayModeEventHandler paramMediaPlayModeEventHandler)
  {
    MediaPlayModeEventHelper.MediaPlayModeEventHandler localMediaPlayModeEventHandler = this.OooO00o;
    if (paramMediaPlayModeEventHandler == null)
    {
      if (localMediaPlayModeEventHandler != null) {
        OooO0o();
      }
    }
    else if (localMediaPlayModeEventHandler == null) {
      OooO0o0();
    }
    this.OooO00o = paramMediaPlayModeEventHandler;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.MediaPlayModeEventHelper
 * JD-Core Version:    0.7.0.1
 */