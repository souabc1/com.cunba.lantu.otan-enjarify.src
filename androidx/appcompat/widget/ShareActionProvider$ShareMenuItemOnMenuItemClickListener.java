package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class ShareActionProvider$ShareMenuItemOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = ((ShareActionProvider)localObject1).OooO0o;
    localObject1 = ((ShareActionProvider)localObject1).OooO0oO;
    localObject1 = ActivityChooserModel.OooO0Oo((Context)localObject2, (String)localObject1);
    int i = paramMenuItem.getItemId();
    paramMenuItem = ((ActivityChooserModel)localObject1).OooO0O0(i);
    if (paramMenuItem != null)
    {
      localObject1 = paramMenuItem.getAction();
      localObject2 = "android.intent.action.SEND";
      boolean bool1 = ((String)localObject2).equals(localObject1);
      if (!bool1)
      {
        localObject2 = "android.intent.action.SEND_MULTIPLE";
        boolean bool2 = ((String)localObject2).equals(localObject1);
        if (!bool2) {}
      }
      else
      {
        localObject1 = this.o00OoOoo;
        ((ShareActionProvider)localObject1).OooOO0(paramMenuItem);
      }
      localObject1 = this.o00OoOoo.OooO0o;
      ((Context)localObject1).startActivity(paramMenuItem);
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener
 * JD-Core Version:    0.7.0.1
 */