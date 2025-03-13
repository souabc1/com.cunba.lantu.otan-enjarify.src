package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ListPopupWindow$3
  implements AdapterView.OnItemSelectedListener
{
  public ListPopupWindow$3(ListPopupWindow paramListPopupWindow) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = -1;
    if (paramInt != i)
    {
      paramAdapterView = this.o00OoOoo.o00Ooo0;
      if (paramAdapterView != null) {
        paramAdapterView.setListSelectionHidden(false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.3
 * JD-Core Version:    0.7.0.1
 */