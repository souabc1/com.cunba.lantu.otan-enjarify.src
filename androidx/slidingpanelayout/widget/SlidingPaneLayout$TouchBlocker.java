package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class SlidingPaneLayout$TouchBlocker
  extends FrameLayout
{
  public SlidingPaneLayout$TouchBlocker(View paramView)
  {
    super(localContext);
    addView(paramView);
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker
 * JD-Core Version:    0.7.0.1
 */