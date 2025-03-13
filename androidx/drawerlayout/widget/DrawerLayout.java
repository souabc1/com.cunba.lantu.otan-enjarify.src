package androidx.drawerlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
  implements Openable
{
  public static final boolean o00o0o;
  public static final int[] o00o0o0O = { 16843828 };
  public static final int[] o00o0o0o;
  public static boolean o00o0oO;
  public static final boolean o00o0oO0;
  public final DrawerLayout.ChildAccessibilityDelegate o00OoOoo;
  public int o00Ooo0;
  public float o00Ooo00;
  public int o00Ooo0O;
  public float o00Ooo0o;
  public final ViewDragHelper o00OooO;
  public Paint o00OooO0;
  public final ViewDragHelper o00OooOO;
  public final DrawerLayout.ViewDragCallback o00OooOo;
  public int o00OoooO;
  public boolean o00Ooooo;
  public Drawable o00o0;
  public boolean o00o00;
  public int o00o000;
  public boolean o00o0000;
  public int o00o000O;
  public int o00o000o;
  public DrawerLayout.DrawerListener o00o00O0;
  public List o00o00Oo;
  public float o00o00o;
  public float o00o00o0;
  public Drawable o00o00oO;
  public Drawable o00o00oo;
  public CharSequence o00o0O0;
  public CharSequence o00o0O00;
  public Object o00o0O0O;
  public Drawable o00o0OO;
  public boolean o00o0OO0;
  public Drawable o00o0OOO;
  public Drawable o00o0OOo;
  public final ArrayList o00o0Oo;
  public Drawable o00o0Oo0;
  public Rect o00o0OoO;
  public Matrix o00o0Ooo;
  public final AccessibilityViewCommand o00o0o00;
  public final DrawerLayout.ViewDragCallback o0O00o0;
  public int oo00oO;
  
  static
  {
    int[] arrayOfInt = { 16842931 };
    o00o0o0o = arrayOfInt;
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    o00o0o = bool;
    o00o0oO0 = bool;
    int j = 29;
    if (i < j) {
      bool = false;
    }
    o00o0oO = bool;
  }
  
  public static String OooOo0(int paramInt)
  {
    int i = paramInt & 0x3;
    int j = 3;
    if (i == j) {
      return "LEFT";
    }
    i = paramInt & 0x5;
    j = 5;
    if (i == j) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  public static boolean OooOo0O(View paramView)
  {
    paramView = paramView.getBackground();
    boolean bool = false;
    if (paramView != null)
    {
      int i = paramView.getOpacity();
      int j = -1;
      if (i == j) {
        bool = true;
      }
    }
    return bool;
  }
  
  public static boolean OooOoO0(View paramView)
  {
    int i = ViewCompat.OooOoO0(paramView);
    int j = 4;
    if (i != j)
    {
      k = ViewCompat.OooOoO0(paramView);
      i = 2;
      if (k != i) {
        return 1;
      }
    }
    int k = 0;
    paramView = null;
    return k;
  }
  
  public void OooO(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    boolean bool1 = false;
    while (j < i)
    {
      View localView = getChildAt(j);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      boolean bool2 = OooOoo0(localView);
      if (bool2) {
        if (paramBoolean)
        {
          bool2 = localLayoutParams.OooO0OO;
          if (!bool2) {}
        }
        else
        {
          int k = localView.getWidth();
          boolean bool3 = OooO0OO(localView, 3);
          int n;
          boolean bool4;
          if (bool3)
          {
            ViewDragHelper localViewDragHelper1 = this.o00OooO;
            k = -k;
            n = localView.getTop();
            bool4 = localViewDragHelper1.Oooo00o(localView, k, n);
          }
          else
          {
            ViewDragHelper localViewDragHelper2 = this.o00OooOO;
            int m = getWidth();
            n = localView.getTop();
            bool4 = localViewDragHelper2.Oooo00o(localView, m, n);
          }
          bool1 |= bool4;
          localLayoutParams.OooO0OO = false;
        }
      }
      j += 1;
    }
    this.o00OooOo.OooO0OO();
    DrawerLayout.ViewDragCallback localViewDragCallback = this.o0O00o0;
    localViewDragCallback.OooO0OO();
    if (bool1) {
      invalidate();
    }
  }
  
  public void OooO00o(DrawerLayout.DrawerListener paramDrawerListener)
  {
    if (paramDrawerListener == null) {
      return;
    }
    Object localObject = this.o00o00Oo;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.o00o00Oo = ((List)localObject);
    }
    this.o00o00Oo.add(paramDrawerListener);
  }
  
  public void OooO0O0()
  {
    boolean bool = this.o00o00;
    if (!bool)
    {
      long l = SystemClock.uptimeMillis();
      int i = 3;
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
      int j = getChildCount();
      int k = 0;
      while (k < j)
      {
        View localView = getChildAt(k);
        localView.dispatchTouchEvent(localMotionEvent);
        k += 1;
      }
      localMotionEvent.recycle();
      bool = true;
      this.o00o00 = bool;
    }
  }
  
  public boolean OooO0OO(View paramView, int paramInt)
  {
    int i = OooOOo(paramView) & paramInt;
    if (i == paramInt)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramView = null;
    }
    return i;
  }
  
  public void OooO0Oo(int paramInt)
  {
    OooO0o0(paramInt, true);
  }
  
  public void OooO0o(View paramView)
  {
    OooO0oO(paramView, true);
  }
  
  public void OooO0o0(int paramInt, boolean paramBoolean)
  {
    Object localObject = OooOOO(paramInt);
    if (localObject != null)
    {
      OooO0oO((View)localObject, paramBoolean);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("No drawer view found with gravity ");
    String str = OooOo0(paramInt);
    ((StringBuilder)localObject).append(str);
    str = ((StringBuilder)localObject).toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void OooO0oO(View paramView, boolean paramBoolean)
  {
    boolean bool1 = OooOoo0(paramView);
    if (bool1)
    {
      localObject1 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      boolean bool2 = this.o00o0000;
      if (bool2)
      {
        ((DrawerLayout.LayoutParams)localObject1).OooO0O0 = 0.0F;
        ((DrawerLayout.LayoutParams)localObject1).OooO0Oo = 0;
      }
      else
      {
        int j = 4;
        if (paramBoolean)
        {
          paramBoolean = ((DrawerLayout.LayoutParams)localObject1).OooO0Oo | j;
          ((DrawerLayout.LayoutParams)localObject1).OooO0Oo = paramBoolean;
          paramBoolean = OooO0OO(paramView, 3);
          int i;
          if (paramBoolean)
          {
            localObject2 = this.o00OooO;
            i = -paramView.getWidth();
          }
          else
          {
            localObject2 = this.o00OooOO;
            i = getWidth();
          }
          j = paramView.getTop();
          ((ViewDragHelper)localObject2).Oooo00o(paramView, i, j);
        }
        else
        {
          Oooo000(paramView, 0.0F);
          OoooO(0, paramView);
          paramView.setVisibility(j);
        }
      }
      invalidate();
      return;
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("View ");
    ((StringBuilder)localObject1).append(paramView);
    ((StringBuilder)localObject1).append(" is not a sliding drawer");
    paramView = ((StringBuilder)localObject1).toString();
    ((IllegalArgumentException)localObject2).<init>(paramView);
    throw ((Throwable)localObject2);
  }
  
  public void OooO0oo()
  {
    OooO(false);
  }
  
  public void OooOO0(View paramView)
  {
    Object localObject = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    int i = ((DrawerLayout.LayoutParams)localObject).OooO0Oo;
    int j = 1;
    i &= j;
    if (i == j)
    {
      i = 0;
      ((DrawerLayout.LayoutParams)localObject).OooO0Oo = 0;
      localObject = this.o00o00Oo;
      int k;
      if (localObject != null)
      {
        k = ((List)localObject).size() - j;
        while (k >= 0)
        {
          DrawerLayout.DrawerListener localDrawerListener = (DrawerLayout.DrawerListener)this.o00o00Oo.get(k);
          localDrawerListener.OooO0O0(paramView);
          k += -1;
        }
      }
      OoooO0O(paramView, false);
      OoooO0(paramView);
      boolean bool = hasWindowFocus();
      if (bool)
      {
        paramView = getRootView();
        if (paramView != null)
        {
          k = 32;
          paramView.sendAccessibilityEvent(k);
        }
      }
    }
  }
  
  public void OooOO0O(View paramView)
  {
    Object localObject = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    int i = ((DrawerLayout.LayoutParams)localObject).OooO0Oo;
    int j = 1;
    i &= j;
    if (i == 0)
    {
      ((DrawerLayout.LayoutParams)localObject).OooO0Oo = j;
      localObject = this.o00o00Oo;
      if (localObject != null)
      {
        int k = ((List)localObject).size() - j;
        while (k >= 0)
        {
          DrawerLayout.DrawerListener localDrawerListener = (DrawerLayout.DrawerListener)this.o00o00Oo.get(k);
          localDrawerListener.OooO00o(paramView);
          k += -1;
        }
      }
      OoooO0O(paramView, j);
      OoooO0(paramView);
      boolean bool = hasWindowFocus();
      if (bool)
      {
        int m = 32;
        sendAccessibilityEvent(m);
      }
    }
  }
  
  public void OooOO0o(View paramView, float paramFloat)
  {
    List localList = this.o00o00Oo;
    if (localList != null)
    {
      int i = localList.size() + -1;
      while (i >= 0)
      {
        DrawerLayout.DrawerListener localDrawerListener = (DrawerLayout.DrawerListener)this.o00o00Oo.get(i);
        localDrawerListener.OooO0Oo(paramView, paramFloat);
        i += -1;
      }
    }
  }
  
  public View OooOOO(int paramInt)
  {
    int i = ViewCompat.OooOoOO(this);
    paramInt = GravityCompat.OooO0O0(paramInt, i) & 0x7;
    i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      int k = OooOOo(localView) & 0x7;
      if (k == paramInt) {
        return localView;
      }
      j += 1;
    }
    return null;
  }
  
  public final boolean OooOOO0(MotionEvent paramMotionEvent, View paramView)
  {
    Matrix localMatrix = paramView.getMatrix();
    boolean bool1 = localMatrix.isIdentity();
    boolean bool2;
    if (!bool1)
    {
      paramMotionEvent = OooOo00(paramMotionEvent, paramView);
      bool2 = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.recycle();
    }
    else
    {
      int i = getScrollX();
      int j = paramView.getLeft();
      i -= j;
      float f1 = i;
      j = getScrollY();
      int k = paramView.getTop();
      j -= k;
      float f2 = j;
      paramMotionEvent.offsetLocation(f1, f2);
      bool2 = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      f1 = -f1;
      f2 = -f2;
      paramMotionEvent.offsetLocation(f1, f2);
    }
    return bool2;
  }
  
  public View OooOOOO()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      int k = localLayoutParams.OooO0Oo;
      int m = 1;
      k &= m;
      if (k == m) {
        return localView;
      }
      j += 1;
    }
    return null;
  }
  
  public View OooOOOo()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      boolean bool = OooOoo0(localView);
      if (bool)
      {
        bool = OooOoo(localView);
        if (bool) {
          return localView;
        }
      }
      j += 1;
    }
    return null;
  }
  
  public int OooOOo(View paramView)
  {
    int i = ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).OooO00o;
    int j = ViewCompat.OooOoOO(this);
    return GravityCompat.OooO0O0(i, j);
  }
  
  public int OooOOo0(View paramView)
  {
    boolean bool = OooOoo0(paramView);
    if (bool)
    {
      int i = ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).OooO00o;
      return getDrawerLockMode(i);
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    paramView = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramView);
    throw localIllegalArgumentException;
  }
  
  public float OooOOoo(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).OooO0O0;
  }
  
  public final boolean OooOo()
  {
    View localView = OooOOOo();
    boolean bool;
    if (localView != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localView = null;
    }
    return bool;
  }
  
  public final MotionEvent OooOo00(MotionEvent paramMotionEvent, View paramView)
  {
    int i = getScrollX();
    int j = paramView.getLeft();
    float f1 = i - j;
    j = getScrollY();
    int k = paramView.getTop();
    j -= k;
    float f2 = j;
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(f1, f2);
    paramView = paramView.getMatrix();
    boolean bool = paramView.isIdentity();
    if (!bool)
    {
      Matrix localMatrix = this.o00o0Ooo;
      if (localMatrix == null)
      {
        localMatrix = new android/graphics/Matrix;
        localMatrix.<init>();
        this.o00o0Ooo = localMatrix;
      }
      localMatrix = this.o00o0Ooo;
      paramView.invert(localMatrix);
      paramView = this.o00o0Ooo;
      paramMotionEvent.transform(paramView);
    }
    return paramMotionEvent;
  }
  
  public final boolean OooOo0o()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)getChildAt(j).getLayoutParams();
      boolean bool = localLayoutParams.OooO0OO;
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public boolean OooOoO(View paramView)
  {
    paramView = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.OooO00o;
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramView = null;
    }
    return i;
  }
  
  public boolean OooOoOO(View paramView)
  {
    int i = OooOoo0(paramView);
    if (i != 0)
    {
      paramView = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      int j = paramView.OooO0Oo;
      i = 1;
      j &= i;
      if (j != i)
      {
        i = 0;
        localIllegalArgumentException = null;
      }
      return i;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    paramView = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramView);
    throw localIllegalArgumentException;
  }
  
  public boolean OooOoo(View paramView)
  {
    boolean bool1 = OooOoo0(paramView);
    if (bool1)
    {
      paramView = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      float f = paramView.OooO0O0;
      bool1 = false;
      localIllegalArgumentException = null;
      boolean bool2 = f < 0.0F;
      if (bool2)
      {
        bool2 = true;
        f = 1.4E-45F;
      }
      else
      {
        bool2 = false;
        f = 0.0F;
        paramView = null;
      }
      return bool2;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    paramView = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramView);
    throw localIllegalArgumentException;
  }
  
  public boolean OooOoo0(View paramView)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.OooO00o;
    int j = ViewCompat.OooOoOO(paramView);
    j = GravityCompat.OooO0O0(i, j);
    i = j & 0x3;
    boolean bool = true;
    if (i != 0) {
      return bool;
    }
    j &= 0x5;
    if (j != 0) {
      return bool;
    }
    return false;
  }
  
  public final boolean OooOooO(float paramFloat1, float paramFloat2, View paramView)
  {
    Rect localRect = this.o00o0OoO;
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>();
      this.o00o0OoO = localRect;
    }
    localRect = this.o00o0OoO;
    paramView.getHitRect(localRect);
    paramView = this.o00o0OoO;
    int i = (int)paramFloat1;
    int j = (int)paramFloat2;
    return paramView.contains(i, j);
  }
  
  public final void OooOooo(Drawable paramDrawable, int paramInt)
  {
    if (paramDrawable != null)
    {
      boolean bool = DrawableCompat.OooO0oo(paramDrawable);
      if (bool) {
        DrawableCompat.OooOOO0(paramDrawable, paramInt);
      }
    }
  }
  
  public void Oooo(Drawable paramDrawable, int paramInt)
  {
    boolean bool = o00o0oO0;
    if (bool) {
      return;
    }
    int i = 8388611;
    int j = paramInt & i;
    if (j == i)
    {
      this.o00o0OO = paramDrawable;
    }
    else
    {
      i = 8388613;
      j = paramInt & i;
      if (j == i)
      {
        this.o00o0OOO = paramDrawable;
      }
      else
      {
        i = paramInt & 0x3;
        j = 3;
        if (i == j)
        {
          this.o00o0OOo = paramDrawable;
        }
        else
        {
          i = 5;
          paramInt &= i;
          if (paramInt != i) {
            return;
          }
          this.o00o0Oo0 = paramDrawable;
        }
      }
    }
    Oooo0oO();
    invalidate();
  }
  
  public void Oooo0(View paramView)
  {
    Oooo0O0(paramView, true);
  }
  
  public void Oooo000(View paramView, float paramFloat)
  {
    float f1 = OooOOoo(paramView);
    float f2 = paramView.getWidth();
    int i = (int)(f1 * f2);
    f2 *= paramFloat;
    int j = (int)f2 - i;
    f1 = 4.203895E-045F;
    boolean bool = OooO0OO(paramView, 3);
    if (!bool) {
      j = -j;
    }
    paramView.offsetLeftAndRight(j);
    OoooO00(paramView, paramFloat);
  }
  
  public void Oooo00O(int paramInt)
  {
    Oooo00o(paramInt, true);
  }
  
  public void Oooo00o(int paramInt, boolean paramBoolean)
  {
    Object localObject = OooOOO(paramInt);
    if (localObject != null)
    {
      Oooo0O0((View)localObject, paramBoolean);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("No drawer view found with gravity ");
    String str = OooOo0(paramInt);
    ((StringBuilder)localObject).append(str);
    str = ((StringBuilder)localObject).toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void Oooo0O0(View paramView, boolean paramBoolean)
  {
    boolean bool1 = OooOoo0(paramView);
    if (bool1)
    {
      localObject1 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      boolean bool2 = this.o00o0000;
      float f = 1.0F;
      if (bool2)
      {
        ((DrawerLayout.LayoutParams)localObject1).OooO0O0 = f;
        paramBoolean = true;
        ((DrawerLayout.LayoutParams)localObject1).OooO0Oo = paramBoolean;
        OoooO0O(paramView, paramBoolean);
        OoooO0(paramView);
      }
      else
      {
        bool2 = false;
        if (paramBoolean)
        {
          paramBoolean = ((DrawerLayout.LayoutParams)localObject1).OooO0Oo | 0x2;
          ((DrawerLayout.LayoutParams)localObject1).OooO0Oo = paramBoolean;
          paramBoolean = OooO0OO(paramView, 3);
          int i;
          if (paramBoolean)
          {
            localObject2 = this.o00OooO;
            i = paramView.getTop();
            ((ViewDragHelper)localObject2).Oooo00o(paramView, 0, i);
          }
          else
          {
            localObject2 = this.o00OooOO;
            i = getWidth();
            int j = paramView.getWidth();
            i -= j;
            j = paramView.getTop();
            ((ViewDragHelper)localObject2).Oooo00o(paramView, i, j);
          }
        }
        else
        {
          Oooo000(paramView, f);
          OoooO(0, paramView);
          paramView.setVisibility(0);
        }
      }
      invalidate();
      return;
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("View ");
    ((StringBuilder)localObject1).append(paramView);
    ((StringBuilder)localObject1).append(" is not a sliding drawer");
    paramView = ((StringBuilder)localObject1).toString();
    ((IllegalArgumentException)localObject2).<init>(paramView);
    throw ((Throwable)localObject2);
  }
  
  public void Oooo0OO(DrawerLayout.DrawerListener paramDrawerListener)
  {
    if (paramDrawerListener == null) {
      return;
    }
    List localList = this.o00o00Oo;
    if (localList == null) {
      return;
    }
    localList.remove(paramDrawerListener);
  }
  
  public final Drawable Oooo0o()
  {
    int i = ViewCompat.OooOoOO(this);
    Drawable localDrawable;
    if (i == 0)
    {
      localDrawable = this.o00o0OOO;
      if (localDrawable != null)
      {
        OooOooo(localDrawable, i);
        return this.o00o0OOO;
      }
    }
    else
    {
      localDrawable = this.o00o0OO;
      if (localDrawable != null)
      {
        OooOooo(localDrawable, i);
        return this.o00o0OO;
      }
    }
    return this.o00o0Oo0;
  }
  
  public final Drawable Oooo0o0()
  {
    int i = ViewCompat.OooOoOO(this);
    Drawable localDrawable;
    if (i == 0)
    {
      localDrawable = this.o00o0OO;
      if (localDrawable != null)
      {
        OooOooo(localDrawable, i);
        return this.o00o0OO;
      }
    }
    else
    {
      localDrawable = this.o00o0OOO;
      if (localDrawable != null)
      {
        OooOooo(localDrawable, i);
        return this.o00o0OOO;
      }
    }
    return this.o00o0OOo;
  }
  
  public final void Oooo0oO()
  {
    boolean bool = o00o0oO0;
    if (bool) {
      return;
    }
    Drawable localDrawable = Oooo0o0();
    this.o00o00oo = localDrawable;
    localDrawable = Oooo0o();
    this.o00o0 = localDrawable;
  }
  
  public void Oooo0oo(Object paramObject, boolean paramBoolean)
  {
    this.o00o0O0O = paramObject;
    this.o00o0OO0 = paramBoolean;
    if (!paramBoolean)
    {
      paramObject = getBackground();
      if (paramObject == null)
      {
        bool = true;
        break label32;
      }
    }
    boolean bool = false;
    paramObject = null;
    label32:
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void OoooO(int paramInt, View paramView)
  {
    ViewDragHelper localViewDragHelper1 = this.o00OooO;
    int i = localViewDragHelper1.getViewDragState();
    ViewDragHelper localViewDragHelper2 = this.o00OooOO;
    int k = localViewDragHelper2.getViewDragState();
    int m = 1;
    int n;
    if ((i != m) && (k != m))
    {
      n = 2;
      if ((i != n) && (k != n)) {
        n = 0;
      }
    }
    else
    {
      n = m;
    }
    Object localObject;
    if ((paramView != null) && (paramInt == 0))
    {
      localObject = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      float f1 = ((DrawerLayout.LayoutParams)localObject).OooO0O0;
      float f2 = 0.0F;
      localViewDragHelper1 = null;
      boolean bool = f1 < 0.0F;
      if (!bool)
      {
        OooOO0(paramView);
      }
      else
      {
        int j = 1065353216;
        f2 = 1.0F;
        paramInt = f1 < f2;
        if (paramInt == 0) {
          OooOO0O(paramView);
        }
      }
    }
    paramInt = this.o00OoooO;
    if (n != paramInt)
    {
      this.o00OoooO = n;
      localObject = this.o00o00Oo;
      if (localObject != null)
      {
        paramInt = ((List)localObject).size() - m;
        while (paramInt >= 0)
        {
          paramView = (DrawerLayout.DrawerListener)this.o00o00Oo.get(paramInt);
          paramView.OooO0OO(n);
          paramInt += -1;
        }
      }
    }
  }
  
  public final void OoooO0(View paramView)
  {
    AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooOoO0;
    int i = localAccessibilityActionCompat.getId();
    ViewCompat.o00O0O(paramView, i);
    boolean bool = OooOoOO(paramView);
    if (bool)
    {
      int j = OooOOo0(paramView);
      int k = 2;
      if (j != k)
      {
        j = 0;
        AccessibilityViewCommand localAccessibilityViewCommand = this.o00o0o00;
        ViewCompat.o00Ooo(paramView, localAccessibilityActionCompat, null, localAccessibilityViewCommand);
      }
    }
  }
  
  public void OoooO00(View paramView, float paramFloat)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    float f = localLayoutParams.OooO0O0;
    boolean bool = paramFloat < f;
    if (!bool) {
      return;
    }
    localLayoutParams.OooO0O0 = paramFloat;
    OooOO0o(paramView, paramFloat);
  }
  
  public final void OoooO0O(View paramView, boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      if (!paramBoolean)
      {
        bool = OooOoo0(localView);
        if (!bool) {}
      }
      else
      {
        if ((!paramBoolean) || (localView != paramView)) {
          break label55;
        }
      }
      boolean bool = true;
      break label58;
      label55:
      int k = 4;
      label58:
      ViewCompat.o000000(localView, k);
      j += 1;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i = getDescendantFocusability();
    int j = 393216;
    if (i == j) {
      return;
    }
    i = getChildCount();
    j = 0;
    int k = 0;
    View localView1 = null;
    int m = 0;
    while (k < i)
    {
      View localView2 = getChildAt(k);
      boolean bool = OooOoo0(localView2);
      if (bool)
      {
        bool = OooOoOO(localView2);
        if (bool)
        {
          localView2.addFocusables(paramArrayList, paramInt1, paramInt2);
          m = 1;
        }
      }
      else
      {
        ArrayList localArrayList1 = this.o00o0Oo;
        localArrayList1.add(localView2);
      }
      k += 1;
    }
    if (m == 0)
    {
      ArrayList localArrayList2 = this.o00o0Oo;
      i = localArrayList2.size();
      while (j < i)
      {
        localView1 = (View)this.o00o0Oo.get(j);
        m = localView1.getVisibility();
        if (m == 0) {
          localView1.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        j += 1;
      }
    }
    this.o00o0Oo.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    Object localObject = OooOOOO();
    if (localObject == null)
    {
      paramInt = OooOoo0(paramView);
      if (paramInt == 0)
      {
        paramInt = 1;
        break label38;
      }
    }
    paramInt = 4;
    label38:
    ViewCompat.o000000(paramView, paramInt);
    paramInt = o00o0o;
    if (paramInt == 0)
    {
      localObject = this.o00OoOoo;
      ViewCompat.o00oO0o(paramView, (AccessibilityDelegateCompat)localObject);
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = paramLayoutParams instanceof DrawerLayout.LayoutParams;
    if (bool1)
    {
      bool2 = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramLayoutParams = null;
    return bool2;
  }
  
  public void close()
  {
    OooO0Oo(8388611);
  }
  
  public void computeScroll()
  {
    int i = getChildCount();
    boolean bool2 = false;
    float f1 = 0.0F;
    int j = 0;
    ViewDragHelper localViewDragHelper1 = null;
    while (j < i)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)getChildAt(j).getLayoutParams();
      float f2 = localLayoutParams.OooO0O0;
      f1 = Math.max(f1, f2);
      j += 1;
    }
    this.o00Ooo0o = f1;
    ViewDragHelper localViewDragHelper2 = this.o00OooO;
    bool2 = true;
    f1 = 1.4E-45F;
    boolean bool1 = localViewDragHelper2.OooOOO(bool2);
    localViewDragHelper1 = this.o00OooOO;
    bool2 = localViewDragHelper1.OooOOO(bool2);
    if ((bool1) || (bool2)) {
      ViewCompat.Ooooooo(this);
    }
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getSource() & 0x2;
    if (i != 0)
    {
      i = paramMotionEvent.getAction();
      int k = 10;
      float f1 = 1.401299E-044F;
      if (i != k)
      {
        float f2 = this.o00Ooo0o;
        k = 0;
        f1 = 0.0F;
        boolean bool1 = f2 < 0.0F;
        if (bool1)
        {
          int j = getChildCount();
          if (j != 0)
          {
            f1 = paramMotionEvent.getX();
            float f3 = paramMotionEvent.getY();
            int m = 1;
            j -= m;
            while (j >= 0)
            {
              View localView = getChildAt(j);
              boolean bool2 = OooOooO(f1, f3, localView);
              if (bool2)
              {
                bool2 = OooOoO(localView);
                if (!bool2)
                {
                  boolean bool3 = OooOOO0(paramMotionEvent, localView);
                  if (bool3) {
                    return m;
                  }
                }
              }
              j += -1;
            }
          }
          return false;
        }
      }
    }
    return super.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    DrawerLayout localDrawerLayout = this;
    Object localObject1 = paramView;
    int i = getHeight();
    boolean bool3 = OooOoO(paramView);
    int n = getWidth();
    int i1 = paramCanvas.save();
    int i2 = 3;
    int i3 = 0;
    float f1 = 0.0F;
    ViewDragHelper localViewDragHelper1 = null;
    ViewDragHelper localViewDragHelper2;
    float f2;
    if (bool3)
    {
      int i4 = getChildCount();
      int i5 = 0;
      localViewDragHelper2 = null;
      f2 = 0.0F;
      int i7 = 0;
      while (i5 < i4)
      {
        View localView = getChildAt(i5);
        if (localView != localObject1)
        {
          int i8 = localView.getVisibility();
          if (i8 == 0)
          {
            boolean bool6 = OooOo0O(localView);
            if (bool6)
            {
              bool6 = OooOoo0(localView);
              if (bool6)
              {
                int i9 = localView.getHeight();
                if (i9 >= i)
                {
                  boolean bool7 = OooO0OO(localView, i2);
                  int i10;
                  if (bool7)
                  {
                    i10 = localView.getRight();
                    if (i10 > i7) {
                      i7 = i10;
                    }
                  }
                  else
                  {
                    i10 = localView.getLeft();
                    if (i10 < n) {
                      n = i10;
                    }
                  }
                }
              }
            }
          }
        }
        i5 += 1;
      }
      i = getHeight();
      paramCanvas.clipRect(i7, 0, n, i);
      i3 = i7;
    }
    boolean bool4 = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i1);
    float f3 = localDrawerLayout.o00Ooo0o;
    i1 = 0;
    Object localObject2 = null;
    boolean bool5 = f3 < 0.0F;
    int i11;
    int m;
    Drawable localDrawable;
    float f5;
    float f6;
    if ((bool5) && (bool3))
    {
      i11 = localDrawerLayout.o00Ooo0O;
      i = (int)(((0xFF000000 & i11) >>> 24) * f3) << 24;
      m = 16777215;
      i11 = i11 & m | i;
      localDrawerLayout.o00OooO0.setColor(i11);
      float f4 = i3;
      i = 0;
      f3 = 0.0F;
      localDrawable = null;
      f5 = n;
      n = getHeight();
      f6 = n;
      localObject2 = localDrawerLayout.o00OooO0;
      paramCanvas.drawRect(f4, 0.0F, f5, f6, (Paint)localObject2);
    }
    else
    {
      localDrawable = localDrawerLayout.o00o00oo;
      m = 1132396544;
      f5 = 255.0F;
      n = 1065353216;
      f6 = 1.0F;
      if (localDrawable != null)
      {
        boolean bool1 = OooO0OO((View)localObject1, i2);
        if (bool1)
        {
          localDrawable = localDrawerLayout.o00o00oo;
          int j = localDrawable.getIntrinsicWidth();
          i2 = paramView.getRight();
          localViewDragHelper1 = localDrawerLayout.o00OooO;
          i3 = localViewDragHelper1.getEdgeSize();
          f2 = i2;
          f1 = i3;
          f2 /= f1;
          f6 = Math.min(f2, f6);
          f6 = Math.max(0.0F, f6);
          localObject2 = localDrawerLayout.o00o00oo;
          i3 = paramView.getTop();
          j += i2;
          i11 = paramView.getBottom();
          ((Drawable)localObject2).setBounds(i2, i3, j, i11);
          localObject1 = localDrawerLayout.o00o00oo;
          f6 *= f5;
          j = (int)f6;
          ((Drawable)localObject1).setAlpha(j);
        }
      }
      for (localObject1 = localDrawerLayout.o00o00oo;; localObject1 = localDrawerLayout.o00o0)
      {
        ((Drawable)localObject1).draw(paramCanvas);
        break;
        localDrawable = localDrawerLayout.o00o0;
        if (localDrawable == null) {
          break;
        }
        f3 = 7.006492E-045F;
        boolean bool2 = OooO0OO((View)localObject1, 5);
        if (!bool2) {
          break;
        }
        localDrawable = localDrawerLayout.o00o0;
        int k = localDrawable.getIntrinsicWidth();
        i2 = paramView.getLeft();
        i3 = getWidth() - i2;
        localViewDragHelper2 = localDrawerLayout.o00OooOO;
        int i6 = localViewDragHelper2.getEdgeSize();
        f1 = i3;
        f2 = i6;
        f1 /= f2;
        f6 = Math.min(f1, f6);
        f6 = Math.max(0.0F, f6);
        localObject2 = localDrawerLayout.o00o0;
        k = i2 - k;
        i3 = paramView.getTop();
        i11 = paramView.getBottom();
        ((Drawable)localObject2).setBounds(k, i3, i2, i11);
        localObject1 = localDrawerLayout.o00o0;
        f6 *= f5;
        k = (int)f6;
        ((Drawable)localObject1).setAlpha(k);
      }
    }
    return bool4;
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    DrawerLayout.LayoutParams localLayoutParams = new androidx/drawerlayout/widget/DrawerLayout$LayoutParams;
    int i = -1;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    DrawerLayout.LayoutParams localLayoutParams = new androidx/drawerlayout/widget/DrawerLayout$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof DrawerLayout.LayoutParams;
    DrawerLayout.LayoutParams localLayoutParams;
    if (bool)
    {
      localLayoutParams = new androidx/drawerlayout/widget/DrawerLayout$LayoutParams;
      paramLayoutParams = (DrawerLayout.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
    else
    {
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        localLayoutParams = new androidx/drawerlayout/widget/DrawerLayout$LayoutParams;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
      else
      {
        localLayoutParams = new androidx/drawerlayout/widget/DrawerLayout$LayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
    }
    return localLayoutParams;
  }
  
  public float getDrawerElevation()
  {
    boolean bool = o00o0oO0;
    if (bool) {
      return this.o00Ooo00;
    }
    return 0.0F;
  }
  
  public int getDrawerLockMode(int paramInt)
  {
    int i = ViewCompat.OooOoOO(this);
    int j = 3;
    if (paramInt != j)
    {
      int k = 5;
      if (paramInt != k)
      {
        k = 8388611;
        if (paramInt != k)
        {
          k = 8388613;
          if (paramInt == k)
          {
            paramInt = this.oo00oO;
            if (paramInt != j) {
              return paramInt;
            }
            if (i == 0) {
              paramInt = this.o00o000O;
            } else {
              paramInt = this.o00o000;
            }
            if (paramInt != j) {
              return paramInt;
            }
          }
        }
        else
        {
          paramInt = this.o00o000o;
          if (paramInt != j) {
            return paramInt;
          }
          if (i == 0) {
            paramInt = this.o00o000;
          } else {
            paramInt = this.o00o000O;
          }
          if (paramInt != j) {
            return paramInt;
          }
        }
      }
      else
      {
        paramInt = this.o00o000O;
        if (paramInt != j) {
          return paramInt;
        }
        if (i == 0) {
          paramInt = this.oo00oO;
        } else {
          paramInt = this.o00o000o;
        }
        if (paramInt != j) {
          return paramInt;
        }
      }
    }
    else
    {
      paramInt = this.o00o000;
      if (paramInt != j) {
        return paramInt;
      }
      if (i == 0) {
        paramInt = this.o00o000o;
      } else {
        paramInt = this.oo00oO;
      }
      if (paramInt != j) {
        return paramInt;
      }
    }
    return 0;
  }
  
  public CharSequence getDrawerTitle(int paramInt)
  {
    int i = ViewCompat.OooOoOO(this);
    paramInt = GravityCompat.OooO0O0(paramInt, i);
    i = 3;
    if (paramInt == i) {
      return this.o00o0O00;
    }
    i = 5;
    if (paramInt == i) {
      return this.o00o0O0;
    }
    return null;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.o00o00oO;
  }
  
  public boolean isDrawerOpen(int paramInt)
  {
    View localView = OooOOO(paramInt);
    if (localView != null) {
      return OooOoOO(localView);
    }
    return false;
  }
  
  public boolean isDrawerVisible(int paramInt)
  {
    View localView = OooOOO(paramInt);
    if (localView != null) {
      return OooOoo(localView);
    }
    return false;
  }
  
  public boolean isOpen()
  {
    return isDrawerOpen(8388611);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.o00o0000 = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.o00o0000 = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    boolean bool = this.o00o0OO0;
    if (bool)
    {
      Object localObject = this.o00o00oO;
      if (localObject != null)
      {
        localObject = this.o00o0O0O;
        int i;
        if (localObject != null)
        {
          localObject = (WindowInsets)localObject;
          i = ((WindowInsets)localObject).getSystemWindowInsetTop();
        }
        else
        {
          i = 0;
          localObject = null;
        }
        if (i > 0)
        {
          Drawable localDrawable = this.o00o00oO;
          int j = getWidth();
          localDrawable.setBounds(0, 0, j, i);
          localObject = this.o00o00oO;
          ((Drawable)localObject).draw(paramCanvas);
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    ViewDragHelper localViewDragHelper1 = this.o00OooO;
    boolean bool1 = localViewDragHelper1.Oooo00O(paramMotionEvent);
    ViewDragHelper localViewDragHelper2 = this.o00OooOO;
    int j = localViewDragHelper2.Oooo00O(paramMotionEvent);
    bool1 |= j;
    j = 1;
    float f1 = 1.4E-45F;
    float f2;
    float f3;
    label132:
    boolean bool4;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        f2 = 2.802597E-045F;
        int n = 3;
        f3 = 4.203895E-045F;
        if (i != k)
        {
          if (i != n) {
            break label132;
          }
        }
        else
        {
          paramMotionEvent = this.o00OooO;
          bool3 = paramMotionEvent.OooO0o0(n);
          if (!bool3) {
            break label132;
          }
          this.o00OooOo.OooO0OO();
          paramMotionEvent = this.o0O00o0;
          paramMotionEvent.OooO0OO();
          break label132;
        }
      }
      OooO(j);
      this.o00o00 = false;
      boolean bool3 = false;
      paramMotionEvent = null;
      f2 = 0.0F;
    }
    else
    {
      float f4 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.o00o00o0 = f4;
      this.o00o00o = f2;
      f3 = this.o00Ooo0o;
      boolean bool5 = f3 < 0.0F;
      if (bool5)
      {
        ViewDragHelper localViewDragHelper3 = this.o00OooO;
        i = (int)f4;
        int m = (int)f2;
        paramMotionEvent = localViewDragHelper3.OooOo0(i, m);
        if (paramMotionEvent != null)
        {
          bool4 = OooOoO(paramMotionEvent);
          if (bool4)
          {
            bool4 = j;
            f2 = f1;
            break label243;
          }
        }
      }
      bool4 = false;
      paramMotionEvent = null;
      f2 = 0.0F;
      label243:
      this.o00o00 = false;
    }
    boolean bool2;
    if ((!bool1) && (!bool4))
    {
      bool4 = OooOo0o();
      if (!bool4)
      {
        bool4 = this.o00o00;
        if (!bool4)
        {
          bool2 = false;
          localViewDragHelper2 = null;
          f1 = 0.0F;
        }
      }
    }
    return bool2;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 4;
    if (paramInt == i)
    {
      boolean bool = OooOo();
      if (bool)
      {
        paramKeyEvent.startTracking();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 4;
    if (paramInt == i)
    {
      View localView = OooOOOo();
      if (localView != null)
      {
        int j = OooOOo0(localView);
        if (j == 0) {
          OooO0oo();
        }
      }
      if (localView != null)
      {
        paramInt = 1;
      }
      else
      {
        paramInt = 0;
        localView = null;
      }
      return paramInt;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    DrawerLayout localDrawerLayout = this;
    int i = 1;
    float f1 = 1.4E-45F;
    this.o00Ooooo = i;
    int m = paramInt3 - paramInt1;
    int n = getChildCount();
    int i1 = 0;
    int i13;
    Object localObject;
    while (i1 < n)
    {
      View localView = localDrawerLayout.getChildAt(i1);
      int i2 = localView.getVisibility();
      int i3 = 8;
      if (i2 != i3)
      {
        DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        boolean bool3 = localDrawerLayout.OooOoO(localView);
        int i4;
        int i5;
        int i8;
        if (bool3)
        {
          i4 = localLayoutParams.leftMargin;
          i5 = localLayoutParams.topMargin;
          int i6 = localView.getMeasuredWidth() + i4;
          i2 = localLayoutParams.topMargin;
          i8 = localView.getMeasuredHeight();
          i2 += i8;
          localView.layout(i4, i5, i6, i2);
        }
        else
        {
          i4 = localView.getMeasuredWidth();
          i5 = localView.getMeasuredHeight();
          float f2 = 4.203895E-045F;
          boolean bool4 = localDrawerLayout.OooO0OO(localView, 3);
          int i7;
          int i9;
          float f4;
          if (bool4)
          {
            i7 = -i4;
            f3 = i4;
            i9 = (int)(localLayoutParams.OooO0O0 * f3);
            i7 += i9;
            i9 = i4 + i7;
            f4 = i9 / f3;
          }
          else
          {
            f2 = i4;
            f3 = localLayoutParams.OooO0O0 * f2;
            i8 = (int)f3;
            i8 = m - i8;
            i9 = m - i8;
            f4 = i9 / f2;
            i7 = i8;
          }
          float f3 = localLayoutParams.OooO0O0;
          boolean bool5 = f4 < f3;
          if (bool5)
          {
            bool5 = i;
            f3 = f1;
          }
          else
          {
            bool5 = false;
            f3 = 0.0F;
          }
          int i10 = localLayoutParams.OooO00o & 0x70;
          int i11 = 16;
          if (i10 != i11)
          {
            i11 = 80;
            if (i10 != i11)
            {
              i10 = localLayoutParams.topMargin;
              i4 += i7;
              i5 += i10;
            }
            for (;;)
            {
              localView.layout(i7, i10, i4, i5);
              break;
              i5 = paramInt4 - paramInt2;
              i10 = localLayoutParams.bottomMargin;
              i10 = i5 - i10;
              i11 = localView.getMeasuredHeight();
              i10 -= i11;
              i4 += i7;
              i11 = localLayoutParams.bottomMargin;
              i5 -= i11;
            }
          }
          i10 = paramInt4 - paramInt2;
          i11 = (i10 - i5) / 2;
          int i12 = localLayoutParams.topMargin;
          if (i11 < i12)
          {
            i11 = i12;
          }
          else
          {
            i12 = i11 + i5;
            i = localLayoutParams.bottomMargin;
            i13 = i10 - i;
            if (i12 > i13)
            {
              i10 -= i;
              i11 = i10 - i5;
            }
          }
          i4 += i7;
          i5 += i11;
          localView.layout(i7, i11, i4, i5);
          if (bool5) {
            localDrawerLayout.OoooO00(localView, f4);
          }
          f1 = localLayoutParams.OooO0O0;
          i13 = 0;
          boolean bool1 = f1 < 0.0F;
          if (bool1)
          {
            bool1 = false;
            f1 = 0.0F;
            localObject = null;
          }
          else
          {
            j = 4;
            f1 = 5.605194E-045F;
          }
          i13 = localView.getVisibility();
          if (i13 != j) {
            localView.setVisibility(j);
          }
        }
      }
      i1 += 1;
      int j = 1;
      f1 = 1.4E-45F;
    }
    boolean bool2 = o00o0oO;
    if (bool2)
    {
      localObject = getRootWindowInsets();
      if (localObject != null)
      {
        localObject = WindowInsetsCompat.OooOO0((WindowInsets)localObject).getSystemGestureInsets();
        ViewDragHelper localViewDragHelper = localDrawerLayout.o00OooO;
        n = localViewDragHelper.getDefaultEdgeSize();
        i13 = ((Insets)localObject).OooO00o;
        n = Math.max(n, i13);
        localViewDragHelper.setEdgeSize(n);
        localViewDragHelper = localDrawerLayout.o00OooOO;
        n = localViewDragHelper.getDefaultEdgeSize();
        int k = ((Insets)localObject).OooO0OO;
        k = Math.max(n, k);
        localViewDragHelper.setEdgeSize(k);
      }
    }
    localDrawerLayout.o00Ooooo = false;
    localDrawerLayout.o00o0000 = false;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    DrawerLayout localDrawerLayout = this;
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    int i2 = 1073741824;
    if ((i != i2) || (j != i2))
    {
      boolean bool4 = isInEditMode();
      if (!bool4) {
        break label1021;
      }
      i3 = 300;
      if (i == 0) {
        n = i3;
      }
      if (j == 0) {
        i1 = i3;
      }
    }
    localDrawerLayout.setMeasuredDimension(n, i1);
    Object localObject1 = localDrawerLayout.o00o0O0O;
    int i3 = 0;
    if (localObject1 != null)
    {
      bool1 = ViewCompat.OooOo(this);
      if (bool1)
      {
        bool1 = true;
        break label124;
      }
    }
    boolean bool1 = false;
    localObject1 = null;
    label124:
    int i4 = ViewCompat.OooOoOO(this);
    int i5 = getChildCount();
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    while (i6 < i5)
    {
      View localView = localDrawerLayout.getChildAt(i6);
      int i9 = localView.getVisibility();
      int i10 = 8;
      float f1 = 1.121039E-044F;
      DrawerLayout.LayoutParams localLayoutParams;
      int i11;
      float f2;
      if (i9 != i10)
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        i10 = 3;
        f1 = 4.203895E-045F;
        if (bool1)
        {
          i11 = GravityCompat.OooO0O0(localLayoutParams.OooO00o, i4);
          boolean bool5 = ViewCompat.OooOo(localView);
          j = 5;
          f2 = 7.006492E-045F;
          WindowInsets localWindowInsets = (WindowInsets)localDrawerLayout.o00o0O0O;
          if (bool5)
          {
            if (i11 == i10)
            {
              j = localWindowInsets.getSystemWindowInsetLeft();
              i11 = localWindowInsets.getSystemWindowInsetTop();
              i10 = localWindowInsets.getSystemWindowInsetBottom();
              localWindowInsets = localWindowInsets.replaceSystemWindowInsets(j, i11, 0, i10);
            }
            else if (i11 == j)
            {
              j = localWindowInsets.getSystemWindowInsetTop();
              i10 = localWindowInsets.getSystemWindowInsetRight();
              i11 = localWindowInsets.getSystemWindowInsetBottom();
              localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, j, i10, i11);
            }
            localView.dispatchApplyWindowInsets(localWindowInsets);
          }
          else
          {
            i10 = 3;
            f1 = 4.203895E-045F;
            if (i11 == i10)
            {
              j = localWindowInsets.getSystemWindowInsetLeft();
              i10 = localWindowInsets.getSystemWindowInsetTop();
              i11 = localWindowInsets.getSystemWindowInsetBottom();
              localWindowInsets = localWindowInsets.replaceSystemWindowInsets(j, i10, 0, i11);
            }
            else if (i11 == j)
            {
              j = localWindowInsets.getSystemWindowInsetTop();
              i10 = localWindowInsets.getSystemWindowInsetRight();
              i11 = localWindowInsets.getSystemWindowInsetBottom();
              localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, j, i10, i11);
            }
            j = localWindowInsets.getSystemWindowInsetLeft();
            localLayoutParams.leftMargin = j;
            j = localWindowInsets.getSystemWindowInsetTop();
            localLayoutParams.topMargin = j;
            j = localWindowInsets.getSystemWindowInsetRight();
            localLayoutParams.rightMargin = j;
            j = localWindowInsets.getSystemWindowInsetBottom();
            localLayoutParams.bottomMargin = j;
          }
        }
        boolean bool2 = localDrawerLayout.OooOoO(localView);
        if (bool2)
        {
          int k = localLayoutParams.leftMargin;
          k = n - k;
          i2 = localLayoutParams.rightMargin;
          k -= i2;
          i2 = 1073741824;
          k = View.MeasureSpec.makeMeasureSpec(k, i2);
          i10 = localLayoutParams.topMargin;
          i10 = i1 - i10;
          i9 = localLayoutParams.bottomMargin;
          i10 -= i9;
          i9 = View.MeasureSpec.makeMeasureSpec(i10, i2);
          localView.measure(k, i9);
        }
      }
      else
      {
        i11 = paramInt1;
        i9 = paramInt2;
        break label931;
      }
      i2 = 1073741824;
      boolean bool3 = localDrawerLayout.OooOoo0(localView);
      Object localObject2;
      if (bool3)
      {
        bool3 = o00o0oO0;
        if (bool3)
        {
          f2 = ViewCompat.OooOo0O(localView);
          f1 = localDrawerLayout.o00Ooo00;
          bool3 = f2 < f1;
          if (bool3) {
            ViewCompat.oo0o0Oo(localView, f1);
          }
        }
        int m = localDrawerLayout.OooOOo(localView) & 0x7;
        i10 = 3;
        f1 = 4.203895E-045F;
        if (m == i10)
        {
          i10 = 1;
          f1 = 1.4E-45F;
        }
        else
        {
          i10 = 0;
          f1 = 0.0F;
        }
        if (((i10 != 0) && (i7 != 0)) || ((i10 == 0) && (i8 != 0)))
        {
          localObject1 = new java/lang/IllegalStateException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Child drawer has absolute gravity ");
          localObject2 = OooOo0(m);
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append(" but this ");
          localStringBuilder.append("DrawerLayout");
          localStringBuilder.append(" already has a drawer view along that edge");
          localObject2 = localStringBuilder.toString();
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        if (i10 != 0) {
          i7 = 1;
        } else {
          i8 = 1;
        }
        m = localDrawerLayout.o00Ooo0;
        i10 = localLayoutParams.leftMargin;
        m += i10;
        i10 = localLayoutParams.rightMargin;
        m += i10;
        i10 = localLayoutParams.width;
        i11 = paramInt1;
        m = ViewGroup.getChildMeasureSpec(paramInt1, m, i10);
        i10 = localLayoutParams.topMargin;
        i2 = localLayoutParams.bottomMargin;
        i10 += i2;
        i2 = localLayoutParams.height;
        i9 = paramInt2;
        i2 = ViewGroup.getChildMeasureSpec(paramInt2, i10, i2);
        localView.measure(m, i2);
        label931:
        i6 += 1;
        i2 = 1073741824;
      }
      else
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Child ");
        ((StringBuilder)localObject2).append(localView);
        ((StringBuilder)localObject2).append(" at index ");
        ((StringBuilder)localObject2).append(i6);
        ((StringBuilder)localObject2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
        localObject2 = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    return;
    label1021:
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
    throw ((Throwable)localObject1);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof DrawerLayout.SavedState;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (DrawerLayout.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    int i = paramParcelable.o00OoOoo;
    if (i != 0)
    {
      localObject = OooOOO(i);
      if (localObject != null) {
        Oooo0((View)localObject);
      }
    }
    i = paramParcelable.o00Ooo00;
    int j = 3;
    if (i != j) {
      setDrawerLockMode(i, j);
    }
    i = paramParcelable.o00Ooo0;
    int k;
    if (i != j)
    {
      k = 5;
      setDrawerLockMode(i, k);
    }
    i = paramParcelable.o00Ooo0O;
    if (i != j)
    {
      k = 8388611;
      setDrawerLockMode(i, k);
    }
    int m = paramParcelable.o00Ooo0o;
    if (m != j)
    {
      i = 8388613;
      setDrawerLockMode(m, i);
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    Oooo0oO();
  }
  
  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    DrawerLayout.SavedState localSavedState = new androidx/drawerlayout/widget/DrawerLayout$SavedState;
    localSavedState.<init>(localParcelable);
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)getChildAt(j).getLayoutParams();
      int k = localLayoutParams.OooO0Oo;
      int m = 1;
      int n;
      if (k == m) {
        n = m;
      } else {
        n = 0;
      }
      int i1 = 2;
      if (k != i1) {
        m = 0;
      }
      if ((n == 0) && (m == 0))
      {
        j += 1;
      }
      else
      {
        i = localLayoutParams.OooO00o;
        localSavedState.o00OoOoo = i;
      }
    }
    i = this.o00o000;
    localSavedState.o00Ooo00 = i;
    i = this.o00o000O;
    localSavedState.o00Ooo0 = i;
    i = this.o00o000o;
    localSavedState.o00Ooo0O = i;
    i = this.oo00oO;
    localSavedState.o00Ooo0o = i;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.o00OooO.OooOoOO(paramMotionEvent);
    ViewDragHelper localViewDragHelper = this.o00OooOO;
    localViewDragHelper.OooOoOO(paramMotionEvent);
    int i = paramMotionEvent.getAction() & 0xFF;
    boolean bool1 = false;
    int j = 1;
    float f1;
    float f2;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 3;
        f1 = 4.203895E-045F;
        if (i != k) {
          break label279;
        }
        OooO(j);
      }
      else
      {
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        Object localObject = this.o00OooO;
        int n = (int)f2;
        int i1 = (int)f1;
        localObject = ((ViewDragHelper)localObject).OooOo0(n, i1);
        if (localObject != null)
        {
          boolean bool3 = OooOoO((View)localObject);
          if (bool3)
          {
            float f3 = this.o00o00o0;
            f2 -= f3;
            f3 = this.o00o00o;
            f1 -= f3;
            localObject = this.o00OooO;
            int i2 = ((ViewDragHelper)localObject).getTouchSlop();
            f2 *= f2;
            f1 *= f1;
            f2 += f1;
            i2 *= i2;
            f1 = i2;
            boolean bool2 = f2 < f1;
            if (bool2)
            {
              paramMotionEvent = OooOOOO();
              if (paramMotionEvent != null)
              {
                int m = OooOOo0(paramMotionEvent);
                i = 2;
                f2 = 2.802597E-045F;
                if (m != i) {
                  break label241;
                }
              }
            }
          }
        }
        bool1 = j;
        label241:
        OooO(bool1);
        break label279;
      }
    }
    else
    {
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      this.o00o00o0 = f2;
      this.o00o00o = f1;
    }
    this.o00o00 = false;
    label279:
    return j;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean)
    {
      paramBoolean = true;
      OooO(paramBoolean);
    }
  }
  
  public void requestLayout()
  {
    boolean bool = this.o00Ooooo;
    if (!bool) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.o00Ooo00 = paramFloat;
    int i = 0;
    paramFloat = 0.0F;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      boolean bool = OooOoo0(localView);
      if (bool)
      {
        float f = this.o00Ooo00;
        ViewCompat.oo0o0Oo(localView, f);
      }
      i += 1;
    }
  }
  
  public void setDrawerListener(DrawerLayout.DrawerListener paramDrawerListener)
  {
    DrawerLayout.DrawerListener localDrawerListener = this.o00o00O0;
    if (localDrawerListener != null) {
      Oooo0OO(localDrawerListener);
    }
    if (paramDrawerListener != null) {
      OooO00o(paramDrawerListener);
    }
    this.o00o00O0 = paramDrawerListener;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    setDrawerLockMode(paramInt, 3);
    setDrawerLockMode(paramInt, 5);
  }
  
  public void setDrawerLockMode(int paramInt1, int paramInt2)
  {
    int i = ViewCompat.OooOoOO(this);
    i = GravityCompat.OooO0O0(paramInt2, i);
    int j = 3;
    if (paramInt2 != j)
    {
      int k = 5;
      if (paramInt2 != k)
      {
        k = 8388611;
        if (paramInt2 != k)
        {
          k = 8388613;
          if (paramInt2 == k) {
            this.oo00oO = paramInt1;
          }
        }
        else
        {
          this.o00o000o = paramInt1;
        }
      }
      else
      {
        this.o00o000O = paramInt1;
      }
    }
    else
    {
      this.o00o000 = paramInt1;
    }
    if (paramInt1 != 0)
    {
      ViewDragHelper localViewDragHelper;
      if (i == j) {
        localViewDragHelper = this.o00OooO;
      } else {
        localViewDragHelper = this.o00OooOO;
      }
      localViewDragHelper.OooO0O0();
    }
    paramInt2 = 1;
    View localView;
    if (paramInt1 != paramInt2)
    {
      paramInt2 = 2;
      if (paramInt1 == paramInt2)
      {
        localView = OooOOO(i);
        if (localView != null) {
          Oooo0(localView);
        }
      }
    }
    else
    {
      localView = OooOOO(i);
      if (localView != null) {
        OooO0o(localView);
      }
    }
  }
  
  public void setDrawerLockMode(int paramInt, View paramView)
  {
    boolean bool = OooOoo0(paramView);
    if (bool)
    {
      int i = ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).OooO00o;
      setDrawerLockMode(paramInt, i);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer with appropriate layout_gravity");
    paramView = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramView);
    throw localIllegalArgumentException;
  }
  
  public void setDrawerShadow(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = ContextCompat.OooO0o0(getContext(), paramInt1);
    Oooo(localDrawable, paramInt2);
  }
  
  public void setDrawerTitle(int paramInt, CharSequence paramCharSequence)
  {
    int i = ViewCompat.OooOoOO(this);
    paramInt = GravityCompat.OooO0O0(paramInt, i);
    i = 3;
    if (paramInt == i)
    {
      this.o00o0O00 = paramCharSequence;
    }
    else
    {
      i = 5;
      if (paramInt == i) {
        this.o00o0O0 = paramCharSequence;
      }
    }
  }
  
  public void setScrimColor(int paramInt)
  {
    this.o00Ooo0O = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = ContextCompat.OooO0o0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    this.o00o00oO = localDrawable;
    invalidate();
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.o00o00oO = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    this.o00o00oO = localColorDrawable;
    invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout
 * JD-Core Version:    0.7.0.1
 */