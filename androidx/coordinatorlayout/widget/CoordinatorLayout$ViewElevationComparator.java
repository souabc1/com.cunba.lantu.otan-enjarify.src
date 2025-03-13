package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Comparator;

class CoordinatorLayout$ViewElevationComparator
  implements Comparator
{
  public int OooO00o(View paramView1, View paramView2)
  {
    float f1 = ViewCompat.Oooo(paramView1);
    float f2 = ViewCompat.Oooo(paramView2);
    boolean bool1 = f1 < f2;
    if (bool1) {
      return -1;
    }
    boolean bool2 = f1 < f2;
    if (bool2) {
      return 1;
    }
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.ViewElevationComparator
 * JD-Core Version:    0.7.0.1
 */