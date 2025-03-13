package com.google.zxing.common.reedsolomon;

import m54207b69;

public final class GenericGF
{
  public static final GenericGF AZTEC_DATA_10;
  public static final GenericGF AZTEC_DATA_12;
  public static final GenericGF AZTEC_DATA_6;
  public static final GenericGF AZTEC_DATA_8;
  public static final GenericGF AZTEC_PARAM;
  public static final GenericGF DATA_MATRIX_FIELD_256;
  public static final GenericGF MAXICODE_FIELD_64;
  public static final GenericGF QR_CODE_FIELD_256;
  private final int[] expTable;
  private final int generatorBase;
  private final int[] logTable;
  private final GenericGFPoly one;
  private final int primitive;
  private final int size;
  private final GenericGFPoly zero;
  
  static
  {
    GenericGF localGenericGF1 = new com/google/zxing/common/reedsolomon/GenericGF;
    int i = 1;
    localGenericGF1.<init>(4201, 4096, i);
    AZTEC_DATA_12 = localGenericGF1;
    localGenericGF1 = new com/google/zxing/common/reedsolomon/GenericGF;
    localGenericGF1.<init>(1033, 1024, i);
    AZTEC_DATA_10 = localGenericGF1;
    localGenericGF1 = new com/google/zxing/common/reedsolomon/GenericGF;
    localGenericGF1.<init>(67, 64, i);
    AZTEC_DATA_6 = localGenericGF1;
    GenericGF localGenericGF2 = new com/google/zxing/common/reedsolomon/GenericGF;
    localGenericGF2.<init>(19, 16, i);
    AZTEC_PARAM = localGenericGF2;
    localGenericGF2 = new com/google/zxing/common/reedsolomon/GenericGF;
    int j = 256;
    localGenericGF2.<init>(285, j, 0);
    QR_CODE_FIELD_256 = localGenericGF2;
    localGenericGF2 = new com/google/zxing/common/reedsolomon/GenericGF;
    localGenericGF2.<init>(301, j, i);
    DATA_MATRIX_FIELD_256 = localGenericGF2;
    AZTEC_DATA_8 = localGenericGF2;
    MAXICODE_FIELD_64 = localGenericGF1;
  }
  
  public GenericGF(int paramInt1, int paramInt2, int paramInt3)
  {
    this.primitive = paramInt1;
    this.size = paramInt2;
    this.generatorBase = paramInt3;
    int[] arrayOfInt1 = new int[paramInt2];
    this.expTable = arrayOfInt1;
    arrayOfInt1 = new int[paramInt2];
    this.logTable = arrayOfInt1;
    paramInt3 = 1;
    int i = paramInt3;
    int j = 0;
    int[] arrayOfInt2 = null;
    while (j < paramInt2)
    {
      int[] arrayOfInt3 = this.expTable;
      arrayOfInt3[j] = i;
      i *= 2;
      if (i >= paramInt2)
      {
        i ^= paramInt1;
        int k = paramInt2 + -1;
        i &= k;
      }
      j += 1;
    }
    paramInt1 = 0;
    GenericGFPoly localGenericGFPoly = null;
    for (;;)
    {
      j = paramInt2 + -1;
      if (paramInt1 >= j) {
        break;
      }
      arrayOfInt2 = this.logTable;
      int[] arrayOfInt4 = this.expTable;
      i = arrayOfInt4[paramInt1];
      arrayOfInt2[i] = paramInt1;
      paramInt1 += 1;
    }
    localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    int[] arrayOfInt5 = { 0 };
    localGenericGFPoly.<init>(this, arrayOfInt5);
    this.zero = localGenericGFPoly;
    localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    arrayOfInt5 = new int[] { paramInt3 };
    localGenericGFPoly.<init>(this, arrayOfInt5);
    this.one = localGenericGFPoly;
  }
  
  public static int addOrSubtract(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }
  
  public GenericGFPoly buildMonomial(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 == 0) {
        return this.zero;
      }
      localObject = new int[paramInt1 + 1];
      localObject[0] = paramInt2;
      GenericGFPoly localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
      localGenericGFPoly.<init>(this, (int[])localObject);
      return localGenericGFPoly;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int exp(int paramInt)
  {
    return this.expTable[paramInt];
  }
  
  public int getGeneratorBase()
  {
    return this.generatorBase;
  }
  
  public GenericGFPoly getOne()
  {
    return this.one;
  }
  
  public int getSize()
  {
    return this.size;
  }
  
  public GenericGFPoly getZero()
  {
    return this.zero;
  }
  
  public int inverse(int paramInt)
  {
    if (paramInt != 0)
    {
      int[] arrayOfInt = this.expTable;
      int i = this.size;
      paramInt = this.logTable[paramInt];
      i = i - paramInt + -1;
      return arrayOfInt[i];
    }
    ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
    localArithmeticException.<init>();
    throw localArithmeticException;
  }
  
  public int log(int paramInt)
  {
    if (paramInt != 0) {
      return this.logTable[paramInt];
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public int multiply(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      int[] arrayOfInt1 = this.expTable;
      int[] arrayOfInt2 = this.logTable;
      paramInt1 = arrayOfInt2[paramInt1];
      paramInt2 = arrayOfInt2[paramInt2];
      paramInt1 += paramInt2;
      paramInt2 = this.size + -1;
      paramInt1 %= paramInt2;
      return arrayOfInt1[paramInt1];
    }
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("FF0101707942");
    localStringBuilder.append(str);
    str = Integer.toHexString(this.primitive);
    localStringBuilder.append(str);
    localStringBuilder.append(',');
    int i = this.size;
    localStringBuilder.append(i);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.GenericGF
 * JD-Core Version:    0.7.0.1
 */