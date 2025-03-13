package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class DoubleVector
  extends BaseVector
{
  public double get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    return localByteBuffer.getDouble(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.DoubleVector
 * JD-Core Version:    0.7.0.1
 */