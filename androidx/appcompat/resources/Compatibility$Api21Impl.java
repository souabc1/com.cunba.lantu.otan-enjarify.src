package androidx.appcompat.resources;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class Compatibility$Api21Impl
{
  public static Drawable OooO00o(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    return Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static int OooO0O0(TypedArray paramTypedArray)
  {
    return paramTypedArray.getChangingConfigurations();
  }
  
  public static void OooO0OO(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.resources.Compatibility.Api21Impl
 * JD-Core Version:    0.7.0.1
 */