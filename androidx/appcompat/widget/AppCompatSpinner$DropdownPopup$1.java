package androidx.appcompat.widget;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AppCompatSpinner$DropdownPopup$1
  implements AdapterView.OnItemClickListener
{
  public AppCompatSpinner$DropdownPopup$1(AppCompatSpinner.DropdownPopup paramDropdownPopup, AppCompatSpinner paramAppCompatSpinner) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.o00Ooo00.o00o0o0o.setSelection(paramInt);
    paramAdapterView = this.o00Ooo00.o00o0o0o.getOnItemClickListener();
    if (paramAdapterView != null)
    {
      paramAdapterView = this.o00Ooo00;
      AppCompatSpinner localAppCompatSpinner = paramAdapterView.o00o0o0o;
      paramAdapterView = paramAdapterView.o00o0Ooo;
      long l = paramAdapterView.getItemId(paramInt);
      localAppCompatSpinner.performItemClick(paramView, paramInt, l);
    }
    this.o00Ooo00.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
 * JD-Core Version:    0.7.0.1
 */