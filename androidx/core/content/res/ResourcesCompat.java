package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat
{
  public static final ThreadLocal OooO00o;
  public static final WeakHashMap OooO0O0;
  public static final Object OooO0OO;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    OooO00o = (ThreadLocal)localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>(0);
    OooO0O0 = (WeakHashMap)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
  }
  
  public static void OooO(Context paramContext, int paramInt, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler)
  {
    Preconditions.OooO0oo(paramFontCallback);
    boolean bool = paramContext.isRestricted();
    if (bool)
    {
      paramFontCallback.callbackFailAsync(-4, paramHandler);
      return;
    }
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    OooOO0o(paramContext, paramInt, localTypedValue, 0, paramFontCallback, paramHandler, false, false);
  }
  
  public static void OooO00o(ResourcesCompat.ColorStateListCacheKey paramColorStateListCacheKey, int paramInt, ColorStateList paramColorStateList, Resources.Theme paramTheme)
  {
    synchronized (OooO0OO)
    {
      Object localObject2 = OooO0O0;
      Object localObject3 = ((WeakHashMap)localObject2).get(paramColorStateListCacheKey);
      localObject3 = (SparseArray)localObject3;
      if (localObject3 == null)
      {
        localObject3 = new android/util/SparseArray;
        ((SparseArray)localObject3).<init>();
        ((WeakHashMap)localObject2).put(paramColorStateListCacheKey, localObject3);
      }
      localObject2 = new androidx/core/content/res/ResourcesCompat$ColorStateListCacheEntry;
      paramColorStateListCacheKey = paramColorStateListCacheKey.OooO00o;
      paramColorStateListCacheKey = paramColorStateListCacheKey.getConfiguration();
      ((ResourcesCompat.ColorStateListCacheEntry)localObject2).<init>(paramColorStateList, paramColorStateListCacheKey, paramTheme);
      ((SparseArray)localObject3).append(paramInt, localObject2);
      return;
    }
  }
  
  public static ColorStateList OooO0O0(ResourcesCompat.ColorStateListCacheKey paramColorStateListCacheKey, int paramInt)
  {
    synchronized (OooO0OO)
    {
      Object localObject2 = OooO0O0;
      localObject2 = ((WeakHashMap)localObject2).get(paramColorStateListCacheKey);
      localObject2 = (SparseArray)localObject2;
      if (localObject2 != null)
      {
        int i = ((SparseArray)localObject2).size();
        if (i > 0)
        {
          Object localObject3 = ((SparseArray)localObject2).get(paramInt);
          localObject3 = (ResourcesCompat.ColorStateListCacheEntry)localObject3;
          if (localObject3 != null)
          {
            Configuration localConfiguration = ((ResourcesCompat.ColorStateListCacheEntry)localObject3).OooO0O0;
            Object localObject4 = paramColorStateListCacheKey.OooO00o;
            localObject4 = ((Resources)localObject4).getConfiguration();
            boolean bool = localConfiguration.equals((Configuration)localObject4);
            if (bool)
            {
              paramColorStateListCacheKey = paramColorStateListCacheKey.OooO0O0;
              int j;
              if (paramColorStateListCacheKey == null)
              {
                j = ((ResourcesCompat.ColorStateListCacheEntry)localObject3).OooO0OO;
                if (j == 0) {}
              }
              else
              {
                if (paramColorStateListCacheKey == null) {
                  break label144;
                }
                j = ((ResourcesCompat.ColorStateListCacheEntry)localObject3).OooO0OO;
                int k = paramColorStateListCacheKey.hashCode();
                if (j != k) {
                  break label144;
                }
              }
              paramColorStateListCacheKey = ((ResourcesCompat.ColorStateListCacheEntry)localObject3).OooO00o;
              return paramColorStateListCacheKey;
            }
            label144:
            ((SparseArray)localObject2).remove(paramInt);
          }
        }
      }
      return null;
    }
  }
  
  public static Typeface OooO0OO(Context paramContext, int paramInt)
  {
    boolean bool = paramContext.isRestricted();
    if (bool) {
      return null;
    }
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    return OooOO0o(paramContext, paramInt, localTypedValue, 0, null, null, false, true);
  }
  
  public static ColorStateList OooO0Oo(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    ResourcesCompat.ColorStateListCacheKey localColorStateListCacheKey = new androidx/core/content/res/ResourcesCompat$ColorStateListCacheKey;
    localColorStateListCacheKey.<init>(paramResources, paramTheme);
    ColorStateList localColorStateList = OooO0O0(localColorStateListCacheKey, paramInt);
    if (localColorStateList != null) {
      return localColorStateList;
    }
    localColorStateList = OooOO0(paramResources, paramInt, paramTheme);
    if (localColorStateList != null)
    {
      OooO00o(localColorStateListCacheKey, paramInt, localColorStateList, paramTheme);
      return localColorStateList;
    }
    return ResourcesCompat.Api23Impl.OooO0O0(paramResources, paramInt, paramTheme);
  }
  
  public static Drawable OooO0o(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    return ResourcesCompat.Api21Impl.OooO0O0(paramResources, paramInt1, paramInt2, paramTheme);
  }
  
  public static Drawable OooO0o0(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    return ResourcesCompat.Api21Impl.OooO00o(paramResources, paramInt, paramTheme);
  }
  
  public static Typeface OooO0oO(Context paramContext, int paramInt)
  {
    boolean bool = paramContext.isRestricted();
    if (bool) {
      return null;
    }
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    return OooOO0o(paramContext, paramInt, localTypedValue, 0, null, null, false, false);
  }
  
  public static Typeface OooO0oo(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, ResourcesCompat.FontCallback paramFontCallback)
  {
    boolean bool = paramContext.isRestricted();
    if (bool) {
      return null;
    }
    return OooOO0o(paramContext, paramInt1, paramTypedValue, paramInt2, paramFontCallback, null, true, false);
  }
  
  public static ColorStateList OooOO0(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    boolean bool = OooOO0O(paramResources, paramInt);
    if (bool) {
      return null;
    }
    XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
    try
    {
      return ColorStateListInflaterCompat.OooO00o(paramResources, localXmlResourceParser, paramTheme);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static boolean OooOO0O(Resources paramResources, int paramInt)
  {
    TypedValue localTypedValue = getTypedValue();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, bool);
    int i = localTypedValue.type;
    paramInt = 28;
    if (i >= paramInt)
    {
      paramInt = 31;
      if (i <= paramInt) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static Typeface OooOO0o(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = paramContext.getResources();
    boolean bool = true;
    Object localObject2 = paramTypedValue;
    ((Resources)localObject1).getValue(paramInt1, paramTypedValue, bool);
    Object localObject3 = paramContext;
    localObject3 = OooOOO0(paramContext, (Resources)localObject1, paramTypedValue, paramInt1, paramInt2, paramFontCallback, paramHandler, paramBoolean1, paramBoolean2);
    if ((localObject3 == null) && (paramFontCallback == null) && (!paramBoolean2))
    {
      localObject3 = new android/content/res/Resources$NotFoundException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Font resource ID #0x");
      localObject2 = Integer.toHexString(paramInt1);
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" could not be retrieved.");
      localObject1 = ((StringBuilder)localObject1).toString();
      ((Resources.NotFoundException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
    return localObject3;
  }
  
  public static Typeface OooOOO0(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = paramResources;
    Object localObject2 = paramTypedValue;
    ResourcesCompat.FontCallback localFontCallback = paramFontCallback;
    Handler localHandler = paramHandler;
    Object localObject3 = paramTypedValue.string;
    if (localObject3 != null)
    {
      String str = ((CharSequence)localObject3).toString();
      localObject3 = "res/";
      boolean bool1 = str.startsWith((String)localObject3);
      int j = -3;
      if (!bool1)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackFailAsync(j, paramHandler);
        }
        return null;
      }
      int i = paramTypedValue.assetCookie;
      localObject3 = TypefaceCompat.OooO0o(paramResources, paramInt1, str, i, paramInt2);
      if (localObject3 != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync((Typeface)localObject3, paramHandler);
        }
        return localObject3;
      }
      if (paramBoolean2) {
        return null;
      }
      try
      {
        localObject3 = str.toLowerCase();
        localObject4 = ".xml";
        boolean bool2 = ((String)localObject3).endsWith((String)localObject4);
        if (bool2)
        {
          localObject3 = paramResources.getXml(paramInt1);
          localObject3 = FontResourcesParserCompat.OooO0O0((XmlPullParser)localObject3, paramResources);
          if (localObject3 == null)
          {
            if (paramFontCallback != null) {
              paramFontCallback.callbackFailAsync(j, paramHandler);
            }
            return null;
          }
          k = paramTypedValue.assetCookie;
          localObject2 = paramContext;
          localObject4 = str;
          return TypefaceCompat.OooO0OO(paramContext, (FontResourcesParserCompat.FamilyResourceEntry)localObject3, paramResources, paramInt1, str, k, paramInt2, paramFontCallback, paramHandler, paramBoolean1);
        }
        int m = paramTypedValue.assetCookie;
        localObject2 = paramContext;
        localObject3 = paramResources;
        int k = paramInt2;
        localObject2 = TypefaceCompat.OooO0Oo(paramContext, paramResources, paramInt1, str, m, paramInt2);
        if (paramFontCallback != null) {
          if (localObject2 != null) {
            paramFontCallback.callbackSuccessAsync((Typeface)localObject2, paramHandler);
          } else {
            paramFontCallback.callbackFailAsync(j, paramHandler);
          }
        }
        return localObject2;
      }
      catch (IOException localIOException)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Failed to read xml resource ";
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Failed to parse xml resource ";
      }
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append(str);
      if (localFontCallback != null) {
        localFontCallback.callbackFailAsync(j, localHandler);
      }
      return null;
    }
    localObject3 = new android/content/res/Resources$NotFoundException;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    ((StringBuilder)localObject4).append("Resource \"");
    localObject1 = paramResources.getResourceName(paramInt1);
    ((StringBuilder)localObject4).append((String)localObject1);
    ((StringBuilder)localObject4).append("\" (");
    localObject1 = Integer.toHexString(paramInt1);
    ((StringBuilder)localObject4).append((String)localObject1);
    ((StringBuilder)localObject4).append(") is not a Font: ");
    ((StringBuilder)localObject4).append(paramTypedValue);
    localObject2 = ((StringBuilder)localObject4).toString();
    ((Resources.NotFoundException)localObject3).<init>((String)localObject2);
    throw ((Throwable)localObject3);
  }
  
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = OooO00o;
    TypedValue localTypedValue = (TypedValue)localThreadLocal.get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      localThreadLocal.set(localTypedValue);
    }
    return localTypedValue;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat
 * JD-Core Version:    0.7.0.1
 */