package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class OneShotPreDrawListener
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  public final View o00OoOoo;
  public final Runnable o00Ooo0;
  public ViewTreeObserver o00Ooo00;
  
  public OneShotPreDrawListener(View paramView, Runnable paramRunnable)
  {
    this.o00OoOoo = paramView;
    paramView = paramView.getViewTreeObserver();
    this.o00Ooo00 = paramView;
    this.o00Ooo0 = paramRunnable;
  }
  
  public static OneShotPreDrawListener OooO00o(View paramView, Runnable paramRunnable)
  {
    if (paramView != null)
    {
      if (paramRunnable != null)
      {
        OneShotPreDrawListener localOneShotPreDrawListener = new androidx/core/view/OneShotPreDrawListener;
        localOneShotPreDrawListener.<init>(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(localOneShotPreDrawListener);
        paramView.addOnAttachStateChangeListener(localOneShotPreDrawListener);
        return localOneShotPreDrawListener;
      }
      paramView = new java/lang/NullPointerException;
      paramView.<init>("runnable == null");
      throw paramView;
    }
    paramView = new java/lang/NullPointerException;
    paramView.<init>("view == null");
    throw paramView;
  }
  
  public void OooO0O0()
  {
    ViewTreeObserver localViewTreeObserver = this.o00Ooo00;
    boolean bool = localViewTreeObserver.isAlive();
    if (bool) {
      localViewTreeObserver = this.o00Ooo00;
    } else {
      localViewTreeObserver = this.o00OoOoo.getViewTreeObserver();
    }
    localViewTreeObserver.removeOnPreDrawListener(this);
    this.o00OoOoo.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    OooO0O0();
    this.o00Ooo0.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    paramView = paramView.getViewTreeObserver();
    this.o00Ooo00 = paramView;
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    OooO0O0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.OneShotPreDrawListener
 * JD-Core Version:    0.7.0.1
 */