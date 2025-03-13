package androidx.versionedparcelable;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class VersionedParcelStream$1
  extends FilterInputStream
{
  public VersionedParcelStream$1(VersionedParcelStream paramVersionedParcelStream, InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int read()
  {
    Object localObject = this.o00OoOoo;
    int i = ((VersionedParcelStream)localObject).OooOO0o;
    int j = -1;
    if (i != j)
    {
      k = ((VersionedParcelStream)localObject).OooOO0;
      if (k >= i)
      {
        localObject = new java/io/IOException;
        ((IOException)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int k = super.read();
    VersionedParcelStream localVersionedParcelStream = this.o00OoOoo;
    j = localVersionedParcelStream.OooOO0 + 1;
    localVersionedParcelStream.OooOO0 = j;
    return k;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    VersionedParcelStream localVersionedParcelStream1 = this.o00OoOoo;
    int i = localVersionedParcelStream1.OooOO0o;
    int j = -1;
    if (i != j)
    {
      int k = localVersionedParcelStream1.OooOO0;
      if (k >= i)
      {
        paramArrayOfByte = new java/io/IOException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
      }
    }
    int m = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (m > 0)
    {
      VersionedParcelStream localVersionedParcelStream2 = this.o00OoOoo;
      paramInt2 = localVersionedParcelStream2.OooOO0 + m;
      localVersionedParcelStream2.OooOO0 = paramInt2;
    }
    return m;
  }
  
  public long skip(long paramLong)
  {
    VersionedParcelStream localVersionedParcelStream = this.o00OoOoo;
    int i = localVersionedParcelStream.OooOO0o;
    int j = -1;
    if (i != j)
    {
      int k = localVersionedParcelStream.OooOO0;
      if (k >= i)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>();
        throw localIOException;
      }
    }
    paramLong = super.skip(paramLong);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      localVersionedParcelStream = this.o00OoOoo;
      i = localVersionedParcelStream.OooOO0;
      j = (int)paramLong;
      i += j;
      localVersionedParcelStream.OooOO0 = i;
    }
    return paramLong;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelStream.1
 * JD-Core Version:    0.7.0.1
 */