package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class AppCompatSpinner$DropdownPopup$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public AppCompatSpinner$DropdownPopup$2(AppCompatSpinner.DropdownPopup paramDropdownPopup) {}
  
  public void onGlobalLayout()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.o00OoOoo;
    AppCompatSpinner localAppCompatSpinner = localDropdownPopup.o00o0o0o;
    boolean bool = localDropdownPopup.OooOO0O(localAppCompatSpinner);
    if (!bool)
    {
      localDropdownPopup = this.o00OoOoo;
      localDropdownPopup.dismiss();
    }
    else
    {
      this.o00OoOoo.OooOO0();
      localDropdownPopup = this.o00OoOoo;
      AppCompatSpinner.DropdownPopup.OooO(localDropdownPopup);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
 * JD-Core Version:    0.7.0.1
 */