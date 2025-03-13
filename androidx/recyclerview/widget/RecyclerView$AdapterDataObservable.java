package androidx.recyclerview.widget;

import android.database.Observable;
import java.util.ArrayList;

class RecyclerView$AdapterDataObservable
  extends Observable
{
  public boolean OooO00o()
  {
    return this.mObservers.isEmpty() ^ true;
  }
  
  public void OooO0O0()
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onChanged();
      i += -1;
    }
  }
  
  public void OooO0OO(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size();
    int j = 1;
    i -= j;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onItemRangeMoved(paramInt1, paramInt2, j);
      i += -1;
    }
  }
  
  public void OooO0Oo(int paramInt1, int paramInt2)
  {
    OooO0o0(paramInt1, paramInt2, null);
  }
  
  public void OooO0o(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onItemRangeInserted(paramInt1, paramInt2);
      i += -1;
    }
  }
  
  public void OooO0o0(int paramInt1, int paramInt2, Object paramObject)
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onItemRangeChanged(paramInt1, paramInt2, paramObject);
      i += -1;
    }
  }
  
  public void OooO0oO(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onItemRangeRemoved(paramInt1, paramInt2);
      i += -1;
    }
  }
  
  public void OooO0oo()
  {
    ArrayList localArrayList = this.mObservers;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.AdapterDataObserver localAdapterDataObserver = (RecyclerView.AdapterDataObserver)this.mObservers.get(i);
      localAdapterDataObserver.onStateRestorationPolicyChanged();
      i += -1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.AdapterDataObservable
 * JD-Core Version:    0.7.0.1
 */