package androidx.preference;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class SwitchPreference$Listener
  implements CompoundButton.OnCheckedChangeListener
{
  public SwitchPreference$Listener(SwitchPreference paramSwitchPreference) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    SwitchPreference localSwitchPreference = this.OooO00o;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    boolean bool = localSwitchPreference.OooO0OO(localBoolean);
    if (!bool)
    {
      paramBoolean ^= true;
      paramCompoundButton.setChecked(paramBoolean);
      return;
    }
    this.OooO00o.setChecked(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.SwitchPreference.Listener
 * JD-Core Version:    0.7.0.1
 */