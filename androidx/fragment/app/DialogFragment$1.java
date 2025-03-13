package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface.OnDismissListener;

class DialogFragment$1
  implements Runnable
{
  public DialogFragment$1(DialogFragment paramDialogFragment) {}
  
  public void run()
  {
    DialogInterface.OnDismissListener localOnDismissListener = DialogFragment.access$100(this.o00OoOoo);
    Dialog localDialog = DialogFragment.access$000(this.o00OoOoo);
    localOnDismissListener.onDismiss(localDialog);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DialogFragment.1
 * JD-Core Version:    0.7.0.1
 */