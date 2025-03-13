package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler.Callback;
import android.os.Message;

class DefaultUIController$4
  implements DialogInterface.OnClickListener
{
  public DefaultUIController$4(DefaultUIController paramDefaultUIController, Handler.Callback paramCallback) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null) {
      paramDialogInterface.dismiss();
    }
    paramDialogInterface = this.o00OoOoo;
    if (paramDialogInterface != null)
    {
      Message localMessage = Message.obtain();
      paramDialogInterface.handleMessage(localMessage);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.4
 * JD-Core Version:    0.7.0.1
 */