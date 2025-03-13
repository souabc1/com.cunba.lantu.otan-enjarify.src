package androidx.emoji2.text;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class MetadataListReader$ByteBufferReader
  implements MetadataListReader.OpenTypeReader
{
  public final ByteBuffer OooO00o;
  
  public MetadataListReader$ByteBufferReader(ByteBuffer paramByteBuffer)
  {
    this.OooO00o = paramByteBuffer;
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    paramByteBuffer.order(localByteOrder);
  }
  
  public int OooO00o()
  {
    return this.OooO00o.getInt();
  }
  
  public void OooO0O0(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO00o;
    int i = localByteBuffer.position() + paramInt;
    localByteBuffer.position(i);
  }
  
  public long OooO0OO()
  {
    return MetadataListReader.OooO0OO(this.OooO00o.getInt());
  }
  
  public long getPosition()
  {
    return this.OooO00o.position();
  }
  
  public int readUnsignedShort()
  {
    return MetadataListReader.OooO0Oo(this.OooO00o.getShort());
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.MetadataListReader.ByteBufferReader
 * JD-Core Version:    0.7.0.1
 */