package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class FlatBufferBuilder$HeapByteBufferFactory
  extends FlatBufferBuilder.ByteBufferFactory
{
  public static final HeapByteBufferFactory OooO00o;
  
  static
  {
    HeapByteBufferFactory localHeapByteBufferFactory = new androidx/emoji2/text/flatbuffer/FlatBufferBuilder$HeapByteBufferFactory;
    localHeapByteBufferFactory.<init>();
    OooO00o = localHeapByteBufferFactory;
  }
  
  public ByteBuffer OooO00o(int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt);
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    return localByteBuffer.order(localByteOrder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory
 * JD-Core Version:    0.7.0.1
 */