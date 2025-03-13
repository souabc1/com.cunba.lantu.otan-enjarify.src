package androidx.slidingpanelayout.widget;

import android.view.View;
import java.util.ArrayList;

class SlidingPaneLayout$DisableLayerRunnable
  implements Runnable
{
  public final View o00OoOoo;
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo.getParent();
    Object localObject2 = this.o00Ooo00;
    if (localObject1 == localObject2)
    {
      this.o00OoOoo.setLayerType(0, null);
      localObject1 = this.o00Ooo00;
      localObject2 = this.o00OoOoo;
      ((SlidingPaneLayout)localObject1).OooOO0((View)localObject2);
    }
    this.o00Ooo00.o00o00Oo.remove(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable
 * JD-Core Version:    0.7.0.1
 */