package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class FragmentLifecycleCallbacksDispatcher
{
  public final CopyOnWriteArrayList OooO00o;
  public final FragmentManager OooO0O0;
  
  public FragmentLifecycleCallbacksDispatcher(FragmentManager paramFragmentManager)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = new java/util/concurrent/CopyOnWriteArrayList;
    localCopyOnWriteArrayList.<init>();
    this.OooO00o = localCopyOnWriteArrayList;
    this.OooO0O0 = paramFragmentManager;
  }
  
  public void OooO(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooO00o(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO00o(paramFragment, paramBundle, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO00o(localFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void OooO0O0(Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = this.OooO0O0.getHost().getContext();
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0O0(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0O0(localFragmentManager, paramFragment, localContext);
      }
    }
  }
  
  public void OooO0OO(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0OO(paramFragment, paramBundle, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0OO(localFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void OooO0Oo(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0Oo(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0Oo(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooO0o(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0o(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0o(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooO0o0(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0o0(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0o0(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooO0oO(Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = this.OooO0O0.getHost().getContext();
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0oO(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0oO(localFragmentManager, paramFragment, localContext);
      }
    }
  }
  
  public void OooO0oo(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0oo(paramFragment, paramBundle, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooO0oo(localFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void OooOO0(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOO0(paramFragment, paramBundle, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooOO0(localFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void OooOO0O(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOO0O(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooOO0O(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooOO0o(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOO0o(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooOO0o(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooOOO(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOOO(paramFragment, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooOOO(localFragmentManager, paramFragment);
      }
    }
  }
  
  public void OooOOO0(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject1 = this.OooO0O0.getParent();
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager().getLifecycleCallbacksDispatcher();
      bool1 = true;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOOO0(paramFragment, paramView, paramBundle, bool1);
    }
    localObject1 = this.OooO00o.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)((Iterator)localObject1).next();
      if (paramBoolean)
      {
        boolean bool2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO0O0;
        if (!bool2) {}
      }
      else
      {
        localObject2 = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject2).OooO00o;
        FragmentManager localFragmentManager = this.OooO0O0;
        ((FragmentManager.FragmentLifecycleCallbacks)localObject2).OooOOO0(localFragmentManager, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  public void OooOOOO(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = this.OooO00o;
    FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = new androidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;
    localFragmentLifecycleCallbacksHolder.<init>(paramFragmentLifecycleCallbacks, paramBoolean);
    localCopyOnWriteArrayList.add(localFragmentLifecycleCallbacksHolder);
  }
  
  public void OooOOOo(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    synchronized (this.OooO00o)
    {
      CopyOnWriteArrayList localCopyOnWriteArrayList2 = this.OooO00o;
      int i = localCopyOnWriteArrayList2.size();
      int j = 0;
      while (j < i)
      {
        Object localObject = this.OooO00o;
        localObject = ((CopyOnWriteArrayList)localObject).get(j);
        localObject = (FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject;
        localObject = ((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder)localObject).OooO00o;
        if (localObject == paramFragmentLifecycleCallbacks)
        {
          paramFragmentLifecycleCallbacks = this.OooO00o;
          paramFragmentLifecycleCallbacks.remove(j);
          break;
        }
        j += 1;
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
 * JD-Core Version:    0.7.0.1
 */