package androidx.customview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper
{
  public static final Interpolator OooOo;
  public int[] OooO;
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public float[] OooO0Oo;
  public float[] OooO0o;
  public float[] OooO0o0;
  public float[] OooO0oO;
  public int[] OooO0oo;
  public int[] OooOO0;
  public int OooOO0O;
  public VelocityTracker OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public int OooOOOO;
  public final int OooOOOo;
  public OverScroller OooOOo;
  public int OooOOo0;
  public final ViewDragHelper.Callback OooOOoo;
  public boolean OooOo0;
  public View OooOo00;
  public final ViewGroup OooOo0O;
  public final Runnable OooOo0o;
  
  static
  {
    ViewDragHelper.1 local1 = new androidx/customview/widget/ViewDragHelper$1;
    local1.<init>();
    OooOo = local1;
  }
  
  public ViewDragHelper(Context paramContext, ViewGroup paramViewGroup, ViewDragHelper.Callback paramCallback)
  {
    int i = -1;
    this.OooO0OO = i;
    ViewDragHelper.2 local2 = new androidx/customview/widget/ViewDragHelper$2;
    local2.<init>(this);
    this.OooOo0o = local2;
    if (paramViewGroup != null)
    {
      if (paramCallback != null)
      {
        this.OooOo0O = paramViewGroup;
        this.OooOOoo = paramCallback;
        paramViewGroup = ViewConfiguration.get(paramContext);
        int j = (int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F);
        this.OooOOOo = j;
        this.OooOOOO = j;
        j = paramViewGroup.getScaledTouchSlop();
        this.OooO0O0 = j;
        float f1 = paramViewGroup.getScaledMaximumFlingVelocity();
        this.OooOOO0 = f1;
        float f2 = paramViewGroup.getScaledMinimumFlingVelocity();
        this.OooOOO = f2;
        paramViewGroup = new android/widget/OverScroller;
        paramCallback = OooOo;
        paramViewGroup.<init>(paramContext, paramCallback);
        this.OooOOo = paramViewGroup;
        return;
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramContext.<init>("Callback may not be null");
      throw paramContext;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramContext.<init>("Parent view may not be null");
    throw paramContext;
  }
  
  public static ViewDragHelper OooOOOO(ViewGroup paramViewGroup, float paramFloat, ViewDragHelper.Callback paramCallback)
  {
    paramViewGroup = OooOOOo(paramViewGroup, paramCallback);
    float f1 = paramViewGroup.OooO0O0;
    float f2 = 1.0F / paramFloat;
    int i = (int)(f1 * f2);
    paramViewGroup.OooO0O0 = i;
    return paramViewGroup;
  }
  
  public static ViewDragHelper OooOOOo(ViewGroup paramViewGroup, ViewDragHelper.Callback paramCallback)
  {
    ViewDragHelper localViewDragHelper = new androidx/customview/widget/ViewDragHelper;
    Context localContext = paramViewGroup.getContext();
    localViewDragHelper.<init>(localContext, paramViewGroup, paramCallback);
    return localViewDragHelper;
  }
  
  private boolean isValidPointerForActionMove(int paramInt)
  {
    boolean bool = isPointerDown(paramInt);
    if (!bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Ignoring pointerId=");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
      return false;
    }
    return true;
  }
  
  public final int OooO(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      return 0;
    }
    if (i > paramInt3)
    {
      if (paramInt1 <= 0) {
        paramInt3 = -paramInt3;
      }
      return paramInt3;
    }
    return paramInt1;
  }
  
  public void OooO00o()
  {
    OooO0O0();
    int i = this.OooO00o;
    int j = 2;
    if (i == j)
    {
      OverScroller localOverScroller1 = this.OooOOo;
      i = localOverScroller1.getCurrX();
      OverScroller localOverScroller2 = this.OooOOo;
      j = localOverScroller2.getCurrY();
      this.OooOOo.abortAnimation();
      int k = this.OooOOo.getCurrX();
      OverScroller localOverScroller3 = this.OooOOo;
      int m = localOverScroller3.getCurrY();
      ViewDragHelper.Callback localCallback = this.OooOOoo;
      View localView = this.OooOo00;
      int n = k - i;
      int i1 = m - j;
      localCallback.onViewPositionChanged(localView, k, m, n, i1);
    }
    setDragState(0);
  }
  
  public void OooO0O0()
  {
    int i = -1;
    this.OooO0OO = i;
    OooOO0();
    VelocityTracker localVelocityTracker = this.OooOO0o;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      i = 0;
      localVelocityTracker = null;
      this.OooOO0o = null;
    }
  }
  
  public void OooO0OO(View paramView, int paramInt)
  {
    Object localObject1 = paramView.getParent();
    ViewGroup localViewGroup = this.OooOo0O;
    if (localObject1 == localViewGroup)
    {
      this.OooOo00 = paramView;
      this.OooO0OO = paramInt;
      this.OooOOoo.onViewCaptured(paramView, paramInt);
      setDragState(1);
      return;
    }
    paramView = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    localObject1 = this.OooOo0O;
    ((StringBuilder)localObject2).append(localObject1);
    ((StringBuilder)localObject2).append(")");
    localObject2 = ((StringBuilder)localObject2).toString();
    paramView.<init>((String)localObject2);
    throw paramView;
  }
  
  public final boolean OooO0Oo(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    int[] arrayOfInt1 = this.OooO0oo;
    int i = arrayOfInt1[paramInt1] & paramInt2;
    boolean bool2 = false;
    if (i == paramInt2)
    {
      i = this.OooOOo0 & paramInt2;
      if (i != 0)
      {
        arrayOfInt1 = this.OooOO0;
        i = arrayOfInt1[paramInt1] & paramInt2;
        if (i != paramInt2)
        {
          arrayOfInt1 = this.OooO;
          i = arrayOfInt1[paramInt1] & paramInt2;
          if (i != paramInt2)
          {
            i = this.OooO0O0;
            float f1 = i;
            boolean bool3 = paramFloat1 < f1;
            float f2;
            if (!bool3)
            {
              f2 = i;
              boolean bool1 = paramFloat2 < f2;
              if (!bool1) {}
            }
            else
            {
              int j = 1056964608;
              f2 = 0.5F;
              paramFloat2 *= f2;
              boolean bool4 = paramFloat1 < paramFloat2;
              if (bool4)
              {
                localObject = this.OooOOoo;
                bool4 = ((ViewDragHelper.Callback)localObject).onEdgeLock(paramInt2);
                if (bool4)
                {
                  int[] arrayOfInt2 = this.OooOO0;
                  k = arrayOfInt2[paramInt1] | paramInt2;
                  arrayOfInt2[paramInt1] = k;
                  return false;
                }
              }
              Object localObject = this.OooO;
              int k = localObject[paramInt1] & paramInt2;
              if (k == 0)
              {
                k = this.OooO0O0;
                paramFloat2 = k;
                boolean bool5 = paramFloat1 < paramFloat2;
                if (bool5) {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public boolean OooO0o(int paramInt1, int paramInt2)
  {
    boolean bool1 = isPointerDown(paramInt2);
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = paramInt1 & 0x1;
    int j = 1;
    float f1 = 1.4E-45F;
    if (i == j) {
      i = j;
    } else {
      i = 0;
    }
    int k = 2;
    float f2 = 2.802597E-045F;
    paramInt1 &= k;
    float f3;
    if (paramInt1 == k)
    {
      paramInt1 = j;
      f3 = f1;
    }
    else
    {
      paramInt1 = 0;
      f3 = 0.0F;
    }
    float[] arrayOfFloat1 = this.OooO0o;
    f2 = arrayOfFloat1[paramInt2];
    float f4 = this.OooO0Oo[paramInt2];
    f2 -= f4;
    float[] arrayOfFloat2 = this.OooO0oO;
    f4 = arrayOfFloat2[paramInt2];
    float[] arrayOfFloat3 = this.OooO0o0;
    float f5 = arrayOfFloat3[paramInt2];
    f4 -= f5;
    if ((i != 0) && (paramInt1 != 0))
    {
      f2 *= f2;
      f4 *= f4;
      f2 += f4;
      paramInt1 = this.OooO0O0;
      f3 = paramInt1 * paramInt1;
      paramInt1 = f2 < f3;
      if (paramInt1 > 0) {
        bool2 = j;
      }
      return bool2;
    }
    if (i != 0)
    {
      f3 = Math.abs(f2);
      paramInt2 = this.OooO0O0;
      f5 = paramInt2;
      paramInt1 = f3 < f5;
      if (paramInt1 > 0) {
        bool2 = j;
      }
      return bool2;
    }
    if (paramInt1 != 0)
    {
      f3 = Math.abs(f4);
      paramInt2 = this.OooO0O0;
      f5 = paramInt2;
      paramInt1 = f3 < f5;
      if (paramInt1 > 0) {
        bool2 = j;
      }
    }
    return bool2;
  }
  
  public boolean OooO0o0(int paramInt)
  {
    float[] arrayOfFloat = this.OooO0Oo;
    int i = arrayOfFloat.length;
    int j = 0;
    while (j < i)
    {
      boolean bool = OooO0o(paramInt, j);
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public final boolean OooO0oO(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    if (paramView == null) {
      return false;
    }
    ViewDragHelper.Callback localCallback1 = this.OooOOoo;
    int i = localCallback1.getViewHorizontalDragRange(paramView);
    int j = 1;
    float f1 = 1.4E-45F;
    if (i > 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localCallback1 = null;
    }
    ViewDragHelper.Callback localCallback2 = this.OooOOoo;
    int k = localCallback2.getViewVerticalDragRange(paramView);
    float f2;
    if (k > 0)
    {
      k = j;
      f2 = f1;
    }
    else
    {
      k = 0;
      paramView = null;
      f2 = 0.0F;
    }
    boolean bool2;
    if ((i != 0) && (k != 0))
    {
      paramFloat1 *= paramFloat1;
      paramFloat2 *= paramFloat2;
      paramFloat1 += paramFloat2;
      k = this.OooO0O0;
      f2 = k * k;
      bool2 = paramFloat1 < f2;
      if (bool2) {
        bool1 = j;
      }
      return bool1;
    }
    int m;
    if (i != 0)
    {
      f2 = Math.abs(paramFloat1);
      m = this.OooO0O0;
      paramFloat1 = m;
      bool2 = f2 < paramFloat1;
      if (bool2) {
        bool1 = j;
      }
      return bool1;
    }
    if (bool2)
    {
      f2 = Math.abs(paramFloat2);
      m = this.OooO0O0;
      paramFloat1 = m;
      bool2 = f2 < paramFloat1;
      if (bool2) {
        bool1 = j;
      }
    }
    return bool1;
  }
  
  public final float OooO0oo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    boolean bool1 = f < paramFloat2;
    if (bool1) {
      return 0.0F;
    }
    bool1 = f < paramFloat3;
    if (bool1)
    {
      boolean bool2 = paramFloat1 < 0.0F;
      if (!bool2) {
        paramFloat3 = -paramFloat3;
      }
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  public final void OooOO0()
  {
    float[] arrayOfFloat = this.OooO0Oo;
    if (arrayOfFloat == null) {
      return;
    }
    Arrays.fill(arrayOfFloat, 0.0F);
    Arrays.fill(this.OooO0o0, 0.0F);
    Arrays.fill(this.OooO0o, 0.0F);
    Arrays.fill(this.OooO0oO, 0.0F);
    Arrays.fill(this.OooO0oo, 0);
    Arrays.fill(this.OooO, 0);
    Arrays.fill(this.OooOO0, 0);
    this.OooOO0O = 0;
  }
  
  public final void OooOO0O(int paramInt)
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      boolean bool = isPointerDown(paramInt);
      if (bool)
      {
        this.OooO0Oo[paramInt] = 0.0F;
        this.OooO0o0[paramInt] = 0.0F;
        this.OooO0o[paramInt] = 0.0F;
        this.OooO0oO[paramInt] = 0.0F;
        this.OooO0oo[paramInt] = 0;
        this.OooO[paramInt] = 0;
        localObject = this.OooOO0;
        localObject[paramInt] = 0;
        int i = this.OooOO0O;
        int j = 1;
        paramInt = (j << paramInt ^ 0xFFFFFFFF) & i;
        this.OooOO0O = paramInt;
      }
    }
  }
  
  public final int OooOO0o(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    ViewGroup localViewGroup = this.OooOo0O;
    int i = localViewGroup.getWidth();
    int j = i / 2;
    int k = Math.abs(paramInt1);
    float f1 = k;
    float f2 = i;
    f1 /= f2;
    i = 1065353216;
    f2 = 1.0F;
    f1 = Math.min(f2, f1);
    float f3 = j;
    f1 = OooOOo(f1) * f3;
    f3 += f1;
    paramInt2 = Math.abs(paramInt2);
    float f4;
    float f5;
    if (paramInt2 > 0)
    {
      f4 = paramInt2;
      f3 /= f4;
      f4 = Math.abs(f3);
      paramInt2 = 1148846080;
      f5 = 1000.0F;
      f4 *= f5;
      paramInt1 = Math.round(f4) * 4;
    }
    else
    {
      f4 = Math.abs(paramInt1);
      f5 = paramInt3;
      f4 = f4 / f5 + f2;
      paramInt2 = 1132462080;
      f5 = 256.0F;
      f4 *= f5;
      paramInt1 = (int)f4;
    }
    return Math.min(paramInt1, 600);
  }
  
  public boolean OooOOO(boolean paramBoolean)
  {
    int i = this.OooO00o;
    boolean bool2 = false;
    boolean bool3 = true;
    if (i == bool3)
    {
      Object localObject1 = this.OooOOo;
      boolean bool1 = ((OverScroller)localObject1).computeScrollOffset();
      OverScroller localOverScroller = this.OooOOo;
      int j = localOverScroller.getCurrX();
      int k = this.OooOOo.getCurrY();
      int m = this.OooOo00.getLeft();
      int n = j - m;
      Object localObject2 = this.OooOo00;
      m = ((View)localObject2).getTop();
      int i1 = k - m;
      if (n != 0)
      {
        localObject2 = this.OooOo00;
        ViewCompat.Ooooo0o((View)localObject2, n);
      }
      if (i1 != 0)
      {
        localObject2 = this.OooOo00;
        ViewCompat.OooooO0((View)localObject2, i1);
      }
      if ((n != 0) || (i1 != 0))
      {
        localObject2 = this.OooOOoo;
        View localView = this.OooOo00;
        ((ViewDragHelper.Callback)localObject2).onViewPositionChanged(localView, j, k, n, i1);
      }
      if (bool1)
      {
        localObject2 = this.OooOOo;
        m = ((OverScroller)localObject2).getFinalX();
        if (j == m)
        {
          localOverScroller = this.OooOOo;
          j = localOverScroller.getFinalY();
          if (k == j)
          {
            this.OooOOo.abortAnimation();
            bool1 = false;
            localObject1 = null;
          }
        }
      }
      if (!bool1) {
        if (paramBoolean)
        {
          ViewGroup localViewGroup = this.OooOo0O;
          localObject1 = this.OooOo0o;
          localViewGroup.post((Runnable)localObject1);
        }
        else
        {
          setDragState(0);
        }
      }
    }
    paramBoolean = this.OooO00o;
    if (paramBoolean == bool3) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final int OooOOO0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = (int)this.OooOOO;
    int j = (int)this.OooOOO0;
    paramInt3 = OooO(paramInt3, i, j);
    float f1 = this.OooOOO;
    i = (int)f1;
    float f2 = this.OooOOO0;
    j = (int)f2;
    paramInt4 = OooO(paramInt4, i, j);
    i = Math.abs(paramInt1);
    j = Math.abs(paramInt2);
    int k = Math.abs(paramInt3);
    int m = Math.abs(paramInt4);
    int n = k + m;
    int i1 = i + j;
    float f3;
    if (paramInt3 != 0)
    {
      f1 = k;
      f3 = n;
    }
    else
    {
      f1 = i;
      f3 = i1;
    }
    f1 /= f3;
    if (paramInt4 != 0)
    {
      f2 = m;
      f3 = n;
    }
    else
    {
      f2 = j;
      f3 = i1;
    }
    f2 /= f3;
    k = this.OooOOoo.getViewHorizontalDragRange(paramView);
    paramInt1 = OooOO0o(paramInt1, paramInt3, k);
    int i2 = this.OooOOoo.getViewVerticalDragRange(paramView);
    i2 = OooOO0o(paramInt2, paramInt4, i2);
    float f4 = paramInt1 * f1;
    float f5 = i2 * f2;
    return (int)(f4 + f5);
  }
  
  public final float OooOOo(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.4712389F);
  }
  
  public final void OooOOo0(float paramFloat1, float paramFloat2)
  {
    int i = 1;
    this.OooOo0 = i;
    ViewDragHelper.Callback localCallback = this.OooOOoo;
    View localView = this.OooOo00;
    localCallback.onViewReleased(localView, paramFloat1, paramFloat2);
    paramFloat1 = 0.0F;
    this.OooOo0 = false;
    int j = this.OooO00o;
    if (j == i) {
      setDragState(0);
    }
  }
  
  public final void OooOOoo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView1 = this.OooOo00;
    int i = localView1.getLeft();
    View localView2 = this.OooOo00;
    int j = localView2.getTop();
    Object localObject1;
    if (paramInt3 != 0)
    {
      localObject1 = this.OooOOoo;
      View localView3 = this.OooOo00;
      paramInt1 = ((ViewDragHelper.Callback)localObject1).clampViewPositionHorizontal(localView3, paramInt1, paramInt3);
      localObject1 = this.OooOo00;
      int k = paramInt1 - i;
      ViewCompat.Ooooo0o((View)localObject1, k);
    }
    int m = paramInt1;
    if (paramInt4 != 0)
    {
      Object localObject2 = this.OooOOoo;
      localObject1 = this.OooOo00;
      paramInt2 = ((ViewDragHelper.Callback)localObject2).clampViewPositionVertical((View)localObject1, paramInt2, paramInt4);
      localObject2 = this.OooOo00;
      int n = paramInt2 - j;
      ViewCompat.OooooO0((View)localObject2, n);
    }
    int i1 = paramInt2;
    if ((paramInt3 != 0) || (paramInt4 != 0))
    {
      int i2 = m - i;
      int i3 = i1 - j;
      ViewDragHelper.Callback localCallback = this.OooOOoo;
      View localView4 = this.OooOo00;
      localCallback.onViewPositionChanged(localView4, m, i1, i2, i3);
    }
  }
  
  public boolean OooOo(int paramInt1, int paramInt2)
  {
    View localView = this.OooOo00;
    return OooOoO(localView, paramInt1, paramInt2);
  }
  
  public View OooOo0(int paramInt1, int paramInt2)
  {
    ViewGroup localViewGroup = this.OooOo0O;
    int i = localViewGroup.getChildCount() + -1;
    while (i >= 0)
    {
      Object localObject = this.OooOo0O;
      ViewDragHelper.Callback localCallback = this.OooOOoo;
      int j = localCallback.getOrderedChildIndex(i);
      localObject = ((ViewGroup)localObject).getChildAt(j);
      j = ((View)localObject).getLeft();
      if (paramInt1 >= j)
      {
        j = ((View)localObject).getRight();
        if (paramInt1 < j)
        {
          j = ((View)localObject).getTop();
          if (paramInt2 >= j)
          {
            j = ((View)localObject).getBottom();
            if (paramInt2 < j) {
              return localObject;
            }
          }
        }
      }
      i += -1;
    }
    return null;
  }
  
  public final void OooOo00(int paramInt)
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      int i = localObject.length;
      if (i > paramInt) {}
    }
    else
    {
      paramInt += 1;
      float[] arrayOfFloat1 = new float[paramInt];
      float[] arrayOfFloat2 = new float[paramInt];
      float[] arrayOfFloat3 = new float[paramInt];
      float[] arrayOfFloat4 = new float[paramInt];
      int[] arrayOfInt1 = new int[paramInt];
      int[] arrayOfInt2 = new int[paramInt];
      int[] arrayOfInt3 = new int[paramInt];
      if (localObject != null)
      {
        int j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfFloat1, 0, j);
        localObject = this.OooO0o0;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfFloat2, 0, j);
        localObject = this.OooO0o;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfFloat3, 0, j);
        localObject = this.OooO0oO;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfFloat4, 0, j);
        localObject = this.OooO0oo;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfInt1, 0, j);
        localObject = this.OooO;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfInt2, 0, j);
        localObject = this.OooOO0;
        j = localObject.length;
        System.arraycopy(localObject, 0, arrayOfInt3, 0, j);
      }
      this.OooO0Oo = arrayOfFloat1;
      this.OooO0o0 = arrayOfFloat2;
      this.OooO0o = arrayOfFloat3;
      this.OooO0oO = arrayOfFloat4;
      this.OooO0oo = arrayOfInt1;
      this.OooO = arrayOfInt2;
      this.OooOO0 = arrayOfInt3;
    }
  }
  
  public final boolean OooOo0O(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.OooOo00.getLeft();
    View localView1 = this.OooOo00;
    int j = localView1.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.OooOOo.abortAnimation();
      setDragState(0);
      return false;
    }
    View localView2 = this.OooOo00;
    int k = paramInt1;
    k = OooOOO0(localView2, paramInt1, paramInt2, paramInt3, paramInt4);
    this.OooOOo.startScroll(i, j, paramInt1, paramInt2, k);
    setDragState(2);
    return true;
  }
  
  public final int OooOo0o(int paramInt1, int paramInt2)
  {
    ViewGroup localViewGroup1 = this.OooOo0O;
    int i = localViewGroup1.getLeft();
    int j = this.OooOOOO;
    i += j;
    if (paramInt1 < i)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localViewGroup1 = null;
    }
    ViewGroup localViewGroup2 = this.OooOo0O;
    j = localViewGroup2.getTop();
    int k = this.OooOOOO;
    j += k;
    if (paramInt2 < j) {
      i |= 0x4;
    }
    localViewGroup2 = this.OooOo0O;
    j = localViewGroup2.getRight();
    k = this.OooOOOO;
    j -= k;
    if (paramInt1 > j) {
      i |= 0x2;
    }
    ViewGroup localViewGroup3 = this.OooOo0O;
    paramInt1 = localViewGroup3.getBottom();
    j = this.OooOOOO;
    paramInt1 -= j;
    if (paramInt2 > paramInt1) {
      i |= 0x8;
    }
    return i;
  }
  
  public boolean OooOoO(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramView == null) {
      return false;
    }
    int i = paramView.getLeft();
    if (paramInt1 >= i)
    {
      i = paramView.getRight();
      if (paramInt1 < i)
      {
        paramInt1 = paramView.getTop();
        if (paramInt2 >= paramInt1)
        {
          int j = paramView.getBottom();
          if (paramInt2 < j) {
            bool = true;
          }
        }
      }
    }
    return bool;
  }
  
  public boolean OooOoO0(int paramInt1, int paramInt2)
  {
    boolean bool = isPointerDown(paramInt2);
    if (bool)
    {
      int[] arrayOfInt = this.OooO0oo;
      paramInt2 = arrayOfInt[paramInt2];
      paramInt1 &= paramInt2;
      if (paramInt1 != 0) {
        return 1;
      }
    }
    paramInt1 = 0;
    return paramInt1;
  }
  
  public void OooOoOO(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getActionIndex();
    if (i == 0) {
      OooO0O0();
    }
    Object localObject1 = this.OooOO0o;
    if (localObject1 == null)
    {
      localObject1 = VelocityTracker.obtain();
      this.OooOO0o = ((VelocityTracker)localObject1);
    }
    this.OooOO0o.addMovement(paramMotionEvent);
    int n = 0;
    float f1 = 0.0F;
    localObject1 = null;
    int i1;
    label293:
    int i7;
    int j;
    float f7;
    float f8;
    if (i != 0)
    {
      i1 = 1;
      float f2 = 1.4E-45F;
      if (i != i1)
      {
        int i2 = 2;
        float f3 = 2.802597E-045F;
        int i4;
        float f4;
        float f5;
        Object localObject2;
        boolean bool3;
        if (i != i2)
        {
          i2 = 3;
          f3 = 4.203895E-045F;
          float f6;
          if (i != i2)
          {
            i2 = 5;
            f3 = 7.006492E-045F;
            if (i != i2)
            {
              i2 = 6;
              f3 = 8.407791E-045F;
              if (i != i2) {
                return;
              }
              i = paramMotionEvent.getPointerId(k);
              k = this.OooO00o;
              if (k == i1)
              {
                k = this.OooO0OO;
                if (i == k)
                {
                  k = paramMotionEvent.getPointerCount();
                  for (;;)
                  {
                    i1 = -1;
                    f2 = 0.0F / 0.0F;
                    if (n >= k) {
                      break;
                    }
                    i2 = paramMotionEvent.getPointerId(n);
                    i4 = this.OooO0OO;
                    if (i2 != i4)
                    {
                      f4 = paramMotionEvent.getX(n);
                      f5 = paramMotionEvent.getY(n);
                      i4 = (int)f4;
                      int i5 = (int)f5;
                      View localView1 = OooOo0(i4, i5);
                      localObject2 = this.OooOo00;
                      if (localView1 == localObject2)
                      {
                        bool3 = Oooo0((View)localObject2, i2);
                        if (bool3)
                        {
                          i6 = this.OooO0OO;
                          break label293;
                        }
                      }
                    }
                    n += 1;
                  }
                  i6 = i1;
                  f6 = f2;
                  if (i6 == i1) {
                    OooOoo0();
                  }
                }
              }
              OooOO0O(i);
              return;
            }
            i = paramMotionEvent.getPointerId(k);
            f1 = paramMotionEvent.getX(k);
            f6 = paramMotionEvent.getY(k);
            OooOooO(f1, f6, i);
            k = this.OooO00o;
            if (k == 0)
            {
              k = (int)f1;
              i6 = (int)f6;
              paramMotionEvent = OooOo0(k, i6);
              Oooo0(paramMotionEvent, i);
              paramMotionEvent = this.OooO0oo;
              i6 = paramMotionEvent[i];
              k = this.OooOOo0;
              n = i6 & k;
              if (n == 0) {
                return;
              }
              localObject1 = this.OooOOoo;
              i6 &= k;
              ((ViewDragHelper.Callback)localObject1).onEdgeTouched(i6, i);
              return;
            }
            k = (int)f1;
            int i6 = (int)f6;
            boolean bool5 = OooOo(k, i6);
            if (!bool5) {
              return;
            }
            paramMotionEvent = this.OooOo00;
            Oooo0(paramMotionEvent, i);
            return;
          }
          i7 = this.OooO00o;
          if (i7 == i1)
          {
            i7 = 0;
            f6 = 0.0F;
            paramMotionEvent = null;
            OooOOo0(0.0F, 0.0F);
          }
        }
        else
        {
          i = this.OooO00o;
          if (i == i1)
          {
            i = this.OooO0OO;
            boolean bool1 = isValidPointerForActionMove(i);
            if (!bool1) {
              return;
            }
            j = this.OooO0OO;
            j = paramMotionEvent.findPointerIndex(j);
            f7 = paramMotionEvent.getX(j);
            f8 = paramMotionEvent.getY(j);
            localObject1 = this.OooO0o;
            i1 = this.OooO0OO;
            f1 = localObject1[i1];
            f7 -= f1;
            k = (int)f7;
            f1 = this.OooO0oO[i1];
            f8 -= f1;
            j = (int)f8;
            localObject1 = this.OooOo00;
            n = ((View)localObject1).getLeft() + k;
            View localView2 = this.OooOo00;
            i1 = localView2.getTop() + j;
            OooOOoo(n, i1, k, j);
          }
          label814:
          for (;;)
          {
            OooOooo(paramMotionEvent);
            break;
            j = paramMotionEvent.getPointerCount();
            for (;;)
            {
              if (n >= j) {
                break label814;
              }
              k = paramMotionEvent.getPointerId(n);
              bool3 = isValidPointerForActionMove(k);
              if (bool3)
              {
                f3 = paramMotionEvent.getX(n);
                f4 = paramMotionEvent.getY(n);
                localObject2 = this.OooO0Oo;
                f5 = localObject2[k];
                f5 = f3 - f5;
                float[] arrayOfFloat = this.OooO0o0;
                float f9 = arrayOfFloat[k];
                f9 = f4 - f9;
                OooOoo(f5, f9, k);
                int i8 = this.OooO00o;
                if (i8 == i1) {
                  break;
                }
                int i3 = (int)f3;
                i4 = (int)f4;
                View localView3 = OooOo0(i3, i4);
                boolean bool4 = OooO0oO(localView3, f5, f9);
                if (bool4)
                {
                  boolean bool2 = Oooo0(localView3, k);
                  if (bool2) {
                    break;
                  }
                }
              }
              n += 1;
            }
          }
        }
      }
      else
      {
        i7 = this.OooO00o;
        if (i7 == i1) {
          OooOoo0();
        }
      }
      OooO0O0();
    }
    else
    {
      f8 = paramMotionEvent.getX();
      f7 = paramMotionEvent.getY();
      i7 = paramMotionEvent.getPointerId(0);
      n = (int)f8;
      i1 = (int)f7;
      localObject1 = OooOo0(n, i1);
      OooOooO(f8, f7, i7);
      Oooo0((View)localObject1, i7);
      int[] arrayOfInt = this.OooO0oo;
      j = arrayOfInt[i7];
      int m = this.OooOOo0;
      n = j & m;
      if (n != 0)
      {
        localObject1 = this.OooOOoo;
        j &= m;
        ((ViewDragHelper.Callback)localObject1).onEdgeTouched(j, i7);
      }
    }
  }
  
  public final void OooOoo(float paramFloat1, float paramFloat2, int paramInt)
  {
    boolean bool1 = OooO0Oo(paramFloat1, paramFloat2, paramInt, 1);
    boolean bool2 = OooO0Oo(paramFloat2, paramFloat1, paramInt, 4);
    int i;
    if (bool2) {
      bool1 |= true;
    }
    bool2 = OooO0Oo(paramFloat1, paramFloat2, paramInt, 2);
    if (bool2) {
      i |= 0x2;
    }
    int j = 8;
    boolean bool3 = OooO0Oo(paramFloat2, paramFloat1, paramInt, j);
    if (bool3) {
      i |= 0x8;
    }
    if (i != 0)
    {
      Object localObject = this.OooO;
      int k = localObject[paramInt] | i;
      localObject[paramInt] = k;
      localObject = this.OooOOoo;
      ((ViewDragHelper.Callback)localObject).onEdgeDragStarted(i, paramInt);
    }
  }
  
  public final void OooOoo0()
  {
    VelocityTracker localVelocityTracker1 = this.OooOO0o;
    float f1 = this.OooOOO0;
    localVelocityTracker1.computeCurrentVelocity(1000, f1);
    localVelocityTracker1 = this.OooOO0o;
    int i = this.OooO0OO;
    float f2 = localVelocityTracker1.getXVelocity(i);
    float f3 = this.OooOOO;
    f1 = this.OooOOO0;
    f2 = OooO0oo(f2, f3, f1);
    VelocityTracker localVelocityTracker2 = this.OooOO0o;
    int j = this.OooO0OO;
    f3 = localVelocityTracker2.getYVelocity(j);
    f1 = this.OooOOO;
    float f4 = this.OooOOO0;
    f3 = OooO0oo(f3, f1, f4);
    OooOOo0(f2, f3);
  }
  
  public final void OooOooO(float paramFloat1, float paramFloat2, int paramInt)
  {
    OooOo00(paramInt);
    Object localObject = this.OooO0Oo;
    this.OooO0o[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.OooO0o0;
    this.OooO0oO[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.OooO0oo;
    int i = (int)paramFloat1;
    int j = (int)paramFloat2;
    i = OooOo0o(i, j);
    localObject[paramInt] = i;
    i = this.OooOO0O;
    j = 1 << paramInt;
    i |= j;
    this.OooOO0O = i;
  }
  
  public final void OooOooo(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getPointerCount();
    int j = 0;
    while (j < i)
    {
      int k = paramMotionEvent.getPointerId(j);
      boolean bool = isValidPointerForActionMove(k);
      if (bool)
      {
        float f1 = paramMotionEvent.getX(j);
        float f2 = paramMotionEvent.getY(j);
        float[] arrayOfFloat1 = this.OooO0o;
        arrayOfFloat1[k] = f1;
        float[] arrayOfFloat2 = this.OooO0oO;
        arrayOfFloat2[k] = f2;
      }
      j += 1;
    }
  }
  
  public boolean Oooo0(View paramView, int paramInt)
  {
    Object localObject = this.OooOo00;
    boolean bool1 = true;
    if (paramView == localObject)
    {
      int i = this.OooO0OO;
      if (i == paramInt) {
        return bool1;
      }
    }
    if (paramView != null)
    {
      localObject = this.OooOOoo;
      boolean bool2 = ((ViewDragHelper.Callback)localObject).tryCaptureView(paramView, paramInt);
      if (bool2)
      {
        this.OooO0OO = paramInt;
        OooO0OO(paramView, paramInt);
        return bool1;
      }
    }
    return false;
  }
  
  public boolean Oooo000(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooOo0;
    if (bool)
    {
      VelocityTracker localVelocityTracker1 = this.OooOO0o;
      int j = this.OooO0OO;
      int i = (int)localVelocityTracker1.getXVelocity(j);
      VelocityTracker localVelocityTracker2 = this.OooOO0o;
      int k = this.OooO0OO;
      j = (int)localVelocityTracker2.getYVelocity(k);
      return OooOo0O(paramInt1, paramInt2, i, j);
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    throw localIllegalStateException;
  }
  
  public boolean Oooo00O(MotionEvent paramMotionEvent)
  {
    ViewDragHelper localViewDragHelper = this;
    Object localObject1 = paramMotionEvent;
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0) {
      OooO0O0();
    }
    Object localObject2 = localViewDragHelper.OooOO0o;
    if (localObject2 == null)
    {
      localObject2 = VelocityTracker.obtain();
      localViewDragHelper.OooOO0o = ((VelocityTracker)localObject2);
    }
    localObject2 = localViewDragHelper.OooOO0o;
    ((VelocityTracker)localObject2).addMovement((MotionEvent)localObject1);
    int k = 2;
    int n = 1;
    float f1 = 1.4E-45F;
    if (i != 0)
    {
      float f2;
      if (i != n) {
        if (i != k)
        {
          int i1 = 3;
          f2 = 4.203895E-045F;
          if (i == i1) {
            break label699;
          }
          i1 = 5;
          f2 = 7.006492E-045F;
          if (i != i1)
          {
            k = 6;
            if (i == k) {}
          }
        }
      }
      for (;;)
      {
        i3 = 0;
        localCallback1 = null;
        break;
        int i4 = ((MotionEvent)localObject1).getPointerId(j);
        localViewDragHelper.OooOO0O(i4);
        continue;
        i = ((MotionEvent)localObject1).getPointerId(j);
        f2 = ((MotionEvent)localObject1).getX(j);
        float f3 = ((MotionEvent)localObject1).getY(j);
        localViewDragHelper.OooOooO(f2, f3, i);
        j = localViewDragHelper.OooO00o;
        if (j == 0)
        {
          localObject1 = localViewDragHelper.OooO0oo;
          i4 = localObject1[i];
          j = localViewDragHelper.OooOOo0;
          k = i4 & j;
          if (k != 0)
          {
            localObject2 = localViewDragHelper.OooOOoo;
            i4 &= j;
            ((ViewDragHelper.Callback)localObject2).onEdgeTouched(i4, i);
          }
        }
        else if (j == k)
        {
          j = (int)f2;
          i5 = (int)f3;
          localObject1 = localViewDragHelper.OooOo0(j, i5);
          localView1 = localViewDragHelper.OooOo00;
          if (localObject1 == localView1)
          {
            localViewDragHelper.Oooo0((View)localObject1, i);
            continue;
            localObject3 = localViewDragHelper.OooO0Oo;
            if (localObject3 != null)
            {
              localObject3 = localViewDragHelper.OooO0o0;
              if (localObject3 != null)
              {
                i = paramMotionEvent.getPointerCount();
                j = 0;
                f4 = 0.0F;
                localView1 = null;
                while (j < i)
                {
                  k = ((MotionEvent)localObject1).getPointerId(j);
                  boolean bool1 = localViewDragHelper.isValidPointerForActionMove(k);
                  if (bool1)
                  {
                    f2 = ((MotionEvent)localObject1).getX(j);
                    float f5 = ((MotionEvent)localObject1).getY(j);
                    float[] arrayOfFloat1 = localViewDragHelper.OooO0Oo;
                    float f6 = arrayOfFloat1[k];
                    f6 = f2 - f6;
                    float[] arrayOfFloat2 = localViewDragHelper.OooO0o0;
                    float f7 = arrayOfFloat2[k];
                    f7 = f5 - f7;
                    int i2 = (int)f2;
                    int i6 = (int)f5;
                    View localView2 = localViewDragHelper.OooOo0(i2, i6);
                    if (localView2 != null)
                    {
                      bool2 = localViewDragHelper.OooO0oO(localView2, f6, f7);
                      if (bool2)
                      {
                        bool2 = n;
                        f5 = f1;
                        break label489;
                      }
                    }
                    boolean bool2 = false;
                    f5 = 0.0F;
                    label489:
                    if (bool2)
                    {
                      int i7 = localView2.getLeft();
                      int i8 = (int)f6;
                      int i9 = i7 + i8;
                      i8 = localViewDragHelper.OooOOoo.clampViewPositionHorizontal(localView2, i9, i8);
                      i9 = localView2.getTop();
                      int i10 = (int)f7;
                      int i12 = i9 + i10;
                      localCallback1 = localViewDragHelper.OooOOoo;
                      i3 = localCallback1.clampViewPositionVertical(localView2, i12, i10);
                      ViewDragHelper.Callback localCallback2 = localViewDragHelper.OooOOoo;
                      int i11 = localCallback2.getViewHorizontalDragRange(localView2);
                      ViewDragHelper.Callback localCallback3 = localViewDragHelper.OooOOoo;
                      i12 = localCallback3.getViewVerticalDragRange(localView2);
                      if (((i11 == 0) || ((i11 > 0) && (i8 == i7))) && ((i12 == 0) || ((i12 > 0) && (i3 == i9)))) {
                        break;
                      }
                    }
                    else
                    {
                      localViewDragHelper.OooOoo(f6, f7, k);
                      i3 = localViewDragHelper.OooO00o;
                      if (i3 != n) {
                        if (bool2)
                        {
                          m = localViewDragHelper.Oooo0(localView2, k);
                          if (m != 0) {
                            break;
                          }
                        }
                      }
                    }
                  }
                  j += 1;
                }
                OooOooo(paramMotionEvent);
                continue;
                label699:
                OooO0O0();
              }
            }
          }
        }
      }
    }
    float f8 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    int i3 = 0;
    ViewDragHelper.Callback localCallback1 = null;
    int i5 = ((MotionEvent)localObject1).getPointerId(0);
    localViewDragHelper.OooOooO(f8, f4, i5);
    i = (int)f8;
    j = (int)f4;
    Object localObject3 = localViewDragHelper.OooOo0(i, j);
    View localView1 = localViewDragHelper.OooOo00;
    if (localObject3 == localView1)
    {
      j = localViewDragHelper.OooO00o;
      if (j == m) {
        localViewDragHelper.Oooo0((View)localObject3, i5);
      }
    }
    localObject3 = localViewDragHelper.OooO0oo;
    i = localObject3[i5];
    j = localViewDragHelper.OooOOo0;
    int m = i & j;
    if (m != 0)
    {
      localObject2 = localViewDragHelper.OooOOoo;
      i &= j;
      ((ViewDragHelper.Callback)localObject2).onEdgeTouched(i, i5);
    }
    i5 = localViewDragHelper.OooO00o;
    if (i5 == n) {
      i3 = n;
    }
    return i3;
  }
  
  public boolean Oooo00o(View paramView, int paramInt1, int paramInt2)
  {
    this.OooOo00 = paramView;
    this.OooO0OO = -1;
    paramView = null;
    boolean bool = OooOo0O(paramInt1, paramInt2, 0, 0);
    if (!bool)
    {
      paramInt1 = this.OooO00o;
      if (paramInt1 == 0)
      {
        View localView = this.OooOo00;
        if (localView != null)
        {
          paramInt1 = 0;
          localView = null;
          this.OooOo00 = null;
        }
      }
    }
    return bool;
  }
  
  public int getActivePointerId()
  {
    return this.OooO0OO;
  }
  
  public View getCapturedView()
  {
    return this.OooOo00;
  }
  
  public int getDefaultEdgeSize()
  {
    return this.OooOOOo;
  }
  
  public int getEdgeSize()
  {
    return this.OooOOOO;
  }
  
  public float getMinVelocity()
  {
    return this.OooOOO;
  }
  
  public int getTouchSlop()
  {
    return this.OooO0O0;
  }
  
  public int getViewDragState()
  {
    return this.OooO00o;
  }
  
  public boolean isEdgeTouched(int paramInt)
  {
    int[] arrayOfInt = this.OooO0oo;
    int i = arrayOfInt.length;
    int j = 0;
    while (j < i)
    {
      boolean bool = OooOoO0(paramInt, j);
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public boolean isPointerDown(int paramInt)
  {
    int i = this.OooOO0O;
    int j = 1;
    paramInt = j << paramInt & i;
    if (paramInt == 0) {
      j = 0;
    }
    return j;
  }
  
  public void setDragState(int paramInt)
  {
    Object localObject = this.OooOo0O;
    Runnable localRunnable = this.OooOo0o;
    ((View)localObject).removeCallbacks(localRunnable);
    int i = this.OooO00o;
    if (i != paramInt)
    {
      this.OooO00o = paramInt;
      localObject = this.OooOOoo;
      ((ViewDragHelper.Callback)localObject).onViewDragStateChanged(paramInt);
      paramInt = this.OooO00o;
      if (paramInt == 0)
      {
        paramInt = 0;
        this.OooOo00 = null;
      }
    }
  }
  
  public void setEdgeSize(int paramInt)
  {
    this.OooOOOO = paramInt;
  }
  
  public void setEdgeTrackingEnabled(int paramInt)
  {
    this.OooOOo0 = paramInt;
  }
  
  public void setMinVelocity(float paramFloat)
  {
    this.OooOOO = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.widget.ViewDragHelper
 * JD-Core Version:    0.7.0.1
 */