package androidx.activity;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;

class ComponentActivity$ReportFullyDrawnExecutorApi16Impl
  implements ComponentActivity.ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable
{
  public final long o00OoOoo;
  public boolean o00Ooo0;
  public Runnable o00Ooo00;
  
  public ComponentActivity$ReportFullyDrawnExecutorApi16Impl(ComponentActivity paramComponentActivity)
  {
    long l = SystemClock.uptimeMillis() + 10000L;
    this.o00OoOoo = l;
    this.o00Ooo0 = false;
  }
  
  public void OooO0Oo()
  {
    this.o00Ooo0O.getWindow().getDecorView().removeCallbacks(this);
    this.o00Ooo0O.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
  }
  
  public void Oooo000(View paramView)
  {
    boolean bool = this.o00Ooo0;
    if (!bool)
    {
      bool = true;
      this.o00Ooo0 = bool;
      paramView = paramView.getViewTreeObserver();
      paramView.addOnDrawListener(this);
    }
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.o00Ooo00 = paramRunnable;
    paramRunnable = this.o00Ooo0O.getWindow().getDecorView();
    boolean bool = this.o00Ooo0;
    Object localObject;
    if (bool)
    {
      localObject = Looper.myLooper();
      Looper localLooper = Looper.getMainLooper();
      if (localObject == localLooper) {
        paramRunnable.invalidate();
      } else {
        paramRunnable.postInvalidate();
      }
    }
    else
    {
      localObject = new androidx/activity/OooO;
      ((OooO)localObject).<init>(this);
      paramRunnable.postOnAnimation((Runnable)localObject);
    }
  }
  
  public void onDraw()
  {
    Object localObject = this.o00Ooo00;
    boolean bool;
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      this.o00Ooo00 = null;
      localObject = this.o00Ooo0O.o00OoooO;
      bool = ((FullyDrawnReporter)localObject).isFullyDrawnReported();
      if (!bool) {
        return;
      }
    }
    else
    {
      long l1 = SystemClock.uptimeMillis();
      long l2 = this.o00OoOoo;
      bool = l1 < l2;
      if (!bool) {
        return;
      }
    }
    this.o00Ooo0 = false;
    localObject = this.o00Ooo0O.getWindow().getDecorView();
    ((View)localObject).post(this);
  }
  
  public void run()
  {
    this.o00Ooo0O.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ComponentActivity.ReportFullyDrawnExecutorApi16Impl
 * JD-Core Version:    0.7.0.1
 */