package androidx.navigation;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

public final class Navigation
{
  public static final Navigation OooO00o;
  
  static
  {
    Navigation localNavigation = new androidx/navigation/Navigation;
    localNavigation.<init>();
    OooO00o = localNavigation;
  }
  
  public static final NavController OooO0O0(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    Object localObject = OooO00o.OooO0OO(paramView);
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" does not have a NavController set");
    paramView = localStringBuilder.toString();
    ((IllegalStateException)localObject).<init>(paramView);
    throw ((Throwable)localObject);
  }
  
  public static final void OooO0o0(View paramView, NavController paramNavController)
  {
    Intrinsics.OooO0o(paramView, "view");
    int i = R.id.nav_controller_view_tag;
    paramView.setTag(i, paramNavController);
  }
  
  public final NavController OooO0OO(View paramView)
  {
    Object localObject = Navigation.findViewNavController.1.o00OoOoo;
    paramView = SequencesKt.OooO0o(paramView, (Function1)localObject);
    localObject = Navigation.findViewNavController.2.o00OoOoo;
    return (NavController)SequencesKt.OooOO0O(SequencesKt.OooOOO(paramView, (Function1)localObject));
  }
  
  public final NavController OooO0Oo(View paramView)
  {
    int i = R.id.nav_controller_view_tag;
    paramView = paramView.getTag(i);
    boolean bool = paramView instanceof WeakReference;
    if (bool) {
      paramView = ((WeakReference)paramView).get();
    }
    do
    {
      paramView = (NavController)paramView;
      break;
      bool = paramView instanceof NavController;
    } while (bool);
    paramView = null;
    return paramView;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.Navigation
 * JD-Core Version:    0.7.0.1
 */