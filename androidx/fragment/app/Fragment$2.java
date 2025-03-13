package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.savedstate.SavedStateRegistryController;

class Fragment$2
  extends Fragment.OnPreAttachedListener
{
  public Fragment$2(Fragment paramFragment)
  {
    super(null);
  }
  
  public void OooO00o()
  {
    this.OooO00o.mSavedStateRegistryController.OooO0O0();
    SavedStateHandleSupport.OooO0OO(this.OooO00o);
    Bundle localBundle = this.OooO00o.mSavedFragmentState;
    if (localBundle != null)
    {
      String str = "registryState";
      localBundle = localBundle.getBundle(str);
    }
    else
    {
      localBundle = null;
    }
    this.OooO00o.mSavedStateRegistryController.OooO0OO(localBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.2
 * JD-Core Version:    0.7.0.1
 */