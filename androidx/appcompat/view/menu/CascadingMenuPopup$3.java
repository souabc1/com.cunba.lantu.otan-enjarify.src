package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.widget.MenuItemHoverListener;
import java.util.List;

class CascadingMenuPopup$3
  implements MenuItemHoverListener
{
  public CascadingMenuPopup$3(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void OooO00o(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    Object localObject1 = this.o00OoOoo.o00OooO;
    Object localObject2 = null;
    ((Handler)localObject1).removeCallbacksAndMessages(null);
    localObject1 = this.o00OoOoo.o00OooOo;
    int i = ((List)localObject1).size();
    int j = 0;
    int k;
    for (;;)
    {
      k = -1;
      if (j >= i) {
        break;
      }
      MenuBuilder localMenuBuilder = ((CascadingMenuPopup.CascadingMenuInfo)this.o00OoOoo.o00OooOo.get(j)).OooO0O0;
      if (paramMenuBuilder == localMenuBuilder) {
        break label89;
      }
      j += 1;
    }
    j = k;
    label89:
    if (j == k) {
      return;
    }
    j += 1;
    localObject1 = this.o00OoOoo.o00OooOo;
    i = ((List)localObject1).size();
    if (j < i)
    {
      localObject1 = this.o00OoOoo.o00OooOo.get(j);
      localObject2 = localObject1;
      localObject2 = (CascadingMenuPopup.CascadingMenuInfo)localObject1;
    }
    localObject1 = new androidx/appcompat/view/menu/CascadingMenuPopup$3$1;
    ((CascadingMenuPopup.3.1)localObject1).<init>(this, (CascadingMenuPopup.CascadingMenuInfo)localObject2, paramMenuItem, paramMenuBuilder);
    long l = SystemClock.uptimeMillis() + 200L;
    this.o00OoOoo.o00OooO.postAtTime((Runnable)localObject1, paramMenuBuilder, l);
  }
  
  public void OooO0O0(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    this.o00OoOoo.o00OooO.removeCallbacksAndMessages(paramMenuBuilder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.3
 * JD-Core Version:    0.7.0.1
 */