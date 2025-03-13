package androidx.appcompat.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.List;

class AppCompatDelegateImpl$AppCompatWindowCallback
  extends WindowCallbackWrapper
{
  public boolean o00Ooo0;
  public AppCompatDelegateImpl.ActionBarMenuCallback o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  
  public AppCompatDelegateImpl$AppCompatWindowCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public boolean OooO00o(Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    try
    {
      this.o00Ooo0O = bool1;
      boolean bool2 = paramCallback.dispatchKeyEvent(paramKeyEvent);
      return bool2;
    }
    finally
    {
      this.o00Ooo0O = false;
    }
  }
  
  public void OooO0O0(Window.Callback paramCallback)
  {
    boolean bool = true;
    try
    {
      this.o00Ooo0 = bool;
      paramCallback.onContentChanged();
      return;
    }
    finally
    {
      this.o00Ooo0 = false;
    }
  }
  
  public void OooO0OO(Window.Callback paramCallback, int paramInt, Menu paramMenu)
  {
    boolean bool = true;
    try
    {
      this.o00Ooo0o = bool;
      paramCallback.onPanelClosed(paramInt, paramMenu);
      return;
    }
    finally
    {
      this.o00Ooo0o = false;
    }
  }
  
  public final ActionMode OooO0Oo(ActionMode.Callback paramCallback)
  {
    SupportActionModeWrapper.CallbackWrapper localCallbackWrapper = new androidx/appcompat/view/SupportActionModeWrapper$CallbackWrapper;
    Context localContext = this.o00OooO0.o00OoooO;
    localCallbackWrapper.<init>(localContext, paramCallback);
    paramCallback = this.o00OooO0.o00000(localCallbackWrapper);
    if (paramCallback != null) {
      return localCallbackWrapper.OooO0o0(paramCallback);
    }
    return null;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = this.o00Ooo0O;
    if (bool1) {
      return getWrapped().dispatchKeyEvent(paramKeyEvent);
    }
    AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OooO0;
    bool1 = localAppCompatDelegateImpl.o000oOoO(paramKeyEvent);
    if (!bool1)
    {
      bool2 = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool2)
      {
        bool2 = false;
        paramKeyEvent = null;
        break label61;
      }
    }
    boolean bool2 = true;
    label61:
    return bool2;
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = super.dispatchKeyShortcutEvent(paramKeyEvent);
    if (!bool1)
    {
      AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OooO0;
      int i = paramKeyEvent.getKeyCode();
      bool2 = localAppCompatDelegateImpl.o00ooo(i, paramKeyEvent);
      if (!bool2)
      {
        bool2 = false;
        paramKeyEvent = null;
        break label49;
      }
    }
    boolean bool2 = true;
    label49:
    return bool2;
  }
  
  public void onContentChanged()
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      Window.Callback localCallback = getWrapped();
      localCallback.onContentChanged();
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = paramMenu instanceof MenuBuilder;
      if (!bool) {
        return false;
      }
    }
    return super.onCreatePanelMenu(paramInt, (Menu)paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null)
    {
      localObject = ((AppCompatDelegateImpl.ActionBarMenuCallback)localObject).onCreatePanelView(paramInt);
      if (localObject != null) {
        return localObject;
      }
    }
    return super.onCreatePanelView(paramInt);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    super.onMenuOpened(paramInt, paramMenu);
    this.o00OooO0.o00oO0O(paramInt);
    return true;
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    boolean bool = this.o00Ooo0o;
    if (bool)
    {
      getWrapped().onPanelClosed(paramInt, paramMenu);
      return;
    }
    super.onPanelClosed(paramInt, paramMenu);
    this.o00OooO0.o0ooOO0(paramInt);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool1 = paramMenu instanceof MenuBuilder;
    Object localObject;
    if (bool1)
    {
      localObject = paramMenu;
      localObject = (MenuBuilder)paramMenu;
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    if ((paramInt == 0) && (localObject == null)) {
      return false;
    }
    boolean bool2 = true;
    if (localObject != null) {
      ((MenuBuilder)localObject).setOverrideVisibleItems(bool2);
    }
    AppCompatDelegateImpl.ActionBarMenuCallback localActionBarMenuCallback = this.o00Ooo00;
    if (localActionBarMenuCallback != null)
    {
      boolean bool3 = localActionBarMenuCallback.OooO00o(paramInt);
      if (bool3) {}
    }
    else
    {
      bool2 = false;
    }
    if (!bool2) {
      bool2 = super.onPreparePanel(paramInt, paramView, (Menu)paramMenu);
    }
    if (localObject != null) {
      ((MenuBuilder)localObject).setOverrideVisibleItems(false);
    }
    return bool2;
  }
  
  public void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt)
  {
    Object localObject = this.o00OooO0;
    boolean bool = true;
    localObject = ((AppCompatDelegateImpl)localObject).Oooooo0(0, bool);
    if (localObject != null)
    {
      localObject = ((AppCompatDelegateImpl.PanelFeatureState)localObject).OooOO0;
      if (localObject != null)
      {
        super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
        return;
      }
    }
    super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OooO0;
    boolean bool = localAppCompatDelegateImpl.isHandleNativeActionModesEnabled();
    if ((bool) && (paramInt == 0)) {
      return OooO0Oo(paramCallback);
    }
    return super.onWindowStartingActionMode(paramCallback, paramInt);
  }
  
  public void setActionBarCallback(AppCompatDelegateImpl.ActionBarMenuCallback paramActionBarMenuCallback)
  {
    this.o00Ooo00 = paramActionBarMenuCallback;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback
 * JD-Core Version:    0.7.0.1
 */