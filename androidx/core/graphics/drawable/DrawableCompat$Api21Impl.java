package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class DrawableCompat$Api21Impl
{
  public static void OooO(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    paramDrawable.setTintMode(paramMode);
  }
  
  public static void OooO00o(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    paramDrawable.applyTheme(paramTheme);
  }
  
  public static boolean OooO0O0(Drawable paramDrawable)
  {
    return paramDrawable.canApplyTheme();
  }
  
  public static ColorFilter OooO0OO(Drawable paramDrawable)
  {
    return paramDrawable.getColorFilter();
  }
  
  public static void OooO0Oo(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static void OooO0o(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooO0o0(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }
  
  public static void OooO0oO(Drawable paramDrawable, int paramInt)
  {
    paramDrawable.setTint(paramInt);
  }
  
  public static void OooO0oo(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    paramDrawable.setTintList(paramColorStateList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.DrawableCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */