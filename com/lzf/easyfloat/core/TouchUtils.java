package com.lzf.easyfloat.core;

import OooO0o0.OooO;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewManager;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.interfaces.FloatCallbacks;
import com.lzf.easyfloat.interfaces.FloatCallbacks.Builder;
import com.lzf.easyfloat.interfaces.OnDisplayHeight;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;
import com.lzf.easyfloat.utils.DisplayUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class TouchUtils
{
  public int OooO;
  public final Context OooO00o;
  public final FloatConfig OooO0O0;
  public Rect OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public int OooOO0o;
  public int OooOOO;
  public int OooOOO0;
  public int OooOOOO;
  public int OooOOOo;
  public final int[] OooOOo;
  public int OooOOo0;
  public int OooOOoo;
  public int OooOo00;
  
  public TouchUtils(Context paramContext, FloatConfig paramFloatConfig)
  {
    this.OooO00o = paramContext;
    this.OooO0O0 = paramFloatConfig;
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.OooO0OO = paramContext;
    paramContext = new int[2];
    this.OooOOo = paramContext;
  }
  
  public static final void OooO0oO(boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams, WindowManager paramWindowManager, View paramView, ValueAnimator paramValueAnimator1, ValueAnimator paramValueAnimator2)
  {
    String str = m54207b69.F54207b69_11("]k4F1C0C1C0E0B1E");
    Intrinsics.OooO0o(paramLayoutParams, str);
    str = m54207b69.F54207b69_11("[l481C07050C082128150B1716152B");
    Intrinsics.OooO0o(paramWindowManager, str);
    str = m54207b69.F54207b69_11("oa45180A071A");
    Intrinsics.OooO0o(paramView, str);
    str = m54207b69.F54207b69_11(":<524A5253206463595A5C52276A662A6E6D605A2F5C6832696B6B2B6D656D6E3B68666E7C407C796F787E7C3DA17F76");
    if (paramBoolean) {}
    try
    {
      Object localObject = paramValueAnimator2.getAnimatedValue();
      if (localObject != null)
      {
        localObject = (Integer)localObject;
        paramBoolean = ((Integer)localObject).intValue();
        paramLayoutParams.x = paramBoolean;
      }
      else
      {
        localObject = new java/lang/NullPointerException;
        ((NullPointerException)localObject).<init>(str);
        throw ((Throwable)localObject);
        localObject = paramValueAnimator2.getAnimatedValue();
        if (localObject == null) {
          break label139;
        }
        localObject = (Integer)localObject;
        paramBoolean = ((Integer)localObject).intValue();
        paramLayoutParams.y = paramBoolean;
      }
      paramWindowManager.updateViewLayout(paramView, paramLayoutParams);
      break label159;
      label139:
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
    catch (Exception localException)
    {
      label154:
      label159:
      break label154;
    }
    paramValueAnimator1.cancel();
  }
  
  public final void OooO(View paramView, MotionEvent paramMotionEvent, WindowManager paramWindowManager, WindowManager.LayoutParams paramLayoutParams)
  {
    Object localObject1 = m54207b69.F54207b69_11(">+5D43505F");
    Intrinsics.OooO0o(paramView, (String)localObject1);
    localObject1 = m54207b69.F54207b69_11("h95C505E5A51");
    Intrinsics.OooO0o(paramMotionEvent, (String)localObject1);
    localObject1 = m54207b69.F54207b69_11("v0475A6057634C8358665A61604E");
    Intrinsics.OooO0o(paramWindowManager, (String)localObject1);
    localObject1 = m54207b69.F54207b69_11(">B322432263336");
    Intrinsics.OooO0o(paramLayoutParams, (String)localObject1);
    localObject1 = this.OooO0O0.getCallbacks();
    if (localObject1 != null) {
      ((OnFloatCallbacks)localObject1).OooO0O0(paramView, paramMotionEvent);
    }
    localObject1 = this.OooO0O0.getFloatCallbacks();
    if (localObject1 != null)
    {
      localObject1 = ((FloatCallbacks)localObject1).getBuilder();
      if (localObject1 != null)
      {
        localObject1 = ((FloatCallbacks.Builder)localObject1).getTouchEvent$easyfloat_release();
        if (localObject1 != null) {
          ((Function2)localObject1).OooOO0O(paramView, paramMotionEvent);
        }
      }
    }
    localObject1 = this.OooO0O0;
    boolean bool1 = ((FloatConfig)localObject1).getDragEnable();
    int m = 0;
    if (bool1)
    {
      localObject1 = this.OooO0O0;
      bool1 = ((FloatConfig)localObject1).isAnim();
      if (!bool1)
      {
        int i = paramMotionEvent.getAction() & 0xFF;
        if (i != 0)
        {
          int n = 1;
          float f1 = 1.4E-45F;
          if (i != n)
          {
            int i3 = 2;
            float f2 = 2.802597E-045F;
            if (i != i3)
            {
              m = 3;
              if (i == m) {}
            }
            else
            {
              float f3 = paramMotionEvent.getRawX();
              int i4 = this.OooO0o;
              float f4 = i4;
              boolean bool2 = f3 < f4;
              if (!bool2)
              {
                f3 = paramMotionEvent.getRawX();
                i4 = this.OooO0oo;
                int i7 = paramView.getWidth();
                i4 += i7;
                f4 = i4;
                bool2 = f3 < f4;
                if (!bool2)
                {
                  f3 = paramMotionEvent.getRawY();
                  i4 = this.OooO0oO;
                  f4 = i4;
                  bool2 = f3 < f4;
                  if (!bool2)
                  {
                    f3 = paramMotionEvent.getRawY();
                    i4 = this.OooO;
                    i7 = paramView.getHeight();
                    i4 += i7;
                    f4 = i4;
                    bool2 = f3 < f4;
                    if (!bool2)
                    {
                      f3 = paramMotionEvent.getRawX();
                      f4 = this.OooOO0;
                      f3 -= f4;
                      f4 = paramMotionEvent.getRawY();
                      float f5 = this.OooOO0O;
                      f4 -= f5;
                      Object localObject2 = this.OooO0O0;
                      boolean bool8 = ((FloatConfig)localObject2).isDrag();
                      if (!bool8)
                      {
                        f5 = f3 * f3;
                        float f6 = f4 * f4;
                        f5 += f6;
                        f6 = 81.0F;
                        bool8 = f5 < f6;
                        if (bool8) {
                          return;
                        }
                      }
                      localObject2 = this.OooO0O0;
                      ((FloatConfig)localObject2).setDrag(n);
                      int i1 = paramLayoutParams.x;
                      int j = (int)f3;
                      i1 += j;
                      j = paramLayoutParams.y;
                      i4 = (int)f4;
                      j += i4;
                      i4 = this.OooO0o;
                      if (i1 < i4) {}
                      do
                      {
                        i1 = i4;
                        break;
                        i4 = this.OooO0oo;
                      } while (i1 > i4);
                      Object localObject3 = this.OooO0O0.getShowPattern();
                      localObject2 = ShowPattern.o00OoOoo;
                      if (localObject3 == localObject2)
                      {
                        i4 = OooO0oo(paramView);
                        if (j < i4)
                        {
                          localObject3 = this.OooO0O0;
                          boolean bool6 = ((FloatConfig)localObject3).getImmersionStatusBar();
                          if (!bool6) {
                            j = OooO0oo(paramView);
                          }
                        }
                      }
                      int i5 = this.OooO0oO;
                      if (j < i5) {}
                      do
                      {
                        j = i5;
                        break;
                        if (j < 0)
                        {
                          localObject3 = this.OooO0O0;
                          boolean bool7 = ((FloatConfig)localObject3).getImmersionStatusBar();
                          if (bool7)
                          {
                            i6 = this.OooOOoo;
                            int i8 = -i6;
                            if (j >= i8) {
                              break;
                            }
                            j = -i6;
                            break;
                          }
                          j = 0;
                          localObject1 = null;
                          f3 = 0.0F;
                          break;
                        }
                        i6 = this.OooO;
                      } while (j > i6);
                      localObject3 = this.OooO0O0.getSidePattern();
                      localObject2 = TouchUtils.WhenMappings.OooO00o;
                      int i6 = ((Enum)localObject3).ordinal();
                      i6 = localObject2[i6];
                      int k;
                      switch (i6)
                      {
                      default: 
                      case 7: 
                      case 6: 
                      case 5: 
                      case 4: 
                      case 3: 
                        for (;;)
                        {
                          m = i1;
                          break label1195;
                          i3 = (int)paramMotionEvent.getRawX();
                          this.OooOO0o = i3;
                          i3 = this.OooO0o0;
                          i6 = (int)paramMotionEvent.getRawX();
                          i3 -= i6;
                          this.OooOOO0 = i3;
                          f2 = paramMotionEvent.getRawY();
                          i3 = (int)f2;
                          localObject3 = this.OooO0OO;
                          i6 = ((Rect)localObject3).top;
                          i3 -= i6;
                          this.OooOOO = i3;
                          i3 = this.OooO0Oo + i6;
                          f4 = paramMotionEvent.getRawY();
                          i6 = (int)f4;
                          i3 -= i6;
                          this.OooOOOO = i3;
                          i3 = this.OooOO0o;
                          i6 = this.OooOOO0;
                          i3 = Math.min(i3, i6);
                          this.OooOOOo = i3;
                          i3 = this.OooOOO;
                          i6 = this.OooOOOO;
                          i3 = Math.min(i3, i6);
                          this.OooOOo0 = i3;
                          i6 = this.OooOOOo;
                          if (i6 < i3)
                          {
                            i1 = this.OooOO0o;
                            if (i1 != i6) {
                              break;
                            }
                            break label1195;
                          }
                          j = this.OooOOO;
                          if (j != i3)
                          {
                            j = this.OooOo00;
                            m = j;
                            break label1169;
                            f3 = paramMotionEvent.getRawY();
                            localObject3 = this.OooO0OO;
                            i6 = ((Rect)localObject3).top;
                            f4 = i6;
                            f3 -= f4;
                            f2 = i3;
                            f3 *= f2;
                            i3 = this.OooO0Oo;
                            f4 = i3;
                            boolean bool3 = f3 < f4;
                            if (bool3)
                            {
                              k = paramView.getHeight();
                              i3 -= k;
                              m = i3;
                              break label1169;
                              f1 = paramMotionEvent.getRawX();
                              f2 = i3;
                              f1 *= f2;
                              i3 = this.OooO0o0;
                              f4 = i3;
                              boolean bool5 = f1 < f4;
                              if (!bool5) {
                                break label1195;
                              }
                              m = paramView.getWidth();
                              i3 -= m;
                              m = i3;
                              break label1195;
                              m = this.OooOo00;
                            }
                          }
                          k = m;
                        }
                      case 2: 
                        label1169:
                        m = this.OooO0o0;
                        int i2 = paramView.getWidth();
                        m -= i2;
                      }
                      label1195:
                      paramLayoutParams.x = m;
                      paramLayoutParams.y = k;
                      paramWindowManager.updateViewLayout(paramView, paramLayoutParams);
                      paramWindowManager = this.OooO0O0.getCallbacks();
                      if (paramWindowManager != null) {
                        paramWindowManager.OooO00o(paramView, paramMotionEvent);
                      }
                      paramWindowManager = this.OooO0O0.getFloatCallbacks();
                      if (paramWindowManager != null)
                      {
                        paramWindowManager = paramWindowManager.getBuilder();
                        if (paramWindowManager != null)
                        {
                          paramWindowManager = paramWindowManager.getDrag$easyfloat_release();
                          if (paramWindowManager != null) {
                            paramWindowManager.OooOO0O(paramView, paramMotionEvent);
                          }
                        }
                      }
                      float f7 = paramMotionEvent.getRawX();
                      this.OooOO0 = f7;
                      f7 = paramMotionEvent.getRawY();
                      this.OooOO0O = f7;
                      break label1612;
                    }
                  }
                }
              }
              return;
            }
          }
          localObject1 = this.OooO0O0;
          boolean bool4 = ((FloatConfig)localObject1).isDrag();
          if (!bool4) {
            return;
          }
          localObject1 = this.OooO0O0.getCallbacks();
          if (localObject1 != null) {
            ((OnFloatCallbacks)localObject1).OooO00o(paramView, paramMotionEvent);
          }
          localObject1 = this.OooO0O0.getFloatCallbacks();
          if (localObject1 != null)
          {
            localObject1 = ((FloatCallbacks)localObject1).getBuilder();
            if (localObject1 != null)
            {
              localObject1 = ((FloatCallbacks.Builder)localObject1).getDrag$easyfloat_release();
              if (localObject1 != null) {
                ((Function2)localObject1).OooOO0O(paramView, paramMotionEvent);
              }
            }
          }
          paramMotionEvent = this.OooO0O0.getSidePattern();
          localObject1 = TouchUtils.WhenMappings.OooO00o;
          int i9 = paramMotionEvent.ordinal();
          i9 = localObject1[i9];
          switch (i9)
          {
          default: 
            paramMotionEvent = this.OooO0O0.getCallbacks();
            if (paramMotionEvent != null) {
              break;
            }
            break;
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
            OooO0o(paramView, paramLayoutParams, paramWindowManager);
            break;
          }
          paramMotionEvent.OooO0OO(paramView);
          paramMotionEvent = this.OooO0O0.getFloatCallbacks();
          if (paramMotionEvent != null)
          {
            paramMotionEvent = paramMotionEvent.getBuilder();
            if (paramMotionEvent != null)
            {
              paramMotionEvent = paramMotionEvent.getDragEnd$easyfloat_release();
              if (paramMotionEvent != null) {
                paramMotionEvent.invoke(paramView);
              }
            }
          }
        }
        else
        {
          paramWindowManager = this.OooO0O0;
          paramWindowManager.setDrag(false);
          float f8 = paramMotionEvent.getRawX();
          this.OooOO0 = f8;
          float f9 = paramMotionEvent.getRawY();
          this.OooOO0O = f9;
          OooO0Oo(paramView, paramLayoutParams);
        }
        label1612:
        return;
      }
    }
    this.OooO0O0.setDrag(false);
  }
  
  public final void OooO0OO(View paramView)
  {
    this.OooO0O0.setAnim(false);
    Object localObject = this.OooO0O0.getCallbacks();
    if (localObject != null) {
      ((OnFloatCallbacks)localObject).OooO0OO(paramView);
    }
    localObject = this.OooO0O0.getFloatCallbacks();
    if (localObject != null)
    {
      localObject = ((FloatCallbacks)localObject).getBuilder();
      if (localObject != null)
      {
        localObject = ((FloatCallbacks.Builder)localObject).getDragEnd$easyfloat_release();
        if (localObject != null) {
          ((Function1)localObject).invoke(paramView);
        }
      }
    }
  }
  
  public final void OooO0Oo(View paramView, WindowManager.LayoutParams paramLayoutParams)
  {
    Object localObject = DisplayUtils.OooO00o;
    Context localContext = this.OooO00o;
    int i = ((DisplayUtils)localObject).OooO0o(localContext);
    this.OooO0o0 = i;
    localObject = this.OooO0O0.getDisplayHeight();
    localContext = this.OooO00o;
    i = ((OnDisplayHeight)localObject).OooO00o(localContext);
    this.OooO0Oo = i;
    localObject = this.OooOOo;
    paramView.getLocationOnScreen((int[])localObject);
    localObject = this.OooOOo;
    i = localObject[1];
    int j = paramLayoutParams.y;
    int i2 = 0;
    localContext = null;
    if (i > j)
    {
      j = OooO0oo(paramView);
    }
    else
    {
      j = 0;
      paramLayoutParams = null;
    }
    this.OooOOoo = j;
    j = this.OooO0Oo;
    i = paramView.getHeight();
    j -= i;
    i = this.OooOOoo;
    j -= i;
    this.OooOo00 = j;
    j = this.OooO0O0.getLeftBorder();
    j = Math.max(0, j);
    this.OooO0o = j;
    j = this.OooO0o0;
    i = this.OooO0O0.getRightBorder();
    j = Math.min(j, i);
    i = paramView.getWidth();
    j -= i;
    this.OooO0oo = j;
    paramLayoutParams = this.OooO0O0.getShowPattern();
    localObject = ShowPattern.o00OoOoo;
    if (paramLayoutParams == localObject)
    {
      paramLayoutParams = this.OooO0O0;
      boolean bool1 = paramLayoutParams.getImmersionStatusBar();
      if (!bool1)
      {
        paramLayoutParams = this.OooO0O0;
        int k = paramLayoutParams.getTopBorder();
        i2 = OooO0oo(paramView);
        k += i2;
        break label337;
      }
    }
    else
    {
      paramLayoutParams = this.OooO0O0;
      boolean bool2 = paramLayoutParams.getImmersionStatusBar();
      if (bool2)
      {
        paramLayoutParams = this.OooO0O0;
        m = paramLayoutParams.getTopBorder();
        i2 = OooO0oo(paramView);
        m -= i2;
        break label337;
      }
    }
    paramLayoutParams = this.OooO0O0;
    int m = paramLayoutParams.getTopBorder();
    label337:
    this.OooO0oO = m;
    paramLayoutParams = this.OooO0O0.getShowPattern();
    if (paramLayoutParams == localObject)
    {
      paramLayoutParams = this.OooO0O0;
      boolean bool3 = paramLayoutParams.getImmersionStatusBar();
      if (!bool3)
      {
        int n = this.OooOo00;
        localObject = this.OooO0O0;
        i = ((FloatConfig)localObject).getBottomBorder();
        i2 = OooO0oo(paramView);
        i += i2;
        break label476;
      }
    }
    else
    {
      paramLayoutParams = this.OooO0O0;
      boolean bool4 = paramLayoutParams.getImmersionStatusBar();
      if (bool4)
      {
        i1 = this.OooOo00;
        localObject = this.OooO0O0;
        i = ((FloatConfig)localObject).getBottomBorder();
        i2 = OooO0oo(paramView);
        i -= i2;
        break label476;
      }
    }
    int i1 = this.OooOo00;
    localObject = this.OooO0O0;
    i = ((FloatConfig)localObject).getBottomBorder();
    label476:
    int i3 = paramView.getHeight();
    i -= i3;
    i3 = Math.min(i1, i);
    this.OooO = i3;
  }
  
  public final void OooO0o(View paramView, WindowManager.LayoutParams paramLayoutParams, WindowManager paramWindowManager)
  {
    OooO0o0(paramLayoutParams);
    Object localObject1 = this.OooO0O0.getSidePattern();
    Object localObject2 = TouchUtils.WhenMappings.OooO00o;
    int i = ((Enum)localObject1).ordinal();
    i = localObject2[i];
    localObject2 = null;
    boolean bool1 = true;
    switch (i)
    {
    default: 
      return;
    case 14: 
      i = this.OooOOOo;
      j = this.OooOOo0;
      if (i < j)
      {
        i = this.OooOO0o;
        j = this.OooOOO0;
        if (i < j) {
          break label244;
        }
      }
      else
      {
        i = this.OooOOO;
        j = this.OooOOOO;
        if (i >= j) {
          break label201;
        }
      }
      break;
    case 13: 
      i = this.OooOOO;
      j = this.OooOOOO;
      if (i >= j) {}
      break;
    case 12: 
      i = this.OooOO0o;
      j = this.OooOOO0;
      if (i >= j) {
        i = paramLayoutParams.x;
      }
      break;
    case 11: 
      i = this.OooO;
      break;
    case 10: 
      i = this.OooO0oO;
      bool2 = false;
      break;
    case 9: 
      label201:
      i = paramLayoutParams.x;
      j = this.OooOOO0;
      i += j;
      break;
    }
    label244:
    i = this.OooO0o;
    boolean bool2 = bool1;
    int j = 2;
    Object localObject3 = new int[j];
    int k;
    if (bool2) {
      k = paramLayoutParams.x;
    } else {
      k = paramLayoutParams.y;
    }
    localObject3[0] = k;
    localObject3[bool1] = i;
    localObject1 = ValueAnimator.ofInt((int[])localObject3);
    localObject2 = new OooO0o0/OooO;
    localObject3 = localObject2;
    ((OooO)localObject2).<init>(bool2, paramLayoutParams, paramWindowManager, paramView, (ValueAnimator)localObject1);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    paramLayoutParams = new com/lzf/easyfloat/core/TouchUtils$sideAnim$2;
    paramLayoutParams.<init>(this, paramView);
    ((Animator)localObject1).addListener(paramLayoutParams);
    ((ValueAnimator)localObject1).start();
  }
  
  public final void OooO0o0(WindowManager.LayoutParams paramLayoutParams)
  {
    int i = paramLayoutParams.x;
    int j = this.OooO0o;
    j = i - j;
    this.OooOO0o = j;
    int k = this.OooO0oo - i;
    this.OooOOO0 = k;
    int m = paramLayoutParams.y;
    i = this.OooO0oO;
    i = m - i;
    this.OooOOO = i;
    i = this.OooO - m;
    this.OooOOOO = i;
    m = Math.min(j, k);
    this.OooOOOo = m;
    m = this.OooOOO;
    i = this.OooOOOO;
    m = Math.min(m, i);
    this.OooOOo0 = m;
  }
  
  public final int OooO0oo(View paramView)
  {
    return DisplayUtils.OooO00o.OooOOO(paramView);
  }
  
  public final FloatConfig getConfig()
  {
    return this.OooO0O0;
  }
  
  public final Context getContext()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.core.TouchUtils
 * JD-Core Version:    0.7.0.1
 */