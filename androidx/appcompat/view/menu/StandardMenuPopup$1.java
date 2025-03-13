package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.appcompat.widget.ListPopupWindow;

class StandardMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public StandardMenuPopup$1(StandardMenuPopup paramStandardMenuPopup) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((StandardMenuPopup)localObject).isShowing();
    if (bool)
    {
      localObject = this.o00OoOoo.o00OooOo;
      bool = ((ListPopupWindow)localObject).isModal();
      if (!bool)
      {
        localObject = this.o00OoOoo.o00o000;
        if (localObject != null)
        {
          bool = ((View)localObject).isShown();
          if (bool)
          {
            localObject = this.o00OoOoo.o00OooOo;
            ((ListPopupWindow)localObject).show();
            return;
          }
        }
        localObject = this.o00OoOoo;
        ((StandardMenuPopup)localObject).dismiss();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.StandardMenuPopup.1
 * JD-Core Version:    0.7.0.1
 */