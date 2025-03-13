package com.lzf.easyfloat.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewManager;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.lzf.easyfloat.core.FloatingWindowHelper;
import com.lzf.easyfloat.core.FloatingWindowManager;
import com.lzf.easyfloat.widget.ParentFrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class InputMethodUtils
{
  public static final InputMethodUtils OooO00o;
  
  static
  {
    InputMethodUtils localInputMethodUtils = new com/lzf/easyfloat/utils/InputMethodUtils;
    localInputMethodUtils.<init>();
    OooO00o = localInputMethodUtils;
  }
  
  public static final Unit OooO0OO(String paramString)
  {
    Object localObject = FloatingWindowManager.OooO00o;
    paramString = ((FloatingWindowManager)localObject).OooO0Oo(paramString);
    if (paramString == null)
    {
      paramString = null;
    }
    else
    {
      localObject = paramString.getParams();
      int i = 40;
      ((WindowManager.LayoutParams)localObject).flags = i;
      localObject = paramString.getWindowManager();
      ParentFrameLayout localParentFrameLayout = paramString.getFrameLayout();
      paramString = paramString.getParams();
      ((ViewManager)localObject).updateViewLayout(localParentFrameLayout, paramString);
      paramString = Unit.OooO00o;
    }
    return paramString;
  }
  
  public static final void OooO0o(EditText paramEditText, String paramString)
  {
    Object localObject = m54207b69.F54207b69_11("lP35353B27083A2E2B");
    Intrinsics.OooO0o(paramEditText, (String)localObject);
    localObject = FloatingWindowManager.OooO00o;
    paramString = ((FloatingWindowManager)localObject).OooO0Oo(paramString);
    if (paramString != null)
    {
      localObject = paramString.getParams();
      int i = 32;
      ((WindowManager.LayoutParams)localObject).flags = i;
      localObject = paramString.getWindowManager();
      ParentFrameLayout localParentFrameLayout = paramString.getFrameLayout();
      paramString = paramString.getParams();
      ((ViewManager)localObject).updateViewLayout(localParentFrameLayout, paramString);
    }
    paramString = new android/os/Handler;
    localObject = Looper.getMainLooper();
    paramString.<init>((Looper)localObject);
    localObject = new com/lzf/easyfloat/utils/OooO0O0;
    ((OooO0O0)localObject).<init>(paramEditText);
    paramString.postDelayed((Runnable)localObject, 100);
  }
  
  public static final boolean OooO0o0(EditText paramEditText, String paramString, View paramView, MotionEvent paramMotionEvent)
  {
    paramView = m54207b69.F54207b69_11("Ld400202101435072318");
    Intrinsics.OooO0o(paramEditText, paramView);
    int i = paramMotionEvent.getAction();
    if (i == 0) {
      OooO0o(paramEditText, paramString);
    }
    return false;
  }
  
  public static final void OooO0oO(EditText paramEditText)
  {
    Object localObject = m54207b69.F54207b69_11("Ld400202101435072318");
    Intrinsics.OooO0o(paramEditText, (String)localObject);
    localObject = paramEditText.getContext();
    String str = m54207b69.F54207b69_11("eS3A3E25292B11443D2F444642");
    localObject = (InputMethodManager)((Context)localObject).getSystemService(str);
    if (localObject != null)
    {
      str = null;
      ((InputMethodManager)localObject).showSoftInput(paramEditText, 0);
    }
  }
  
  public final void OooO0Oo(EditText paramEditText, String paramString)
  {
    Object localObject = m54207b69.F54207b69_11("lP35353B27083A2E2B");
    Intrinsics.OooO0o(paramEditText, (String)localObject);
    localObject = new com/lzf/easyfloat/utils/OooO00o;
    ((OooO00o)localObject).<init>(paramEditText, paramString);
    paramEditText.setOnTouchListener((View.OnTouchListener)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.utils.InputMethodUtils
 * JD-Core Version:    0.7.0.1
 */