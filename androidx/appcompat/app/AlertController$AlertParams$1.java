package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

class AlertController$AlertParams$1
  extends ArrayAdapter
{
  public AlertController$AlertParams$1(AlertController.AlertParams paramAlertParams, Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    paramViewGroup = this.o00Ooo00.Oooo000;
    if (paramViewGroup != null)
    {
      int i = paramViewGroup[paramInt];
      if (i != 0)
      {
        paramViewGroup = this.o00OoOoo;
        boolean bool = true;
        paramViewGroup.setItemChecked(paramInt, bool);
      }
    }
    return paramView;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.1
 * JD-Core Version:    0.7.0.1
 */