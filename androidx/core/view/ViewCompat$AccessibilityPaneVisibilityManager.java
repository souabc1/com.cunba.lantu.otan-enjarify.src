package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.WeakHashMap;

class ViewCompat$AccessibilityPaneVisibilityManager
  implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
{
  public final WeakHashMap o00OoOoo;
  
  public ViewCompat$AccessibilityPaneVisibilityManager()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.o00OoOoo = localWeakHashMap;
  }
  
  public void OooO00o(View paramView)
  {
    WeakHashMap localWeakHashMap = this.o00OoOoo;
    boolean bool1 = paramView.isShown();
    if (bool1)
    {
      i = paramView.getWindowVisibility();
      if (i == 0)
      {
        i = 1;
        break label33;
      }
    }
    int i = 0;
    Boolean localBoolean = null;
    label33:
    localBoolean = Boolean.valueOf(i);
    localWeakHashMap.put(paramView, localBoolean);
    paramView.addOnAttachStateChangeListener(this);
    boolean bool2 = ViewCompat.Api19Impl.OooO0O0(paramView);
    if (bool2) {
      OooO0O0(paramView);
    }
  }
  
  public final void OooO0O0(View paramView)
  {
    paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
  }
  
  public void OooO0OO(View paramView)
  {
    this.o00OoOoo.remove(paramView);
    paramView.removeOnAttachStateChangeListener(this);
    OooO0Oo(paramView);
  }
  
  public final void OooO0Oo(View paramView)
  {
    ViewCompat.Api16Impl.OooOOOO(paramView.getViewTreeObserver(), this);
  }
  
  public void onGlobalLayout() {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    OooO0O0(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager
 * JD-Core Version:    0.7.0.1
 */