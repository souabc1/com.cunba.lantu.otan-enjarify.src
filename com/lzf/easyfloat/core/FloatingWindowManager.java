package com.lzf.easyfloat.core;

import android.content.Context;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.FloatCallbacks;
import com.lzf.easyfloat.interfaces.FloatCallbacks.Builder;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;
import com.lzf.easyfloat.utils.Logger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class FloatingWindowManager
{
  public static final FloatingWindowManager OooO00o;
  public static final ConcurrentHashMap OooO0O0;
  
  static
  {
    Object localObject = new com/lzf/easyfloat/core/FloatingWindowManager;
    ((FloatingWindowManager)localObject).<init>();
    OooO00o = (FloatingWindowManager)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooO0O0 = (ConcurrentHashMap)localObject;
  }
  
  public final boolean OooO00o(FloatConfig paramFloatConfig)
  {
    Object localObject = paramFloatConfig.getFloatTag();
    localObject = OooO0o0((String)localObject);
    paramFloatConfig.setFloatTag((String)localObject);
    localObject = OooO0O0;
    paramFloatConfig = paramFloatConfig.getFloatTag();
    Intrinsics.OooO0OO(paramFloatConfig);
    return ((ConcurrentHashMap)localObject).containsKey(paramFloatConfig);
  }
  
  public final void OooO0O0(Context paramContext, FloatConfig paramFloatConfig)
  {
    Object localObject = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    localObject = m54207b69.F54207b69_11("'p132020191D1C");
    Intrinsics.OooO0o(paramFloatConfig, (String)localObject);
    boolean bool = OooO00o(paramFloatConfig);
    if (!bool)
    {
      localObject = new com/lzf/easyfloat/core/FloatingWindowHelper;
      ((FloatingWindowHelper)localObject).<init>(paramContext, paramFloatConfig);
      paramContext = new com/lzf/easyfloat/core/FloatingWindowManager$create$1;
      paramContext.<init>(paramFloatConfig, (FloatingWindowHelper)localObject);
      ((FloatingWindowHelper)localObject).OooOO0O(paramContext);
    }
    else
    {
      paramContext = paramFloatConfig.getCallbacks();
      bool = false;
      localObject = null;
      String str = m54207b69.F54207b69_11(";U0135347834323C372D2A46454788831B4A31874E4445478C39538F414C3E93505C5455534B5561489D395E51584067696452A7546867B1");
      if (paramContext != null) {
        paramContext.OooO0o0(false, str, null);
      }
      paramContext = paramFloatConfig.getFloatCallbacks();
      if (paramContext != null)
      {
        paramContext = paramContext.getBuilder();
        if (paramContext != null)
        {
          paramContext = paramContext.getCreatedResult$easyfloat_release();
          if (paramContext != null)
          {
            paramFloatConfig = Boolean.FALSE;
            paramContext.OooO0OO(paramFloatConfig, str, null);
          }
        }
      }
      paramContext = Logger.OooO00o;
      paramContext.OooO0o0(str);
    }
  }
  
  public final Unit OooO0OO(String paramString, boolean paramBoolean)
  {
    paramString = OooO0Oo(paramString);
    if (paramString == null)
    {
      paramString = null;
    }
    else
    {
      if (paramBoolean) {
        paramString.OooOOo(paramBoolean);
      } else {
        paramString.OooOOOO();
      }
      paramString = Unit.OooO00o;
    }
    return paramString;
  }
  
  public final FloatingWindowHelper OooO0Oo(String paramString)
  {
    ConcurrentHashMap localConcurrentHashMap = OooO0O0;
    paramString = OooO0o0(paramString);
    return (FloatingWindowHelper)localConcurrentHashMap.get(paramString);
  }
  
  public final FloatingWindowHelper OooO0o(String paramString)
  {
    ConcurrentHashMap localConcurrentHashMap = OooO0O0;
    paramString = OooO0o0(paramString);
    return (FloatingWindowHelper)localConcurrentHashMap.remove(paramString);
  }
  
  public final String OooO0o0(String paramString)
  {
    if (paramString == null) {
      paramString = m54207b69.F54207b69_11("TI2D2D312B402A43");
    }
    return paramString;
  }
  
  public final Unit OooO0oO(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    paramString = OooO0Oo(paramString);
    Unit localUnit;
    if (paramString == null)
    {
      paramBoolean1 = false;
      localUnit = null;
    }
    else
    {
      if (paramBoolean1)
      {
        paramBoolean1 = false;
        localUnit = null;
      }
      else
      {
        paramBoolean1 = true;
      }
      paramString.setVisible(paramBoolean1, paramBoolean2);
      localUnit = Unit.OooO00o;
    }
    return localUnit;
  }
  
  public final ConcurrentHashMap getWindowMap()
  {
    return OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.core.FloatingWindowManager
 * JD-Core Version:    0.7.0.1
 */