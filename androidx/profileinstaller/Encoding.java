package androidx.profileinstaller;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

class Encoding
{
  public static long OooO(InputStream paramInputStream)
  {
    return OooO0oO(paramInputStream, 4);
  }
  
  public static int OooO00o(int paramInt)
  {
    return (paramInt + 8 + -1 & 0xFFFFFFF8) / 8;
  }
  
  /* Error */
  public static byte[] OooO0O0(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 15	java/util/zip/Deflater
    //   3: astore_1
    //   4: iconst_1
    //   5: istore_2
    //   6: aload_1
    //   7: iload_2
    //   8: invokespecial 19	java/util/zip/Deflater:<init>	(I)V
    //   11: new 21	java/io/ByteArrayOutputStream
    //   14: astore_3
    //   15: aload_3
    //   16: invokespecial 22	java/io/ByteArrayOutputStream:<init>	()V
    //   19: new 24	java/util/zip/DeflaterOutputStream
    //   22: astore 4
    //   24: aload 4
    //   26: aload_3
    //   27: aload_1
    //   28: invokespecial 27	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    //   31: aload 4
    //   33: aload_0
    //   34: invokevirtual 33	java/io/OutputStream:write	([B)V
    //   37: aload 4
    //   39: invokevirtual 36	java/util/zip/DeflaterOutputStream:close	()V
    //   42: aload_1
    //   43: invokevirtual 39	java/util/zip/Deflater:end	()V
    //   46: aload_3
    //   47: invokevirtual 43	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   50: areturn
    //   51: astore_0
    //   52: aload 4
    //   54: invokevirtual 36	java/util/zip/DeflaterOutputStream:close	()V
    //   57: goto +9 -> 66
    //   60: astore_3
    //   61: aload_0
    //   62: aload_3
    //   63: invokevirtual 49	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   66: aload_0
    //   67: athrow
    //   68: astore_0
    //   69: aload_1
    //   70: invokevirtual 39	java/util/zip/Deflater:end	()V
    //   73: aload_0
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramArrayOfByte	byte[]
    //   3	67	1	localDeflater	java.util.zip.Deflater
    //   5	3	2	i	int
    //   14	33	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   60	3	3	localThrowable	Throwable
    //   22	31	4	localDeflaterOutputStream	java.util.zip.DeflaterOutputStream
    // Exception table:
    //   from	to	target	type
    //   33	37	51	finally
    //   52	57	60	finally
    //   19	22	68	finally
    //   27	31	68	finally
    //   37	42	68	finally
    //   62	66	68	finally
    //   66	68	68	finally
  }
  
  public static RuntimeException OooO0OO(String paramString)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>(paramString);
    return localIllegalStateException;
  }
  
  public static byte[] OooO0Oo(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInt - i;
      j = paramInputStream.read(arrayOfByte, i, j);
      if (j >= 0)
      {
        i += j;
      }
      else
      {
        paramInputStream = new java/lang/StringBuilder;
        paramInputStream.<init>();
        paramInputStream.append("Not enough bytes to read: ");
        paramInputStream.append(paramInt);
        throw OooO0OO(paramInputStream.toString());
      }
    }
    return arrayOfByte;
  }
  
  public static String OooO0o(InputStream paramInputStream, int paramInt)
  {
    String str = new java/lang/String;
    paramInputStream = OooO0Oo(paramInputStream, paramInt);
    Charset localCharset = StandardCharsets.UTF_8;
    str.<init>(paramInputStream, localCharset);
    return str;
  }
  
  public static byte[] OooO0o0(InputStream paramInputStream, int paramInt1, int paramInt2)
  {
    Inflater localInflater = new java/util/zip/Inflater;
    localInflater.<init>();
    try
    {
      byte[] arrayOfByte1 = new byte[paramInt2];
      int i = 2048;
      byte[] arrayOfByte2 = new byte[i];
      int j = 0;
      int k = 0;
      for (;;)
      {
        boolean bool1 = localInflater.finished();
        if (bool1) {
          break label176;
        }
        bool1 = localInflater.needsDictionary();
        if ((bool1) || (j >= paramInt1)) {
          break label176;
        }
        int m = paramInputStream.read(arrayOfByte2);
        if (m >= 0)
        {
          localInflater.setInput(arrayOfByte2, 0, m);
          int n = paramInt2 - k;
          try
          {
            n = localInflater.inflate(arrayOfByte1, k, n);
            k += n;
            j += m;
          }
          catch (DataFormatException paramInputStream)
          {
            paramInputStream = paramInputStream.getMessage();
            paramInputStream = OooO0OO(paramInputStream);
            throw paramInputStream;
          }
        }
      }
      paramInputStream = new java/lang/StringBuilder;
      paramInputStream.<init>();
      String str1 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ";
      paramInputStream.append(str1);
      paramInputStream.append(paramInt1);
      String str2 = " bytes";
      paramInputStream.append(str2);
      paramInputStream = paramInputStream.toString();
      paramInputStream = OooO0OO(paramInputStream);
      throw paramInputStream;
      label176:
      if (j == paramInt1)
      {
        boolean bool2 = localInflater.finished();
        if (bool2) {
          return arrayOfByte1;
        }
        paramInputStream = "Inflater did not finish";
        paramInputStream = OooO0OO(paramInputStream);
        throw paramInputStream;
      }
      paramInputStream = new java/lang/StringBuilder;
      paramInputStream.<init>();
      str1 = "Didn't read enough bytes during decompression. expected=";
      paramInputStream.append(str1);
      paramInputStream.append(paramInt1);
      str2 = " actual=";
      paramInputStream.append(str2);
      paramInputStream.append(j);
      paramInputStream = paramInputStream.toString();
      paramInputStream = OooO0OO(paramInputStream);
      throw paramInputStream;
    }
    finally
    {
      localInflater.end();
    }
  }
  
  public static long OooO0oO(InputStream paramInputStream, int paramInt)
  {
    paramInputStream = OooO0Oo(paramInputStream, paramInt);
    long l1 = 0L;
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream[i] & 0xFF;
      long l2 = j;
      int k = i * 8;
      l2 <<= k;
      l1 += l2;
      i += 1;
    }
    return l1;
  }
  
  public static int OooO0oo(InputStream paramInputStream)
  {
    return (int)OooO0oO(paramInputStream, 2);
  }
  
  public static int OooOO0(InputStream paramInputStream)
  {
    return (int)OooO0oO(paramInputStream, 1);
  }
  
  public static int OooOO0O(String paramString)
  {
    Charset localCharset = StandardCharsets.UTF_8;
    return paramString.getBytes(localCharset).length;
  }
  
  public static void OooOO0o(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 512;
    byte[] arrayOfByte = new byte[i];
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j <= 0) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, j);
    }
  }
  
  public static void OooOOO(OutputStream paramOutputStream, String paramString)
  {
    Charset localCharset = StandardCharsets.UTF_8;
    paramString = paramString.getBytes(localCharset);
    paramOutputStream.write(paramString);
  }
  
  public static void OooOOO0(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    long l = paramArrayOfByte.length;
    OooOOo0(paramOutputStream, l);
    paramArrayOfByte = OooO0O0(paramArrayOfByte);
    l = paramArrayOfByte.length;
    OooOOo0(paramOutputStream, l);
    paramOutputStream.write(paramArrayOfByte);
  }
  
  public static void OooOOOO(OutputStream paramOutputStream, long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = i * 8;
      long l1 = paramLong >> j;
      long l2 = 255L;
      l1 &= l2;
      j = (byte)(int)l1;
      arrayOfByte[i] = j;
      i += 1;
    }
    paramOutputStream.write(arrayOfByte);
  }
  
  public static void OooOOOo(OutputStream paramOutputStream, int paramInt)
  {
    long l = paramInt;
    OooOOOO(paramOutputStream, l, 2);
  }
  
  public static void OooOOo(OutputStream paramOutputStream, int paramInt)
  {
    long l = paramInt;
    OooOOOO(paramOutputStream, l, 1);
  }
  
  public static void OooOOo0(OutputStream paramOutputStream, long paramLong)
  {
    OooOOOO(paramOutputStream, paramLong, 4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.Encoding
 * JD-Core Version:    0.7.0.1
 */