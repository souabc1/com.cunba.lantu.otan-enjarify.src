package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class DrawableContainerCompat$Api21Impl
{
  public static boolean OooO00o(Drawable.ConstantState paramConstantState)
  {
    return paramConstantState.canApplyTheme();
  }
  
  public static void OooO0O0(Drawable paramDrawable, Outline paramOutline)
  {
    paramDrawable.getOutline(paramOutline);
  }
  
  public static Resources OooO0OO(Resources.Theme paramTheme)
  {
    return paramTheme.getResources();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */