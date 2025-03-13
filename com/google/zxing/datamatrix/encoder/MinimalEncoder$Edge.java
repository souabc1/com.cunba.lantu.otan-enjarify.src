package com.google.zxing.datamatrix.encoder;

import com.google.zxing.common.MinimalECIInput;
import java.util.ArrayList;
import java.util.List;

final class MinimalEncoder$Edge
{
  private static final int[] allCodewordCapacities;
  private static final int[] rectangularCodewordCapacities;
  private static final int[] squareCodewordCapacities;
  private final int cachedTotalSize;
  private final int characterLength;
  private final int fromPosition;
  private final MinimalEncoder.Input input;
  private final MinimalEncoder.Mode mode;
  private final Edge previous;
  
  static
  {
    int[] arrayOfInt = new int[28];
    int[] tmp7_5 = arrayOfInt;
    tmp7_5[0] = 3;
    arrayOfInt[1] = 5;
    int[] tmp14_7 = tmp7_5;
    tmp14_7[2] = 8;
    arrayOfInt[3] = 10;
    int[] tmp23_14 = tmp14_7;
    tmp23_14[4] = 12;
    arrayOfInt[5] = 16;
    int[] tmp32_23 = tmp23_14;
    tmp32_23[6] = 18;
    arrayOfInt[7] = 22;
    int[] tmp43_32 = tmp32_23;
    tmp43_32[8] = 30;
    arrayOfInt[9] = 32;
    int[] tmp54_43 = tmp43_32;
    tmp54_43[10] = 36;
    arrayOfInt[11] = 44;
    int[] tmp65_54 = tmp54_43;
    tmp65_54[12] = 49;
    arrayOfInt[13] = 62;
    int[] tmp76_65 = tmp65_54;
    tmp76_65[14] = 86;
    arrayOfInt[15] = 114;
    int[] tmp87_76 = tmp76_65;
    tmp87_76[16] = '';
    arrayOfInt[17] = '®';
    int[] tmp100_87 = tmp87_76;
    tmp100_87[18] = 'Ì';
    arrayOfInt[19] = 280;
    int[] tmp113_100 = tmp100_87;
    tmp113_100[20] = 368;
    arrayOfInt[21] = 456;
    int[] tmp126_113 = tmp113_100;
    tmp126_113[22] = 576;
    arrayOfInt[23] = 696;
    int[] tmp139_126 = tmp126_113;
    tmp139_126[24] = 816;
    arrayOfInt[25] = 1050;
    tmp139_126[26] = 1304;
    arrayOfInt[27] = 1558;
    allCodewordCapacities = arrayOfInt;
    arrayOfInt = new int[24];
    int[] tmp175_173 = arrayOfInt;
    tmp175_173[0] = 3;
    arrayOfInt[1] = 5;
    int[] tmp182_175 = tmp175_173;
    tmp182_175[2] = 8;
    arrayOfInt[3] = 12;
    int[] tmp191_182 = tmp182_175;
    tmp191_182[4] = 18;
    arrayOfInt[5] = 22;
    int[] tmp200_191 = tmp191_182;
    tmp200_191[6] = 30;
    arrayOfInt[7] = 36;
    int[] tmp211_200 = tmp200_191;
    tmp211_200[8] = 44;
    arrayOfInt[9] = 62;
    int[] tmp222_211 = tmp211_200;
    tmp222_211[10] = 86;
    arrayOfInt[11] = 114;
    int[] tmp233_222 = tmp222_211;
    tmp233_222[12] = '';
    arrayOfInt[13] = '®';
    int[] tmp246_233 = tmp233_222;
    tmp246_233[14] = 'Ì';
    arrayOfInt[15] = 280;
    int[] tmp259_246 = tmp246_233;
    tmp259_246[16] = 368;
    arrayOfInt[17] = 456;
    int[] tmp272_259 = tmp259_246;
    tmp272_259[18] = 576;
    arrayOfInt[19] = 696;
    int[] tmp285_272 = tmp272_259;
    tmp285_272[20] = 816;
    arrayOfInt[21] = 1050;
    tmp285_272[22] = 1304;
    arrayOfInt[23] = 1558;
    squareCodewordCapacities = arrayOfInt;
    arrayOfInt = new int[6];
    int[] tmp321_319 = arrayOfInt;
    tmp321_319[0] = 5;
    arrayOfInt[1] = 10;
    int[] tmp329_321 = tmp321_319;
    tmp329_321[2] = 16;
    arrayOfInt[3] = 33;
    tmp329_321[4] = 32;
    arrayOfInt[5] = 49;
    rectangularCodewordCapacities = arrayOfInt;
  }
  
  private MinimalEncoder$Edge(MinimalEncoder.Input paramInput, MinimalEncoder.Mode paramMode, int paramInt1, int paramInt2, Edge paramEdge)
  {
    this.input = paramInput;
    this.mode = paramMode;
    this.fromPosition = paramInt1;
    this.characterLength = paramInt2;
    this.previous = paramEdge;
    paramInt2 = 0;
    int i;
    if (paramEdge != null)
    {
      i = paramEdge.cachedTotalSize;
    }
    else
    {
      i = 0;
      paramEdge = null;
    }
    MinimalEncoder.Mode localMode1 = getPreviousMode();
    Object localObject = MinimalEncoder.1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
    int j = paramMode.ordinal();
    int k = localObject[j];
    switch (k)
    {
    default: 
      break;
    case 6: 
      i += 3;
      paramInput = MinimalEncoder.Mode.ASCII;
      if (localMode1 != paramInput)
      {
        paramInput = MinimalEncoder.Mode.B256;
        if (localMode1 != paramInput)
        {
          paramInput = MinimalEncoder.Mode.C40;
          if (localMode1 != paramInput)
          {
            paramInput = MinimalEncoder.Mode.TEXT;
            if (localMode1 != paramInput)
            {
              paramInput = MinimalEncoder.Mode.X12;
              if (localMode1 != paramInput) {
                break label499;
              }
            }
          }
          i += 2;
        }
      }
      break;
    }
    label412:
    do
    {
      do
      {
        do
        {
          int m;
          do
          {
            do
            {
              do
              {
                i += 1;
                break;
                localObject = MinimalEncoder.Mode.X12;
                if (paramMode == localObject)
                {
                  i += 2;
                }
                else
                {
                  j = 1;
                  int[] arrayOfInt = new int[j];
                  MinimalEncoder.Mode localMode2 = MinimalEncoder.Mode.C40;
                  if (paramMode == localMode2) {
                    paramInt2 = j;
                  }
                  m = MinimalEncoder.getNumberOfC40Words(paramInput, paramInt1, paramInt2, arrayOfInt) * 2;
                  i += m;
                }
                paramInput = MinimalEncoder.Mode.ASCII;
              } while (localMode1 == paramInput);
              paramInput = MinimalEncoder.Mode.B256;
            } while (localMode1 == paramInput);
            if (localMode1 == paramMode) {
              break label499;
            }
            paramInput = MinimalEncoder.Mode.C40;
            if (localMode1 == paramInput) {
              break;
            }
            paramInput = MinimalEncoder.Mode.TEXT;
            if (localMode1 == paramInput) {
              break;
            }
            if (localMode1 != localObject) {
              break label499;
            }
            break label412;
            i += 1;
            paramInput = MinimalEncoder.Mode.B256;
            if (localMode1 != paramInput) {}
            int n;
            do
            {
              i += 1;
              break;
              m = getB256Size();
              n = 250;
            } while (m == n);
            paramInput = MinimalEncoder.Mode.ASCII;
          } while (localMode1 == paramInput);
          paramInput = MinimalEncoder.Mode.C40;
          if (localMode1 == paramInput) {
            break;
          }
          paramInput = MinimalEncoder.Mode.TEXT;
          if (localMode1 == paramInput) {
            break;
          }
          paramInput = MinimalEncoder.Mode.X12;
          if (localMode1 != paramInput) {
            break label499;
          }
          break;
          i += 1;
          boolean bool2 = paramInput.isECI(paramInt1);
          if (!bool2)
          {
            char c = paramInput.charAt(paramInt1);
            m = paramInput.getFNC1Character();
            boolean bool1 = MinimalEncoder.isExtendedASCII(c, m);
            if (!bool1) {}
          }
          else
          {
            i += 1;
          }
          paramInput = MinimalEncoder.Mode.C40;
        } while (localMode1 == paramInput);
        paramInput = MinimalEncoder.Mode.TEXT;
      } while (localMode1 == paramInput);
      paramInput = MinimalEncoder.Mode.X12;
    } while (localMode1 == paramInput);
    label499:
    this.cachedTotalSize = i;
  }
  
  public static byte[] getBytes(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    paramInt = (byte)paramInt;
    arrayOfByte[0] = paramInt;
    return arrayOfByte;
  }
  
  public static byte[] getBytes(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[2];
    paramInt1 = (byte)paramInt1;
    arrayOfByte[0] = paramInt1;
    paramInt2 = (byte)paramInt2;
    arrayOfByte[1] = paramInt2;
    return arrayOfByte;
  }
  
  private static int getC40Value(boolean paramBoolean, int paramInt1, char paramChar, int paramInt2)
  {
    if (paramChar == paramInt2) {
      return 27;
    }
    paramInt2 = 127;
    char c1 = '_';
    char c2 = 'Z';
    char c3 = '9';
    char c4 = '/';
    char c5 = ' ';
    char c6 = '\037';
    char c7 = '@';
    char c8 = '\003';
    if (paramBoolean)
    {
      if (paramChar > c6) {
        if (paramChar == c5) {
          paramChar = c8;
        } else if (paramChar <= c4) {
          paramChar += '￟';
        } else if (paramChar <= c3) {
          paramChar += 'ￔ';
        } else if (paramChar <= c7) {
          paramChar += 'ￕ';
        } else if (paramChar <= c2) {
          paramChar += 'ￍ';
        } else if (paramChar <= c1) {
          paramChar += 'ﾻ';
        } else if (paramChar <= paramInt2) {
          paramChar += 'ﾠ';
        }
      }
      return paramChar;
    }
    paramBoolean = false;
    if (paramChar == 0) {}
    do
    {
      paramChar = '\000';
      break;
      if ((paramInt1 == 0) && (paramChar <= c8))
      {
        paramChar += '����';
        break;
      }
      int i = 1;
      if ((paramInt1 == i) && (paramChar <= c6)) {
        break;
      }
      if (paramChar == c5)
      {
        paramChar = c8;
        break;
      }
      paramInt1 = 33;
      if ((paramChar >= paramInt1) && (paramChar <= c4))
      {
        paramChar += '￟';
        break;
      }
      paramInt1 = 48;
      if ((paramChar >= paramInt1) && (paramChar <= c3))
      {
        paramChar += 'ￔ';
        break;
      }
      paramInt1 = 58;
      if ((paramChar >= paramInt1) && (paramChar <= c7))
      {
        paramChar += 'ￕ';
        break;
      }
      paramInt1 = 65;
      if ((paramChar >= paramInt1) && (paramChar <= c2))
      {
        paramChar += '￀';
        break;
      }
      paramInt1 = 91;
      if ((paramChar >= paramInt1) && (paramChar <= c1))
      {
        paramChar += 'ﾻ';
        break;
      }
      paramInt1 = 96;
    } while (paramChar == paramInt1);
    paramBoolean = true;
    if (paramChar >= paramBoolean)
    {
      paramBoolean = true;
      if (paramChar <= paramBoolean)
      {
        paramChar += 'ﾭ';
        return paramChar;
      }
    }
    paramBoolean = true;
    if ((paramChar >= paramBoolean) && (paramChar <= paramInt2)) {
      paramChar += 'ﾠ';
    }
    return paramChar;
  }
  
  public static int getShiftValue(char paramChar, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    if (paramBoolean)
    {
      bool = MinimalEncoder.access$600(paramChar);
      if (bool) {}
    }
    else
    {
      if (paramBoolean) {
        break label31;
      }
      bool = MinimalEncoder.access$700(paramChar);
      if (!bool) {
        break label31;
      }
    }
    return '\000';
    label31:
    if (paramBoolean)
    {
      bool = MinimalEncoder.access$800(paramChar, paramInt);
      if (bool) {}
    }
    else
    {
      if (paramBoolean) {
        break label64;
      }
      paramChar = MinimalEncoder.access$900(paramChar, paramInt);
      if (paramChar == 0) {
        break label64;
      }
    }
    return '\001';
    label64:
    paramChar = '\002';
    return paramChar;
  }
  
  private static int getX12Value(char paramChar)
  {
    char c = '\r';
    if (paramChar == c)
    {
      paramChar = '\000';
    }
    else
    {
      c = '*';
      if (paramChar == c)
      {
        paramChar = '\001';
      }
      else
      {
        c = '>';
        if (paramChar == c)
        {
          paramChar = '\002';
        }
        else
        {
          c = ' ';
          if (paramChar == c)
          {
            paramChar = '\003';
          }
          else
          {
            c = '0';
            if (paramChar >= c)
            {
              c = '9';
              if (paramChar <= c)
              {
                paramChar += 'ￔ';
                return paramChar;
              }
            }
            c = 'A';
            if (paramChar >= c)
            {
              c = 'Z';
              if (paramChar <= c) {
                paramChar += 'ￍ';
              }
            }
          }
        }
      }
    }
    return paramChar;
  }
  
  public static void setC40Word(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = (paramInt2 & 0xFF) * 1600;
    paramInt3 = (paramInt3 & 0xFF) * 40;
    paramInt2 += paramInt3;
    paramInt3 = paramInt4 & 0xFF;
    paramInt2 = paramInt2 + paramInt3 + 1;
    paramInt3 = (byte)(paramInt2 / 256);
    paramArrayOfByte[paramInt1] = paramInt3;
    paramInt1 += 1;
    paramInt2 = (byte)(paramInt2 % 256);
    paramArrayOfByte[paramInt1] = paramInt2;
  }
  
  public int getB256Size()
  {
    int i = 0;
    for (Edge localEdge = this; localEdge != null; localEdge = localEdge.previous)
    {
      MinimalEncoder.Mode localMode1 = localEdge.mode;
      MinimalEncoder.Mode localMode2 = MinimalEncoder.Mode.B256;
      if (localMode1 != localMode2) {
        break;
      }
      int j = 250;
      if (i > j) {
        break;
      }
      i += 1;
    }
    return i;
  }
  
  public byte[] getC40Words(boolean paramBoolean, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    int j = 0;
    Byte localByte1 = null;
    Object localObject1;
    label96:
    label120:
    Byte localByte3;
    for (;;)
    {
      int k = this.characterLength;
      if (j >= k) {
        break;
      }
      localObject1 = this.input;
      int i2 = this.fromPosition + j;
      k = ((MinimalECIInput)localObject1).charAt(i2);
      if (paramBoolean)
      {
        bool1 = HighLevelEncoder.isNativeC40(k);
        if (bool1) {}
      }
      else
      {
        if (paramBoolean) {
          break label120;
        }
        bool1 = HighLevelEncoder.isNativeText(k);
        if (!bool1) {
          break label120;
        }
      }
      int m = getC40Value(paramBoolean, 0, k, paramInt);
      m = (byte)m;
      localObject1 = Byte.valueOf(m);
      localArrayList.add(localObject1);
      break label298;
      boolean bool1 = MinimalEncoder.isExtendedASCII(m, paramInt);
      if (!bool1) {}
      for (;;)
      {
        int i3 = getShiftValue(m, paramBoolean, paramInt);
        byte b = (byte)i3;
        Byte localByte2 = Byte.valueOf(b);
        localArrayList.add(localByte2);
        int n = getC40Value(paramBoolean, i3, m, paramInt);
        break label96;
        n = (char)((n & 0xFF) + -128);
        i3 = 30;
        b = 1;
        boolean bool2;
        if (paramBoolean)
        {
          bool2 = HighLevelEncoder.isNativeC40(n);
          if (bool2) {}
        }
        else
        {
          if (paramBoolean) {
            break label263;
          }
          bool2 = HighLevelEncoder.isNativeText(n);
          if (!bool2) {
            break label263;
          }
        }
        localByte2 = Byte.valueOf(b);
        localArrayList.add(localByte2);
        localByte3 = Byte.valueOf(i3);
        localArrayList.add(localByte3);
        break;
        label263:
        localByte2 = Byte.valueOf(b);
        localArrayList.add(localByte2);
        localByte3 = Byte.valueOf(i3);
        localArrayList.add(localByte3);
      }
      label298:
      j += 1;
    }
    paramBoolean = localArrayList.size() % 3;
    if (paramBoolean)
    {
      localObject2 = Byte.valueOf((byte)0);
      localArrayList.add(localObject2);
    }
    paramBoolean = localArrayList.size() / 3 * 2;
    Object localObject2 = new byte[paramBoolean];
    paramInt = 0;
    for (;;)
    {
      j = localArrayList.size();
      if (i >= j) {
        break;
      }
      localByte1 = (Byte)localArrayList.get(i);
      j = localByte1.byteValue() & 0xFF;
      int i1 = i + 1;
      localObject1 = (Byte)localArrayList.get(i1);
      i1 = ((Byte)localObject1).byteValue() & 0xFF;
      int i4 = i + 2;
      localByte3 = (Byte)localArrayList.get(i4);
      i4 = localByte3.byteValue() & 0xFF;
      setC40Word((byte[])localObject2, paramInt, j, i1, i4);
      paramInt += 2;
      i += 3;
    }
    return localObject2;
  }
  
  public int getCodewordsRemaining(int paramInt)
  {
    return getMinSymbolSize(paramInt) - paramInt;
  }
  
  public byte[] getDataBytes()
  {
    Object localObject = MinimalEncoder.1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
    int i = this.mode.ordinal();
    int j = localObject[i];
    i = 0;
    MinimalEncoder.Input localInput = null;
    int n = 1;
    switch (j)
    {
    default: 
      break;
    case 6: 
      return getEDFBytes();
    case 5: 
      return getX12Words();
    case 4: 
      j = this.input.getFNC1Character();
      return getC40Words(false, j);
    case 3: 
      j = this.input.getFNC1Character();
      return getC40Words(n, j);
    case 2: 
      localObject = this.input;
      i = this.fromPosition;
      return getBytes(((MinimalECIInput)localObject).charAt(i));
    case 1: 
      localObject = this.input;
      i = this.fromPosition;
      boolean bool1 = ((MinimalECIInput)localObject).isECI(i);
      if (bool1)
      {
        localObject = this.input;
        i = this.fromPosition;
        k = ((MinimalECIInput)localObject).getECIValue(i) + n;
        return getBytes(241, k);
      }
      localObject = this.input;
      i = this.fromPosition;
      int k = ((MinimalECIInput)localObject).charAt(i);
      localInput = this.input;
      i = localInput.getFNC1Character();
      boolean bool2 = MinimalEncoder.isExtendedASCII(k, i);
      if (bool2)
      {
        localObject = this.input;
        i = this.fromPosition;
        m = ((MinimalECIInput)localObject).charAt(i) + 'ﾁ';
        return getBytes(235, m);
      }
      int m = this.characterLength;
      i = 2;
      if (m == i)
      {
        localObject = this.input;
        i = this.fromPosition;
        m = (((MinimalECIInput)localObject).charAt(i) + '￐') * 10;
        localInput = this.input;
        int i1 = this.fromPosition + n;
        i = localInput.charAt(i1);
        return getBytes(m + i + -48 + 130);
      }
      localObject = this.input;
      i = this.fromPosition;
      boolean bool3 = ((MinimalECIInput)localObject).isFNC1(i);
      if (bool3) {
        return getBytes(232);
      }
      localObject = this.input;
      i = this.fromPosition;
      return getBytes(((MinimalECIInput)localObject).charAt(i) + n);
    }
    return new byte[0];
  }
  
  public byte[] getEDFBytes()
  {
    double d1 = this.characterLength;
    double d2 = 4.0D;
    d1 = Math.ceil(d1 / d2);
    int i = (int)d1;
    int j = i * 3;
    byte[] arrayOfByte = new byte[j];
    int k = this.fromPosition;
    int m = this.characterLength + k;
    int n = 1;
    m -= n;
    int i1 = this.input.length() - n;
    m = Math.min(m, i1);
    i1 = 0;
    int i2 = 0;
    while (i2 < i)
    {
      int i3 = 4;
      int[] arrayOfInt = new int[i3];
      int i4 = 0;
      while (i4 < i3)
      {
        MinimalEncoder.Input localInput;
        if (k <= m)
        {
          localInput = this.input;
          int i5 = k + 1;
          k = localInput.charAt(k) & 0x3F;
          arrayOfInt[i4] = k;
          k = i5;
        }
        else
        {
          int i6 = m + 1;
          if (k == i6)
          {
            i6 = 31;
          }
          else
          {
            i6 = 0;
            localInput = null;
          }
          arrayOfInt[i4] = i6;
        }
        i4 += 1;
      }
      i3 = arrayOfInt[0] << 18;
      i4 = arrayOfInt[n] << 12;
      i3 |= i4;
      i4 = arrayOfInt[2] << 6;
      i3 |= i4;
      int i7 = arrayOfInt[3];
      i3 |= i7;
      i7 = (byte)(i3 >> 16 & 0xFF);
      arrayOfByte[i2] = i7;
      i7 = i2 + 1;
      i4 = (byte)(i3 >> 8 & 0xFF);
      arrayOfByte[i7] = i4;
      i7 = i2 + 2;
      i3 = (byte)(i3 & 0xFF);
      arrayOfByte[i7] = i3;
      i2 += 3;
    }
    return arrayOfByte;
  }
  
  public MinimalEncoder.Mode getEndMode()
  {
    MinimalEncoder.Mode localMode = this.mode;
    Object localObject = MinimalEncoder.Mode.EDF;
    if (localMode == localObject)
    {
      i = this.characterLength;
      j = 4;
      if (i < j) {
        return MinimalEncoder.Mode.ASCII;
      }
      i = getLastASCII();
      if (i > 0)
      {
        j = this.cachedTotalSize + i;
        j = getCodewordsRemaining(j);
        i = 2 - i;
        if (j <= i) {
          return MinimalEncoder.Mode.ASCII;
        }
      }
    }
    localMode = this.mode;
    localObject = MinimalEncoder.Mode.C40;
    if (localMode != localObject)
    {
      localObject = MinimalEncoder.Mode.TEXT;
      if (localMode != localObject)
      {
        localObject = MinimalEncoder.Mode.X12;
        if (localMode != localObject) {
          break label191;
        }
      }
    }
    int i = this.fromPosition;
    int j = this.characterLength;
    i += j;
    localObject = this.input;
    j = ((MinimalECIInput)localObject).length();
    if (i >= j)
    {
      i = this.cachedTotalSize;
      i = getCodewordsRemaining(i);
      if (i == 0) {
        return MinimalEncoder.Mode.ASCII;
      }
    }
    i = getLastASCII();
    j = 1;
    if (i == j)
    {
      i = this.cachedTotalSize + j;
      i = getCodewordsRemaining(i);
      if (i == 0) {
        return MinimalEncoder.Mode.ASCII;
      }
    }
    label191:
    return this.mode;
  }
  
  public int getLastASCII()
  {
    MinimalEncoder.Input localInput1 = this.input;
    int i = localInput1.length();
    int k = this.fromPosition;
    int i3 = this.characterLength;
    k += i3;
    int i4 = i - k;
    int i7 = 4;
    if ((i4 <= i7) && (k < i))
    {
      i = 1;
      int m;
      if (i4 == i)
      {
        k = this.input.charAt(k);
        localInput2 = this.input;
        i4 = localInput2.getFNC1Character();
        m = MinimalEncoder.isExtendedASCII(k, i4);
        if (m != 0) {
          return 0;
        }
        return i;
      }
      int i8 = 2;
      int i9;
      int i5;
      int n;
      MinimalEncoder.Input localInput5;
      if (i4 == i8)
      {
        localInput2 = this.input;
        i4 = localInput2.charAt(m);
        MinimalEncoder.Input localInput3 = this.input;
        i9 = localInput3.getFNC1Character();
        boolean bool3 = MinimalEncoder.isExtendedASCII(i4, i9);
        if (!bool3)
        {
          localInput2 = this.input;
          i9 = m + 1;
          char c3 = localInput2.charAt(i9);
          MinimalEncoder.Input localInput4 = this.input;
          int i10 = localInput4.getFNC1Character();
          i5 = MinimalEncoder.isExtendedASCII(c3, i10);
          if (i5 == 0)
          {
            localInput2 = this.input;
            n = HighLevelEncoder.isDigit(localInput2.charAt(m));
            if (n != 0)
            {
              localInput5 = this.input;
              n = HighLevelEncoder.isDigit(localInput5.charAt(i9));
              if (n != 0) {
                return i;
              }
            }
            return i8;
          }
        }
        return 0;
      }
      i = 3;
      int i1;
      int j;
      if (i5 == i)
      {
        localInput1 = this.input;
        boolean bool1 = HighLevelEncoder.isDigit(localInput1.charAt(n));
        if (bool1)
        {
          localInput1 = this.input;
          i6 = n + 1;
          bool1 = HighLevelEncoder.isDigit(localInput1.charAt(i6));
          if (bool1)
          {
            localInput1 = this.input;
            i6 = n + 2;
            char c1 = localInput1.charAt(i6);
            localInput2 = this.input;
            i6 = localInput2.getFNC1Character();
            bool2 = MinimalEncoder.isExtendedASCII(c1, i6);
            if (!bool2) {
              return i8;
            }
          }
        }
        localInput1 = this.input;
        int i6 = n + 1;
        boolean bool2 = HighLevelEncoder.isDigit(localInput1.charAt(i6));
        if (bool2)
        {
          localInput1 = this.input;
          i6 = n + 2;
          bool2 = HighLevelEncoder.isDigit(localInput1.charAt(i6));
          if (bool2)
          {
            localInput1 = this.input;
            char c2 = localInput1.charAt(n);
            localInput5 = this.input;
            i1 = localInput5.getFNC1Character();
            j = MinimalEncoder.isExtendedASCII(c2, i1);
            if (j == 0) {
              return i8;
            }
          }
        }
        return 0;
      }
      MinimalEncoder.Input localInput2 = this.input;
      boolean bool4 = HighLevelEncoder.isDigit(localInput2.charAt(i1));
      if (bool4)
      {
        localInput2 = this.input;
        i9 = i1 + 1;
        bool4 = HighLevelEncoder.isDigit(localInput2.charAt(i9));
        if (bool4)
        {
          localInput2 = this.input;
          i9 = i1 + 2;
          bool4 = HighLevelEncoder.isDigit(localInput2.charAt(i9));
          if (bool4)
          {
            localInput2 = this.input;
            int i2;
            i1 += j;
            j = HighLevelEncoder.isDigit(localInput2.charAt(i2));
            if (j != 0) {
              return i8;
            }
          }
        }
      }
    }
    return 0;
  }
  
  public byte[] getLatchBytes()
  {
    int[] arrayOfInt = MinimalEncoder.1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
    MinimalEncoder.Mode localMode1 = getPreviousMode();
    int i = localMode1.ordinal();
    i = arrayOfInt[i];
    int j = 240;
    int k = 238;
    int m = 239;
    int n = 230;
    int i1 = 231;
    int i2;
    switch (i)
    {
    default: 
      break;
    case 3: 
    case 4: 
    case 5: 
      localMode1 = this.mode;
      MinimalEncoder.Mode localMode2 = getPreviousMode();
      if (localMode1 != localMode2)
      {
        localMode1 = this.mode;
        i = localMode1.ordinal();
        i2 = arrayOfInt[i];
        i = 254;
        switch (i2)
        {
        default: 
          break;
        case 6: 
          return getBytes(i, j);
        case 5: 
          return getBytes(i, k);
        case 4: 
          return getBytes(i, m);
        case 3: 
          return getBytes(i, n);
        case 2: 
          return getBytes(i, i1);
        case 1: 
          return getBytes(i);
        }
      }
      break;
    case 1: 
    case 2: 
      localMode1 = this.mode;
      i = localMode1.ordinal();
      i2 = arrayOfInt[i];
      i = 2;
      if (i2 != i)
      {
        i = 3;
        if (i2 != i)
        {
          i = 4;
          if (i2 != i)
          {
            i = 5;
            if (i2 != i)
            {
              i = 6;
              if (i2 == i) {
                return getBytes(j);
              }
            }
            else
            {
              return getBytes(k);
            }
          }
          else
          {
            return getBytes(m);
          }
        }
        else
        {
          return getBytes(n);
        }
      }
      else
      {
        return getBytes(i1);
      }
      break;
    }
    return new byte[0];
  }
  
  public int getMinSymbolSize(int paramInt)
  {
    int[] arrayOfInt1 = MinimalEncoder.1.$SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint;
    int i = MinimalEncoder.Input.access$500(this.input).ordinal();
    int j = arrayOfInt1[i];
    i = 0;
    int k = 1;
    int n;
    int i1;
    if (j != k)
    {
      m = 2;
      if (j == m)
      {
        arrayOfInt1 = rectangularCodewordCapacities;
        m = arrayOfInt1.length;
        n = 0;
        while (n < m)
        {
          i1 = arrayOfInt1[n];
          if (i1 >= paramInt) {
            return i1;
          }
          n += 1;
        }
      }
    }
    else
    {
      arrayOfInt1 = squareCodewordCapacities;
      m = arrayOfInt1.length;
      n = 0;
      while (n < m)
      {
        i1 = arrayOfInt1[n];
        if (i1 >= paramInt) {
          return i1;
        }
        n += 1;
      }
    }
    arrayOfInt1 = allCodewordCapacities;
    int m = arrayOfInt1.length;
    while (i < m)
    {
      n = arrayOfInt1[i];
      if (n >= paramInt) {
        return n;
      }
      i += 1;
    }
    int[] arrayOfInt2 = allCodewordCapacities;
    j = arrayOfInt2.length - k;
    return arrayOfInt2[j];
  }
  
  public MinimalEncoder.Mode getMode()
  {
    return this.mode;
  }
  
  public MinimalEncoder.Mode getPreviousMode()
  {
    Object localObject = this.previous;
    if (localObject == null) {
      localObject = MinimalEncoder.Mode.ASCII;
    } else {
      localObject = ((Edge)localObject).getEndMode();
    }
    return localObject;
  }
  
  public MinimalEncoder.Mode getPreviousStartMode()
  {
    Object localObject = this.previous;
    if (localObject == null) {
      localObject = MinimalEncoder.Mode.ASCII;
    } else {
      localObject = ((Edge)localObject).mode;
    }
    return localObject;
  }
  
  public byte[] getX12Words()
  {
    int i = this.characterLength / 3 * 2;
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    while (j < i)
    {
      MinimalEncoder.Input localInput1 = this.input;
      int k = this.fromPosition;
      int m = j / 2 * 3;
      k += m;
      int n = getX12Value(localInput1.charAt(k));
      MinimalEncoder.Input localInput2 = this.input;
      int i1 = this.fromPosition + m + 1;
      k = getX12Value(localInput2.charAt(i1));
      MinimalEncoder.Input localInput3 = this.input;
      int i2 = this.fromPosition + m + 2;
      m = getX12Value(localInput3.charAt(i2));
      setC40Word(arrayOfByte, j, n, k, m);
      j += 2;
    }
    return arrayOfByte;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge
 * JD-Core Version:    0.7.0.1
 */