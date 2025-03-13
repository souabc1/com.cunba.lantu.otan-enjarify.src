package androidx.fragment.app;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import java.util.concurrent.atomic.AtomicReference;

class Fragment$10
  extends ActivityResultLauncher
{
  public Fragment$10(Fragment paramFragment, AtomicReference paramAtomicReference, ActivityResultContract paramActivityResultContract) {}
  
  public void OooO0O0(Object paramObject, ActivityOptionsCompat paramActivityOptionsCompat)
  {
    ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)this.OooO00o.get();
    if (localActivityResultLauncher != null)
    {
      localActivityResultLauncher.OooO0O0(paramObject, paramActivityOptionsCompat);
      return;
    }
    paramObject = new java/lang/IllegalStateException;
    paramObject.<init>("Operation cannot be started before fragment is in created state");
    throw paramObject;
  }
  
  public void OooO0OO()
  {
    ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)this.OooO00o.getAndSet(null);
    if (localActivityResultLauncher != null) {
      localActivityResultLauncher.OooO0OO();
    }
  }
  
  public ActivityResultContract getContract()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.10
 * JD-Core Version:    0.7.0.1
 */