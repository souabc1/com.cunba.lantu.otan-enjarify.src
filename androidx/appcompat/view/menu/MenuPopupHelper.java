package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.R.dimen;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

public class MenuPopupHelper
  implements MenuHelper
{
  public MenuPresenter.Callback OooO;
  public final Context OooO00o;
  public final MenuBuilder OooO0O0;
  public final boolean OooO0OO;
  public final int OooO0Oo;
  public View OooO0o;
  public final int OooO0o0;
  public int OooO0oO = 8388611;
  public boolean OooO0oo;
  public MenuPopup OooOO0;
  public PopupWindow.OnDismissListener OooOO0O;
  public final PopupWindow.OnDismissListener OooOO0o;
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramMenuBuilder, paramView, paramBoolean, paramInt, 0);
  }
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    MenuPopupHelper.1 local1 = new androidx/appcompat/view/menu/MenuPopupHelper$1;
    local1.<init>(this);
    this.OooOO0o = local1;
    this.OooO00o = paramContext;
    this.OooO0O0 = paramMenuBuilder;
    this.OooO0o = paramView;
    this.OooO0OO = paramBoolean;
    this.OooO0Oo = paramInt1;
    this.OooO0o0 = paramInt2;
  }
  
  public final MenuPopup OooO00o()
  {
    Object localObject1 = ((WindowManager)this.OooO00o.getSystemService("window")).getDefaultDisplay();
    Object localObject2 = new android/graphics/Point;
    ((Point)localObject2).<init>();
    MenuPopupHelper.Api17Impl.OooO00o((Display)localObject1, (Point)localObject2);
    int i = ((Point)localObject2).x;
    int j = ((Point)localObject2).y;
    i = Math.min(i, j);
    localObject2 = this.OooO00o.getResources();
    int m = R.dimen.abc_cascading_menus_min_smallest_width;
    j = ((Resources)localObject2).getDimensionPixelSize(m);
    if (i >= j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    if (i != 0)
    {
      localObject1 = new androidx/appcompat/view/menu/CascadingMenuPopup;
      Context localContext1 = this.OooO00o;
      View localView1 = this.OooO0o;
      int n = this.OooO0Oo;
      int i1 = this.OooO0o0;
      boolean bool2 = this.OooO0OO;
      localObject2 = localObject1;
      ((CascadingMenuPopup)localObject1).<init>(localContext1, localView1, n, i1, bool2);
    }
    else
    {
      localObject1 = new androidx/appcompat/view/menu/StandardMenuPopup;
      Context localContext2 = this.OooO00o;
      MenuBuilder localMenuBuilder = this.OooO0O0;
      View localView2 = this.OooO0o;
      int i2 = this.OooO0Oo;
      int i3 = this.OooO0o0;
      boolean bool3 = this.OooO0OO;
      ((StandardMenuPopup)localObject1).<init>(localContext2, localMenuBuilder, localView2, i2, i3, bool3);
    }
    localObject2 = this.OooO0O0;
    ((MenuPopup)localObject1).OooO00o((MenuBuilder)localObject2);
    localObject2 = this.OooOO0o;
    ((MenuPopup)localObject1).setOnDismissListener((PopupWindow.OnDismissListener)localObject2);
    localObject2 = this.OooO0o;
    ((MenuPopup)localObject1).setAnchorView((View)localObject2);
    localObject2 = this.OooO;
    ((MenuPresenter)localObject1).setCallback((MenuPresenter.Callback)localObject2);
    boolean bool1 = this.OooO0oo;
    ((MenuPopup)localObject1).setForceShowIcon(bool1);
    int k = this.OooO0oO;
    ((MenuPopup)localObject1).setGravity(k);
    return localObject1;
  }
  
  public void OooO0O0()
  {
    boolean bool = isShowing();
    if (bool)
    {
      MenuPopup localMenuPopup = this.OooOO0;
      localMenuPopup.dismiss();
    }
  }
  
  public void OooO0OO()
  {
    this.OooOO0 = null;
    PopupWindow.OnDismissListener localOnDismissListener = this.OooOO0O;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void OooO0Oo()
  {
    boolean bool = OooO0o();
    if (bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("MenuPopupHelper cannot be used without an anchor");
    throw localIllegalStateException;
  }
  
  public boolean OooO0o()
  {
    boolean bool1 = isShowing();
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    View localView = this.OooO0o;
    if (localView == null) {
      return false;
    }
    OooO0o0(0, 0, false, false);
    return bool2;
  }
  
  public final void OooO0o0(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    MenuPopup localMenuPopup = getPopup();
    localMenuPopup.setShowTitle(paramBoolean2);
    if (paramBoolean1)
    {
      paramBoolean1 = this.OooO0oO;
      Object localObject1 = this.OooO0o;
      paramBoolean2 = ViewCompat.OooOoOO((View)localObject1);
      paramBoolean1 = GravityCompat.OooO0O0(paramBoolean1, paramBoolean2) & 0x7;
      paramBoolean2 = true;
      float f1 = 7.006492E-045F;
      if (paramBoolean1 == paramBoolean2)
      {
        localObject2 = this.OooO0o;
        paramBoolean1 = ((View)localObject2).getWidth();
        paramInt1 -= paramBoolean1;
      }
      localMenuPopup.setHorizontalOffset(paramInt1);
      localMenuPopup.setVerticalOffset(paramInt2);
      Object localObject2 = this.OooO00o.getResources().getDisplayMetrics();
      float f2 = ((DisplayMetrics)localObject2).density * 48.0F;
      paramBoolean2 = 1073741824;
      f1 = 2.0F;
      f2 /= f1;
      paramBoolean1 = (int)f2;
      localObject1 = new android/graphics/Rect;
      int i = paramInt1 - paramBoolean1;
      int j = paramInt2 - paramBoolean1;
      paramInt1 += paramBoolean1;
      paramInt2 += paramBoolean1;
      ((Rect)localObject1).<init>(i, j, paramInt1, paramInt2);
      localMenuPopup.setEpicenterBounds((Rect)localObject1);
    }
    localMenuPopup.show();
  }
  
  public boolean OooO0oO(int paramInt1, int paramInt2)
  {
    boolean bool1 = isShowing();
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    View localView = this.OooO0o;
    if (localView == null) {
      return false;
    }
    OooO0o0(paramInt1, paramInt2, bool2, bool2);
    return bool2;
  }
  
  public int getGravity()
  {
    return this.OooO0oO;
  }
  
  public ListView getListView()
  {
    return getPopup().getListView();
  }
  
  public MenuPopup getPopup()
  {
    MenuPopup localMenuPopup = this.OooOO0;
    if (localMenuPopup == null)
    {
      localMenuPopup = OooO00o();
      this.OooOO0 = localMenuPopup;
    }
    return this.OooOO0;
  }
  
  public boolean isShowing()
  {
    MenuPopup localMenuPopup = this.OooOO0;
    if (localMenuPopup != null)
    {
      bool = localMenuPopup.isShowing();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localMenuPopup = null;
    return bool;
  }
  
  public void setAnchorView(View paramView)
  {
    this.OooO0o = paramView;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.OooO0oo = paramBoolean;
    MenuPopup localMenuPopup = this.OooOO0;
    if (localMenuPopup != null) {
      localMenuPopup.setForceShowIcon(paramBoolean);
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.OooO0oO = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.OooOO0O = paramOnDismissListener;
  }
  
  public void setPresenterCallback(MenuPresenter.Callback paramCallback)
  {
    this.OooO = paramCallback;
    MenuPopup localMenuPopup = this.OooOO0;
    if (localMenuPopup != null) {
      localMenuPopup.setCallback(paramCallback);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuPopupHelper
 * JD-Core Version:    0.7.0.1
 */