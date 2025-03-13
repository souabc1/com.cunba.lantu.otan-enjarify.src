package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class ViewModel
{
  public final Map OooO00o;
  public final Set OooO0O0;
  public volatile boolean OooO0OO;
  
  public ViewModel()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO00o = ((Map)localObject);
    localObject = new java/util/LinkedHashSet;
    ((LinkedHashSet)localObject).<init>();
    this.OooO0O0 = ((Set)localObject);
    this.OooO0OO = false;
  }
  
  public static void OooO0OO(Object paramObject)
  {
    boolean bool = paramObject instanceof Closeable;
    if (bool) {
      try
      {
        paramObject = (Closeable)paramObject;
        paramObject.close();
      }
      catch (IOException paramObject)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>(paramObject);
        throw localRuntimeException;
      }
    }
  }
  
  public final void OooO0O0()
  {
    boolean bool1 = true;
    this.OooO0OO = bool1;
    Object localObject1 = this.OooO00o;
    boolean bool2;
    Object localObject6;
    if (localObject1 != null) {
      try
      {
        Object localObject2 = this.OooO00o;
        localObject2 = ((Map)localObject2).values();
        localObject2 = ((Collection)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject6 = ((Iterator)localObject2).next();
          OooO0OO(localObject6);
        }
      }
      finally {}
    }
    localObject1 = this.OooO0O0;
    if (localObject1 != null) {
      try
      {
        Object localObject4 = this.OooO0O0;
        localObject4 = ((Set)localObject4).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject6 = ((Iterator)localObject4).next();
          localObject6 = (Closeable)localObject6;
          OooO0OO(localObject6);
        }
      }
      finally {}
    }
    OooO0o0();
  }
  
  public Object OooO0Oo(String paramString)
  {
    Map localMap1 = this.OooO00o;
    if (localMap1 == null) {
      return null;
    }
    try
    {
      Map localMap2 = this.OooO00o;
      paramString = localMap2.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public Object OooO0o(String paramString, Object paramObject)
  {
    synchronized (this.OooO00o)
    {
      Object localObject = this.OooO00o;
      localObject = ((Map)localObject).get(paramString);
      if (localObject == null)
      {
        Map localMap2 = this.OooO00o;
        localMap2.put(paramString, paramObject);
      }
      if (localObject != null) {
        paramObject = localObject;
      }
      boolean bool = this.OooO0OO;
      if (bool) {
        OooO0OO(paramObject);
      }
      return paramObject;
    }
  }
  
  public void OooO0o0() {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModel
 * JD-Core Version:    0.7.0.1
 */