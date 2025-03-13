package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

class ActionBarDrawerToggle$FrameworkActionBarDelegate
  implements ActionBarDrawerToggle.Delegate
{
  public final Activity OooO00o;
  
  public void OooO00o(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.OooO00o.getActionBar();
    if (localActionBar != null)
    {
      ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.OooO0O0(localActionBar, paramDrawable);
      ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.OooO00o(localActionBar, paramInt);
    }
  }
  
  public Context getActionBarThemedContext()
  {
    ActionBar localActionBar = this.OooO00o.getActionBar();
    if (localActionBar != null) {
      return localActionBar.getThemedContext();
    }
    return this.OooO00o;
  }
  
  public Drawable getThemeUpIndicator()
  {
    Object localObject1 = getActionBarThemedContext();
    Object localObject2 = { 16843531 };
    localObject1 = ((Context)localObject1).obtainStyledAttributes(null, (int[])localObject2, 16843470, 0);
    localObject2 = ((TypedArray)localObject1).getDrawable(0);
    ((TypedArray)localObject1).recycle();
    return localObject2;
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = this.OooO00o.getActionBar();
    if (localActionBar != null)
    {
      i = localActionBar.getDisplayOptions() & 0x4;
      if (i != 0) {
        return 1;
      }
    }
    int i = 0;
    localActionBar = null;
    return i;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    ActionBar localActionBar = this.OooO00o.getActionBar();
    if (localActionBar != null) {
      ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.OooO00o(localActionBar, paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate
 * JD-Core Version:    0.7.0.1
 */