package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

class Fragment$9
  extends Fragment.OnPreAttachedListener
{
  public Fragment$9(Fragment paramFragment, Function paramFunction, AtomicReference paramAtomicReference, ActivityResultContract paramActivityResultContract, ActivityResultCallback paramActivityResultCallback)
  {
    super(null);
  }
  
  public void OooO00o()
  {
    Object localObject = this.OooO0o0.generateActivityResultKey();
    ActivityResultRegistry localActivityResultRegistry = (ActivityResultRegistry)this.OooO00o.apply(null);
    AtomicReference localAtomicReference = this.OooO0O0;
    Fragment localFragment = this.OooO0o0;
    ActivityResultContract localActivityResultContract = this.OooO0OO;
    ActivityResultCallback localActivityResultCallback = this.OooO0Oo;
    localObject = localActivityResultRegistry.OooOO0((String)localObject, localFragment, localActivityResultContract, localActivityResultCallback);
    localAtomicReference.set(localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.9
 * JD-Core Version:    0.7.0.1
 */