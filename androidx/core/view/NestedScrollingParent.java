package androidx.core.view;

import android.view.View;

public abstract interface NestedScrollingParent
{
  public abstract int getNestedScrollAxes();
  
  public abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.NestedScrollingParent
 * JD-Core Version:    0.7.0.1
 */