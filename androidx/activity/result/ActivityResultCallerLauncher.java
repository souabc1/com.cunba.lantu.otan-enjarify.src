package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultCallerLauncher
  extends ActivityResultLauncher
{
  public final ActivityResultLauncher OooO00o;
  public final ActivityResultContract OooO0O0;
  public final Object OooO0OO;
  public final Lazy OooO0Oo;
  
  public void OooO0OO()
  {
    this.OooO00o.OooO0OO();
  }
  
  public void OooO0Oo(Unit paramUnit, ActivityOptionsCompat paramActivityOptionsCompat)
  {
    Intrinsics.OooO0o(paramUnit, "input");
    paramUnit = this.OooO00o;
    Object localObject = this.OooO0OO;
    paramUnit.OooO0O0(localObject, paramActivityOptionsCompat);
  }
  
  public final ActivityResultContract getCallerContract()
  {
    return this.OooO0O0;
  }
  
  public final Object getCallerInput()
  {
    return this.OooO0OO;
  }
  
  public ActivityResultContract getContract()
  {
    return getResultContract();
  }
  
  public final ActivityResultLauncher getLauncher()
  {
    return this.OooO00o;
  }
  
  public final ActivityResultContract getResultContract()
  {
    return (ActivityResultContract)this.OooO0Oo.getValue();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResultCallerLauncher
 * JD-Core Version:    0.7.0.1
 */