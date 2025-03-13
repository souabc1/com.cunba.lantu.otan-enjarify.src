package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

public abstract class RecyclerView$SmoothScroller
{
  private RecyclerView.LayoutManager mLayoutManager;
  private boolean mPendingInitialRun;
  private RecyclerView mRecyclerView;
  private final RecyclerView.SmoothScroller.Action mRecyclingAction;
  private boolean mRunning;
  private boolean mStarted;
  private int mTargetPosition = -1;
  private View mTargetView;
  
  public RecyclerView$SmoothScroller()
  {
    RecyclerView.SmoothScroller.Action localAction = new androidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;
    localAction.<init>(0, 0);
    this.mRecyclingAction = localAction;
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    Object localObject = getLayoutManager();
    boolean bool = localObject instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    if (bool) {
      return ((RecyclerView.SmoothScroller.ScrollVectorProvider)localObject).computeScrollVectorForPosition(paramInt);
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
    localObject = RecyclerView.SmoothScroller.ScrollVectorProvider.class.getCanonicalName();
    localStringBuilder.append((String)localObject);
    return null;
  }
  
  public View findViewByPosition(int paramInt)
  {
    return this.mRecyclerView.mLayout.findViewByPosition(paramInt);
  }
  
  public int getChildCount()
  {
    return this.mRecyclerView.mLayout.getChildCount();
  }
  
  public int getChildPosition(View paramView)
  {
    return this.mRecyclerView.getChildLayoutPosition(paramView);
  }
  
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return this.mLayoutManager;
  }
  
  public int getTargetPosition()
  {
    return this.mTargetPosition;
  }
  
  public void instantScrollToPosition(int paramInt)
  {
    this.mRecyclerView.scrollToPosition(paramInt);
  }
  
  public boolean isPendingInitialRun()
  {
    return this.mPendingInitialRun;
  }
  
  public boolean isRunning()
  {
    return this.mRunning;
  }
  
  public void normalize(PointF paramPointF)
  {
    float f1 = paramPointF.x;
    f1 *= f1;
    float f2 = paramPointF.y;
    f2 *= f2;
    f1 = (float)Math.sqrt(f1 + f2);
    f2 = paramPointF.x / f1;
    paramPointF.x = f2;
    f2 = paramPointF.y / f1;
    paramPointF.y = f2;
  }
  
  public void onAnimation(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i = this.mTargetPosition;
    int k = -1;
    if ((i == k) || (localRecyclerView == null)) {
      stop();
    }
    boolean bool1 = this.mPendingInitialRun;
    k = 0;
    Object localObject1 = null;
    int m;
    if (bool1)
    {
      localObject2 = this.mTargetView;
      if (localObject2 == null)
      {
        localObject2 = this.mLayoutManager;
        if (localObject2 != null)
        {
          j = this.mTargetPosition;
          localObject2 = computeScrollVectorForPosition(j);
          if (localObject2 != null)
          {
            float f1 = ((PointF)localObject2).x;
            boolean bool3 = false;
            boolean bool4 = f1 < 0.0F;
            if (!bool4)
            {
              float f2 = ((PointF)localObject2).y;
              bool3 = f2 < 0.0F;
              if (!bool3) {}
            }
            else
            {
              f1 = Math.signum(f1);
              m = (int)f1;
              f3 = Math.signum(((PointF)localObject2).y);
              j = (int)f3;
              localRecyclerView.scrollStep(m, j, null);
            }
          }
        }
      }
    }
    int j = 0;
    float f3 = 0.0F;
    this.mPendingInitialRun = false;
    Object localObject2 = this.mTargetView;
    if (localObject2 != null)
    {
      j = getChildPosition((View)localObject2);
      m = this.mTargetPosition;
      if (j == m)
      {
        localObject2 = this.mTargetView;
        localObject1 = localRecyclerView.mState;
        RecyclerView.SmoothScroller.Action localAction1 = this.mRecyclingAction;
        onTargetFound((View)localObject2, (RecyclerView.State)localObject1, localAction1);
        localObject2 = this.mRecyclingAction;
        ((RecyclerView.SmoothScroller.Action)localObject2).OooO0OO(localRecyclerView);
        stop();
      }
      else
      {
        this.mTargetView = null;
      }
    }
    boolean bool2 = this.mRunning;
    if (bool2)
    {
      localObject2 = localRecyclerView.mState;
      localObject1 = this.mRecyclingAction;
      onSeekTargetStep(paramInt1, paramInt2, (RecyclerView.State)localObject2, (RecyclerView.SmoothScroller.Action)localObject1);
      Object localObject3 = this.mRecyclingAction;
      paramInt1 = ((RecyclerView.SmoothScroller.Action)localObject3).OooO00o();
      RecyclerView.SmoothScroller.Action localAction2 = this.mRecyclingAction;
      localAction2.OooO0OO(localRecyclerView);
      if (paramInt1 != 0)
      {
        paramInt1 = this.mRunning;
        if (paramInt1 != 0)
        {
          paramInt1 = 1;
          this.mPendingInitialRun = paramInt1;
          localObject3 = localRecyclerView.mViewFlinger;
          ((RecyclerView.ViewFlinger)localObject3).OooO0Oo();
        }
      }
    }
  }
  
  public void onChildAttachedToWindow(View paramView)
  {
    int i = getChildPosition(paramView);
    int j = getTargetPosition();
    if (i == j) {
      this.mTargetView = paramView;
    }
  }
  
  public abstract void onSeekTargetStep(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction);
  
  public abstract void onStart();
  
  public abstract void onStop();
  
  public abstract void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction);
  
  public void setTargetPosition(int paramInt)
  {
    this.mTargetPosition = paramInt;
  }
  
  public void start(RecyclerView paramRecyclerView, RecyclerView.LayoutManager paramLayoutManager)
  {
    Object localObject = paramRecyclerView.mViewFlinger;
    ((RecyclerView.ViewFlinger)localObject).OooO0o();
    boolean bool1 = this.mStarted;
    if (bool1)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("An instance of ");
      String str = getClass().getSimpleName();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" was started more than once. Each instance of");
      str = getClass().getSimpleName();
      ((StringBuilder)localObject).append(str);
      str = " is intended to only be used once. You should create a new instance for each use.";
      ((StringBuilder)localObject).append(str);
    }
    this.mRecyclerView = paramRecyclerView;
    this.mLayoutManager = paramLayoutManager;
    int j = this.mTargetPosition;
    int i = -1;
    if (j != i)
    {
      paramRecyclerView.mState.OooO00o = j;
      boolean bool2 = true;
      this.mRunning = bool2;
      this.mPendingInitialRun = bool2;
      j = getTargetPosition();
      paramLayoutManager = findViewByPosition(j);
      this.mTargetView = paramLayoutManager;
      onStart();
      this.mRecyclerView.mViewFlinger.OooO0Oo();
      this.mStarted = bool2;
      return;
    }
    paramRecyclerView = new java/lang/IllegalArgumentException;
    paramRecyclerView.<init>("Invalid target position");
    throw paramRecyclerView;
  }
  
  public final void stop()
  {
    boolean bool = this.mRunning;
    if (!bool) {
      return;
    }
    this.mRunning = false;
    onStop();
    RecyclerView.State localState = this.mRecyclerView.mState;
    int i = -1;
    localState.OooO00o = i;
    this.mTargetView = null;
    this.mTargetPosition = i;
    this.mPendingInitialRun = false;
    this.mLayoutManager.onSmoothScrollerStopped(this);
    this.mLayoutManager = null;
    this.mRecyclerView = null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SmoothScroller
 * JD-Core Version:    0.7.0.1
 */