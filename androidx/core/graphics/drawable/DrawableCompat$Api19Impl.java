package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;

class DrawableCompat$Api19Impl
{
  public static int OooO00o(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
  
  public static Drawable OooO0O0(DrawableContainer.DrawableContainerState paramDrawableContainerState, int paramInt)
  {
    return paramDrawableContainerState.getChild(paramInt);
  }
  
  public static Drawable OooO0OO(InsetDrawable paramInsetDrawable)
  {
    return paramInsetDrawable.getDrawable();
  }
  
  public static boolean OooO0Oo(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public static void OooO0o0(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.DrawableCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */