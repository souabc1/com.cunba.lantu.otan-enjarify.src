package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public class ReportFragment
  extends Fragment
{
  public static final ReportFragment.Companion o00Ooo00;
  public ReportFragment.ActivityInitializationListener o00OoOoo;
  
  static
  {
    ReportFragment.Companion localCompanion = new androidx/lifecycle/ReportFragment$Companion;
    localCompanion.<init>(null);
    o00Ooo00 = localCompanion;
  }
  
  public static final void OooO0o0(Activity paramActivity)
  {
    o00Ooo00.OooO0OO(paramActivity);
  }
  
  public final void OooO00o(Lifecycle.Event paramEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j)
    {
      ReportFragment.Companion localCompanion = o00Ooo00;
      Activity localActivity = getActivity();
      String str = "activity";
      Intrinsics.OooO0o0(localActivity, str);
      localCompanion.OooO00o(localActivity, paramEvent);
    }
  }
  
  public final void OooO0O0(ReportFragment.ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.OooO0O0();
    }
  }
  
  public final void OooO0OO(ReportFragment.ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.OooO00o();
    }
  }
  
  public final void OooO0Oo(ReportFragment.ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.onStart();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = this.o00OoOoo;
    OooO0O0(paramBundle);
    paramBundle = Lifecycle.Event.ON_CREATE;
    OooO00o(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Lifecycle.Event localEvent = Lifecycle.Event.ON_DESTROY;
    OooO00o(localEvent);
    this.o00OoOoo = null;
  }
  
  public void onPause()
  {
    super.onPause();
    Lifecycle.Event localEvent = Lifecycle.Event.ON_PAUSE;
    OooO00o(localEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    Object localObject = this.o00OoOoo;
    OooO0OO((ReportFragment.ActivityInitializationListener)localObject);
    localObject = Lifecycle.Event.ON_RESUME;
    OooO00o((Lifecycle.Event)localObject);
  }
  
  public void onStart()
  {
    super.onStart();
    Object localObject = this.o00OoOoo;
    OooO0Oo((ReportFragment.ActivityInitializationListener)localObject);
    localObject = Lifecycle.Event.ON_START;
    OooO00o((Lifecycle.Event)localObject);
  }
  
  public void onStop()
  {
    super.onStop();
    Lifecycle.Event localEvent = Lifecycle.Event.ON_STOP;
    OooO00o(localEvent);
  }
  
  public final void setProcessListener(ReportFragment.ActivityInitializationListener paramActivityInitializationListener)
  {
    this.o00OoOoo = paramActivityInitializationListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ReportFragment
 * JD-Core Version:    0.7.0.1
 */