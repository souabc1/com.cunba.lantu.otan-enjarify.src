package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.TintTypedArray;

class AppCompatDelegateImpl$ActionBarDrawableToggleImpl
  implements ActionBarDrawerToggle.Delegate
{
  public AppCompatDelegateImpl$ActionBarDrawableToggleImpl(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void OooO00o(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.OooO00o.getSupportActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public Context getActionBarThemedContext()
  {
    return this.OooO00o.getActionBarThemedContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    Object localObject1 = getActionBarThemedContext();
    int i = R.attr.homeAsUpIndicator;
    Object localObject2 = { i };
    localObject1 = TintTypedArray.OooOOO((Context)localObject1, null, (int[])localObject2);
    localObject2 = ((TintTypedArray)localObject1).getDrawable(0);
    ((TintTypedArray)localObject1).OooOOOo();
    return localObject2;
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = this.OooO00o.getSupportActionBar();
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
    ActionBar localActionBar = this.OooO00o.getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionBarDrawableToggleImpl
 * JD-Core Version:    0.7.0.1
 */