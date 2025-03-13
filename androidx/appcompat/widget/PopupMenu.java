package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPopupHelper;

public class PopupMenu
{
  public final Context OooO00o;
  public final MenuBuilder OooO0O0;
  public final View OooO0OO;
  public final MenuPopupHelper OooO0Oo;
  public PopupMenu.OnDismissListener OooO0o;
  public PopupMenu.OnMenuItemClickListener OooO0o0;
  public View.OnTouchListener OooO0oO;
  
  public PopupMenu(Context paramContext, View paramView)
  {
    this(paramContext, paramView, 0);
  }
  
  public PopupMenu(Context paramContext, View paramView, int paramInt)
  {
    this(paramContext, paramView, paramInt, i, 0);
  }
  
  public PopupMenu(Context paramContext, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.OooO00o = paramContext;
    this.OooO0OO = paramView;
    MenuBuilder localMenuBuilder = new androidx/appcompat/view/menu/MenuBuilder;
    localMenuBuilder.<init>(paramContext);
    this.OooO0O0 = localMenuBuilder;
    Object localObject = new androidx/appcompat/widget/PopupMenu$1;
    ((PopupMenu.1)localObject).<init>(this);
    localMenuBuilder.setCallback((MenuBuilder.Callback)localObject);
    MenuPopupHelper localMenuPopupHelper = new androidx/appcompat/view/menu/MenuPopupHelper;
    localObject = localMenuPopupHelper;
    localMenuPopupHelper.<init>(paramContext, localMenuBuilder, paramView, false, paramInt2, paramInt3);
    this.OooO0Oo = localMenuPopupHelper;
    localMenuPopupHelper.setGravity(paramInt1);
    paramContext = new androidx/appcompat/widget/PopupMenu$2;
    paramContext.<init>(this);
    localMenuPopupHelper.setOnDismissListener(paramContext);
  }
  
  public void OooO00o()
  {
    this.OooO0Oo.OooO0O0();
  }
  
  public void OooO0O0(int paramInt)
  {
    MenuInflater localMenuInflater = getMenuInflater();
    MenuBuilder localMenuBuilder = this.OooO0O0;
    localMenuInflater.inflate(paramInt, localMenuBuilder);
  }
  
  public void OooO0OO()
  {
    this.OooO0Oo.OooO0Oo();
  }
  
  public View.OnTouchListener getDragToOpenListener()
  {
    Object localObject = this.OooO0oO;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/widget/PopupMenu$3;
      View localView = this.OooO0OO;
      ((PopupMenu.3)localObject).<init>(this, localView);
      this.OooO0oO = ((View.OnTouchListener)localObject);
    }
    return this.OooO0oO;
  }
  
  public int getGravity()
  {
    return this.OooO0Oo.getGravity();
  }
  
  public Menu getMenu()
  {
    return this.OooO0O0;
  }
  
  public MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new androidx/appcompat/view/SupportMenuInflater;
    Context localContext = this.OooO00o;
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public ListView getMenuListView()
  {
    MenuPopupHelper localMenuPopupHelper = this.OooO0Oo;
    boolean bool = localMenuPopupHelper.isShowing();
    if (!bool) {
      return null;
    }
    return this.OooO0Oo.getListView();
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.OooO0Oo.setForceShowIcon(paramBoolean);
  }
  
  public void setGravity(int paramInt)
  {
    this.OooO0Oo.setGravity(paramInt);
  }
  
  public void setOnDismissListener(PopupMenu.OnDismissListener paramOnDismissListener)
  {
    this.OooO0o = paramOnDismissListener;
  }
  
  public void setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.OooO0o0 = paramOnMenuItemClickListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.PopupMenu
 * JD-Core Version:    0.7.0.1
 */