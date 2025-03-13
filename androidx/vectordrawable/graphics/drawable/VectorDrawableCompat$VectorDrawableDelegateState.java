package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

class VectorDrawableCompat$VectorDrawableDelegateState
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState OooO00o;
  
  public VectorDrawableCompat$VectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
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
    VectorDrawableCompat localVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat;
    localVectorDrawableCompat.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)this.OooO00o.newDrawable();
    localVectorDrawableCompat.o00OoOoo = localVectorDrawable;
    return localVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    VectorDrawableCompat localVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat;
    localVectorDrawableCompat.<init>();
    paramResources = (VectorDrawable)this.OooO00o.newDrawable(paramResources);
    localVectorDrawableCompat.o00OoOoo = paramResources;
    return localVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    VectorDrawableCompat localVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat;
    localVectorDrawableCompat.<init>();
    paramResources = (VectorDrawable)this.OooO00o.newDrawable(paramResources, paramTheme);
    localVectorDrawableCompat.o00OoOoo = paramResources;
    return localVectorDrawableCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableDelegateState
 * JD-Core Version:    0.7.0.1
 */