package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView$ViewHolder
{
  static final int FLAG_ADAPTER_FULLUPDATE = 1024;
  static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
  static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
  static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
  static final int FLAG_BOUND = 1;
  static final int FLAG_IGNORE = 128;
  static final int FLAG_INVALID = 4;
  static final int FLAG_MOVED = 2048;
  static final int FLAG_NOT_RECYCLABLE = 16;
  static final int FLAG_REMOVED = 8;
  static final int FLAG_RETURNED_FROM_SCRAP = 32;
  static final int FLAG_TMP_DETACHED = 256;
  static final int FLAG_UPDATE = 2;
  private static final List FULLUPDATE_PAYLOADS = ;
  static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = 255;
  public final View itemView;
  RecyclerView.Adapter mBindingAdapter;
  int mFlags;
  boolean mInChangeScrap;
  private int mIsRecyclableCount;
  long mItemId;
  int mItemViewType;
  WeakReference mNestedRecyclerView;
  int mOldPosition;
  RecyclerView mOwnerRecyclerView;
  List mPayloads;
  int mPendingAccessibilityState;
  int mPosition;
  int mPreLayoutPosition;
  RecyclerView.Recycler mScrapContainer;
  ViewHolder mShadowedHolder;
  ViewHolder mShadowingHolder;
  List mUnmodifiedPayloads;
  private int mWasImportantForAccessibilityBeforeHidden;
  
  public RecyclerView$ViewHolder(View paramView)
  {
    int i = -1;
    this.mPosition = i;
    this.mOldPosition = i;
    long l = -1;
    this.mItemId = l;
    this.mItemViewType = i;
    this.mPreLayoutPosition = i;
    this.mShadowedHolder = null;
    this.mShadowingHolder = null;
    this.mPayloads = null;
    this.mUnmodifiedPayloads = null;
    this.mIsRecyclableCount = 0;
    this.mScrapContainer = null;
    this.mInChangeScrap = false;
    this.mWasImportantForAccessibilityBeforeHidden = 0;
    this.mPendingAccessibilityState = i;
    if (paramView != null)
    {
      this.itemView = paramView;
      return;
    }
    paramView = new java/lang/IllegalArgumentException;
    paramView.<init>("itemView may not be null");
    throw paramView;
  }
  
  public final void OooO00o()
  {
    Object localObject = this.mPayloads;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mPayloads = ((List)localObject);
      localObject = Collections.unmodifiableList((List)localObject);
      this.mUnmodifiedPayloads = ((List)localObject);
    }
  }
  
  public void addChangePayload(Object paramObject)
  {
    int i = 1024;
    if (paramObject == null)
    {
      addFlags(i);
    }
    else
    {
      int j = this.mFlags;
      i &= j;
      if (i == 0)
      {
        OooO00o();
        List localList = this.mPayloads;
        localList.add(paramObject);
      }
    }
  }
  
  public void addFlags(int paramInt)
  {
    int i = this.mFlags;
    paramInt |= i;
    this.mFlags = paramInt;
  }
  
  public void clearOldPosition()
  {
    int i = -1;
    this.mOldPosition = i;
    this.mPreLayoutPosition = i;
  }
  
  public void clearPayload()
  {
    List localList = this.mPayloads;
    if (localList != null) {
      localList.clear();
    }
    int i = this.mFlags & 0xFFFFFBFF;
    this.mFlags = i;
  }
  
  public void clearReturnedFromScrapFlag()
  {
    int i = this.mFlags & 0xFFFFFFDF;
    this.mFlags = i;
  }
  
  public void clearTmpDetachFlag()
  {
    int i = this.mFlags & 0xFFFFFEFF;
    this.mFlags = i;
  }
  
  public boolean doesTransientStatePreventRecycling()
  {
    int i = this.mFlags & 0x10;
    if (i == 0)
    {
      localView = this.itemView;
      bool = ViewCompat.OoooO(localView);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    View localView = null;
    return bool;
  }
  
  public void flagRemovedAndOffsetPosition(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    addFlags(8);
    offsetPosition(paramInt2, paramBoolean);
    this.mPosition = paramInt1;
  }
  
  public final int getAbsoluteAdapterPosition()
  {
    RecyclerView localRecyclerView = this.mOwnerRecyclerView;
    if (localRecyclerView == null) {
      return -1;
    }
    return localRecyclerView.getAdapterPositionInRecyclerView(this);
  }
  
  public final int getAdapterPosition()
  {
    return getBindingAdapterPosition();
  }
  
  public final RecyclerView.Adapter getBindingAdapter()
  {
    return this.mBindingAdapter;
  }
  
  public final int getBindingAdapterPosition()
  {
    Object localObject = this.mBindingAdapter;
    int i = -1;
    if (localObject == null) {
      return i;
    }
    localObject = this.mOwnerRecyclerView;
    if (localObject == null) {
      return i;
    }
    localObject = ((RecyclerView)localObject).getAdapter();
    if (localObject == null) {
      return i;
    }
    RecyclerView localRecyclerView = this.mOwnerRecyclerView;
    int j = localRecyclerView.getAdapterPositionInRecyclerView(this);
    if (j == i) {
      return i;
    }
    RecyclerView.Adapter localAdapter = this.mBindingAdapter;
    return ((RecyclerView.Adapter)localObject).findRelativeAdapterPositionIn(localAdapter, this, j);
  }
  
  public final long getItemId()
  {
    return this.mItemId;
  }
  
  public final int getItemViewType()
  {
    return this.mItemViewType;
  }
  
  public final int getLayoutPosition()
  {
    int i = this.mPreLayoutPosition;
    int j = -1;
    if (i == j) {
      i = this.mPosition;
    }
    return i;
  }
  
  public final int getOldPosition()
  {
    return this.mOldPosition;
  }
  
  public final int getPosition()
  {
    int i = this.mPreLayoutPosition;
    int j = -1;
    if (i == j) {
      i = this.mPosition;
    }
    return i;
  }
  
  public List getUnmodifiedPayloads()
  {
    int i = this.mFlags & 0x400;
    if (i == 0)
    {
      List localList = this.mPayloads;
      if (localList != null)
      {
        i = localList.size();
        if (i != 0) {
          return this.mUnmodifiedPayloads;
        }
      }
      return FULLUPDATE_PAYLOADS;
    }
    return FULLUPDATE_PAYLOADS;
  }
  
  public boolean hasAnyOfTheFlags(int paramInt)
  {
    int i = this.mFlags;
    paramInt &= i;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public boolean isAdapterPositionUnknown()
  {
    int i = this.mFlags & 0x200;
    if (i == 0)
    {
      bool = isInvalid();
      if (!bool) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public boolean isAttachedToTransitionOverlay()
  {
    ViewParent localViewParent = this.itemView.getParent();
    if (localViewParent != null)
    {
      localViewParent = this.itemView.getParent();
      RecyclerView localRecyclerView = this.mOwnerRecyclerView;
      if (localViewParent != localRecyclerView) {
        return true;
      }
    }
    boolean bool = false;
    localViewParent = null;
    return bool;
  }
  
  boolean isBound()
  {
    int i = this.mFlags;
    int j = 1;
    i &= j;
    if (i == 0) {
      j = 0;
    }
    return j;
  }
  
  public boolean isInvalid()
  {
    int i = this.mFlags & 0x4;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final boolean isRecyclable()
  {
    int i = this.mFlags & 0x10;
    if (i == 0)
    {
      localView = this.itemView;
      bool = ViewCompat.OoooO(localView);
      if (!bool) {
        return true;
      }
    }
    boolean bool = false;
    View localView = null;
    return bool;
  }
  
  public boolean isRemoved()
  {
    int i = this.mFlags & 0x8;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isScrap()
  {
    RecyclerView.Recycler localRecycler = this.mScrapContainer;
    boolean bool;
    if (localRecycler != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localRecycler = null;
    }
    return bool;
  }
  
  public boolean isTmpDetached()
  {
    int i = this.mFlags & 0x100;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isUpdated()
  {
    int i = this.mFlags & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean needsUpdate()
  {
    int i = this.mFlags & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void offsetPosition(int paramInt, boolean paramBoolean)
  {
    int i = this.mOldPosition;
    int j = -1;
    if (i == j)
    {
      i = this.mPosition;
      this.mOldPosition = i;
    }
    i = this.mPreLayoutPosition;
    if (i == j)
    {
      i = this.mPosition;
      this.mPreLayoutPosition = i;
    }
    if (paramBoolean)
    {
      paramBoolean = this.mPreLayoutPosition + paramInt;
      this.mPreLayoutPosition = paramBoolean;
    }
    paramBoolean = this.mPosition + paramInt;
    this.mPosition = paramBoolean;
    Object localObject = this.itemView.getLayoutParams();
    if (localObject != null)
    {
      localObject = (RecyclerView.LayoutParams)this.itemView.getLayoutParams();
      paramBoolean = true;
      ((RecyclerView.LayoutParams)localObject).OooO0OO = paramBoolean;
    }
  }
  
  public void onEnteredHiddenState(RecyclerView paramRecyclerView)
  {
    int i = this.mPendingAccessibilityState;
    int j = -1;
    if (i == j)
    {
      View localView = this.itemView;
      i = ViewCompat.OooOoO0(localView);
    }
    this.mWasImportantForAccessibilityBeforeHidden = i;
    paramRecyclerView.setChildImportantForAccessibilityInternal(this, 4);
  }
  
  public void onLeftHiddenState(RecyclerView paramRecyclerView)
  {
    int i = this.mWasImportantForAccessibilityBeforeHidden;
    paramRecyclerView.setChildImportantForAccessibilityInternal(this, i);
    this.mWasImportantForAccessibilityBeforeHidden = 0;
  }
  
  public void resetInternal()
  {
    boolean bool = RecyclerView.sDebugAssertionsEnabled;
    if (bool)
    {
      bool = isTmpDetached();
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Attempting to reset temp-detached ViewHolder: ");
        ((StringBuilder)localObject).append(this);
        ((StringBuilder)localObject).append(". ViewHolders should be fully detached before resetting.");
        localObject = ((StringBuilder)localObject).toString();
        localIllegalStateException.<init>((String)localObject);
        throw localIllegalStateException;
      }
    }
    this.mFlags = 0;
    int i = -1;
    this.mPosition = i;
    this.mOldPosition = i;
    this.mItemId = -1;
    this.mPreLayoutPosition = i;
    this.mIsRecyclableCount = 0;
    this.mShadowedHolder = null;
    this.mShadowingHolder = null;
    clearPayload();
    this.mWasImportantForAccessibilityBeforeHidden = 0;
    this.mPendingAccessibilityState = i;
    RecyclerView.clearNestedRecyclerViewIfNotNested(this);
  }
  
  public void saveOldPosition()
  {
    int i = this.mOldPosition;
    int j = -1;
    if (i == j)
    {
      i = this.mPosition;
      this.mOldPosition = i;
    }
  }
  
  public void setFlags(int paramInt1, int paramInt2)
  {
    int i = this.mFlags;
    int j = paramInt2 ^ 0xFFFFFFFF;
    i &= j;
    paramInt1 = paramInt1 & paramInt2 | i;
    this.mFlags = paramInt1;
  }
  
  public final void setIsRecyclable(boolean paramBoolean)
  {
    int i = 1;
    int k = this.mIsRecyclableCount;
    int m;
    int n;
    if (paramBoolean) {
      k -= i;
    } else {
      m += i;
    }
    this.mIsRecyclableCount = n;
    Object localObject1;
    String str;
    Object localObject2;
    if (n < 0)
    {
      localObject1 = null;
      this.mIsRecyclableCount = 0;
      i = RecyclerView.sDebugAssertionsEnabled;
      str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ";
      if (i == 0)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(this);
      }
      else
      {
        localObject2 = new java/lang/RuntimeException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(this);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((RuntimeException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      if ((!paramBoolean) && (n == i)) {}
      for (int j = this.mFlags | 0x10;; j = this.mFlags & 0xFFFFFFEF)
      {
        this.mFlags = j;
        break;
        if ((!paramBoolean) || (n != 0)) {
          break;
        }
      }
    }
    boolean bool = RecyclerView.sVerboseLoggingEnabled;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str = "setIsRecyclable val:";
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(paramBoolean);
      localObject2 = ":";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(this);
    }
  }
  
  public void setScrapContainer(RecyclerView.Recycler paramRecycler, boolean paramBoolean)
  {
    this.mScrapContainer = paramRecycler;
    this.mInChangeScrap = paramBoolean;
  }
  
  public boolean shouldBeKeptAsChild()
  {
    int i = this.mFlags & 0x10;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean shouldIgnore()
  {
    int i = this.mFlags & 0x80;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void stopIgnoring()
  {
    int i = this.mFlags & 0xFFFFFF7F;
    this.mFlags = i;
  }
  
  public String toString()
  {
    Object localObject1 = getClass();
    boolean bool1 = ((Class)localObject1).isAnonymousClass();
    if (bool1) {
      localObject1 = "ViewHolder";
    } else {
      localObject1 = getClass().getSimpleName();
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("{");
    localObject1 = Integer.toHexString(hashCode());
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" position=");
    int i = this.mPosition;
    ((StringBuilder)localObject2).append(i);
    ((StringBuilder)localObject2).append(" id=");
    long l = this.mItemId;
    ((StringBuilder)localObject2).append(l);
    ((StringBuilder)localObject2).append(", oldPos=");
    i = this.mOldPosition;
    ((StringBuilder)localObject2).append(i);
    ((StringBuilder)localObject2).append(", pLpos:");
    i = this.mPreLayoutPosition;
    ((StringBuilder)localObject2).append(i);
    localObject1 = ((StringBuilder)localObject2).toString();
    localStringBuilder.<init>((String)localObject1);
    boolean bool2 = isScrap();
    if (bool2)
    {
      localObject1 = " scrap ";
      localStringBuilder.append((String)localObject1);
      bool2 = this.mInChangeScrap;
      if (bool2) {
        localObject1 = "[changeScrap]";
      } else {
        localObject1 = "[attachedScrap]";
      }
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isInvalid();
    if (bool2)
    {
      localObject1 = " invalid";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isBound();
    if (!bool2)
    {
      localObject1 = " unbound";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = needsUpdate();
    if (bool2)
    {
      localObject1 = " update";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isRemoved();
    if (bool2)
    {
      localObject1 = " removed";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = shouldIgnore();
    if (bool2)
    {
      localObject1 = " ignored";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isTmpDetached();
    if (bool2)
    {
      localObject1 = " tmpDetached";
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isRecyclable();
    if (!bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(" not recyclable(");
      int j = this.mIsRecyclableCount;
      ((StringBuilder)localObject1).append(j);
      localObject2 = ")";
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      localStringBuilder.append((String)localObject1);
    }
    bool2 = isAdapterPositionUnknown();
    if (bool2)
    {
      localObject1 = " undefined adapter position";
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.itemView.getParent();
    if (localObject1 == null)
    {
      localObject1 = " no parent";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void unScrap()
  {
    this.mScrapContainer.Oooo000(this);
  }
  
  public boolean wasReturnedFromScrap()
  {
    int i = this.mFlags & 0x20;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ViewHolder
 * JD-Core Version:    0.7.0.1
 */