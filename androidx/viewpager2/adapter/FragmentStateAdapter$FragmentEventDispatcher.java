package androidx.viewpager2.adapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class FragmentStateAdapter$FragmentEventDispatcher
{
  public List OooO00o;
  
  public FragmentStateAdapter$FragmentEventDispatcher()
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = new java/util/concurrent/CopyOnWriteArrayList;
    localCopyOnWriteArrayList.<init>();
    this.OooO00o = localCopyOnWriteArrayList;
  }
  
  public List OooO00o(Fragment paramFragment, Lifecycle.State paramState)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener localOnPostEventListener = ((FragmentStateAdapter.FragmentTransactionCallback)localIterator.next()).OooO00o(paramFragment, paramState);
      localArrayList.add(localOnPostEventListener);
    }
    return localArrayList;
  }
  
  public void OooO0O0(List paramList)
  {
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener localOnPostEventListener = (FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener)paramList.next();
      localOnPostEventListener.OooO00o();
    }
  }
  
  public List OooO0OO(Fragment paramFragment)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener localOnPostEventListener = ((FragmentStateAdapter.FragmentTransactionCallback)localIterator.next()).OooO0O0(paramFragment);
      localArrayList.add(localOnPostEventListener);
    }
    return localArrayList;
  }
  
  public List OooO0Oo(Fragment paramFragment)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener localOnPostEventListener = ((FragmentStateAdapter.FragmentTransactionCallback)localIterator.next()).OooO0OO(paramFragment);
      localArrayList.add(localOnPostEventListener);
    }
    return localArrayList;
  }
  
  public List OooO0o0(Fragment paramFragment)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener localOnPostEventListener = ((FragmentStateAdapter.FragmentTransactionCallback)localIterator.next()).OooO0Oo(paramFragment);
      localArrayList.add(localOnPostEventListener);
    }
    return localArrayList;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher
 * JD-Core Version:    0.7.0.1
 */