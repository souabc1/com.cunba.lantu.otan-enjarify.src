package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

public final class Decoder
{
  private static final int ALL = 0;
  private static final int EVEN = 1;
  private static final int ODD = 2;
  private final ReedSolomonDecoder rsDecoder;
  
  public Decoder()
  {
    ReedSolomonDecoder localReedSolomonDecoder = new com/google/zxing/common/reedsolomon/ReedSolomonDecoder;
    GenericGF localGenericGF = GenericGF.MAXICODE_FIELD_64;
    localReedSolomonDecoder.<init>(localGenericGF);
    this.rsDecoder = localReedSolomonDecoder;
  }
  
  private void correctErrors(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2 + paramInt3;
    int j;
    if (paramInt4 == 0) {
      j = 1;
    } else {
      j = 2;
    }
    int k = i / j;
    int[] arrayOfInt = new int[k];
    int m = 0;
    int n = 0;
    while (n < i)
    {
      int i1;
      int i2;
      if (paramInt4 != 0)
      {
        i1 = n % 2;
        i2 = paramInt4 + -1;
        if (i1 != i2) {}
      }
      else
      {
        i1 = n / j;
        i2 = n + paramInt1;
        i2 = paramArrayOfByte[i2] & 0xFF;
        arrayOfInt[i1] = i2;
      }
      n += 1;
    }
    try
    {
      ReedSolomonDecoder localReedSolomonDecoder = this.rsDecoder;
      paramInt3 /= j;
      localReedSolomonDecoder.decode(arrayOfInt, paramInt3);
      while (m < paramInt2)
      {
        if (paramInt4 != 0)
        {
          paramInt3 = m % 2;
          i = paramInt4 + -1;
          if (paramInt3 != i) {}
        }
        else
        {
          paramInt3 = m + paramInt1;
          i = m / j;
          i = (byte)arrayOfInt[i];
          paramArrayOfByte[paramInt3] = i;
        }
        m += 1;
      }
      return;
    }
    catch (ReedSolomonException localReedSolomonException)
    {
      throw ChecksumException.getChecksumInstance();
    }
  }
  
  public DecoderResult decode(BitMatrix paramBitMatrix)
  {
    return decode(paramBitMatrix, null);
  }
  
  public DecoderResult decode(BitMatrix paramBitMatrix, Map paramMap)
  {
    paramMap = new com/google/zxing/maxicode/decoder/BitMatrixParser;
    paramMap.<init>(paramBitMatrix);
    paramBitMatrix = paramMap.readCodewords();
    int i = 0;
    int j = 10;
    int k = 10;
    int m = 0;
    Object localObject = this;
    correctErrors(paramBitMatrix, 0, j, k, 0);
    int n = 0;
    paramMap = null;
    int i1 = paramBitMatrix[0] & 0xF;
    int i2 = 2;
    if (i1 != i2)
    {
      i2 = 3;
      if (i1 != i2)
      {
        i2 = 4;
        if (i1 != i2)
        {
          i2 = 5;
          if (i1 == i2)
          {
            i = 20;
            j = 68;
            k = 56;
            correctErrors(paramBitMatrix, i, j, k, 1);
            m = 2;
            correctErrors(paramBitMatrix, i, j, k, m);
            i2 = 78;
            break label186;
          }
          throw FormatException.getFormatInstance();
        }
      }
    }
    i = 20;
    j = 84;
    k = 40;
    localObject = this;
    correctErrors(paramBitMatrix, i, j, k, 1);
    m = 2;
    correctErrors(paramBitMatrix, i, j, k, m);
    i2 = 94;
    label186:
    localObject = new byte[i2];
    int i3 = 10;
    System.arraycopy(paramBitMatrix, 0, localObject, 0, i3);
    n = localObject.length - i3;
    System.arraycopy(paramBitMatrix, 20, localObject, i3, n);
    return DecodedBitStreamParser.decode((byte[])localObject, i1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.maxicode.decoder.Decoder
 * JD-Core Version:    0.7.0.1
 */