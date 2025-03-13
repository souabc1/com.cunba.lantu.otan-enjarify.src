package com.lzf.easyfloat.utils;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.lzf.easyfloat.core.FloatingWindowHelper;
import com.lzf.easyfloat.core.FloatingWindowManager;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.enums.ShowPattern;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class LifecycleUtils
{
  public static final LifecycleUtils OooO00o;
  public static Application OooO0O0;
  public static int OooO0OO;
  public static WeakReference OooO0Oo;
  
  static
  {
    LifecycleUtils localLifecycleUtils = new com/lzf/easyfloat/utils/LifecycleUtils;
    localLifecycleUtils.<init>();
    OooO00o = localLifecycleUtils;
  }
  
  public final Unit OooO(boolean paramBoolean, String paramString)
  {
    return FloatingWindowManager.OooO0oo(FloatingWindowManager.OooO00o, paramBoolean, paramString, false, 4, null);
  }
  
  public final void OooO0oO(Activity paramActivity)
  {
    boolean bool1 = paramActivity.isFinishing();
    if (!bool1)
    {
      bool1 = isForeground();
      if (bool1) {
        return;
      }
    }
    Iterator localIterator = FloatingWindowManager.OooO00o.getWindowMap().entrySet().iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Object localObject1 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (FloatingWindowHelper)((Map.Entry)localObject1).getValue();
      boolean bool3 = paramActivity.isFinishing();
      boolean bool4 = true;
      Object localObject4;
      if (bool3)
      {
        localObject2 = ((FloatingWindowHelper)localObject1).getParams().token;
        if (localObject2 != null)
        {
          localObject3 = paramActivity.getWindow();
          bool5 = false;
          localObject4 = null;
          if (localObject3 != null)
          {
            localObject3 = ((Window)localObject3).getDecorView();
            if (localObject3 != null) {
              localObject4 = ((View)localObject3).getWindowToken();
            }
          }
          bool3 = Intrinsics.OooO00o(localObject2, localObject4);
          if (bool3)
          {
            localObject2 = FloatingWindowManager.OooO00o;
            ((FloatingWindowManager)localObject2).OooO0OO(str, bool4);
          }
        }
      }
      Object localObject2 = ((FloatingWindowHelper)localObject1).getConfig();
      Object localObject3 = OooO00o;
      boolean bool5 = ((LifecycleUtils)localObject3).isForeground();
      if (!bool5)
      {
        localObject1 = ((FloatingWindowHelper)localObject1).getConfig().getShowPattern();
        localObject4 = ShowPattern.o00OoOoo;
        if (localObject1 != localObject4)
        {
          localObject1 = ((FloatConfig)localObject2).getShowPattern();
          localObject4 = ShowPattern.o00Ooo00;
          if (localObject1 != localObject4)
          {
            bool2 = ((FloatConfig)localObject2).getNeedShow$easyfloat_release();
            if (bool2) {}
          }
          else
          {
            bool4 = false;
          }
          ((LifecycleUtils)localObject3).OooO(bool4, str);
        }
      }
    }
  }
  
  public final void OooO0oo(Activity paramActivity)
  {
    Iterator localIterator = FloatingWindowManager.OooO00o.getWindowMap().entrySet().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject1).getKey();
      localObject1 = ((FloatingWindowHelper)((Map.Entry)localObject1).getValue()).getConfig();
      Object localObject2 = ((FloatConfig)localObject1).getShowPattern();
      Object localObject3 = ShowPattern.o00OoOoo;
      if (localObject2 != localObject3)
      {
        localObject2 = ((FloatConfig)localObject1).getShowPattern();
        localObject3 = ShowPattern.o00Ooo0;
        boolean bool2;
        if (localObject2 == localObject3)
        {
          localObject1 = OooO00o;
          bool2 = false;
          localObject2 = null;
          ((LifecycleUtils)localObject1).OooO(false, str);
        }
        else
        {
          bool2 = ((FloatConfig)localObject1).getNeedShow$easyfloat_release();
          if (bool2)
          {
            localObject2 = OooO00o;
            localObject1 = ((FloatConfig)localObject1).getFilterSet();
            localObject3 = paramActivity.getComponentName().getClassName();
            bool1 = ((Set)localObject1).contains(localObject3) ^ true;
            ((LifecycleUtils)localObject2).OooO(bool1, str);
          }
        }
      }
    }
  }
  
  public final Application getApplication()
  {
    Application localApplication = OooO0O0;
    if (localApplication != null) {
      return localApplication;
    }
    Intrinsics.OooOo(m54207b69.F54207b69_11("WG2638392E32292C3A363133"));
    return null;
  }
  
  public final Activity getTopActivity()
  {
    Object localObject = OooO0Oo;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (Activity)((Reference)localObject).get();
    }
    return localObject;
  }
  
  public final boolean isForeground()
  {
    int i = OooO0OO;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final void setApplication(Application paramApplication)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramApplication, str);
    OooO0O0 = paramApplication;
  }
  
  public final void setLifecycleCallbacks(Application paramApplication)
  {
    Object localObject = m54207b69.F54207b69_11("WG2638392E32292C3A363133");
    Intrinsics.OooO0o(paramApplication, (String)localObject);
    setApplication(paramApplication);
    localObject = new com/lzf/easyfloat/utils/LifecycleUtils$setLifecycleCallbacks$1;
    ((LifecycleUtils.setLifecycleCallbacks.1)localObject).<init>();
    paramApplication.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.utils.LifecycleUtils
 * JD-Core Version:    0.7.0.1
 */