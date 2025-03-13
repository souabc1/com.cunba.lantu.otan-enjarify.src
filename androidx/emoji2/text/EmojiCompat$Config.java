package androidx.emoji2.text;

import androidx.core.util.Preconditions;
import java.util.Set;

public abstract class EmojiCompat$Config
{
  public EmojiCompat.GlyphChecker OooO;
  public final EmojiCompat.MetadataRepoLoader OooO00o;
  public boolean OooO0O0;
  public boolean OooO0OO;
  public int[] OooO0Oo;
  public boolean OooO0o;
  public Set OooO0o0;
  public int OooO0oO = -16711936;
  public int OooO0oo = 0;
  
  public EmojiCompat$Config(EmojiCompat.MetadataRepoLoader paramMetadataRepoLoader)
  {
    DefaultGlyphChecker localDefaultGlyphChecker = new androidx/emoji2/text/DefaultGlyphChecker;
    localDefaultGlyphChecker.<init>();
    this.OooO = localDefaultGlyphChecker;
    Preconditions.OooO(paramMetadataRepoLoader, "metadataLoader cannot be null.");
    this.OooO00o = paramMetadataRepoLoader;
  }
  
  public Config OooO00o(int paramInt)
  {
    this.OooO0oo = paramInt;
    return this;
  }
  
  public final EmojiCompat.MetadataRepoLoader getMetadataRepoLoader()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.Config
 * JD-Core Version:    0.7.0.1
 */