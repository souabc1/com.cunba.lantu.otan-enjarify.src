package com.google.zxing.datamatrix.encoder;

import com.google.zxing.common.MinimalECIInput;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import m54207b69;

public final class MinimalEncoder
{
  static final char[] C40_SHIFT2_CHARS;
  
  static
  {
    char[] arrayOfChar = new char[27];
    char[] tmp7_5 = arrayOfChar;
    tmp7_5[0] = 33;
    arrayOfChar[1] = 34;
    char[] tmp16_7 = tmp7_5;
    tmp16_7[2] = 35;
    arrayOfChar[3] = 36;
    char[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 37;
    arrayOfChar[5] = 38;
    char[] tmp34_25 = tmp25_16;
    tmp34_25[6] = 39;
    arrayOfChar[7] = 40;
    char[] tmp45_34 = tmp34_25;
    tmp45_34[8] = 41;
    arrayOfChar[9] = 42;
    char[] tmp56_45 = tmp45_34;
    tmp56_45[10] = 43;
    arrayOfChar[11] = 44;
    char[] tmp67_56 = tmp56_45;
    tmp67_56[12] = 45;
    arrayOfChar[13] = 46;
    char[] tmp78_67 = tmp67_56;
    tmp78_67[14] = 47;
    arrayOfChar[15] = 58;
    char[] tmp89_78 = tmp78_67;
    tmp89_78[16] = 59;
    arrayOfChar[17] = 60;
    char[] tmp100_89 = tmp89_78;
    tmp100_89[18] = 61;
    arrayOfChar[19] = 62;
    char[] tmp111_100 = tmp100_89;
    tmp111_100[20] = 63;
    arrayOfChar[21] = 64;
    char[] tmp122_111 = tmp111_100;
    tmp122_111[22] = 91;
    arrayOfChar[23] = 92;
    tmp122_111[24] = 93;
    arrayOfChar[25] = 94;
    arrayOfChar[26] = 95;
    C40_SHIFT2_CHARS = arrayOfChar;
  }
  
  public static void addEdge(MinimalEncoder.Edge[][] paramArrayOfEdge, MinimalEncoder.Edge paramEdge)
  {
    int i = MinimalEncoder.Edge.access$100(paramEdge);
    int j = MinimalEncoder.Edge.access$200(paramEdge);
    i += j;
    Object localObject = paramArrayOfEdge[i];
    MinimalEncoder.Mode localMode1 = paramEdge.getEndMode();
    int k = localMode1.ordinal();
    localObject = localObject[k];
    if (localObject != null)
    {
      localObject = paramArrayOfEdge[i];
      localMode1 = paramEdge.getEndMode();
      k = localMode1.ordinal();
      localObject = localObject[k];
      j = MinimalEncoder.Edge.access$300((MinimalEncoder.Edge)localObject);
      k = MinimalEncoder.Edge.access$300(paramEdge);
      if (j <= k) {}
    }
    else
    {
      paramArrayOfEdge = paramArrayOfEdge[i];
      MinimalEncoder.Mode localMode2 = paramEdge.getEndMode();
      i = localMode2.ordinal();
      paramArrayOfEdge[i] = paramEdge;
    }
  }
  
  public static void addEdges(MinimalEncoder.Input paramInput, MinimalEncoder.Edge[][] paramArrayOfEdge, int paramInt, MinimalEncoder.Edge paramEdge)
  {
    MinimalEncoder.Input localInput = paramInput;
    MinimalEncoder.Edge[][] arrayOfEdge = paramArrayOfEdge;
    int i = paramInt;
    boolean bool1 = paramInput.isECI(paramInt);
    MinimalEncoder.Edge localEdge1;
    MinimalEncoder.Mode localMode;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localEdge1 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
      localMode = MinimalEncoder.Mode.ASCII;
      localObject1 = localEdge1;
      localObject2 = paramInput;
      localEdge1.<init>(paramInput, localMode, paramInt, 1, paramEdge, null);
      addEdge(paramArrayOfEdge, localEdge1);
      return;
    }
    char c = paramInput.charAt(paramInt);
    int i2 = 3;
    int i3 = 0;
    Object localObject3 = null;
    int i4 = 1;
    int i6;
    MinimalEncoder.Edge localEdge2;
    if (paramEdge != null)
    {
      localObject2 = paramEdge.getEndMode();
      localMode = MinimalEncoder.Mode.EDF;
      if (localObject2 == localMode) {}
    }
    else
    {
      boolean bool2 = HighLevelEncoder.isDigit(c);
      int i5 = 2;
      if (bool2)
      {
        bool2 = localInput.haveNCharacters(i, i5);
        if (bool2)
        {
          int j = i + 1;
          bool3 = HighLevelEncoder.isDigit(localInput.charAt(j));
          if (bool3)
          {
            localObject4 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
            localMode = MinimalEncoder.Mode.ASCII;
            i6 = 2;
            localEdge2 = null;
            localObject1 = localObject4;
            localObject2 = paramInput;
            ((MinimalEncoder.Edge)localObject4).<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
            break label227;
          }
        }
      }
      Object localObject4 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
      localMode = MinimalEncoder.Mode.ASCII;
      i6 = 1;
      localEdge2 = null;
      localObject1 = localObject4;
      localObject2 = paramInput;
      ((MinimalEncoder.Edge)localObject4).<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
      label227:
      addEdge(arrayOfEdge, (MinimalEncoder.Edge)localObject4);
      localObject1 = MinimalEncoder.Mode.C40;
      localObject2 = MinimalEncoder.Mode.TEXT;
      localObject4 = new MinimalEncoder.Mode[] { localObject1, localObject2 };
      int i7 = 0;
      while (i7 < i5)
      {
        localMode = localObject4[i7];
        localObject1 = new int[i4];
        localObject2 = MinimalEncoder.Mode.C40;
        int i8;
        if (localMode == localObject2)
        {
          i8 = i4;
        }
        else
        {
          i8 = 0;
          localObject2 = null;
        }
        int i9 = getNumberOfC40Words(localInput, i, i8, (int[])localObject1);
        if (i9 > 0)
        {
          localEdge2 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
          i6 = localObject1[0];
          localObject1 = localEdge2;
          localObject2 = paramInput;
          localObject3 = localEdge2;
          localEdge2 = null;
          ((MinimalEncoder.Edge)localObject1).<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
          addEdge(arrayOfEdge, (MinimalEncoder.Edge)localObject1);
        }
        i7 += 1;
        i3 = 0;
        localObject3 = null;
      }
      boolean bool3 = localInput.haveNCharacters(i, i2);
      if (bool3)
      {
        bool3 = HighLevelEncoder.isNativeX12(localInput.charAt(i));
        if (bool3)
        {
          int k = i + 1;
          boolean bool4 = HighLevelEncoder.isNativeX12(localInput.charAt(k));
          if (bool4)
          {
            int m = i + 2;
            boolean bool5 = HighLevelEncoder.isNativeX12(localInput.charAt(m));
            if (bool5)
            {
              localObject3 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
              localMode = MinimalEncoder.Mode.X12;
              i6 = 3;
              localEdge2 = null;
              localObject1 = localObject3;
              localObject2 = paramInput;
              ((MinimalEncoder.Edge)localObject3).<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
              addEdge(arrayOfEdge, (MinimalEncoder.Edge)localObject3);
            }
          }
        }
      }
      localObject3 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
      localMode = MinimalEncoder.Mode.B256;
      i6 = 1;
      localEdge2 = null;
      localObject1 = localObject3;
      localObject2 = paramInput;
      ((MinimalEncoder.Edge)localObject3).<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
      addEdge(arrayOfEdge, (MinimalEncoder.Edge)localObject3);
    }
    i3 = 0;
    localObject3 = null;
    boolean bool6;
    while (i3 < i2)
    {
      int n = i + i3;
      boolean bool8 = localInput.haveNCharacters(n, i4);
      if (!bool8) {
        break;
      }
      bool6 = HighLevelEncoder.isNativeEDIFACT(localInput.charAt(n));
      if (!bool6) {
        break;
      }
      MinimalEncoder.Edge localEdge3 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
      localMode = MinimalEncoder.Mode.EDF;
      i3 += 1;
      localEdge2 = null;
      localObject1 = localEdge3;
      localObject2 = paramInput;
      i6 = i3;
      localEdge3.<init>(paramInput, localMode, paramInt, i3, paramEdge, null);
      addEdge(arrayOfEdge, localEdge3);
    }
    if (i3 == i2)
    {
      bool6 = localInput.haveNCharacters(i, 4);
      if (bool6)
      {
        int i1 = i + 3;
        boolean bool7 = HighLevelEncoder.isNativeEDIFACT(localInput.charAt(i1));
        if (bool7)
        {
          localEdge1 = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Edge;
          localMode = MinimalEncoder.Mode.EDF;
          i6 = 4;
          localEdge2 = null;
          localObject1 = localEdge1;
          localObject2 = paramInput;
          localEdge1.<init>(paramInput, localMode, paramInt, i6, paramEdge, null);
          addEdge(arrayOfEdge, localEdge1);
        }
      }
    }
  }
  
  public static byte[] encode(String paramString, Charset paramCharset, int paramInt1, SymbolShapeHint paramSymbolShapeHint, int paramInt2)
  {
    MinimalEncoder.Input localInput = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Input;
    localInput.<init>(paramString, paramCharset, paramInt1, paramSymbolShapeHint, paramInt2, null);
    return encodeMinimally(localInput).getBytes();
  }
  
  public static String encodeHighLevel(String paramString)
  {
    SymbolShapeHint localSymbolShapeHint = SymbolShapeHint.FORCE_NONE;
    return encodeHighLevel(paramString, null, -1, localSymbolShapeHint);
  }
  
  public static String encodeHighLevel(String paramString, Charset paramCharset, int paramInt, SymbolShapeHint paramSymbolShapeHint)
  {
    String str1 = m54207b69.F54207b69_11("{p2B5A5071444A73");
    boolean bool1 = paramString.startsWith(str1);
    int k = 7;
    String str2 = "\036\004";
    if (bool1)
    {
      bool1 = paramString.endsWith(str2);
      if (bool1)
      {
        int i = paramString.length() + -2;
        paramString = paramString.substring(k, i);
        i = 5;
        break label129;
      }
    }
    str1 = m54207b69.F54207b69_11("Nh334258795C637B");
    boolean bool2 = paramString.startsWith(str1);
    if (bool2)
    {
      bool2 = paramString.endsWith(str2);
      if (bool2)
      {
        j = paramString.length() + -2;
        paramString = paramString.substring(k, j);
        j = 6;
        break label129;
      }
    }
    int j = 0;
    str1 = null;
    label129:
    String str3 = new java/lang/String;
    paramString = encode(paramString, paramCharset, paramInt, paramSymbolShapeHint, j);
    paramCharset = StandardCharsets.ISO_8859_1;
    str3.<init>(paramString, paramCharset);
    return str3;
  }
  
  public static MinimalEncoder.Result encodeMinimally(MinimalEncoder.Input paramInput)
  {
    int i = paramInput.length();
    int j = i + 1;
    int k = 6;
    Object localObject1 = { j, k };
    localObject1 = (MinimalEncoder.Edge[][])Array.newInstance(MinimalEncoder.Edge.class, (int[])localObject1);
    int m = 0;
    int n = 0;
    addEdges(paramInput, (MinimalEncoder.Edge[][])localObject1, 0, null);
    int i1 = 1;
    int i2 = i1;
    int i3;
    MinimalEncoder.Edge localEdge1;
    int i4;
    while (i2 <= i)
    {
      i3 = 0;
      localEdge1 = null;
      MinimalEncoder.Edge localEdge2;
      while (i3 < k)
      {
        localEdge2 = localObject1[i2][i3];
        if ((localEdge2 != null) && (i2 < i)) {
          addEdges(paramInput, (MinimalEncoder.Edge[][])localObject1, i2, localEdge2);
        }
        i3 += 1;
      }
      i3 = 0;
      localEdge1 = null;
      while (i3 < k)
      {
        i4 = i2 + -1;
        localEdge2 = localObject1[i4];
        localEdge2[i3] = null;
        i3 += 1;
      }
      i2 += 1;
    }
    n = -1;
    i2 = -1 >>> 1;
    while (m < k)
    {
      localEdge1 = localObject1[i][m];
      if (localEdge1 != null)
      {
        if (m >= i1)
        {
          i4 = 3;
          if (m <= i4)
          {
            i3 = MinimalEncoder.Edge.access$300(localEdge1) + i1;
            break label230;
          }
        }
        i3 = MinimalEncoder.Edge.access$300(localEdge1);
        label230:
        if (i3 < i2)
        {
          n = m;
          i2 = i3;
        }
      }
      m += 1;
    }
    if (n >= 0)
    {
      paramInput = new com/google/zxing/datamatrix/encoder/MinimalEncoder$Result;
      localObject2 = localObject1[i][n];
      paramInput.<init>((MinimalEncoder.Edge)localObject2);
      return paramInput;
    }
    Object localObject2 = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str = m54207b69.F54207b69_11("%G0127302E26286D3A30702C34303531317776");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(paramInput);
    ((StringBuilder)localObject1).append("\"");
    paramInput = ((StringBuilder)localObject1).toString();
    ((IllegalStateException)localObject2).<init>(paramInput);
    throw ((Throwable)localObject2);
  }
  
  public static int getNumberOfC40Words(MinimalEncoder.Input paramInput, int paramInt, boolean paramBoolean, int[] paramArrayOfInt)
  {
    int i = paramInt;
    int j = 0;
    for (;;)
    {
      int k = paramInput.length();
      if (i >= k) {
        break label272;
      }
      boolean bool1 = paramInput.isECI(i);
      if (bool1)
      {
        paramArrayOfInt[0] = 0;
        return 0;
      }
      int m = paramInput.charAt(i);
      boolean bool3;
      if (paramBoolean)
      {
        bool3 = HighLevelEncoder.isNativeC40(m);
        if (bool3) {}
      }
      else
      {
        if (paramBoolean) {
          break label87;
        }
        bool3 = HighLevelEncoder.isNativeText(m);
        if (!bool3) {
          break label87;
        }
      }
      j += 1;
      break label191;
      label87:
      int i1 = paramInput.getFNC1Character();
      boolean bool4 = isExtendedASCII(m, i1);
      if (!bool4)
      {
        j += 2;
      }
      else
      {
        m &= 0xFF;
        int i2 = 128;
        if (m >= i2)
        {
          if (paramBoolean)
          {
            boolean bool5 = HighLevelEncoder.isNativeC40((char)(m + -128));
            if (bool5) {}
          }
          else
          {
            if (paramBoolean) {
              break label185;
            }
            boolean bool2 = HighLevelEncoder.isNativeText((char)(m + -128));
            if (!bool2) {
              break label185;
            }
          }
          j += 3;
          break label191;
        }
        label185:
        j += 4;
      }
      label191:
      int n = j % 3;
      if (n == 0) {
        break;
      }
      n = (j + -2) % 3;
      if (n == 0)
      {
        n = i + 1;
        int i3 = paramInput.length();
        if (n == i3) {
          break;
        }
      }
      i += 1;
    }
    i = i - paramInt + 1;
    paramArrayOfInt[0] = i;
    return (int)Math.ceil(j / 3.0D);
    label272:
    paramArrayOfInt[0] = 0;
    return 0;
  }
  
  public static boolean isExtendedASCII(char paramChar, int paramInt)
  {
    if (paramChar != paramInt)
    {
      paramInt = 128;
      if (paramChar >= paramInt)
      {
        paramInt = 255;
        if (paramChar <= paramInt) {
          return '\001';
        }
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  private static boolean isInC40Shift1Set(char paramChar)
  {
    char c = '\037';
    if (paramChar <= c) {
      paramChar = '\001';
    } else {
      paramChar = '\000';
    }
    return paramChar;
  }
  
  private static boolean isInC40Shift2Set(char paramChar, int paramInt)
  {
    char[] arrayOfChar = C40_SHIFT2_CHARS;
    int i = arrayOfChar.length;
    boolean bool1 = false;
    int j = 0;
    boolean bool2;
    for (;;)
    {
      bool2 = true;
      if (j >= i) {
        break;
      }
      char c = arrayOfChar[j];
      if (c == paramChar) {
        return bool2;
      }
      j += 1;
    }
    if (paramChar == paramInt) {
      bool1 = bool2;
    }
    return bool1;
  }
  
  private static boolean isInTextShift1Set(char paramChar)
  {
    return isInC40Shift1Set(paramChar);
  }
  
  private static boolean isInTextShift2Set(char paramChar, int paramInt)
  {
    return isInC40Shift2Set(paramChar, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.MinimalEncoder
 * JD-Core Version:    0.7.0.1
 */