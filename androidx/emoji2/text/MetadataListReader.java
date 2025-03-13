package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;

class MetadataListReader
{
  public static MetadataListReader.OffsetInfo OooO00o(MetadataListReader.OpenTypeReader paramOpenTypeReader)
  {
    int i = 4;
    paramOpenTypeReader.OooO0O0(i);
    int k = paramOpenTypeReader.readUnsignedShort();
    int m = 100;
    String str = "Cannot read metadata.";
    if (k <= m)
    {
      paramOpenTypeReader.OooO0O0(6);
      m = 0;
      int n = 0;
      long l1;
      int i2;
      for (;;)
      {
        l1 = -1;
        if (n >= k) {
          break;
        }
        i2 = paramOpenTypeReader.OooO00o();
        paramOpenTypeReader.OooO0O0(i);
        l2 = paramOpenTypeReader.OooO0OO();
        paramOpenTypeReader.OooO0O0(i);
        int i3 = 1835365473;
        if (i3 == i2) {
          break label108;
        }
        n += 1;
      }
      long l2 = l1;
      label108:
      boolean bool1 = l2 < l1;
      if (bool1)
      {
        long l3 = paramOpenTypeReader.getPosition();
        int j = (int)(l2 - l3);
        paramOpenTypeReader.OooO0O0(j);
        j = 12;
        paramOpenTypeReader.OooO0O0(j);
        l3 = paramOpenTypeReader.OooO0OO();
        long l5;
        for (;;)
        {
          long l4 = m;
          boolean bool2 = l4 < l3;
          if (!bool2) {
            break label251;
          }
          int i1 = paramOpenTypeReader.OooO00o();
          l1 = paramOpenTypeReader.OooO0OO();
          l5 = paramOpenTypeReader.OooO0OO();
          i2 = 1164798569;
          if (i2 == i1) {
            break;
          }
          i2 = 1701669481;
          if (i2 == i1) {
            break;
          }
          m += 1;
        }
        paramOpenTypeReader = new androidx/emoji2/text/MetadataListReader$OffsetInfo;
        l1 += l2;
        paramOpenTypeReader.<init>(l1, l5);
        return paramOpenTypeReader;
      }
      label251:
      paramOpenTypeReader = new java/io/IOException;
      paramOpenTypeReader.<init>(str);
      throw paramOpenTypeReader;
    }
    paramOpenTypeReader = new java/io/IOException;
    paramOpenTypeReader.<init>(str);
    throw paramOpenTypeReader;
  }
  
  public static MetadataList OooO0O0(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = paramByteBuffer.duplicate();
    MetadataListReader.ByteBufferReader localByteBufferReader = new androidx/emoji2/text/MetadataListReader$ByteBufferReader;
    localByteBufferReader.<init>(paramByteBuffer);
    int i = (int)OooO00o(localByteBufferReader).getStartOffset();
    paramByteBuffer.position(i);
    return MetadataList.OooOOO0(paramByteBuffer);
  }
  
  public static long OooO0OO(int paramInt)
  {
    return paramInt & 0xFFFFFFFF;
  }
  
  public static int OooO0Oo(short paramShort)
  {
    return paramShort & (char)-1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.MetadataListReader
 * JD-Core Version:    0.7.0.1
 */