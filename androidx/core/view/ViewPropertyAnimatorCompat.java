package androidx.core.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat
{
  public final WeakReference OooO00o;
  public Runnable OooO0O0 = null;
  public Runnable OooO0OO = null;
  public int OooO0Oo = -1;
  
  public ViewPropertyAnimatorCompat(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.OooO00o = localWeakReference;
  }
  
  public ViewPropertyAnimatorCompat OooO(long paramLong)
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setStartDelay(paramLong);
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompat OooO0O0(float paramFloat)
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).alpha(paramFloat);
    }
    return this;
  }
  
  public void OooO0OO()
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).cancel();
    }
  }
  
  public ViewPropertyAnimatorCompat OooO0o(Interpolator paramInterpolator)
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setInterpolator(paramInterpolator);
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompat OooO0o0(long paramLong)
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setDuration(paramLong);
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompat OooO0oO(ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    View localView = (View)this.OooO00o.get();
    if (localView != null) {
      OooO0oo(localView, paramViewPropertyAnimatorListener);
    }
    return this;
  }
  
  public final void OooO0oo(View paramView, ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    if (paramViewPropertyAnimatorListener != null)
    {
      ViewPropertyAnimator localViewPropertyAnimator = paramView.animate();
      ViewPropertyAnimatorCompat.1 local1 = new androidx/core/view/ViewPropertyAnimatorCompat$1;
      local1.<init>(this, paramViewPropertyAnimatorListener, paramView);
      localViewPropertyAnimator.setListener(local1);
    }
    else
    {
      paramView = paramView.animate();
      paramViewPropertyAnimatorListener = null;
      paramView.setListener(null);
    }
  }
  
  public ViewPropertyAnimatorCompat OooOO0(ViewPropertyAnimatorUpdateListener paramViewPropertyAnimatorUpdateListener)
  {
    View localView = (View)this.OooO00o.get();
    if (localView != null)
    {
      o00Ooo localo00Ooo;
      if (paramViewPropertyAnimatorUpdateListener != null)
      {
        localo00Ooo = new androidx/core/view/o00Ooo;
        localo00Ooo.<init>(paramViewPropertyAnimatorUpdateListener, localView);
      }
      else
      {
        localo00Ooo = null;
      }
      paramViewPropertyAnimatorUpdateListener = localView.animate();
      ViewPropertyAnimatorCompat.Api19Impl.OooO00o(paramViewPropertyAnimatorUpdateListener, localo00Ooo);
    }
    return this;
  }
  
  public void OooOO0O()
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).start();
    }
  }
  
  public ViewPropertyAnimatorCompat OooOO0o(float paramFloat)
  {
    Object localObject = (View)this.OooO00o.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).translationY(paramFloat);
    }
    return this;
  }
  
  public long getDuration()
  {
    View localView = (View)this.OooO00o.get();
    if (localView != null) {
      return localView.animate().getDuration();
    }
    return 0L;
  }
  
  public Interpolator getInterpolator()
  {
    View localView = (View)this.OooO00o.get();
    if (localView != null) {
      return ViewPropertyAnimatorCompat.Api18Impl.OooO00o(localView.animate());
    }
    return null;
  }
  
  public long getStartDelay()
  {
    View localView = (View)this.OooO00o.get();
    if (localView != null) {
      return localView.animate().getStartDelay();
    }
    return 0L;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat
 * JD-Core Version:    0.7.0.1
 */