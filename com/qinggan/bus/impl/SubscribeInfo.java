package com.qinggan.bus.impl;

import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class SubscribeInfo
{
  public Map OooO00o = null;
  
  public SubscribeInfo()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public void OooO00o(QGBusEventFilter paramQGBusEventFilter, QGBusEventHandler paramQGBusEventHandler)
  {
    if ((paramQGBusEventFilter != null) && (paramQGBusEventHandler != null))
    {
      paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
      if (paramQGBusEventFilter != null)
      {
        paramQGBusEventFilter = paramQGBusEventFilter.iterator();
        for (;;)
        {
          boolean bool = paramQGBusEventFilter.hasNext();
          if (!bool) {
            break;
          }
          String str = (String)paramQGBusEventFilter.next();
          Map localMap = this.OooO00o;
          localMap.put(str, paramQGBusEventHandler);
        }
      }
    }
  }
  
  public void OooO0O0(QGBusEvent paramQGBusEvent)
  {
    if (paramQGBusEvent != null)
    {
      Object localObject = paramQGBusEvent.getEventType();
      if (localObject != null)
      {
        Map localMap = this.OooO00o;
        localObject = (QGBusEventHandler)localMap.get(localObject);
        if (localObject != null) {
          ((QGBusEventHandler)localObject).OooO00o(paramQGBusEvent);
        }
      }
    }
  }
  
  public void OooO0OO(QGBusEventFilter paramQGBusEventFilter)
  {
    if (paramQGBusEventFilter == null) {
      return;
    }
    paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
    if (paramQGBusEventFilter != null)
    {
      paramQGBusEventFilter = paramQGBusEventFilter.iterator();
      for (;;)
      {
        boolean bool = paramQGBusEventFilter.hasNext();
        if (!bool) {
          break;
        }
        String str = (String)paramQGBusEventFilter.next();
        Map localMap = this.OooO00o;
        localMap.remove(str);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.impl.SubscribeInfo
 * JD-Core Version:    0.7.0.1
 */