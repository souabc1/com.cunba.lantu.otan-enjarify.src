package androidx.appcompat.widget;

import android.widget.PopupWindow.OnDismissListener;

class PopupMenu$2
  implements PopupWindow.OnDismissListener
{
  public PopupMenu$2(PopupMenu paramPopupMenu) {}
  
  public void onDismiss()
  {
    PopupMenu localPopupMenu = this.o00OoOoo;
    PopupMenu.OnDismissListener localOnDismissListener = localPopupMenu.OooO0o;
    if (localOnDismissListener != null) {
      localOnDismissListener.OooO00o(localPopupMenu);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.PopupMenu.2
 * JD-Core Version:    0.7.0.1
 */