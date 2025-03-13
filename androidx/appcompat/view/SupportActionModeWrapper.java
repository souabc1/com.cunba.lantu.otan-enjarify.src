package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportMenu;

public class SupportActionModeWrapper
  extends android.view.ActionMode
{
  public final Context OooO00o;
  public final ActionMode OooO0O0;
  
  public SupportActionModeWrapper(Context paramContext, ActionMode paramActionMode)
  {
    this.OooO00o = paramContext;
    this.OooO0O0 = paramActionMode;
  }
  
  public void finish()
  {
    this.OooO0O0.OooO00o();
  }
  
  public View getCustomView()
  {
    return this.OooO0O0.getCustomView();
  }
  
  public Menu getMenu()
  {
    MenuWrapperICS localMenuWrapperICS = new androidx/appcompat/view/menu/MenuWrapperICS;
    Context localContext = this.OooO00o;
    SupportMenu localSupportMenu = (SupportMenu)this.OooO0O0.getMenu();
    localMenuWrapperICS.<init>(localContext, localSupportMenu);
    return localMenuWrapperICS;
  }
  
  public MenuInflater getMenuInflater()
  {
    return this.OooO0O0.getMenuInflater();
  }
  
  public CharSequence getSubtitle()
  {
    return this.OooO0O0.getSubtitle();
  }
  
  public Object getTag()
  {
    return this.OooO0O0.getTag();
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0O0.getTitle();
  }
  
  public boolean getTitleOptionalHint()
  {
    return this.OooO0O0.getTitleOptionalHint();
  }
  
  public void invalidate()
  {
    this.OooO0O0.OooO0O0();
  }
  
  public boolean isTitleOptional()
  {
    return this.OooO0O0.isTitleOptional();
  }
  
  public void setCustomView(View paramView)
  {
    this.OooO0O0.setCustomView(paramView);
  }
  
  public void setSubtitle(int paramInt)
  {
    this.OooO0O0.setSubtitle(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.OooO0O0.setSubtitle(paramCharSequence);
  }
  
  public void setTag(Object paramObject)
  {
    this.OooO0O0.setTag(paramObject);
  }
  
  public void setTitle(int paramInt)
  {
    this.OooO0O0.setTitle(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.OooO0O0.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.OooO0O0.setTitleOptionalHint(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.SupportActionModeWrapper
 * JD-Core Version:    0.7.0.1
 */