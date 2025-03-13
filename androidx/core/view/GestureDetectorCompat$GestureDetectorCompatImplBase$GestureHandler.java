package androidx.core.view;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    Object localObject;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        k = 3;
        if (i == k)
        {
          paramMessage = this.OooO00o;
          localObject = paramMessage.OooO0oO;
          if (localObject != null)
          {
            boolean bool = paramMessage.OooO0oo;
            if (!bool)
            {
              paramMessage = paramMessage.OooOOO0;
              ((GestureDetector.OnDoubleTapListener)localObject).onSingleTapConfirmed(paramMessage);
            }
            else
            {
              paramMessage.OooO = j;
            }
          }
        }
        else
        {
          localObject = new java/lang/RuntimeException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Unknown message ");
          localStringBuilder.append(paramMessage);
          paramMessage = localStringBuilder.toString();
          ((RuntimeException)localObject).<init>(paramMessage);
          throw ((Throwable)localObject);
        }
      }
      else
      {
        paramMessage = this.OooO00o;
        paramMessage.OooO0Oo();
      }
    }
    else
    {
      paramMessage = this.OooO00o;
      localObject = paramMessage.OooO0o;
      paramMessage = paramMessage.OooOOO0;
      ((GestureDetector.OnGestureListener)localObject).onShowPress(paramMessage);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.GestureHandler
 * JD-Core Version:    0.7.0.1
 */