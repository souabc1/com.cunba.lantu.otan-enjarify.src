package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class CascadingMenuPopup$2
  implements View.OnAttachStateChangeListener
{
  public CascadingMenuPopup$2(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = this.o00OoOoo.o00o0;
    if (localObject != null)
    {
      boolean bool = ((ViewTreeObserver)localObject).isAlive();
      if (!bool)
      {
        localObject = this.o00OoOoo;
        localViewTreeObserver = paramView.getViewTreeObserver();
        ((CascadingMenuPopup)localObject).o00o0 = localViewTreeObserver;
      }
      localObject = this.o00OoOoo;
      ViewTreeObserver localViewTreeObserver = ((CascadingMenuPopup)localObject).o00o0;
      localObject = ((CascadingMenuPopup)localObject).o0O00o0;
      localViewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.2
 * JD-Core Version:    0.7.0.1
 */