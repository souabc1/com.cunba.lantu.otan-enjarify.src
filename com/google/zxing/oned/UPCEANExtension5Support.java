package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;
import m54207b69;

final class UPCEANExtension5Support
{
  private static final int[] CHECK_DIGIT_ENCODINGS;
  private final int[] decodeMiddleCounters;
  private final StringBuilder decodeRowStringBuffer;
  
  static
  {
    int[] arrayOfInt = new int[10];
    int[] tmp7_5 = arrayOfInt;
    tmp7_5[0] = 24;
    arrayOfInt[1] = 20;
    int[] tmp16_7 = tmp7_5;
    tmp16_7[2] = 18;
    arrayOfInt[3] = 17;
    int[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 12;
    arrayOfInt[5] = 6;
    int[] tmp34_25 = tmp25_16;
    tmp34_25[6] = 3;
    arrayOfInt[7] = 10;
    tmp34_25[8] = 9;
    arrayOfInt[9] = 5;
    CHECK_DIGIT_ENCODINGS = arrayOfInt;
  }
  
  public UPCEANExtension5Support()
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
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int j = paramBitArray.getSize();
    int k = paramArrayOfInt[i];
    int m = 0;
    int n = 0;
    int i1;
    for (;;)
    {
      i1 = 5;
      if ((m >= i1) || (k >= j)) {
        break;
      }
      int[][] arrayOfInt1 = UPCEANReader.L_AND_G_PATTERNS;
      i1 = UPCEANReader.decodeDigit(paramBitArray, arrayOfInt, k, arrayOfInt1);
      char c = (char)(i1 % 10 + 48);
      paramStringBuilder.append(c);
      int i2 = arrayOfInt.length;
      int i3 = 0;
      while (i3 < i2)
      {
        int i4 = arrayOfInt[i3];
        k += i4;
        i3 += 1;
      }
      i2 = 10;
      if (i1 >= i2)
      {
        i1 = 4 - m;
        i1 = i << i1;
        n |= i1;
      }
      i1 = 4;
      if (m != i1)
      {
        k = paramBitArray.getNextSet(k);
        k = paramBitArray.getNextUnset(k);
      }
      m += 1;
    }
    int i5 = paramStringBuilder.length();
    if (i5 == i1)
    {
      i5 = determineCheckDigit(n);
      paramStringBuilder = paramStringBuilder.toString();
      int i6 = extensionChecksum(paramStringBuilder);
      if (i6 == i5) {
        return k;
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static int determineCheckDigit(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      int j = 10;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt = CHECK_DIGIT_ENCODINGS;
      j = arrayOfInt[i];
      if (paramInt == j) {
        return i;
      }
      i += 1;
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static int extensionChecksum(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = i + -2;
    int k = 0;
    while (j >= 0)
    {
      int m = paramCharSequence.charAt(j) + '￐';
      k += m;
      j += -2;
    }
    k *= 3;
    i += -1;
    while (i >= 0)
    {
      j = paramCharSequence.charAt(i) + '￐';
      k += j;
      i += -2;
    }
    return k * 3 % 10;
  }
  
  private static String parseExtension5String(String paramString)
  {
    boolean bool1 = false;
    String str1 = null;
    int k = paramString.charAt(0);
    int n = 48;
    int i1 = 1;
    String str2;
    if (k != n)
    {
      n = 53;
      if (k != n)
      {
        n = 57;
        str2 = "";
        if (k == n)
        {
          k = paramString.hashCode();
          n = -1;
          switch (k)
          {
          }
          boolean bool2;
          boolean bool3;
          do
          {
            do
            {
              do
              {
                bool1 = n;
                break;
                str1 = m54207b69.F54207b69_11("0C7A7B7C7D76");
                bool1 = paramString.equals(str1);
              } while (!bool1);
              int i = 2;
              break;
              str1 = m54207b69.F54207b69_11("R;020304050F");
              bool2 = paramString.equals(str1);
            } while (!bool2);
            bool2 = i1;
            break;
            localObject = m54207b69.F54207b69_11("lc5A54555657");
            bool3 = paramString.equals(localObject);
          } while (!bool3);
          switch (bool2)
          {
          default: 
            break;
          case 2: 
            return m54207b69.F54207b69_11("R_6F727172");
          case 1: 
            return m54207b69.F54207b69_11("Z&73564545");
          case 0: 
            return null;
          }
        }
      }
      else
      {
        str2 = "$";
      }
    }
    else
    {
      str2 = "£";
    }
    paramString = paramString.substring(i1);
    int i2 = Integer.parseInt(paramString);
    int j = i2 / 100;
    str1 = String.valueOf(j);
    i2 %= 100;
    int m = 10;
    if (i2 < m)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str3 = "0";
      ((StringBuilder)localObject).append(str3);
      ((StringBuilder)localObject).append(i2);
      paramString = ((StringBuilder)localObject).toString();
    }
    else
    {
      paramString = String.valueOf(i2);
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append('.');
    ((StringBuilder)localObject).append(paramString);
    return ((StringBuilder)localObject).toString();
  }
  
  private static Map parseExtensionString(String paramString)
  {
    int i = paramString.length();
    int j = 5;
    if (i != j) {
      return null;
    }
    paramString = parseExtension5String(paramString);
    if (paramString == null) {
      return null;
    }
    EnumMap localEnumMap = new java/util/EnumMap;
    localEnumMap.<init>(ResultMetadataType.class);
    ResultMetadataType localResultMetadataType = ResultMetadataType.SUGGESTED_PRICE;
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
 * Qualified Name:     com.google.zxing.oned.UPCEANExtension5Support
 * JD-Core Version:    0.7.0.1
 */