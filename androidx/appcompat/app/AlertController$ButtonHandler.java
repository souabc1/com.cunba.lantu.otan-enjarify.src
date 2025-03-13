package androidx.appcompat.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class AlertController$ButtonHandler
  extends Handler
{
  public WeakReference OooO00o;
  
  public AlertController$ButtonHandler(DialogInterface paramDialogInterface)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramDialogInterface);
    this.OooO00o = localWeakReference;
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = -3;
    if (i != j)
    {
      j = -2;
      if (i != j)
      {
        j = -1;
        if (i != j)
        {
          j = 1;
          if (i != j) {
            return;
          }
          paramMessage = (DialogInterface)paramMessage.obj;
          paramMessage.dismiss();
          return;
        }
      }
    }
    DialogInterface.OnClickListener localOnClickListener = (DialogInterface.OnClickListener)paramMessage.obj;
    DialogInterface localDialogInterface = (DialogInterface)this.OooO00o.get();
    int k = paramMessage.what;
    localOnClickListener.onClick(localDialogInterface, k);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.ButtonHandler
 * JD-Core Version:    0.7.0.1
 */