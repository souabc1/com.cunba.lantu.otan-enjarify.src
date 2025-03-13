package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2
  implements GestureDetectorCompat.GestureDetectorCompatImpl
{
  public final GestureDetector OooO00o;
  
  public GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    GestureDetector localGestureDetector = new android/view/GestureDetector;
    localGestureDetector.<init>(paramContext, paramOnGestureListener, paramHandler);
    this.OooO00o = localGestureDetector;
  }
  
  public boolean OooO00o(MotionEvent paramMotionEvent)
  {
    return this.OooO00o.onTouchEvent(paramMotionEvent);
  }
  
  public boolean isLongpressEnabled()
  {
    return this.OooO00o.isLongpressEnabled();
  }
  
  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    this.OooO00o.setIsLongpressEnabled(paramBoolean);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.OooO00o.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplJellybeanMr2
 * JD-Core Version:    0.7.0.1
 */