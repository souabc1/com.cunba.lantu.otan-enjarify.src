package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class Utf8Safe
  extends Utf8
{
  public static String OooO0O0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1 | paramInt2;
    int j = paramArrayOfByte.length - paramInt1 - paramInt2;
    i |= j;
    if (i >= 0)
    {
      i = paramInt1 + paramInt2;
      localObject = new char[paramInt2];
      int i1;
      for (j = 0; paramInt1 < i; j = i1)
      {
        byte b = paramArrayOfByte[paramInt1];
        boolean bool4 = Utf8.DecodeUtil.OooO0oO(b);
        if (!bool4) {
          break;
        }
        paramInt1 += 1;
        i1 = j + 1;
        Utf8.DecodeUtil.OooO0O0(b, (char[])localObject, j);
      }
      int i3 = j;
      while (paramInt1 < i)
      {
        j = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        boolean bool1 = Utf8.DecodeUtil.OooO0oO(paramInt1);
        int i2;
        if (bool1)
        {
          int k = i3 + 1;
          Utf8.DecodeUtil.OooO0O0(paramInt1, (char[])localObject, i3);
          while (j < i)
          {
            paramInt1 = paramArrayOfByte[j];
            boolean bool5 = Utf8.DecodeUtil.OooO0oO(paramInt1);
            if (!bool5) {
              break;
            }
            j += 1;
            i2 = k + 1;
            Utf8.DecodeUtil.OooO0O0(paramInt1, (char[])localObject, k);
            k = i2;
          }
          paramInt1 = j;
          i3 = k;
        }
        else
        {
          boolean bool2 = Utf8.DecodeUtil.OooO(paramInt1);
          String str = "Invalid UTF-8";
          if (bool2)
          {
            if (j < i)
            {
              int m = j + 1;
              j = paramArrayOfByte[j];
              i2 = i3 + 1;
              Utf8.DecodeUtil.OooO0Oo(paramInt1, j, (char[])localObject, i3);
              paramInt1 = m;
              i3 = i2;
            }
            else
            {
              paramArrayOfByte = new java/lang/IllegalArgumentException;
              paramArrayOfByte.<init>(str);
              throw paramArrayOfByte;
            }
          }
          else
          {
            boolean bool3 = Utf8.DecodeUtil.OooO0oo(paramInt1);
            int n;
            int i4;
            if (bool3)
            {
              n = i + -1;
              if (j < n)
              {
                n = j + 1;
                j = paramArrayOfByte[j];
                i2 = n + 1;
                n = paramArrayOfByte[n];
                i4 = i3 + 1;
                Utf8.DecodeUtil.OooO0OO(paramInt1, j, n, (char[])localObject, i3);
                paramInt1 = i2;
                i3 = i4;
              }
              else
              {
                paramArrayOfByte = new java/lang/IllegalArgumentException;
                paramArrayOfByte.<init>(str);
                throw paramArrayOfByte;
              }
            }
            else
            {
              n = i + -2;
              if (j < n)
              {
                n = j + 1;
                i2 = paramArrayOfByte[j];
                j = n + 1;
                i4 = paramArrayOfByte[n];
                int i5 = j + 1;
                int i6 = paramArrayOfByte[j];
                int i7 = i3 + 1;
                j = paramInt1;
                n = i2;
                i2 = i4;
                i4 = i6;
                Utf8.DecodeUtil.OooO00o(paramInt1, n, i2, i6, (char[])localObject, i3);
                i7 += 1;
                paramInt1 = i5;
                i3 = i7;
              }
              else
              {
                paramArrayOfByte = new java/lang/IllegalArgumentException;
                paramArrayOfByte.<init>(str);
                throw paramArrayOfByte;
              }
            }
          }
        }
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((char[])localObject, 0, i3);
      return paramArrayOfByte;
    }
    ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException = new java/lang/ArrayIndexOutOfBoundsException;
    paramArrayOfByte = Integer.valueOf(paramArrayOfByte.length);
    Integer localInteger = Integer.valueOf(paramInt1);
    Object localObject = Integer.valueOf(paramInt2);
    Object[] tmp501_498 = new Object[3];
    Object[] tmp502_501 = tmp501_498;
    Object[] tmp502_501 = tmp501_498;
    tmp502_501[0] = paramArrayOfByte;
    tmp502_501[1] = localInteger;
    tmp502_501[2] = localObject;
    paramArrayOfByte = tmp502_501;
    paramArrayOfByte = String.format("buffer length=%d, index=%d, size=%d", paramArrayOfByte);
    localArrayIndexOutOfBoundsException.<init>(paramArrayOfByte);
    throw localArrayIndexOutOfBoundsException;
  }
  
  public static String OooO0OO(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    int i = paramInt1 | paramInt2;
    int j = paramByteBuffer.limit() - paramInt1 - paramInt2;
    i |= j;
    if (i >= 0)
    {
      i = paramInt1 + paramInt2;
      localObject = new char[paramInt2];
      int i1;
      for (j = 0; paramInt1 < i; j = i1)
      {
        byte b = paramByteBuffer.get(paramInt1);
        boolean bool4 = Utf8.DecodeUtil.OooO0oO(b);
        if (!bool4) {
          break;
        }
        paramInt1 += 1;
        i1 = j + 1;
        Utf8.DecodeUtil.OooO0O0(b, (char[])localObject, j);
      }
      int i3 = j;
      while (paramInt1 < i)
      {
        j = paramInt1 + 1;
        paramInt1 = paramByteBuffer.get(paramInt1);
        boolean bool1 = Utf8.DecodeUtil.OooO0oO(paramInt1);
        int i2;
        if (bool1)
        {
          int k = i3 + 1;
          Utf8.DecodeUtil.OooO0O0(paramInt1, (char[])localObject, i3);
          while (j < i)
          {
            paramInt1 = paramByteBuffer.get(j);
            boolean bool5 = Utf8.DecodeUtil.OooO0oO(paramInt1);
            if (!bool5) {
              break;
            }
            j += 1;
            i2 = k + 1;
            Utf8.DecodeUtil.OooO0O0(paramInt1, (char[])localObject, k);
            k = i2;
          }
          paramInt1 = j;
          i3 = k;
        }
        else
        {
          boolean bool2 = Utf8.DecodeUtil.OooO(paramInt1);
          String str = "Invalid UTF-8";
          if (bool2)
          {
            if (j < i)
            {
              int m = j + 1;
              j = paramByteBuffer.get(j);
              i2 = i3 + 1;
              Utf8.DecodeUtil.OooO0Oo(paramInt1, j, (char[])localObject, i3);
              paramInt1 = m;
              i3 = i2;
            }
            else
            {
              paramByteBuffer = new java/lang/IllegalArgumentException;
              paramByteBuffer.<init>(str);
              throw paramByteBuffer;
            }
          }
          else
          {
            boolean bool3 = Utf8.DecodeUtil.OooO0oo(paramInt1);
            int n;
            int i4;
            if (bool3)
            {
              n = i + -1;
              if (j < n)
              {
                n = j + 1;
                j = paramByteBuffer.get(j);
                i2 = n + 1;
                n = paramByteBuffer.get(n);
                i4 = i3 + 1;
                Utf8.DecodeUtil.OooO0OO(paramInt1, j, n, (char[])localObject, i3);
                paramInt1 = i2;
                i3 = i4;
              }
              else
              {
                paramByteBuffer = new java/lang/IllegalArgumentException;
                paramByteBuffer.<init>(str);
                throw paramByteBuffer;
              }
            }
            else
            {
              n = i + -2;
              if (j < n)
              {
                n = j + 1;
                i2 = paramByteBuffer.get(j);
                j = n + 1;
                i4 = paramByteBuffer.get(n);
                int i5 = j + 1;
                int i6 = paramByteBuffer.get(j);
                int i7 = i3 + 1;
                j = paramInt1;
                n = i2;
                i2 = i4;
                i4 = i6;
                Utf8.DecodeUtil.OooO00o(paramInt1, n, i2, i6, (char[])localObject, i3);
                i7 += 1;
                paramInt1 = i5;
                i3 = i7;
              }
              else
              {
                paramByteBuffer = new java/lang/IllegalArgumentException;
                paramByteBuffer.<init>(str);
                throw paramByteBuffer;
              }
            }
          }
        }
      }
      paramByteBuffer = new java/lang/String;
      paramByteBuffer.<init>((char[])localObject, 0, i3);
      return paramByteBuffer;
    }
    ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException = new java/lang/ArrayIndexOutOfBoundsException;
    paramByteBuffer = Integer.valueOf(paramByteBuffer.limit());
    Integer localInteger = Integer.valueOf(paramInt1);
    Object localObject = Integer.valueOf(paramInt2);
    Object[] tmp523_520 = new Object[3];
    Object[] tmp524_523 = tmp523_520;
    Object[] tmp524_523 = tmp523_520;
    tmp524_523[0] = paramByteBuffer;
    tmp524_523[1] = localInteger;
    tmp524_523[2] = localObject;
    paramByteBuffer = tmp524_523;
    paramByteBuffer = String.format("buffer limit=%d, index=%d, limit=%d", paramByteBuffer);
    localArrayIndexOutOfBoundsException.<init>(paramByteBuffer);
    throw localArrayIndexOutOfBoundsException;
  }
  
  public String OooO00o(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    boolean bool = paramByteBuffer.hasArray();
    if (bool)
    {
      byte[] arrayOfByte = paramByteBuffer.array();
      int i = paramByteBuffer.arrayOffset() + paramInt1;
      return OooO0O0(arrayOfByte, i, paramInt2);
    }
    return OooO0OO(paramByteBuffer, paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Safe
 * JD-Core Version:    0.7.0.1
 */