package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;

class ListPopupWindow$ResizePopupRunnable
  implements Runnable
{
  public ListPopupWindow$ResizePopupRunnable(ListPopupWindow paramListPopupWindow) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo.o00Ooo0;
    if (localObject1 != null)
    {
      boolean bool = ViewCompat.o000oOoO((View)localObject1);
      if (bool)
      {
        localObject1 = this.o00OoOoo.o00Ooo0;
        int i = ((AdapterView)localObject1).getCount();
        Object localObject2 = this.o00OoOoo.o00Ooo0;
        int j = ((ViewGroup)localObject2).getChildCount();
        if (i > j)
        {
          localObject1 = this.o00OoOoo.o00Ooo0;
          i = ((ViewGroup)localObject1).getChildCount();
          localObject2 = this.o00OoOoo;
          int k = ((ListPopupWindow)localObject2).o00o000O;
          if (i <= k)
          {
            localObject1 = ((ListPopupWindow)localObject2).o00o0OOo;
            j = 2;
            ((PopupWindow)localObject1).setInputMethodMode(j);
            localObject1 = this.o00OoOoo;
            ((ListPopupWindow)localObject1).show();
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable
 * JD-Core Version:    0.7.0.1
 */