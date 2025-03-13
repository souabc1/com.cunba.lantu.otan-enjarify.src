package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.ActionMenuItem;

class ToolbarWidgetWrapper$1
  implements View.OnClickListener
{
  public final ActionMenuItem o00OoOoo;
  
  public ToolbarWidgetWrapper$1(ToolbarWidgetWrapper paramToolbarWidgetWrapper)
  {
    ActionMenuItem localActionMenuItem = new androidx/appcompat/view/menu/ActionMenuItem;
    Context localContext = paramToolbarWidgetWrapper.OooO00o.getContext();
    CharSequence localCharSequence = paramToolbarWidgetWrapper.OooOO0;
    localActionMenuItem.<init>(localContext, 0, 16908332, 0, 0, localCharSequence);
    this.o00OoOoo = localActionMenuItem;
  }
  
  public void onClick(View paramView)
  {
    paramView = this.o00Ooo00;
    Window.Callback localCallback = paramView.OooOOO0;
    if (localCallback != null)
    {
      boolean bool = paramView.OooOOO;
      if (bool)
      {
        bool = false;
        paramView = null;
        ActionMenuItem localActionMenuItem = this.o00OoOoo;
        localCallback.onMenuItemSelected(0, localActionMenuItem);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ToolbarWidgetWrapper.1
 * JD-Core Version:    0.7.0.1
 */