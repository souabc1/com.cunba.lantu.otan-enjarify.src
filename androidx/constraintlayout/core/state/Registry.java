package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

public class Registry
{
  public static final Registry OooO0O0;
  public HashMap OooO00o;
  
  static
  {
    Registry localRegistry = new androidx/constraintlayout/core/state/Registry;
    localRegistry.<init>();
    OooO0O0 = localRegistry;
  }
  
  public Registry()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public static Registry getInstance()
  {
    return OooO0O0;
  }
  
  public Set getLayoutList()
  {
    return this.OooO00o.keySet();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.Registry
 * JD-Core Version:    0.7.0.1
 */