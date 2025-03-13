package androidx.emoji2.text;

import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;

class EmojiCompatInitializer$BackgroundDefaultLoader
  implements EmojiCompat.MetadataRepoLoader
{
  public final Context OooO00o;
  
  public EmojiCompatInitializer$BackgroundDefaultLoader(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    this.OooO00o = paramContext;
  }
  
  public void OooO00o(EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback)
  {
    ThreadPoolExecutor localThreadPoolExecutor = ConcurrencyHelpers.OooO0O0("EmojiCompatInitializer");
    OooO0O0 localOooO0O0 = new androidx/emoji2/text/OooO0O0;
    localOooO0O0.<init>(this, paramMetadataRepoLoaderCallback, localThreadPoolExecutor);
    localThreadPoolExecutor.execute(localOooO0O0);
  }
  
  public void OooO0OO(EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    try
    {
      Object localObject1 = this.OooO00o;
      localObject1 = DefaultEmojiCompatConfig.OooO00o((Context)localObject1);
      Object localObject2;
      if (localObject1 != null)
      {
        ((FontRequestEmojiCompatConfig)localObject1).OooO0O0(paramThreadPoolExecutor);
        localObject1 = ((EmojiCompat.Config)localObject1).getMetadataRepoLoader();
        localObject2 = new androidx/emoji2/text/EmojiCompatInitializer$BackgroundDefaultLoader$1;
        ((EmojiCompatInitializer.BackgroundDefaultLoader.1)localObject2).<init>(this, paramMetadataRepoLoaderCallback, paramThreadPoolExecutor);
        ((EmojiCompat.MetadataRepoLoader)localObject1).OooO00o((EmojiCompat.MetadataRepoLoaderCallback)localObject2);
      }
      else
      {
        localObject1 = new java/lang/RuntimeException;
        localObject2 = "EmojiCompat font provider not available on this device.";
        ((RuntimeException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      paramMetadataRepoLoaderCallback.OooO00o(localThrowable);
      paramThreadPoolExecutor.shutdown();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader
 * JD-Core Version:    0.7.0.1
 */