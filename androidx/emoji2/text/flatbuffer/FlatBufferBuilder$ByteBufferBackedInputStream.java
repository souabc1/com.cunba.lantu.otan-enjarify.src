package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

class FlatBufferBuilder$ByteBufferBackedInputStream
  extends InputStream
{
  public ByteBuffer o00OoOoo;
  
  public int read()
  {
    try
    {
      ByteBuffer localByteBuffer = this.o00OoOoo;
      return localByteBuffer.get() & 0xFF;
    }
    catch (BufferUnderflowException localBufferUnderflowException) {}
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferBackedInputStream
 * JD-Core Version:    0.7.0.1
 */