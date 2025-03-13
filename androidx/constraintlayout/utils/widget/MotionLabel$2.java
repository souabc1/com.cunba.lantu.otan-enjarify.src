package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class MotionLabel$2
  extends ViewOutlineProvider
{
  public MotionLabel$2(MotionLabel paramMotionLabel) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    int i = this.OooO00o.getWidth();
    int j = this.OooO00o.getHeight();
    float f = MotionLabel.OooO0OO(this.OooO00o);
    paramOutline.setRoundRect(0, 0, i, j, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionLabel.2
 * JD-Core Version:    0.7.0.1
 */