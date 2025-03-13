package androidx.core.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Objects;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener
  implements View.OnApplyWindowInsetsListener
{
  public final WindowInsetsAnimationCompat.Callback OooO00o;
  public WindowInsetsCompat OooO0O0;
  
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    this.OooO00o = paramCallback;
    paramView = ViewCompat.Oooo00o(paramView);
    if (paramView != null)
    {
      paramCallback = new androidx/core/view/WindowInsetsCompat$Builder;
      paramCallback.<init>(paramView);
      paramView = paramCallback.OooO00o();
    }
    else
    {
      paramView = null;
    }
    this.OooO0O0 = paramView;
  }
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    Impl21OnApplyWindowInsetsListener localImpl21OnApplyWindowInsetsListener = this;
    View localView = paramView;
    WindowInsets localWindowInsets = paramWindowInsets;
    boolean bool = paramView.isLaidOut();
    if (!bool)
    {
      localObject1 = WindowInsetsCompat.OooOO0O(paramWindowInsets, paramView);
      this.OooO0O0 = ((WindowInsetsCompat)localObject1);
      return WindowInsetsAnimationCompat.Impl21.OooO0oo(paramView, paramWindowInsets);
    }
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.OooOO0O(paramWindowInsets, paramView);
    Object localObject1 = this.OooO0O0;
    if (localObject1 == null)
    {
      localObject1 = ViewCompat.Oooo00o(paramView);
      this.OooO0O0 = ((WindowInsetsCompat)localObject1);
    }
    localObject1 = localImpl21OnApplyWindowInsetsListener.OooO0O0;
    if (localObject1 == null) {}
    for (;;)
    {
      localImpl21OnApplyWindowInsetsListener.OooO0O0 = localWindowInsetsCompat;
      break;
      localObject1 = WindowInsetsAnimationCompat.Impl21.OooO(paramView);
      if (localObject1 != null)
      {
        localObject1 = ((WindowInsetsAnimationCompat.Callback)localObject1).mDispachedInsets;
        bool = Objects.equals(localObject1, localWindowInsets);
        if (bool) {
          return WindowInsetsAnimationCompat.Impl21.OooO0oo(paramView, paramWindowInsets);
        }
      }
      localObject1 = localImpl21OnApplyWindowInsetsListener.OooO0O0;
      int i = WindowInsetsAnimationCompat.Impl21.OooO00o(localWindowInsetsCompat, (WindowInsetsCompat)localObject1);
      if (i == 0) {
        return WindowInsetsAnimationCompat.Impl21.OooO0oo(paramView, paramWindowInsets);
      }
      Object localObject2 = localImpl21OnApplyWindowInsetsListener.OooO0O0;
      WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = new androidx/core/view/WindowInsetsAnimationCompat;
      localObject1 = new android/view/animation/DecelerateInterpolator;
      ((DecelerateInterpolator)localObject1).<init>();
      localWindowInsetsAnimationCompat.<init>(i, (Interpolator)localObject1, 160L);
      localWindowInsetsAnimationCompat.setFraction(0.0F);
      localObject1 = new float[2];
      Object tmp198_196 = localObject1;
      tmp198_196[0] = 0.0F;
      tmp198_196[1] = 1.0F;
      localObject1 = ValueAnimator.ofFloat((float[])localObject1);
      long l = localWindowInsetsAnimationCompat.getDurationMillis();
      ValueAnimator localValueAnimator = ((ValueAnimator)localObject1).setDuration(l);
      WindowInsetsAnimationCompat.BoundsCompat localBoundsCompat = WindowInsetsAnimationCompat.Impl21.OooO0O0(localWindowInsetsCompat, (WindowInsetsCompat)localObject2, i);
      bool = false;
      WindowInsetsAnimationCompat.Impl21.OooO0o0(localView, localWindowInsetsAnimationCompat, localWindowInsets, false);
      WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1 local1 = new androidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1;
      localObject1 = local1;
      Object localObject3 = paramView;
      local1.<init>(this, localWindowInsetsAnimationCompat, localWindowInsetsCompat, (WindowInsetsCompat)localObject2, i, paramView);
      localValueAnimator.addUpdateListener(local1);
      localObject1 = new androidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2;
      ((WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2)localObject1).<init>(this, localWindowInsetsAnimationCompat, localView);
      localValueAnimator.addListener((Animator.AnimatorListener)localObject1);
      localObject3 = new androidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3;
      localObject1 = localObject3;
      localObject2 = localBoundsCompat;
      ((WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3)localObject3).<init>(this, paramView, localWindowInsetsAnimationCompat, localBoundsCompat, localValueAnimator);
      OneShotPreDrawListener.OooO00o(localView, (Runnable)localObject3);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener
 * JD-Core Version:    0.7.0.1
 */