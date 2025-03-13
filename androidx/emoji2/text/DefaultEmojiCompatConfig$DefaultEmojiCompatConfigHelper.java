package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.Collections;
import java.util.List;

public class DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
{
  public ProviderInfo OooO00o(ResolveInfo paramResolveInfo)
  {
    paramResolveInfo = new java/lang/IllegalStateException;
    paramResolveInfo.<init>("Unable to get provider info prior to API 19");
    throw paramResolveInfo;
  }
  
  public Signature[] OooO0O0(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.getPackageInfo(paramString, 64).signatures;
  }
  
  public List OooO0OO(PackageManager paramPackageManager, Intent paramIntent, int paramInt)
  {
    return Collections.emptyList();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
 * JD-Core Version:    0.7.0.1
 */