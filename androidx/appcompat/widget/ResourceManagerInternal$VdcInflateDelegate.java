package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import org.xmlpull.v1.XmlPullParser;

class ResourceManagerInternal$VdcInflateDelegate
  implements ResourceManagerInternal.InflateDelegate
{
  public Drawable OooO00o(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      paramContext = paramContext.getResources();
      return VectorDrawableCompat.OooO0OO(paramContext, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.VdcInflateDelegate
 * JD-Core Version:    0.7.0.1
 */