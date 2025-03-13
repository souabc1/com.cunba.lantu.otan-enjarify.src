package androidx.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ListPreferenceDialogFragmentCompat$1
  implements DialogInterface.OnClickListener
{
  public ListPreferenceDialogFragmentCompat$1(ListPreferenceDialogFragmentCompat paramListPreferenceDialogFragmentCompat) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ListPreferenceDialogFragmentCompat localListPreferenceDialogFragmentCompat = this.o00OoOoo;
    localListPreferenceDialogFragmentCompat.o00OooOo = paramInt;
    localListPreferenceDialogFragmentCompat.onClick(paramDialogInterface, -1);
    paramDialogInterface.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.ListPreferenceDialogFragmentCompat.1
 * JD-Core Version:    0.7.0.1
 */