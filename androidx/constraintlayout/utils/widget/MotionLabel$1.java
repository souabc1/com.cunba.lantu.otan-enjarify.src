package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class MotionLabel$1
  extends ViewOutlineProvider
{
  public MotionLabel$1(MotionLabel paramMotionLabel) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    int i = this.OooO00o.getWidth();
    int j = this.OooO00o.getHeight();
    float f1 = Math.min(i, j);
    float f2 = MotionLabel.OooO0O0(this.OooO00o);
    float f3 = f1 * f2 / 2.0F;
    paramOutline.setRoundRect(0, 0, i, j, f3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionLabel.1
 * JD-Core Version:    0.7.0.1
 */