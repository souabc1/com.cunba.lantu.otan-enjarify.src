package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

public abstract class ForwardingListener
  implements View.OnTouchListener, View.OnAttachStateChangeListener
{
  public final float o00OoOoo;
  public final int o00Ooo0;
  public final int o00Ooo00;
  public final View o00Ooo0O;
  public Runnable o00Ooo0o;
  public boolean o00OooO;
  public Runnable o00OooO0;
  public int o00OooOO;
  public final int[] o00OooOo;
  
  public ForwardingListener(View paramView)
  {
    int i = 2;
    int[] arrayOfInt = new int[i];
    this.o00OooOo = arrayOfInt;
    this.o00Ooo0O = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    float f = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.o00OoOoo = f;
    int j = ViewConfiguration.getTapTimeout();
    this.o00Ooo00 = j;
    int k = ViewConfiguration.getLongPressTimeout();
    j = (j + k) / i;
    this.o00Ooo0 = j;
  }
  
  public static boolean OooO0oO(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = -paramFloat3;
    boolean bool1 = paramFloat1 < f1;
    if (!bool1)
    {
      boolean bool2 = paramFloat2 < f1;
      if (!bool2)
      {
        int j = paramView.getRight();
        int i = paramView.getLeft();
        j -= i;
        f1 = j + paramFloat3;
        boolean bool3 = paramFloat1 < f1;
        if (bool3)
        {
          int k = paramView.getBottom();
          int m = paramView.getTop();
          k -= m;
          f2 = k + paramFloat3;
          bool4 = paramFloat2 < f2;
          if (bool4)
          {
            bool4 = true;
            f2 = 1.4E-45F;
            break label118;
          }
        }
      }
    }
    boolean bool4 = false;
    float f2 = 0.0F;
    paramView = null;
    label118:
    return bool4;
  }
  
  public final boolean OooO(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.o00OooOo;
    paramView.getLocationOnScreen(arrayOfInt);
    float f1 = -arrayOfInt[0];
    boolean bool = true;
    float f2 = -arrayOfInt[bool];
    paramMotionEvent.offsetLocation(f1, f2);
    return bool;
  }
  
  public final void OooO00o()
  {
    Runnable localRunnable = this.o00OooO0;
    View localView;
    if (localRunnable != null)
    {
      localView = this.o00Ooo0O;
      localView.removeCallbacks(localRunnable);
    }
    localRunnable = this.o00Ooo0o;
    if (localRunnable != null)
    {
      localView = this.o00Ooo0O;
      localView.removeCallbacks(localRunnable);
    }
  }
  
  public boolean OooO0O0()
  {
    ShowableListMenu localShowableListMenu = getPopup();
    if (localShowableListMenu != null)
    {
      boolean bool = localShowableListMenu.isShowing();
      if (!bool) {
        localShowableListMenu.show();
      }
    }
    return true;
  }
  
  public boolean OooO0OO()
  {
    ShowableListMenu localShowableListMenu = getPopup();
    if (localShowableListMenu != null)
    {
      boolean bool = localShowableListMenu.isShowing();
      if (bool) {
        localShowableListMenu.dismiss();
      }
    }
    return true;
  }
  
  public void OooO0Oo()
  {
    OooO00o();
    View localView = this.o00Ooo0O;
    boolean bool1 = localView.isEnabled();
    if (bool1)
    {
      bool1 = localView.isLongClickable();
      if (!bool1)
      {
        bool1 = OooO0O0();
        if (!bool1) {
          return;
        }
        Object localObject = localView.getParent();
        boolean bool2 = true;
        ((ViewParent)localObject).requestDisallowInterceptTouchEvent(bool2);
        long l = SystemClock.uptimeMillis();
        int i = 3;
        localObject = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
        localView.onTouchEvent((MotionEvent)localObject);
        ((MotionEvent)localObject).recycle();
        this.o00OooO = bool2;
      }
    }
  }
  
  public final boolean OooO0o(MotionEvent paramMotionEvent)
  {
    View localView = this.o00Ooo0O;
    boolean bool1 = localView.isEnabled();
    if (!bool1) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        int k = 2;
        float f1 = 2.802597E-045F;
        float f2;
        if (i != k)
        {
          int m = 3;
          f2 = 4.203895E-045F;
          if (i != m) {
            break label243;
          }
        }
        else
        {
          i = this.o00OooOO;
          i = paramMotionEvent.findPointerIndex(i);
          if (i < 0) {
            break label243;
          }
          f1 = paramMotionEvent.getX(i);
          f2 = paramMotionEvent.getY(i);
          float f3 = this.o00OoOoo;
          boolean bool2 = OooO0oO(localView, f1, f2, f3);
          if (bool2) {
            break label243;
          }
          OooO00o();
          localView.getParent().requestDisallowInterceptTouchEvent(j);
          return j;
        }
      }
      OooO00o();
    }
    else
    {
      int n = paramMotionEvent.getPointerId(0);
      this.o00OooOO = n;
      paramMotionEvent = this.o00Ooo0o;
      if (paramMotionEvent == null)
      {
        paramMotionEvent = new androidx/appcompat/widget/ForwardingListener$DisallowIntercept;
        paramMotionEvent.<init>(this);
        this.o00Ooo0o = paramMotionEvent;
      }
      paramMotionEvent = this.o00Ooo0o;
      i = this.o00Ooo00;
      long l = i;
      localView.postDelayed(paramMotionEvent, l);
      paramMotionEvent = this.o00OooO0;
      if (paramMotionEvent == null)
      {
        paramMotionEvent = new androidx/appcompat/widget/ForwardingListener$TriggerLongPress;
        paramMotionEvent.<init>(this);
        this.o00OooO0 = paramMotionEvent;
      }
      paramMotionEvent = this.o00OooO0;
      i = this.o00Ooo0;
      l = i;
      localView.postDelayed(paramMotionEvent, l);
    }
    label243:
    return false;
  }
  
  public final boolean OooO0o0(MotionEvent paramMotionEvent)
  {
    View localView = this.o00Ooo0O;
    Object localObject = getPopup();
    boolean bool1 = false;
    if (localObject != null)
    {
      boolean bool2 = ((ShowableListMenu)localObject).isShowing();
      if (bool2)
      {
        localObject = (DropDownListView)((ShowableListMenu)localObject).getListView();
        if (localObject != null)
        {
          bool2 = ((View)localObject).isShown();
          if (bool2)
          {
            MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
            OooO0oo(localView, localMotionEvent);
            OooO((View)localObject, localMotionEvent);
            int j = this.o00OooOO;
            boolean bool3 = ((DropDownListView)localObject).OooO0o0(localMotionEvent, j);
            localMotionEvent.recycle();
            int k = paramMotionEvent.getActionMasked();
            int m = 1;
            if (k != m)
            {
              int i = 3;
              if (k != i)
              {
                k = m;
                break label142;
              }
            }
            k = 0;
            paramMotionEvent = null;
            label142:
            if ((bool3) && (k != 0)) {
              bool1 = m;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final boolean OooO0oo(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.o00OooOo;
    paramView.getLocationOnScreen(arrayOfInt);
    float f1 = arrayOfInt[0];
    boolean bool = true;
    float f2 = arrayOfInt[bool];
    paramMotionEvent.offsetLocation(f1, f2);
    return bool;
  }
  
  public abstract ShowableListMenu getPopup();
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.o00OooO;
    boolean bool2 = true;
    boolean bool3;
    if (bool1)
    {
      bool3 = OooO0o0(paramMotionEvent);
      if (!bool3)
      {
        bool3 = OooO0OO();
        if (bool3)
        {
          bool3 = false;
          paramMotionEvent = null;
          break label134;
        }
      }
      bool3 = bool2;
    }
    else
    {
      bool3 = OooO0o(paramMotionEvent);
      if (bool3)
      {
        bool3 = OooO0O0();
        if (bool3)
        {
          bool3 = bool2;
          break label88;
        }
      }
      bool3 = false;
      paramMotionEvent = null;
      label88:
      if (bool3)
      {
        long l = SystemClock.uptimeMillis();
        int i = 3;
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
        View localView = this.o00Ooo0O;
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
    }
    label134:
    this.o00OooO = bool3;
    if ((!bool3) && (!bool1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.o00OooO = false;
    int i = -1;
    this.o00OooOO = i;
    paramView = this.o00Ooo0o;
    if (paramView != null)
    {
      View localView = this.o00Ooo0O;
      localView.removeCallbacks(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ForwardingListener
 * JD-Core Version:    0.7.0.1
 */