package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;

class ForwardingListener$DisallowIntercept
  implements Runnable
{
  public ForwardingListener$DisallowIntercept(ForwardingListener paramForwardingListener) {}
  
  public void run()
  {
    ViewParent localViewParent = this.o00OoOoo.o00Ooo0O.getParent();
    if (localViewParent != null)
    {
      boolean bool = true;
      localViewParent.requestDisallowInterceptTouchEvent(bool);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ForwardingListener.DisallowIntercept
 * JD-Core Version:    0.7.0.1
 */