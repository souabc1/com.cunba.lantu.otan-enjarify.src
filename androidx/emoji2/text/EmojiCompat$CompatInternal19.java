package androidx.emoji2.text;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.flatbuffer.MetadataList;

final class EmojiCompat$CompatInternal19
  extends EmojiCompat.CompatInternal
{
  public volatile EmojiProcessor OooO0O0;
  public volatile MetadataRepo OooO0OO;
  
  public EmojiCompat$CompatInternal19(EmojiCompat paramEmojiCompat)
  {
    super(paramEmojiCompat);
  }
  
  public void OooO00o()
  {
    try
    {
      EmojiCompat.CompatInternal19.1 local1 = new androidx/emoji2/text/EmojiCompat$CompatInternal19$1;
      local1.<init>(this);
      localObject = this.OooO00o;
      localObject = ((EmojiCompat)localObject).OooO0o;
      ((EmojiCompat.MetadataRepoLoader)localObject).OooO00o(local1);
    }
    finally
    {
      Object localObject = this.OooO00o;
      ((EmojiCompat)localObject).OooO0oO(localThrowable);
    }
  }
  
  public CharSequence OooO0O0(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return this.OooO0O0.OooO0oo(paramCharSequence, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void OooO0OO(EditorInfo paramEditorInfo)
  {
    Bundle localBundle = paramEditorInfo.extras;
    int i = this.OooO0OO.getMetadataVersion();
    localBundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
    paramEditorInfo = paramEditorInfo.extras;
    boolean bool = this.OooO00o.OooO0oO;
    paramEditorInfo.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", bool);
  }
  
  public void OooO0Oo(MetadataRepo paramMetadataRepo)
  {
    if (paramMetadataRepo == null)
    {
      paramMetadataRepo = this.OooO00o;
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("metadataRepo cannot be null");
      paramMetadataRepo.OooO0oO((Throwable)localObject);
      return;
    }
    this.OooO0OO = paramMetadataRepo;
    paramMetadataRepo = new androidx/emoji2/text/EmojiProcessor;
    MetadataRepo localMetadataRepo = this.OooO0OO;
    EmojiCompat.SpanFactory localSpanFactory = new androidx/emoji2/text/EmojiCompat$SpanFactory;
    localSpanFactory.<init>();
    EmojiCompat.GlyphChecker localGlyphChecker = EmojiCompat.OooO00o(this.OooO00o);
    Object localObject = this.OooO00o;
    boolean bool = ((EmojiCompat)localObject).OooO0oo;
    int[] arrayOfInt = ((EmojiCompat)localObject).OooO;
    paramMetadataRepo.<init>(localMetadataRepo, localSpanFactory, localGlyphChecker, bool, arrayOfInt);
    this.OooO0O0 = paramMetadataRepo;
    this.OooO00o.OooO0oo();
  }
  
  public String getAssetSignature()
  {
    String str = this.OooO0OO.getMetadataList().OooOOo0();
    if (str == null) {
      str = "";
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.CompatInternal19
 * JD-Core Version:    0.7.0.1
 */