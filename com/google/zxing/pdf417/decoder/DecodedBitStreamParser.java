package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;
import m54207b69;

final class DecodedBitStreamParser
{
  private static final int AL = 28;
  private static final int AS = 27;
  private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
  private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
  private static final int BYTE_COMPACTION_MODE_LATCH = 901;
  private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
  private static final int ECI_CHARSET = 927;
  private static final int ECI_GENERAL_PURPOSE = 926;
  private static final int ECI_USER_DEFINED = 925;
  private static final BigInteger[] EXP900;
  private static final int LL = 27;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
  private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
  private static final int MACRO_PDF417_TERMINATOR = 922;
  private static final int MAX_NUMERIC_CODEWORDS = 15;
  private static final char[] MIXED_CHARS;
  private static final int ML = 28;
  private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
  private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
  private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
  private static final int PAL = 29;
  private static final int PL = 25;
  private static final int PS = 29;
  private static final char[] PUNCT_CHARS = m54207b69.F54207b69_11("%\\6761641F0B05070A442B875C617D746581838A8692358C8B8D7C413C97").toCharArray();
  private static final int TEXT_COMPACTION_MODE_LATCH = 900;
  
  static
  {
    MIXED_CHARS = m54207b69.F54207b69_11("u@70727476787A7C7E80827058557988727D7F76827F7A809436").toCharArray();
    BigInteger[] arrayOfBigInteger = new BigInteger[16];
    EXP900 = arrayOfBigInteger;
    Object localObject = BigInteger.ONE;
    arrayOfBigInteger[0] = localObject;
    long l = 900L;
    BigInteger localBigInteger1 = BigInteger.valueOf(l);
    int i = 1;
    arrayOfBigInteger[i] = localBigInteger1;
    int j = 2;
    for (;;)
    {
      localObject = EXP900;
      int k = localObject.length;
      if (j >= k) {
        break;
      }
      k = j + -1;
      BigInteger localBigInteger2 = localObject[k].multiply(localBigInteger1);
      localObject[j] = localBigInteger2;
      j += 1;
    }
  }
  
  private static int byteCompaction(int paramInt1, int[] paramArrayOfInt, int paramInt2, ECIStringBuilder paramECIStringBuilder)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt[0];
      if ((paramInt2 >= j) || (i != 0)) {
        break;
      }
      int k;
      int m;
      int n;
      for (;;)
      {
        j = paramArrayOfInt[0];
        k = 927;
        m = 1;
        if (paramInt2 >= j) {
          break;
        }
        n = paramArrayOfInt[paramInt2];
        if (n != k) {
          break;
        }
        paramInt2 += 1;
        j = paramArrayOfInt[paramInt2];
        paramECIStringBuilder.appendECI(j);
        paramInt2 += m;
      }
      if (paramInt2 < j)
      {
        j = paramArrayOfInt[paramInt2];
        n = 900;
        if (j < n)
        {
          long l1 = 0L;
          j = 0;
          int i1;
          for (;;)
          {
            long l2 = 900L;
            l1 *= l2;
            i1 = paramInt2 + 1;
            long l3 = paramArrayOfInt[paramInt2];
            l1 += l3;
            j += m;
            paramInt2 = 5;
            if (j >= paramInt2) {
              break;
            }
            int i2 = paramArrayOfInt[0];
            if (i1 >= i2) {
              break;
            }
            i2 = paramArrayOfInt[i1];
            if (i2 >= n) {
              break;
            }
            paramInt2 = i1;
          }
          if (j == paramInt2)
          {
            paramInt2 = 924;
            if (paramInt1 != paramInt2)
            {
              paramInt2 = paramArrayOfInt[0];
              if (i1 < paramInt2)
              {
                paramInt2 = paramArrayOfInt[i1];
                if (paramInt2 >= n) {}
              }
            }
            else
            {
              paramInt2 = 0;
              for (;;)
              {
                j = 6;
                if (paramInt2 >= j) {
                  break;
                }
                j = (5 - paramInt2) * 8;
                long l4 = l1 >> j;
                j = (byte)(int)l4;
                paramECIStringBuilder.append(j);
                paramInt2 += 1;
              }
            }
          }
          i1 -= j;
          for (;;)
          {
            paramInt2 = paramArrayOfInt[0];
            if ((i1 >= paramInt2) || (i != 0)) {
              break;
            }
            paramInt2 = i1 + 1;
            j = paramArrayOfInt[i1];
            if (j < n)
            {
              j = (byte)j;
              paramECIStringBuilder.append(j);
              i1 = paramInt2;
            }
            else if (j == k)
            {
              j = paramInt2 + 1;
              paramInt2 = paramArrayOfInt[paramInt2];
              paramECIStringBuilder.appendECI(paramInt2);
              i1 = j;
            }
            else
            {
              paramInt2 += -1;
              i1 = paramInt2;
              i = m;
            }
          }
          paramInt2 = i1;
          continue;
        }
      }
      i = m;
    }
    return paramInt2;
  }
  
  public static DecoderResult decode(int[] paramArrayOfInt, String paramString)
  {
    Object localObject = new com/google/zxing/common/ECIStringBuilder;
    int i = paramArrayOfInt.length * 2;
    ((ECIStringBuilder)localObject).<init>(i);
    i = textCompaction(paramArrayOfInt, 1, (ECIStringBuilder)localObject);
    PDF417ResultMetadata localPDF417ResultMetadata = new com/google/zxing/pdf417/PDF417ResultMetadata;
    localPDF417ResultMetadata.<init>();
    for (;;)
    {
      int j = paramArrayOfInt[0];
      if (i >= j) {
        break;
      }
      j = i + 1;
      i = paramArrayOfInt[i];
      int k = 913;
      if (i != k)
      {
        switch (i)
        {
        default: 
          switch (i)
          {
          default: 
            j += -1;
            break;
          case 928: 
            i = decodeMacroBlock(paramArrayOfInt, j, localPDF417ResultMetadata);
            break;
          case 927: 
            i = j + 1;
            j = paramArrayOfInt[j];
            ((ECIStringBuilder)localObject).appendECI(j);
            break;
          case 926: 
            j += 2;
            break;
          case 925: 
            j += 1;
            i = j;
            break;
          case 922: 
          case 923: 
            throw FormatException.getFormatInstance();
          }
          break;
        case 902: 
          i = numericCompaction(paramArrayOfInt, j, (ECIStringBuilder)localObject);
          break;
        case 901: 
          i = byteCompaction(i, paramArrayOfInt, j, (ECIStringBuilder)localObject);
          break;
        case 900: 
          i = textCompaction(paramArrayOfInt, j, (ECIStringBuilder)localObject);
          break;
        }
      }
      else
      {
        i = j + 1;
        j = (char)paramArrayOfInt[j];
        ((ECIStringBuilder)localObject).append(j);
      }
    }
    boolean bool = ((ECIStringBuilder)localObject).isEmpty();
    if (bool)
    {
      paramArrayOfInt = localPDF417ResultMetadata.getFileId();
      if (paramArrayOfInt == null) {
        throw FormatException.getFormatInstance();
      }
    }
    paramArrayOfInt = new com/google/zxing/common/DecoderResult;
    localObject = ((ECIStringBuilder)localObject).toString();
    paramArrayOfInt.<init>(null, (String)localObject, null, paramString);
    paramArrayOfInt.setOther(localPDF417ResultMetadata);
    return paramArrayOfInt;
  }
  
  private static String decodeBase900toBase10(int[] paramArrayOfInt, int paramInt)
  {
    BigInteger localBigInteger1 = BigInteger.ZERO;
    int i = 0;
    int j;
    for (;;)
    {
      j = 1;
      if (i >= paramInt) {
        break;
      }
      Object localObject = EXP900;
      int k = paramInt - i - j;
      BigInteger localBigInteger2 = localObject[k];
      int m = paramArrayOfInt[i];
      long l = m;
      localObject = BigInteger.valueOf(l);
      localBigInteger2 = localBigInteger2.multiply((BigInteger)localObject);
      localBigInteger1 = localBigInteger1.add(localBigInteger2);
      i += 1;
    }
    paramArrayOfInt = localBigInteger1.toString();
    paramInt = paramArrayOfInt.charAt(0);
    int n = 49;
    if (paramInt == n) {
      return paramArrayOfInt.substring(j);
    }
    throw FormatException.getFormatInstance();
  }
  
  public static int decodeMacroBlock(int[] paramArrayOfInt, int paramInt, PDF417ResultMetadata paramPDF417ResultMetadata)
  {
    int i = paramInt + 2;
    int j = 0;
    int k = paramArrayOfInt[0];
    if (i <= k)
    {
      i = 2;
      Object localObject1 = new int[i];
      int n = 0;
      String str = null;
      int i1;
      while (n < i)
      {
        i1 = paramArrayOfInt[paramInt];
        localObject1[n] = i1;
        n += 1;
        paramInt += 1;
      }
      Object localObject2 = decodeBase900toBase10((int[])localObject1, i);
      boolean bool1 = ((String)localObject2).isEmpty();
      if (bool1) {
        paramPDF417ResultMetadata.setSegmentIndex(0);
      }
      try
      {
        i = Integer.parseInt((String)localObject2);
        paramPDF417ResultMetadata.setSegmentIndex(i);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        for (;;)
        {
          m = paramArrayOfInt[0];
          n = 922;
          i1 = 923;
          if (paramInt >= m) {
            break;
          }
          m = paramArrayOfInt.length;
          if (paramInt >= m) {
            break;
          }
          m = paramArrayOfInt[paramInt];
          if ((m == n) || (m == i1)) {
            break;
          }
          localObject1 = Integer.valueOf(m);
          localObject1 = new Object[] { localObject1 };
          str = m54207b69.F54207b69_11("0r57434319");
          localObject1 = String.format(str, (Object[])localObject1);
          ((StringBuilder)localObject2).append((String)localObject1);
          paramInt += 1;
        }
        int m = ((StringBuilder)localObject2).length();
        if (m != 0)
        {
          localObject2 = ((StringBuilder)localObject2).toString();
          paramPDF417ResultMetadata.setFileId((String)localObject2);
          i = paramArrayOfInt[paramInt];
          m = -1;
          if (i == i1) {
            i = paramInt + 1;
          } else {
            i = m;
          }
          for (;;)
          {
            int i2 = paramArrayOfInt[0];
            if (paramInt >= i2) {
              break;
            }
            i2 = paramArrayOfInt[paramInt];
            if (i2 != n)
            {
              if (i2 == i1)
              {
                paramInt += 1;
                i2 = paramArrayOfInt[paramInt];
                Object localObject3;
                long l;
                switch (i2)
                {
                default: 
                  throw FormatException.getFormatInstance();
                case 6: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = numericCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  try
                  {
                    localObject3 = ((ECIStringBuilder)localObject3).toString();
                    i2 = Integer.parseInt((String)localObject3);
                    paramPDF417ResultMetadata.setChecksum(i2);
                  }
                  catch (NumberFormatException localNumberFormatException1)
                  {
                    throw FormatException.getFormatInstance();
                  }
                case 5: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = numericCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  try
                  {
                    localObject3 = ((ECIStringBuilder)localObject3).toString();
                    l = Long.parseLong((String)localObject3);
                    paramPDF417ResultMetadata.setFileSize(l);
                  }
                  catch (NumberFormatException localNumberFormatException2)
                  {
                    throw FormatException.getFormatInstance();
                  }
                case 4: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = textCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  localObject3 = ((ECIStringBuilder)localObject3).toString();
                  paramPDF417ResultMetadata.setAddressee((String)localObject3);
                  break;
                case 3: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = textCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  localObject3 = ((ECIStringBuilder)localObject3).toString();
                  paramPDF417ResultMetadata.setSender((String)localObject3);
                  break;
                case 2: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = numericCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  try
                  {
                    localObject3 = ((ECIStringBuilder)localObject3).toString();
                    l = Long.parseLong((String)localObject3);
                    paramPDF417ResultMetadata.setTimestamp(l);
                  }
                  catch (NumberFormatException localNumberFormatException3)
                  {
                    throw FormatException.getFormatInstance();
                  }
                case 1: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = numericCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  try
                  {
                    localObject3 = ((ECIStringBuilder)localObject3).toString();
                    i2 = Integer.parseInt((String)localObject3);
                    paramPDF417ResultMetadata.setSegmentCount(i2);
                  }
                  catch (NumberFormatException localNumberFormatException4)
                  {
                    throw FormatException.getFormatInstance();
                  }
                case 0: 
                  localObject3 = new com/google/zxing/common/ECIStringBuilder;
                  ((ECIStringBuilder)localObject3).<init>();
                  paramInt += 1;
                  paramInt = textCompaction(paramArrayOfInt, paramInt, (ECIStringBuilder)localObject3);
                  localObject3 = ((ECIStringBuilder)localObject3).toString();
                  paramPDF417ResultMetadata.setFileName((String)localObject3);
                  break;
                }
              }
              else
              {
                throw FormatException.getFormatInstance();
              }
            }
            else
            {
              paramInt += 1;
              i2 = 1;
              paramPDF417ResultMetadata.setLastSegment(i2);
            }
          }
          if (i != m)
          {
            j = paramInt - i;
            boolean bool2 = paramPDF417ResultMetadata.isLastSegment();
            if (bool2) {
              j += -1;
            }
            if (j > 0)
            {
              j += i;
              paramArrayOfInt = Arrays.copyOfRange(paramArrayOfInt, i, j);
              paramPDF417ResultMetadata.setOptionalData(paramArrayOfInt);
            }
          }
          return paramInt;
        }
        throw FormatException.getFormatInstance();
      }
      catch (NumberFormatException localNumberFormatException5)
      {
        throw FormatException.getFormatInstance();
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  private static DecodedBitStreamParser.Mode decodeTextCompaction(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt, ECIStringBuilder paramECIStringBuilder, DecodedBitStreamParser.Mode paramMode)
  {
    ECIStringBuilder localECIStringBuilder = paramECIStringBuilder;
    int i = paramInt;
    DecodedBitStreamParser.Mode localMode = paramMode;
    Object localObject1 = paramMode;
    Object localObject2 = paramMode;
    int j = 0;
    while (j < i)
    {
      int k = paramArrayOfInt1[j];
      Object localObject3 = DecodedBitStreamParser.1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
      int i2 = ((Enum)localObject1).ordinal();
      int i3 = localObject3[i2];
      i2 = 32;
      int i4 = 29;
      int i5 = 26;
      int i6 = 913;
      int i7 = 900;
      label236:
      int m;
      int n;
      switch (i3)
      {
      default: 
      case 6: 
      case 5: 
      case 4: 
        for (;;)
        {
          localObject4 = localObject2;
          localObject2 = localObject1;
          c = '\000';
          localObject1 = null;
          break label753;
          if (k < i4)
          {
            localObject1 = PUNCT_CHARS;
            c = localObject1[k];
          }
          else if ((k != i4) && (k != i7))
          {
            if (k == i6)
            {
              c = (char)paramArrayOfInt2[j];
              localECIStringBuilder.append(c);
            }
            c = '\000';
            localObject1 = null;
          }
          else
          {
            localObject1 = DecodedBitStreamParser.Mode.ALPHA;
            continue;
            if (k >= i5) {
              break label236;
            }
            k += 65;
            c = (char)k;
          }
          localObject4 = localObject2;
          break label753;
          if (k != i5)
          {
            if (k != i7) {
              i2 = 0;
            }
          }
          else
          {
            localObject1 = localObject2;
            break label741;
          }
          localObject1 = DecodedBitStreamParser.Mode.ALPHA;
          break label727;
          if (k < i4)
          {
            localObject3 = PUNCT_CHARS;
            k = localObject3[k];
            break;
          }
          if ((k != i4) && (k != i7))
          {
            if (k == i6)
            {
              k = (char)paramArrayOfInt2[j];
              localECIStringBuilder.append(k);
            }
          }
          else
          {
            localMode = DecodedBitStreamParser.Mode.ALPHA;
            localObject1 = localMode;
          }
        }
      case 3: 
        i3 = 25;
        if (k < i3)
        {
          localObject3 = MIXED_CHARS;
          m = localObject3[k];
          break label599;
        }
        if (m != i7) {
          if (m == i6) {}
        }
        switch (m)
        {
        default: 
          break;
        case 27: 
          localMode = DecodedBitStreamParser.Mode.LOWER;
          break;
        case 25: 
          localMode = DecodedBitStreamParser.Mode.PUNCT;
          break;
          m = (char)paramArrayOfInt2[j];
          localECIStringBuilder.append(m);
          break;
        case 28: 
          localMode = DecodedBitStreamParser.Mode.ALPHA;
        }
        break;
      case 2: 
        if (m < i5)
        {
          m += 97;
        }
        else
        {
          if (n != i7) {
            if (n == i6) {}
          }
          switch (n)
          {
          default: 
            break;
          case 29: 
            localObject2 = DecodedBitStreamParser.Mode.PUNCT_SHIFT;
            break;
          case 28: 
            localMode = DecodedBitStreamParser.Mode.MIXED;
            break;
          case 27: 
            localObject2 = DecodedBitStreamParser.Mode.ALPHA_SHIFT;
            break;
            n = (char)paramArrayOfInt2[j];
            localECIStringBuilder.append(n);
            break label727;
            localMode = DecodedBitStreamParser.Mode.ALPHA;
          }
        }
        break;
      case 1: 
        if (n >= i5) {
          break label618;
        }
        n += 65;
      }
      int i1 = (char)i1;
      label599:
      Object localObject5 = localObject2;
      localObject2 = localObject1;
      char c = i1;
      Object localObject4 = localObject5;
      break label753;
      label618:
      if (i1 != i7) {
        if (i1 == i6) {}
      }
      switch (i1)
      {
      default: 
        break;
      case 29: 
        localObject2 = DecodedBitStreamParser.Mode.PUNCT_SHIFT;
        i2 = 0;
        localObject5 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject5;
        break;
      case 28: 
        localMode = DecodedBitStreamParser.Mode.MIXED;
        break;
      case 27: 
        for (localMode = DecodedBitStreamParser.Mode.LOWER;; localMode = DecodedBitStreamParser.Mode.ALPHA)
        {
          i2 = 0;
          localObject1 = localMode;
          break;
          i1 = (char)paramArrayOfInt2[j];
          localECIStringBuilder.append(i1);
          label727:
          i2 = 0;
          break;
        }
      }
      label741:
      localObject4 = localObject2;
      localObject2 = localObject1;
      c = i2;
      label753:
      if (c != 0) {
        localECIStringBuilder.append(c);
      }
      j += 1;
      localObject1 = localObject2;
      localObject2 = localObject4;
    }
    return localMode;
  }
  
  private static int numericCompaction(int[] paramArrayOfInt, int paramInt, ECIStringBuilder paramECIStringBuilder)
  {
    int i = 15;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 0;
    for (;;)
    {
      int m = paramArrayOfInt[0];
      if ((paramInt >= m) || (j != 0)) {
        break;
      }
      int n = paramInt + 1;
      paramInt = paramArrayOfInt[paramInt];
      int i1 = 1;
      if (n == m) {
        j = i1;
      }
      m = 900;
      if (paramInt < m)
      {
        arrayOfInt[k] = paramInt;
        k += 1;
      }
      else
      {
        if (paramInt != m)
        {
          m = 901;
          if (paramInt != m)
          {
            m = 927;
            if (paramInt != m)
            {
              m = 928;
              if (paramInt != m) {
                switch (paramInt)
                {
                default: 
                  break;
                }
              }
            }
          }
        }
        n += -1;
        j = i1;
      }
      m = k % 15;
      if (m != 0)
      {
        m = 902;
        if ((paramInt != m) && (j == 0)) {}
      }
      else if (k > 0)
      {
        String str = decodeBase900toBase10(arrayOfInt, k);
        paramECIStringBuilder.append(str);
        k = 0;
      }
      paramInt = n;
    }
    return paramInt;
  }
  
  private static int textCompaction(int[] paramArrayOfInt, int paramInt, ECIStringBuilder paramECIStringBuilder)
  {
    int i = paramArrayOfInt[0];
    int j = (i - paramInt) * 2;
    Object localObject1 = new int[j];
    i = (i - paramInt) * 2;
    Object localObject2 = new int[i];
    Object localObject3 = DecodedBitStreamParser.Mode.ALPHA;
    int k = 0;
    int m = 0;
    for (;;)
    {
      int n = paramArrayOfInt[0];
      if ((paramInt >= n) || (k != 0)) {
        break;
      }
      n = paramInt + 1;
      paramInt = paramArrayOfInt[paramInt];
      int i1 = 900;
      int i2;
      if (paramInt < i1)
      {
        i1 = paramInt / 30;
        localObject1[m] = i1;
        i1 = m + 1;
        paramInt %= 30;
        localObject1[i1] = paramInt;
        m += 2;
      }
      else
      {
        i2 = 913;
        if (paramInt == i2) {
          break label338;
        }
        i2 = 927;
        if (paramInt == i2) {
          break label240;
        }
        i2 = 928;
        if (paramInt == i2) {
          break label228;
        }
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          }
          break;
        }
      }
      for (;;)
      {
        paramInt = n;
        break;
        paramInt = m + 1;
        localObject1[m] = i1;
        m = paramInt;
        continue;
        label228:
        n += -1;
        k = 1;
      }
      label240:
      DecodedBitStreamParser.Mode localMode = decodeTextCompaction((int[])localObject1, (int[])localObject2, m, paramECIStringBuilder, (DecodedBitStreamParser.Mode)localObject3);
      i = n + 1;
      j = paramArrayOfInt[n];
      paramECIStringBuilder.appendECI(j);
      j = paramArrayOfInt[0];
      if (i <= j)
      {
        int i3 = (j - i) * 2;
        localObject3 = new int[i3];
        j = (j - i) * 2;
        localObject1 = new int[j];
        m = 0;
        Object localObject4 = localObject3;
        localObject3 = localMode;
        paramInt = i;
        localObject2 = localObject1;
        localObject1 = localObject4;
      }
      else
      {
        throw FormatException.getFormatInstance();
        label338:
        localObject1[m] = i2;
        paramInt = n + 1;
        n = paramArrayOfInt[n];
        localObject2[m] = n;
        m += 1;
      }
    }
    decodeTextCompaction((int[])localObject1, (int[])localObject2, m, paramECIStringBuilder, (DecodedBitStreamParser.Mode)localObject3);
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.7.0.1
 */