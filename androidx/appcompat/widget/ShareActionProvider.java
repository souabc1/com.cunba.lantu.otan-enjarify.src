package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ActionProvider;

public class ShareActionProvider
  extends ActionProvider
{
  public ActivityChooserModel.OnChooseActivityListener OooO;
  public int OooO0Oo;
  public final Context OooO0o;
  public final ShareActionProvider.ShareMenuItemOnMenuItemClickListener OooO0o0;
  public String OooO0oO;
  public ShareActionProvider.OnShareTargetSelectedListener OooO0oo;
  
  public final void OooO()
  {
    Object localObject1 = this.OooO0oo;
    if (localObject1 == null) {
      return;
    }
    localObject1 = this.OooO;
    if (localObject1 == null)
    {
      localObject1 = new androidx/appcompat/widget/ShareActionProvider$ShareActivityChooserModelPolicy;
      ((ShareActionProvider.ShareActivityChooserModelPolicy)localObject1).<init>(this);
      this.OooO = ((ActivityChooserModel.OnChooseActivityListener)localObject1);
    }
    localObject1 = this.OooO0o;
    Object localObject2 = this.OooO0oO;
    localObject1 = ActivityChooserModel.OooO0Oo((Context)localObject1, (String)localObject2);
    localObject2 = this.OooO;
    ((ActivityChooserModel)localObject1).setOnChooseActivityListener((ActivityChooserModel.OnChooseActivityListener)localObject2);
  }
  
  public boolean OooO00o()
  {
    return true;
  }
  
  public View OooO0O0()
  {
    ActivityChooserView localActivityChooserView = new androidx/appcompat/widget/ActivityChooserView;
    Object localObject1 = this.OooO0o;
    localActivityChooserView.<init>((Context)localObject1);
    boolean bool = localActivityChooserView.isInEditMode();
    if (!bool)
    {
      localObject1 = this.OooO0o;
      localObject2 = this.OooO0oO;
      localObject1 = ActivityChooserModel.OooO0Oo((Context)localObject1, (String)localObject2);
      localActivityChooserView.setActivityChooserModel((ActivityChooserModel)localObject1);
    }
    localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = this.OooO0o.getTheme();
    int j = R.attr.actionModeShareDrawable;
    ((Resources.Theme)localObject2).resolveAttribute(j, (TypedValue)localObject1, true);
    localObject2 = this.OooO0o;
    int i = ((TypedValue)localObject1).resourceId;
    localObject1 = AppCompatResources.OooO0O0((Context)localObject2, i);
    localActivityChooserView.setExpandActivityOverflowButtonDrawable((Drawable)localObject1);
    localActivityChooserView.setProvider(this);
    i = R.string.abc_shareactionprovider_share_with_application;
    localActivityChooserView.setDefaultActionButtonContentDescription(i);
    i = R.string.abc_shareactionprovider_share_with;
    localActivityChooserView.setExpandActivityOverflowButtonContentDescription(i);
    return localActivityChooserView;
  }
  
  public void OooO0o0(SubMenu paramSubMenu)
  {
    paramSubMenu.clear();
    Object localObject1 = this.OooO0o;
    Object localObject2 = this.OooO0oO;
    localObject1 = ActivityChooserModel.OooO0Oo((Context)localObject1, (String)localObject2);
    localObject2 = this.OooO0o.getPackageManager();
    int i = ((ActivityChooserModel)localObject1).getActivityCount();
    int j = this.OooO0Oo;
    j = Math.min(i, j);
    int k = 0;
    Object localObject3 = null;
    Object localObject4;
    while (k < j)
    {
      localObject4 = ((ActivityChooserModel)localObject1).getActivity(k);
      Object localObject5 = ((ResolveInfo)localObject4).loadLabel((PackageManager)localObject2);
      localObject5 = paramSubMenu.add(0, k, k, (CharSequence)localObject5);
      localObject4 = ((ResolveInfo)localObject4).loadIcon((PackageManager)localObject2);
      localObject4 = ((MenuItem)localObject5).setIcon((Drawable)localObject4);
      localObject5 = this.OooO0o0;
      ((MenuItem)localObject4).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject5);
      k += 1;
    }
    if (j < i)
    {
      localObject3 = this.OooO0o;
      int m = R.string.abc_activity_chooser_view_see_all;
      localObject3 = ((Context)localObject3).getString(m);
      paramSubMenu = paramSubMenu.addSubMenu(0, j, j, (CharSequence)localObject3);
      j = 0;
      while (j < i)
      {
        localObject3 = ((ActivityChooserModel)localObject1).getActivity(j);
        localObject4 = ((ResolveInfo)localObject3).loadLabel((PackageManager)localObject2);
        localObject4 = paramSubMenu.add(0, j, j, (CharSequence)localObject4);
        localObject3 = ((ResolveInfo)localObject3).loadIcon((PackageManager)localObject2);
        localObject3 = ((MenuItem)localObject4).setIcon((Drawable)localObject3);
        localObject4 = this.OooO0o0;
        ((MenuItem)localObject3).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject4);
        j += 1;
      }
    }
  }
  
  public void OooOO0(Intent paramIntent)
  {
    paramIntent.addFlags(134742016);
  }
  
  public void setOnShareTargetSelectedListener(ShareActionProvider.OnShareTargetSelectedListener paramOnShareTargetSelectedListener)
  {
    this.OooO0oo = paramOnShareTargetSelectedListener;
    OooO();
  }
  
  public void setShareHistoryFileName(String paramString)
  {
    this.OooO0oO = paramString;
    OooO();
  }
  
  public void setShareIntent(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      localObject = paramIntent.getAction();
      str = "android.intent.action.SEND";
      boolean bool1 = str.equals(localObject);
      if (!bool1)
      {
        str = "android.intent.action.SEND_MULTIPLE";
        boolean bool2 = str.equals(localObject);
        if (!bool2) {}
      }
      else
      {
        OooOO0(paramIntent);
      }
    }
    Object localObject = this.OooO0o;
    String str = this.OooO0oO;
    ActivityChooserModel.OooO0Oo((Context)localObject, str).setIntent(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ShareActionProvider
 * JD-Core Version:    0.7.0.1
 */