package androidx.preference;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class SwitchPreferenceCompat$Listener
  implements CompoundButton.OnCheckedChangeListener
{
  public SwitchPreferenceCompat$Listener(SwitchPreferenceCompat paramSwitchPreferenceCompat) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    SwitchPreferenceCompat localSwitchPreferenceCompat = this.OooO00o;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    boolean bool = localSwitchPreferenceCompat.OooO0OO(localBoolean);
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
 * Qualified Name:     androidx.preference.SwitchPreferenceCompat.Listener
 * JD-Core Version:    0.7.0.1
 */