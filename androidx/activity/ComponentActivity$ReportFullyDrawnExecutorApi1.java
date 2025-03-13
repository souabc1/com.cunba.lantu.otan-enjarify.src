package androidx.activity;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

class ComponentActivity$ReportFullyDrawnExecutorApi1
  implements ComponentActivity.ReportFullyDrawnExecutor
{
  public final Handler o00OoOoo;
  
  public ComponentActivity$ReportFullyDrawnExecutorApi1()
  {
    Handler localHandler = OooO00o();
    this.o00OoOoo = localHandler;
  }
  
  public final Handler OooO00o()
  {
    Looper localLooper = Looper.myLooper();
    Handler localHandler = new android/os/Handler;
    if (localLooper == null) {
      localLooper = Looper.getMainLooper();
    }
    localHandler.<init>(localLooper);
    return localHandler;
  }
  
  public void OooO0Oo() {}
  
  public void Oooo000(View paramView) {}
  
  public void execute(Runnable paramRunnable)
  {
    this.o00OoOoo.postAtFrontOfQueue(paramRunnable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ComponentActivity.ReportFullyDrawnExecutorApi1
 * JD-Core Version:    0.7.0.1
 */