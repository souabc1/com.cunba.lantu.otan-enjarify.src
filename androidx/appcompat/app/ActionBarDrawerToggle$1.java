package androidx.appcompat.app;

import android.view.View;
import android.view.View.OnClickListener;

class ActionBarDrawerToggle$1
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((ActionBarDrawerToggle)localObject).OooO0o;
    if (bool)
    {
      ((ActionBarDrawerToggle)localObject).OooO0oO();
    }
    else
    {
      localObject = ((ActionBarDrawerToggle)localObject).OooOO0;
      if (localObject != null) {
        ((View.OnClickListener)localObject).onClick(paramView);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.1
 * JD-Core Version:    0.7.0.1
 */