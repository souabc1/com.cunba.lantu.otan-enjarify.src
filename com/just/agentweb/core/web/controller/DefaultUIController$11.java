package com.just.agentweb.core.web.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

class DefaultUIController$11
  implements DialogInterface.OnClickListener
{
  public DefaultUIController$11(DefaultUIController paramDefaultUIController, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.o00Ooo00;
    Object localObject = DefaultUIController.OooOOo0(paramDialogInterface);
    paramDialogInterface.OooOOO0((Dialog)localObject);
    paramDialogInterface = DefaultUIController.OooOOOo(this.o00Ooo00);
    if (paramDialogInterface != null)
    {
      paramDialogInterface = DefaultUIController.OooOOOo(this.o00Ooo00);
      localObject = this.o00OoOoo.getText().toString();
      paramDialogInterface.confirm((String)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.11
 * JD-Core Version:    0.7.0.1
 */