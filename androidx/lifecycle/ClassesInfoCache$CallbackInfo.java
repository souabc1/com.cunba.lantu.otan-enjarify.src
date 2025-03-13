package androidx.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ClassesInfoCache$CallbackInfo
{
  public final Map OooO00o;
  public final Map OooO0O0;
  
  public ClassesInfoCache$CallbackInfo(Map paramMap)
  {
    this.OooO0O0 = paramMap;
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.OooO00o = ((Map)localObject1);
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      boolean bool = paramMap.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)paramMap.next();
      Lifecycle.Event localEvent = (Lifecycle.Event)((Map.Entry)localObject1).getValue();
      Object localObject2 = (List)this.OooO00o.get(localEvent);
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        Map localMap = this.OooO00o;
        localMap.put(localEvent, localObject2);
      }
      localObject1 = (ClassesInfoCache.MethodReference)((Map.Entry)localObject1).getKey();
      ((List)localObject2).add(localObject1);
    }
  }
  
  public static void OooO0O0(List paramList, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
  {
    if (paramList != null)
    {
      int i = paramList.size() + -1;
      while (i >= 0)
      {
        ClassesInfoCache.MethodReference localMethodReference = (ClassesInfoCache.MethodReference)paramList.get(i);
        localMethodReference.OooO00o(paramLifecycleOwner, paramEvent, paramObject);
        i += -1;
      }
    }
  }
  
  public void OooO00o(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
  {
    OooO0O0((List)this.OooO00o.get(paramEvent), paramLifecycleOwner, paramEvent, paramObject);
    Map localMap = this.OooO00o;
    Lifecycle.Event localEvent = Lifecycle.Event.ON_ANY;
    OooO0O0((List)localMap.get(localEvent), paramLifecycleOwner, paramEvent, paramObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache.CallbackInfo
 * JD-Core Version:    0.7.0.1
 */