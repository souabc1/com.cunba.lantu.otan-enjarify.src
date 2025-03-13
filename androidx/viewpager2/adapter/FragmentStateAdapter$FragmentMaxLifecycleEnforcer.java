package androidx.viewpager2.adapter;

import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class FragmentStateAdapter$FragmentMaxLifecycleEnforcer
{
  public ViewPager2.OnPageChangeCallback OooO00o;
  public RecyclerView.AdapterDataObserver OooO0O0;
  public LifecycleEventObserver OooO0OO;
  public ViewPager2 OooO0Oo;
  public long OooO0o0 = -1;
  
  public FragmentStateAdapter$FragmentMaxLifecycleEnforcer(FragmentStateAdapter paramFragmentStateAdapter) {}
  
  public final ViewPager2 OooO00o(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = paramRecyclerView.getParent();
    boolean bool = paramRecyclerView instanceof ViewPager2;
    if (bool) {
      return (ViewPager2)paramRecyclerView;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Expected ViewPager2 instance. Got: ");
    localStringBuilder.append(paramRecyclerView);
    paramRecyclerView = localStringBuilder.toString();
    localIllegalStateException.<init>(paramRecyclerView);
    throw localIllegalStateException;
  }
  
  public void OooO0O0(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = OooO00o(paramRecyclerView);
    this.OooO0Oo = paramRecyclerView;
    paramRecyclerView = new androidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1;
    paramRecyclerView.<init>(this);
    this.OooO00o = paramRecyclerView;
    this.OooO0Oo.OooO0O0(paramRecyclerView);
    paramRecyclerView = new androidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2;
    paramRecyclerView.<init>(this);
    this.OooO0O0 = paramRecyclerView;
    this.OooO0o.registerAdapterDataObserver(paramRecyclerView);
    paramRecyclerView = new androidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
    paramRecyclerView.<init>(this);
    this.OooO0OO = paramRecyclerView;
    this.OooO0o.o00OoOoo.OooO00o(paramRecyclerView);
  }
  
  public void OooO0OO(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = OooO00o(paramRecyclerView);
    Object localObject = this.OooO00o;
    paramRecyclerView.OooO0o((ViewPager2.OnPageChangeCallback)localObject);
    paramRecyclerView = this.OooO0o;
    localObject = this.OooO0O0;
    paramRecyclerView.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject);
    paramRecyclerView = this.OooO0o.o00OoOoo;
    localObject = this.OooO0OO;
    paramRecyclerView.OooO0O0((LifecycleObserver)localObject);
    this.OooO0Oo = null;
  }
  
  public void OooO0Oo(boolean paramBoolean)
  {
    Object localObject1 = this.OooO0o;
    boolean bool1 = ((FragmentStateAdapter)localObject1).OooOoOO();
    if (bool1) {
      return;
    }
    localObject1 = this.OooO0Oo;
    int i = ((ViewPager2)localObject1).getScrollState();
    if (i != 0) {
      return;
    }
    localObject1 = this.OooO0o.o00Ooo0;
    boolean bool2 = ((LongSparseArray)localObject1).isEmpty();
    if (!bool2)
    {
      localObject1 = this.OooO0o;
      int j = ((RecyclerView.Adapter)localObject1).getItemCount();
      if (j != 0)
      {
        localObject1 = this.OooO0Oo;
        j = ((ViewPager2)localObject1).getCurrentItem();
        Object localObject2 = this.OooO0o;
        int k = ((RecyclerView.Adapter)localObject2).getItemCount();
        if (j >= k) {
          return;
        }
        localObject2 = this.OooO0o;
        long l1 = ((FragmentStateAdapter)localObject2).getItemId(j);
        long l2 = this.OooO0o0;
        boolean bool5 = l1 < l2;
        if ((!bool5) && (!paramBoolean)) {
          return;
        }
        Object localObject3 = (Fragment)this.OooO0o.o00Ooo0.OooO0oo(l1);
        if (localObject3 != null)
        {
          paramBoolean = ((Fragment)localObject3).isAdded();
          if (paramBoolean)
          {
            this.OooO0o0 = l1;
            localObject3 = this.OooO0o.o00Ooo00.OooOOo0();
            localObject1 = new java/util/ArrayList;
            ((ArrayList)localObject1).<init>();
            k = 0;
            localObject2 = null;
            bool5 = false;
            Object localObject4 = null;
            int m = 0;
            FragmentStateAdapter.FragmentEventDispatcher localFragmentEventDispatcher1 = null;
            for (;;)
            {
              LongSparseArray localLongSparseArray = this.OooO0o.o00Ooo0;
              int n = localLongSparseArray.OooOOOO();
              if (m >= n) {
                break;
              }
              localLongSparseArray = this.OooO0o.o00Ooo0;
              long l3 = localLongSparseArray.OooOO0O(m);
              Fragment localFragment = (Fragment)this.OooO0o.o00Ooo0.OooOOOo(m);
              boolean bool7 = localFragment.isAdded();
              if (bool7)
              {
                long l4 = this.OooO0o0;
                bool7 = l3 < l4;
                if (bool7)
                {
                  Object localObject5 = Lifecycle.State.o00Ooo0O;
                  ((FragmentTransaction)localObject3).OooOo0O(localFragment, (Lifecycle.State)localObject5);
                  FragmentStateAdapter.FragmentEventDispatcher localFragmentEventDispatcher2 = this.OooO0o.o00OooO;
                  localObject5 = localFragmentEventDispatcher2.OooO00o(localFragment, (Lifecycle.State)localObject5);
                  ((List)localObject1).add(localObject5);
                }
                else
                {
                  localObject4 = localFragment;
                }
                l4 = this.OooO0o0;
                boolean bool6 = l3 < l4;
                if (!bool6)
                {
                  bool6 = true;
                }
                else
                {
                  bool6 = false;
                  localLongSparseArray = null;
                }
                localFragment.setMenuVisibility(bool6);
              }
              m += 1;
            }
            if (localObject4 != null)
            {
              localObject2 = Lifecycle.State.o00Ooo0o;
              ((FragmentTransaction)localObject3).OooOo0O(localObject4, (Lifecycle.State)localObject2);
              localFragmentEventDispatcher1 = this.OooO0o.o00OooO;
              localObject2 = localFragmentEventDispatcher1.OooO00o(localObject4, (Lifecycle.State)localObject2);
              ((List)localObject1).add(localObject2);
            }
            boolean bool4 = ((FragmentTransaction)localObject3).isEmpty();
            if (!bool4)
            {
              ((FragmentTransaction)localObject3).OooOO0o();
              Collections.reverse((List)localObject1);
              localObject3 = ((List)localObject1).iterator();
              for (;;)
              {
                boolean bool3 = ((Iterator)localObject3).hasNext();
                if (!bool3) {
                  break;
                }
                localObject1 = (List)((Iterator)localObject3).next();
                localObject2 = this.OooO0o.o00OooO;
                ((FragmentStateAdapter.FragmentEventDispatcher)localObject2).OooO0O0((List)localObject1);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer
 * JD-Core Version:    0.7.0.1
 */