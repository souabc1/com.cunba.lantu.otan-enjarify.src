package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.TextView;

class AlertController$AlertParams$2
  extends CursorAdapter
{
  public final int o00OoOoo;
  public final int o00Ooo00;
  
  public AlertController$AlertParams$2(AlertController.AlertParams paramAlertParams, Context paramContext, Cursor paramCursor, boolean paramBoolean, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController)
  {
    super(paramContext, paramCursor, paramBoolean);
    paramContext = getCursor();
    paramCursor = paramAlertParams.Oooo0o0;
    int i = paramContext.getColumnIndexOrThrow(paramCursor);
    this.o00OoOoo = i;
    paramAlertParams = paramAlertParams.Oooo0o;
    int j = paramContext.getColumnIndexOrThrow(paramAlertParams);
    this.o00Ooo00 = j;
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    paramView = (CheckedTextView)paramView.findViewById(16908308);
    int i = this.o00OoOoo;
    paramContext = paramCursor.getString(i);
    paramView.setText(paramContext);
    paramView = this.o00Ooo0;
    i = paramCursor.getPosition();
    int j = this.o00Ooo00;
    int k = paramCursor.getInt(j);
    j = 1;
    if (k != j) {
      j = 0;
    }
    paramView.setItemChecked(i, j);
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = this.o00Ooo0o.OooO0O0;
    int i = this.o00Ooo0O.Oooo0o;
    return paramContext.inflate(i, paramViewGroup, false);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.2
 * JD-Core Version:    0.7.0.1
 */