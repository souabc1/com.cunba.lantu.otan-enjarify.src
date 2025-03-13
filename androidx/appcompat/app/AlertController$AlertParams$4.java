package androidx.appcompat.app;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$4
  implements AdapterView.OnItemClickListener
{
  public AlertController$AlertParams$4(AlertController.AlertParams paramAlertParams, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.o00Ooo0.Oooo000;
    if (paramAdapterView != null)
    {
      paramView = this.o00OoOoo;
      boolean bool1 = paramView.isItemChecked(paramInt);
      paramAdapterView[paramInt] = bool1;
    }
    paramAdapterView = this.o00Ooo0.Oooo0O0;
    paramView = this.o00Ooo00.OooO0O0;
    boolean bool2 = this.o00OoOoo.isItemChecked(paramInt);
    paramAdapterView.onClick(paramView, paramInt, bool2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.4
 * JD-Core Version:    0.7.0.1
 */