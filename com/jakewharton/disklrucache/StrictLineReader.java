package com.jakewharton.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import m54207b69;

class StrictLineReader
  implements Closeable
{
  public final InputStream o00OoOoo;
  public byte[] o00Ooo0;
  public final Charset o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  
  public StrictLineReader(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream != null) && (paramCharset != null))
    {
      if (paramInt >= 0)
      {
        Charset localCharset = Util.OooO00o;
        boolean bool = paramCharset.equals(localCharset);
        if (bool)
        {
          this.o00OoOoo = paramInputStream;
          this.o00Ooo00 = paramCharset;
          paramInputStream = new byte[paramInt];
          this.o00Ooo0 = paramInputStream;
          return;
        }
        paramInputStream = new java/lang/IllegalArgumentException;
        str = m54207b69.F54207b69_11("RN1B213F3E4243274342343479372D3B303A38323C");
        paramInputStream.<init>(str);
        throw paramInputStream;
      }
      paramInputStream = new java/lang/IllegalArgumentException;
      String str = m54207b69.F54207b69_11("Dk080B1D0D0C0725195360605667");
      paramInputStream.<init>(str);
      throw paramInputStream;
    }
    throw null;
  }
  
  public StrictLineReader(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  public final void OooO0OO()
  {
    Object localObject = this.o00OoOoo;
    byte[] arrayOfByte = this.o00Ooo0;
    int i = arrayOfByte.length;
    int j = ((InputStream)localObject).read(arrayOfByte, 0, i);
    int k = -1;
    if (j != k)
    {
      this.o00Ooo0O = 0;
      this.o00Ooo0o = j;
      return;
    }
    localObject = new java/io/EOFException;
    ((EOFException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public String OooO0Oo()
  {
    synchronized (this.o00OoOoo)
    {
      Object localObject1 = this.o00Ooo0;
      if (localObject1 != null)
      {
        int i = this.o00Ooo0O;
        int j = this.o00Ooo0o;
        if (i >= j) {
          OooO0OO();
        }
        i = this.o00Ooo0O;
        int k;
        for (;;)
        {
          j = this.o00Ooo0o;
          k = 10;
          if (i == j) {
            break;
          }
          localObject3 = this.o00Ooo0;
          m = localObject3[i];
          if (m == k)
          {
            k = this.o00Ooo0O;
            if (i != k)
            {
              m = i + -1;
              n = localObject3[m];
              int i1 = 13;
              if (n == i1) {}
            }
            else
            {
              m = i;
            }
            String str = new java/lang/String;
            m -= k;
            Object localObject4 = this.o00Ooo00;
            localObject4 = ((Charset)localObject4).name();
            str.<init>((byte[])localObject3, k, m, (String)localObject4);
            i += 1;
            this.o00Ooo0O = i;
            return str;
          }
          i += 1;
        }
        localObject1 = new com/jakewharton/disklrucache/StrictLineReader$1;
        j = this.o00Ooo0o;
        int m = this.o00Ooo0O;
        j = j - m + 80;
        ((StrictLineReader.1)localObject1).<init>(this, j);
        localObject3 = this.o00Ooo0;
        m = this.o00Ooo0O;
        int n = this.o00Ooo0o - m;
        ((ByteArrayOutputStream)localObject1).write((byte[])localObject3, m, n);
        j = -1;
        this.o00Ooo0o = j;
        OooO0OO();
        j = this.o00Ooo0O;
        for (;;)
        {
          m = this.o00Ooo0o;
          if (j == m) {
            break;
          }
          byte[] arrayOfByte = this.o00Ooo0;
          n = arrayOfByte[j];
          if (n == k)
          {
            k = this.o00Ooo0O;
            if (j != k)
            {
              n = j - k;
              ((ByteArrayOutputStream)localObject1).write(arrayOfByte, k, n);
            }
            j += 1;
            this.o00Ooo0O = j;
            localObject1 = ((ByteArrayOutputStream)localObject1).toString();
            return localObject1;
          }
          j += 1;
        }
      }
      localObject1 = new java/io/IOException;
      Object localObject3 = "aD082E2C241A262B27293F6E38437135373B483333";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      ((IOException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
  }
  
  public void close()
  {
    synchronized (this.o00OoOoo)
    {
      Object localObject1 = this.o00Ooo0;
      if (localObject1 != null)
      {
        localObject1 = null;
        this.o00Ooo0 = null;
        localObject1 = this.o00OoOoo;
        ((InputStream)localObject1).close();
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.StrictLineReader
 * JD-Core Version:    0.7.0.1
 */