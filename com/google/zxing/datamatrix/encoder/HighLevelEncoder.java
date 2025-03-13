package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;
import m54207b69;

public final class HighLevelEncoder
{
  static final int ASCII_ENCODATION = 0;
  static final int BASE256_ENCODATION = 5;
  static final int C40_ENCODATION = 1;
  static final char C40_UNLATCH = 'þ';
  static final int EDIFACT_ENCODATION = 4;
  static final char LATCH_TO_ANSIX12 = 'î';
  static final char LATCH_TO_BASE256 = 'ç';
  static final char LATCH_TO_C40 = 'æ';
  static final char LATCH_TO_EDIFACT = 'ð';
  static final char LATCH_TO_TEXT = 'ï';
  private static final char MACRO_05 = 'ì';
  static final String MACRO_05_HEADER = "[)>\03605\035";
  private static final char MACRO_06 = 'í';
  static final String MACRO_06_HEADER = "[)>\03606\035";
  static final String MACRO_TRAILER = "\036\004";
  private static final char PAD = '';
  static final int TEXT_ENCODATION = 2;
  static final char UPPER_SHIFT = 'ë';
  static final int X12_ENCODATION = 3;
  static final char X12_UNLATCH = 'þ';
  
  public static int determineConsecutiveDigitCount(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = paramInt;
    while (j < i)
    {
      boolean bool = isDigit(paramCharSequence.charAt(j));
      if (!bool) {
        break;
      }
      j += 1;
    }
    return j - paramInt;
  }
  
  public static String encodeHighLevel(String paramString)
  {
    SymbolShapeHint localSymbolShapeHint = SymbolShapeHint.FORCE_NONE;
    return encodeHighLevel(paramString, localSymbolShapeHint, null, null, false);
  }
  
  public static String encodeHighLevel(String paramString, SymbolShapeHint paramSymbolShapeHint, Dimension paramDimension1, Dimension paramDimension2)
  {
    return encodeHighLevel(paramString, paramSymbolShapeHint, paramDimension1, paramDimension2, false);
  }
  
  public static String encodeHighLevel(String paramString, SymbolShapeHint paramSymbolShapeHint, Dimension paramDimension1, Dimension paramDimension2, boolean paramBoolean)
  {
    C40Encoder localC40Encoder = new com/google/zxing/datamatrix/encoder/C40Encoder;
    localC40Encoder.<init>();
    int i = 6;
    Encoder[] arrayOfEncoder = new Encoder[i];
    ASCIIEncoder localASCIIEncoder = new com/google/zxing/datamatrix/encoder/ASCIIEncoder;
    localASCIIEncoder.<init>();
    int j = 0;
    arrayOfEncoder[0] = localASCIIEncoder;
    int k = 1;
    arrayOfEncoder[k] = localC40Encoder;
    Object localObject = new com/google/zxing/datamatrix/encoder/TextEncoder;
    ((TextEncoder)localObject).<init>();
    int m = 2;
    arrayOfEncoder[m] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/X12Encoder;
    ((X12Encoder)localObject).<init>();
    arrayOfEncoder[3] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/EdifactEncoder;
    ((EdifactEncoder)localObject).<init>();
    int n = 4;
    arrayOfEncoder[n] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/Base256Encoder;
    ((Base256Encoder)localObject).<init>();
    int i1 = 5;
    arrayOfEncoder[i1] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/EncoderContext;
    ((EncoderContext)localObject).<init>(paramString);
    ((EncoderContext)localObject).setSymbolShape(paramSymbolShapeHint);
    ((EncoderContext)localObject).setSizeConstraints(paramDimension1, paramDimension2);
    paramSymbolShapeHint = m54207b69.F54207b69_11("{p2B5A5071444A73");
    boolean bool1 = paramString.startsWith(paramSymbolShapeHint);
    paramDimension1 = "\036\004";
    if (bool1)
    {
      bool1 = paramString.endsWith(paramDimension1);
      if (!bool1) {}
    }
    int i4;
    for (char c = 'ì';; i4 = 237)
    {
      ((EncoderContext)localObject).writeCodeword(c);
      ((EncoderContext)localObject).setSkipAtEnd(m);
      int i3 = ((EncoderContext)localObject).pos + 7;
      ((EncoderContext)localObject).pos = i3;
      break;
      paramSymbolShapeHint = m54207b69.F54207b69_11("Nh334258795C637B");
      bool1 = paramString.startsWith(paramSymbolShapeHint);
      if (!bool1) {
        break;
      }
      boolean bool2 = paramString.endsWith(paramDimension1);
      if (!bool2) {
        break;
      }
    }
    if (paramBoolean) {
      localC40Encoder.encodeMaximal((EncoderContext)localObject);
    }
    for (;;)
    {
      j = ((EncoderContext)localObject).getNewEncoding();
      ((EncoderContext)localObject).resetEncoderSignal();
      do
      {
        boolean bool3 = ((EncoderContext)localObject).hasMoreCharacters();
        if (!bool3) {
          break;
        }
        paramString = arrayOfEncoder[j];
        paramString.encode((EncoderContext)localObject);
        i5 = ((EncoderContext)localObject).getNewEncoding();
      } while (i5 < 0);
    }
    int i5 = ((EncoderContext)localObject).getCodewordCount();
    ((EncoderContext)localObject).updateSymbolInfo();
    paramSymbolShapeHint = ((EncoderContext)localObject).getSymbolInfo();
    int i2 = paramSymbolShapeHint.getDataCapacity();
    if ((i5 < i2) && (j != 0) && (j != i1) && (j != n))
    {
      i5 = 254;
      ((EncoderContext)localObject).writeCodeword(i5);
    }
    paramString = ((EncoderContext)localObject).getCodewords();
    int i6 = paramString.length();
    if (i6 < i2) {}
    int i7;
    for (i6 = 129;; i7 = randomize253State(paramString.length() + k))
    {
      paramString.append(i6);
      i7 = paramString.length();
      if (i7 >= i2) {
        break;
      }
    }
    return ((EncoderContext)localObject).getCodewords().toString();
  }
  
  private static int findMinimums(float[] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    for (;;)
    {
      int j = 6;
      float f = 8.407791E-045F;
      if (i >= j) {
        break;
      }
      f = paramArrayOfFloat[i];
      double d = Math.ceil(f);
      j = (int)d;
      paramArrayOfInt[i] = j;
      if (paramInt > j)
      {
        Arrays.fill(paramArrayOfByte, (byte)0);
        paramInt = j;
      }
      if (paramInt == j)
      {
        j = (byte)(paramArrayOfByte[i] + 1);
        paramArrayOfByte[i] = j;
      }
      i += 1;
    }
    return paramInt;
  }
  
  private static int getMinimumCount(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = 6;
      if (i >= k) {
        break;
      }
      k = paramArrayOfByte[i];
      j += k;
      i += 1;
    }
    return j;
  }
  
  public static void illegalCharacter(char paramChar)
  {
    String str1 = Integer.toHexString(paramChar);
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    int i = str1.length();
    i = 4 - i;
    Object localObject2 = m54207b69.F54207b69_11("_t44454647").substring(0, i);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(str1);
    str1 = ((StringBuilder)localObject1).toString();
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str2 = m54207b69.F54207b69_11(">u3C1A1B1316191F5C1E261E1220230F1F176067");
    ((StringBuilder)localObject2).append(str2);
    ((StringBuilder)localObject2).append(paramChar);
    String str3 = m54207b69.F54207b69_11("Y\\7C756E27");
    ((StringBuilder)localObject2).append(str3);
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append(')');
    str3 = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(str3);
    throw ((Throwable)localObject1);
  }
  
  public static boolean isDigit(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  public static boolean isExtendedASCII(char paramChar)
  {
    char c = '';
    if (paramChar >= c)
    {
      c = 'ÿ';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  public static boolean isNativeC40(char paramChar)
  {
    char c = ' ';
    if (paramChar != c)
    {
      c = '0';
      if (paramChar >= c)
      {
        c = '9';
        if (paramChar <= c) {}
      }
      else
      {
        c = 'A';
        if (paramChar >= c)
        {
          c = 'Z';
          if (paramChar <= c) {}
        }
        else
        {
          return '\000';
        }
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  public static boolean isNativeEDIFACT(char paramChar)
  {
    char c = ' ';
    if (paramChar >= c)
    {
      c = '^';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  public static boolean isNativeText(char paramChar)
  {
    char c = ' ';
    if (paramChar != c)
    {
      c = '0';
      if (paramChar >= c)
      {
        c = '9';
        if (paramChar <= c) {}
      }
      else
      {
        c = 'a';
        if (paramChar >= c)
        {
          c = 'z';
          if (paramChar <= c) {}
        }
        else
        {
          return '\000';
        }
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  public static boolean isNativeX12(char paramChar)
  {
    boolean bool = isX12TermSep(paramChar);
    if (!bool)
    {
      char c = ' ';
      if (paramChar != c)
      {
        c = '0';
        if (paramChar >= c)
        {
          c = '9';
          if (paramChar <= c) {}
        }
        else
        {
          c = 'A';
          if (paramChar >= c)
          {
            c = 'Z';
            if (paramChar <= c) {}
          }
          else
          {
            return '\000';
          }
        }
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  private static boolean isSpecialB256(char paramChar)
  {
    return false;
  }
  
  private static boolean isX12TermSep(char paramChar)
  {
    char c = '\r';
    if (paramChar != c)
    {
      c = '*';
      if (paramChar != c)
      {
        c = '>';
        if (paramChar != c) {
          return '\000';
        }
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  public static int lookAheadTest(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = lookAheadTestIntern(paramCharSequence, paramInt1, paramInt2);
    int j = 3;
    if ((paramInt2 == j) && (i == j))
    {
      paramInt2 = paramInt1 + 3;
      j = paramCharSequence.length();
      paramInt2 = Math.min(paramInt2, j);
    }
    while (paramInt1 < paramInt2)
    {
      boolean bool1 = isNativeX12(paramCharSequence.charAt(paramInt1));
      if (!bool1) {
        return 0;
      }
      paramInt1 += 1;
      continue;
      int k = 4;
      if ((paramInt2 == k) && (i == k))
      {
        paramInt2 = paramInt1 + 4;
        k = paramCharSequence.length();
        paramInt2 = Math.min(paramInt2, k);
        while (paramInt1 < paramInt2)
        {
          boolean bool2 = isNativeEDIFACT(paramCharSequence.charAt(paramInt1));
          if (!bool2) {
            return 0;
          }
          paramInt1 += 1;
        }
      }
    }
    return i;
  }
  
  public static int lookAheadTestIntern(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = paramCharSequence;
    int i = paramInt1;
    int j = paramCharSequence.length();
    if (paramInt1 >= j) {
      return paramInt2;
    }
    j = 6;
    float[] arrayOfFloat = new float[j];
    if (paramInt2 == 0)
    {
      float[] tmp37_35 = arrayOfFloat;
      float[] tmp38_37 = tmp37_35;
      float[] tmp38_37 = tmp37_35;
      tmp38_37[0] = 0.0F;
      tmp38_37[1] = 1.0F;
      float[] tmp47_38 = tmp38_37;
      float[] tmp47_38 = tmp38_37;
      tmp47_38[2] = 1.0F;
      tmp47_38[3] = 1.0F;
      tmp47_38[4] = 1.0F;
      tmp47_38[5] = 1.25F;
    }
    else
    {
      float[] tmp73_71 = arrayOfFloat;
      float[] tmp74_73 = tmp73_71;
      float[] tmp74_73 = tmp73_71;
      tmp74_73[0] = 1.0F;
      tmp74_73[1] = 2.0F;
      float[] tmp85_74 = tmp74_73;
      float[] tmp85_74 = tmp74_73;
      tmp85_74[2] = 2.0F;
      tmp85_74[3] = 2.0F;
      tmp85_74[4] = 2.0F;
      tmp85_74[5] = 2.25F;
      arrayOfByte = null;
      arrayOfFloat[paramInt2] = 0.0F;
    }
    byte[] arrayOfByte = new byte[j];
    int[] arrayOfInt = new int[j];
    int k = 0;
    int i8;
    int n;
    int i2;
    do
    {
      int i10;
      do
      {
        do
        {
          int m = i + k;
          int i1 = paramCharSequence.length();
          i3 = -1 >>> 1;
          f1 = 0.0F / 0.0F;
          i4 = 5;
          f2 = 7.006492E-045F;
          i5 = 2;
          i6 = 3;
          i7 = 4;
          i8 = 1;
          if (m == i1)
          {
            Arrays.fill(arrayOfByte, (byte)0);
            Arrays.fill(arrayOfInt, 0);
            int i9 = findMinimums(arrayOfFloat, arrayOfInt, i3, arrayOfByte);
            i = getMinimumCount(arrayOfByte);
            j = arrayOfInt[0];
            if (j == i9) {
              return 0;
            }
            if (i == i8)
            {
              i9 = arrayOfByte[i4];
              if (i9 > 0) {
                return i4;
              }
              i9 = arrayOfByte[i7];
              if (i9 > 0) {
                return i7;
              }
              i9 = arrayOfByte[i5];
              if (i9 > 0) {
                return i5;
              }
              i9 = arrayOfByte[i6];
              if (i9 > 0) {
                return i6;
              }
            }
            return i8;
          }
          m = localCharSequence.charAt(m);
          k += 1;
          boolean bool3 = isDigit(m);
          i10 = 1065353216;
          f3 = 1.0F;
          if (bool3)
          {
            f4 = arrayOfFloat[0];
            float f5 = 0.5F;
            f4 += f5;
            arrayOfFloat[0] = f4;
          }
          else
          {
            bool3 = isExtendedASCII(m);
            double d2;
            if (bool3)
            {
              double d1 = arrayOfFloat[0];
              d2 = Math.ceil(d1);
              f4 = (float)d2;
              arrayOfFloat[0] = f4;
              i3 = 1073741824;
              f1 = 2.0F;
              f4 += f1;
              arrayOfFloat[0] = f4;
            }
            else
            {
              d2 = Math.ceil(arrayOfFloat[0]);
              f4 = (float)d2;
              arrayOfFloat[0] = f4;
              f4 += f3;
              arrayOfFloat[0] = f4;
            }
          }
          bool3 = isNativeC40(m);
          i3 = 1076538027;
          f1 = 2.666667F;
          i4 = 1068149419;
          f2 = 1.333333F;
          float f6 = 0.6666667F;
          if (bool3)
          {
            f4 = arrayOfFloat[i8] + f6;
            arrayOfFloat[i8] = f4;
          }
          else
          {
            bool3 = isExtendedASCII(m);
            if (bool3)
            {
              f4 = arrayOfFloat[i8] + f1;
              arrayOfFloat[i8] = f4;
            }
            else
            {
              f4 = arrayOfFloat[i8] + f2;
              arrayOfFloat[i8] = f4;
            }
          }
          bool3 = isNativeText(m);
          if (bool3)
          {
            f4 = arrayOfFloat[i5] + f6;
            arrayOfFloat[i5] = f4;
          }
          else
          {
            bool3 = isExtendedASCII(m);
            if (bool3)
            {
              f4 = arrayOfFloat[i5] + f1;
              arrayOfFloat[i5] = f4;
            }
            else
            {
              f4 = arrayOfFloat[i5] + f2;
              arrayOfFloat[i5] = f4;
            }
          }
          bool3 = isNativeX12(m);
          if (bool3)
          {
            f4 = arrayOfFloat[i6] + f6;
            arrayOfFloat[i6] = f4;
          }
          else
          {
            bool3 = isExtendedASCII(m);
            if (bool3)
            {
              f4 = arrayOfFloat[i6];
              i3 = 1082829483;
              f1 = 4.333334F;
              f4 += f1;
              arrayOfFloat[i6] = f4;
            }
            else
            {
              f4 = arrayOfFloat[i6];
              i3 = 1079334229;
              f1 = 3.333333F;
              f4 += f1;
              arrayOfFloat[i6] = f4;
            }
          }
          bool3 = isNativeEDIFACT(m);
          if (bool3)
          {
            f4 = arrayOfFloat[i7];
            i3 = 1061158912;
            f1 = 0.75F;
            f4 += f1;
            arrayOfFloat[i7] = f4;
          }
          else
          {
            bool3 = isExtendedASCII(m);
            if (bool3)
            {
              f4 = arrayOfFloat[i7];
              i3 = 1082654720;
              f1 = 4.25F;
              f4 += f1;
              arrayOfFloat[i7] = f4;
            }
            else
            {
              f4 = arrayOfFloat[i7];
              i3 = 1078984704;
              f1 = 3.25F;
              f4 += f1;
              arrayOfFloat[i7] = f4;
            }
          }
          boolean bool2 = isSpecialB256(m);
          if (bool2)
          {
            n = 5;
            f4 = arrayOfFloat[n];
            i3 = 1082130432;
            f1 = 4.0F;
            f4 += f1;
            arrayOfFloat[n] = f4;
          }
          else
          {
            n = 5;
            f4 = arrayOfFloat[n] + f3;
            arrayOfFloat[n] = f4;
          }
        } while (k < i7);
        Arrays.fill(arrayOfByte, (byte)0);
        Arrays.fill(arrayOfInt, 0);
        float f4 = 0.0F / 0.0F;
        findMinimums(arrayOfFloat, arrayOfInt, -1 >>> 1, arrayOfByte);
        i2 = arrayOfInt[0];
        int i3 = arrayOfInt[n];
        int i4 = arrayOfInt[i8];
        i10 = arrayOfInt[i5];
        int i5 = arrayOfInt[i6];
        int i6 = arrayOfInt[i7];
        i3 = min(i3, i4, i10, i5, i6);
        if (i2 < i3) {
          return 0;
        }
        i2 = arrayOfInt[n];
        n = arrayOfInt[0];
        if (i2 < n) {
          break;
        }
        i2 += 1;
        n = arrayOfInt[i8];
        i3 = 2;
        float f1 = 2.802597E-045F;
        i4 = arrayOfInt[i3];
        i5 = 3;
        i6 = arrayOfInt[i5];
        i10 = arrayOfInt[i7];
        n = min(n, i4, i6, i10);
        if (i2 < n) {
          break;
        }
        n = arrayOfInt[i7] + i8;
        f4 = 7.006492E-045F;
        i4 = arrayOfInt[5];
        i6 = arrayOfInt[i8];
        i10 = arrayOfInt[i3];
        i2 = arrayOfInt[i5];
        i5 = arrayOfInt[0];
        i2 = min(i4, i6, i10, i2, i5);
        if (n < i2) {
          return i7;
        }
        n = arrayOfInt[i3] + i8;
        f4 = 7.006492E-045F;
        i4 = arrayOfInt[5];
        i5 = arrayOfInt[i8];
        i6 = arrayOfInt[i7];
        i10 = 3;
        float f3 = 4.203895E-045F;
        int i7 = arrayOfInt[i10];
        i2 = arrayOfInt[0];
        i2 = min(i4, i5, i6, i7, i2);
        if (n < i2) {
          return i3;
        }
        n = arrayOfInt[i10] + i8;
        i2 = 5;
        f4 = 7.006492E-045F;
        i4 = arrayOfInt[i2];
        i5 = arrayOfInt[i8];
        i7 = arrayOfInt[4];
        i6 = arrayOfInt[i3];
        i3 = arrayOfInt[0];
        i3 = min(i4, i5, i7, i6, i3);
        if (n < i3) {
          return i10;
        }
        n = arrayOfInt[i8] + i8;
        i3 = arrayOfInt[0];
        i2 = arrayOfInt[i2];
        float f2 = 5.605194E-045F;
        i4 = arrayOfInt[4];
        i5 = arrayOfInt[2];
        i2 = min(i3, i2, i4, i5);
      } while (n >= i2);
      n = arrayOfInt[i8];
      i2 = arrayOfInt[i10];
      if (n < i2) {
        return i8;
      }
    } while (n != i2);
    i = i + k + i8;
    for (;;)
    {
      j = paramCharSequence.length();
      if (i >= j) {
        break;
      }
      j = localCharSequence.charAt(i);
      boolean bool4 = isX12TermSep(j);
      if (bool4) {
        return 3;
      }
      int i11 = 3;
      boolean bool1 = isNativeX12(j);
      if (!bool1) {
        break;
      }
      i += 1;
    }
    return i8;
    return 5;
  }
  
  private static int min(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = Math.min(paramInt3, paramInt4);
    paramInt2 = Math.min(paramInt2, paramInt3);
    return Math.min(paramInt1, paramInt2);
  }
  
  private static int min(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return Math.min(min(paramInt1, paramInt2, paramInt3, paramInt4), paramInt5);
  }
  
  private static char randomize253State(int paramInt)
  {
    paramInt = paramInt * 149 % 253 + 1 + 129;
    int i = 254;
    if (paramInt > i) {
      paramInt += -254;
    }
    return (char)paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.HighLevelEncoder
 * JD-Core Version:    0.7.0.1
 */