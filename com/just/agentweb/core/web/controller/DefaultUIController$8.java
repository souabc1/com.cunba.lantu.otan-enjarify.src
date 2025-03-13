package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;
import androidx.appcompat.app.AlertDialog;

class DefaultUIController$8
  implements DialogInterface.OnClickListener
{
  public DefaultUIController$8(DefaultUIController paramDefaultUIController) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.o00OoOoo;
    AlertDialog localAlertDialog = paramDialogInterface.OooO0oO;
    paramDialogInterface.OooOOO0(localAlertDialog);
    paramDialogInterface = DefaultUIController.OooOOO(this.o00OoOoo);
    if (paramDialogInterface != null)
    {
      paramDialogInterface = DefaultUIController.OooOOO(this.o00OoOoo);
      paramDialogInterface.confirm();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.8
 * JD-Core Version:    0.7.0.1
 */