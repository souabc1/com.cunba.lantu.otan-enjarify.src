package com.just.agentweb.core.web.controller;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler.Callback;
import android.os.Message;
import com.just.agentweb.utils.LogUtils;
import m54207b69;

class DefaultUIController$6
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = this.o00Ooo00.OooO0o0;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("Jk1C04040B0756");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt);
    localObject = ((StringBuilder)localObject).toString();
    LogUtils.OooO0OO(paramDialogInterface, (String)localObject);
    paramDialogInterface = this.o00OoOoo;
    if (paramDialogInterface != null)
    {
      paramDialogInterface = Message.obtain();
      paramDialogInterface.what = paramInt;
      Handler.Callback localCallback = this.o00OoOoo;
      localCallback.handleMessage(paramDialogInterface);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultUIController.6
 * JD-Core Version:    0.7.0.1
 */