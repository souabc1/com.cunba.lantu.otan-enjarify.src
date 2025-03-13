package androidx.appcompat.view.menu;

import android.view.MenuItem;

class CascadingMenuPopup$3$1
  implements Runnable
{
  public CascadingMenuPopup$3$1(CascadingMenuPopup.3 param3, CascadingMenuPopup.CascadingMenuInfo paramCascadingMenuInfo, MenuItem paramMenuItem, MenuBuilder paramMenuBuilder) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo;
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      localObject2 = this.o00Ooo0O.o00OoOoo;
      i = 1;
      ((CascadingMenuPopup)localObject2).o00o0O0 = i;
      localObject1 = ((CascadingMenuPopup.CascadingMenuInfo)localObject1).OooO0O0;
      localObject2 = null;
      ((MenuBuilder)localObject1).close(false);
      localObject1 = this.o00Ooo0O.o00OoOoo;
      ((CascadingMenuPopup)localObject1).o00o0O0 = false;
    }
    localObject1 = this.o00Ooo00;
    boolean bool = ((MenuItem)localObject1).isEnabled();
    if (bool)
    {
      localObject1 = this.o00Ooo00;
      bool = ((MenuItem)localObject1).hasSubMenu();
      if (bool)
      {
        localObject1 = this.o00Ooo0;
        localObject2 = this.o00Ooo00;
        i = 4;
        ((MenuBuilder)localObject1).performItemAction((MenuItem)localObject2, i);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.3.1
 * JD-Core Version:    0.7.0.1
 */