package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

class ActionBarDrawerToggle$ToolbarCompatDelegate
  implements ActionBarDrawerToggle.Delegate
{
  public final Toolbar OooO00o;
  public final Drawable OooO0O0;
  public final CharSequence OooO0OO;
  
  public void OooO00o(Drawable paramDrawable, int paramInt)
  {
    this.OooO00o.setNavigationIcon(paramDrawable);
    setActionBarDescription(paramInt);
  }
  
  public Context getActionBarThemedContext()
  {
    return this.OooO00o.getContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    return this.OooO0O0;
  }
  
  public boolean isNavigationVisible()
  {
    return true;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      Toolbar localToolbar = this.OooO00o;
      localObject = this.OooO0OO;
      localToolbar.setNavigationContentDescription((CharSequence)localObject);
    }
    else
    {
      localObject = this.OooO00o;
      ((Toolbar)localObject).setNavigationContentDescription(paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.ToolbarCompatDelegate
 * JD-Core Version:    0.7.0.1
 */