package com.qinggan.wifi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class WifiTracker$Multimap
{
  public final HashMap OooO00o;
  
  private WifiTracker$Multimap()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public List OooO00o(Object paramObject)
  {
    HashMap localHashMap = this.OooO00o;
    paramObject = (List)localHashMap.get(paramObject);
    if (paramObject == null) {
      paramObject = Collections.emptyList();
    }
    return paramObject;
  }
  
  public void OooO0O0(Object paramObject1, Object paramObject2)
  {
    Object localObject = (List)this.OooO00o.get(paramObject1);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      int i = 3;
      ((ArrayList)localObject).<init>(i);
      HashMap localHashMap = this.OooO00o;
      localHashMap.put(paramObject1, localObject);
    }
    ((List)localObject).add(paramObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker.Multimap
 * JD-Core Version:    0.7.0.1
 */