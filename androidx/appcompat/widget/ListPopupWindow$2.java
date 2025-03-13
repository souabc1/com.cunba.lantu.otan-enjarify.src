package androidx.appcompat.widget;

import android.view.View;

class ListPopupWindow$2
  implements Runnable
{
  public ListPopupWindow$2(ListPopupWindow paramListPopupWindow) {}
  
  public void run()
  {
    Object localObject = this.o00OoOoo.getAnchorView();
    if (localObject != null)
    {
      localObject = ((View)localObject).getWindowToken();
      if (localObject != null)
      {
        localObject = this.o00OoOoo;
        ((ListPopupWindow)localObject).show();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.2
 * JD-Core Version:    0.7.0.1
 */