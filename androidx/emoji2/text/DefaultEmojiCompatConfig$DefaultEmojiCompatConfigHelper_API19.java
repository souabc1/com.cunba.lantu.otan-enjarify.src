package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19
  extends DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
{
  public ProviderInfo OooO00o(ResolveInfo paramResolveInfo)
  {
    return paramResolveInfo.providerInfo;
  }
  
  public List OooO0OO(PackageManager paramPackageManager, Intent paramIntent, int paramInt)
  {
    return paramPackageManager.queryIntentContentProviders(paramIntent, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19
 * JD-Core Version:    0.7.0.1
 */