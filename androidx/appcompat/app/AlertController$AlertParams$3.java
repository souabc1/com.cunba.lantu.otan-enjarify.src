package androidx.appcompat.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$3
  implements AdapterView.OnItemClickListener
{
  public AlertController$AlertParams$3(AlertController.AlertParams paramAlertParams, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.o00Ooo00.OooOo;
    paramView = this.o00OoOoo.OooO0O0;
    paramAdapterView.onClick(paramView, paramInt);
    paramAdapterView = this.o00Ooo00;
    boolean bool = paramAdapterView.Oooo00o;
    if (!bool)
    {
      paramAdapterView = this.o00OoOoo.OooO0O0;
      paramAdapterView.dismiss();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.3
 * JD-Core Version:    0.7.0.1
 */