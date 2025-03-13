package androidx.core.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.util.Collections;
import java.util.List;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1(WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener paramImpl21OnApplyWindowInsetsListener, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, int paramInt, View paramView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    Object localObject = this.o00OoOoo;
    float f1 = paramValueAnimator.getAnimatedFraction();
    ((WindowInsetsAnimationCompat)localObject).setFraction(f1);
    paramValueAnimator = this.o00Ooo00;
    localObject = this.o00Ooo0;
    float f2 = this.o00OoOoo.getInterpolatedFraction();
    int i = this.o00Ooo0O;
    paramValueAnimator = WindowInsetsAnimationCompat.Impl21.OooOO0(paramValueAnimator, (WindowInsetsCompat)localObject, f2, i);
    localObject = Collections.singletonList(this.o00OoOoo);
    WindowInsetsAnimationCompat.Impl21.OooO0o(this.o00Ooo0o, paramValueAnimator, (List)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
 * JD-Core Version:    0.7.0.1
 */