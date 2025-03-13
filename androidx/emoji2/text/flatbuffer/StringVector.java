package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class StringVector
  extends BaseVector
{
  public Utf8 OooO0Oo;
  
  public StringVector()
  {
    Utf8 localUtf8 = Utf8.getDefault();
    this.OooO0Oo = localUtf8;
  }
  
  public String get(int paramInt)
  {
    paramInt = OooO00o(paramInt);
    ByteBuffer localByteBuffer = this.OooO0OO;
    Utf8 localUtf8 = this.OooO0Oo;
    return Table.OooO0o(paramInt, localByteBuffer, localUtf8);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.StringVector
 * JD-Core Version:    0.7.0.1
 */