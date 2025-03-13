package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class LongVector
  extends BaseVector
{
  public long get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    return localByteBuffer.getLong(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.LongVector
 * JD-Core Version:    0.7.0.1
 */