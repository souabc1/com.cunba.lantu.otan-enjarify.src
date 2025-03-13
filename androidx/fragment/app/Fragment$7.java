package androidx.fragment.app;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;

class Fragment$7
  implements Function
{
  public Fragment$7(Fragment paramFragment) {}
  
  public ActivityResultRegistry OooO00o(Void paramVoid)
  {
    paramVoid = this.OooO00o;
    FragmentHostCallback localFragmentHostCallback = paramVoid.mHost;
    boolean bool = localFragmentHostCallback instanceof ActivityResultRegistryOwner;
    if (bool) {
      return ((ActivityResultRegistryOwner)localFragmentHostCallback).getActivityResultRegistry();
    }
    return paramVoid.requireActivity().getActivityResultRegistry();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.7
 * JD-Core Version:    0.7.0.1
 */