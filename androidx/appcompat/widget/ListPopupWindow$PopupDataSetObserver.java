package androidx.appcompat.widget;

import android.database.DataSetObserver;

class ListPopupWindow$PopupDataSetObserver
  extends DataSetObserver
{
  public ListPopupWindow$PopupDataSetObserver(ListPopupWindow paramListPopupWindow) {}
  
  public void onChanged()
  {
    ListPopupWindow localListPopupWindow = this.OooO00o;
    boolean bool = localListPopupWindow.isShowing();
    if (bool)
    {
      localListPopupWindow = this.OooO00o;
      localListPopupWindow.show();
    }
  }
  
  public void onInvalidated()
  {
    this.OooO00o.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.PopupDataSetObserver
 * JD-Core Version:    0.7.0.1
 */