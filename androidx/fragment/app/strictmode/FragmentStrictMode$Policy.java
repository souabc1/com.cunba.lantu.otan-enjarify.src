package androidx.fragment.app.strictmode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;

public final class FragmentStrictMode$Policy
{
  public static final FragmentStrictMode.Policy.Companion OooO0Oo;
  public static final Policy OooO0o0;
  public final Set OooO00o;
  public final FragmentStrictMode.OnViolationListener OooO0O0;
  public final Map OooO0OO;
  
  static
  {
    Object localObject = new androidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;
    ((FragmentStrictMode.Policy.Companion)localObject).<init>(null);
    OooO0Oo = (FragmentStrictMode.Policy.Companion)localObject;
    localObject = new androidx/fragment/app/strictmode/FragmentStrictMode$Policy;
    Set localSet = SetsKt.OooO0Oo();
    Map localMap = MapsKt.OooO0o();
    ((Policy)localObject).<init>(localSet, null, localMap);
    OooO0o0 = (Policy)localObject;
  }
  
  public FragmentStrictMode$Policy(Set paramSet, FragmentStrictMode.OnViolationListener paramOnViolationListener, Map paramMap)
  {
    this.OooO00o = paramSet;
    this.OooO0O0 = paramOnViolationListener;
    paramSet = new java/util/LinkedHashMap;
    paramSet.<init>();
    paramOnViolationListener = paramMap.entrySet().iterator();
    for (;;)
    {
      boolean bool = paramOnViolationListener.hasNext();
      if (!bool) {
        break;
      }
      paramMap = (Map.Entry)paramOnViolationListener.next();
      str = (String)paramMap.getKey();
      paramMap = (Set)paramMap.getValue();
      paramSet.put(str, paramMap);
    }
    this.OooO0OO = paramSet;
  }
  
  public final Set getFlags$fragment_release()
  {
    return this.OooO00o;
  }
  
  public final FragmentStrictMode.OnViolationListener getListener$fragment_release()
  {
    return this.OooO0O0;
  }
  
  public final Map getMAllowedViolations$fragment_release()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.FragmentStrictMode.Policy
 * JD-Core Version:    0.7.0.1
 */