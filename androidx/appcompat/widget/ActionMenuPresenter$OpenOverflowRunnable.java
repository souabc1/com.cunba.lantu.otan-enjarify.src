package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

class ActionMenuPresenter$OpenOverflowRunnable
  implements Runnable
{
  public ActionMenuPresenter.OverflowPopup o00OoOoo;
  
  public ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter paramActionMenuPresenter, ActionMenuPresenter.OverflowPopup paramOverflowPopup)
  {
    this.o00OoOoo = paramOverflowPopup;
  }
  
  public void run()
  {
    Object localObject = ActionMenuPresenter.OooOOO0(this.o00Ooo00);
    if (localObject != null)
    {
      localObject = ActionMenuPresenter.OooOOO(this.o00Ooo00);
      ((MenuBuilder)localObject).changeMenuMode();
    }
    localObject = (View)ActionMenuPresenter.OooOOOO(this.o00Ooo00);
    if (localObject != null)
    {
      localObject = ((View)localObject).getWindowToken();
      if (localObject != null)
      {
        localObject = this.o00OoOoo;
        boolean bool = ((MenuPopupHelper)localObject).OooO0o();
        if (bool)
        {
          localObject = this.o00Ooo00;
          ActionMenuPresenter.OverflowPopup localOverflowPopup = this.o00OoOoo;
          ((ActionMenuPresenter)localObject).o00o0 = localOverflowPopup;
        }
      }
    }
    this.o00Ooo00.o00o0O0 = null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable
 * JD-Core Version:    0.7.0.1
 */