package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.FontsContractCompat.FontInfo;

public class TypefaceCompat
{
  public static final TypefaceCompatBaseImpl OooO00o;
  public static final LruCache OooO0O0;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      localObject = new androidx/core/graphics/TypefaceCompatApi29Impl;
      ((TypefaceCompatApi29Impl)localObject).<init>();
    }
    for (;;)
    {
      OooO00o = (TypefaceCompatBaseImpl)localObject;
      break;
      localObject = new androidx/core/graphics/TypefaceCompatApi28Impl;
      ((TypefaceCompatApi28Impl)localObject).<init>();
    }
    Object localObject = new androidx/collection/LruCache;
    ((LruCache)localObject).<init>(16);
    OooO0O0 = (LruCache)localObject;
  }
  
  public static Typeface OooO00o(Context paramContext, Typeface paramTypeface, int paramInt)
  {
    if (paramContext != null) {
      return Typeface.create(paramTypeface, paramInt);
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramContext.<init>("Context cannot be null");
    throw paramContext;
  }
  
  public static Typeface OooO0O0(Context paramContext, CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    return OooO00o.OooO0OO(paramContext, paramCancellationSignal, paramArrayOfFontInfo, paramInt);
  }
  
  public static Typeface OooO0OO(Context paramContext, FontResourcesParserCompat.FamilyResourceEntry paramFamilyResourceEntry, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean)
  {
    Object localObject1 = paramFamilyResourceEntry;
    Object localObject2 = paramFontCallback;
    Object localObject3 = paramHandler;
    boolean bool1 = paramFamilyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry;
    Object localObject4;
    label95:
    label98:
    int i;
    if (bool1)
    {
      localObject1 = (FontResourcesParserCompat.ProviderResourceEntry)paramFamilyResourceEntry;
      localObject4 = OooO0oO(((FontResourcesParserCompat.ProviderResourceEntry)localObject1).getSystemFontFamilyName());
      if (localObject4 != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync((Typeface)localObject4, paramHandler);
        }
        return localObject4;
      }
      bool1 = true;
      if (paramBoolean)
      {
        int j = ((FontResourcesParserCompat.ProviderResourceEntry)localObject1).getFetchStrategy();
        if (j != 0) {
          break label95;
        }
      }
      else
      {
        if (paramFontCallback != null) {
          break label95;
        }
      }
      boolean bool2 = bool1;
      break label98;
      bool2 = false;
      if (paramBoolean) {
        i = ((FontResourcesParserCompat.ProviderResourceEntry)localObject1).getTimeout();
      } else {
        i = -1;
      }
      Handler localHandler = ResourcesCompat.FontCallback.getHandler(paramHandler);
      TypefaceCompat.ResourcesCallbackAdapter localResourcesCallbackAdapter = new androidx/core/graphics/TypefaceCompat$ResourcesCallbackAdapter;
      localResourcesCallbackAdapter.<init>((ResourcesCompat.FontCallback)localObject2);
      FontRequest localFontRequest = ((FontResourcesParserCompat.ProviderResourceEntry)localObject1).getRequest();
      localObject1 = FontsContractCompat.OooO0OO(paramContext, localFontRequest, paramInt3, bool2, i, localHandler, localResourcesCallbackAdapter);
    }
    else
    {
      localObject4 = OooO00o;
      localObject1 = (FontResourcesParserCompat.FontFamilyFilesResourceEntry)paramFamilyResourceEntry;
      localObject1 = ((TypefaceCompatBaseImpl)localObject4).OooO0O0(paramContext, (FontResourcesParserCompat.FontFamilyFilesResourceEntry)localObject1, paramResources, paramInt3);
      if (paramFontCallback != null) {
        if (localObject1 != null)
        {
          paramFontCallback.callbackSuccessAsync((Typeface)localObject1, paramHandler);
        }
        else
        {
          i = -3;
          paramFontCallback.callbackFailAsync(i, paramHandler);
        }
      }
    }
    if (localObject1 != null)
    {
      localObject2 = OooO0O0;
      localObject3 = OooO0o0(paramResources, paramInt1, paramString, paramInt2, paramInt3);
      ((LruCache)localObject2).OooO0Oo(localObject3, localObject1);
    }
    return localObject1;
  }
  
  public static Typeface OooO0Oo(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    TypefaceCompatBaseImpl localTypefaceCompatBaseImpl = OooO00o;
    paramContext = localTypefaceCompatBaseImpl.OooO0o0(paramContext, paramResources, paramInt1, paramString, paramInt3);
    if (paramContext != null)
    {
      paramResources = OooO0o0(paramResources, paramInt1, paramString, paramInt2, paramInt3);
      LruCache localLruCache = OooO0O0;
      localLruCache.OooO0Oo(paramResources, paramContext);
    }
    return paramContext;
  }
  
  public static Typeface OooO0o(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    LruCache localLruCache = OooO0O0;
    paramResources = OooO0o0(paramResources, paramInt1, paramString, paramInt2, paramInt3);
    return (Typeface)localLruCache.OooO0OO(paramResources);
  }
  
  public static String OooO0o0(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    paramResources = paramResources.getResourcePackageName(paramInt1);
    localStringBuilder.<init>(paramResources);
    char c = '-';
    localStringBuilder.append(c);
    localStringBuilder.append(paramString);
    localStringBuilder.append(c);
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(c);
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(c);
    localStringBuilder.append(paramInt3);
    return localStringBuilder.toString();
  }
  
  public static Typeface OooO0oO(String paramString)
  {
    String str = null;
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        bool = false;
        paramString = Typeface.create(paramString, 0);
        Typeface localTypeface1 = Typeface.DEFAULT;
        Typeface localTypeface2 = Typeface.create(localTypeface1, 0);
        if (paramString != null)
        {
          bool = paramString.equals(localTypeface2);
          if (!bool) {
            str = paramString;
          }
        }
      }
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompat
 * JD-Core Version:    0.7.0.1
 */