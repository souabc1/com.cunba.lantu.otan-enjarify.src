package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

class ResourceManagerInternal$DrawableDelegate
  implements ResourceManagerInternal.InflateDelegate
{
  public Drawable OooO00o(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = paramAttributeSet.getClassAttribute();
    if (localObject1 != null)
    {
      Object localObject2 = DrawableDelegate.class;
      try
      {
        localObject2 = ((Class)localObject2).getClassLoader();
        localObject1 = ((ClassLoader)localObject2).loadClass((String)localObject1);
        localObject2 = Drawable.class;
        localObject1 = ((Class)localObject1).asSubclass((Class)localObject2);
        localObject2 = null;
        Class[] arrayOfClass = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredConstructor(arrayOfClass);
        localObject2 = new Object[0];
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
        localObject1 = (Drawable)localObject1;
        paramContext = paramContext.getResources();
        Compatibility.Api21Impl.OooO0OO((Drawable)localObject1, paramContext, paramXmlPullParser, paramAttributeSet, paramTheme);
        return localObject1;
      }
      catch (Exception localException) {}
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate
 * JD-Core Version:    0.7.0.1
 */