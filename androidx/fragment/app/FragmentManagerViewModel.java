package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class FragmentManagerViewModel
  extends ViewModel
{
  public static final ViewModelProvider.Factory OooOO0O;
  public boolean OooO;
  public final HashMap OooO0Oo;
  public final HashMap OooO0o;
  public final HashMap OooO0o0;
  public final boolean OooO0oO;
  public boolean OooO0oo;
  public boolean OooOO0;
  
  static
  {
    FragmentManagerViewModel.1 local1 = new androidx/fragment/app/FragmentManagerViewModel$1;
    local1.<init>();
    OooOO0O = local1;
  }
  
  public FragmentManagerViewModel(boolean paramBoolean)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0Oo = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o0 = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o = localHashMap;
    this.OooO0oo = false;
    this.OooO = false;
    this.OooOO0 = false;
    this.OooO0oO = paramBoolean;
  }
  
  public static FragmentManagerViewModel OooOOO0(ViewModelStore paramViewModelStore)
  {
    ViewModelProvider localViewModelProvider = new androidx/lifecycle/ViewModelProvider;
    ViewModelProvider.Factory localFactory = OooOO0O;
    localViewModelProvider.<init>(paramViewModelStore, localFactory);
    return (FragmentManagerViewModel)localViewModelProvider.OooO00o(FragmentManagerViewModel.class);
  }
  
  public void OooO(String paramString)
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Clearing non-config state for saved state of Fragment ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
    }
    OooOO0(paramString);
  }
  
  public void OooO0o0()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "onCleared called for ";
      localStringBuilder.append(str);
      localStringBuilder.append(this);
    }
    this.OooO0oo = true;
  }
  
  public void OooO0oO(Fragment paramFragment)
  {
    boolean bool = this.OooOO0;
    int i = 2;
    if (bool)
    {
      FragmentManager.isLoggingEnabled(i);
      return;
    }
    Object localObject = this.OooO0Oo;
    String str1 = paramFragment.mWho;
    bool = ((HashMap)localObject).containsKey(str1);
    if (bool) {
      return;
    }
    localObject = this.OooO0Oo;
    str1 = paramFragment.mWho;
    ((HashMap)localObject).put(str1, paramFragment);
    bool = FragmentManager.isLoggingEnabled(i);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "Updating retained Fragments: Added ";
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append(paramFragment);
    }
  }
  
  public void OooO0oo(Fragment paramFragment)
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Clearing non-config state for ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramFragment);
    }
    paramFragment = paramFragment.mWho;
    OooOO0(paramFragment);
  }
  
  public final void OooOO0(String paramString)
  {
    Object localObject = (FragmentManagerViewModel)this.OooO0o0.get(paramString);
    if (localObject != null)
    {
      ((FragmentManagerViewModel)localObject).OooO0o0();
      localObject = this.OooO0o0;
      ((HashMap)localObject).remove(paramString);
    }
    localObject = (ViewModelStore)this.OooO0o.get(paramString);
    if (localObject != null)
    {
      ((ViewModelStore)localObject).OooO00o();
      localObject = this.OooO0o;
      ((HashMap)localObject).remove(paramString);
    }
  }
  
  public Fragment OooOO0O(String paramString)
  {
    return (Fragment)this.OooO0Oo.get(paramString);
  }
  
  public FragmentManagerViewModel OooOO0o(Fragment paramFragment)
  {
    Object localObject1 = this.OooO0o0;
    Object localObject2 = paramFragment.mWho;
    localObject1 = (FragmentManagerViewModel)((HashMap)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = new androidx/fragment/app/FragmentManagerViewModel;
      boolean bool = this.OooO0oO;
      ((FragmentManagerViewModel)localObject1).<init>(bool);
      localObject2 = this.OooO0o0;
      paramFragment = paramFragment.mWho;
      ((HashMap)localObject2).put(paramFragment, localObject1);
    }
    return localObject1;
  }
  
  public ViewModelStore OooOOO(Fragment paramFragment)
  {
    Object localObject1 = this.OooO0o;
    Object localObject2 = paramFragment.mWho;
    localObject1 = (ViewModelStore)((HashMap)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = new androidx/lifecycle/ViewModelStore;
      ((ViewModelStore)localObject1).<init>();
      localObject2 = this.OooO0o;
      paramFragment = paramFragment.mWho;
      ((HashMap)localObject2).put(paramFragment, localObject1);
    }
    return localObject1;
  }
  
  public void OooOOOO(Fragment paramFragment)
  {
    boolean bool = this.OooOO0;
    int i = 2;
    if (bool)
    {
      FragmentManager.isLoggingEnabled(i);
      return;
    }
    Object localObject = this.OooO0Oo;
    String str1 = paramFragment.mWho;
    localObject = ((HashMap)localObject).remove(str1);
    if (localObject != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localObject = null;
    }
    if (bool)
    {
      bool = FragmentManager.isLoggingEnabled(i);
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str2 = "Updating retained Fragments: Removed ";
        ((StringBuilder)localObject).append(str2);
        ((StringBuilder)localObject).append(paramFragment);
      }
    }
  }
  
  public boolean OooOOOo(Fragment paramFragment)
  {
    HashMap localHashMap = this.OooO0Oo;
    paramFragment = paramFragment.mWho;
    boolean bool1 = localHashMap.containsKey(paramFragment);
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    bool1 = this.OooO0oO;
    if (bool1) {
      return this.OooO0oo;
    }
    return this.OooO ^ bool2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      Object localObject1 = FragmentManagerViewModel.class;
      Object localObject2 = paramObject.getClass();
      if (localObject1 == localObject2)
      {
        paramObject = (FragmentManagerViewModel)paramObject;
        localObject1 = this.OooO0Oo;
        localObject2 = paramObject.OooO0Oo;
        boolean bool2 = localObject1.equals(localObject2);
        if (bool2)
        {
          localObject1 = this.OooO0o0;
          localObject2 = paramObject.OooO0o0;
          bool2 = localObject1.equals(localObject2);
          if (bool2)
          {
            localObject1 = this.OooO0o;
            paramObject = paramObject.OooO0o;
            boolean bool3 = localObject1.equals(paramObject);
            if (bool3) {
              break label111;
            }
          }
        }
        bool1 = false;
        label111:
        return bool1;
      }
    }
    return false;
  }
  
  public Collection getRetainedFragments()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Collection localCollection = this.OooO0Oo.values();
    localArrayList.<init>(localCollection);
    return localArrayList;
  }
  
  public FragmentManagerNonConfig getSnapshot()
  {
    HashMap localHashMap = this.OooO0Oo;
    boolean bool1 = localHashMap.isEmpty();
    FragmentManagerNonConfig localFragmentManagerNonConfig = null;
    if (bool1)
    {
      localHashMap = this.OooO0o0;
      bool1 = localHashMap.isEmpty();
      if (bool1)
      {
        localHashMap = this.OooO0o;
        bool1 = localHashMap.isEmpty();
        if (bool1) {
          return null;
        }
      }
    }
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.OooO0o0.entrySet().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = ((FragmentManagerViewModel)((Map.Entry)localObject2).getValue()).getSnapshot();
      if (localObject3 != null)
      {
        localObject2 = (String)((Map.Entry)localObject2).getKey();
        localHashMap.put(localObject2, localObject3);
      }
    }
    this.OooO = true;
    localObject1 = this.OooO0Oo;
    boolean bool3 = ((HashMap)localObject1).isEmpty();
    if (bool3)
    {
      bool3 = localHashMap.isEmpty();
      if (bool3)
      {
        localObject1 = this.OooO0o;
        bool3 = ((HashMap)localObject1).isEmpty();
        if (bool3) {
          return null;
        }
      }
    }
    localFragmentManagerNonConfig = new androidx/fragment/app/FragmentManagerNonConfig;
    localObject1 = new java/util/ArrayList;
    Object localObject2 = this.OooO0Oo.values();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    localObject2 = new java/util/HashMap;
    Object localObject3 = this.OooO0o;
    ((HashMap)localObject2).<init>((Map)localObject3);
    localFragmentManagerNonConfig.<init>((Collection)localObject1, localHashMap, (Map)localObject2);
    return localFragmentManagerNonConfig;
  }
  
  public int hashCode()
  {
    int i = this.OooO0Oo.hashCode() * 31;
    int j = this.OooO0o0.hashCode();
    i = (i + j) * 31;
    j = this.OooO0o.hashCode();
    return i + j;
  }
  
  public boolean isCleared()
  {
    return this.OooO0oo;
  }
  
  public void setIsStateSaved(boolean paramBoolean)
  {
    this.OooOO0 = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("FragmentManagerViewModel{");
    int i = System.identityHashCode(this);
    Object localObject1 = Integer.toHexString(i);
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("} Fragments (");
    localObject1 = this.OooO0Oo.values().iterator();
    boolean bool;
    String str;
    Object localObject2;
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      str = ", ";
      if (!bool) {
        break;
      }
      localObject2 = ((Iterator)localObject1).next();
      localStringBuilder.append(localObject2);
      bool = ((Iterator)localObject1).hasNext();
      if (bool) {
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append(") Child Non Config (");
    localObject1 = this.OooO0o0.keySet().iterator();
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuilder.append((String)localObject2);
      bool = ((Iterator)localObject1).hasNext();
      if (bool) {
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append(") ViewModelStores (");
    localObject1 = this.OooO0o.keySet().iterator();
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuilder.append((String)localObject2);
      bool = ((Iterator)localObject1).hasNext();
      if (bool) {
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManagerViewModel
 * JD-Core Version:    0.7.0.1
 */