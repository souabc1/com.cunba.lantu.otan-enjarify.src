package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;
import m54207b69;

final class GeneralAppIdDecoder
{
  private final StringBuilder buffer;
  private final CurrentParsingState current;
  private final BitArray information;
  
  public GeneralAppIdDecoder(BitArray paramBitArray)
  {
    Object localObject = new com/google/zxing/oned/rss/expanded/decoders/CurrentParsingState;
    ((CurrentParsingState)localObject).<init>();
    this.current = ((CurrentParsingState)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    this.buffer = ((StringBuilder)localObject);
    this.information = paramBitArray;
  }
  
  private DecodedChar decodeAlphanumeric(int paramInt)
  {
    int i = 5;
    int j = extractNumericValueFromBitArray(paramInt, i);
    int k = 15;
    if (j == k)
    {
      DecodedChar localDecodedChar = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
      paramInt += i;
      localDecodedChar.<init>(paramInt, '$');
      return localDecodedChar;
    }
    if ((j >= i) && (j < k))
    {
      localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
      paramInt += i;
      i = (char)(j + 48 - i);
      ((DecodedChar)localObject1).<init>(paramInt, i);
      return localObject1;
    }
    i = 6;
    j = extractNumericValueFromBitArray(paramInt, i);
    k = 32;
    if (j >= k)
    {
      k = 58;
      if (j < k)
      {
        localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
        paramInt += i;
        i = (char)(j + 33);
        ((DecodedChar)localObject1).<init>(paramInt, i);
        return localObject1;
      }
    }
    switch (j)
    {
    default: 
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = m54207b69.F54207b69_11("B?7B5B5E535F5B575F275F5B546A60646A2F6F65626B7367616A736771783C677D736B7C2843");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(j);
      localObject2 = ((StringBuilder)localObject2).toString();
      localIllegalStateException.<init>((String)localObject2);
      throw localIllegalStateException;
    case 62: 
      j = 47;
      break;
    case 61: 
      j = 46;
      break;
    case 60: 
      j = 45;
      break;
    case 59: 
      j = 44;
      break;
    case 58: 
      j = 42;
    }
    Object localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
    paramInt += i;
    ((DecodedChar)localObject1).<init>(paramInt, j);
    return localObject1;
  }
  
  private DecodedChar decodeIsoIec646(int paramInt)
  {
    int i = 5;
    int j = extractNumericValueFromBitArray(paramInt, i);
    int k = 15;
    if (j == k)
    {
      DecodedChar localDecodedChar1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
      paramInt += i;
      localDecodedChar1.<init>(paramInt, '$');
      return localDecodedChar1;
    }
    if ((j >= i) && (j < k))
    {
      localDecodedChar2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
      paramInt += i;
      i = (char)(j + 48 - i);
      localDecodedChar2.<init>(paramInt, i);
      return localDecodedChar2;
    }
    i = 7;
    j = extractNumericValueFromBitArray(paramInt, i);
    k = 64;
    int m = 90;
    if ((j >= k) && (j < m))
    {
      localDecodedChar2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
      paramInt += i;
      i = (char)(j + 1);
      localDecodedChar2.<init>(paramInt, i);
      return localDecodedChar2;
    }
    if (j >= m)
    {
      k = 116;
      if (j < k)
      {
        localDecodedChar2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
        paramInt += i;
        i = (char)(j + i);
        localDecodedChar2.<init>(paramInt, i);
        return localDecodedChar2;
      }
    }
    i = 8;
    j = extractNumericValueFromBitArray(paramInt, i);
    switch (j)
    {
    default: 
      throw FormatException.getFormatInstance();
    case 252: 
      j = 32;
      break;
    case 251: 
      j = 95;
      break;
    case 250: 
      j = 63;
      break;
    case 249: 
      j = 62;
      break;
    case 248: 
      j = 61;
      break;
    case 247: 
      j = 60;
      break;
    case 246: 
      j = 59;
      break;
    case 245: 
      j = 58;
      break;
    case 244: 
      j = 47;
      break;
    case 243: 
      j = 46;
      break;
    case 242: 
      j = 45;
      break;
    case 241: 
      j = 44;
      break;
    case 240: 
      j = 43;
      break;
    case 239: 
      j = 42;
      break;
    case 238: 
      j = 41;
      break;
    case 237: 
      j = 40;
      break;
    case 236: 
      j = 39;
      break;
    case 235: 
      j = 38;
      break;
    case 234: 
      j = 37;
      break;
    case 233: 
      j = 34;
      break;
    case 232: 
      j = 33;
    }
    DecodedChar localDecodedChar2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedChar;
    paramInt += i;
    localDecodedChar2.<init>(paramInt, j);
    return localDecodedChar2;
  }
  
  private DecodedNumeric decodeNumeric(int paramInt)
  {
    int i = paramInt + 7;
    Object localObject = this.information;
    int j = ((BitArray)localObject).getSize();
    if (i > j)
    {
      paramInt = extractNumericValueFromBitArray(paramInt, 4);
      i = 10;
      if (paramInt == 0)
      {
        DecodedNumeric localDecodedNumeric1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedNumeric;
        j = this.information.getSize();
        localDecodedNumeric1.<init>(j, i, i);
        return localDecodedNumeric1;
      }
      localObject = new com/google/zxing/oned/rss/expanded/decoders/DecodedNumeric;
      int k = this.information.getSize();
      paramInt += -1;
      ((DecodedNumeric)localObject).<init>(k, paramInt, i);
      return localObject;
    }
    paramInt = extractNumericValueFromBitArray(paramInt, 7) + -8;
    j = paramInt / 11;
    paramInt %= 11;
    DecodedNumeric localDecodedNumeric2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedNumeric;
    localDecodedNumeric2.<init>(i, j, paramInt);
    return localDecodedNumeric2;
  }
  
  public static int extractNumericValueFromBitArray(BitArray paramBitArray, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt2)
    {
      int k = paramInt1 + i;
      boolean bool = paramBitArray.get(k);
      if (bool)
      {
        int m = paramInt2 - i;
        int n = 1;
        m -= n;
        m = n << m;
        j |= m;
      }
      i += 1;
    }
    return j;
  }
  
  private boolean isAlphaOr646ToNumericLatch(int paramInt)
  {
    int i = paramInt + 3;
    BitArray localBitArray = this.information;
    int j = localBitArray.getSize();
    if (i > j) {
      return false;
    }
    while (paramInt < i)
    {
      localBitArray = this.information;
      boolean bool = localBitArray.get(paramInt);
      if (bool) {
        return false;
      }
      paramInt += 1;
    }
    return true;
  }
  
  private boolean isAlphaTo646ToAlphaLatch(int paramInt)
  {
    int i = paramInt + 1;
    BitArray localBitArray1 = this.information;
    int j = localBitArray1.getSize();
    if (i > j) {
      return false;
    }
    i = 0;
    for (;;)
    {
      j = 5;
      if (i >= j) {
        break;
      }
      j = i + paramInt;
      BitArray localBitArray2 = this.information;
      int m = localBitArray2.getSize();
      if (j >= m) {
        break;
      }
      m = 2;
      int k;
      if (i == m)
      {
        localBitArray1 = this.information;
        m = paramInt + 2;
        k = localBitArray1.get(m);
        if (k == 0) {
          return false;
        }
      }
      else
      {
        localBitArray2 = this.information;
        boolean bool = localBitArray2.get(k);
        if (bool) {
          return false;
        }
      }
      i += 1;
    }
    return true;
  }
  
  private boolean isNumericToAlphaNumericLatch(int paramInt)
  {
    int i = paramInt + 1;
    BitArray localBitArray1 = this.information;
    int j = localBitArray1.getSize();
    if (i > j) {
      return false;
    }
    i = 0;
    for (;;)
    {
      j = 4;
      if (i >= j) {
        break;
      }
      j = i + paramInt;
      BitArray localBitArray2 = this.information;
      int k = localBitArray2.getSize();
      if (j >= k) {
        break;
      }
      localBitArray2 = this.information;
      boolean bool = localBitArray2.get(j);
      if (bool) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private boolean isStillAlpha(int paramInt)
  {
    int i = paramInt + 5;
    BitArray localBitArray = this.information;
    int j = localBitArray.getSize();
    boolean bool1 = false;
    if (i > j) {
      return false;
    }
    i = 5;
    j = extractNumericValueFromBitArray(paramInt, i);
    boolean bool2 = true;
    int k = 16;
    if ((j >= i) && (j < k)) {
      return bool2;
    }
    i = paramInt + 6;
    localBitArray = this.information;
    j = localBitArray.getSize();
    if (i > j) {
      return false;
    }
    i = 6;
    paramInt = extractNumericValueFromBitArray(paramInt, i);
    if (paramInt >= k)
    {
      i = 63;
      if (paramInt < i) {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  private boolean isStillIsoIec646(int paramInt)
  {
    int i = paramInt + 5;
    BitArray localBitArray = this.information;
    int j = localBitArray.getSize();
    boolean bool1 = false;
    if (i > j) {
      return false;
    }
    i = 5;
    j = extractNumericValueFromBitArray(paramInt, i);
    boolean bool2 = true;
    if (j >= i)
    {
      i = 16;
      if (j < i) {
        return bool2;
      }
    }
    i = paramInt + 7;
    localBitArray = this.information;
    j = localBitArray.getSize();
    if (i > j) {
      return false;
    }
    i = extractNumericValueFromBitArray(paramInt, 7);
    j = 64;
    if (i >= j)
    {
      j = 116;
      if (i < j) {
        return bool2;
      }
    }
    i = paramInt + 8;
    localBitArray = this.information;
    j = localBitArray.getSize();
    if (i > j) {
      return false;
    }
    paramInt = extractNumericValueFromBitArray(paramInt, 8);
    i = 232;
    if (paramInt >= i)
    {
      i = 253;
      if (paramInt < i) {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  private boolean isStillNumeric(int paramInt)
  {
    int i = paramInt + 7;
    BitArray localBitArray1 = this.information;
    int j = localBitArray1.getSize();
    boolean bool = true;
    if (i > j)
    {
      paramInt += 4;
      BitArray localBitArray2 = this.information;
      i = localBitArray2.getSize();
      if (paramInt > i) {
        bool = false;
      }
      return bool;
    }
    i = paramInt;
    int k;
    for (;;)
    {
      j = paramInt + 3;
      if (i >= j) {
        break;
      }
      localBitArray1 = this.information;
      k = localBitArray1.get(i);
      if (k != 0) {
        return bool;
      }
      i += 1;
    }
    return this.information.get(k);
  }
  
  private BlockParsedResult parseAlphaBlock()
  {
    Object localObject2;
    int i1;
    int i2;
    Object localObject3;
    for (;;)
    {
      localObject1 = this.current;
      int i = ((CurrentParsingState)localObject1).getPosition();
      boolean bool1 = isStillAlpha(i);
      if (!bool1) {
        break;
      }
      int j = this.current.getPosition();
      localObject1 = decodeAlphanumeric(j);
      localObject2 = this.current;
      i1 = ((DecodedObject)localObject1).getNewPosition();
      ((CurrentParsingState)localObject2).setPosition(i1);
      boolean bool4 = ((DecodedChar)localObject1).isFNC1();
      if (bool4)
      {
        localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
        i2 = this.current.getPosition();
        localObject3 = this.buffer.toString();
        ((DecodedInformation)localObject1).<init>(i2, (String)localObject3);
        localObject2 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
        ((BlockParsedResult)localObject2).<init>((DecodedInformation)localObject1, true);
        return localObject2;
      }
      localObject2 = this.buffer;
      j = ((DecodedChar)localObject1).getValue();
      ((StringBuilder)localObject2).append(j);
    }
    Object localObject1 = this.current;
    int k = ((CurrentParsingState)localObject1).getPosition();
    boolean bool2 = isAlphaOr646ToNumericLatch(k);
    if (bool2)
    {
      localObject1 = this.current;
      i2 = 3;
      ((CurrentParsingState)localObject1).incrementPosition(i2);
      localObject1 = this.current;
      ((CurrentParsingState)localObject1).setNumeric();
    }
    else
    {
      localObject1 = this.current;
      int m = ((CurrentParsingState)localObject1).getPosition();
      boolean bool3 = isAlphaTo646ToAlphaLatch(m);
      if (bool3)
      {
        localObject1 = this.current;
        int n = ((CurrentParsingState)localObject1).getPosition();
        i2 = 5;
        n += i2;
        localObject3 = this.information;
        i1 = ((BitArray)localObject3).getSize();
        if (n < i1)
        {
          localObject1 = this.current;
          ((CurrentParsingState)localObject1).incrementPosition(i2);
        }
        else
        {
          localObject1 = this.current;
          localObject2 = this.information;
          i2 = ((BitArray)localObject2).getSize();
          ((CurrentParsingState)localObject1).setPosition(i2);
        }
        localObject1 = this.current;
        ((CurrentParsingState)localObject1).setIsoIec646();
      }
    }
    localObject1 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
    ((BlockParsedResult)localObject1).<init>();
    return localObject1;
  }
  
  private DecodedInformation parseBlocks()
  {
    int i;
    Object localObject;
    boolean bool2;
    do
    {
      CurrentParsingState localCurrentParsingState1 = this.current;
      i = localCurrentParsingState1.getPosition();
      localObject = this.current;
      boolean bool1 = ((CurrentParsingState)localObject).isAlpha();
      if (bool1) {
        localObject = parseAlphaBlock();
      }
      for (;;)
      {
        bool2 = ((BlockParsedResult)localObject).isFinished();
        break;
        localObject = this.current;
        bool1 = ((CurrentParsingState)localObject).isIsoIec646();
        if (bool1) {
          localObject = parseIsoIec646Block();
        } else {
          localObject = parseNumericBlock();
        }
      }
      CurrentParsingState localCurrentParsingState2 = this.current;
      int j = localCurrentParsingState2.getPosition();
      if (i != j)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localCurrentParsingState1 = null;
      }
    } while (((i != 0) || (bool2)) && (!bool2));
    return ((BlockParsedResult)localObject).getDecodedInformation();
  }
  
  private BlockParsedResult parseIsoIec646Block()
  {
    Object localObject2;
    int i1;
    int i2;
    Object localObject3;
    for (;;)
    {
      localObject1 = this.current;
      int i = ((CurrentParsingState)localObject1).getPosition();
      boolean bool1 = isStillIsoIec646(i);
      if (!bool1) {
        break;
      }
      int j = this.current.getPosition();
      localObject1 = decodeIsoIec646(j);
      localObject2 = this.current;
      i1 = ((DecodedObject)localObject1).getNewPosition();
      ((CurrentParsingState)localObject2).setPosition(i1);
      boolean bool4 = ((DecodedChar)localObject1).isFNC1();
      if (bool4)
      {
        localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
        i2 = this.current.getPosition();
        localObject3 = this.buffer.toString();
        ((DecodedInformation)localObject1).<init>(i2, (String)localObject3);
        localObject2 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
        ((BlockParsedResult)localObject2).<init>((DecodedInformation)localObject1, true);
        return localObject2;
      }
      localObject2 = this.buffer;
      j = ((DecodedChar)localObject1).getValue();
      ((StringBuilder)localObject2).append(j);
    }
    Object localObject1 = this.current;
    int k = ((CurrentParsingState)localObject1).getPosition();
    boolean bool2 = isAlphaOr646ToNumericLatch(k);
    if (bool2)
    {
      localObject1 = this.current;
      i2 = 3;
      ((CurrentParsingState)localObject1).incrementPosition(i2);
      localObject1 = this.current;
      ((CurrentParsingState)localObject1).setNumeric();
    }
    else
    {
      localObject1 = this.current;
      int m = ((CurrentParsingState)localObject1).getPosition();
      boolean bool3 = isAlphaTo646ToAlphaLatch(m);
      if (bool3)
      {
        localObject1 = this.current;
        int n = ((CurrentParsingState)localObject1).getPosition();
        i2 = 5;
        n += i2;
        localObject3 = this.information;
        i1 = ((BitArray)localObject3).getSize();
        if (n < i1)
        {
          localObject1 = this.current;
          ((CurrentParsingState)localObject1).incrementPosition(i2);
        }
        else
        {
          localObject1 = this.current;
          localObject2 = this.information;
          i2 = ((BitArray)localObject2).getSize();
          ((CurrentParsingState)localObject1).setPosition(i2);
        }
        localObject1 = this.current;
        ((CurrentParsingState)localObject1).setAlpha();
      }
    }
    localObject1 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
    ((BlockParsedResult)localObject1).<init>();
    return localObject1;
  }
  
  private BlockParsedResult parseNumericBlock()
  {
    int n;
    for (;;)
    {
      localObject1 = this.current;
      int i = ((CurrentParsingState)localObject1).getPosition();
      boolean bool1 = isStillNumeric(i);
      if (!bool1) {
        break;
      }
      j = this.current.getPosition();
      localObject1 = decodeNumeric(j);
      Object localObject2 = this.current;
      int k = ((DecodedObject)localObject1).getNewPosition();
      ((CurrentParsingState)localObject2).setPosition(k);
      boolean bool3 = ((DecodedNumeric)localObject1).isFirstDigitFNC1();
      k = 1;
      Object localObject3;
      if (bool3)
      {
        bool3 = ((DecodedNumeric)localObject1).isSecondDigitFNC1();
        if (bool3)
        {
          localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
          localObject2 = this.current;
          int m = ((CurrentParsingState)localObject2).getPosition();
          localObject3 = this.buffer.toString();
          ((DecodedInformation)localObject1).<init>(m, (String)localObject3);
        }
        else
        {
          localObject2 = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
          localObject3 = this.current;
          i1 = ((CurrentParsingState)localObject3).getPosition();
          String str = this.buffer.toString();
          j = ((DecodedNumeric)localObject1).getSecondDigit();
          ((DecodedInformation)localObject2).<init>(i1, str, j);
          localObject1 = localObject2;
        }
        localObject2 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
        ((BlockParsedResult)localObject2).<init>((DecodedInformation)localObject1, k);
        return localObject2;
      }
      localObject2 = this.buffer;
      int i1 = ((DecodedNumeric)localObject1).getFirstDigit();
      ((StringBuilder)localObject2).append(i1);
      boolean bool4 = ((DecodedNumeric)localObject1).isSecondDigitFNC1();
      if (bool4)
      {
        localObject1 = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
        n = this.current.getPosition();
        localObject3 = this.buffer.toString();
        ((DecodedInformation)localObject1).<init>(n, (String)localObject3);
        localObject2 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
        ((BlockParsedResult)localObject2).<init>((DecodedInformation)localObject1, k);
        return localObject2;
      }
      localObject2 = this.buffer;
      j = ((DecodedNumeric)localObject1).getSecondDigit();
      ((StringBuilder)localObject2).append(j);
    }
    Object localObject1 = this.current;
    int j = ((CurrentParsingState)localObject1).getPosition();
    boolean bool2 = isNumericToAlphaNumericLatch(j);
    if (bool2)
    {
      this.current.setAlpha();
      localObject1 = this.current;
      n = 4;
      ((CurrentParsingState)localObject1).incrementPosition(n);
    }
    localObject1 = new com/google/zxing/oned/rss/expanded/decoders/BlockParsedResult;
    ((BlockParsedResult)localObject1).<init>();
    return localObject1;
  }
  
  public String decodeAllCodes(StringBuilder paramStringBuilder, int paramInt)
  {
    String str;
    for (Object localObject = null;; localObject = str)
    {
      localObject = decodeGeneralPurposeField(paramInt, (String)localObject);
      str = FieldParser.parseFieldsInGeneralPurpose(((DecodedInformation)localObject).getNewString());
      if (str != null) {
        paramStringBuilder.append(str);
      }
      boolean bool = ((DecodedInformation)localObject).isRemaining();
      int i;
      if (bool)
      {
        i = ((DecodedInformation)localObject).getRemainingValue();
        str = String.valueOf(i);
      }
      else
      {
        i = 0;
        str = null;
      }
      int j = ((DecodedObject)localObject).getNewPosition();
      if (paramInt == j) {
        return paramStringBuilder.toString();
      }
      paramInt = ((DecodedObject)localObject).getNewPosition();
    }
  }
  
  public DecodedInformation decodeGeneralPurposeField(int paramInt, String paramString)
  {
    Object localObject = this.buffer;
    String str = null;
    ((StringBuilder)localObject).setLength(0);
    if (paramString != null)
    {
      localObject = this.buffer;
      ((StringBuilder)localObject).append(paramString);
    }
    paramString = this.current;
    paramString.setPosition(paramInt);
    DecodedInformation localDecodedInformation = parseBlocks();
    if (localDecodedInformation != null)
    {
      boolean bool = localDecodedInformation.isRemaining();
      if (bool)
      {
        paramString = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
        int j = this.current.getPosition();
        str = this.buffer.toString();
        paramInt = localDecodedInformation.getRemainingValue();
        paramString.<init>(j, str, paramInt);
        return paramString;
      }
    }
    localDecodedInformation = new com/google/zxing/oned/rss/expanded/decoders/DecodedInformation;
    int i = this.current.getPosition();
    localObject = this.buffer.toString();
    localDecodedInformation.<init>(i, (String)localObject);
    return localDecodedInformation;
  }
  
  public int extractNumericValueFromBitArray(int paramInt1, int paramInt2)
  {
    return extractNumericValueFromBitArray(this.information, paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder
 * JD-Core Version:    0.7.0.1
 */