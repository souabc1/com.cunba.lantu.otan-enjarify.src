package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

class ListPopupWindow$PopupScrollListener
  implements AbsListView.OnScrollListener
{
  public ListPopupWindow$PopupScrollListener(ListPopupWindow paramListPopupWindow) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      paramAbsListView = this.OooO00o;
      boolean bool = paramAbsListView.isInputMethodNotNeeded();
      if (!bool)
      {
        paramAbsListView = this.OooO00o.o00o0OOo.getContentView();
        if (paramAbsListView != null)
        {
          paramAbsListView = this.OooO00o;
          Handler localHandler = paramAbsListView.o00o0O0O;
          paramAbsListView = paramAbsListView.o00o00oO;
          localHandler.removeCallbacks(paramAbsListView);
          paramAbsListView = this.OooO00o.o00o00oO;
          paramAbsListView.run();
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.PopupScrollListener
 * JD-Core Version:    0.7.0.1
 */