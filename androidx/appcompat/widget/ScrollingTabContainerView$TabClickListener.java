package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabClickListener
  implements View.OnClickListener
{
  public ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onClick(View paramView)
  {
    Object localObject = paramView;
    ((ScrollingTabContainerView.TabView)paramView).getTab().OooO00o();
    localObject = this.o00OoOoo.o00Ooo0;
    int i = ((ViewGroup)localObject).getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.o00OoOoo.o00Ooo0.getChildAt(j);
      boolean bool;
      if (localView == paramView) {
        bool = true;
      } else {
        bool = false;
      }
      localView.setSelected(bool);
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener
 * JD-Core Version:    0.7.0.1
 */