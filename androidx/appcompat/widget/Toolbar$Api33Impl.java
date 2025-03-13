package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

class Toolbar$Api33Impl
{
  public static OnBackInvokedDispatcher OooO00o(View paramView)
  {
    return paramView.findOnBackInvokedDispatcher();
  }
  
  public static OnBackInvokedCallback OooO0O0(Runnable paramRunnable)
  {
    Objects.requireNonNull(paramRunnable);
    OooOOO localOooOOO = new androidx/appcompat/widget/OooOOO;
    localOooOOO.<init>(paramRunnable);
    return localOooOOO;
  }
  
  public static void OooO0OO(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (OnBackInvokedDispatcher)paramObject1;
    paramObject2 = (OnBackInvokedCallback)paramObject2;
    paramObject1.registerOnBackInvokedCallback(1000000, paramObject2);
  }
  
  public static void OooO0Oo(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (OnBackInvokedDispatcher)paramObject1;
    paramObject2 = (OnBackInvokedCallback)paramObject2;
    paramObject1.unregisterOnBackInvokedCallback(paramObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.Api33Impl
 * JD-Core Version:    0.7.0.1
 */