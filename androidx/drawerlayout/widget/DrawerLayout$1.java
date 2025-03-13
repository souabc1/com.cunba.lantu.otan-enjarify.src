package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;

class DrawerLayout$1
  implements AccessibilityViewCommand
{
  public boolean perform(View paramView, AccessibilityViewCommand.CommandArguments paramCommandArguments)
  {
    paramCommandArguments = this.OooO00o;
    boolean bool = paramCommandArguments.OooOoOO(paramView);
    if (bool)
    {
      paramCommandArguments = this.OooO00o;
      int i = paramCommandArguments.OooOOo0(paramView);
      int j = 2;
      if (i != j)
      {
        this.OooO00o.OooO0o(paramView);
        return true;
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.1
 * JD-Core Version:    0.7.0.1
 */