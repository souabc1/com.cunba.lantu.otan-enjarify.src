package androidx.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ListPreferenceDialogFragment$1
  implements DialogInterface.OnClickListener
{
  public ListPreferenceDialogFragment$1(ListPreferenceDialogFragment paramListPreferenceDialogFragment) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ListPreferenceDialogFragment localListPreferenceDialogFragment = this.o00OoOoo;
    localListPreferenceDialogFragment.o00OooOo = paramInt;
    localListPreferenceDialogFragment.onClick(paramDialogInterface, -1);
    paramDialogInterface.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.ListPreferenceDialogFragment.1
 * JD-Core Version:    0.7.0.1
 */