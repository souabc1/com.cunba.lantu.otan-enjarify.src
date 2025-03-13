package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.core.view.ActionProvider;

class ActivityChooserView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public ActivityChooserView$2(ActivityChooserView paramActivityChooserView) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.o00OoOoo;
    boolean bool1 = ((ActivityChooserView)localObject).isShowingPopup();
    if (bool1)
    {
      localObject = this.o00OoOoo;
      bool1 = ((View)localObject).isShown();
      if (!bool1)
      {
        localObject = this.o00OoOoo.getListPopupWindow();
        ((ListPopupWindow)localObject).dismiss();
      }
      else
      {
        this.o00OoOoo.getListPopupWindow().show();
        localObject = this.o00OoOoo.o0O00o0;
        if (localObject != null)
        {
          boolean bool2 = true;
          ((ActionProvider)localObject).OooO0oo(bool2);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.2
 * JD-Core Version:    0.7.0.1
 */