package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class FontRequestWorker
{
  public static final LruCache OooO00o;
  public static final ExecutorService OooO0O0;
  public static final Object OooO0OO;
  public static final SimpleArrayMap OooO0Oo;
  
  static
  {
    Object localObject = new androidx/collection/LruCache;
    ((LruCache)localObject).<init>(16);
    OooO00o = (LruCache)localObject;
    OooO0O0 = RequestExecutor.OooO00o("fonts-androidx", 10, 10000);
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
    localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    OooO0Oo = (SimpleArrayMap)localObject;
  }
  
  public static String OooO00o(FontRequest paramFontRequest, int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramFontRequest = paramFontRequest.getId();
    localStringBuilder.append(paramFontRequest);
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public static int OooO0O0(FontsContractCompat.FontFamilyResult paramFontFamilyResult)
  {
    int i = paramFontFamilyResult.getStatusCode();
    int j = -3;
    int k = 1;
    if (i != 0)
    {
      int m = paramFontFamilyResult.getStatusCode();
      if (m != k) {
        return j;
      }
      return -2;
    }
    paramFontFamilyResult = paramFontFamilyResult.getFonts();
    if (paramFontFamilyResult != null)
    {
      i = paramFontFamilyResult.length;
      if (i != 0)
      {
        i = paramFontFamilyResult.length;
        k = 0;
        int n = 0;
        while (n < i)
        {
          Object localObject = paramFontFamilyResult[n];
          int i1 = localObject.getResultCode();
          if (i1 != 0)
          {
            if (i1 >= 0) {
              j = i1;
            }
            return j;
          }
          n += 1;
        }
      }
    }
    return k;
  }
  
  public static FontRequestWorker.TypefaceResult OooO0OO(String paramString, Context paramContext, FontRequest paramFontRequest, int paramInt)
  {
    LruCache localLruCache = OooO00o;
    Typeface localTypeface = (Typeface)localLruCache.OooO0OO(paramString);
    if (localTypeface != null)
    {
      paramString = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramString.<init>(localTypeface);
      return paramString;
    }
    localTypeface = null;
    try
    {
      paramFontRequest = FontProvider.OooO0o0(paramContext, paramFontRequest, null);
      int i = OooO0O0(paramFontRequest);
      if (i != 0)
      {
        paramString = new androidx/core/provider/FontRequestWorker$TypefaceResult;
        paramString.<init>(i);
        return paramString;
      }
      paramFontRequest = paramFontRequest.getFonts();
      paramContext = TypefaceCompat.OooO0O0(paramContext, null, paramFontRequest, paramInt);
      if (paramContext != null)
      {
        localLruCache.OooO0Oo(paramString, paramContext);
        paramString = new androidx/core/provider/FontRequestWorker$TypefaceResult;
        paramString.<init>(paramContext);
        return paramString;
      }
      paramString = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramString.<init>(-3);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      paramString = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramString.<init>(-1);
    }
    return paramString;
  }
  
  public static Typeface OooO0Oo(Context paramContext, FontRequest paramFontRequest, int paramInt, Executor paramExecutor, CallbackWithHandler arg4)
  {
    String str = OooO00o(paramFontRequest, paramInt);
    Object localObject1 = (Typeface)OooO00o.OooO0OO(str);
    if (localObject1 != null)
    {
      paramContext = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramContext.<init>((Typeface)localObject1);
      ???.OooO0O0(paramContext);
      return localObject1;
    }
    localObject1 = new androidx/core/provider/FontRequestWorker$2;
    ((FontRequestWorker.2)localObject1).<init>(???);
    synchronized (OooO0OO)
    {
      SimpleArrayMap localSimpleArrayMap = OooO0Oo;
      Object localObject2 = localSimpleArrayMap.get(str);
      localObject2 = (ArrayList)localObject2;
      if (localObject2 != null)
      {
        ((ArrayList)localObject2).add(localObject1);
        return null;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      ((ArrayList)localObject2).add(localObject1);
      localSimpleArrayMap.put(str, localObject2);
      ??? = new androidx/core/provider/FontRequestWorker$3;
      ???.<init>(str, paramContext, paramFontRequest, paramInt);
      if (paramExecutor == null) {
        paramExecutor = OooO0O0;
      }
      paramContext = new androidx/core/provider/FontRequestWorker$4;
      paramContext.<init>(str);
      RequestExecutor.OooO0O0(paramExecutor, ???, paramContext);
      return null;
    }
  }
  
  public static Typeface OooO0o0(Context paramContext, FontRequest paramFontRequest, CallbackWithHandler paramCallbackWithHandler, int paramInt1, int paramInt2)
  {
    String str = OooO00o(paramFontRequest, paramInt1);
    Object localObject = (Typeface)OooO00o.OooO0OO(str);
    if (localObject != null)
    {
      paramContext = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramContext.<init>((Typeface)localObject);
      paramCallbackWithHandler.OooO0O0(paramContext);
      return localObject;
    }
    int i = -1;
    if (paramInt2 == i)
    {
      paramContext = OooO0OO(str, paramContext, paramFontRequest, paramInt1);
      paramCallbackWithHandler.OooO0O0(paramContext);
      return paramContext.OooO00o;
    }
    localObject = new androidx/core/provider/FontRequestWorker$1;
    ((FontRequestWorker.1)localObject).<init>(str, paramContext, paramFontRequest, paramInt1);
    try
    {
      paramContext = OooO0O0;
      paramContext = RequestExecutor.OooO0OO(paramContext, (Callable)localObject, paramInt2);
      paramContext = (FontRequestWorker.TypefaceResult)paramContext;
      paramCallbackWithHandler.OooO0O0(paramContext);
      return paramContext.OooO00o;
    }
    catch (InterruptedException localInterruptedException)
    {
      paramContext = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      paramContext.<init>(-3);
      paramCallbackWithHandler.OooO0O0(paramContext);
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontRequestWorker
 * JD-Core Version:    0.7.0.1
 */