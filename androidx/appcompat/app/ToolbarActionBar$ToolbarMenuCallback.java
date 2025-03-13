package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.DecorToolbar;

class ToolbarActionBar$ToolbarMenuCallback
  implements AppCompatDelegateImpl.ActionBarMenuCallback
{
  public ToolbarActionBar$ToolbarMenuCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean OooO00o(int paramInt)
  {
    if (paramInt == 0)
    {
      ToolbarActionBar localToolbarActionBar = this.OooO00o;
      boolean bool = localToolbarActionBar.OooO0Oo;
      if (!bool)
      {
        localToolbarActionBar.OooO00o.OooO0O0();
        localToolbarActionBar = this.OooO00o;
        bool = true;
        localToolbarActionBar.OooO0Oo = bool;
      }
    }
    return false;
  }
  
  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0)
    {
      View localView = new android/view/View;
      Context localContext = this.OooO00o.OooO00o.getContext();
      localView.<init>(localContext);
      return localView;
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.ToolbarMenuCallback
 * JD-Core Version:    0.7.0.1
 */