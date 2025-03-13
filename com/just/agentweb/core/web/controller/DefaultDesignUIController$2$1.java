package com.just.agentweb.core.web.controller;

import android.app.Dialog;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatDialog;

class DefaultDesignUIController$2$1
  implements View.OnClickListener
{
  public DefaultDesignUIController$2$1(DefaultDesignUIController.2 param2, int paramInt) {}
  
  public void onClick(View paramView)
  {
    paramView = DefaultDesignUIController.OooOo(this.o00Ooo00.o00Ooo0);
    if (paramView != null)
    {
      paramView = DefaultDesignUIController.OooOo(this.o00Ooo00.o00Ooo0);
      boolean bool = paramView.isShowing();
      if (bool)
      {
        paramView = DefaultDesignUIController.OooOo(this.o00Ooo00.o00Ooo0);
        paramView.dismiss();
      }
    }
    paramView = Message.obtain();
    int i = this.o00OoOoo;
    paramView.what = i;
    this.o00Ooo00.o00Ooo00.handleMessage(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.web.controller.DefaultDesignUIController.2.1
 * JD-Core Version:    0.7.0.1
 */