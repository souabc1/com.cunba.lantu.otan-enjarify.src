package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ShowableListMenu;

class AppCompatSpinner$1
  extends ForwardingListener
{
  public AppCompatSpinner$1(AppCompatSpinner paramAppCompatSpinner, View paramView, AppCompatSpinner.DropdownPopup paramDropdownPopup)
  {
    super(paramView);
  }
  
  public boolean OooO0O0()
  {
    Object localObject = this.o00OoooO.getInternalPopup();
    boolean bool = ((AppCompatSpinner.SpinnerPopup)localObject).isShowing();
    if (!bool)
    {
      localObject = this.o00OoooO;
      ((AppCompatSpinner)localObject).OooO0O0();
    }
    return true;
  }
  
  public ShowableListMenu getPopup()
  {
    return this.o0O00o0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.1
 * JD-Core Version:    0.7.0.1
 */