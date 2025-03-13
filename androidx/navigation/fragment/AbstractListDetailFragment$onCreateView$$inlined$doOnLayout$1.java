package androidx.navigation.fragment;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import androidx.activity.OnBackPressedCallback;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.Intrinsics;

public final class AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
  implements View.OnLayoutChangeListener
{
  public AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1(AbstractListDetailFragment paramAbstractListDetailFragment, SlidingPaneLayout paramSlidingPaneLayout) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    Intrinsics.OooO0oO(paramView, "view");
    paramView.removeOnLayoutChangeListener(this);
    paramView = AbstractListDetailFragment.OooOoO(this.OooO00o);
    Intrinsics.OooO0OO(paramView);
    SlidingPaneLayout localSlidingPaneLayout = this.OooO0O0;
    paramInt1 = localSlidingPaneLayout.isSlideable();
    if (paramInt1 != 0)
    {
      localSlidingPaneLayout = this.OooO0O0;
      paramInt1 = localSlidingPaneLayout.isOpen();
      if (paramInt1 != 0)
      {
        paramInt1 = 1;
        break label65;
      }
    }
    paramInt1 = 0;
    localSlidingPaneLayout = null;
    label65:
    paramView.setEnabled(paramInt1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.fragment.AbstractListDetailFragment.onCreateView..inlined.doOnLayout.1
 * JD-Core Version:    0.7.0.1
 */