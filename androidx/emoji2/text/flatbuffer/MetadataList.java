package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class MetadataList
  extends Table
{
  public static MetadataList OooOOO(ByteBuffer paramByteBuffer, MetadataList paramMetadataList)
  {
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    paramByteBuffer.order(localByteOrder);
    int i = paramByteBuffer.position();
    i = paramByteBuffer.getInt(i);
    int j = paramByteBuffer.position();
    i += j;
    return paramMetadataList.OooOO0(i, paramByteBuffer);
  }
  
  public static MetadataList OooOOO0(ByteBuffer paramByteBuffer)
  {
    MetadataList localMetadataList = new androidx/emoji2/text/flatbuffer/MetadataList;
    localMetadataList.<init>();
    return OooOOO(paramByteBuffer, localMetadataList);
  }
  
  public MetadataList OooOO0(int paramInt, ByteBuffer paramByteBuffer)
  {
    OooOO0O(paramInt, paramByteBuffer);
    return this;
  }
  
  public void OooOO0O(int paramInt, ByteBuffer paramByteBuffer)
  {
    OooO0Oo(paramInt, paramByteBuffer);
  }
  
  public MetadataItem OooOOOO(MetadataItem paramMetadataItem, int paramInt)
  {
    int i = OooO0OO(6);
    if (i != 0)
    {
      i = OooO0oO(i);
      paramInt *= 4;
      i += paramInt;
      paramInt = OooO00o(i);
      ByteBuffer localByteBuffer = this.OooO0O0;
      paramMetadataItem = paramMetadataItem.OooOO0(paramInt, localByteBuffer);
    }
    else
    {
      paramMetadataItem = null;
    }
    return paramMetadataItem;
  }
  
  public int OooOOOo()
  {
    int i = OooO0OO(6);
    if (i != 0) {
      i = OooO0oo(i);
    } else {
      i = 0;
    }
    return i;
  }
  
  public int OooOOo()
  {
    int i = OooO0OO(4);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getInt(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public String OooOOo0()
  {
    int i = OooO0OO(8);
    String str;
    if (i != 0)
    {
      int j = this.OooO00o;
      i += j;
      str = OooO0o0(i);
    }
    else
    {
      i = 0;
      str = null;
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataList
 * JD-Core Version:    0.7.0.1
 */