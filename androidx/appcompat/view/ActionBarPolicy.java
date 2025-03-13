package androidx.appcompat.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.bool;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.styleable;

public class ActionBarPolicy
{
  public Context OooO00o;
  
  public ActionBarPolicy(Context paramContext)
  {
    this.OooO00o = paramContext;
  }
  
  public static ActionBarPolicy OooO0O0(Context paramContext)
  {
    ActionBarPolicy localActionBarPolicy = new androidx/appcompat/view/ActionBarPolicy;
    localActionBarPolicy.<init>(paramContext);
    return localActionBarPolicy;
  }
  
  public boolean OooO00o()
  {
    ApplicationInfo localApplicationInfo = this.OooO00o.getApplicationInfo();
    int i = localApplicationInfo.targetSdkVersion;
    int j = 14;
    if (i < j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localApplicationInfo = null;
    }
    return i;
  }
  
  public boolean OooO0OO()
  {
    Resources localResources = this.OooO00o.getResources();
    int i = R.bool.abc_action_bar_embed_tabs;
    return localResources.getBoolean(i);
  }
  
  public boolean OooO0Oo()
  {
    return true;
  }
  
  public int getEmbeddedMenuWidthLimit()
  {
    return this.OooO00o.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public int getMaxActionButtons()
  {
    Configuration localConfiguration = this.OooO00o.getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    int k = localConfiguration.smallestScreenWidthDp;
    int m = 600;
    if ((k <= m) && (i <= m))
    {
      k = 720;
      m = 960;
      if (((i <= m) || (j <= k)) && ((i <= k) || (j <= m)))
      {
        k = 500;
        if (i < k)
        {
          k = 480;
          m = 640;
          if (((i <= m) || (j <= k)) && ((i <= k) || (j <= m)))
          {
            k = 360;
            if (i >= k) {
              return 3;
            }
            return 2;
          }
        }
        return 4;
      }
    }
    return 5;
  }
  
  public int getStackedTabMaxWidth()
  {
    Resources localResources = this.OooO00o.getResources();
    int i = R.dimen.abc_action_bar_stacked_tab_max_width;
    return localResources.getDimensionPixelSize(i);
  }
  
  public int getTabContainerHeight()
  {
    Object localObject = this.OooO00o;
    int[] arrayOfInt = R.styleable.ActionBar;
    int i = R.attr.actionBarStyle;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, i, 0);
    int j = R.styleable.ActionBar_height;
    j = ((TypedArray)localObject).getLayoutDimension(j, 0);
    Resources localResources = this.OooO00o.getResources();
    boolean bool = OooO0OO();
    if (!bool)
    {
      int k = R.dimen.abc_action_bar_stacked_max_height;
      i = localResources.getDimensionPixelSize(k);
      j = Math.min(j, i);
    }
    ((TypedArray)localObject).recycle();
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.ActionBarPolicy
 * JD-Core Version:    0.7.0.1
 */