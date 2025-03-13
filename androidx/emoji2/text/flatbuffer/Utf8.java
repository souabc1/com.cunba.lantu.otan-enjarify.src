package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public abstract class Utf8
{
  public static Utf8 OooO00o;
  
  public static Utf8 getDefault()
  {
    Object localObject = OooO00o;
    if (localObject == null)
    {
      localObject = new androidx/emoji2/text/flatbuffer/Utf8Safe;
      ((Utf8Safe)localObject).<init>();
      OooO00o = (Utf8)localObject;
    }
    return OooO00o;
  }
  
  public static void setDefault(Utf8 paramUtf8)
  {
    OooO00o = paramUtf8;
  }
  
  public abstract String OooO00o(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8
 * JD-Core Version:    0.7.0.1
 */