package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Message;

class BaseTransientBottomBar$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    if (i != 0)
    {
      if (i != j) {
        return false;
      }
      BaseTransientBottomBar localBaseTransientBottomBar = (BaseTransientBottomBar)paramMessage.obj;
      int k = paramMessage.arg1;
      localBaseTransientBottomBar.hideView(k);
      return j;
    }
    ((BaseTransientBottomBar)paramMessage.obj).showView();
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.1
 * JD-Core Version:    0.7.0.1
 */