package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class NavItemSelectedListener
  implements AdapterView.OnItemSelectedListener
{
  public final ActionBar.OnNavigationListener o00OoOoo;
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.o00OoOoo;
    if (paramAdapterView != null) {
      paramAdapterView.OooO00o(paramInt, paramLong);
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.NavItemSelectedListener
 * JD-Core Version:    0.7.0.1
 */