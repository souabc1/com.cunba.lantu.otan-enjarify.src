package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$3
  extends Animation
{
  public SwipeRefreshLayout$3(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00OoOoo;
    float f = 1.0F - paramFloat;
    paramTransformation.setAnimationProgress(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
 * JD-Core Version:    0.7.0.1
 */