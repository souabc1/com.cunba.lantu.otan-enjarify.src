package androidx.emoji2.text;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

class MetadataListReader$InputStreamOpenTypeReader
  implements MetadataListReader.OpenTypeReader
{
  public final byte[] OooO00o;
  public final ByteBuffer OooO0O0;
  public final InputStream OooO0OO;
  public long OooO0Oo;
  
  public int OooO00o()
  {
    this.OooO0O0.position(0);
    OooO0Oo(4);
    return this.OooO0O0.getInt();
  }
  
  public void OooO0O0(int paramInt)
  {
    while (paramInt > 0)
    {
      InputStream localInputStream = this.OooO0OO;
      long l1 = paramInt;
      long l2 = localInputStream.skip(l1);
      int i = (int)l2;
      int j = 1;
      if (i >= j)
      {
        paramInt -= i;
        l1 = this.OooO0Oo;
        long l3 = i;
        l1 += l3;
        this.OooO0Oo = l1;
      }
      else
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("Skip didn't move at least 1 byte forward");
        throw localIOException;
      }
    }
  }
  
  public long OooO0OO()
  {
    this.OooO0O0.position(0);
    OooO0Oo(4);
    return MetadataListReader.OooO0OO(this.OooO0O0.getInt());
  }
  
  public final void OooO0Oo(int paramInt)
  {
    InputStream localInputStream = this.OooO0OO;
    byte[] arrayOfByte = this.OooO00o;
    int i = localInputStream.read(arrayOfByte, 0, paramInt);
    if (i == paramInt)
    {
      long l1 = this.OooO0Oo;
      long l2 = paramInt;
      l1 += l2;
      this.OooO0Oo = l1;
      return;
    }
    IOException localIOException = new java/io/IOException;
    localIOException.<init>("read failed");
    throw localIOException;
  }
  
  public long getPosition()
  {
    return this.OooO0Oo;
  }
  
  public int readUnsignedShort()
  {
    this.OooO0O0.position(0);
    OooO0Oo(2);
    return MetadataListReader.OooO0Oo(this.OooO0O0.getShort());
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader
 * JD-Core Version:    0.7.0.1
 */