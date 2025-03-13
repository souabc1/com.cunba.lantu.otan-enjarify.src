package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RecyclerView$Recycler
{
  public final ArrayList OooO00o;
  public ArrayList OooO0O0;
  public final ArrayList OooO0OO;
  public final List OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public RecyclerView.RecycledViewPool OooO0oO;
  public RecyclerView.ViewCacheExtension OooO0oo;
  
  public RecyclerView$Recycler(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = new java/util/ArrayList;
    paramRecyclerView.<init>();
    this.OooO00o = paramRecyclerView;
    this.OooO0O0 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0OO = localArrayList;
    paramRecyclerView = Collections.unmodifiableList(paramRecyclerView);
    this.OooO0Oo = paramRecyclerView;
    int i = 2;
    this.OooO0o0 = i;
    this.OooO0o = i;
  }
  
  public RecyclerView.ViewHolder OooO(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = this.OooO00o;
    boolean bool1 = ((ArrayList)localObject1).size();
    boolean bool2 = false;
    boolean bool3 = false;
    RecyclerView.ViewHolder localViewHolder1 = null;
    while (bool3 < bool1)
    {
      RecyclerView.ViewHolder localViewHolder2 = (RecyclerView.ViewHolder)this.OooO00o.get(bool3);
      boolean bool4 = localViewHolder2.wasReturnedFromScrap();
      if (!bool4)
      {
        int k = localViewHolder2.getLayoutPosition();
        if (k == paramInt)
        {
          boolean bool5 = localViewHolder2.isInvalid();
          if (!bool5)
          {
            RecyclerView.State localState = this.OooO.mState;
            bool5 = localState.OooO0oo;
            if (!bool5)
            {
              bool5 = localViewHolder2.isRemoved();
              if (bool5) {}
            }
            else
            {
              localViewHolder2.addFlags(32);
              return localViewHolder2;
            }
          }
        }
      }
      int j;
      bool3 += true;
    }
    Object localObject2;
    Object localObject3;
    if (!paramBoolean)
    {
      localObject1 = this.OooO.mChildHelper.OooO0o0(paramInt);
      if (localObject1 != null)
      {
        localObject2 = RecyclerView.getChildViewHolderInt((View)localObject1);
        this.OooO.mChildHelper.OooOOO((View)localObject1);
        localObject3 = this.OooO.mChildHelper;
        paramBoolean = ((ChildHelper)localObject3).OooO0oo((View)localObject1);
        bool2 = true;
        if (paramBoolean != bool2)
        {
          this.OooO.mChildHelper.OooO0Oo(paramBoolean);
          OooOoo((View)localObject1);
          ((RecyclerView.ViewHolder)localObject2).addFlags(8224);
          return localObject2;
        }
        localObject3 = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("layout index should not be -1 after unhiding a view:");
        ((StringBuilder)localObject1).append(localObject2);
        localObject2 = this.OooO.exceptionLabel();
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject1).toString();
        ((IllegalStateException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
    }
    localObject1 = this.OooO0OO;
    bool1 = ((ArrayList)localObject1).size();
    while (bool2 < bool1)
    {
      localViewHolder1 = (RecyclerView.ViewHolder)this.OooO0OO.get(bool2);
      boolean bool6 = localViewHolder1.isInvalid();
      if (!bool6)
      {
        int m = localViewHolder1.getLayoutPosition();
        if (m == paramInt)
        {
          boolean bool7 = localViewHolder1.isAttachedToTransitionOverlay();
          if (!bool7)
          {
            if (!paramBoolean)
            {
              localObject3 = this.OooO0OO;
              ((ArrayList)localObject3).remove(bool2);
            }
            paramBoolean = RecyclerView.sVerboseLoggingEnabled;
            if (paramBoolean)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject1 = "getScrapOrHiddenOrCachedHolderForPosition(";
              ((StringBuilder)localObject3).append((String)localObject1);
              ((StringBuilder)localObject3).append(paramInt);
              localObject2 = ") found match in cache: ";
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append(localViewHolder1);
            }
            return localViewHolder1;
          }
        }
      }
      int i;
      bool2 += true;
    }
    return null;
  }
  
  public void OooO00o(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    RecyclerView.clearNestedRecyclerViewIfNotNested(paramViewHolder);
    View localView = paramViewHolder.itemView;
    Object localObject = this.OooO.mAccessibilityDelegate;
    if (localObject != null)
    {
      localObject = ((RecyclerViewAccessibilityDelegate)localObject).getItemDelegate();
      boolean bool = localObject instanceof RecyclerViewAccessibilityDelegate.ItemDelegate;
      if (bool) {
        localObject = ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject).OooO0OO(localView);
      } else {
        localObject = null;
      }
      ViewCompat.o00oO0o(localView, (AccessibilityDelegateCompat)localObject);
    }
    if (paramBoolean) {
      OooO0oO(paramViewHolder);
    }
    paramViewHolder.mBindingAdapter = null;
    paramViewHolder.mOwnerRecyclerView = null;
    getRecycledViewPool().OooO(paramViewHolder);
  }
  
  public final void OooO0O0(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.OooO;
    boolean bool1 = ((RecyclerView)localObject1).isAccessibilityEnabled();
    if (bool1)
    {
      paramViewHolder = paramViewHolder.itemView;
      int i = ViewCompat.OooOoO0(paramViewHolder);
      if (i == 0)
      {
        i = 1;
        ViewCompat.o000000(paramViewHolder, i);
      }
      localObject1 = this.OooO.mAccessibilityDelegate;
      if (localObject1 == null) {
        return;
      }
      localObject1 = ((RecyclerViewAccessibilityDelegate)localObject1).getItemDelegate();
      boolean bool2 = localObject1 instanceof RecyclerViewAccessibilityDelegate.ItemDelegate;
      if (bool2)
      {
        Object localObject2 = localObject1;
        localObject2 = (RecyclerViewAccessibilityDelegate.ItemDelegate)localObject1;
        ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject2).OooO0Oo(paramViewHolder);
      }
      ViewCompat.o00oO0o(paramViewHolder, (AccessibilityDelegateCompat)localObject1);
    }
  }
  
  public void OooO0OO()
  {
    this.OooO00o.clear();
    OooOoO0();
  }
  
  public void OooO0Oo()
  {
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size();
    int j = 0;
    int k = 0;
    RecyclerView.ViewHolder localViewHolder1 = null;
    RecyclerView.ViewHolder localViewHolder2;
    while (k < i)
    {
      localViewHolder2 = (RecyclerView.ViewHolder)this.OooO0OO.get(k);
      localViewHolder2.clearOldPosition();
      k += 1;
    }
    localArrayList = this.OooO00o;
    i = localArrayList.size();
    k = 0;
    localViewHolder1 = null;
    while (k < i)
    {
      localViewHolder2 = (RecyclerView.ViewHolder)this.OooO00o.get(k);
      localViewHolder2.clearOldPosition();
      k += 1;
    }
    localArrayList = this.OooO0O0;
    if (localArrayList != null)
    {
      i = localArrayList.size();
      while (j < i)
      {
        localViewHolder1 = (RecyclerView.ViewHolder)this.OooO0O0.get(j);
        localViewHolder1.clearOldPosition();
        j += 1;
      }
    }
  }
  
  public int OooO0o(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = this.OooO.mState;
      int i = ((RecyclerView.State)localObject).getItemCount();
      if (paramInt < i)
      {
        localObject = this.OooO.mState;
        boolean bool = ((RecyclerView.State)localObject).isPreLayout();
        if (!bool) {
          return paramInt;
        }
        return this.OooO.mAdapterHelper.OooOOO0(paramInt);
      }
    }
    Object localObject = new java/lang/IndexOutOfBoundsException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("invalid position ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(". State item count is ");
    paramInt = this.OooO.mState.getItemCount();
    localStringBuilder.append(paramInt);
    String str = this.OooO.exceptionLabel();
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    ((IndexOutOfBoundsException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public void OooO0o0()
  {
    this.OooO00o.clear();
    ArrayList localArrayList = this.OooO0O0;
    if (localArrayList != null) {
      localArrayList.clear();
    }
  }
  
  public void OooO0oO(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.OooO.mRecyclerListener;
    if (localObject1 != null) {
      ((RecyclerView.RecyclerListener)localObject1).OooO00o(paramViewHolder);
    }
    localObject1 = this.OooO.mRecyclerListeners;
    int i = ((List)localObject1).size();
    int j = 0;
    Object localObject2 = null;
    while (j < i)
    {
      RecyclerView.RecyclerListener localRecyclerListener = (RecyclerView.RecyclerListener)this.OooO.mRecyclerListeners.get(j);
      localRecyclerListener.OooO00o(paramViewHolder);
      j += 1;
    }
    localObject1 = this.OooO.mAdapter;
    if (localObject1 != null) {
      ((RecyclerView.Adapter)localObject1).onViewRecycled(paramViewHolder);
    }
    localObject1 = this.OooO;
    localObject2 = ((RecyclerView)localObject1).mState;
    if (localObject2 != null)
    {
      localObject1 = ((RecyclerView)localObject1).mViewInfoStore;
      ((ViewInfoStore)localObject1).OooOOo0(paramViewHolder);
    }
    boolean bool = RecyclerView.sVerboseLoggingEnabled;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "dispatchViewRecycled: ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramViewHolder);
    }
  }
  
  public RecyclerView.ViewHolder OooO0oo(long paramLong, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = this.OooO00o;
    int i = localArrayList.size() + -1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    while (i >= 0)
    {
      localObject1 = (RecyclerView.ViewHolder)this.OooO00o.get(i);
      long l1 = ((RecyclerView.ViewHolder)localObject1).getItemId();
      boolean bool1 = l1 < paramLong;
      if (!bool1)
      {
        bool1 = ((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap();
        if (!bool1)
        {
          int j = ((RecyclerView.ViewHolder)localObject1).getItemViewType();
          if (paramInt == j)
          {
            ((RecyclerView.ViewHolder)localObject1).addFlags(32);
            boolean bool2 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
            if (bool2)
            {
              localObject2 = this.OooO.mState;
              bool2 = ((RecyclerView.State)localObject2).isPreLayout();
              if (!bool2)
              {
                int k = 2;
                int m = 14;
                ((RecyclerView.ViewHolder)localObject1).setFlags(k, m);
              }
            }
            return localObject1;
          }
          if (!paramBoolean)
          {
            this.OooO00o.remove(i);
            localObject3 = this.OooO;
            View localView = ((RecyclerView.ViewHolder)localObject1).itemView;
            ((RecyclerView)localObject3).removeDetachedView(localView, false);
            localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView;
            OooOo((View)localObject1);
          }
        }
      }
      i += -1;
    }
    localArrayList = this.OooO0OO;
    i = localArrayList.size() + -1;
    for (;;)
    {
      localObject1 = null;
      if (i < 0) {
        break;
      }
      localObject3 = (RecyclerView.ViewHolder)this.OooO0OO.get(i);
      long l2 = ((RecyclerView.ViewHolder)localObject3).getItemId();
      boolean bool3 = l2 < paramLong;
      if (!bool3)
      {
        bool3 = ((RecyclerView.ViewHolder)localObject3).isAttachedToTransitionOverlay();
        if (!bool3)
        {
          int n = ((RecyclerView.ViewHolder)localObject3).getItemViewType();
          if (paramInt == n)
          {
            if (!paramBoolean)
            {
              localObject2 = this.OooO0OO;
              ((ArrayList)localObject2).remove(i);
            }
            return localObject3;
          }
          if (!paramBoolean)
          {
            OooOoO(i);
            return null;
          }
        }
      }
      i += -1;
    }
    return null;
  }
  
  public View OooOO0(int paramInt, boolean paramBoolean)
  {
    return OooOooo(paramInt, paramBoolean, 9223372036854775807L).itemView;
  }
  
  public final void OooOO0O(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    boolean bool1 = paramViewGroup.getChildCount();
    boolean bool2 = true;
    bool1 -= bool2;
    while (!bool1)
    {
      Object localObject = paramViewGroup.getChildAt(bool1);
      boolean bool3 = localObject instanceof ViewGroup;
      if (bool3)
      {
        localObject = (ViewGroup)localObject;
        OooOO0O((ViewGroup)localObject, bool2);
      }
      bool1 += true;
    }
    if (!paramBoolean) {
      return;
    }
    paramBoolean = paramViewGroup.getVisibility();
    bool1 = true;
    if (paramBoolean == bool1)
    {
      paramBoolean = false;
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(bool1);
    }
    else
    {
      paramBoolean = paramViewGroup.getVisibility();
      paramViewGroup.setVisibility(bool1);
      paramViewGroup.setVisibility(paramBoolean);
    }
  }
  
  public final void OooOO0o(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = paramViewHolder.itemView;
    boolean bool = paramViewHolder instanceof ViewGroup;
    if (bool)
    {
      paramViewHolder = (ViewGroup)paramViewHolder;
      bool = false;
      OooOO0O(paramViewHolder, false);
    }
  }
  
  public void OooOOO()
  {
    Object localObject = this.OooO0OO;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO0OO.get(j);
      if (localViewHolder != null)
      {
        localViewHolder.addFlags(6);
        localViewHolder.addChangePayload(null);
      }
      j += 1;
    }
    localObject = this.OooO.mAdapter;
    if (localObject != null)
    {
      boolean bool = ((RecyclerView.Adapter)localObject).hasStableIds();
      if (bool) {}
    }
    else
    {
      OooOoO0();
    }
  }
  
  public void OooOOO0()
  {
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((RecyclerView.ViewHolder)this.OooO0OO.get(j)).itemView.getLayoutParams();
      if (localLayoutParams != null)
      {
        boolean bool = true;
        localLayoutParams.OooO0OO = bool;
      }
      j += 1;
    }
  }
  
  public final void OooOOOO()
  {
    Object localObject = this.OooO0oO;
    if (localObject != null)
    {
      localObject = this.OooO;
      RecyclerView.Adapter localAdapter = ((RecyclerView)localObject).mAdapter;
      if (localAdapter != null)
      {
        boolean bool = ((RecyclerView)localObject).isAttachedToWindow();
        if (bool)
        {
          localObject = this.OooO0oO;
          localAdapter = this.OooO.mAdapter;
          ((RecyclerView.RecycledViewPool)localObject).OooO0O0(localAdapter);
        }
      }
    }
  }
  
  public void OooOOOo(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO0OO.get(j);
      if (localViewHolder != null)
      {
        int k = localViewHolder.mPosition;
        if (k >= paramInt1)
        {
          boolean bool = RecyclerView.sVerboseLoggingEnabled;
          if (bool)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("offsetPositionRecordsForInsert cached ");
            localStringBuilder.append(j);
            localStringBuilder.append(" holder ");
            localStringBuilder.append(localViewHolder);
            String str = " now at position ";
            localStringBuilder.append(str);
            int m = localViewHolder.mPosition + paramInt2;
            localStringBuilder.append(m);
          }
          localViewHolder.offsetPosition(paramInt2, false);
        }
      }
      j += 1;
    }
  }
  
  public void OooOOo(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramInt1 + paramInt2;
    ArrayList localArrayList = this.OooO0OO;
    int j = localArrayList.size() + -1;
    while (j >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO0OO.get(j);
      if (localViewHolder != null)
      {
        int k = localViewHolder.mPosition;
        int m;
        if (k >= i)
        {
          boolean bool = RecyclerView.sVerboseLoggingEnabled;
          if (bool)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("offsetPositionRecordsForRemove cached ");
            localStringBuilder.append(j);
            localStringBuilder.append(" holder ");
            localStringBuilder.append(localViewHolder);
            String str = " now at position ";
            localStringBuilder.append(str);
            int n = localViewHolder.mPosition - paramInt2;
            localStringBuilder.append(n);
          }
          m = -paramInt2;
          localViewHolder.offsetPosition(m, paramBoolean);
        }
        else if (m >= paramInt1)
        {
          m = 8;
          localViewHolder.addFlags(m);
          OooOoO(j);
        }
      }
      j += -1;
    }
  }
  
  public void OooOOo0(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = paramInt1;
      k = paramInt2;
    }
    else
    {
      i = 1;
      k = paramInt1;
      j = paramInt2;
    }
    ArrayList localArrayList = this.OooO0OO;
    int m = localArrayList.size();
    int n = 0;
    while (n < m)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO0OO.get(n);
      if (localViewHolder != null)
      {
        int i1 = localViewHolder.mPosition;
        if ((i1 >= j) && (i1 <= k))
        {
          if (i1 == paramInt1)
          {
            i1 = paramInt2 - paramInt1;
            localViewHolder.offsetPosition(i1, false);
          }
          else
          {
            localViewHolder.offsetPosition(i, false);
          }
          boolean bool = RecyclerView.sVerboseLoggingEnabled;
          if (bool)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("offsetPositionRecordsForMove cached child ");
            localStringBuilder.append(n);
            String str = " holder ";
            localStringBuilder.append(str);
            localStringBuilder.append(localViewHolder);
          }
        }
      }
      n += 1;
    }
  }
  
  public void OooOOoo(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    OooO0OO();
    OooOo0o(paramAdapter1, true);
    getRecycledViewPool().OooO0oo(paramAdapter1, paramAdapter2, paramBoolean);
    OooOOOO();
  }
  
  public void OooOo(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    paramView.mScrapContainer = null;
    paramView.mInChangeScrap = false;
    paramView.clearReturnedFromScrapFlag();
    OooOoo0(paramView);
  }
  
  public void OooOo0()
  {
    int i = 0;
    RecyclerView.Adapter localAdapter = null;
    for (;;)
    {
      Object localObject = this.OooO0OO;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = ((RecyclerView.ViewHolder)this.OooO0OO.get(i)).itemView;
      PoolingContainer.OooO00o((View)localObject);
      i += 1;
    }
    localAdapter = this.OooO.mAdapter;
    OooOo0O(localAdapter);
  }
  
  public void OooOo00()
  {
    OooOOOO();
  }
  
  public final void OooOo0O(RecyclerView.Adapter paramAdapter)
  {
    OooOo0o(paramAdapter, false);
  }
  
  public final void OooOo0o(RecyclerView.Adapter paramAdapter, boolean paramBoolean)
  {
    RecyclerView.RecycledViewPool localRecycledViewPool = this.OooO0oO;
    if (localRecycledViewPool != null) {
      localRecycledViewPool.OooO0o0(paramAdapter, paramBoolean);
    }
  }
  
  public void OooOoO(int paramInt)
  {
    boolean bool1 = RecyclerView.sVerboseLoggingEnabled;
    Object localObject2;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Recycling cached view at index ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramInt);
    }
    Object localObject1 = (RecyclerView.ViewHolder)this.OooO0OO.get(paramInt);
    boolean bool2 = RecyclerView.sVerboseLoggingEnabled;
    if (bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "CachedViewHolder to be recycled: ";
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(localObject1);
    }
    OooO00o((RecyclerView.ViewHolder)localObject1, true);
    this.OooO0OO.remove(paramInt);
  }
  
  public void OooOoO0()
  {
    Object localObject = this.OooO0OO;
    int i = ((ArrayList)localObject).size() + -1;
    while (i >= 0)
    {
      OooOoO(i);
      i += -1;
    }
    localObject = this.OooO0OO;
    ((ArrayList)localObject).clear();
    boolean bool = RecyclerView.ALLOW_THREAD_GAP_WORK;
    if (bool)
    {
      localObject = this.OooO.mPrefetchRegistry;
      ((GapWorker.LayoutPrefetchRegistryImpl)localObject).OooO0O0();
    }
  }
  
  public void OooOoOO(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool1 = localViewHolder.isTmpDetached();
    if (bool1)
    {
      RecyclerView localRecyclerView = this.OooO;
      localRecyclerView.removeDetachedView(paramView, false);
    }
    boolean bool2 = localViewHolder.isScrap();
    if (bool2)
    {
      localViewHolder.unScrap();
    }
    else
    {
      bool2 = localViewHolder.wasReturnedFromScrap();
      if (bool2) {
        localViewHolder.clearReturnedFromScrapFlag();
      }
    }
    OooOoo0(localViewHolder);
    paramView = this.OooO.mItemAnimator;
    if (paramView != null)
    {
      bool2 = localViewHolder.isRecyclable();
      if (!bool2)
      {
        paramView = this.OooO.mItemAnimator;
        paramView.OooOO0(localViewHolder);
      }
    }
  }
  
  public void OooOoo(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool = paramView.hasAnyOfTheFlags(12);
    if (!bool)
    {
      bool = paramView.isUpdated();
      if (bool)
      {
        localObject = this.OooO;
        bool = ((RecyclerView)localObject).canReuseUpdatedViewHolder(paramView);
        if (!bool)
        {
          localObject = this.OooO0O0;
          if (localObject == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            this.OooO0O0 = ((ArrayList)localObject);
          }
          bool = true;
          paramView.setScrapContainer(this, bool);
          localObject = this.OooO0O0;
          break label180;
        }
      }
    }
    bool = paramView.isInvalid();
    if (bool)
    {
      bool = paramView.isRemoved();
      if (!bool)
      {
        localObject = this.OooO.mAdapter;
        bool = ((RecyclerView.Adapter)localObject).hasStableIds();
        if (!bool)
        {
          paramView = new java/lang/IllegalArgumentException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          String str = this.OooO.exceptionLabel();
          ((StringBuilder)localObject).append(str);
          localObject = ((StringBuilder)localObject).toString();
          paramView.<init>((String)localObject);
          throw paramView;
        }
      }
    }
    bool = false;
    paramView.setScrapContainer(this, false);
    Object localObject = this.OooO00o;
    label180:
    ((ArrayList)localObject).add(paramView);
  }
  
  public void OooOoo0(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = paramViewHolder.isScrap();
    boolean bool2 = false;
    Object localObject1 = null;
    int i = 1;
    float f = 1.4E-45F;
    if (!bool1)
    {
      localObject2 = paramViewHolder.itemView.getParent();
      if (localObject2 == null)
      {
        bool1 = paramViewHolder.isTmpDetached();
        if (!bool1)
        {
          bool1 = paramViewHolder.shouldIgnore();
          if (!bool1)
          {
            bool1 = paramViewHolder.doesTransientStatePreventRecycling();
            localObject3 = this.OooO.mAdapter;
            if ((localObject3 != null) && (bool1))
            {
              bool3 = ((RecyclerView.Adapter)localObject3).onFailedToRecycleView(paramViewHolder);
              if (bool3)
              {
                bool3 = i;
                break label105;
              }
            }
            boolean bool3 = false;
            localObject3 = null;
            label105:
            boolean bool5 = RecyclerView.sDebugAssertionsEnabled;
            if (bool5)
            {
              localObject4 = this.OooO0OO;
              bool5 = ((ArrayList)localObject4).contains(paramViewHolder);
              if (bool5)
              {
                localObject2 = new java/lang/IllegalArgumentException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append("cached view received recycle internal? ");
                ((StringBuilder)localObject1).append(paramViewHolder);
                paramViewHolder = this.OooO.exceptionLabel();
                ((StringBuilder)localObject1).append(paramViewHolder);
                paramViewHolder = ((StringBuilder)localObject1).toString();
                ((IllegalArgumentException)localObject2).<init>(paramViewHolder);
                throw ((Throwable)localObject2);
              }
            }
            StringBuilder localStringBuilder;
            if (!bool3)
            {
              bool3 = paramViewHolder.isRecyclable();
              if (!bool3)
              {
                i = RecyclerView.sVerboseLoggingEnabled;
                if (i != 0)
                {
                  localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  localStringBuilder.append("trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists");
                  localObject3 = this.OooO.exceptionLabel();
                  localStringBuilder.append((String)localObject3);
                }
                i = 0;
                localStringBuilder = null;
                f = 0.0F;
                break label514;
              }
            }
            int j = this.OooO0o;
            if (j > 0)
            {
              boolean bool4 = paramViewHolder.hasAnyOfTheFlags(526);
              if (!bool4)
              {
                localObject3 = this.OooO0OO;
                int k = ((ArrayList)localObject3).size();
                int n = this.OooO0o;
                if ((k >= n) && (k > 0))
                {
                  OooOoO(0);
                  k += -1;
                }
                boolean bool6 = RecyclerView.ALLOW_THREAD_GAP_WORK;
                if ((bool6) && (k > 0))
                {
                  localObject4 = this.OooO.mPrefetchRegistry;
                  int i2 = paramViewHolder.mPosition;
                  bool6 = ((GapWorker.LayoutPrefetchRegistryImpl)localObject4).OooO0Oo(i2);
                  if (!bool6)
                  {
                    k += -1;
                    while (k >= 0)
                    {
                      localObject4 = (RecyclerView.ViewHolder)this.OooO0OO.get(k);
                      int i1 = ((RecyclerView.ViewHolder)localObject4).mPosition;
                      GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl = this.OooO.mPrefetchRegistry;
                      bool7 = localLayoutPrefetchRegistryImpl.OooO0Oo(i1);
                      if (!bool7) {
                        break;
                      }
                      k += -1;
                    }
                    k += i;
                  }
                }
                localObject4 = this.OooO0OO;
                ((ArrayList)localObject4).add(m, paramViewHolder);
                m = i;
                break label487;
              }
            }
            int m = 0;
            localObject3 = null;
            label487:
            if (m == 0)
            {
              OooO00o(paramViewHolder, i);
            }
            else
            {
              i = 0;
              localStringBuilder = null;
              f = 0.0F;
            }
            bool2 = m;
            label514:
            localObject3 = this.OooO.mViewInfoStore;
            ((ViewInfoStore)localObject3).OooOOo0(paramViewHolder);
            if ((!bool2) && (i == 0) && (bool1))
            {
              PoolingContainer.OooO00o(paramViewHolder.itemView);
              bool1 = false;
              localObject2 = null;
              paramViewHolder.mBindingAdapter = null;
              paramViewHolder.mOwnerRecyclerView = null;
            }
            return;
          }
          paramViewHolder = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
          localObject1 = this.OooO.exceptionLabel();
          ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = ((StringBuilder)localObject2).toString();
          paramViewHolder.<init>((String)localObject2);
          throw paramViewHolder;
        }
        localObject2 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        ((StringBuilder)localObject1).append(paramViewHolder);
        paramViewHolder = this.OooO.exceptionLabel();
        ((StringBuilder)localObject1).append(paramViewHolder);
        paramViewHolder = ((StringBuilder)localObject1).toString();
        ((IllegalArgumentException)localObject2).<init>(paramViewHolder);
        throw ((Throwable)localObject2);
      }
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append("Scrapped or attached views may not be recycled. isScrap:");
    boolean bool7 = paramViewHolder.isScrap();
    ((StringBuilder)localObject3).append(bool7);
    Object localObject4 = " isAttached:";
    ((StringBuilder)localObject3).append((String)localObject4);
    paramViewHolder = paramViewHolder.itemView.getParent();
    if (paramViewHolder != null) {
      bool2 = i;
    }
    ((StringBuilder)localObject3).append(bool2);
    paramViewHolder = this.OooO.exceptionLabel();
    ((StringBuilder)localObject3).append(paramViewHolder);
    paramViewHolder = ((StringBuilder)localObject3).toString();
    ((IllegalArgumentException)localObject2).<init>(paramViewHolder);
    throw ((Throwable)localObject2);
  }
  
  public final boolean OooOooO(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, long paramLong)
  {
    paramViewHolder.mBindingAdapter = null;
    Object localObject1 = this.OooO;
    paramViewHolder.mOwnerRecyclerView = ((RecyclerView)localObject1);
    int i = paramViewHolder.getItemViewType();
    localObject1 = this.OooO;
    long l1 = ((RecyclerView)localObject1).getNanoTime();
    long l2 = 9223372036854775807L;
    boolean bool1 = paramLong < l2;
    int j = 0;
    if (bool1)
    {
      RecyclerView.RecycledViewPool localRecycledViewPool = this.OooO0oO;
      bool2 = localRecycledViewPool.OooOO0O(i, l1, paramLong);
      if (!bool2) {
        return false;
      }
    }
    boolean bool2 = paramViewHolder.isTmpDetached();
    boolean bool3 = true;
    if (bool2)
    {
      localObject2 = this.OooO;
      localObject1 = paramViewHolder.itemView;
      int m = ((ViewGroup)localObject2).getChildCount();
      ViewGroup.LayoutParams localLayoutParams = paramViewHolder.itemView.getLayoutParams();
      RecyclerView.access$300((RecyclerView)localObject2, (View)localObject1, m, localLayoutParams);
      j = bool3;
    }
    Object localObject2 = this.OooO.mAdapter;
    ((RecyclerView.Adapter)localObject2).bindViewHolder(paramViewHolder, paramInt1);
    if (j != 0)
    {
      localObject3 = this.OooO;
      localObject2 = paramViewHolder.itemView;
      RecyclerView.access$400((RecyclerView)localObject3, (View)localObject2);
    }
    l2 = this.OooO.getNanoTime();
    Object localObject3 = this.OooO0oO;
    int k = paramViewHolder.getItemViewType();
    l2 -= l1;
    ((RecyclerView.RecycledViewPool)localObject3).OooO0o(k, l2);
    OooO0O0(paramViewHolder);
    localObject3 = this.OooO.mState;
    paramInt1 = ((RecyclerView.State)localObject3).isPreLayout();
    if (paramInt1 != 0) {
      paramViewHolder.mPreLayoutPosition = paramInt2;
    }
    return bool3;
  }
  
  public RecyclerView.ViewHolder OooOooo(int paramInt, boolean paramBoolean, long paramLong)
  {
    Recycler localRecycler = this;
    int i = paramInt;
    boolean bool1 = paramBoolean;
    if (paramInt >= 0)
    {
      localObject1 = this.OooO.mState;
      int n = ((RecyclerView.State)localObject1).getItemCount();
      if (paramInt < n)
      {
        localObject1 = this.OooO.mState;
        boolean bool5 = ((RecyclerView.State)localObject1).isPreLayout();
        int i1 = 0;
        localObject2 = null;
        boolean bool7 = true;
        float f = 1.4E-45F;
        if (bool5)
        {
          localObject1 = getChangedScrapViewForPosition(paramInt);
          if (localObject1 != null)
          {
            bool8 = bool7;
            break label100;
          }
        }
        else
        {
          bool5 = false;
          localObject1 = null;
        }
        boolean bool8 = false;
        List localList = null;
        label100:
        Object localObject3;
        if (localObject1 == null)
        {
          localObject1 = OooO(paramInt, paramBoolean);
          if (localObject1 != null)
          {
            boolean bool9 = localRecycler.Oooo00o((RecyclerView.ViewHolder)localObject1);
            if (!bool9)
            {
              if (!bool1)
              {
                ((RecyclerView.ViewHolder)localObject1).addFlags(4);
                bool9 = ((RecyclerView.ViewHolder)localObject1).isScrap();
                if (bool9)
                {
                  localObject3 = localRecycler.OooO;
                  localObject4 = ((RecyclerView.ViewHolder)localObject1).itemView;
                  ((RecyclerView)localObject3).removeDetachedView((View)localObject4, false);
                  ((RecyclerView.ViewHolder)localObject1).unScrap();
                }
                else
                {
                  bool9 = ((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap();
                  if (bool9) {
                    ((RecyclerView.ViewHolder)localObject1).clearReturnedFromScrapFlag();
                  }
                }
                localRecycler.OooOoo0((RecyclerView.ViewHolder)localObject1);
              }
              bool5 = false;
              localObject1 = null;
            }
            else
            {
              bool8 = bool7;
            }
          }
        }
        if (localObject1 == null)
        {
          localObject3 = localRecycler.OooO.mAdapterHelper;
          int i3 = ((AdapterHelper)localObject3).OooOOO0(i);
          int i4;
          if (i3 >= 0)
          {
            localObject4 = localRecycler.OooO.mAdapter;
            int i5 = ((RecyclerView.Adapter)localObject4).getItemCount();
            if (i3 < i5)
            {
              localObject4 = localRecycler.OooO.mAdapter;
              i5 = ((RecyclerView.Adapter)localObject4).getItemViewType(i3);
              Object localObject5 = localRecycler.OooO.mAdapter;
              bool10 = ((RecyclerView.Adapter)localObject5).hasStableIds();
              if (bool10)
              {
                l1 = localRecycler.OooO.mAdapter.getItemId(i3);
                localObject1 = localRecycler.OooO0oo(l1, i5, bool1);
                if (localObject1 != null)
                {
                  ((RecyclerView.ViewHolder)localObject1).mPosition = i3;
                  bool8 = bool7;
                }
              }
              if (localObject1 == null)
              {
                localObject6 = localRecycler.OooO0oo;
                if (localObject6 != null)
                {
                  localObject6 = ((RecyclerView.ViewCacheExtension)localObject6).OooO00o(localRecycler, i, i5);
                  if (localObject6 != null)
                  {
                    localObject1 = localRecycler.OooO.getChildViewHolder((View)localObject6);
                    if (localObject1 != null)
                    {
                      bool1 = ((RecyclerView.ViewHolder)localObject1).shouldIgnore();
                      if (bool1)
                      {
                        localObject6 = new java/lang/IllegalArgumentException;
                        localObject1 = new java/lang/StringBuilder;
                        ((StringBuilder)localObject1).<init>();
                        ((StringBuilder)localObject1).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        localObject2 = localRecycler.OooO.exceptionLabel();
                        ((StringBuilder)localObject1).append((String)localObject2);
                        localObject1 = ((StringBuilder)localObject1).toString();
                        ((IllegalArgumentException)localObject6).<init>((String)localObject1);
                        throw ((Throwable)localObject6);
                      }
                    }
                    else
                    {
                      localObject6 = new java/lang/IllegalArgumentException;
                      localObject1 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject1).<init>();
                      ((StringBuilder)localObject1).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                      localObject2 = localRecycler.OooO.exceptionLabel();
                      ((StringBuilder)localObject1).append((String)localObject2);
                      localObject1 = ((StringBuilder)localObject1).toString();
                      ((IllegalArgumentException)localObject6).<init>((String)localObject1);
                      throw ((Throwable)localObject6);
                    }
                  }
                }
              }
              if (localObject1 == null)
              {
                bool1 = RecyclerView.sVerboseLoggingEnabled;
                if (bool1)
                {
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>();
                  ((StringBuilder)localObject6).append("tryGetViewHolderForPositionByDeadline(");
                  ((StringBuilder)localObject6).append(i);
                  localObject1 = ") fetching from shared pool";
                  ((StringBuilder)localObject6).append((String)localObject1);
                }
                localObject6 = getRecycledViewPool().getRecycledView(i5);
                if (localObject6 != null)
                {
                  ((RecyclerView.ViewHolder)localObject6).resetInternal();
                  bool5 = RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST;
                  if (bool5) {
                    localRecycler.OooOO0o((RecyclerView.ViewHolder)localObject6);
                  }
                }
                localObject1 = localObject6;
              }
              if (localObject1 != null) {
                break label931;
              }
              localObject6 = localRecycler.OooO;
              long l2 = ((RecyclerView)localObject6).getNanoTime();
              long l1 = 9223372036854775807L;
              i4 = paramLong < l1;
              if (i4 != 0)
              {
                localObject5 = localRecycler.OooO0oO;
                i4 = ((RecyclerView.RecycledViewPool)localObject5).OooOO0o(i5, l2, paramLong);
                if (i4 == 0) {
                  return null;
                }
              }
              localObject2 = localRecycler.OooO;
              localObject3 = ((RecyclerView)localObject2).mAdapter;
              localObject2 = ((RecyclerView.Adapter)localObject3).createViewHolder((ViewGroup)localObject2, i5);
              i4 = RecyclerView.ALLOW_THREAD_GAP_WORK;
              if (i4 != 0)
              {
                localObject3 = RecyclerView.findNestedRecyclerView(((RecyclerView.ViewHolder)localObject2).itemView);
                if (localObject3 != null)
                {
                  localObject5 = new java/lang/ref/WeakReference;
                  ((WeakReference)localObject5).<init>(localObject3);
                  ((RecyclerView.ViewHolder)localObject2).mNestedRecyclerView = ((WeakReference)localObject5);
                }
              }
              l1 = localRecycler.OooO.getNanoTime();
              localObject3 = localRecycler.OooO0oO;
              l1 -= l2;
              ((RecyclerView.RecycledViewPool)localObject3).OooO0oO(i5, l1);
              int j = RecyclerView.HORIZONTAL;
              localObject4 = localObject2;
              break label935;
            }
          }
          localObject6 = new java/lang/IndexOutOfBoundsException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Inconsistency detected. Invalid item position ");
          ((StringBuilder)localObject1).append(i);
          ((StringBuilder)localObject1).append("(offset:");
          ((StringBuilder)localObject1).append(i4);
          ((StringBuilder)localObject1).append(").state:");
          i1 = localRecycler.OooO.mState.getItemCount();
          ((StringBuilder)localObject1).append(i1);
          localObject2 = localRecycler.OooO.exceptionLabel();
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((IndexOutOfBoundsException)localObject6).<init>((String)localObject1);
          throw ((Throwable)localObject6);
        }
        label931:
        Object localObject4 = localObject1;
        label935:
        boolean bool10 = bool8;
        if (bool8)
        {
          localObject6 = localRecycler.OooO.mState;
          boolean bool2 = ((RecyclerView.State)localObject6).isPreLayout();
          if (!bool2)
          {
            int k = 8192;
            bool5 = ((RecyclerView.ViewHolder)localObject4).hasAnyOfTheFlags(k);
            if (bool5)
            {
              ((RecyclerView.ViewHolder)localObject4).setFlags(0, k);
              localObject6 = localRecycler.OooO.mState;
              boolean bool3 = ((RecyclerView.State)localObject6).OooOO0O;
              if (bool3)
              {
                int m = RecyclerView.ItemAnimator.OooO0o0((RecyclerView.ViewHolder)localObject4) | 0x1000;
                localObject1 = localRecycler.OooO;
                localObject2 = ((RecyclerView)localObject1).mItemAnimator;
                localObject1 = ((RecyclerView)localObject1).mState;
                localList = ((RecyclerView.ViewHolder)localObject4).getUnmodifiedPayloads();
                localObject6 = ((RecyclerView.ItemAnimator)localObject2).OooOOOo((RecyclerView.State)localObject1, (RecyclerView.ViewHolder)localObject4, m, localList);
                localObject1 = localRecycler.OooO;
                ((RecyclerView)localObject1).recordAnimationInfoIfBouncedHiddenView((RecyclerView.ViewHolder)localObject4, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject6);
              }
            }
          }
        }
        localObject6 = localRecycler.OooO.mState;
        boolean bool4 = ((RecyclerView.State)localObject6).isPreLayout();
        if (bool4)
        {
          bool4 = ((RecyclerView.ViewHolder)localObject4).isBound();
          if (bool4)
          {
            ((RecyclerView.ViewHolder)localObject4).mPreLayoutPosition = i;
            break label1168;
          }
        }
        bool4 = ((RecyclerView.ViewHolder)localObject4).isBound();
        if (bool4)
        {
          bool4 = ((RecyclerView.ViewHolder)localObject4).needsUpdate();
          if (!bool4)
          {
            bool4 = ((RecyclerView.ViewHolder)localObject4).isInvalid();
            if (!bool4)
            {
              label1168:
              bool4 = false;
              localObject6 = null;
              break label1306;
            }
          }
        }
        bool4 = RecyclerView.sDebugAssertionsEnabled;
        if (bool4)
        {
          bool4 = ((RecyclerView.ViewHolder)localObject4).isRemoved();
          if (bool4)
          {
            localObject6 = new java/lang/IllegalStateException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
            ((StringBuilder)localObject1).append(localObject4);
            localObject2 = localRecycler.OooO.exceptionLabel();
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject1 = ((StringBuilder)localObject1).toString();
            ((IllegalStateException)localObject6).<init>((String)localObject1);
            throw ((Throwable)localObject6);
          }
        }
        i1 = localRecycler.OooO.mAdapterHelper.OooOOO0(i);
        localObject6 = this;
        localObject1 = localObject4;
        i = paramInt;
        bool4 = OooOooO((RecyclerView.ViewHolder)localObject4, i1, paramInt, paramLong);
        label1306:
        localObject1 = ((RecyclerView.ViewHolder)localObject4).itemView.getLayoutParams();
        if (localObject1 == null) {}
        for (localObject1 = localRecycler.OooO.generateDefaultLayoutParams();; localObject1 = ((RecyclerView)localObject2).generateLayoutParams((ViewGroup.LayoutParams)localObject1))
        {
          localObject1 = (RecyclerView.LayoutParams)localObject1;
          localObject2 = ((RecyclerView.ViewHolder)localObject4).itemView;
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          break label1402;
          localObject2 = localRecycler.OooO;
          boolean bool6 = ((RecyclerView)localObject2).checkLayoutParams((ViewGroup.LayoutParams)localObject1);
          if (bool6) {
            break;
          }
          localObject2 = localRecycler.OooO;
        }
        localObject1 = (RecyclerView.LayoutParams)localObject1;
        label1402:
        ((RecyclerView.LayoutParams)localObject1).OooO00o = ((RecyclerView.ViewHolder)localObject4);
        if ((!bool10) || (!bool4))
        {
          bool7 = false;
          f = 0.0F;
        }
        ((RecyclerView.LayoutParams)localObject1).OooO0Oo = bool7;
        return localObject4;
      }
    }
    Object localObject6 = new java/lang/IndexOutOfBoundsException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("Invalid item position ");
    ((StringBuilder)localObject1).append(i);
    ((StringBuilder)localObject1).append("(");
    ((StringBuilder)localObject1).append(i);
    ((StringBuilder)localObject1).append("). Item count:");
    int i2 = localRecycler.OooO.mState.getItemCount();
    ((StringBuilder)localObject1).append(i2);
    Object localObject2 = localRecycler.OooO.exceptionLabel();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    ((IndexOutOfBoundsException)localObject6).<init>((String)localObject1);
    throw ((Throwable)localObject6);
  }
  
  public void Oooo0(int paramInt1, int paramInt2)
  {
    paramInt2 += paramInt1;
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.OooO0OO.get(i);
      if (localViewHolder != null)
      {
        int j = localViewHolder.mPosition;
        if ((j >= paramInt1) && (j < paramInt2))
        {
          j = 2;
          localViewHolder.addFlags(j);
          OooOoO(i);
        }
      }
      i += -1;
    }
  }
  
  public void Oooo000(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool = paramViewHolder.mInChangeScrap;
    ArrayList localArrayList;
    if (bool) {
      localArrayList = this.OooO0O0;
    } else {
      localArrayList = this.OooO00o;
    }
    localArrayList.remove(paramViewHolder);
    paramViewHolder.mScrapContainer = null;
    paramViewHolder.mInChangeScrap = false;
    paramViewHolder.clearReturnedFromScrapFlag();
  }
  
  public void Oooo00O()
  {
    Object localObject = this.OooO.mLayout;
    if (localObject != null)
    {
      i = ((RecyclerView.LayoutManager)localObject).mPrefetchMaxCountObserved;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    int j = this.OooO0o0 + i;
    this.OooO0o = j;
    localObject = this.OooO0OO;
    int i = ((ArrayList)localObject).size() + -1;
    while (i >= 0)
    {
      ArrayList localArrayList = this.OooO0OO;
      j = localArrayList.size();
      int k = this.OooO0o;
      if (j <= k) {
        break;
      }
      OooOoO(i);
      i += -1;
    }
  }
  
  public boolean Oooo00o(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = paramViewHolder.isRemoved();
    if (bool1)
    {
      boolean bool4 = RecyclerView.sDebugAssertionsEnabled;
      if (bool4)
      {
        paramViewHolder = this.OooO.mState;
        bool4 = paramViewHolder.isPreLayout();
        if (!bool4)
        {
          paramViewHolder = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("should not receive a removed view unless it is pre layout");
          localObject2 = this.OooO.exceptionLabel();
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          paramViewHolder.<init>((String)localObject1);
          throw paramViewHolder;
        }
      }
      return this.OooO.mState.isPreLayout();
    }
    int i = paramViewHolder.mPosition;
    if (i >= 0)
    {
      localObject2 = this.OooO.mAdapter;
      int m = ((RecyclerView.Adapter)localObject2).getItemCount();
      if (i < m)
      {
        localObject1 = this.OooO.mState;
        boolean bool2 = ((RecyclerView.State)localObject1).isPreLayout();
        m = 0;
        localObject2 = null;
        if (!bool2)
        {
          localObject1 = this.OooO.mAdapter;
          n = paramViewHolder.mPosition;
          int j = ((RecyclerView.Adapter)localObject1).getItemViewType(n);
          n = paramViewHolder.getItemViewType();
          if (j != n) {
            return false;
          }
        }
        localObject1 = this.OooO.mAdapter;
        boolean bool3 = ((RecyclerView.Adapter)localObject1).hasStableIds();
        int n = 1;
        if (bool3)
        {
          long l1 = paramViewHolder.getItemId();
          localObject1 = this.OooO.mAdapter;
          int k = paramViewHolder.mPosition;
          long l2 = ((RecyclerView.Adapter)localObject1).getItemId(k);
          boolean bool5 = l1 < l2;
          if (!bool5) {
            m = n;
          }
          return m;
        }
        return n;
      }
    }
    Object localObject1 = new java/lang/IndexOutOfBoundsException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Inconsistency detected. Invalid view holder adapter position");
    ((StringBuilder)localObject2).append(paramViewHolder);
    paramViewHolder = this.OooO.exceptionLabel();
    ((StringBuilder)localObject2).append(paramViewHolder);
    paramViewHolder = ((StringBuilder)localObject2).toString();
    ((IndexOutOfBoundsException)localObject1).<init>(paramViewHolder);
    throw ((Throwable)localObject1);
  }
  
  public RecyclerView.ViewHolder getChangedScrapViewForPosition(int paramInt)
  {
    ArrayList localArrayList = this.OooO0O0;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      if (i != 0)
      {
        int j = 0;
        int k = 0;
        Object localObject = null;
        int n;
        for (;;)
        {
          n = 32;
          if (k >= i) {
            break;
          }
          RecyclerView.ViewHolder localViewHolder1 = (RecyclerView.ViewHolder)this.OooO0O0.get(k);
          boolean bool3 = localViewHolder1.wasReturnedFromScrap();
          if (!bool3)
          {
            int i1 = localViewHolder1.getLayoutPosition();
            if (i1 == paramInt)
            {
              localViewHolder1.addFlags(n);
              return localViewHolder1;
            }
          }
          k += 1;
        }
        localObject = this.OooO.mAdapter;
        boolean bool1 = ((RecyclerView.Adapter)localObject).hasStableIds();
        if (bool1)
        {
          localObject = this.OooO.mAdapterHelper;
          paramInt = ((AdapterHelper)localObject).OooOOO0(paramInt);
          if (paramInt > 0)
          {
            localObject = this.OooO.mAdapter;
            int m = ((RecyclerView.Adapter)localObject).getItemCount();
            if (paramInt < m)
            {
              localObject = this.OooO.mAdapter;
              long l1 = ((RecyclerView.Adapter)localObject).getItemId(paramInt);
              while (j < i)
              {
                RecyclerView.ViewHolder localViewHolder2 = (RecyclerView.ViewHolder)this.OooO0O0.get(j);
                boolean bool2 = localViewHolder2.wasReturnedFromScrap();
                if (!bool2)
                {
                  long l2 = localViewHolder2.getItemId();
                  bool2 = l2 < l1;
                  if (!bool2)
                  {
                    localViewHolder2.addFlags(n);
                    return localViewHolder2;
                  }
                }
                j += 1;
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public RecyclerView.RecycledViewPool getRecycledViewPool()
  {
    RecyclerView.RecycledViewPool localRecycledViewPool = this.OooO0oO;
    if (localRecycledViewPool == null)
    {
      localRecycledViewPool = new androidx/recyclerview/widget/RecyclerView$RecycledViewPool;
      localRecycledViewPool.<init>();
      this.OooO0oO = localRecycledViewPool;
      OooOOOO();
    }
    return this.OooO0oO;
  }
  
  public int getScrapCount()
  {
    return this.OooO00o.size();
  }
  
  public List getScrapList()
  {
    return this.OooO0Oo;
  }
  
  public View getScrapViewAt(int paramInt)
  {
    return ((RecyclerView.ViewHolder)this.OooO00o.get(paramInt)).itemView;
  }
  
  public View getViewForPosition(int paramInt)
  {
    return OooOO0(paramInt, false);
  }
  
  public void setRecycledViewPool(RecyclerView.RecycledViewPool paramRecycledViewPool)
  {
    Object localObject = this.OooO.mAdapter;
    OooOo0O((RecyclerView.Adapter)localObject);
    localObject = this.OooO0oO;
    if (localObject != null) {
      ((RecyclerView.RecycledViewPool)localObject).OooO0Oo();
    }
    this.OooO0oO = paramRecycledViewPool;
    if (paramRecycledViewPool != null)
    {
      paramRecycledViewPool = this.OooO.getAdapter();
      if (paramRecycledViewPool != null)
      {
        paramRecycledViewPool = this.OooO0oO;
        paramRecycledViewPool.OooO00o();
      }
    }
    OooOOOO();
  }
  
  public void setViewCacheExtension(RecyclerView.ViewCacheExtension paramViewCacheExtension)
  {
    this.OooO0oo = paramViewCacheExtension;
  }
  
  public void setViewCacheSize(int paramInt)
  {
    this.OooO0o0 = paramInt;
    Oooo00O();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.Recycler
 * JD-Core Version:    0.7.0.1
 */