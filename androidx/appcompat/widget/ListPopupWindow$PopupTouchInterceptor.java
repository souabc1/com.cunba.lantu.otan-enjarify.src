package androidx.appcompat.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class ListPopupWindow$PopupTouchInterceptor
  implements View.OnTouchListener
{
  public ListPopupWindow$PopupTouchInterceptor(ListPopupWindow paramListPopupWindow) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    int j = (int)f1;
    float f2 = paramMotionEvent.getY();
    int k = (int)f2;
    if (i == 0)
    {
      PopupWindow localPopupWindow1 = this.o00OoOoo.o00o0OOo;
      if (localPopupWindow1 != null)
      {
        boolean bool = localPopupWindow1.isShowing();
        if ((bool) && (j >= 0))
        {
          localPopupWindow1 = this.o00OoOoo.o00o0OOo;
          int m = localPopupWindow1.getWidth();
          if ((j < m) && (k >= 0))
          {
            PopupWindow localPopupWindow2 = this.o00OoOoo.o00o0OOo;
            j = localPopupWindow2.getHeight();
            if (k < j)
            {
              paramView = this.o00OoOoo;
              paramMotionEvent = paramView.o00o0O0O;
              paramView = paramView.o00o00oO;
              long l = 250L;
              paramMotionEvent.postDelayed(paramView, l);
              break label177;
            }
          }
        }
      }
    }
    k = 1;
    f2 = 1.4E-45F;
    if (i == k)
    {
      paramView = this.o00OoOoo;
      paramMotionEvent = paramView.o00o0O0O;
      paramView = paramView.o00o00oO;
      paramMotionEvent.removeCallbacks(paramView);
    }
    label177:
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor
 * JD-Core Version:    0.7.0.1
 */