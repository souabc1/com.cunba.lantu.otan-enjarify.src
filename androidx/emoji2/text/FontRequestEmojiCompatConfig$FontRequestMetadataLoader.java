package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

class FontRequestEmojiCompatConfig$FontRequestMetadataLoader
  implements EmojiCompat.MetadataRepoLoader
{
  public EmojiCompat.MetadataRepoLoaderCallback OooO;
  public final Context OooO00o;
  public final FontRequest OooO0O0;
  public final FontRequestEmojiCompatConfig.FontProviderHelper OooO0OO;
  public final Object OooO0Oo;
  public Executor OooO0o;
  public Handler OooO0o0;
  public ThreadPoolExecutor OooO0oO;
  public FontRequestEmojiCompatConfig.RetryPolicy OooO0oo;
  public ContentObserver OooOO0;
  public Runnable OooOO0O;
  
  public FontRequestEmojiCompatConfig$FontRequestMetadataLoader(Context paramContext, FontRequest paramFontRequest, FontRequestEmojiCompatConfig.FontProviderHelper paramFontProviderHelper)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO0Oo = localObject;
    Preconditions.OooO(paramContext, "Context cannot be null");
    Preconditions.OooO(paramFontRequest, "FontRequest cannot be null");
    paramContext = paramContext.getApplicationContext();
    this.OooO00o = paramContext;
    this.OooO0O0 = paramFontRequest;
    this.OooO0OO = paramFontProviderHelper;
  }
  
  public void OooO00o(EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback)
  {
    Preconditions.OooO(paramMetadataRepoLoaderCallback, "LoaderCallback cannot be null");
    synchronized (this.OooO0Oo)
    {
      this.OooO = paramMetadataRepoLoaderCallback;
      OooO0Oo();
      return;
    }
  }
  
  public final void OooO0O0()
  {
    Object localObject1 = this.OooO0Oo;
    Object localObject2 = null;
    try
    {
      this.OooO = null;
      Object localObject4 = this.OooOO0;
      Object localObject5;
      if (localObject4 != null)
      {
        localObject5 = this.OooO0OO;
        Context localContext = this.OooO00o;
        ((FontRequestEmojiCompatConfig.FontProviderHelper)localObject5).OooO0Oo(localContext, (ContentObserver)localObject4);
        this.OooOO0 = null;
      }
      localObject4 = this.OooO0o0;
      if (localObject4 != null)
      {
        localObject5 = this.OooOO0O;
        ((Handler)localObject4).removeCallbacks((Runnable)localObject5);
      }
      this.OooO0o0 = null;
      localObject4 = this.OooO0oO;
      if (localObject4 != null) {
        ((ThreadPoolExecutor)localObject4).shutdown();
      }
      this.OooO0o = null;
      this.OooO0oO = null;
      return;
    }
    finally {}
  }
  
  public void OooO0OO()
  {
    synchronized (this.OooO0Oo)
    {
      ??? = this.OooO;
      if (??? == null) {
        return;
      }
      try
      {
        ??? = OooO0o0();
        int i = ((FontsContractCompat.FontInfo)???).getResultCode();
        int j = 2;
        if (i == j) {
          synchronized (this.OooO0Oo)
          {
            localObject9 = this.OooO0oo;
            if (localObject9 != null)
            {
              long l1 = ((FontRequestEmojiCompatConfig.RetryPolicy)localObject9).getRetryDelay();
              long l2 = 0L;
              boolean bool = l1 < l2;
              if (!bool)
              {
                ??? = ((FontsContractCompat.FontInfo)???).getUri();
                OooO0o((Uri)???, l1);
                return;
              }
            }
          }
        }
        if (i == 0)
        {
          ??? = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
          try
          {
            TraceCompat.OooO00o((String)???);
            ??? = this.OooO0OO;
            ??? = this.OooO00o;
            ??? = ((FontRequestEmojiCompatConfig.FontProviderHelper)???).OooO00o((Context)???, localFontInfo);
            ??? = this.OooO00o;
            Object localObject2 = localFontInfo.getUri();
            localObject9 = null;
            localObject2 = TypefaceCompatUtil.OooO0o((Context)???, null, (Uri)localObject2);
            if ((localObject2 != null) && (??? != null))
            {
              localObject2 = MetadataRepo.OooO0O0((Typeface)???, (ByteBuffer)localObject2);
              TraceCompat.OooO0O0();
              synchronized (this.OooO0Oo)
              {
                ??? = this.OooO;
                if (??? != null) {
                  ((EmojiCompat.MetadataRepoLoaderCallback)???).OooO0O0((MetadataRepo)localObject2);
                }
                OooO0O0();
              }
            }
            RuntimeException localRuntimeException1 = new java/lang/RuntimeException;
            ??? = "Unable to open file.";
            localRuntimeException1.<init>((String)???);
            throw localRuntimeException1;
          }
          finally
          {
            TraceCompat.OooO0O0();
          }
        }
        RuntimeException localRuntimeException2 = new java/lang/RuntimeException;
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        Object localObject9 = "fetchFonts result is not OK. (";
        ((StringBuilder)???).append((String)localObject9);
        ((StringBuilder)???).append(i);
        ??? = ")";
        ((StringBuilder)???).append((String)???);
        ??? = ((StringBuilder)???).toString();
        localRuntimeException2.<init>((String)???);
        throw localRuntimeException2;
      }
      finally
      {
        synchronized (this.OooO0Oo)
        {
          ??? = this.OooO;
          if (??? != null) {
            ((EmojiCompat.MetadataRepoLoaderCallback)???).OooO00o(localThrowable);
          }
          OooO0O0();
          return;
        }
      }
    }
  }
  
  public void OooO0Oo()
  {
    synchronized (this.OooO0Oo)
    {
      Object localObject2 = this.OooO;
      if (localObject2 == null) {
        return;
      }
      localObject2 = this.OooO0o;
      if (localObject2 == null)
      {
        localObject2 = "emojiCompat";
        localObject2 = ConcurrencyHelpers.OooO0O0((String)localObject2);
        this.OooO0oO = ((ThreadPoolExecutor)localObject2);
        this.OooO0o = ((Executor)localObject2);
      }
      localObject2 = this.OooO0o;
      OooO0OO localOooO0OO = new androidx/emoji2/text/OooO0OO;
      localOooO0OO.<init>(this);
      ((Executor)localObject2).execute(localOooO0OO);
      return;
    }
  }
  
  public final void OooO0o(Uri paramUri, long paramLong)
  {
    synchronized (this.OooO0Oo)
    {
      Handler localHandler = this.OooO0o0;
      if (localHandler == null)
      {
        localHandler = ConcurrencyHelpers.OooO0Oo();
        this.OooO0o0 = localHandler;
      }
      Object localObject2 = this.OooOO0;
      if (localObject2 == null)
      {
        localObject2 = new androidx/emoji2/text/FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1;
        ((FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1)localObject2).<init>(this, localHandler);
        this.OooOO0 = ((ContentObserver)localObject2);
        FontRequestEmojiCompatConfig.FontProviderHelper localFontProviderHelper = this.OooO0OO;
        Context localContext = this.OooO00o;
        localFontProviderHelper.OooO0OO(localContext, paramUri, (ContentObserver)localObject2);
      }
      paramUri = this.OooOO0O;
      if (paramUri == null)
      {
        paramUri = new androidx/emoji2/text/OooO0o;
        paramUri.<init>(this);
        this.OooOO0O = paramUri;
      }
      paramUri = this.OooOO0O;
      localHandler.postDelayed(paramUri, paramLong);
      return;
    }
  }
  
  public final FontsContractCompat.FontInfo OooO0o0()
  {
    try
    {
      Object localObject1 = this.OooO0OO;
      localObject2 = this.OooO00o;
      Object localObject3 = this.OooO0O0;
      localObject1 = ((FontRequestEmojiCompatConfig.FontProviderHelper)localObject1).OooO0O0((Context)localObject2, (FontRequest)localObject3);
      int i = ((FontsContractCompat.FontFamilyResult)localObject1).getStatusCode();
      if (i == 0)
      {
        localObject1 = ((FontsContractCompat.FontFamilyResult)localObject1).getFonts();
        if (localObject1 != null)
        {
          i = localObject1.length;
          if (i != 0) {
            return localObject1[0];
          }
        }
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("fetchFonts failed (empty result)");
        throw ((Throwable)localObject1);
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("fetchFonts failed (");
      int j = ((FontsContractCompat.FontFamilyResult)localObject1).getStatusCode();
      ((StringBuilder)localObject3).append(j);
      ((StringBuilder)localObject3).append(")");
      localObject1 = ((StringBuilder)localObject3).toString();
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>("provider not found", localNameNotFoundException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void setExecutor(Executor paramExecutor)
  {
    synchronized (this.OooO0Oo)
    {
      this.OooO0o = paramExecutor;
      return;
    }
  }
  
  public void setRetryPolicy(FontRequestEmojiCompatConfig.RetryPolicy paramRetryPolicy)
  {
    synchronized (this.OooO0Oo)
    {
      this.OooO0oo = paramRetryPolicy;
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader
 * JD-Core Version:    0.7.0.1
 */