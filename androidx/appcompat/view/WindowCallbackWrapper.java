package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class WindowCallbackWrapper
  implements Window.Callback
{
  public final Window.Callback o00OoOoo;
  
  public WindowCallbackWrapper(Window.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      this.o00OoOoo = paramCallback;
      return;
    }
    paramCallback = new java/lang/IllegalArgumentException;
    paramCallback.<init>("Window callback may not be null");
    throw paramCallback;
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return this.o00OoOoo.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.o00OoOoo.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return this.o00OoOoo.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return this.o00OoOoo.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.o00OoOoo.dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return this.o00OoOoo.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public final Window.Callback getWrapped()
  {
    return this.o00OoOoo;
  }
  
  public void onActionModeFinished(ActionMode paramActionMode)
  {
    this.o00OoOoo.onActionModeFinished(paramActionMode);
  }
  
  public void onActionModeStarted(ActionMode paramActionMode)
  {
    this.o00OoOoo.onActionModeStarted(paramActionMode);
  }
  
  public void onAttachedToWindow()
  {
    this.o00OoOoo.onAttachedToWindow();
  }
  
  public void onContentChanged()
  {
    this.o00OoOoo.onContentChanged();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.o00OoOoo.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return this.o00OoOoo.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow()
  {
    this.o00OoOoo.onDetachedFromWindow();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return this.o00OoOoo.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return this.o00OoOoo.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    this.o00OoOoo.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPointerCaptureChanged(boolean paramBoolean)
  {
    WindowCallbackWrapper.Api26Impl.OooO00o(this.o00OoOoo, paramBoolean);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.o00OoOoo.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt)
  {
    WindowCallbackWrapper.Api24Impl.OooO00o(this.o00OoOoo, paramList, paramMenu, paramInt);
  }
  
  public boolean onSearchRequested()
  {
    return this.o00OoOoo.onSearchRequested();
  }
  
  public boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return WindowCallbackWrapper.Api23Impl.OooO00o(this.o00OoOoo, paramSearchEvent);
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    this.o00OoOoo.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    this.o00OoOoo.onWindowFocusChanged(paramBoolean);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return this.o00OoOoo.onWindowStartingActionMode(paramCallback);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    return WindowCallbackWrapper.Api23Impl.OooO0O0(this.o00OoOoo, paramCallback, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.WindowCallbackWrapper
 * JD-Core Version:    0.7.0.1
 */