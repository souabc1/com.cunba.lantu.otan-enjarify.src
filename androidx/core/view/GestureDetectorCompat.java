package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class GestureDetectorCompat
{
  public final GestureDetectorCompat.GestureDetectorCompatImpl OooO00o;
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    GestureDetectorCompat.GestureDetectorCompatImplJellybeanMr2 localGestureDetectorCompatImplJellybeanMr2 = new androidx/core/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;
    localGestureDetectorCompatImplJellybeanMr2.<init>(paramContext, paramOnGestureListener, paramHandler);
    this.OooO00o = localGestureDetectorCompatImplJellybeanMr2;
  }
  
  public boolean OooO00o(MotionEvent paramMotionEvent)
  {
    return this.OooO00o.OooO00o(paramMotionEvent);
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
 * Qualified Name:     androidx.core.view.GestureDetectorCompat
 * JD-Core Version:    0.7.0.1
 */