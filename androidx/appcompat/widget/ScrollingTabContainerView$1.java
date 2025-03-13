package androidx.appcompat.widget;

import android.view.View;
import android.widget.HorizontalScrollView;

class ScrollingTabContainerView$1
  implements Runnable
{
  public ScrollingTabContainerView$1(ScrollingTabContainerView paramScrollingTabContainerView, View paramView) {}
  
  public void run()
  {
    int i = this.o00OoOoo.getLeft();
    int j = this.o00Ooo00.getWidth();
    int k = this.o00OoOoo.getWidth();
    j = (j - k) / 2;
    i -= j;
    this.o00Ooo00.smoothScrollTo(i, 0);
    this.o00Ooo00.o00OoOoo = null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.1
 * JD-Core Version:    0.7.0.1
 */