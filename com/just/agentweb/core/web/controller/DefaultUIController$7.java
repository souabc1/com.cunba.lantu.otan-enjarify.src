package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

class DefaultUIController$7
  implements DialogInterface.OnCancelListener
{
  public DefaultUIController$7(DefaultUIController paramDefaultUIController) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = this.o00OoOoo;
    JsResult localJsResult = DefaultUIController.OooOOO(paramDialogInterface);
    DefaultUIController.OooOOOO(paramDialogInterface, localJsResult);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.7
 * JD-Core Version:    0.7.0.1
 */