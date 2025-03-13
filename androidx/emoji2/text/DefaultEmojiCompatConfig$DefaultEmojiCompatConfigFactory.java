package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
{
  public final DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper OooO00o;
  
  public DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory(DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper paramDefaultEmojiCompatConfigHelper)
  {
    if (paramDefaultEmojiCompatConfigHelper == null) {
      paramDefaultEmojiCompatConfigHelper = getHelperForApi();
    }
    this.OooO00o = paramDefaultEmojiCompatConfigHelper;
  }
  
  private static DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHelperForApi()
  {
    DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API28 localDefaultEmojiCompatConfigHelper_API28 = new androidx/emoji2/text/DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28;
    localDefaultEmojiCompatConfigHelper_API28.<init>();
    return localDefaultEmojiCompatConfigHelper_API28;
  }
  
  public final EmojiCompat.Config OooO00o(Context paramContext, FontRequest paramFontRequest)
  {
    if (paramFontRequest == null) {
      return null;
    }
    FontRequestEmojiCompatConfig localFontRequestEmojiCompatConfig = new androidx/emoji2/text/FontRequestEmojiCompatConfig;
    localFontRequestEmojiCompatConfig.<init>(paramContext, paramFontRequest);
    return localFontRequestEmojiCompatConfig;
  }
  
  public final List OooO0O0(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfSignature.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte = paramArrayOfSignature[j].toByteArray();
      localArrayList.add(arrayOfByte);
      j += 1;
    }
    return Collections.singletonList(localArrayList);
  }
  
  public EmojiCompat.Config OooO0OO(Context paramContext)
  {
    FontRequest localFontRequest = OooO0oO(paramContext);
    return OooO00o(paramContext, localFontRequest);
  }
  
  public final FontRequest OooO0Oo(ProviderInfo paramProviderInfo, PackageManager paramPackageManager)
  {
    String str = paramProviderInfo.authority;
    paramProviderInfo = paramProviderInfo.packageName;
    paramPackageManager = this.OooO00o.OooO0O0(paramPackageManager, paramProviderInfo);
    paramPackageManager = OooO0O0(paramPackageManager);
    FontRequest localFontRequest = new androidx/core/provider/FontRequest;
    localFontRequest.<init>(str, paramProviderInfo, "emojicompat-emoji-font", paramPackageManager);
    return localFontRequest;
  }
  
  public final ProviderInfo OooO0o(PackageManager paramPackageManager)
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("androidx.content.action.LOAD_EMOJI_FONT");
    paramPackageManager = ((DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper)localObject1).OooO0OO(paramPackageManager, (Intent)localObject2, 0).iterator();
    boolean bool2;
    do
    {
      boolean bool1 = paramPackageManager.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (ResolveInfo)paramPackageManager.next();
      localObject2 = this.OooO00o;
      localObject1 = ((DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper)localObject2).OooO00o((ResolveInfo)localObject1);
      bool2 = OooO0o0((ProviderInfo)localObject1);
    } while (!bool2);
    return localObject1;
    return null;
  }
  
  public final boolean OooO0o0(ProviderInfo paramProviderInfo)
  {
    if (paramProviderInfo != null)
    {
      paramProviderInfo = paramProviderInfo.applicationInfo;
      if (paramProviderInfo != null)
      {
        int i = paramProviderInfo.flags;
        j = 1;
        i &= j;
        if (i == j) {
          return j;
        }
      }
    }
    int j = 0;
    return j;
  }
  
  public FontRequest OooO0oO(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    Preconditions.OooO(paramContext, "Package manager required to locate emoji font provider");
    ProviderInfo localProviderInfo = OooO0o(paramContext);
    if (localProviderInfo == null) {
      return null;
    }
    try
    {
      return OooO0Oo(localProviderInfo, paramContext);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("emoji2.text.DefaultEmojiConfig", paramContext);
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory
 * JD-Core Version:    0.7.0.1
 */