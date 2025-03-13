package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import java.util.ArrayList;
import java.util.Map;

class ActivityResultRegistry$2
  extends ActivityResultLauncher
{
  public ActivityResultRegistry$2(ActivityResultRegistry paramActivityResultRegistry, String paramString, ActivityResultContract paramActivityResultContract) {}
  
  public void OooO0O0(Object paramObject, ActivityOptionsCompat paramActivityOptionsCompat)
  {
    Object localObject1 = this.OooO0OO.OooO0OO;
    Object localObject2 = this.OooO00o;
    localObject1 = (Integer)((Map)localObject1).get(localObject2);
    if (localObject1 != null)
    {
      localObject2 = this.OooO0OO.OooO0o0;
      Object localObject3 = this.OooO00o;
      ((ArrayList)localObject2).add(localObject3);
      try
      {
        localObject2 = this.OooO0OO;
        int i = ((Integer)localObject1).intValue();
        localObject3 = this.OooO0O0;
        ((ActivityResultRegistry)localObject2).OooO0o(i, (ActivityResultContract)localObject3, paramObject, paramActivityOptionsCompat);
        return;
      }
      catch (Exception paramObject)
      {
        paramActivityOptionsCompat = this.OooO0OO.OooO0o0;
        localObject1 = this.OooO00o;
        paramActivityOptionsCompat.remove(localObject1);
        throw paramObject;
      }
    }
    paramActivityOptionsCompat = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
    localObject2 = this.OooO0O0;
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(" and input ");
    ((StringBuilder)localObject1).append(paramObject);
    ((StringBuilder)localObject1).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
    paramObject = ((StringBuilder)localObject1).toString();
    paramActivityOptionsCompat.<init>(paramObject);
    throw paramActivityOptionsCompat;
  }
  
  public void OooO0OO()
  {
    ActivityResultRegistry localActivityResultRegistry = this.OooO0OO;
    String str = this.OooO00o;
    localActivityResultRegistry.OooOO0o(str);
  }
  
  public ActivityResultContract getContract()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.2
 * JD-Core Version:    0.7.0.1
 */