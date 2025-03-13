package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper
{
  public int OooO00o;
  public int OooO0O0;
  
  public NestedScrollingParentHelper(ViewGroup paramViewGroup) {}
  
  public void OooO00o(View paramView1, View paramView2, int paramInt)
  {
    OooO0O0(paramView1, paramView2, paramInt, 0);
  }
  
  public void OooO0O0(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt2 == i) {
      this.OooO0O0 = paramInt1;
    } else {
      this.OooO00o = paramInt1;
    }
  }
  
  public void OooO0OO(View paramView)
  {
    OooO0Oo(paramView, 0);
  }
  
  public void OooO0Oo(View paramView, int paramInt)
  {
    int i = 1;
    if (paramInt == i) {
      this.OooO0O0 = 0;
    } else {
      this.OooO00o = 0;
    }
  }
  
  public int getNestedScrollAxes()
  {
    int i = this.OooO00o;
    int j = this.OooO0O0;
    return i | j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.NestedScrollingParentHelper
 * JD-Core Version:    0.7.0.1
 */