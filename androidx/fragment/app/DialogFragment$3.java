package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class DialogFragment$3
  implements DialogInterface.OnDismissListener
{
  public DialogFragment$3(DialogFragment paramDialogFragment) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    paramDialogInterface = DialogFragment.access$000(this.o00OoOoo);
    if (paramDialogInterface != null)
    {
      paramDialogInterface = this.o00OoOoo;
      Dialog localDialog = DialogFragment.access$000(paramDialogInterface);
      paramDialogInterface.onDismiss(localDialog);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DialogFragment.3
 * JD-Core Version:    0.7.0.1
 */