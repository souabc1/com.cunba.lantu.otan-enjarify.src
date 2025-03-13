package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState OooO00o;
  
  public AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
  {
    this.OooO00o = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return this.OooO00o.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return this.OooO00o.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;
    localAnimatedVectorDrawableCompat.<init>();
    Drawable localDrawable = this.OooO00o.newDrawable();
    localAnimatedVectorDrawableCompat.o00OoOoo = localDrawable;
    Drawable.Callback localCallback = localAnimatedVectorDrawableCompat.o00OooOO;
    localDrawable.setCallback(localCallback);
    return localAnimatedVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;
    localAnimatedVectorDrawableCompat.<init>();
    paramResources = this.OooO00o.newDrawable(paramResources);
    localAnimatedVectorDrawableCompat.o00OoOoo = paramResources;
    Drawable.Callback localCallback = localAnimatedVectorDrawableCompat.o00OooOO;
    paramResources.setCallback(localCallback);
    return localAnimatedVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;
    localAnimatedVectorDrawableCompat.<init>();
    paramResources = this.OooO00o.newDrawable(paramResources, paramTheme);
    localAnimatedVectorDrawableCompat.o00OoOoo = paramResources;
    paramTheme = localAnimatedVectorDrawableCompat.o00OooOO;
    paramResources.setCallback(paramTheme);
    return localAnimatedVectorDrawableCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState
 * JD-Core Version:    0.7.0.1
 */