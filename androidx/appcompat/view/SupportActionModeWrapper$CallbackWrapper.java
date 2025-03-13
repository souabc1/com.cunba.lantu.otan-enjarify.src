package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

public class SupportActionModeWrapper$CallbackWrapper
  implements ActionMode.Callback
{
  public final android.view.ActionMode.Callback OooO00o;
  public final Context OooO0O0;
  public final ArrayList OooO0OO;
  public final SimpleArrayMap OooO0Oo;
  
  public SupportActionModeWrapper$CallbackWrapper(Context paramContext, android.view.ActionMode.Callback paramCallback)
  {
    this.OooO0O0 = paramContext;
    this.OooO00o = paramCallback;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.OooO0OO = paramContext;
    paramContext = new androidx/collection/SimpleArrayMap;
    paramContext.<init>();
    this.OooO0Oo = paramContext;
  }
  
  public void OooO00o(ActionMode paramActionMode)
  {
    android.view.ActionMode.Callback localCallback = this.OooO00o;
    paramActionMode = OooO0o0(paramActionMode);
    localCallback.onDestroyActionMode(paramActionMode);
  }
  
  public boolean OooO0O0(ActionMode paramActionMode, Menu paramMenu)
  {
    android.view.ActionMode.Callback localCallback = this.OooO00o;
    paramActionMode = OooO0o0(paramActionMode);
    paramMenu = OooO0o(paramMenu);
    return localCallback.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public boolean OooO0OO(ActionMode paramActionMode, Menu paramMenu)
  {
    android.view.ActionMode.Callback localCallback = this.OooO00o;
    paramActionMode = OooO0o0(paramActionMode);
    paramMenu = OooO0o(paramMenu);
    return localCallback.onPrepareActionMode(paramActionMode, paramMenu);
  }
  
  public boolean OooO0Oo(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    android.view.ActionMode.Callback localCallback = this.OooO00o;
    paramActionMode = OooO0o0(paramActionMode);
    MenuItemWrapperICS localMenuItemWrapperICS = new androidx/appcompat/view/menu/MenuItemWrapperICS;
    Context localContext = this.OooO0O0;
    paramMenuItem = (SupportMenuItem)paramMenuItem;
    localMenuItemWrapperICS.<init>(localContext, paramMenuItem);
    return localCallback.onActionItemClicked(paramActionMode, localMenuItemWrapperICS);
  }
  
  public final Menu OooO0o(Menu paramMenu)
  {
    Object localObject1 = (Menu)this.OooO0Oo.get(paramMenu);
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/view/menu/MenuWrapperICS;
      Object localObject2 = this.OooO0O0;
      Object localObject3 = paramMenu;
      localObject3 = (SupportMenu)paramMenu;
      ((MenuWrapperICS)localObject1).<init>((Context)localObject2, (SupportMenu)localObject3);
      localObject2 = this.OooO0Oo;
      ((SimpleArrayMap)localObject2).put(paramMenu, localObject1);
    }
    return localObject1;
  }
  
  public android.view.ActionMode OooO0o0(ActionMode paramActionMode)
  {
    Object localObject = this.OooO0OO;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    Context localContext = null;
    while (j < i)
    {
      SupportActionModeWrapper localSupportActionModeWrapper = (SupportActionModeWrapper)this.OooO0OO.get(j);
      if (localSupportActionModeWrapper != null)
      {
        ActionMode localActionMode = localSupportActionModeWrapper.OooO0O0;
        if (localActionMode == paramActionMode) {
          return localSupportActionModeWrapper;
        }
      }
      j += 1;
    }
    localObject = new androidx/appcompat/view/SupportActionModeWrapper;
    localContext = this.OooO0O0;
    ((SupportActionModeWrapper)localObject).<init>(localContext, paramActionMode);
    this.OooO0OO.add(localObject);
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper
 * JD-Core Version:    0.7.0.1
 */