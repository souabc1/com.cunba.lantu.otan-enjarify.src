package androidx.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import java.util.Set;

class MultiSelectListPreferenceDialogFragmentCompat$1
  implements DialogInterface.OnMultiChoiceClickListener
{
  public MultiSelectListPreferenceDialogFragmentCompat$1(MultiSelectListPreferenceDialogFragmentCompat paramMultiSelectListPreferenceDialogFragmentCompat) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean)
  {
    paramDialogInterface = this.OooO00o;
    Set localSet;
    CharSequence[] arrayOfCharSequence;
    String str;
    if (paramBoolean)
    {
      paramBoolean = paramDialogInterface.o0O00o0;
      localSet = paramDialogInterface.o00OooOo;
      arrayOfCharSequence = paramDialogInterface.o00Ooooo;
      str = arrayOfCharSequence[paramInt].toString();
      paramInt = localSet.add(str);
    }
    else
    {
      paramBoolean = paramDialogInterface.o0O00o0;
      localSet = paramDialogInterface.o00OooOo;
      arrayOfCharSequence = paramDialogInterface.o00Ooooo;
      str = arrayOfCharSequence[paramInt].toString();
      paramInt = localSet.remove(str);
    }
    paramInt |= paramBoolean;
    paramDialogInterface.o0O00o0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
 * JD-Core Version:    0.7.0.1
 */