package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

final class UPCEANExtension2Support
{
  private final int[] decodeMiddleCounters;
  private final StringBuilder decodeRowStringBuffer;
  
  public UPCEANExtension2Support()
  {
    Object localObject = new int[4];
    this.decodeMiddleCounters = ((int[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    this.decodeRowStringBuffer = ((StringBuilder)localObject);
  }
  
  private int decodeMiddle(BitArray paramBitArray, int[] paramArrayOfInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = this.decodeMiddleCounters;
    arrayOfInt[0] = 0;
    int i = 1;
    arrayOfInt[i] = 0;
    int j = 2;
    arrayOfInt[j] = 0;
    arrayOfInt[3] = 0;
    int k = paramBitArray.getSize();
    int m = paramArrayOfInt[i];
    int n = 0;
    int i1 = 0;
    while ((n < j) && (m < k))
    {
      int[][] arrayOfInt1 = UPCEANReader.L_AND_G_PATTERNS;
      int i2 = UPCEANReader.decodeDigit(paramBitArray, arrayOfInt, m, arrayOfInt1);
      char c = (char)(i2 % 10 + 48);
      paramStringBuilder.append(c);
      int i3 = arrayOfInt.length;
      int i4 = 0;
      while (i4 < i3)
      {
        int i5 = arrayOfInt[i4];
        m += i5;
        i4 += 1;
      }
      i3 = 10;
      if (i2 >= i3)
      {
        i2 = 1 - n;
        i2 = i << i2;
        i1 |= i2;
      }
      if (n != i)
      {
        m = paramBitArray.getNextSet(m);
        m = paramBitArray.getNextUnset(m);
      }
      n += 1;
    }
    int i6 = paramStringBuilder.length();
    if (i6 == j)
    {
      paramBitArray = paramStringBuilder.toString();
      i6 = Integer.parseInt(paramBitArray) % 4;
      if (i6 == i1) {
        return m;
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static Map parseExtensionString(String paramString)
  {
    int i = paramString.length();
    int j = 2;
    if (i != j) {
      return null;
    }
    EnumMap localEnumMap = new java/util/EnumMap;
    localEnumMap.<init>(ResultMetadataType.class);
    ResultMetadataType localResultMetadataType = ResultMetadataType.ISSUE_NUMBER;
    paramString = Integer.valueOf(paramString);
    localEnumMap.put(localResultMetadataType, paramString);
    return localEnumMap;
  }
  
  public Result decodeRow(int paramInt, BitArray paramBitArray, int[] paramArrayOfInt)
  {
    Object localObject = this.decodeRowStringBuffer;
    ((StringBuilder)localObject).setLength(0);
    int i = decodeMiddle(paramBitArray, paramArrayOfInt, (StringBuilder)localObject);
    localObject = ((StringBuilder)localObject).toString();
    Map localMap = parseExtensionString((String)localObject);
    Result localResult = new com/google/zxing/Result;
    int j = 2;
    ResultPoint[] arrayOfResultPoint = new ResultPoint[j];
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    int k = paramArrayOfInt[0];
    int m = 1;
    int n = paramArrayOfInt[m];
    float f1 = k + n;
    k = 1073741824;
    float f2 = 2.0F;
    f1 /= f2;
    float f3 = paramInt;
    localResultPoint.<init>(f1, f3);
    arrayOfResultPoint[0] = localResultPoint;
    paramArrayOfInt = new com/google/zxing/ResultPoint;
    float f4 = i;
    paramArrayOfInt.<init>(f4, f3);
    arrayOfResultPoint[m] = paramArrayOfInt;
    BarcodeFormat localBarcodeFormat = BarcodeFormat.UPC_EAN_EXTENSION;
    i = 0;
    f4 = 0.0F;
    paramBitArray = null;
    localResult.<init>((String)localObject, null, arrayOfResultPoint, localBarcodeFormat);
    if (localMap != null) {
      localResult.putAllMetadata(localMap);
    }
    return localResult;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.UPCEANExtension2Support
 * JD-Core Version:    0.7.0.1
 */