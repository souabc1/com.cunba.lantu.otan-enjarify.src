package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class AppCompatSpinner$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public AppCompatSpinner$2(AppCompatSpinner paramAppCompatSpinner) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.o00OoOoo.getInternalPopup();
    boolean bool = ((AppCompatSpinner.SpinnerPopup)localObject).isShowing();
    if (!bool)
    {
      localObject = this.o00OoOoo;
      ((AppCompatSpinner)localObject).OooO0O0();
    }
    localObject = this.o00OoOoo.getViewTreeObserver();
    if (localObject != null) {
      AppCompatSpinner.Api16Impl.OooO00o((ViewTreeObserver)localObject, this);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.2
 * JD-Core Version:    0.7.0.1
 */