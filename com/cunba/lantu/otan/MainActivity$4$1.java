package com.cunba.lantu.otan;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.hjq.permissions.IPermissionInterceptor;
import com.hjq.permissions.OnPermissionCallback;
import java.util.List;
import m54207b69;

class MainActivity$4$1
  implements DialogInterface.OnClickListener
{
  public MainActivity$4$1(MainActivity.4 param4, Activity paramActivity, List paramList, IPermissionInterceptor paramIPermissionInterceptor, OnPermissionCallback paramOnPermissionCallback) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDialogInterface;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(19, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.MainActivity.4.1
 * JD-Core Version:    0.7.0.1
 */