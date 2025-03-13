package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$4
  extends Animation
{
  public SwipeRefreshLayout$4(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00Ooo0.o00o0OO0;
    int i = this.o00OoOoo;
    float f1 = i;
    float f2 = (this.o00Ooo00 - i) * paramFloat;
    int j = (int)(f1 + f2);
    paramTransformation.setAlpha(j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
 * JD-Core Version:    0.7.0.1
 */