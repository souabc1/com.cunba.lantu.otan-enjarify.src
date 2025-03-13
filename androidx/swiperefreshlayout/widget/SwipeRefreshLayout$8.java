package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$8
  extends Animation
{
  public SwipeRefreshLayout$8(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00OoOoo;
    float f1 = paramTransformation.o00o0;
    float f2 = -f1 * paramFloat;
    f1 += f2;
    paramTransformation.setAnimationProgress(f1);
    this.o00OoOoo.OooOO0(paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
 * JD-Core Version:    0.7.0.1
 */