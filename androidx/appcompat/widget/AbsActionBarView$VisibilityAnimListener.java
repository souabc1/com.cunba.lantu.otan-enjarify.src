package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

public class AbsActionBarView$VisibilityAnimListener
  implements ViewPropertyAnimatorListener
{
  public boolean OooO00o = false;
  public int OooO0O0;
  
  public AbsActionBarView$VisibilityAnimListener(AbsActionBarView paramAbsActionBarView) {}
  
  public void OooO00o(View paramView)
  {
    this.OooO00o = true;
  }
  
  public void OooO0O0(View paramView)
  {
    boolean bool = this.OooO00o;
    if (bool) {
      return;
    }
    paramView = this.OooO0OO;
    paramView.o00OooO0 = null;
    int i = this.OooO0O0;
    AbsActionBarView.OooO0O0(paramView, i);
  }
  
  public void OooO0OO(View paramView)
  {
    AbsActionBarView.OooO00o(this.OooO0OO, 0);
    this.OooO00o = false;
  }
  
  public VisibilityAnimListener OooO0Oo(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat, int paramInt)
  {
    this.OooO0OO.o00OooO0 = paramViewPropertyAnimatorCompat;
    this.OooO0O0 = paramInt;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener
 * JD-Core Version:    0.7.0.1
 */