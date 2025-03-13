package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class DialogFragment$2
  implements DialogInterface.OnCancelListener
{
  public DialogFragment$2(DialogFragment paramDialogFragment) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    paramDialogInterface = DialogFragment.access$000(this.o00OoOoo);
    if (paramDialogInterface != null)
    {
      paramDialogInterface = this.o00OoOoo;
      Dialog localDialog = DialogFragment.access$000(paramDialogInterface);
      paramDialogInterface.onCancel(localDialog);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DialogFragment.2
 * JD-Core Version:    0.7.0.1
 */