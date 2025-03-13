package androidx.lifecycle.viewmodel;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class MutableCreationExtras
  extends CreationExtras
{
  public MutableCreationExtras()
  {
    this(null, 1, null);
  }
  
  public MutableCreationExtras(CreationExtras paramCreationExtras)
  {
    Map localMap = getMap$lifecycle_viewmodel_release();
    paramCreationExtras = paramCreationExtras.getMap$lifecycle_viewmodel_release();
    localMap.putAll(paramCreationExtras);
  }
  
  public Object OooO00o(CreationExtras.Key paramKey)
  {
    Intrinsics.OooO0o(paramKey, "key");
    return getMap$lifecycle_viewmodel_release().get(paramKey);
  }
  
  public final void OooO0O0(CreationExtras.Key paramKey, Object paramObject)
  {
    Intrinsics.OooO0o(paramKey, "key");
    getMap$lifecycle_viewmodel_release().put(paramKey, paramObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.viewmodel.MutableCreationExtras
 * JD-Core Version:    0.7.0.1
 */