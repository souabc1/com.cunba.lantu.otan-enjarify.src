package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class WrappedDrawableState
  extends Drawable.ConstantState
{
  public int OooO00o;
  public Drawable.ConstantState OooO0O0;
  public ColorStateList OooO0OO;
  public PorterDuff.Mode OooO0Oo;
  
  public WrappedDrawableState(WrappedDrawableState paramWrappedDrawableState)
  {
    int i = 0;
    this.OooO0OO = null;
    Object localObject = WrappedDrawableApi14.o00OooO;
    this.OooO0Oo = ((PorterDuff.Mode)localObject);
    if (paramWrappedDrawableState != null)
    {
      i = paramWrappedDrawableState.OooO00o;
      this.OooO00o = i;
      localObject = paramWrappedDrawableState.OooO0O0;
      this.OooO0O0 = ((Drawable.ConstantState)localObject);
      localObject = paramWrappedDrawableState.OooO0OO;
      this.OooO0OO = ((ColorStateList)localObject);
      paramWrappedDrawableState = paramWrappedDrawableState.OooO0Oo;
      this.OooO0Oo = paramWrappedDrawableState;
    }
  }
  
  public boolean OooO00o()
  {
    Drawable.ConstantState localConstantState = this.OooO0O0;
    boolean bool;
    if (localConstantState != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localConstantState = null;
    }
    return bool;
  }
  
  public int getChangingConfigurations()
  {
    int i = this.OooO00o;
    Drawable.ConstantState localConstantState = this.OooO0O0;
    int j;
    if (localConstantState != null)
    {
      j = localConstantState.getChangingConfigurations();
    }
    else
    {
      j = 0;
      localConstantState = null;
    }
    return i | j;
  }
  
  public Drawable newDrawable()
  {
    return newDrawable(null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    WrappedDrawableApi21 localWrappedDrawableApi21 = new androidx/core/graphics/drawable/WrappedDrawableApi21;
    localWrappedDrawableApi21.<init>(this, paramResources);
    return localWrappedDrawableApi21;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.WrappedDrawableState
 * JD-Core Version:    0.7.0.1
 */