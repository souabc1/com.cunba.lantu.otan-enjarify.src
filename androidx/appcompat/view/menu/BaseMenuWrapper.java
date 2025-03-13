package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

abstract class BaseMenuWrapper
{
  public final Context OooO00o;
  public SimpleArrayMap OooO0O0;
  public SimpleArrayMap OooO0OO;
  
  public BaseMenuWrapper(Context paramContext)
  {
    this.OooO00o = paramContext;
  }
  
  public final MenuItem OooO0O0(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof SupportMenuItem;
    if (bool)
    {
      paramMenuItem = (SupportMenuItem)paramMenuItem;
      Object localObject1 = this.OooO0O0;
      if (localObject1 == null)
      {
        localObject1 = new androidx/collection/SimpleArrayMap;
        ((SimpleArrayMap)localObject1).<init>();
        this.OooO0O0 = ((SimpleArrayMap)localObject1);
      }
      localObject1 = (MenuItem)this.OooO0O0.get(paramMenuItem);
      if (localObject1 == null)
      {
        localObject1 = new androidx/appcompat/view/menu/MenuItemWrapperICS;
        Object localObject2 = this.OooO00o;
        ((MenuItemWrapperICS)localObject1).<init>((Context)localObject2, paramMenuItem);
        localObject2 = this.OooO0O0;
        ((SimpleArrayMap)localObject2).put(paramMenuItem, localObject1);
      }
      return localObject1;
    }
    return paramMenuItem;
  }
  
  public final SubMenu OooO0OO(SubMenu paramSubMenu)
  {
    boolean bool = paramSubMenu instanceof SupportSubMenu;
    if (bool)
    {
      paramSubMenu = (SupportSubMenu)paramSubMenu;
      Object localObject1 = this.OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = new androidx/collection/SimpleArrayMap;
        ((SimpleArrayMap)localObject1).<init>();
        this.OooO0OO = ((SimpleArrayMap)localObject1);
      }
      localObject1 = (SubMenu)this.OooO0OO.get(paramSubMenu);
      if (localObject1 == null)
      {
        localObject1 = new androidx/appcompat/view/menu/SubMenuWrapperICS;
        Object localObject2 = this.OooO00o;
        ((SubMenuWrapperICS)localObject1).<init>((Context)localObject2, paramSubMenu);
        localObject2 = this.OooO0OO;
        ((SimpleArrayMap)localObject2).put(paramSubMenu, localObject1);
      }
      return localObject1;
    }
    return paramSubMenu;
  }
  
  public final void OooO0Oo()
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    if (localSimpleArrayMap != null) {
      localSimpleArrayMap.clear();
    }
    localSimpleArrayMap = this.OooO0OO;
    if (localSimpleArrayMap != null) {
      localSimpleArrayMap.clear();
    }
  }
  
  public final void OooO0o(int paramInt)
  {
    SimpleArrayMap localSimpleArrayMap1 = this.OooO0O0;
    if (localSimpleArrayMap1 == null) {
      return;
    }
    int i = 0;
    localSimpleArrayMap1 = null;
    for (;;)
    {
      Object localObject = this.OooO0O0;
      int j = ((SimpleArrayMap)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (SupportMenuItem)this.OooO0O0.OooO(i);
      j = ((MenuItem)localObject).getItemId();
      if (j == paramInt)
      {
        SimpleArrayMap localSimpleArrayMap2 = this.OooO0O0;
        localSimpleArrayMap2.OooOO0O(i);
        break;
      }
      i += 1;
    }
  }
  
  public final void OooO0o0(int paramInt)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    if (localSimpleArrayMap == null) {
      return;
    }
    int i = 0;
    localSimpleArrayMap = null;
    for (;;)
    {
      Object localObject = this.OooO0O0;
      int j = ((SimpleArrayMap)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (SupportMenuItem)this.OooO0O0.OooO(i);
      j = ((MenuItem)localObject).getGroupId();
      if (j == paramInt)
      {
        localObject = this.OooO0O0;
        ((SimpleArrayMap)localObject).OooOO0O(i);
        i += -1;
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.BaseMenuWrapper
 * JD-Core Version:    0.7.0.1
 */