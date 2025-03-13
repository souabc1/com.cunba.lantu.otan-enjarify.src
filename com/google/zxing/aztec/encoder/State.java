package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

final class State
{
  static final State INITIAL_STATE;
  private final int binaryShiftByteCount;
  private final int binaryShiftCost;
  private final int bitCount;
  private final int mode;
  private final Token token;
  
  static
  {
    State localState = new com/google/zxing/aztec/encoder/State;
    Token localToken = Token.EMPTY;
    localState.<init>(localToken, 0, 0, 0);
    INITIAL_STATE = localState;
  }
  
  private State(Token paramToken, int paramInt1, int paramInt2, int paramInt3)
  {
    this.token = paramToken;
    this.mode = paramInt1;
    this.binaryShiftByteCount = paramInt2;
    this.bitCount = paramInt3;
    int i = calculateBinaryShiftCost(paramInt2);
    this.binaryShiftCost = i;
  }
  
  private static int calculateBinaryShiftCost(int paramInt)
  {
    int i = 62;
    if (paramInt > i) {
      return 21;
    }
    i = 31;
    if (paramInt > i) {
      return 20;
    }
    if (paramInt > 0) {
      return 10;
    }
    return 0;
  }
  
  public State addBinaryShiftChar(int paramInt)
  {
    Token localToken = this.token;
    int i = this.mode;
    int j = this.bitCount;
    int k = 4;
    if (i != k)
    {
      k = 2;
      if (i != k) {}
    }
    else
    {
      int[] arrayOfInt = HighLevelEncoder.LATCH_TABLE[i];
      k = 0;
      i = arrayOfInt[0];
      m = (char)-1 & i;
      i >>= 16;
      localToken = localToken.add(m, i);
      j += i;
      i = 0;
      arrayOfInt = null;
    }
    k = this.binaryShiftByteCount;
    if (k != 0)
    {
      m = 31;
      if (k != m)
      {
        m = 62;
        if (k == m)
        {
          m = 9;
          break label133;
        }
        m = 8;
        break label133;
      }
    }
    int m = 18;
    label133:
    State localState = new com/google/zxing/aztec/encoder/State;
    k += 1;
    j += m;
    localState.<init>(localToken, i, k, j);
    int n = localState.binaryShiftByteCount;
    i = 2078;
    if (n == i)
    {
      paramInt += 1;
      localState = localState.endBinaryShift(paramInt);
    }
    return localState;
  }
  
  public State appendFLGn(int paramInt)
  {
    int i = 4;
    Token localToken = shiftAndAppend(i, 0).token;
    int j = 3;
    if (paramInt < 0)
    {
      localObject1 = localToken.add(0, j);
    }
    else
    {
      k = 999999;
      if (paramInt > k) {
        break label169;
      }
      localObject1 = Integer.toString(paramInt);
      Charset localCharset = StandardCharsets.ISO_8859_1;
      localObject1 = ((String)localObject1).getBytes(localCharset);
      k = localObject1.length;
      localToken = localToken.add(k, j);
      k = localObject1.length;
      int m = 0;
      while (m < k)
      {
        int n = localObject1[m] + -48 + 2;
        localToken = localToken.add(n, i);
        m += 1;
      }
      paramInt = localObject1.length * i;
      j += paramInt;
      localObject1 = localToken;
    }
    Object localObject2 = new com/google/zxing/aztec/encoder/State;
    int i1 = this.mode;
    int k = this.bitCount + j;
    ((State)localObject2).<init>((Token)localObject1, i1, 0, k);
    return localObject2;
    label169:
    Object localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = m54207b69.F54207b69_11("X{3E39345E1C192525631F18131B68272D6B2A30222033342C73647535313C79616263646566");
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public State endBinaryShift(int paramInt)
  {
    int i = this.binaryShiftByteCount;
    if (i == 0) {
      return this;
    }
    Token localToken1 = this.token;
    paramInt -= i;
    Token localToken2 = localToken1.addBinaryShift(paramInt, i);
    State localState = new com/google/zxing/aztec/encoder/State;
    int j = this.mode;
    int k = this.bitCount;
    localState.<init>(localToken2, j, 0, k);
    return localState;
  }
  
  public int getBinaryShiftByteCount()
  {
    return this.binaryShiftByteCount;
  }
  
  public int getBitCount()
  {
    return this.bitCount;
  }
  
  public int getMode()
  {
    return this.mode;
  }
  
  public Token getToken()
  {
    return this.token;
  }
  
  public boolean isBetterThanOrEqualTo(State paramState)
  {
    int i = this.bitCount;
    Object localObject = HighLevelEncoder.LATCH_TABLE;
    int j = this.mode;
    localObject = localObject[j];
    j = paramState.mode;
    int k = localObject[j] >> 16;
    i += k;
    k = this.binaryShiftByteCount;
    j = paramState.binaryShiftByteCount;
    if (k < j)
    {
      k = paramState.binaryShiftCost;
      j = this.binaryShiftCost;
      k -= j;
      i += k;
    }
    else if ((k > j) && (j > 0))
    {
      i += 10;
    }
    int m = paramState.bitCount;
    if (i <= m)
    {
      m = 1;
    }
    else
    {
      m = 0;
      paramState = null;
    }
    return m;
  }
  
  public State latchAndAppend(int paramInt1, int paramInt2)
  {
    int i = this.bitCount;
    Object localObject = this.token;
    int j = this.mode;
    if (paramInt1 != j)
    {
      int[][] arrayOfInt = HighLevelEncoder.LATCH_TABLE;
      int[] arrayOfInt1 = arrayOfInt[j];
      j = arrayOfInt1[paramInt1];
      int k = (char)-1 & j;
      j >>= 16;
      localObject = ((Token)localObject).add(k, j);
      i += j;
    }
    j = 2;
    if (paramInt1 == j) {
      j = 4;
    } else {
      j = 5;
    }
    Token localToken = ((Token)localObject).add(paramInt2, j);
    localObject = new com/google/zxing/aztec/encoder/State;
    i += j;
    ((State)localObject).<init>(localToken, paramInt1, 0, i);
    return localObject;
  }
  
  public State shiftAndAppend(int paramInt1, int paramInt2)
  {
    Token localToken1 = this.token;
    int i = this.mode;
    int j = 2;
    int k = 5;
    if (i == j) {
      j = 4;
    } else {
      j = k;
    }
    paramInt1 = HighLevelEncoder.SHIFT_TABLE[i][paramInt1];
    Token localToken2 = localToken1.add(paramInt1, j).add(paramInt2, k);
    State localState = new com/google/zxing/aztec/encoder/State;
    int m = this.mode;
    i = this.bitCount + j + k;
    localState.<init>(localToken2, m, 0, i);
    return localState;
  }
  
  public BitArray toBitArray(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfByte.length;
    for (Object localObject = endBinaryShift(i).token; localObject != null; localObject = ((Token)localObject).getPrevious()) {
      localArrayList.add(localObject);
    }
    localObject = new com/google/zxing/common/BitArray;
    ((BitArray)localObject).<init>();
    int j = localArrayList.size() + -1;
    while (j >= 0)
    {
      Token localToken = (Token)localArrayList.get(j);
      localToken.appendTo((BitArray)localObject, paramArrayOfByte);
      j += -1;
    }
    return localObject;
  }
  
  public String toString()
  {
    Object localObject = HighLevelEncoder.MODE_NAMES;
    int i = this.mode;
    localObject = localObject[i];
    Integer localInteger1 = Integer.valueOf(this.bitCount);
    Integer localInteger2 = Integer.valueOf(this.binaryShiftByteCount);
    Object[] tmp34_31 = new Object[3];
    Object[] tmp35_34 = tmp34_31;
    Object[] tmp35_34 = tmp34_31;
    tmp35_34[0] = localObject;
    tmp35_34[1] = localInteger1;
    tmp35_34[2] = localInteger2;
    localObject = tmp35_34;
    return String.format(m54207b69.F54207b69_11("Bm481F4F12081E24575012571A2026162D60591B"), (Object[])localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.encoder.State
 * JD-Core Version:    0.7.0.1
 */