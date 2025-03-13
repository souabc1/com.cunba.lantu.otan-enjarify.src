package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Message;

class SnackbarManager$1
  implements Handler.Callback
{
  public SnackbarManager$1(SnackbarManager paramSnackbarManager) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 0) {
      return false;
    }
    SnackbarManager localSnackbarManager = this.this$0;
    paramMessage = (SnackbarManager.SnackbarRecord)paramMessage.obj;
    localSnackbarManager.handleTimeout(paramMessage);
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.SnackbarManager.1
 * JD-Core Version:    0.7.0.1
 */