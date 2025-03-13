package androidx.emoji2.text;

import android.graphics.Typeface;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.nio.ByteBuffer;

public final class MetadataRepo
{
  public final MetadataList OooO00o;
  public final char[] OooO0O0;
  public final MetadataRepo.Node OooO0OO;
  public final Typeface OooO0Oo;
  
  public MetadataRepo(Typeface paramTypeface, MetadataList paramMetadataList)
  {
    this.OooO0Oo = paramTypeface;
    this.OooO00o = paramMetadataList;
    paramTypeface = new androidx/emoji2/text/MetadataRepo$Node;
    paramTypeface.<init>(1024);
    this.OooO0OO = paramTypeface;
    paramTypeface = new char[paramMetadataList.OooOOOo() * 2];
    this.OooO0O0 = paramTypeface;
    OooO00o(paramMetadataList);
  }
  
  public static MetadataRepo OooO0O0(Typeface paramTypeface, ByteBuffer paramByteBuffer)
  {
    Object localObject = "EmojiCompat.MetadataRepo.create";
    try
    {
      TraceCompat.OooO00o((String)localObject);
      localObject = new androidx/emoji2/text/MetadataRepo;
      paramByteBuffer = MetadataListReader.OooO0O0(paramByteBuffer);
      ((MetadataRepo)localObject).<init>(paramTypeface, paramByteBuffer);
      return localObject;
    }
    finally
    {
      TraceCompat.OooO0O0();
    }
  }
  
  public final void OooO00o(MetadataList paramMetadataList)
  {
    int i = paramMetadataList.OooOOOo();
    int j = 0;
    while (j < i)
    {
      EmojiMetadata localEmojiMetadata = new androidx/emoji2/text/EmojiMetadata;
      localEmojiMetadata.<init>(this, j);
      int k = localEmojiMetadata.getId();
      char[] arrayOfChar = this.OooO0O0;
      int m = j * 2;
      Character.toChars(k, arrayOfChar, m);
      OooO0OO(localEmojiMetadata);
      j += 1;
    }
  }
  
  public void OooO0OO(EmojiMetadata paramEmojiMetadata)
  {
    Object localObject = "emoji metadata cannot be null";
    Preconditions.OooO(paramEmojiMetadata, localObject);
    int i = paramEmojiMetadata.getCodepointsLength();
    int j = 1;
    if (i > 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    Preconditions.OooO0O0(i, "invalid metadata codepoint length");
    localObject = this.OooO0OO;
    int k = paramEmojiMetadata.getCodepointsLength() - j;
    ((MetadataRepo.Node)localObject).OooO00o(paramEmojiMetadata, 0, k);
  }
  
  public char[] getEmojiCharArray()
  {
    return this.OooO0O0;
  }
  
  public MetadataList getMetadataList()
  {
    return this.OooO00o;
  }
  
  public int getMetadataVersion()
  {
    return this.OooO00o.OooOOo();
  }
  
  public MetadataRepo.Node getRootNode()
  {
    return this.OooO0OO;
  }
  
  public Typeface getTypeface()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.MetadataRepo
 * JD-Core Version:    0.7.0.1
 */