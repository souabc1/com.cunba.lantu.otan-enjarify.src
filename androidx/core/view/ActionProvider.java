package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class ActionProvider
{
  public final Context OooO00o;
  public ActionProvider.SubUiVisibilityListener OooO0O0;
  public ActionProvider.VisibilityListener OooO0OO;
  
  public ActionProvider(Context paramContext)
  {
    this.OooO00o = paramContext;
  }
  
  public boolean OooO00o()
  {
    return false;
  }
  
  public abstract View OooO0O0();
  
  public View OooO0OO(MenuItem paramMenuItem)
  {
    return OooO0O0();
  }
  
  public boolean OooO0Oo()
  {
    return false;
  }
  
  public boolean OooO0o()
  {
    return false;
  }
  
  public void OooO0o0(SubMenu paramSubMenu) {}
  
  public void OooO0oO()
  {
    this.OooO0OO = null;
    this.OooO0O0 = null;
  }
  
  public void OooO0oo(boolean paramBoolean)
  {
    ActionProvider.SubUiVisibilityListener localSubUiVisibilityListener = this.OooO0O0;
    if (localSubUiVisibilityListener != null) {
      localSubUiVisibilityListener.OooO00o(paramBoolean);
    }
  }
  
  public Context getContext()
  {
    return this.OooO00o;
  }
  
  public boolean isVisible()
  {
    return true;
  }
  
  public void setSubUiVisibilityListener(ActionProvider.SubUiVisibilityListener paramSubUiVisibilityListener)
  {
    this.OooO0O0 = paramSubUiVisibilityListener;
  }
  
  public void setVisibilityListener(ActionProvider.VisibilityListener paramVisibilityListener)
  {
    Object localObject = this.OooO0OO;
    if ((localObject != null) && (paramVisibilityListener != null))
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      String str = getClass().getSimpleName();
      ((StringBuilder)localObject).append(str);
      str = " instance while it is still in use somewhere else?";
      ((StringBuilder)localObject).append(str);
    }
    this.OooO0OO = paramVisibilityListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ActionProvider
 * JD-Core Version:    0.7.0.1
 */