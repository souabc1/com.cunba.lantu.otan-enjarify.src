package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.Iterator;
import java.util.List;

class CascadingMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public CascadingMenuPopup$1(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.o00OoOoo;
    boolean bool1 = ((CascadingMenuPopup)localObject).isShowing();
    if (bool1)
    {
      localObject = this.o00OoOoo.o00OooOo;
      int i = ((List)localObject).size();
      if (i > 0)
      {
        localObject = this.o00OoOoo.o00OooOo;
        boolean bool3 = false;
        MenuPopupWindow localMenuPopupWindow = null;
        localObject = ((CascadingMenuPopup.CascadingMenuInfo)((List)localObject).get(0)).OooO00o;
        boolean bool2 = ((ListPopupWindow)localObject).isModal();
        if (!bool2)
        {
          localObject = this.o00OoOoo.o00o000o;
          if (localObject != null)
          {
            bool2 = ((View)localObject).isShown();
            if (bool2)
            {
              localObject = this.o00OoOoo.o00OooOo.iterator();
              for (;;)
              {
                bool3 = ((Iterator)localObject).hasNext();
                if (!bool3) {
                  break;
                }
                localMenuPopupWindow = ((CascadingMenuPopup.CascadingMenuInfo)((Iterator)localObject).next()).OooO00o;
                localMenuPopupWindow.show();
              }
            }
          }
          localObject = this.o00OoOoo;
          ((CascadingMenuPopup)localObject).dismiss();
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.1
 * JD-Core Version:    0.7.0.1
 */