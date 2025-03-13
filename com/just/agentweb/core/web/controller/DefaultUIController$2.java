package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler.Callback;
import android.os.Message;

class DefaultUIController$2
  implements DialogInterface.OnClickListener
{
  public DefaultUIController$2(DefaultUIController paramDefaultUIController, Handler.Callback paramCallback) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
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
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.2
 * JD-Core Version:    0.7.0.1
 */