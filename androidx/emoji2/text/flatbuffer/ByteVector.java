package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ByteVector
  extends BaseVector
{
  public byte get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    return localByteBuffer.get(paramInt);
  }
  
  public int getAsUnsigned(int paramInt)
  {
    return get(paramInt) & 0xFF;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ByteVector
 * JD-Core Version:    0.7.0.1
 */