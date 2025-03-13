package com.qinggan.analytics.wbtech;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import m54207b69;

class UpdateManager$3
  implements DialogInterface.OnClickListener
{
  public UpdateManager$3(UpdateManager paramUpdateManager) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = UpdateManager.OooO0oO();
    String str2 = m54207b69.F54207b69_11("/541484253");
    paramInt = str1.equals(str2);
    if (paramInt != 0)
    {
      paramDialogInterface = null;
      System.exit(0);
    }
    else
    {
      paramDialogInterface.dismiss();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UpdateManager.3
 * JD-Core Version:    0.7.0.1
 */