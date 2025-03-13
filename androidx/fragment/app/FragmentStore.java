package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class FragmentStore
{
  public final ArrayList OooO00o;
  public final HashMap OooO0O0;
  public final HashMap OooO0OO;
  public FragmentManagerViewModel OooO0Oo;
  
  public FragmentStore()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO00o = ((ArrayList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0O0 = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0OO = ((HashMap)localObject);
  }
  
  public Fragment OooO(String paramString)
  {
    Iterator localIterator = this.OooO0O0.values().iterator();
    Object localObject;
    do
    {
      do
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (FragmentStateManager)localIterator.next();
      } while (localObject == null);
      localObject = ((FragmentStateManager)localObject).getFragment().findFragmentByWho(paramString);
    } while (localObject == null);
    return localObject;
    return null;
  }
  
  public void OooO00o(Fragment paramFragment)
  {
    ??? = this.OooO00o;
    boolean bool = ((ArrayList)???).contains(paramFragment);
    if (!bool) {
      synchronized (this.OooO00o)
      {
        localObject2 = this.OooO00o;
        ((ArrayList)localObject2).add(paramFragment);
        paramFragment.mAdded = true;
        return;
      }
    }
    ??? = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Fragment already added: ");
    ((StringBuilder)localObject2).append(paramFragment);
    paramFragment = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)???).<init>(paramFragment);
    throw ((Throwable)???);
  }
  
  public void OooO0O0()
  {
    Collection localCollection = this.OooO0O0.values();
    Set localSet = Collections.singleton(null);
    localCollection.removeAll(localSet);
  }
  
  public boolean OooO0OO(String paramString)
  {
    HashMap localHashMap = this.OooO0O0;
    paramString = localHashMap.get(paramString);
    boolean bool;
    if (paramString != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramString = null;
    }
    return bool;
  }
  
  public void OooO0Oo(int paramInt)
  {
    Iterator localIterator = this.OooO0O0.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      if (localFragmentStateManager != null) {
        localFragmentStateManager.setFragmentManagerState(paramInt);
      }
    }
  }
  
  public Fragment OooO0o(String paramString)
  {
    HashMap localHashMap = this.OooO0O0;
    paramString = (FragmentStateManager)localHashMap.get(paramString);
    if (paramString != null) {
      return paramString.getFragment();
    }
    return null;
  }
  
  public void OooO0o0(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = this.OooO0O0;
    boolean bool1 = ((HashMap)localObject2).isEmpty();
    if (!bool1)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      localObject2 = this.OooO0O0.values().iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        Object localObject3 = (FragmentStateManager)((Iterator)localObject2).next();
        paramPrintWriter.print(paramString);
        if (localObject3 != null)
        {
          localObject3 = ((FragmentStateManager)localObject3).getFragment();
          paramPrintWriter.println(localObject3);
          ((Fragment)localObject3).dump((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
        else
        {
          localObject3 = "null";
          paramPrintWriter.println((String)localObject3);
        }
      }
    }
    paramFileDescriptor = this.OooO00o;
    int i = paramFileDescriptor.size();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      int j = 0;
      paramArrayOfString = null;
      while (j < i)
      {
        localObject1 = (Fragment)this.OooO00o.get(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(j);
        localObject2 = ": ";
        paramPrintWriter.print((String)localObject2);
        localObject1 = ((Fragment)localObject1).toString();
        paramPrintWriter.println((String)localObject1);
        j += 1;
      }
    }
  }
  
  public Fragment OooO0oO(int paramInt)
  {
    Object localObject1 = this.OooO00o;
    int i = ((ArrayList)localObject1).size() + -1;
    Object localObject2;
    int j;
    while (i >= 0)
    {
      localObject2 = (Fragment)this.OooO00o.get(i);
      if (localObject2 != null)
      {
        j = ((Fragment)localObject2).mFragmentId;
        if (j == paramInt) {
          return localObject2;
        }
      }
      i += -1;
    }
    localObject1 = this.OooO0O0.values().iterator();
    do
    {
      do
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (FragmentStateManager)((Iterator)localObject1).next();
      } while (localObject2 == null);
      localObject2 = ((FragmentStateManager)localObject2).getFragment();
      j = ((Fragment)localObject2).mFragmentId;
    } while (j != paramInt);
    return localObject2;
    return null;
  }
  
  public Fragment OooO0oo(String paramString)
  {
    Object localObject1;
    Object localObject2;
    String str;
    boolean bool1;
    if (paramString != null)
    {
      localObject1 = this.OooO00o;
      int i = ((ArrayList)localObject1).size() + -1;
      while (i >= 0)
      {
        localObject2 = (Fragment)this.OooO00o.get(i);
        if (localObject2 != null)
        {
          str = ((Fragment)localObject2).mTag;
          bool1 = paramString.equals(str);
          if (bool1) {
            return localObject2;
          }
        }
        i += -1;
      }
    }
    if (paramString != null)
    {
      localObject1 = this.OooO0O0.values().iterator();
      do
      {
        do
        {
          boolean bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (FragmentStateManager)((Iterator)localObject1).next();
        } while (localObject2 == null);
        localObject2 = ((FragmentStateManager)localObject2).getFragment();
        str = ((Fragment)localObject2).mTag;
        bool1 = paramString.equals(str);
      } while (!bool1);
      return localObject2;
    }
    return null;
  }
  
  public int OooOO0(Fragment paramFragment)
  {
    ViewGroup localViewGroup1 = paramFragment.mContainer;
    int i = -1;
    if (localViewGroup1 == null) {
      return i;
    }
    Object localObject1 = this.OooO00o;
    int j = ((ArrayList)localObject1).indexOf(paramFragment);
    int k = j + -1;
    Object localObject2;
    while (k >= 0)
    {
      localObject2 = (Fragment)this.OooO00o.get(k);
      ViewGroup localViewGroup2 = ((Fragment)localObject2).mContainer;
      if (localViewGroup2 == localViewGroup1)
      {
        localObject2 = ((Fragment)localObject2).mView;
        if (localObject2 != null) {
          return localViewGroup1.indexOfChild((View)localObject2) + 1;
        }
      }
      k += -1;
    }
    for (;;)
    {
      j += 1;
      localObject1 = this.OooO00o;
      k = ((ArrayList)localObject1).size();
      if (j >= k) {
        break;
      }
      localObject1 = (Fragment)this.OooO00o.get(j);
      localObject2 = ((Fragment)localObject1).mContainer;
      if (localObject2 == localViewGroup1)
      {
        localObject1 = ((Fragment)localObject1).mView;
        if (localObject1 != null) {
          return localViewGroup1.indexOfChild((View)localObject1);
        }
      }
    }
    return i;
  }
  
  public FragmentStateManager OooOO0O(String paramString)
  {
    return (FragmentStateManager)this.OooO0O0.get(paramString);
  }
  
  public Bundle OooOO0o(String paramString)
  {
    return (Bundle)this.OooO0OO.get(paramString);
  }
  
  public void OooOOO(FragmentStateManager paramFragmentStateManager)
  {
    Fragment localFragment = paramFragmentStateManager.getFragment();
    boolean bool1 = localFragment.mRetainInstance;
    if (bool1)
    {
      localObject = this.OooO0Oo;
      ((FragmentManagerViewModel)localObject).OooOOOO(localFragment);
    }
    Object localObject = this.OooO0O0;
    String str = localFragment.mWho;
    localObject = ((HashMap)localObject).get(str);
    if (localObject != paramFragmentStateManager) {
      return;
    }
    paramFragmentStateManager = this.OooO0O0;
    localObject = localFragment.mWho;
    str = null;
    paramFragmentStateManager = (FragmentStateManager)paramFragmentStateManager.put(localObject, null);
    if (paramFragmentStateManager == null) {
      return;
    }
    boolean bool2 = FragmentManager.isLoggingEnabled(2);
    if (bool2)
    {
      paramFragmentStateManager = new java/lang/StringBuilder;
      paramFragmentStateManager.<init>();
      localObject = "Removed fragment from active set ";
      paramFragmentStateManager.append((String)localObject);
      paramFragmentStateManager.append(localFragment);
    }
  }
  
  public void OooOOO0(FragmentStateManager paramFragmentStateManager)
  {
    Fragment localFragment = paramFragmentStateManager.getFragment();
    Object localObject = localFragment.mWho;
    boolean bool1 = OooO0OO((String)localObject);
    if (bool1) {
      return;
    }
    localObject = this.OooO0O0;
    String str = localFragment.mWho;
    ((HashMap)localObject).put(str, paramFragmentStateManager);
    boolean bool2 = localFragment.mRetainInstanceChangedWhileDetached;
    if (bool2)
    {
      bool2 = localFragment.mRetainInstance;
      if (bool2)
      {
        paramFragmentStateManager = this.OooO0Oo;
        paramFragmentStateManager.OooO0oO(localFragment);
      }
      else
      {
        paramFragmentStateManager = this.OooO0Oo;
        paramFragmentStateManager.OooOOOO(localFragment);
      }
      bool2 = false;
      paramFragmentStateManager = null;
      localFragment.mRetainInstanceChangedWhileDetached = false;
    }
    bool2 = FragmentManager.isLoggingEnabled(2);
    if (bool2)
    {
      paramFragmentStateManager = new java/lang/StringBuilder;
      paramFragmentStateManager.<init>();
      localObject = "Added fragment to active set ";
      paramFragmentStateManager.append((String)localObject);
      paramFragmentStateManager.append(localFragment);
    }
  }
  
  public void OooOOOO()
  {
    Iterator localIterator = this.OooO00o.iterator();
    boolean bool1;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Fragment)localIterator.next();
      localObject2 = this.OooO0O0;
      localObject1 = ((Fragment)localObject1).mWho;
      localObject1 = (FragmentStateManager)((HashMap)localObject2).get(localObject1);
      if (localObject1 != null) {
        ((FragmentStateManager)localObject1).OooOO0o();
      }
    }
    localIterator = this.OooO0O0.values().iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (FragmentStateManager)localIterator.next();
      if (localObject1 != null)
      {
        ((FragmentStateManager)localObject1).OooOO0o();
        localObject2 = ((FragmentStateManager)localObject1).getFragment();
        boolean bool2 = ((Fragment)localObject2).mRemoving;
        if (bool2)
        {
          bool2 = ((Fragment)localObject2).isInBackStack();
          if (!bool2)
          {
            bool2 = true;
            break label145;
          }
        }
        bool2 = false;
        Object localObject3 = null;
        label145:
        if (bool2)
        {
          bool2 = ((Fragment)localObject2).mBeingSaved;
          if (bool2)
          {
            localObject3 = this.OooO0OO;
            String str = ((Fragment)localObject2).mWho;
            bool2 = ((HashMap)localObject3).containsKey(str);
            if (!bool2)
            {
              localObject2 = ((Fragment)localObject2).mWho;
              localObject3 = ((FragmentStateManager)localObject1).OooOOo0();
              OooOo0O((String)localObject2, (Bundle)localObject3);
            }
          }
          OooOOO((FragmentStateManager)localObject1);
        }
      }
    }
  }
  
  public void OooOOOo(Fragment paramFragment)
  {
    synchronized (this.OooO00o)
    {
      ArrayList localArrayList2 = this.OooO00o;
      localArrayList2.remove(paramFragment);
      paramFragment.mAdded = false;
      return;
    }
  }
  
  public void OooOOo(List paramList)
  {
    Object localObject1 = this.OooO00o;
    ((ArrayList)localObject1).clear();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      for (;;)
      {
        boolean bool1 = paramList.hasNext();
        if (!bool1) {
          return;
        }
        localObject1 = (String)paramList.next();
        localObject2 = OooO0o((String)localObject1);
        if (localObject2 == null) {
          break;
        }
        boolean bool2 = FragmentManager.isLoggingEnabled(2);
        if (bool2)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "restoreSaveState: added (";
          localStringBuilder.append(str);
          localStringBuilder.append((String)localObject1);
          localObject1 = "): ";
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append(localObject2);
        }
        OooO00o((Fragment)localObject2);
      }
      paramList = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("No instantiated fragment for (");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(")");
      localObject1 = ((StringBuilder)localObject2).toString();
      paramList.<init>((String)localObject1);
      throw paramList;
    }
  }
  
  public void OooOOo0()
  {
    this.OooO0O0.clear();
  }
  
  public void OooOOoo(HashMap paramHashMap)
  {
    this.OooO0OO.clear();
    this.OooO0OO.putAll(paramHashMap);
  }
  
  public ArrayList OooOo0()
  {
    synchronized (this.OooO00o)
    {
      ArrayList localArrayList2 = this.OooO00o;
      boolean bool1 = localArrayList2.isEmpty();
      if (bool1) {
        return null;
      }
      localArrayList2 = new java/util/ArrayList;
      Object localObject2 = this.OooO00o;
      int i = ((ArrayList)localObject2).size();
      localArrayList2.<init>(i);
      localObject2 = this.OooO00o;
      localObject2 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        Object localObject3 = ((Iterator)localObject2).next();
        localObject3 = (Fragment)localObject3;
        Object localObject4 = ((Fragment)localObject3).mWho;
        localArrayList2.add(localObject4);
        int j = 2;
        boolean bool3 = FragmentManager.isLoggingEnabled(j);
        if (bool3)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str = "saveAllState: adding fragment (";
          ((StringBuilder)localObject4).append(str);
          str = ((Fragment)localObject3).mWho;
          ((StringBuilder)localObject4).append(str);
          str = "): ";
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append(localObject3);
        }
      }
      return localArrayList2;
    }
  }
  
  public ArrayList OooOo00()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.OooO0O0.size();
    localArrayList.<init>(i);
    Iterator localIterator = this.OooO0O0.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = (FragmentStateManager)localIterator.next();
      if (localObject1 != null)
      {
        Object localObject2 = ((FragmentStateManager)localObject1).getFragment();
        String str = ((Fragment)localObject2).mWho;
        localObject1 = ((FragmentStateManager)localObject1).OooOOo0();
        OooOo0O(str, (Bundle)localObject1);
        localObject1 = ((Fragment)localObject2).mWho;
        localArrayList.add(localObject1);
        bool = FragmentManager.isLoggingEnabled(2);
        if (bool)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Saved state of ");
          ((StringBuilder)localObject1).append(localObject2);
          str = ": ";
          ((StringBuilder)localObject1).append(str);
          localObject2 = ((Fragment)localObject2).mSavedFragmentState;
          ((StringBuilder)localObject1).append(localObject2);
        }
      }
    }
    return localArrayList;
  }
  
  public Bundle OooOo0O(String paramString, Bundle paramBundle)
  {
    HashMap localHashMap;
    if (paramBundle != null) {
      localHashMap = this.OooO0OO;
    }
    for (paramString = localHashMap.put(paramString, paramBundle);; paramString = paramBundle.remove(paramString))
    {
      return (Bundle)paramString;
      paramBundle = this.OooO0OO;
    }
  }
  
  public int getActiveFragmentCount()
  {
    return this.OooO0O0.size();
  }
  
  public List getActiveFragmentStateManagers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO0O0.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      if (localFragmentStateManager != null) {
        localArrayList.add(localFragmentStateManager);
      }
    }
    return localArrayList;
  }
  
  public List getActiveFragments()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO0O0.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (FragmentStateManager)localIterator.next();
      if (localObject != null)
      {
        localObject = ((FragmentStateManager)localObject).getFragment();
      }
      else
      {
        bool = false;
        localObject = null;
      }
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  public HashMap getAllSavedState()
  {
    return this.OooO0OO;
  }
  
  public List getFragments()
  {
    ??? = this.OooO00o;
    boolean bool = ???.isEmpty();
    if (bool) {
      return Collections.emptyList();
    }
    synchronized (this.OooO00o)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      ArrayList localArrayList3 = this.OooO00o;
      localArrayList2.<init>(localArrayList3);
      return localArrayList2;
    }
  }
  
  public FragmentManagerViewModel getNonConfig()
  {
    return this.OooO0Oo;
  }
  
  public void setNonConfig(FragmentManagerViewModel paramFragmentManagerViewModel)
  {
    this.OooO0Oo = paramFragmentManagerViewModel;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentStore
 * JD-Core Version:    0.7.0.1
 */