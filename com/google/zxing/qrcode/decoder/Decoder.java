package com.google.zxing.qrcode.decoder;

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
  private final ReedSolomonDecoder rsDecoder;
  
  public Decoder()
  {
    ReedSolomonDecoder localReedSolomonDecoder = new com/google/zxing/common/reedsolomon/ReedSolomonDecoder;
    GenericGF localGenericGF = GenericGF.QR_CODE_FIELD_256;
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
  
  private DecoderResult decode(BitMatrixParser paramBitMatrixParser, Map paramMap)
  {
    Version localVersion = paramBitMatrixParser.readVersion();
    ErrorCorrectionLevel localErrorCorrectionLevel = paramBitMatrixParser.readFormatInformation().getErrorCorrectionLevel();
    paramBitMatrixParser = DataBlock.getDataBlocks(paramBitMatrixParser.readCodewords(), localVersion, localErrorCorrectionLevel);
    int i = paramBitMatrixParser.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      localObject1 = paramBitMatrixParser[j];
      m = localObject1.getNumDataCodewords();
      k += m;
      j += 1;
    }
    byte[] arrayOfByte1 = new byte[k];
    j = paramBitMatrixParser.length;
    k = 0;
    int m = 0;
    Object localObject1 = null;
    while (k < j)
    {
      Object localObject2 = paramBitMatrixParser[k];
      byte[] arrayOfByte2 = localObject2.getCodewords();
      int n = localObject2.getNumDataCodewords();
      correctErrors(arrayOfByte2, n);
      int i1 = 0;
      while (i1 < n)
      {
        int i2 = m + 1;
        int i3 = arrayOfByte2[i1];
        arrayOfByte1[m] = i3;
        i1 += 1;
        m = i2;
      }
      k += 1;
    }
    return DecodedBitStreamParser.decode(arrayOfByte1, localVersion, localErrorCorrectionLevel, paramMap);
  }
  
  public DecoderResult decode(BitMatrix paramBitMatrix)
  {
    return decode(paramBitMatrix, null);
  }
  
  public DecoderResult decode(BitMatrix paramBitMatrix, Map paramMap)
  {
    Object localObject1 = new com/google/zxing/qrcode/decoder/BitMatrixParser;
    ((BitMatrixParser)localObject1).<init>(paramBitMatrix);
    paramBitMatrix = null;
    Object localObject2;
    try
    {
      return decode((BitMatrixParser)localObject1, paramMap);
    }
    catch (ChecksumException localChecksumException) {}catch (FormatException localFormatException1)
    {
      localObject2 = null;
      paramBitMatrix = localFormatException1;
    }
    try
    {
      ((BitMatrixParser)localObject1).remask();
      boolean bool = true;
      ((BitMatrixParser)localObject1).setMirror(bool);
      ((BitMatrixParser)localObject1).readVersion();
      ((BitMatrixParser)localObject1).readFormatInformation();
      ((BitMatrixParser)localObject1).mirror();
      paramMap = decode((BitMatrixParser)localObject1, paramMap);
      localObject1 = new com/google/zxing/qrcode/decoder/QRCodeDecoderMetaData;
      ((QRCodeDecoderMetaData)localObject1).<init>(bool);
      paramMap.setOther(localObject1);
      return paramMap;
    }
    catch (FormatException|ChecksumException localFormatException2)
    {
      if (paramBitMatrix != null) {
        throw paramBitMatrix;
      }
      throw localObject2;
    }
  }
  
  public DecoderResult decode(boolean[][] paramArrayOfBoolean)
  {
    return decode(paramArrayOfBoolean, null);
  }
  
  public DecoderResult decode(boolean[][] paramArrayOfBoolean, Map paramMap)
  {
    paramArrayOfBoolean = BitMatrix.parse(paramArrayOfBoolean);
    return decode(paramArrayOfBoolean, paramMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.Decoder
 * JD-Core Version:    0.7.0.1
 */