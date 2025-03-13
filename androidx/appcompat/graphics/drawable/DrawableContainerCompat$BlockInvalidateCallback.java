package androidx.appcompat.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class DrawableContainerCompat$BlockInvalidateCallback
  implements Drawable.Callback
{
  public Drawable.Callback o00OoOoo;
  
  public Drawable.Callback OooO00o()
  {
    Drawable.Callback localCallback = this.o00OoOoo;
    this.o00OoOoo = null;
    return localCallback;
  }
  
  public BlockInvalidateCallback OooO0O0(Drawable.Callback paramCallback)
  {
    this.o00OoOoo = paramCallback;
    return this;
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {}
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    Drawable.Callback localCallback = this.o00OoOoo;
    if (localCallback != null) {
      localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
    }
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    Drawable.Callback localCallback = this.o00OoOoo;
    if (localCallback != null) {
      localCallback.unscheduleDrawable(paramDrawable, paramRunnable);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback
 * JD-Core Version:    0.7.0.1
 */