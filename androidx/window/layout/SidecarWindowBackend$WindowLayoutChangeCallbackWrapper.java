package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarWindowBackend$WindowLayoutChangeCallbackWrapper
{
  public final Activity OooO00o;
  public final Executor OooO0O0;
  public final Consumer OooO0OO;
  public WindowLayoutInfo OooO0Oo;
  
  public SidecarWindowBackend$WindowLayoutChangeCallbackWrapper(Activity paramActivity, Executor paramExecutor, Consumer paramConsumer)
  {
    this.OooO00o = paramActivity;
    this.OooO0O0 = paramExecutor;
    this.OooO0OO = paramConsumer;
  }
  
  public static final void OooO0OO(WindowLayoutChangeCallbackWrapper paramWindowLayoutChangeCallbackWrapper, WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramWindowLayoutChangeCallbackWrapper, "this$0");
    Intrinsics.OooO0o(paramWindowLayoutInfo, "$newLayoutInfo");
    paramWindowLayoutChangeCallbackWrapper.OooO0OO.accept(paramWindowLayoutInfo);
  }
  
  public final void OooO0O0(WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramWindowLayoutInfo, "newLayoutInfo");
    this.OooO0Oo = paramWindowLayoutInfo;
    Executor localExecutor = this.OooO0O0;
    OooO0OO localOooO0OO = new androidx/window/layout/OooO0OO;
    localOooO0OO.<init>(this, paramWindowLayoutInfo);
    localExecutor.execute(localOooO0OO);
  }
  
  public final Activity getActivity()
  {
    return this.OooO00o;
  }
  
  public final Consumer getCallback()
  {
    return this.OooO0OO;
  }
  
  public final WindowLayoutInfo getLastInfo()
  {
    return this.OooO0Oo;
  }
  
  public final void setLastInfo(WindowLayoutInfo paramWindowLayoutInfo)
  {
    this.OooO0Oo = paramWindowLayoutInfo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper
 * JD-Core Version:    0.7.0.1
 */