package androidx.appcompat.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;

class TooltipCompatHandler
  implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
  public static TooltipCompatHandler o00OoooO;
  public static TooltipCompatHandler o00Ooooo;
  public final View o00OoOoo;
  public final int o00Ooo0;
  public final CharSequence o00Ooo00;
  public final Runnable o00Ooo0O;
  public final Runnable o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public TooltipPopup o00OooOO;
  public boolean o00OooOo;
  public boolean o0O00o0;
  
  private static void setPendingHandler(TooltipCompatHandler paramTooltipCompatHandler)
  {
    TooltipCompatHandler localTooltipCompatHandler = o00OoooO;
    if (localTooltipCompatHandler != null) {
      localTooltipCompatHandler.OooO00o();
    }
    o00OoooO = paramTooltipCompatHandler;
    if (paramTooltipCompatHandler != null) {
      paramTooltipCompatHandler.OooO0Oo();
    }
  }
  
  public final void OooO00o()
  {
    View localView = this.o00OoOoo;
    Runnable localRunnable = this.o00Ooo0O;
    localView.removeCallbacks(localRunnable);
  }
  
  public final void OooO0O0()
  {
    this.o0O00o0 = true;
  }
  
  public void OooO0OO()
  {
    Object localObject = o00Ooooo;
    Runnable localRunnable = null;
    if (localObject == this)
    {
      o00Ooooo = null;
      localObject = this.o00OooOO;
      if (localObject != null)
      {
        ((TooltipPopup)localObject).OooO0OO();
        this.o00OooOO = null;
        OooO0O0();
        localObject = this.o00OoOoo;
        ((View)localObject).removeOnAttachStateChangeListener(this);
      }
    }
    localObject = o00OoooO;
    if (localObject == this) {
      setPendingHandler(null);
    }
    localObject = this.o00OoOoo;
    localRunnable = this.o00Ooo0o;
    ((View)localObject).removeCallbacks(localRunnable);
  }
  
  public final void OooO0Oo()
  {
    View localView = this.o00OoOoo;
    Runnable localRunnable = this.o00Ooo0O;
    long l = ViewConfiguration.getLongPressTimeout();
    localView.postDelayed(localRunnable, l);
  }
  
  public final boolean OooO0o(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    int i = (int)f1;
    float f2 = paramMotionEvent.getY();
    int j = (int)f2;
    boolean bool = this.o0O00o0;
    if (!bool)
    {
      int k = this.o00OooO0;
      k = Math.abs(i - k);
      int m = this.o00Ooo0;
      if (k <= m)
      {
        k = this.o00OooO;
        k = Math.abs(j - k);
        m = this.o00Ooo0;
        if (k <= m) {
          return false;
        }
      }
    }
    this.o00OooO0 = i;
    this.o00OooO = j;
    this.o0O00o0 = false;
    return true;
  }
  
  public void OooO0o0(boolean paramBoolean)
  {
    Object localObject1 = this.o00OoOoo;
    boolean bool1 = ViewCompat.o000oOoO((View)localObject1);
    if (!bool1) {
      return;
    }
    bool1 = false;
    setPendingHandler(null);
    localObject1 = o00Ooooo;
    if (localObject1 != null) {
      ((TooltipCompatHandler)localObject1).OooO0OO();
    }
    o00Ooooo = this;
    this.o00OooOo = paramBoolean;
    TooltipPopup localTooltipPopup = new androidx/appcompat/widget/TooltipPopup;
    Object localObject2 = this.o00OoOoo.getContext();
    localTooltipPopup.<init>((Context)localObject2);
    this.o00OooOO = localTooltipPopup;
    Object localObject3 = this.o00OoOoo;
    int i = this.o00OooO0;
    int j = this.o00OooO;
    boolean bool2 = this.o00OooOo;
    CharSequence localCharSequence = this.o00Ooo00;
    localTooltipPopup.OooO0Oo((View)localObject3, i, j, bool2, localCharSequence);
    localObject2 = this.o00OoOoo;
    ((View)localObject2).addOnAttachStateChangeListener(this);
    paramBoolean = this.o00OooOo;
    long l1;
    if (paramBoolean)
    {
      l1 = 2500L;
    }
    else
    {
      localObject2 = this.o00OoOoo;
      paramBoolean = ViewCompat.Oooo0oo((View)localObject2);
      bool1 = true;
      paramBoolean &= bool1;
      long l2;
      if (paramBoolean == bool1)
      {
        paramBoolean = ViewConfiguration.getLongPressTimeout();
        l1 = paramBoolean;
        l2 = 3000L;
      }
      else
      {
        paramBoolean = ViewConfiguration.getLongPressTimeout();
        l1 = paramBoolean;
        l2 = 15000L;
      }
      l1 = l2 - l1;
    }
    localObject2 = this.o00OoOoo;
    localObject3 = this.o00Ooo0o;
    ((View)localObject2).removeCallbacks((Runnable)localObject3);
    localObject2 = this.o00OoOoo;
    localObject3 = this.o00Ooo0o;
    ((View)localObject2).postDelayed((Runnable)localObject3, l1);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    paramView = this.o00OooOO;
    boolean bool1;
    if (paramView != null)
    {
      bool1 = this.o00OooOo;
      if (bool1) {
        return false;
      }
    }
    paramView = this.o00OoOoo.getContext();
    String str = "accessibility";
    paramView = (AccessibilityManager)paramView.getSystemService(str);
    boolean bool3 = paramView.isEnabled();
    if (bool3)
    {
      bool1 = paramView.isTouchExplorationEnabled();
      if (bool1) {
        return false;
      }
    }
    int i = paramMotionEvent.getAction();
    int j = 7;
    if (i != j)
    {
      int k = 10;
      if (i == k)
      {
        OooO0O0();
        OooO0OO();
      }
    }
    else
    {
      paramView = this.o00OoOoo;
      boolean bool2 = paramView.isEnabled();
      if (bool2)
      {
        paramView = this.o00OooOO;
        if (paramView == null)
        {
          bool2 = OooO0o(paramMotionEvent);
          if (bool2) {
            setPendingHandler(this);
          }
        }
      }
    }
    return false;
  }
  
  public boolean onLongClick(View paramView)
  {
    int i = paramView.getWidth() / 2;
    this.o00OooO0 = i;
    int j = paramView.getHeight() / 2;
    this.o00OooO = j;
    j = 1;
    OooO0o0(j);
    return j;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    OooO0OO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.TooltipCompatHandler
 * JD-Core Version:    0.7.0.1
 */