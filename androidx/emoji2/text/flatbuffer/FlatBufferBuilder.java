package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FlatBufferBuilder
{
  public int OooO;
  public ByteBuffer OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int[] OooO0Oo;
  public boolean OooO0o;
  public int OooO0o0;
  public boolean OooO0oO;
  public int[] OooO0oo;
  public int OooOO0;
  public boolean OooOO0O;
  public FlatBufferBuilder.ByteBufferFactory OooOO0o;
  public final Utf8 OooOOO0;
  
  public FlatBufferBuilder()
  {
    this(1024);
  }
  
  public FlatBufferBuilder(int paramInt)
  {
    this(paramInt, localHeapByteBufferFactory, null, localUtf8);
  }
  
  public FlatBufferBuilder(int paramInt, FlatBufferBuilder.ByteBufferFactory paramByteBufferFactory, ByteBuffer paramByteBuffer, Utf8 paramUtf8)
  {
    int i = 1;
    this.OooO0OO = i;
    this.OooO0Oo = null;
    this.OooO0o0 = 0;
    this.OooO0o = false;
    this.OooO0oO = false;
    int j = 16;
    int[] arrayOfInt = new int[j];
    this.OooO0oo = arrayOfInt;
    this.OooO = 0;
    this.OooOO0 = 0;
    this.OooOO0O = false;
    if (paramInt <= 0) {
      paramInt = i;
    }
    this.OooOO0o = paramByteBufferFactory;
    ByteBuffer localByteBuffer;
    if (paramByteBuffer != null)
    {
      this.OooO00o = paramByteBuffer;
      paramByteBuffer.clear();
      localByteBuffer = this.OooO00o;
      paramByteBufferFactory = ByteOrder.LITTLE_ENDIAN;
      localByteBuffer.order(paramByteBufferFactory);
    }
    else
    {
      localByteBuffer = paramByteBufferFactory.OooO00o(paramInt);
      this.OooO00o = localByteBuffer;
    }
    this.OooOOO0 = paramUtf8;
    paramInt = this.OooO00o.capacity();
    this.OooO0O0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder
 * JD-Core Version:    0.7.0.1
 */