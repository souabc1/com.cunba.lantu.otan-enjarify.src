package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Handler.Callback;
import android.os.Message;

class DefaultUIController$5
  implements DialogInterface.OnCancelListener
{
  public void onCancel(DialogInterface paramDialogInterface)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = this.o00OoOoo;
    if (paramDialogInterface != null)
    {
      int i = -1;
      Message localMessage = Message.obtain(null, i);
      paramDialogInterface.handleMessage(localMessage);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.5
 * JD-Core Version:    0.7.0.1
 */