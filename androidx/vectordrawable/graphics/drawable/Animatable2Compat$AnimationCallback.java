package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

public abstract class Animatable2Compat$AnimationCallback
{
  Animatable2.AnimationCallback mPlatformCallback;
  
  public Animatable2.AnimationCallback getPlatformCallback()
  {
    Object localObject = this.mPlatformCallback;
    if (localObject == null)
    {
      localObject = new androidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback$1;
      ((Animatable2Compat.AnimationCallback.1)localObject).<init>(this);
      this.mPlatformCallback = ((Animatable2.AnimationCallback)localObject);
    }
    return this.mPlatformCallback;
  }
  
  public void onAnimationEnd(Drawable paramDrawable) {}
  
  public void onAnimationStart(Drawable paramDrawable) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
 * JD-Core Version:    0.7.0.1
 */