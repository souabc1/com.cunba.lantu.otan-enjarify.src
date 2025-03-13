package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class StandaloneActionMode
  extends ActionMode
  implements MenuBuilder.Callback
{
  public Context o00Ooo0;
  public ActionBarContextView o00Ooo0O;
  public ActionMode.Callback o00Ooo0o;
  public boolean o00OooO;
  public WeakReference o00OooO0;
  public boolean o00OooOO;
  public MenuBuilder o00OooOo;
  
  public StandaloneActionMode(Context paramContext, ActionBarContextView paramActionBarContextView, ActionMode.Callback paramCallback, boolean paramBoolean)
  {
    this.o00Ooo0 = paramContext;
    this.o00Ooo0O = paramActionBarContextView;
    this.o00Ooo0o = paramCallback;
    paramContext = new androidx/appcompat/view/menu/MenuBuilder;
    paramActionBarContextView = paramActionBarContextView.getContext();
    paramContext.<init>(paramActionBarContextView);
    paramContext = paramContext.setDefaultShowAsAction(1);
    this.o00OooOo = paramContext;
    paramContext.setCallback(this);
    this.o00OooOO = paramBoolean;
  }
  
  public void OooO00o()
  {
    boolean bool = this.o00OooO;
    if (bool) {
      return;
    }
    this.o00OooO = true;
    this.o00Ooo0o.OooO00o(this);
  }
  
  public void OooO0O0()
  {
    ActionMode.Callback localCallback = this.o00Ooo0o;
    MenuBuilder localMenuBuilder = this.o00OooOo;
    localCallback.OooO0OO(this, localMenuBuilder);
  }
  
  public View getCustomView()
  {
    Object localObject = this.o00OooO0;
    if (localObject != null) {
      localObject = (View)((Reference)localObject).get();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Menu getMenu()
  {
    return this.o00OooOo;
  }
  
  public MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new androidx/appcompat/view/SupportMenuInflater;
    Context localContext = this.o00Ooo0O.getContext();
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public CharSequence getSubtitle()
  {
    return this.o00Ooo0O.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.o00Ooo0O.getTitle();
  }
  
  public boolean isTitleOptional()
  {
    return this.o00Ooo0O.isTitleOptional();
  }
  
  public boolean isUiFocusable()
  {
    return this.o00OooOO;
  }
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    return this.o00Ooo0o.OooO0Oo(this, paramMenuItem);
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    OooO0O0();
    this.o00Ooo0O.OooO0oO();
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.o00Ooo0O;
    ((ActionBarContextView)localObject).setCustomView(paramView);
    if (paramView != null)
    {
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramView);
    }
    else
    {
      localObject = null;
    }
    this.o00OooO0 = ((WeakReference)localObject);
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.o00Ooo0.getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.o00Ooo0O.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.o00Ooo0.getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.o00Ooo0O.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.o00Ooo0O.setTitleOptional(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.StandaloneActionMode
 * JD-Core Version:    0.7.0.1
 */