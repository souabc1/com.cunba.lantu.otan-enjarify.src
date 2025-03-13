package androidx.lifecycle;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class ViewModelStore
{
  public final Map OooO00o;
  
  public ViewModelStore()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    this.OooO00o = localLinkedHashMap;
  }
  
  public final void OooO00o()
  {
    Iterator localIterator = this.OooO00o.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ViewModel localViewModel = (ViewModel)localIterator.next();
      localViewModel.OooO0O0();
    }
    this.OooO00o.clear();
  }
  
  public final ViewModel OooO0O0(String paramString)
  {
    Intrinsics.OooO0o(paramString, "key");
    return (ViewModel)this.OooO00o.get(paramString);
  }
  
  public final Set OooO0OO()
  {
    HashSet localHashSet = new java/util/HashSet;
    Set localSet = this.OooO00o.keySet();
    localHashSet.<init>(localSet);
    return localHashSet;
  }
  
  public final void OooO0Oo(String paramString, ViewModel paramViewModel)
  {
    Intrinsics.OooO0o(paramString, "key");
    Intrinsics.OooO0o(paramViewModel, "viewModel");
    Map localMap = this.OooO00o;
    paramString = (ViewModel)localMap.put(paramString, paramViewModel);
    if (paramString != null) {
      paramString.OooO0o0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelStore
 * JD-Core Version:    0.7.0.1
 */