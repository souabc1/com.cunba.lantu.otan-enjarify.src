package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class DrawableCompat
{
  public static void OooO(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static void OooO00o(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    DrawableCompat.Api21Impl.OooO00o(paramDrawable, paramTheme);
  }
  
  public static boolean OooO0O0(Drawable paramDrawable)
  {
    return DrawableCompat.Api21Impl.OooO0O0(paramDrawable);
  }
  
  public static void OooO0OO(Drawable paramDrawable)
  {
    paramDrawable.clearColorFilter();
  }
  
  public static int OooO0Oo(Drawable paramDrawable)
  {
    return DrawableCompat.Api19Impl.OooO00o(paramDrawable);
  }
  
  public static int OooO0o(Drawable paramDrawable)
  {
    return DrawableCompat.Api23Impl.OooO00o(paramDrawable);
  }
  
  public static ColorFilter OooO0o0(Drawable paramDrawable)
  {
    return DrawableCompat.Api21Impl.OooO0OO(paramDrawable);
  }
  
  public static void OooO0oO(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    DrawableCompat.Api21Impl.OooO0Oo(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static boolean OooO0oo(Drawable paramDrawable)
  {
    return DrawableCompat.Api19Impl.OooO0Oo(paramDrawable);
  }
  
  public static void OooOO0(Drawable paramDrawable, boolean paramBoolean)
  {
    DrawableCompat.Api19Impl.OooO0o0(paramDrawable, paramBoolean);
  }
  
  public static void OooOO0O(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    DrawableCompat.Api21Impl.OooO0o0(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void OooOO0o(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    DrawableCompat.Api21Impl.OooO0o(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooOOO(Drawable paramDrawable, int paramInt)
  {
    DrawableCompat.Api21Impl.OooO0oO(paramDrawable, paramInt);
  }
  
  public static boolean OooOOO0(Drawable paramDrawable, int paramInt)
  {
    return DrawableCompat.Api23Impl.OooO0O0(paramDrawable, paramInt);
  }
  
  public static void OooOOOO(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    DrawableCompat.Api21Impl.OooO0oo(paramDrawable, paramColorStateList);
  }
  
  public static void OooOOOo(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    DrawableCompat.Api21Impl.OooO(paramDrawable, paramMode);
  }
  
  public static Drawable OooOOo(Drawable paramDrawable)
  {
    return paramDrawable;
  }
  
  public static Drawable OooOOo0(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof WrappedDrawable;
    if (bool) {
      paramDrawable = ((WrappedDrawable)paramDrawable).getWrappedDrawable();
    }
    return paramDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.DrawableCompat
 * JD-Core Version:    0.7.0.1
 */