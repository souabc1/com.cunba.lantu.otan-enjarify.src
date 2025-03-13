package androidx.preference;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class CheckBoxPreference$Listener
  implements CompoundButton.OnCheckedChangeListener
{
  public CheckBoxPreference$Listener(CheckBoxPreference paramCheckBoxPreference) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference = this.OooO00o;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    boolean bool = localCheckBoxPreference.OooO0OO(localBoolean);
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
 * Qualified Name:     androidx.preference.CheckBoxPreference.Listener
 * JD-Core Version:    0.7.0.1
 */