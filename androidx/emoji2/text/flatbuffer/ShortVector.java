package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ShortVector
  extends BaseVector
{
  public short get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    return localByteBuffer.getShort(paramInt);
  }
  
  public int getAsUnsigned(int paramInt)
  {
    return get(paramInt) & (char)-1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ShortVector
 * JD-Core Version:    0.7.0.1
 */