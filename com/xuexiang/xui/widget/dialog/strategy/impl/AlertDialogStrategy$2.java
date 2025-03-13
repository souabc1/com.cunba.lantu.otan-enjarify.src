package com.xuexiang.xui.widget.dialog.strategy.impl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import m54207b69;

class AlertDialogStrategy$2
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDialogInterface;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3255, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.strategy.impl.AlertDialogStrategy.2
 * JD-Core Version:    0.7.0.1
 */