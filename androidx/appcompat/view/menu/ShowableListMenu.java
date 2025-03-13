package androidx.appcompat.view.menu;

import android.widget.ListView;

public abstract interface ShowableListMenu
{
  public abstract void dismiss();
  
  public abstract ListView getListView();
  
  public abstract boolean isShowing();
  
  public abstract void show();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ShowableListMenu
 * JD-Core Version:    0.7.0.1
 */