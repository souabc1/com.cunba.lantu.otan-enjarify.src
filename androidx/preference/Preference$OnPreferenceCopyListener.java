package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Toast;

class Preference$OnPreferenceCopyListener
  implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener
{
  public final Preference o00OoOoo;
  
  public Preference$OnPreferenceCopyListener(Preference paramPreference)
  {
    this.o00OoOoo = paramPreference;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = this.o00OoOoo.getSummary();
    paramContextMenuInfo = this.o00OoOoo;
    boolean bool = paramContextMenuInfo.isCopyingEnabled();
    if (bool)
    {
      bool = TextUtils.isEmpty(paramView);
      if (!bool)
      {
        paramContextMenu.setHeaderTitle(paramView);
        int i = R.string.copy;
        bool = false;
        paramContextMenuInfo = null;
        paramContextMenu = paramContextMenu.add(0, 0, 0, i);
        paramContextMenu.setOnMenuItemClickListener(this);
      }
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    paramMenuItem = (ClipboardManager)this.o00OoOoo.getContext().getSystemService("clipboard");
    Object localObject1 = this.o00OoOoo.getSummary();
    Object localObject2 = ClipData.newPlainText("Preference", (CharSequence)localObject1);
    paramMenuItem.setPrimaryClip((ClipData)localObject2);
    paramMenuItem = this.o00OoOoo.getContext();
    localObject2 = this.o00OoOoo.getContext();
    int i = R.string.preference_copied;
    localObject1 = new Object[] { localObject1 };
    localObject1 = ((Context)localObject2).getString(i, (Object[])localObject1);
    Toast.makeText(paramMenuItem, (CharSequence)localObject1, 0).show();
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.Preference.OnPreferenceCopyListener
 * JD-Core Version:    0.7.0.1
 */