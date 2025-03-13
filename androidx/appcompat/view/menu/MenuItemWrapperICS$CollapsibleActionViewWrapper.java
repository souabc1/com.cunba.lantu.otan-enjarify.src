package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class MenuItemWrapperICS$CollapsibleActionViewWrapper
  extends FrameLayout
  implements androidx.appcompat.view.CollapsibleActionView
{
  public final android.view.CollapsibleActionView o00OoOoo;
  
  public MenuItemWrapperICS$CollapsibleActionViewWrapper(View paramView)
  {
    super((Context)localObject);
    localObject = paramView;
    localObject = (android.view.CollapsibleActionView)paramView;
    this.o00OoOoo = ((android.view.CollapsibleActionView)localObject);
    addView(paramView);
  }
  
  public void OooO0O0()
  {
    this.o00OoOoo.onActionViewExpanded();
  }
  
  public void OooO0OO()
  {
    this.o00OoOoo.onActionViewCollapsed();
  }
  
  public View getWrappedView()
  {
    return (View)this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper
 * JD-Core Version:    0.7.0.1
 */