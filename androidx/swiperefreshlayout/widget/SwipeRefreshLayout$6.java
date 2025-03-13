package androidx.swiperefreshlayout.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$6
  extends Animation
{
  public SwipeRefreshLayout$6(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00OoOoo;
    boolean bool = paramTransformation.o00o0o00;
    if (!bool)
    {
      i = paramTransformation.o00o0O0;
      j = Math.abs(paramTransformation.o00o0O00);
      i -= j;
    }
    else
    {
      i = paramTransformation.o00o0O0;
    }
    paramTransformation = this.o00OoOoo;
    int k = paramTransformation.o00o00oo;
    int i = (int)((i - k) * paramFloat);
    k += i;
    int j = paramTransformation.o00o00o.getTop();
    k -= j;
    this.o00OoOoo.setTargetOffsetTopAndBottom(k);
    paramTransformation = this.o00OoOoo.o00o0OO0;
    float f = 1.0F - paramFloat;
    paramTransformation.setArrowScale(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
 * JD-Core Version:    0.7.0.1
 */