package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class ImageFilterView$1
  extends ViewOutlineProvider
{
  public ImageFilterView$1(ImageFilterView paramImageFilterView) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    int i = this.OooO00o.getWidth();
    int j = this.OooO00o.getHeight();
    float f1 = Math.min(i, j);
    float f2 = ImageFilterView.OooO00o(this.OooO00o);
    float f3 = f1 * f2 / 2.0F;
    paramOutline.setRoundRect(0, 0, i, j, f3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterView.1
 * JD-Core Version:    0.7.0.1
 */