package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class AnimatedVectorDrawableCompat$1
  implements Drawable.Callback
{
  public AnimatedVectorDrawableCompat$1(AnimatedVectorDrawableCompat paramAnimatedVectorDrawableCompat) {}
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    this.o00OoOoo.invalidateSelf();
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    this.o00OoOoo.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    this.o00OoOoo.unscheduleSelf(paramRunnable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
 * JD-Core Version:    0.7.0.1
 */