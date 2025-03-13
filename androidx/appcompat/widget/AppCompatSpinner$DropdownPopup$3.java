package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

class AppCompatSpinner$DropdownPopup$3
  implements PopupWindow.OnDismissListener
{
  public AppCompatSpinner$DropdownPopup$3(AppCompatSpinner.DropdownPopup paramDropdownPopup, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener) {}
  
  public void onDismiss()
  {
    ViewTreeObserver localViewTreeObserver = this.o00Ooo00.o00o0o0o.getViewTreeObserver();
    if (localViewTreeObserver != null)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.o00OoOoo;
      localViewTreeObserver.removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
 * JD-Core Version:    0.7.0.1
 */