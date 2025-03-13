package com.lzf.easyfloat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.lzf.easyfloat.core.FloatingWindowHelper;
import com.lzf.easyfloat.core.FloatingWindowManager;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.utils.LifecycleUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class EasyFloat$Companion
{
  public final Unit OooO00o(String paramString, boolean paramBoolean)
  {
    return FloatingWindowManager.OooO00o.OooO0OO(paramString, paramBoolean);
  }
  
  public final FloatConfig OooO0O0(String paramString)
  {
    FloatingWindowManager localFloatingWindowManager = FloatingWindowManager.OooO00o;
    paramString = localFloatingWindowManager.OooO0Oo(paramString);
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = paramString.getConfig();
    }
    return paramString;
  }
  
  public final View OooO0OO(String paramString)
  {
    paramString = OooO0O0(paramString);
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = paramString.getLayoutView();
    }
    return paramString;
  }
  
  public final boolean OooO0o0(String paramString)
  {
    paramString = OooO0O0(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      paramString = null;
    }
    else
    {
      bool = paramString.isShow();
    }
    return bool;
  }
  
  public final EasyFloat.Builder OooO0oO(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11(":'4645555155535965");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    boolean bool = paramContext instanceof Activity;
    if (bool)
    {
      localObject = new com/lzf/easyfloat/EasyFloat$Builder;
      ((EasyFloat.Builder)localObject).<init>((Context)paramContext);
    }
    else
    {
      localObject = new com/lzf/easyfloat/EasyFloat$Builder;
      Activity localActivity = LifecycleUtils.OooO00o.getTopActivity();
      if (localActivity != null) {
        paramContext = localActivity;
      }
      ((EasyFloat.Builder)localObject).<init>(paramContext);
    }
    return localObject;
  }
  
  public final View getFloatView()
  {
    return OooO0Oo(this, null, 1, null);
  }
  
  public final boolean isShow()
  {
    return OooO0o(this, null, 1, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.EasyFloat.Companion
 * JD-Core Version:    0.7.0.1
 */