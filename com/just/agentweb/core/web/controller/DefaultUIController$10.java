package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

class DefaultUIController$10
  implements DialogInterface.OnCancelListener
{
  public DefaultUIController$10(DefaultUIController paramDefaultUIController) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = this.o00OoOoo;
    JsPromptResult localJsPromptResult = DefaultUIController.OooOOOo(paramDialogInterface);
    DefaultUIController.OooOOOO(paramDialogInterface, localJsPromptResult);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.10
 * JD-Core Version:    0.7.0.1
 */