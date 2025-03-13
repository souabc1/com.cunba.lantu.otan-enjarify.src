package androidx.navigation.fragment;

import android.app.Dialog;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

public final class NavHostFragment$Companion
{
  public final NavHostFragment OooO00o(int paramInt, Bundle paramBundle)
  {
    Object localObject1;
    if (paramInt != 0)
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      String str = "android-support-nav:fragment:graphId";
      ((BaseBundle)localObject1).putInt(str, paramInt);
    }
    else
    {
      localObject1 = null;
    }
    if (paramBundle != null)
    {
      if (localObject1 == null)
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        localObject1 = localObject2;
      }
      localObject2 = "android-support-nav:fragment:startDestinationArgs";
      ((Bundle)localObject1).putBundle((String)localObject2, paramBundle);
    }
    Object localObject2 = new androidx/navigation/fragment/NavHostFragment;
    ((NavHostFragment)localObject2).<init>();
    if (localObject1 != null) {
      ((Fragment)localObject2).setArguments((Bundle)localObject1);
    }
    return localObject2;
  }
  
  public final NavController OooO0OO(Fragment paramFragment)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    for (Object localObject1 = paramFragment; localObject1 != null; localObject1 = ((Fragment)localObject1).getParentFragment())
    {
      bool1 = localObject1 instanceof NavHostFragment;
      if (bool1) {
        return ((NavHostFragment)localObject1).getNavHostController$navigation_fragment_release();
      }
      localObject2 = ((Fragment)localObject1).getParentFragmentManager().getPrimaryNavigationFragment();
      boolean bool2 = localObject2 instanceof NavHostFragment;
      if (bool2) {
        return ((NavHostFragment)localObject2).getNavHostController$navigation_fragment_release();
      }
    }
    localObject1 = paramFragment.getView();
    if (localObject1 != null) {
      return Navigation.OooO0O0((View)localObject1);
    }
    boolean bool3 = paramFragment instanceof DialogFragment;
    boolean bool1 = false;
    Object localObject2 = null;
    if (bool3)
    {
      localObject1 = paramFragment;
      localObject1 = (DialogFragment)paramFragment;
    }
    else
    {
      bool3 = false;
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      localObject1 = ((DialogFragment)localObject1).getDialog();
      if (localObject1 != null)
      {
        localObject1 = ((Dialog)localObject1).getWindow();
        if (localObject1 != null) {
          localObject2 = ((Window)localObject1).getDecorView();
        }
      }
    }
    if (localObject2 != null) {
      return Navigation.OooO0O0((View)localObject2);
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Fragment ");
    ((StringBuilder)localObject2).append(paramFragment);
    ((StringBuilder)localObject2).append(" does not have a NavController set");
    paramFragment = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>(paramFragment);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.fragment.NavHostFragment.Companion
 * JD-Core Version:    0.7.0.1
 */