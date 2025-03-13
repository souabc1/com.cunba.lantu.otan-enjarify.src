package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

class ViewPager$ViewPositionComparator
  implements Comparator
{
  public int OooO00o(View paramView1, View paramView2)
  {
    paramView1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
    paramView2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
    boolean bool1 = paramView1.OooO00o;
    boolean bool2 = paramView2.OooO00o;
    if (bool1 != bool2)
    {
      if (bool1) {
        i = 1;
      } else {
        i = -1;
      }
      return i;
    }
    int i = paramView1.OooO0o0;
    int j = paramView2.OooO0o0;
    return i - j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.ViewPager.ViewPositionComparator
 * JD-Core Version:    0.7.0.1
 */