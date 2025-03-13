package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class IntVector
  extends BaseVector
{
  public int get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    return localByteBuffer.getInt(paramInt);
  }
  
  public long getAsUnsigned(int paramInt)
  {
    return get(paramInt) & 0xFFFFFFFF;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.IntVector
 * JD-Core Version:    0.7.0.1
 */