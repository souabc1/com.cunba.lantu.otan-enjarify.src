package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

class Utf8Old$Cache
{
  public final CharsetEncoder OooO00o;
  public final CharsetDecoder OooO0O0;
  public CharSequence OooO0OO = null;
  public ByteBuffer OooO0Oo = null;
  
  public Utf8Old$Cache()
  {
    Object localObject = StandardCharsets.UTF_8.newEncoder();
    this.OooO00o = ((CharsetEncoder)localObject);
    localObject = StandardCharsets.UTF_8.newDecoder();
    this.OooO0O0 = ((CharsetDecoder)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Old.Cache
 * JD-Core Version:    0.7.0.1
 */