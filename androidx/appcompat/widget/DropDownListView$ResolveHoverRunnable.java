package androidx.appcompat.widget;

import android.view.View;

class DropDownListView$ResolveHoverRunnable
  implements Runnable
{
  public DropDownListView$ResolveHoverRunnable(DropDownListView paramDropDownListView) {}
  
  public void OooO00o()
  {
    DropDownListView localDropDownListView = this.o00OoOoo;
    localDropDownListView.o00o0000 = null;
    localDropDownListView.removeCallbacks(this);
  }
  
  public void OooO0O0()
  {
    this.o00OoOoo.post(this);
  }
  
  public void run()
  {
    DropDownListView localDropDownListView = this.o00OoOoo;
    localDropDownListView.o00o0000 = null;
    localDropDownListView.drawableStateChanged();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable
 * JD-Core Version:    0.7.0.1
 */