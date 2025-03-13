package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

public class Utf8Old
  extends Utf8
{
  public static final ThreadLocal OooO0O0;
  
  static
  {
    OooO00o localOooO00o = new androidx/emoji2/text/flatbuffer/OooO00o;
    localOooO00o.<init>();
    OooO0O0 = ThreadLocal.withInitial(localOooO00o);
  }
  
  public String OooO00o(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    CharsetDecoder localCharsetDecoder = ((Utf8Old.Cache)OooO0O0.get()).OooO0O0;
    localCharsetDecoder.reset();
    paramByteBuffer = paramByteBuffer.duplicate();
    paramByteBuffer.position(paramInt1);
    paramInt1 += paramInt2;
    paramByteBuffer.limit(paramInt1);
    try
    {
      paramByteBuffer = localCharsetDecoder.decode(paramByteBuffer);
      return paramByteBuffer.toString();
    }
    catch (CharacterCodingException paramByteBuffer)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Bad encoding", paramByteBuffer);
      throw localIllegalArgumentException;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Old
 * JD-Core Version:    0.7.0.1
 */