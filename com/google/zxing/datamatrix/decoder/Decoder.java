package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class Decoder
{
  private final ReedSolomonDecoder rsDecoder;
  
  public Decoder()
  {
    ReedSolomonDecoder localReedSolomonDecoder = new com/google/zxing/common/reedsolomon/ReedSolomonDecoder;
    GenericGF localGenericGF = GenericGF.DATA_MATRIX_FIELD_256;
    localReedSolomonDecoder.<init>(localGenericGF);
    this.rsDecoder = localReedSolomonDecoder;
  }
  
  private void correctErrors(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 0;
    while (k < i)
    {
      int m = paramArrayOfByte[k] & 0xFF;
      arrayOfInt[k] = m;
      k += 1;
    }
    try
    {
      ReedSolomonDecoder localReedSolomonDecoder = this.rsDecoder;
      k = paramArrayOfByte.length - paramInt;
      localReedSolomonDecoder.decode(arrayOfInt, k);
      while (j < paramInt)
      {
        i = (byte)arrayOfInt[j];
        paramArrayOfByte[j] = i;
        j += 1;
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
    Object localObject1 = new com/google/zxing/datamatrix/decoder/BitMatrixParser;
    ((BitMatrixParser)localObject1).<init>(paramBitMatrix);
    paramBitMatrix = ((BitMatrixParser)localObject1).getVersion();
    localObject1 = ((BitMatrixParser)localObject1).readCodewords();
    paramBitMatrix = DataBlock.getDataBlocks((byte[])localObject1, paramBitMatrix);
    int i = paramBitMatrix.length;
    int j = 0;
    int k = 0;
    Object localObject2;
    int m;
    while (j < i)
    {
      localObject2 = paramBitMatrix[j];
      m = localObject2.getNumDataCodewords();
      k += m;
      j += 1;
    }
    localObject1 = new byte[k];
    j = paramBitMatrix.length;
    k = 0;
    while (k < j)
    {
      localObject2 = paramBitMatrix[k];
      byte[] arrayOfByte = localObject2.getCodewords();
      m = localObject2.getNumDataCodewords();
      correctErrors(arrayOfByte, m);
      int n = 0;
      while (n < m)
      {
        int i1 = n * j + k;
        int i2 = arrayOfByte[n];
        localObject1[i1] = i2;
        n += 1;
      }
      k += 1;
    }
    return DecodedBitStreamParser.decode((byte[])localObject1);
  }
  
  public DecoderResult decode(boolean[][] paramArrayOfBoolean)
  {
    paramArrayOfBoolean = BitMatrix.parse(paramArrayOfBoolean);
    return decode(paramArrayOfBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.Decoder
 * JD-Core Version:    0.7.0.1
 */