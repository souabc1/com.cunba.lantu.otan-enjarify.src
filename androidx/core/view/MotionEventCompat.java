package androidx.core.view;

import android.view.MotionEvent;

public final class MotionEventCompat
{
  public static int OooO00o(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getActionMasked();
  }
  
  public static int OooO0O0(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getPointerCount();
  }
  
  public static boolean OooO0OO(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getSource() & paramInt;
    if (i == paramInt)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramMotionEvent = null;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.MotionEventCompat
 * JD-Core Version:    0.7.0.1
 */