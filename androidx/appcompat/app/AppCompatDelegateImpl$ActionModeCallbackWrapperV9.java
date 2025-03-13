package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

class AppCompatDelegateImpl$ActionModeCallbackWrapperV9
  implements ActionMode.Callback
{
  public ActionMode.Callback OooO00o;
  
  public AppCompatDelegateImpl$ActionModeCallbackWrapperV9(AppCompatDelegateImpl paramAppCompatDelegateImpl, ActionMode.Callback paramCallback)
  {
    this.OooO00o = paramCallback;
  }
  
  public void OooO00o(ActionMode paramActionMode)
  {
    this.OooO00o.OooO00o(paramActionMode);
    paramActionMode = this.OooO0O0;
    Object localObject = paramActionMode.o00o00oO;
    if (localObject != null)
    {
      paramActionMode = paramActionMode.o00Ooooo.getDecorView();
      localObject = this.OooO0O0.o00o00oo;
      paramActionMode.removeCallbacks((Runnable)localObject);
    }
    paramActionMode = this.OooO0O0;
    localObject = paramActionMode.o00o00o;
    if (localObject != null)
    {
      paramActionMode.OoooOOo();
      paramActionMode = this.OooO0O0;
      localObject = ViewCompat.OooO0o0(paramActionMode.o00o00o).OooO0O0(0.0F);
      paramActionMode.o00o0 = ((ViewPropertyAnimatorCompat)localObject);
      paramActionMode = this.OooO0O0.o00o0;
      localObject = new androidx/appcompat/app/AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1;
      ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1)localObject).<init>(this);
      paramActionMode.OooO0oO((ViewPropertyAnimatorListener)localObject);
    }
    paramActionMode = this.OooO0O0;
    localObject = paramActionMode.o00o000;
    if (localObject != null)
    {
      paramActionMode = paramActionMode.o00o00o0;
      ((AppCompatCallback)localObject).onSupportActionModeFinished(paramActionMode);
    }
    paramActionMode = this.OooO0O0;
    paramActionMode.o00o00o0 = null;
    ViewCompat.o00o0O(paramActionMode.o00o0O0O);
    this.OooO0O0.o0000Ooo();
  }
  
  public boolean OooO0O0(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.OooO00o.OooO0O0(paramActionMode, paramMenu);
  }
  
  public boolean OooO0OO(ActionMode paramActionMode, Menu paramMenu)
  {
    ViewCompat.o00o0O(this.OooO0O0.o00o0O0O);
    return this.OooO00o.OooO0OO(paramActionMode, paramMenu);
  }
  
  public boolean OooO0Oo(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.OooO00o.OooO0Oo(paramActionMode, paramMenuItem);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9
 * JD-Core Version:    0.7.0.1
 */