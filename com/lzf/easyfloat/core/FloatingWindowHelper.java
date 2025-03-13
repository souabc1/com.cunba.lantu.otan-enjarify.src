package com.lzf.easyfloat.core;

import OooO0o0.OooO0OO;
import OooO0o0.OooO0o;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import com.lzf.easyfloat.anim.AnimatorManager;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.interfaces.FloatCallbacks;
import com.lzf.easyfloat.interfaces.FloatCallbacks.Builder;
import com.lzf.easyfloat.interfaces.OnDisplayHeight;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;
import com.lzf.easyfloat.interfaces.OnFloatTouchListener;
import com.lzf.easyfloat.utils.DisplayUtils;
import com.lzf.easyfloat.utils.InputMethodUtils;
import com.lzf.easyfloat.utils.LifecycleUtils;
import com.lzf.easyfloat.utils.Logger;
import com.lzf.easyfloat.widget.ParentFrameLayout;
import com.lzf.easyfloat.widget.ParentFrameLayout.OnLayoutListener;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class FloatingWindowHelper
{
  public int OooO;
  public final Context OooO00o;
  public FloatConfig OooO0O0;
  public WindowManager OooO0OO;
  public WindowManager.LayoutParams OooO0Oo;
  public TouchUtils OooO0o;
  public ParentFrameLayout OooO0o0;
  public Animator OooO0oO;
  public int OooO0oo;
  
  public FloatingWindowHelper(Context paramContext, FloatConfig paramFloatConfig)
  {
    this.OooO00o = paramContext;
    this.OooO0O0 = paramFloatConfig;
    int i = -1;
    this.OooO0oo = i;
    this.OooO = i;
  }
  
  public static final void OooOO0o(FloatingWindowHelper.CreateCallback paramCreateCallback, FloatingWindowHelper paramFloatingWindowHelper)
  {
    String str = m54207b69.F54207b69_11(";|58201F13142323261F");
    Intrinsics.OooO0o(paramCreateCallback, str);
    str = m54207b69.F54207b69_11("1Z2E33352C826F");
    Intrinsics.OooO0o(paramFloatingWindowHelper, str);
    boolean bool = paramFloatingWindowHelper.OooOOO0();
    paramCreateCallback.OooO00o(bool);
  }
  
  public static final void OooOo0(FloatingWindowHelper paramFloatingWindowHelper, ParentFrameLayout paramParentFrameLayout)
  {
    Object localObject = m54207b69.F54207b69_11("1Z2E33352C826F");
    Intrinsics.OooO0o(paramFloatingWindowHelper, (String)localObject);
    localObject = m54207b69.F54207b69_11("7^7A2B383A31064535363B31");
    Intrinsics.OooO0o(paramParentFrameLayout, (String)localObject);
    int i = paramFloatingWindowHelper.OooO0oo;
    int j = 0;
    WindowManager.LayoutParams localLayoutParams1 = null;
    int k = 1;
    int m = -1;
    if (i != m)
    {
      n = paramFloatingWindowHelper.OooO;
      if (n != m)
      {
        m = 0;
        break label71;
      }
    }
    m = k;
    label71:
    int n = paramParentFrameLayout.getMeasuredWidth();
    if (i == n)
    {
      i = paramFloatingWindowHelper.OooO;
      n = paramParentFrameLayout.getMeasuredHeight();
      if (i == n) {
        j = k;
      }
    }
    if ((m == 0) && (j == 0))
    {
      localObject = paramFloatingWindowHelper.getConfig();
      i = ((FloatConfig)localObject).getLayoutChangedGravity();
      j = 8388611;
      i &= j;
      m = 17;
      WindowManager.LayoutParams localLayoutParams2;
      if (i != j)
      {
        localObject = paramFloatingWindowHelper.getConfig();
        i = ((FloatConfig)localObject).getLayoutChangedGravity();
        j = 8388613;
        i &= j;
        if (i == j)
        {
          i = paramParentFrameLayout.getMeasuredWidth();
          j = paramFloatingWindowHelper.OooO0oo;
          i -= j;
          localLayoutParams1 = paramFloatingWindowHelper.getParams();
          localLayoutParams2 = paramFloatingWindowHelper.getParams();
        }
        for (k = localLayoutParams2.x - i;; k = localLayoutParams1.x + i)
        {
          localLayoutParams1.x = k;
          break;
          localObject = paramFloatingWindowHelper.getConfig();
          i = ((FloatConfig)localObject).getLayoutChangedGravity() & k;
          if (i != k)
          {
            localObject = paramFloatingWindowHelper.getConfig();
            i = ((FloatConfig)localObject).getLayoutChangedGravity() & m;
            if (i != m) {
              break;
            }
          }
          i = paramFloatingWindowHelper.OooO0oo / 2;
          j = paramParentFrameLayout.getMeasuredWidth() / 2;
          i -= j;
          localLayoutParams1 = paramFloatingWindowHelper.getParams();
        }
      }
      localObject = paramFloatingWindowHelper.getConfig();
      i = ((FloatConfig)localObject).getLayoutChangedGravity();
      j = 48;
      i &= j;
      if (i != j)
      {
        localObject = paramFloatingWindowHelper.getConfig();
        i = ((FloatConfig)localObject).getLayoutChangedGravity();
        j = 80;
        i &= j;
        if (i == j)
        {
          i = paramParentFrameLayout.getMeasuredHeight();
          j = paramFloatingWindowHelper.OooO;
          i -= j;
          localLayoutParams1 = paramFloatingWindowHelper.getParams();
          localLayoutParams2 = paramFloatingWindowHelper.getParams();
        }
        for (k = localLayoutParams2.y - i;; k = localLayoutParams1.y + i)
        {
          localLayoutParams1.y = k;
          break;
          localObject = paramFloatingWindowHelper.getConfig();
          i = ((FloatConfig)localObject).getLayoutChangedGravity();
          j = 16;
          i &= j;
          if (i != j)
          {
            localObject = paramFloatingWindowHelper.getConfig();
            i = ((FloatConfig)localObject).getLayoutChangedGravity() & m;
            if (i != m) {
              break;
            }
          }
          i = paramFloatingWindowHelper.OooO / 2;
          j = paramParentFrameLayout.getMeasuredHeight() / 2;
          i -= j;
          localLayoutParams1 = paramFloatingWindowHelper.getParams();
        }
      }
      i = paramParentFrameLayout.getMeasuredWidth();
      paramFloatingWindowHelper.OooO0oo = i;
      int i1 = paramParentFrameLayout.getMeasuredHeight();
      paramFloatingWindowHelper.OooO = i1;
      paramParentFrameLayout = paramFloatingWindowHelper.getWindowManager();
      localObject = paramFloatingWindowHelper.getFrameLayout();
      paramFloatingWindowHelper = paramFloatingWindowHelper.getParams();
      paramParentFrameLayout.updateViewLayout((View)localObject, paramFloatingWindowHelper);
    }
  }
  
  private final Activity getActivity()
  {
    Object localObject = this.OooO00o;
    boolean bool = localObject instanceof Activity;
    if (bool) {
      localObject = (Activity)localObject;
    } else {
      localObject = LifecycleUtils.OooO00o.getTopActivity();
    }
    return localObject;
  }
  
  private final IBinder getToken()
  {
    Object localObject = getActivity();
    IBinder localIBinder = null;
    if (localObject != null)
    {
      localObject = ((Activity)localObject).getWindow();
      if (localObject != null)
      {
        localObject = ((Window)localObject).getDecorView();
        if (localObject != null) {
          localIBinder = ((View)localObject).getWindowToken();
        }
      }
    }
    return localIBinder;
  }
  
  private final void setGravity(View paramView)
  {
    Object localObject1 = this.OooO0O0.getLocationPair();
    Object localObject2 = new kotlin/Pair;
    int i = 0;
    Object localObject3 = Integer.valueOf(0);
    ((Pair)localObject2).<init>(localObject3, localObject3);
    boolean bool1 = Intrinsics.OooO00o(localObject1, localObject2);
    if ((bool1) && (paramView != null))
    {
      localObject1 = new android/graphics/Rect;
      ((Rect)localObject1).<init>();
      getWindowManager().getDefaultDisplay().getRectSize((Rect)localObject1);
      localObject2 = new int[2];
      paramView.getLocationOnScreen((int[])localObject2);
      int k = 1;
      int m = localObject2[k];
      Object localObject4 = getParams();
      int n = ((WindowManager.LayoutParams)localObject4).y;
      if (m > n)
      {
        localObject2 = DisplayUtils.OooO00o;
        i = ((DisplayUtils)localObject2).OooOOO(paramView);
      }
      localObject2 = this.OooO0O0.getDisplayHeight();
      localObject4 = this.OooO00o;
      m = ((OnDisplayHeight)localObject2).OooO00o((Context)localObject4) - i;
      localObject4 = this.OooO0O0;
      n = ((FloatConfig)localObject4).getGravity();
      int i1;
      switch (n)
      {
      default: 
        break;
      case 85: 
      case 8388693: 
        localObject3 = getParams();
        j = ((Rect)localObject1).right;
        n = paramView.getWidth();
        j -= n;
        ((WindowManager.LayoutParams)localObject3).x = j;
        break;
      case 81: 
        localObject4 = getParams();
        j = ((Rect)localObject1).right;
        i1 = paramView.getWidth();
        j = j - i1 >> k;
        ((WindowManager.LayoutParams)localObject4).x = j;
      case 80: 
      case 83: 
      case 8388691: 
        localObject1 = getParams();
        k = paramView.getHeight();
        m -= k;
        break;
      case 21: 
      case 8388629: 
        localObject4 = getParams();
        j = ((Rect)localObject1).right;
        i1 = paramView.getWidth();
        j -= i1;
        break;
      case 17: 
        localObject4 = getParams();
        j = ((Rect)localObject1).right;
        i1 = paramView.getWidth();
        j = j - i1 >> k;
        ((WindowManager.LayoutParams)localObject4).x = j;
      case 16: 
      case 19: 
      case 8388627: 
        localObject1 = getParams();
        n = paramView.getHeight();
        m = m - n >> k;
        ((WindowManager.LayoutParams)localObject1).y = m;
        break;
      case 5: 
      case 53: 
      case 8388613: 
      case 8388661: 
        localObject2 = getParams();
        j = ((Rect)localObject1).right;
        k = paramView.getWidth();
        j -= k;
        break;
      }
      localObject2 = getParams();
      int j = ((Rect)localObject1).right;
      n = paramView.getWidth();
      j = j - n >> k;
      ((WindowManager.LayoutParams)localObject2).x = j;
      localObject1 = getParams();
      m = ((WindowManager.LayoutParams)localObject1).x;
      k = ((Number)this.OooO0O0.getOffsetPair().getFirst()).intValue();
      m += k;
      ((WindowManager.LayoutParams)localObject1).x = m;
      localObject1 = getParams();
      m = ((WindowManager.LayoutParams)localObject1).y;
      localObject3 = (Number)this.OooO0O0.getOffsetPair().getSecond();
      k = ((Number)localObject3).intValue();
      m += k;
      ((WindowManager.LayoutParams)localObject1).y = m;
      localObject1 = this.OooO0O0;
      boolean bool2 = ((FloatConfig)localObject1).getImmersionStatusBar();
      if (bool2)
      {
        localObject1 = this.OooO0O0.getShowPattern();
        localObject2 = ShowPattern.o00OoOoo;
        if (localObject1 == localObject2) {
          break label738;
        }
        localObject1 = getParams();
        m = ((WindowManager.LayoutParams)localObject1).y - i;
      }
      else
      {
        localObject1 = this.OooO0O0.getShowPattern();
        localObject2 = ShowPattern.o00OoOoo;
        if (localObject1 != localObject2) {
          break label738;
        }
        localObject1 = getParams();
        m = ((WindowManager.LayoutParams)localObject1).y + i;
      }
      ((WindowManager.LayoutParams)localObject1).y = m;
      label738:
      localObject1 = getWindowManager();
      localObject2 = getParams();
      ((ViewManager)localObject1).updateViewLayout(paramView, (ViewGroup.LayoutParams)localObject2);
    }
  }
  
  public final void OooO()
  {
    ParentFrameLayout localParentFrameLayout = new com/lzf/easyfloat/widget/ParentFrameLayout;
    Object localObject1 = this.OooO00o;
    Object localObject2 = this.OooO0O0;
    boolean bool = false;
    WindowManager.LayoutParams localLayoutParams = null;
    int i = 12;
    Object localObject3 = localParentFrameLayout;
    localParentFrameLayout.<init>((Context)localObject1, (FloatConfig)localObject2, null, 0, i, null);
    this.OooO0o0 = localParentFrameLayout;
    localObject3 = this.OooO0O0.getFloatTag();
    localParentFrameLayout.setTag(localObject3);
    localObject3 = this.OooO0O0.getLayoutView();
    if (localObject3 == null)
    {
      localObject3 = null;
    }
    else
    {
      localObject1 = getFrameLayout();
      if (localObject1 != null) {
        ((ViewGroup)localObject1).addView((View)localObject3);
      }
    }
    if (localObject3 == null)
    {
      localObject3 = LayoutInflater.from(this.OooO00o);
      localObject1 = this.OooO0O0.getLayoutId();
      Intrinsics.OooO0OO(localObject1);
      j = ((Integer)localObject1).intValue();
      localObject2 = this.OooO0o0;
      bool = true;
      localObject3 = ((LayoutInflater)localObject3).inflate(j, (ViewGroup)localObject2, bool);
    }
    int j = 4;
    ((View)localObject3).setVisibility(j);
    localObject1 = getWindowManager();
    localObject2 = this.OooO0o0;
    localLayoutParams = getParams();
    ((ViewManager)localObject1).addView((View)localObject2, localLayoutParams);
    localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject2 = new com/lzf/easyfloat/core/FloatingWindowHelper$addView$1;
      ((FloatingWindowHelper.addView.1)localObject2).<init>(this);
      ((ParentFrameLayout)localObject1).setTouchListener((OnFloatTouchListener)localObject2);
    }
    localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject2 = new com/lzf/easyfloat/core/FloatingWindowHelper$addView$2;
      ((FloatingWindowHelper.addView.2)localObject2).<init>(this, (View)localObject3);
      ((ParentFrameLayout)localObject1).setLayoutListener((ParentFrameLayout.OnLayoutListener)localObject2);
    }
    OooOo00();
  }
  
  public final void OooOO0(View paramView)
  {
    boolean bool = paramView instanceof EditText;
    if (bool)
    {
      InputMethodUtils localInputMethodUtils = InputMethodUtils.OooO00o;
      paramView = (EditText)paramView;
      String str = this.OooO0O0.getFloatTag();
      localInputMethodUtils.OooO0Oo(paramView, str);
    }
  }
  
  public final void OooOO0O(FloatingWindowHelper.CreateCallback paramCreateCallback)
  {
    Object localObject1 = m54207b69.F54207b69_11("KU36353B3C3B393C45");
    Intrinsics.OooO0o(paramCreateCallback, (String)localObject1);
    localObject1 = this.OooO0O0.getShowPattern();
    Object localObject2 = ShowPattern.o00OoOoo;
    if (localObject1 == localObject2)
    {
      localObject1 = getToken();
      if (localObject1 == null)
      {
        localObject1 = getActivity();
        int i;
        if (localObject1 != null)
        {
          i = 16908290;
          localObject1 = ((Activity)localObject1).findViewById(i);
          if (localObject1 != null) {}
        }
        else
        {
          bool = false;
          localObject1 = null;
          paramCreateCallback.OooO00o(false);
          paramCreateCallback = this.OooO0O0.getCallbacks();
          i = 0;
          localObject2 = null;
          String str = m54207b69.F54207b69_11("cj2B0A20062008241A520C2355102C141554");
          if (paramCreateCallback != null) {
            paramCreateCallback.OooO0o0(false, str, null);
          }
          paramCreateCallback = this.OooO0O0.getFloatCallbacks();
          if (paramCreateCallback == null) {
            return;
          }
          paramCreateCallback = paramCreateCallback.getBuilder();
          if (paramCreateCallback == null) {
            return;
          }
          paramCreateCallback = paramCreateCallback.getCreatedResult$easyfloat_release();
          if (paramCreateCallback == null) {
            return;
          }
          localObject1 = Boolean.FALSE;
          paramCreateCallback.OooO0OO(localObject1, str, null);
          return;
        }
        localObject2 = new OooO0o0/OooO0OO;
        ((OooO0OO)localObject2).<init>(paramCreateCallback, this);
        ((View)localObject1).post((Runnable)localObject2);
        return;
      }
    }
    boolean bool = OooOOO0();
    paramCreateCallback.OooO00o(bool);
  }
  
  public final void OooOOO(View paramView)
  {
    Object localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0O0;
      boolean bool = ((FloatConfig)localObject1).isAnim();
      if (!bool)
      {
        localObject1 = new com/lzf/easyfloat/anim/AnimatorManager;
        Object localObject2 = this.OooO0o0;
        Intrinsics.OooO0OO(localObject2);
        WindowManager.LayoutParams localLayoutParams = getParams();
        WindowManager localWindowManager = getWindowManager();
        FloatConfig localFloatConfig = this.OooO0O0;
        ((AnimatorManager)localObject1).<init>((View)localObject2, localLayoutParams, localWindowManager, localFloatConfig);
        localObject1 = ((AnimatorManager)localObject1).OooO00o();
        if (localObject1 == null)
        {
          bool = false;
          localObject1 = null;
        }
        else
        {
          localObject2 = getParams();
          int i = 552;
          ((WindowManager.LayoutParams)localObject2).flags = i;
          localObject2 = new com/lzf/easyfloat/core/FloatingWindowHelper$enterAnim$1$1;
          ((FloatingWindowHelper.enterAnim.1.1)localObject2).<init>(this, paramView);
          ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
          ((Animator)localObject1).start();
          localObject2 = Unit.OooO00o;
        }
        this.OooO0oO = ((Animator)localObject1);
        if (localObject1 == null)
        {
          bool = false;
          paramView.setVisibility(0);
          paramView = getWindowManager();
          localObject1 = this.OooO0o0;
          localObject2 = getParams();
          paramView.updateViewLayout((View)localObject1, (ViewGroup.LayoutParams)localObject2);
        }
      }
    }
  }
  
  public final boolean OooOOO0()
  {
    boolean bool;
    try
    {
      Object localObject1 = new com/lzf/easyfloat/core/TouchUtils;
      localObject2 = this.OooO00o;
      localFloatConfig = this.OooO0O0;
      ((TouchUtils)localObject1).<init>((Context)localObject2, localFloatConfig);
      this.OooO0o = ((TouchUtils)localObject1);
      OooOOo0();
      OooO();
      localObject1 = this.OooO0O0;
      bool = true;
      ((FloatConfig)localObject1).setShow(bool);
    }
    catch (Exception localException)
    {
      Object localObject2 = this.OooO0O0.getCallbacks();
      FloatConfig localFloatConfig = null;
      Object localObject3;
      if (localObject2 != null)
      {
        localObject3 = String.valueOf(localException);
        ((OnFloatCallbacks)localObject2).OooO0o0(false, (String)localObject3, null);
      }
      localObject2 = this.OooO0O0.getFloatCallbacks();
      if (localObject2 != null)
      {
        localObject2 = ((FloatCallbacks)localObject2).getBuilder();
        if (localObject2 != null)
        {
          localObject2 = ((FloatCallbacks.Builder)localObject2).getCreatedResult$easyfloat_release();
          if (localObject2 != null)
          {
            localObject3 = Boolean.FALSE;
            String str = String.valueOf(localException);
            ((Function3)localObject2).OooO0OO(localObject3, str, null);
          }
        }
      }
      bool = false;
      localObject2 = null;
    }
    return bool;
  }
  
  public final void OooOOOO()
  {
    Object localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0O0;
      boolean bool1 = ((FloatConfig)localObject1).isAnim();
      if (bool1)
      {
        localObject1 = this.OooO0oO;
        if (localObject1 == null) {}
      }
      else
      {
        localObject1 = this.OooO0oO;
        if (localObject1 != null) {
          ((Animator)localObject1).cancel();
        }
        localObject1 = new com/lzf/easyfloat/anim/AnimatorManager;
        Object localObject2 = this.OooO0o0;
        Intrinsics.OooO0OO(localObject2);
        Object localObject3 = getParams();
        WindowManager localWindowManager = getWindowManager();
        FloatConfig localFloatConfig = this.OooO0O0;
        ((AnimatorManager)localObject1).<init>((View)localObject2, (WindowManager.LayoutParams)localObject3, localWindowManager, localFloatConfig);
        localObject1 = ((AnimatorManager)localObject1).OooO0O0();
        int i = 1;
        boolean bool2;
        if (localObject1 == null)
        {
          bool1 = false;
          localObject1 = null;
          bool2 = false;
          localObject3 = null;
          OooOOoo(this, false, i, null);
        }
        else
        {
          localObject3 = this.OooO0O0;
          bool2 = ((FloatConfig)localObject3).isAnim();
          if (bool2) {
            return;
          }
          localObject3 = this.OooO0O0;
          ((FloatConfig)localObject3).setAnim(i);
          localObject2 = getParams();
          int j = 552;
          ((WindowManager.LayoutParams)localObject2).flags = j;
          localObject2 = new com/lzf/easyfloat/core/FloatingWindowHelper$exitAnim$1;
          ((FloatingWindowHelper.exitAnim.1)localObject2).<init>(this);
          ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
          ((Animator)localObject1).start();
        }
      }
    }
  }
  
  public final void OooOOOo()
  {
    Object localObject = this.OooO0O0;
    boolean bool = ((FloatConfig)localObject).getHasEditText();
    if (bool)
    {
      localObject = this.OooO0o0;
      if (localObject != null) {
        OooOo0o((View)localObject);
      }
    }
  }
  
  public final void OooOOo(boolean paramBoolean)
  {
    try
    {
      localObject1 = this.OooO0O0;
      localObject2 = null;
      ((FloatConfig)localObject1).setAnim(false);
      localObject1 = FloatingWindowManager.OooO00o;
      localObject2 = this.OooO0O0;
      localObject2 = ((FloatConfig)localObject2).getFloatTag();
      ((FloatingWindowManager)localObject1).OooO0o((String)localObject2);
      localObject1 = getWindowManager();
      ParentFrameLayout localParentFrameLayout;
      if (paramBoolean)
      {
        localParentFrameLayout = getFrameLayout();
        ((WindowManager)localObject1).removeViewImmediate(localParentFrameLayout);
      }
      else
      {
        localParentFrameLayout = getFrameLayout();
        ((ViewManager)localObject1).removeView(localParentFrameLayout);
      }
    }
    catch (Exception localException)
    {
      Object localObject1 = Logger.OooO00o;
      Object localObject2 = "浮窗关闭出现异常：";
      String str = Intrinsics.OooOOOO((String)localObject2, localException);
      ((Logger)localObject1).OooO00o(str);
    }
  }
  
  public final void OooOOo0()
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = m54207b69.F54207b69_11("LM3A25252C263F");
    localObject1 = ((Context)localObject1).getSystemService((String)localObject2);
    if (localObject1 != null)
    {
      localObject1 = (WindowManager)localObject1;
      setWindowManager((WindowManager)localObject1);
      localObject1 = new android/view/WindowManager$LayoutParams;
      ((WindowManager.LayoutParams)localObject1).<init>();
      localObject2 = getConfig().getShowPattern();
      Object localObject3 = ShowPattern.o00OoOoo;
      int i;
      if (localObject2 == localObject3)
      {
        i = 1000;
        ((WindowManager.LayoutParams)localObject1).type = i;
        localObject2 = getToken();
        ((WindowManager.LayoutParams)localObject1).token = ((IBinder)localObject2);
      }
      else
      {
        i = 2038;
        ((WindowManager.LayoutParams)localObject1).type = i;
      }
      ((WindowManager.LayoutParams)localObject1).format = 1;
      ((WindowManager.LayoutParams)localObject1).gravity = 8388659;
      localObject2 = getConfig();
      boolean bool1 = ((FloatConfig)localObject2).getImmersionStatusBar();
      int j;
      if (bool1) {
        j = 552;
      } else {
        j = 40;
      }
      ((WindowManager.LayoutParams)localObject1).flags = j;
      localObject2 = getConfig();
      int k = ((FloatConfig)localObject2).getWidthMatch();
      int i1 = -1;
      int i2 = -2;
      float f = 0.0F / 0.0F;
      if (k != 0) {
        k = i1;
      } else {
        k = i2;
      }
      ((WindowManager.LayoutParams)localObject1).width = k;
      localObject2 = getConfig();
      k = ((FloatConfig)localObject2).getHeightMatch();
      if (k == 0) {
        i1 = i2;
      }
      ((WindowManager.LayoutParams)localObject1).height = i1;
      localObject2 = getConfig();
      k = ((FloatConfig)localObject2).getImmersionStatusBar();
      if (k != 0)
      {
        localObject2 = getConfig();
        k = ((FloatConfig)localObject2).getHeightMatch();
        if (k != 0)
        {
          localObject2 = DisplayUtils.OooO00o;
          localObject3 = getContext();
          int m = ((DisplayUtils)localObject2).OooO0Oo((Context)localObject3);
          ((WindowManager.LayoutParams)localObject1).height = m;
        }
      }
      localObject2 = getConfig().getLocationPair();
      localObject3 = new kotlin/Pair;
      i2 = 0;
      f = 0.0F;
      Integer localInteger1 = Integer.valueOf(0);
      Integer localInteger2 = Integer.valueOf(0);
      ((Pair)localObject3).<init>(localInteger1, localInteger2);
      boolean bool2 = Intrinsics.OooO00o(localObject2, localObject3);
      if (!bool2)
      {
        int n = ((Number)getConfig().getLocationPair().getFirst()).intValue();
        ((WindowManager.LayoutParams)localObject1).x = n;
        localObject2 = (Number)getConfig().getLocationPair().getSecond();
        n = ((Number)localObject2).intValue();
        ((WindowManager.LayoutParams)localObject1).y = n;
      }
      localObject2 = Unit.OooO00o;
      setParams((WindowManager.LayoutParams)localObject1);
      return;
    }
    localObject1 = new java/lang/NullPointerException;
    localObject2 = m54207b69.F54207b69_11("*Z343038397E3E413B3C3E3885444C88484B3A408D424A904B4D4D914F4B5354994E444C629E605A65505E5D69A059616E5DA53F6668736B644F746E76797C66");
    ((NullPointerException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void OooOo00()
  {
    ParentFrameLayout localParentFrameLayout = this.OooO0o0;
    if (localParentFrameLayout != null)
    {
      ViewTreeObserver localViewTreeObserver = localParentFrameLayout.getViewTreeObserver();
      if (localViewTreeObserver != null)
      {
        OooO0o localOooO0o = new OooO0o0/OooO0o;
        localOooO0o.<init>(this, localParentFrameLayout);
        localViewTreeObserver.addOnGlobalLayoutListener(localOooO0o);
      }
    }
  }
  
  public final void OooOo0o(View paramView)
  {
    if (paramView != null)
    {
      boolean bool1 = paramView instanceof ViewGroup;
      if (bool1)
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        if (i > 0)
        {
          int j = 0;
          View localView = null;
          for (;;)
          {
            int k = j + 1;
            localView = paramView.getChildAt(j);
            boolean bool2 = localView instanceof ViewGroup;
            if (bool2)
            {
              OooOo0o((View)localView);
            }
            else
            {
              String str = m54207b69.F54207b69_11("3Y3A32323841");
              Intrinsics.OooO0o0(localView, str);
              OooOO0(localView);
            }
            if (k >= i) {
              break;
            }
            j = k;
          }
        }
      }
      else
      {
        OooOO0(paramView);
      }
    }
  }
  
  public final FloatConfig getConfig()
  {
    return this.OooO0O0;
  }
  
  public final Context getContext()
  {
    return this.OooO00o;
  }
  
  public final ParentFrameLayout getFrameLayout()
  {
    return this.OooO0o0;
  }
  
  public final WindowManager.LayoutParams getParams()
  {
    WindowManager.LayoutParams localLayoutParams = this.OooO0Oo;
    if (localLayoutParams != null) {
      return localLayoutParams;
    }
    Intrinsics.OooOo(m54207b69.F54207b69_11(">B322432263336"));
    return null;
  }
  
  public final WindowManager getWindowManager()
  {
    WindowManager localWindowManager = this.OooO0OO;
    if (localWindowManager != null) {
      return localWindowManager;
    }
    Intrinsics.OooOo(m54207b69.F54207b69_11("v0475A6057634C8358665A61604E"));
    return null;
  }
  
  public final void setConfig(FloatConfig paramFloatConfig)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramFloatConfig, str);
    this.OooO0O0 = paramFloatConfig;
  }
  
  public final void setFrameLayout(ParentFrameLayout paramParentFrameLayout)
  {
    this.OooO0o0 = paramParentFrameLayout;
  }
  
  public final void setParams(WindowManager.LayoutParams paramLayoutParams)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramLayoutParams, str);
    this.OooO0Oo = paramLayoutParams;
  }
  
  public final void setVisible(int paramInt, boolean paramBoolean)
  {
    ParentFrameLayout localParentFrameLayout = this.OooO0o0;
    if (localParentFrameLayout != null)
    {
      Intrinsics.OooO0OO(localParentFrameLayout);
      int i = localParentFrameLayout.getChildCount();
      int j = 1;
      if (i >= j)
      {
        this.OooO0O0.setNeedShow$easyfloat_release(paramBoolean);
        Object localObject1 = this.OooO0o0;
        Intrinsics.OooO0OO(localObject1);
        ((View)localObject1).setVisibility(paramInt);
        localObject1 = this.OooO0o0;
        Intrinsics.OooO0OO(localObject1);
        i = 0;
        localParentFrameLayout = null;
        localObject1 = ((ViewGroup)localObject1).getChildAt(0);
        String str = m54207b69.F54207b69_11(">+5D43505F");
        Object localObject2;
        if (paramInt == 0)
        {
          this.OooO0O0.setShow(j);
          localObject2 = this.OooO0O0.getCallbacks();
          if (localObject2 != null)
          {
            Intrinsics.OooO0o0(localObject1, str);
            ((OnFloatCallbacks)localObject2).OooO0o((View)localObject1);
          }
          localObject2 = this.OooO0O0.getFloatCallbacks();
          if (localObject2 == null) {
            return;
          }
          localObject2 = ((FloatCallbacks)localObject2).getBuilder();
          if (localObject2 == null) {
            return;
          }
          localObject2 = ((FloatCallbacks.Builder)localObject2).getShow$easyfloat_release();
          if (localObject2 == null) {
            return;
          }
        }
        else
        {
          this.OooO0O0.setShow(false);
          localObject2 = this.OooO0O0.getCallbacks();
          if (localObject2 != null)
          {
            Intrinsics.OooO0o0(localObject1, str);
            ((OnFloatCallbacks)localObject2).OooO0Oo((View)localObject1);
          }
          localObject2 = this.OooO0O0.getFloatCallbacks();
          if (localObject2 == null) {
            return;
          }
          localObject2 = ((FloatCallbacks)localObject2).getBuilder();
          if (localObject2 == null) {
            return;
          }
          localObject2 = ((FloatCallbacks.Builder)localObject2).getHide$easyfloat_release();
          if (localObject2 == null) {
            return;
          }
        }
        Intrinsics.OooO0o0(localObject1, str);
        ((Function1)localObject2).invoke(localObject1);
      }
    }
  }
  
  public final void setWindowManager(WindowManager paramWindowManager)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramWindowManager, str);
    this.OooO0OO = paramWindowManager;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.core.FloatingWindowHelper
 * JD-Core Version:    0.7.0.1
 */