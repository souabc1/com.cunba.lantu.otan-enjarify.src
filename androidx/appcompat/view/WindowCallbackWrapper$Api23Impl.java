package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.SearchEvent;
import android.view.Window.Callback;

class WindowCallbackWrapper$Api23Impl
{
  public static boolean OooO00o(Window.Callback paramCallback, SearchEvent paramSearchEvent)
  {
    return paramCallback.onSearchRequested(paramSearchEvent);
  }
  
  public static ActionMode OooO0O0(Window.Callback paramCallback, ActionMode.Callback paramCallback1, int paramInt)
  {
    return paramCallback.onWindowStartingActionMode(paramCallback1, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.WindowCallbackWrapper.Api23Impl
 * JD-Core Version:    0.7.0.1
 */