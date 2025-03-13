package androidx.emoji2.text;

import android.content.Context;
import androidx.core.provider.FontRequest;
import java.util.concurrent.Executor;

public class FontRequestEmojiCompatConfig
  extends EmojiCompat.Config
{
  public static final FontRequestEmojiCompatConfig.FontProviderHelper OooOO0;
  
  static
  {
    FontRequestEmojiCompatConfig.FontProviderHelper localFontProviderHelper = new androidx/emoji2/text/FontRequestEmojiCompatConfig$FontProviderHelper;
    localFontProviderHelper.<init>();
    OooOO0 = localFontProviderHelper;
  }
  
  public FontRequestEmojiCompatConfig(Context paramContext, FontRequest paramFontRequest)
  {
    super(localFontRequestMetadataLoader);
  }
  
  public FontRequestEmojiCompatConfig OooO0O0(Executor paramExecutor)
  {
    ((FontRequestEmojiCompatConfig.FontRequestMetadataLoader)getMetadataRepoLoader()).setExecutor(paramExecutor);
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig
 * JD-Core Version:    0.7.0.1
 */