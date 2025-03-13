package androidx.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class DropDownPreference$1
  implements AdapterView.OnItemSelectedListener
{
  public DropDownPreference$1(DropDownPreference paramDropDownPreference) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt >= 0)
    {
      paramAdapterView = this.o00OoOoo.getEntryValues()[paramInt].toString();
      paramView = this.o00OoOoo.getValue();
      boolean bool = paramAdapterView.equals(paramView);
      if (!bool)
      {
        paramView = this.o00OoOoo;
        bool = paramView.OooO0OO(paramAdapterView);
        if (bool)
        {
          paramView = this.o00OoOoo;
          paramView.setValue(paramAdapterView);
        }
      }
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.DropDownPreference.1
 * JD-Core Version:    0.7.0.1
 */