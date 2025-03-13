package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.core.view.MenuHostHelper;

class Toolbar$1
  implements ActionMenuView.OnMenuItemClickListener
{
  public Toolbar$1(Toolbar paramToolbar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Object localObject = this.OooO00o.mMenuHostHelper;
    boolean bool = ((MenuHostHelper)localObject).OooOO0(paramMenuItem);
    if (bool) {
      return true;
    }
    localObject = this.OooO00o.mOnMenuItemClickListener;
    if (localObject != null) {
      return ((Toolbar.OnMenuItemClickListener)localObject).onMenuItemClick(paramMenuItem);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.1
 * JD-Core Version:    0.7.0.1
 */